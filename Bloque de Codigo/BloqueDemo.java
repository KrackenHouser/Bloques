/*
Un bloque de codigo se compone de 2 o mas agrupaciones de instrucciones las cuales se llevan
a cabo estae cerrade detro de  llaves de apertura y de cierre " {}" estas son 
llamadas curly braces
*/




//Unidad Logica 

/*
 Una unidad logica es aquella que puede usarse en cualquier lugar que podra ser usada en una 
 sola instruccion
    if(w < h){ Inicio
        v = w * h;
        w = 0;
    } Finn
*/ 


class BloqueDemo {
    public static void main(String[] args) {
    double i, j, d;
    i = 5;
    j = 10;
     
     if(i != 0){
        System.out.println("i no es igual a cero");
        d = j / i;
        System.out.println("j / i es: " + d);
}
    }
}