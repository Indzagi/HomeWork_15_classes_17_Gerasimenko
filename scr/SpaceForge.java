public class SpaceForge {
    public SpaceShipAbstract[] spaceShips;
    public HyperRing[] hyperRings;


    public void createSpaceShip(SpaceShipAbstract spaceShip) {
        spaceShips = createSpaceShip(spaceShips, spaceShip);
    }

    private SpaceShipAbstract[] createSpaceShip(SpaceShipAbstract[] spaceShips, SpaceShipAbstract spaceShip) {
        if (spaceShips == null) {
            spaceShips = new SpaceShipAbstract[0];
        }

        SpaceShipAbstract[] extended = new SpaceShipAbstract[spaceShips.length + 1];

        for (int i = 0; i < spaceShips.length; i++) {
            extended[i] = spaceShips[i];
        }
        extended[extended.length - 1] = spaceShip;
        return extended;
    }

    public HyperRing createHyperRing(HyperRing hyperRing) {
        hyperRings = createHyperRing(hyperRings, hyperRing);
        return hyperRing;
    }

    private HyperRing[] createHyperRing(HyperRing[] hyperRings, HyperRing hyperRing) {
        if (hyperRings == null) {
            hyperRings = new HyperRing[0];
        }

        HyperRing[] extended = new HyperRing[hyperRings.length + 1];
        for (int i = 0; i < hyperRings.length; i++) {
            extended[i] = hyperRings[i];
        }
        extended[extended.length - 1] = hyperRing;
        return extended;
    }


}
