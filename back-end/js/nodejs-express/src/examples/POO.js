class Animal { // criar uma class em js
    #peso; // caracteristicas
    #cor; // com # estão privadas

    // todo animal que for criado tera estes requesitos padrão
    // constructor(){}
    
    constructor(cor, peso){
        this.#cor = cor; // parametro
        this.#peso = peso; // parametro
    }

    emitirSom(){
        console.log("Implementar o poliformismo!");
    }

    // GETTER AND SETTERS
    getPeso(){ // ver dados que estão privadas
        return this.#peso;
    }

    getCor(){
        return this.#cor;
    }

    // setters
    setPeso(peso){
        return this.#peso = peso;
    }

    setCor(){}
}

// criar um obj
// const animal001 = new Animal("azul", 2);
// const animal002 = new Animal("amarelo", 10);

// mostrar as caracteristicas do aminal
// console.log(animal001.peso + " " + animal001.cor);
// console.log(animal002.peso + " " + animal002.cor);
// console.log(animal001.emitirSom());

// printar dados que estão privados
// console.log(animal001.getPeso() + " " + animal001.getCor());
// console.log(animal002.getPeso() + " " + animal002.getCor());

// mudar caracteristica, privado
// animal001.setPeso(3000);
// console.log(animal002.getPeso());

// mudar caracteristica, não privado
// animal001.peso = 842723;

// console.log("Iniciando APP");


// Cachorro.js
class Cachorro extends Animal {


    constructor(cor, peso){
        super(cor, peso); // pegar caracteristicas da class pai
    }

    emitirSom(){
        // return "AuAu!";
        console.log("AuAu!");
    }
}

// Gato.js
class Gato extends Animal {
    #numeroDeVidas;

    constructor(cor, peso){
        super(cor, peso);
        this.#numeroDeVidas = 7;
    }

    // getters
    getNumeroDeVidas(){
        return this.#numeroDeVidas;
    }

    emitirSom(){
        console.log("Meow!");
    }
}

const cachorro001 = new Cachorro("rosa", 56);
console.log(`A cor do cachorro é ${cachorro001.getCor()}`);
cachorro001.emitirSom();

const gato001 = new Gato("verde", 76);
console.log(`A cor do cachorro é ${gato001.getCor()} e a número de vidas é ${gato001.getNumeroDeVidas()}`);
gato001.emitirSom();