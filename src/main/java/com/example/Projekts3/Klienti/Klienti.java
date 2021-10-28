package com.example.Projekts3.Klienti;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Component
@Entity
@Table(name = "Klienti")
public class Klienti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 45)
    private String epasts;

    @Column(length = 15, nullable = false)
    private String parole;

    @Column(length = 15, nullable = false, name = "vards")
    private String vards;

    @Column(length = 45, nullable = false, name = "Uzvards")
    private String Uzvards;

    private boolean enabled;
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getEpasts() {
            return epasts;
        }

        public void setEpasts(String epasts) {
            this.epasts = epasts;
        }

        public String getParole() {
            return parole;
        }

        public void setParole(String parole) {
            this.parole = parole;
        }

        public String getVards() {
            return vards;
        }

        public void setVards(String vards) {
            this.vards = vards;
        }

        public String getUzvards() {
            return Uzvards;
        }

        public void setUzvards(String uzvards) {
            Uzvards = uzvards;
        }

    @Override
    public String toString() {
        return "Klienti{" +
                "id=" + id +
                ", epasts='" + epasts + '\'' +
                ", parole='" + parole + '\'' +
                ", vards='" + vards + '\'' +
                ", Uzvards='" + Uzvards + '\'' +
                '}';
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}


