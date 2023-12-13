package database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import model.Medicament;

/* CREATE TABLE IF NOT EXISTS Medicaments (
	ID	INTEGER PRIMARY KEY AUTO_INCREMENT,  
	Medicament_Name_Comercial	TEXT,
	Compound	TEXT,
	Contraindications	TEXT,
	Side_And_Adverse_Reactions	TEXT,
	Restrictions_On_Use_During_Pregnancy_And_Lactation	TEXT,
	Drug_And_Other_Interactions	TEXT,
	Protection_Legends	TEXT,
	General_Precautions	TEXT,
	Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects	TEXT,
	Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion	TEXT
); */

public class Consultas {
    private final Conexion conexion = new Conexion();

    public Consultas() {
        // creacion de la tabla si no existe por cuestiones de testing
        try {
            Connection con = conexion.getConexion();

            // Inicializando la base de datos
            String sql = new String(Files.readAllBytes(Paths.get("src/main/java/database/Medicaments.sql")));

            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("Inicializando");
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage() + "\nEsto es demasiado iiiimprobable");
        }
    }

    public Medicament searchMedicament(int id) {
        Medicament medicamento = new Medicament();
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con
                        .prepareStatement("SELECT * FROM medicaments WHERE id = ?")) {

            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setName(resultSet.getString("Medicament_Name_Comercial"));
                medicamento.setDescription(String.format("Containdications\n%s\n\nSide and Adverse Reactions\n%s\n\nRestrictions on use during pregnancy and lactation\n%s\n\nDrug and other interactions\n%s\n\nProtection legends\n%s\n\nGeneral precautions\n%s\n\nPrecautions regarding carcinogenesis, mutagenesis, teratogenesis and fertility effects\n%s\n\nManifestations and management of overdose and accidental ingestion\n%s",
                        resultSet.getString("Contraindications"),
                        resultSet.getString("Side_And_Adverse_Reactions"),
                        resultSet.getString("Restrictions_On_Use_During_Pregnancy_And_Lactation"),
                        resultSet.getString("Drug_And_Other_Interactions"),
                        resultSet.getString("Protection_Legends"),
                        resultSet.getString("General_Precautions"),
                        resultSet.getString("Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects"),
                        resultSet.getString("Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion")
                ));
                medicamento.setCompound(resultSet.getString("Compound"));
                return medicamento;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Medicament searchMedicament(String name) {
        Medicament medicamento = new Medicament();
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con
                        .prepareStatement("SELECT * FROM medicaments WHERE Medicament_Name_Comercial = ?")) {

            ps.setString(1, name);

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setName(resultSet.getString("Medicament_Name_Comercial"));
                medicamento.setDescription(String.format("Containdications\n%s\n\nSide and Adverse Reactions\n%s\n\nRestrictions on use during pregnancy and lactation\n%s\n\nDrug and other interactions\n%s\n\nProtection legends\n%s\n\nGeneral precautions\n%s\n\nPrecautions regarding carcinogenesis, mutagenesis, teratogenesis and fertility effects\n%s\n\nManifestations and management of overdose and accidental ingestion\n%s",
                        resultSet.getString("Contraindications"),
                        resultSet.getString("Side_And_Adverse_Reactions"),
                        resultSet.getString("Restrictions_On_Use_During_Pregnancy_And_Lactation"),
                        resultSet.getString("Drug_And_Other_Interactions"),
                        resultSet.getString("Protection_Legends"),
                        resultSet.getString("General_Precautions"),
                        resultSet.getString("Precautions_Regarding_Carcinogenesis_Mutagenesis_Teratogenesis_And_Fertility_Effects"),
                        resultSet.getString("Manifestations_And_Management_Of_Overdose_And_Accidental_Ingestion")
                ));
                medicamento.setCompound(resultSet.getString("Compound"));
                return medicamento;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Medicament> getAllMedicaments() {
        List<Medicament> lista = new ArrayList<>();

        try (Connection con = conexion.getConexion();
                PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM medicaments")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            {
                while (resultSet.next()) {
                    Medicament temp = new Medicament();
                    temp.setId(resultSet.getInt("ID"));
                    temp.setName(resultSet.getString("Medicament_Name_Comercial"));
                    lista.add(temp);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

}