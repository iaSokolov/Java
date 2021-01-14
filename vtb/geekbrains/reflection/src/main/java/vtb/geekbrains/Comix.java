package vtb.geekbrains;

@Table(title="ComixTable")
public class Comix {
    @Column(name = "comixName")
    private String name;

    @Column(name = "comixCategory")
    private String category;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Comix(String name, String category) {
        this.name = name;
        this.category = category;
    }
}


