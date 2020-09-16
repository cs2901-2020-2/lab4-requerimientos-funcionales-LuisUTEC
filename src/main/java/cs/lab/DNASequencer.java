package cs.lab;

import java.util.List;
import java.util.logging.Logger;



public class DNASequencer {


    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());

    public DNASequencer() {
        logger.info("Starting sequencer...");

    }

    public String calculate(List<String> part){
        String semicadena = "";
        String cadenatotal = part.get(0);

        for (int i = 1; i < part.size(); i++){
            for (int j = 0; j < part.get(i).length(); j++ ){
                if (part.get(i).substring(j).equals(part.get(i).substring(0,j))){
                    semicadena = part.get(i).substring(j);
                    cadenatotal = cadenatotal.replace(semicadena, part.get(i+1));
                    break;
                }
            }

        }
        return cadenatotal;
        //return "AGATTACAGA";
    }

}
