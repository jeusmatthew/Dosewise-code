package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import model.Medicament;

public class Consultas {
    private final Conexion conexion = new Conexion();

    public Consultas() {
        // creacion de la tabla si no existe por cuestiones de testing
        try {
            Connection con = conexion.getConexion();
            
            // Inicializando la base de datos
            String sql = "DROP TABLE IF EXISTS medicamentos;\r\n" + //
                    "\r\n" + //
                    "CREATE TABLE IF NOT EXISTS medicamentos (id INT PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(255), descripcion VARCHAR(255), compuesto VARCHAR(255));\r\n" + //
                    "\r\n" + //
                    "INSERT INTO medicamentos (nombre, descripcion, compuesto) VALUES\r\n" + //
                    "('Paracetamol', 'Medicamento para el dolor', 'Paracetamol'),\r\n" + //
                    "('Ibuprofeno', 'Medicamento para el dolor y la inflamación', 'Ibuprofeno'),\r\n" + //
                    "('Aspirina', 'Medicamento para el dolor, la inflamación y la fiebre', 'Ácido acetilsalicílico'),\r\n" + //
                    "('Naproxeno', 'Medicamento para el dolor, la inflamación y la fiebre', 'Naproxeno'),\r\n" + //
                    "('Diclofenaco', 'Medicamento para el dolor, la inflamación y la fiebre', 'Diclofenaco'),\r\n" + //
                    "('Metamizol', 'Medicamento para el dolor y la fiebre', 'Metamizol'),\r\n" + //
                    "('Codeína', 'Medicamento para el dolor', 'Codeína'),\r\n" + //
                    "('Oxicodona', 'Medicamento para el dolor', 'Oxicodona'),\r\n" + //
                    "('Tramadol', 'Medicamento para el dolor', 'Tramadol');\r\n" + //
                    "\r\n" + //
                    "";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("Inicializando");
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean reiniciarId() {
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con
                        .prepareStatement("ALTER TABLE medicamentos ALTER COLUMN id RESTART WITH 1")) {

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean borrarTodosLosMedicamentos() {
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("DELETE FROM medicamentos")) {

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean insertarMedicamento(Medicament medicamento) {
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con
                        .prepareStatement(
                                "INSERT INTO medicamentos (nombre, descripcion, compuesto) VALUES (?, ?, ?)");) {

            ps.setString(1, medicamento.getName()); // Corregido a getName()
            ps.setString(2, medicamento.getDescription());
            ps.setString(3, medicamento.getCompound());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean eliminarMedicamento(Medicament medicamento) {
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con
                        .prepareStatement("DELETE FROM medicamentos WHERE id = ?")) {

            ps.setInt(1, medicamento.getId());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean actualizarMedicamento(Medicament medicamento) {
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con
                        .prepareStatement("UPDATE medicamentos SET nombre = ? WHERE id = ?")) {

            ps.setString(1, medicamento.getName());
            ps.setInt(2, medicamento.getId());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public Medicament buscarMedicamentoPorNombre(Medicament medicamento) {
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con
                        .prepareStatement("SELECT * FROM medicamentos WHERE nombre = ?")) {

            ps.setString(1, medicamento.getName());

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                medicamento.setId(resultSet.getInt("id"));
                return medicamento;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public Medicament buscarMedicamento(Medicament medicamento) {
        try (Connection con = conexion.getConexion();
                PreparedStatement ps = con
                        .prepareStatement("SELECT * FROM medicamentos WHERE id = ?")) {

            ps.setInt(1, medicamento.getId());

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                medicamento.setName(resultSet.getString("nombre"));
                return medicamento;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public List<Medicament> getMedicaments() {
        List<Medicament> lista = new ArrayList<>();

        // System.out.println("Tabla medicamentos:");

        try (Connection con = conexion.getConexion();
                PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM medicamentos")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            {

                // System.out.println("Tabla de Medicamentos:");
                // System.out.println("ID\tNombre");

                while (resultSet.next()) {
                    Medicament temp = new Medicament();
                    temp.setId(resultSet.getInt("ID"));
                    temp.setName(resultSet.getString("nombre"));
                    lista.add(temp);
                    // System.out.println(temp.getId() + "\t" + temp.getName());
                }

                // preparedStatement.executeQuery();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}