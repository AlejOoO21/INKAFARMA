
package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class clsEmpleadoTrans {
    ArrayList<clsEmpleado> emple;
    
    public clsEmpleadoTrans(){
        
        emple= new ArrayList<clsEmpleado>();
        cargar();
    }
    
    private void cargar(){
        try {
            File archivo=new File("empleados.txt");
            if(archivo.exists()){
                    BufferedReader br=new BufferedReader(new FileReader(archivo));
                    String linea="";
                    while((linea=br.readLine())!=null){
                            StringTokenizer st=new StringTokenizer(linea, ",");
                            int dni= Integer.parseInt(st.nextToken());
                            String apellido=st.nextToken();
                            String nombre=st.nextToken();
                            String tipo=st.nextToken();
                            String contraseña=st.nextToken();
                            String estado=st.nextToken();
                            
                            clsEmpleado x=new clsEmpleado(dni, apellido, nombre, tipo, contraseña, estado);
                            adicionar(x);
                        }
                    br.close(); 
                }else{
                    JOptionPane.showMessageDialog(null, "El archivo empleado.txt NO EXISTE");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha suscedido un error al momento \nde cargar los registros de empleados");
        }
    }
    
    
    public clsEmpleado obtener(int pos){
        return emple.get(pos);
        
    }
    
    public int tamaño(){
        
        return emple.size();
        
    }
    
    public void adicionar(clsEmpleado x){
        
        emple.add(x);
        
    }
    
    public void grabar(){
        
        try{
            PrintWriter pw= new PrintWriter(new FileWriter("empleados.txt"));
            for(int i =0;i<tamaño();i++){
                pw.print(obtener(i).getDni()+","+obtener(i).getNombre()+","+obtener(i).getApellido()+","+obtener(i).getTipo()+","+
                        obtener(i).getContraseña()+","+obtener(i).getEstado()+"\r\n");
                    }
            pw.close();
            }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al momento de grabar"+e);
        }   
    } 
}
