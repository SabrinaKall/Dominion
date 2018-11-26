package shared.domain.cards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;


/**
 * Class modelling a Victory Card
 */
public abstract class VictoryCard extends Card {

    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    /**
     * how much victory points is this card worth
     * @return victory points
     */
    public abstract int getVictoryPoints();
}
