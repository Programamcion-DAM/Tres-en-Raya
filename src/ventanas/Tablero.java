
package ventanas;


public class Tablero {
    
    private String tablero[][] = new String [3][3];
    public Tablero() {
        
        tablero[0][0] = "";
        tablero[0][1] = "";
        tablero[0][2] = "";
        tablero[1][0] = "";
        tablero[1][1] = "";
        tablero[1][2] = "";
        tablero[2][0] = "";
        tablero[2][1] = "";
        tablero[2][2] = "";
        
    }
    
    public void setFicha(int posicionFila ,int posicionColumna, String ficha){
        tablero[posicionFila][posicionColumna] = ficha; 
    }
    
    public String getFicha(int x , int y){
        return tablero[x][y];
    }
    
    public void reiniciarTablero(){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                tablero[i][j] = "";
            }
        }
    }
    
    public String comprobarTresEnRaya(){
        String fichaGanadora = "";
        
        if(comprobarLinea() != ""){
            fichaGanadora = comprobarLinea();
        }
        
        else if(comprobarColumna() != ""){
            fichaGanadora = comprobarColumna();
        }
        else if(comprobarFilasDescendente() != ""){
            fichaGanadora = comprobarFilasDescendente();
        }
        
        else if(comprobarFilasAscendente() != ""){
            fichaGanadora = comprobarFilasAscendente();
        }
        else if(comprobarEmpate()){
            return "empate";
        }
        return fichaGanadora;
    }
    
    private String comprobarLinea(){
        for(int i = 0;i<3;i++){
            if(tablero[i][0].equals("x") && tablero[i][1].equals("x") && tablero[i][2].equals("x")){
                return "x";
            }
            if(tablero[i][0].equals("o") && tablero[i][1].equals("o") && tablero[i][2].equals("o")){
                return "o";
            }
        }
        return "";    
    }
    private String comprobarColumna(){
        for(int i = 0;i<3;i++){
            if(tablero[0][i].equals("x") && tablero[1][i].equals("x") && tablero[2][i].equals("x")){
                return "x";
            }
            if(tablero[0][i].equals("o") && tablero[1][i].equals("o") && tablero[2][i].equals("o")){
                return "o";
            }
        }
        return ""; 
    }
    private String comprobarFilasDescendente(){
        if(tablero[0][0].equals("x") && tablero[1][1].equals("x") && tablero[2][2].equals("x")){
            return "x";
        }
        
        if(tablero[0][0].equals("o") && tablero[1][1].equals("o") && tablero[2][2].equals("o")){
            return "o";
        }
        
        return "";
    }
    
    private String comprobarFilasAscendente(){
        if(tablero[2][0].equals("x") && tablero[1][1].equals("x") && tablero[0][2].equals("x")){
            return "x";
        }
        
        if(tablero[2][0].equals("o") && tablero[1][1].equals("o") && tablero[0][2].equals("o")){
            return "o";
        }
        
        return "";
    }
    
    private boolean comprobarEmpate(){
        boolean empate = true;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(tablero[i][j].equals("")){
                    empate = false;
                }
            }
        }
        return empate;
    }
    
    
    
    
    
    public String insertarFichaO(){
        if(fichaEnCasoDeJaque() != null){
            return fichaEnCasoDeJaque();
        }
        if(fichaEnCasoDePrevenirJaque() != null){
            return fichaEnCasoDePrevenirJaque();
        }
        if(fichaEnCasoA2() != null){
            return fichaEnCasoA2();
        }
        if(fichaEnCasoIncial() != null){
            return fichaEnCasoIncial();
        }
        if(fichaEnCasoCurioso() != null){
            return fichaEnCasoCurioso();
        }
        if(fichaEnCasoA1() != null){
            return fichaEnCasoA1();
        }
        return fichaEnCasoAleatoria();
    }
    
    private String fichaEnCasoA2(){
        if(tablero[0][2].equals("x")&& tablero[2][1].equals("x")&& tablero[2][2].equals("")){
            return "22";
        }
        return null;
    }
    
    private String fichaEnCasoA1(){
        if(tablero[0][0].equals("x")&& tablero[2][1].equals("x")&& tablero[2][0].equals("")){
            return "20";
        }
        return null;
    }
    
    private String fichaEnCasoDeJaque(){
        if(insertarEnFilasDificil() != null){
            return insertarEnFilasDificil();
        }
        if(insertarEnColumnasDificil() != null){
            return insertarEnColumnasDificil();
        }
        if(insertarEnDiagolalAscendenteDificil() != null){
            return insertarEnDiagolalAscendenteDificil();
        }
        if(insertarEnDiagolalDescendenteDificil() != null){
            return insertarEnDiagolalDescendenteDificil();
        }
        return null;
    }
    
    private String insertarEnFilasDificil(){
        int cont;
        for(int i = 0;i<3;i++){
            cont = 0;
            for(int j = 0;j<3;j++){
                cont += contarFichas(i,j);
            }
            if(comprobarLaFila(cont,i) != null){
                return comprobarLaFila(cont,i);
            }
        }
        return null;
    }
    
    private int contarFichas(int x,int y){
        int suma = 0;
        if(tablero[x][y].equals("x")){
            suma++;
        }
        else if(tablero[x][y].equals("o")){
            suma--;
        }
        return suma;
    }
    
    private String comprobarLaFila(int cont,int fila){
        String posicionFila = ""+fila; 
        if(cont == 2 || cont == -2){
            if(tablero[fila][0].equals("")){
                posicionFila += "0";
                return posicionFila;
            }
            else if(tablero[fila][1].equals("")){
                posicionFila+="1";
                return posicionFila;
            }
            else if(tablero[fila][2].equals("")){
                posicionFila+="2";
                return posicionFila;
            }
        }
        return null;
    }
    
    private String insertarEnColumnasDificil(){
        int cont=0;
        for(int i = 0;i<3;i++){
            cont = 0;
            for(int j = 0;j<3;j++){
                cont += contarFichas(j,i);
            }
            if(comprobarLaColumna(cont,i) != null){
                return comprobarLaColumna(cont,i);
            }
        }
        return null;
    }
    
    private String comprobarLaColumna(int cont,int columna){
        String posicionColumna; 
        if(cont == 2 || cont == -2){
            if(tablero[0][columna].equals("")){
                posicionColumna  = "0"+columna;
                return posicionColumna;
            }
            else if(tablero[1][columna].equals("")){
                posicionColumna ="1"+columna;
                return posicionColumna;
            }
            else if(tablero[2][columna].equals("")){
                posicionColumna ="2"+columna;
                return posicionColumna;
            }
        }
        return null;
    }
    
    private String insertarEnDiagolalAscendenteDificil(){
        int cont = contarEnDiagonalAscendente(2,0);
        
        if(cont == 2 || cont == -2){
            return comprobarLaDiagonalAscendente(2,0);
        }
        else{
            return null;
        }
    }
    
    private int contarEnDiagonalAscendente(int x,int y){
        int cont=0;
        if(tablero[x][y] != ""){
            if(tablero[x][y].equals("x")){
                cont++;
            }
            else{
                cont--;
            }
        }
        if(tablero[1][1] != ""){
            if(tablero[1][1].equals("x")){
                cont++;
            }
            else{
                cont--;
            }
        }
        if(tablero[y][x] != ""){
            if(tablero[y][x].equals("x")){
                cont++;
            }
            else{
                cont--;
            }
        }
        return cont;
    }
    
    private String comprobarLaDiagonalAscendente(int x,int y){
        if(tablero[x][y].equals("")){
            return ""+x+y;
        }
        if(tablero[1][1].equals("")){
            return "11";
        }
        if(tablero[y][x].equals("")){
            return ""+y+x;
        }
        return null;
    }
    
    private String insertarEnDiagolalDescendenteDificil(){
        int cont = contarEnDiagonalDescendente();
        
        if(cont == 2 || cont == -2){
            return comprobarLaDiagonalDescendente();
        }
        else{
            return null;
        }
    }
    
    private int contarEnDiagonalDescendente(){
        int cont = 0;
        for(int i = 0;i<3;i++){
            if(tablero[i][i] != ""){
                if(tablero[i][i].equals("x")){
                    cont++;
                }
                else{
                    cont--;
                }
            }
        }
        return cont;
    }
    
    private String comprobarLaDiagonalDescendente(){
        for(int i = 0;i<3;i++){
            if(tablero[i][i].equals("")){
                return ""+i+i;
            }
        }
        return null;
    }
    
    
    
    
    
    
    
    private String fichaEnCasoIncial(){
        if(tablero[1][1].equals("")){
            return "11";
        }
        else if(tablero[0][0].equals("")){
            return "00";
        }
        return null;
    }
    
    private String fichaEnCasoDePrevenirJaque(){
        if(tablero[1][2] != "" && tablero[2][1] != "" && tablero[2][2].equals("")){
            return "22";
        }
        else{
            return null;
        }
    }
    
    private String fichaEnCasoCurioso(){
        if(tablero[0][0].equals("o") && tablero[1][1].equals("x") && tablero[0][2].equals("")){
            return "02";
        }
        return null;
    }
    
    private String fichaEnCasoAleatoria(){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(tablero[i][j].equals("")){
                    return ""+i+j;
                }
            }
        }
        return null;
    }
}
