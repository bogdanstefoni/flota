package com.bogdan.flota.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Date;

@MappedSuperclass
@Setter
@Getter
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numarInmatriculare;
    private String marca;
    private String tip;
    private String model;
    private String utilaj;
    private Date dataPif;
    private String serieSasiu;
    private Long nrMijlocFixSap;
    private String stare;
    private String locatieJudet;
    private String locatieOras;
    private String directia;
    private String departamentul;
    private String formatiaDeLucru;
    private String utilizatorTitular;
    private String marcaUtilizator;
    private String tipAutoCfTipologieRar;
    private String tipAutoPtrRapoarteLaMediu;
    private String tipAutoPtrRapoarteLaAnre;
    private String tipAutoDupaModUtilizarePtrRapoarteCalculTarife;
    private String tipCombustibilPtrRapoarteLaAuditEnergetic;
    private Date dataUrmatoareiItp;
    private Date valabilitateRovigneta;
    private Date valabilitateRca;
    private Date valabilitateCasco;
    private String serieCiv;
    private String serieCertificatInmatriculare;





    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id=" + id +
                ", numarInmatriculare='" + numarInmatriculare + '\'' +
                ", marca='" + marca + '\'' +
                ", tip='" + tip + '\'' +
                ", model='" + model + '\'' +
                ", utilaj='" + utilaj + '\'' +
                ", dataPif=" + dataPif +
                ", serieSasiu='" + serieSasiu + '\'' +
                ", nrMijlocFixSap=" + nrMijlocFixSap +
                ", stare='" + stare + '\'' +
                ", locatieJudet='" + locatieJudet + '\'' +
                ", locatieOras='" + locatieOras + '\'' +
                ", directia='" + directia + '\'' +
                ", departamentul='" + departamentul + '\'' +
                ", formatieDeLucru='" + formatiaDeLucru + '\'' +
                ", utilizatorTitular='" + utilizatorTitular + '\'' +
                ", marcaUtilizator='" + marcaUtilizator + '\'' +
                ", tipAutoCfTipologieRar='" + tipAutoCfTipologieRar + '\'' +
                ", tipAutoPtrRapoareLaMediu='" + tipAutoPtrRapoarteLaMediu + '\'' +
                ", tipAutoPtrRapoarteLaAnre='" + tipAutoPtrRapoarteLaAnre + '\'' +
                ", tipAutoDupaModUtilizarePtrRapoarteCalculTarife='" + tipAutoDupaModUtilizarePtrRapoarteCalculTarife + '\'' +
                ", tipCombustibilPtrRapoareLaAuditEnergetic='" + tipCombustibilPtrRapoarteLaAuditEnergetic + '\'' +
                ", dataUrmatoareiItp=" + dataUrmatoareiItp +
                ", valabilitateRovigneta=" + valabilitateRovigneta +
                ", valabilitateRca=" + valabilitateRca +
                ", valabilitateCasco=" + valabilitateCasco +
                ", serieCiv='" + serieCiv + '\'' +
                ", serieCertificatInmatriculare='" + serieCertificatInmatriculare + '\'' +
                '}';
    }
}
