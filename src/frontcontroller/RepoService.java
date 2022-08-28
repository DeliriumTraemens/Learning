package frontcontroller;

public enum RepoService {
    FindAll(),FindById,FindFiltered,Create,Update,Remove;
    public String name;
    public Runnable action;
}
