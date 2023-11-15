package davideSalzani.U2W3D3.adapter.entities;



import java.time.LocalDate;



public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

    public Info(String nome, String cognome, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }
}