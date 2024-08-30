package ch08.exercise.p7;

public class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("select from oracle");
    }

    @Override
    public void insert() {
        System.out.println("insert to oracle");

    }

    @Override
    public void update() {
        System.out.println("update to oracle");

    }

    @Override
    public void delete() {
        System.out.println("delete from oracle");
    }
}
