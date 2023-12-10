package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

import model.Medicament;

public class Consultas {
    private final Conexion CONEXION = new Conexion();

    public Consultas() {
        // creacion de la tabla si no existe por cuestiones de testing
        try {
            Connection con = CONEXION.getConexion();
            PreparedStatement ps = con.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS medicamentos (id INT PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(255), compuesto VARCHAR(255))");
            System.out.println("Inicializando");
            System.out.println("Creando la tabla si no existe");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al crear la tabla");
        }
    }

    public boolean reiniciarId() {
        try (Connection con = CONEXION.getConexion();
                PreparedStatement preparedStatement = con
                        .prepareStatement("ALTER TABLE medicamentos ALTER COLUMN id RESTART WITH 1")) {

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean borrarTodosLosMedicamentos() {
        try (Connection con = CONEXION.getConexion();
                PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM medicamentos")) {

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean insertarMedicamento(Medicament medicamento) {
        try (Connection con = CONEXION.getConexion();
                PreparedStatement preparedStatement = con
                        .prepareStatement("INSERT INTO medicamentos (nombre) VALUES (?)")) {

            preparedStatement.setString(1, medicamento.getName()); // Corregido a getName()

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean eliminarMedicamento(Medicament medicamento) {
        try (Connection con = CONEXION.getConexion();
                PreparedStatement preparedStatement = con
                        .prepareStatement("DELETE FROM medicamentos WHERE id = ?")) {

            preparedStatement.setInt(1, medicamento.getId());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean actualizarMedicamento(Medicament medicamento) {
        try (Connection con = CONEXION.getConexion();
                PreparedStatement preparedStatement = con
                        .prepareStatement("UPDATE medicamentos SET nombre = ? WHERE id = ?")) {

            preparedStatement.setString(1, medicamento.getName());
            preparedStatement.setInt(2, medicamento.getId());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public Medicament buscarMedicamentoPorNombre(Medicament medicamento) {
        try (Connection con = CONEXION.getConexion();
                PreparedStatement preparedStatement = con
                        .prepareStatement("SELECT * FROM medicamentos WHERE nombre = ?")) {

            preparedStatement.setString(1, medicamento.getName());

            ResultSet resultSet = preparedStatement.executeQuery();

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
        try (Connection con = CONEXION.getConexion();
                PreparedStatement preparedStatement = con
                        .prepareStatement("SELECT * FROM medicamentos WHERE id = ?")) {

            preparedStatement.setInt(1, medicamento.getId());

            ResultSet resultSet = preparedStatement.executeQuery();

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

    public List<Medicament> tablaMedicamentos() {
        List<Medicament> listita = new ArrayList<>();
        System.out.println("Tabla medicamentos:");

        try (Connection con = CONEXION.getConexion();
                PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM medicamentos")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            {

                System.out.println("Tabla de Medicamentos:");
                System.out.println("ID\tNombre");

                while (resultSet.next()) {
                    Medicament medicamentotemporale = new Medicament();
                    medicamentotemporale.setId(resultSet.getInt("ID"));
                    medicamentotemporale.setName(resultSet.getString("nombre"));
                    listita.add(medicamentotemporale);
                    System.out.println(medicamentotemporale.getId() + "\t" + medicamentotemporale.getName());
                }

                preparedStatement.executeQuery();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listita;
    }

}