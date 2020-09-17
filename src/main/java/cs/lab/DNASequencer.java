package cs.lab;

import java.util.List;
import java.util.logging.Logger;



public class DNASequencer {


    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());

    public DNASequencer() {
        logger.info("Starting sequencer...");

    }

    public String calculate(List<String> parts) throws Exception{
        if(parts.size() > 160000){
            throw new Exception("Too many subseqs");
        }
        String semicadena;
        String cadenatotal = parts.get(0);

        for (int i = 0; i+1 < parts.size(); i++){
            for (int j = 0; j < parts.get(i).length(); j++ ){
                if (parts.get(i).substring(j).equals(parts.get(i + 1).substring(0, j))){
                    semicadena = parts.get(i).substring(j);
                    cadenatotal = cadenatotal.replace(semicadena, "");
                    cadenatotal = cadenatotal + parts.get(i+1);
                }
            }

        }
        return cadenatotal;
        //return "AGATTACAGA";
    }

}
