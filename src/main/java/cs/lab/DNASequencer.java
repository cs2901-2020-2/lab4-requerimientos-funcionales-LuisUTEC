package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){
        for (int i = 0; i < part.size(); i++){
            for (int j = 0; j < part.get(i).length(); j++ ){
                for (int k = 0; k < part.get(i+1).length(); k++){
                    if ((part.get(i).substring(j).equals(part.get(i+1).substring(k)))){
                        

                    }else if (part.get(i).substring(0,j).equals(part.get(i+1).substring(0,k))){

                    }
                }

            }
        }
        return "AGATTACAGA";
    }
}
