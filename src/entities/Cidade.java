package entities;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String name;
    private String estado;
    private String ordem;

    public Cidade(String name, String estado, String ordem) {
        this.name = name;
        this.estado = estado;
        this.ordem = ordem;
    }

    public String getName() {
        return name;
    }

    public String getEstado() {
        return estado;
    }

    public String getOrdem() {
        return ordem;
    }
}