package composite;

public class Main {

    public static void main(String[] args) {
        
    	
    	Composite despacho = new Composite("Despacho del ministerio de educacion");

        Esto oficinaAC = new Esto("oficina asesora de comunicaciones");
        Esto oficinaAJ = new Esto("oficina asesora de juridica");
        Esto oficinaAP = new Esto("oficina asesora de planeacion y finanzas");
        Esto oficinaCAI = new Esto("oficina de cooperacion y asuntos internacionales");
        Esto oficinaCI = new Esto("oficina de control interno");
        Esto oficinaTSI = new Esto("oficina de tecnologia y sistemas de informacion");
        Esto oficinaIET = new Esto("oficina de innovacion educativa con uso de nuevas tecnologias");

        Esto programa = new Esto("programa todos a aprender");

        Composite viceministerioPBM = new Composite("viceministerio de educacion preescolar, basica y media");
        Composite viceministerioES = new Composite("viceministerio de educacion superior");
        Composite secretariaG = new Composite("secretaria general");

        Esto unidadAC = new Esto("unidad de atencion al ciudadano");
        Esto subdireccionGF = new Esto("subdireccion de gestion financiera");
        Esto subdireccionDO = new Esto("subdireccion de desarrollo organizacional");
        Esto subdireccionTH = new Esto("subdireccion de talento humano");
        Esto subdireccionC = new Esto("subdireccion de contratacion");
        Esto subdireccionGA = new Esto("subdireccion de gestion administrativa");

        Composite direccionCES = new Composite("Direccion de calidad para la es");
        Composite subdAC = new Composite("subd. aseguramiento de la calidad de la ES");
        Esto subdIV = new Esto("SubD. de Inspeccion y vigilancia");

        Composite direccionFES = new Composite("Direccion de fomento de la educacion superior");
        Composite subdGES = new Composite("subd. de apoyo de la gestion de las IES");
        Esto subdDS = new Esto("SubD. de desarrollo sociotal");

        Composite direccionPI = new Composite("Direccion de primera infancia");
        Composite subdCPI = new Composite("subd. de cobertura de P.I");
        Esto subdCalPI = new Esto("subd. de calidad de P.I");

        Composite direccionCE = new Composite("Direccion de cobertura y equidad");
        Composite subdA = new Composite("subd. de acceso");
        Esto subdSP = new Esto("subd. subdireccion de permanencia");

        Composite direccionFGT = new Composite("Direccion fortalecimiento a la gestion temporal");
        Composite subdMC = new Composite("subd. de monitoreo y control");
        Composite subdFI = new Composite("subd. de fortalecimiento institucional");
        Esto subdRHE = new Esto("subd. recursos humanos sector educativo");

        Composite direccionCEFB = new Composite("Direccion de calidad para la educacion FBM");
        Composite subdRECE = new Composite("subd. de referencias y evaluacion de la calidad educativa");
        Esto subdFC = new Esto("subd. de fomento de competencias");

        despacho.agregar(oficinaAC);
        despacho.agregar(oficinaAJ);
        despacho.agregar(oficinaAP);
        despacho.agregar(oficinaCAI);
        despacho.agregar(oficinaCI);
        despacho.agregar(oficinaTSI);
        despacho.agregar(oficinaIET);

        despacho.agregar(programa);

        despacho.agregar(viceministerioPBM);
        despacho.agregar(viceministerioES);
        despacho.agregar(secretariaG);

        secretariaG.agregar(unidadAC);
        secretariaG.agregar(subdireccionGF);
        secretariaG.agregar(subdireccionDO);
        secretariaG.agregar(subdireccionTH);
        secretariaG.agregar(subdireccionC);
        secretariaG.agregar(subdireccionGA);

        viceministerioES.agregar(direccionCES);
        viceministerioES.agregar(direccionFES);

        direccionCES.agregar(subdAC);
        subdAC.agregar(subdIV);

        direccionFES.agregar(subdGES);
        subdGES.agregar(subdDS);

        viceministerioPBM.agregar(direccionPI);
        viceministerioPBM.agregar(direccionCE);
        viceministerioPBM.agregar(direccionFGT);
        viceministerioPBM.agregar(direccionCEFB);

        direccionPI.agregar(subdCPI);
        subdCPI.agregar(subdCalPI);

        direccionCE.agregar(subdA);
        subdA.agregar(subdSP);

        direccionFGT.agregar(subdMC);
        subdMC.agregar(subdFI);
        subdFI.agregar(subdRHE);

        direccionCEFB.agregar(subdRECE);
        subdRECE.agregar(subdFC);

        System.out.println("--------imprime toda la rama especificada-----");
        direccionCEFB.nombre();
        System.out.println("-------saca la oracion mas larga de una rama-----");
        direccionCEFB.masLargo();
    }

}
