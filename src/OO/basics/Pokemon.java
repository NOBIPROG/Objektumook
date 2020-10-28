package OO.basics;

public class Pokemon {
    String name;
    String type;
    String effectiveAgainst;

    public Pokemon(String name, String type, String effectiveAgainst) {
        this.name = name;
        this.type = type;
        this.effectiveAgainst = effectiveAgainst;

    }


    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Ballbasaur", "leaf", "water");
        Pokemon pokemon2 = new Pokemon("Pikatchu", "electric", "water");
        Pokemon pokemon3 = new Pokemon("Charizard", "fire", "leaf");
        Pokemon pokemon4 = new Pokemon("Squirtle", "water", "fire");
        Pokemon pokemon5 = new Pokemon("Kingler", "water", "fire");
        Pokemon pokemon6 = new Pokemon("Odish", "leaf", "water");
        Pokemon[] AshPokemons = {pokemon1, pokemon2, pokemon3, pokemon4, pokemon5};
      whichPokemon(AshPokemons,pokemon6);

    }

    public static boolean effectiveAgainst(Pokemon pokemon1, Pokemon pokemon2) {
        if (pokemon1.effectiveAgainst.equals(pokemon2.type)) {
            return true;
        }
        return false;
    }

    public static void whichPokemon(Pokemon[] pokemons, Pokemon pokemon) {
        for (int i = 0; i < pokemons.length; i++) {
            if (effectiveAgainst(pokemons[i], pokemon)) {
                System.out.println(pokemons[i].name);
            }

        }

    }
}
