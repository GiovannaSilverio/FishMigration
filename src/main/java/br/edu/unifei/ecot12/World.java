package br.edu.unifei.ecot12;

public class World {

    
    public static final Environment OCEANO = new Environment(
        EnvironmentType.OCEAN, 
        35.0,
        100.0,
        20.0   
    );

    public static final Environment ESTUARIO = new Environment(
        EnvironmentType.ESTUARY,
        15.0, 
        2.0, 
        1.0
    );
    
    public static final Environment RIO = new Environment(
        EnvironmentType.RIVER, 
        0.5, 
        10.0, 
        5.0
    );

    public static final Environment DEEP_SEA = new Environment(
        EnvironmentType.DEEP_SEA, 
        35.0,   
        1000.0,
        0.1 
    );
}