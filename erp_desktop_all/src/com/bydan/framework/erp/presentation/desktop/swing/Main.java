package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import com.bydan.erp.seguridad.business.entity.Sistema;
import com.bydan.erp.seguridad.business.entity.Update;
import com.bydan.erp.seguridad.business.entity.UpdateDetalle;
import com.bydan.erp.seguridad.business.logic.UpdateLogicAdditional;
//import com.bydan.erp.seguridad.service.ejb.interfaces.SistemaAdditionable;
//import com.bydan.erp.seguridad.service.ejb.interfaces.SistemaAdditionableHome;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.UpdateParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.UpdateReturnGeneral;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.resources.config.AuxiliarConfig;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.global.seguridad.updates.entity.ActualizacionUpdate;
import com.bydan.framework.global.seguridad.updates.entity.AnioUpdate;
import com.bydan.framework.global.seguridad.updates.entity.MesUpdate;
import com.bydan.framework.global.seguridad.updates.entity.ProcesoUpdate;
import com.bydan.framework.global.seguridad.updates.entity.QueryUpdate;
import com.bydan.erp.seguridad.util.UpdateConstantesFunciones;
//import com.bydan.erp.seguridad.service.ejb.interfaces.UpdateAdditionable;
//import com.bydan.erp.seguridad.service.ejb.interfaces.UpdateAdditionableHome;

/*
import com.bydan.framework.erp.business.logic.Pagination;
import com.bydan.erp.contabilidad.business.logic.TipoRetencionLogic;
import com.bydan.erp.tesoreria.business.logic.TipoRetencionFuenteIvaLogic;
import com.bydan.erp.tesoreria.business.entity.TipoRetencionFuenteIva;
*/

@SuppressWarnings("unused")
public class Main implements Runnable {
	
	public static LoginJFrame loginJFrame;
	
	public String sTipo="";
	
	public Main() {
		
	}
	
	public Main(String sTipo) {
		this.sTipo=sTipo;
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//com.bydan.framework.erp.util.Constantes.PROVIDER_URL="http://bydan.homelinux.com:80/invoker/JNDIFactory";
		//System.out.println(com.bydan.framework.erp.util.Constantes.PROVIDER_URL);
		//com.bydan.framework.erp.util.Constantes.PROVIDER_URL="http://0.0.0.0:80/invoker/JNDIFactory";
		// TODO Auto-generated method stub
		
		//ESTILOS GLOBAL
		//PARAMETRO COMANDO INICIAL
		//(MEJOR, AZUL-PLOMO) - "javax.swing.plaf.nimbus.NimbusLookAndFeel"
		//(JAVA) - "javax.swing.plaf.metal.MetalLookAndFeel"		
		//(VIOLETA) - "com.sun.java.swing.plaf.motif.MotifLookAndFeel"
		//(WINDOWS) - com.sun.java.swing.plaf.windows.WindowsLookAndFeel
		
		try {			
			
			//Class<?> classe=Class.forName("com.bydan.erp.seguridad.presentation.swing.jinternalframes.AnioBeanSwingJInternalFrame");
			
			//System.setProperty("sun.java2d.noddraw", Boolean.TRUE.toString());
			  
			/*
			Sistema sistema1=new Sistema();
			Sistema sistema2=new Sistema();
			
			sistema1.setId(-11L);
			sistema2.setId(-11L);
			
			if(sistema1.equals(sistema2)) {
				System.out.println("ok");
			}
			*/
			
			
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");			
			
			//System.out.println(UIManager.getSystemLookAndFeelClassName());
			
			/*
			String property = System.getProperty("java.library.path");
			StringTokenizer parser = new StringTokenizer(property, ";");
			
			while (parser.hasMoreTokens()) {
			    System.err.println(parser.nextToken());
			}
			*/
			
			//CARGAR CONSTANTES DESDE CONFIGURACION
			Main.cargarConstantesDesdeConfiguracion();
			
			//ABRIR VENTANA INICIAL
			if(!Constantes2.ISDEVELOPING_QUERY_EXPORT && !Constantes2.ISDEVELOPING_MIGRATION) {
		        /*
				SwingUtilities.invokeLater(new Runnable() {						
				      public void run() {
				        try {
				        	
				        	//LoginJFrame.SetLookAndFeel(5);
				        	
				        	Main.loginJFrame=new LoginJFrame();
				        	
				        	//Main.loginJFrame.startProcessLoginAux(true);
				        					        	
				        	//SwingUtilities.updateComponentTreeUI(Main.loginJFrame);
				        	
				        	//Main.loginJFrame.pack();
				        	
				        	Main.loginJFrame.setVisible(true);
				        	
				        	
				        	//SplashScreenJFrame splashScreenJFrame=new SplashScreenJFrame();
				        	//splashScreenJFrame.setVisible(true);
				        	
				        	
							//new LoginJFrame().setVisible(true);
							
				        	//new MigrationJFrame().setVisible(true);
							
				        	//new MapaSitioJFrame().setVisible(true);
							
				        	//Main.loginJFrame.finishProcessLoginAux(true);
				        	
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}				    	
				      }
				});
		        */
				
				SwingUtilities.invokeLater(new Main("LoginJFrame"));
				
			} else {
				/*
				SwingUtilities.invokeLater(new Runnable() {						
				      public void run() {
				        //new LoginJFrame().setVisible(true);
				    	new MigrationJFrame().setVisible(true);
				      }
				});
				*/
				
				SwingUtilities.invokeLater(new Main("MigrationJFrame"));
			}
	        
	 	 } catch (IOException ex) {
	 		ex.printStackTrace();
	     }				
	}
	
	public void run() {
		try {
			
	  	  	if(this.sTipo.equals("MigrationJFrame")) {
	  	  		MigrationJFrame migrationJFrame=new MigrationJFrame();
	  	  		
	  	  		migrationJFrame.setVisible(true);
	  	  		
	  	  	} else	if(this.sTipo.equals("LoginJFrame")) {
	  	  	//LoginJFrame.SetLookAndFeel(5);
	        	
	        	Main.loginJFrame=new LoginJFrame();
	        	
	        	//Main.loginJFrame.startProcessLoginAux(true);
	        					        	
	        	//SwingUtilities.updateComponentTreeUI(Main.loginJFrame);
	        	
	        	//Main.loginJFrame.pack();
	        	
	        	Main.loginJFrame.setVisible(true);
	        	
	        	
	        	//SplashScreenJFrame splashScreenJFrame=new SplashScreenJFrame();
	        	//splashScreenJFrame.setVisible(true);
	        	
	        	
				//new LoginJFrame().setVisible(true);
				
	        	//new MigrationJFrame().setVisible(true);
				
	        	//new MapaSitioJFrame().setVisible(true);
				
	        	//Main.loginJFrame.finishProcessLoginAux(true);
	  	  	}
	  		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	public static void cargarConstantesDesdeConfiguracion() throws Exception {
		Properties propertiesConfig = new Properties();
		
		 //load a properties file
		//propertiesConfig.load(new FileInputStream("config/config.properties"));

		propertiesConfig.load(AuxiliarConfig.class.getResourceAsStream("config.properties"));
		
        //get the property value and print it out
        //System.out.println(propertiesConfig.getProperty("is_debug"));
 		
		
		//DATABASE USER
		if(propertiesConfig.getProperty("db_user")!=null) {
			Constantes.SCONNEXION_USER=propertiesConfig.getProperty("db_user");
			
		} else {
			Constantes.SCONNEXION_USER="root";
		}
		//DATABASE USER_FIN		
				
		//DATABASE USER
		if(propertiesConfig.getProperty("db_password")!=null) {
			Constantes.SCONNEXION_PASSWORD=propertiesConfig.getProperty("db_password");
			
		} else {
			Constantes.SCONNEXION_PASSWORD="root";
		}
		//DATABASE USER_FIN		
				
		//DATABASE CONNEXION
		if(propertiesConfig.getProperty("database")!=null) {
			Constantes.SCONNEXION_POSTGRES=propertiesConfig.getProperty("database")+":5432/bydan_erp";
					
		} else {
			Constantes.SCONNEXION_POSTGRES="127.0.0.1:5432/bydan_erp";
		}
		//DATABASE CONNEXION_FIN	
		
		
				
		//ISDEVELOPING --> IS_DEBUG
		if(propertiesConfig.getProperty("is_debug")!=null) {
			if(propertiesConfig.getProperty("is_debug").equals("true")) {
				Constantes.ISDEVELOPING=true;
			} else {
				Constantes.ISDEVELOPING=false;
			}
		} else {
			Constantes.ISDEVELOPING=false;
		}
		
		
		//ISDEVELOPING2 --> IS_DEBUG2
		if(propertiesConfig.getProperty("is_debug2")!=null) {
			if(propertiesConfig.getProperty("is_debug2").equals("true")) {
				Constantes2.ISDEVELOPING2=true;
			} else {
				Constantes2.ISDEVELOPING2=false;
			}
		} else {
			Constantes2.ISDEVELOPING2=false;
		}
		
		
		//ISDEVELOPING_SQL --> IS_SQL
		if(propertiesConfig.getProperty("is_sql")!=null) {
			if(propertiesConfig.getProperty("is_sql").equals("true")) {
				Constantes2.ISDEVELOPING_SQL=true;
			} else {
				Constantes2.ISDEVELOPING_SQL=false;
			}
		} else {
			Constantes2.ISDEVELOPING_SQL=false;
		}
		
		
		//ISDEVELOPING_QUERY_EXPORT --> IS_QUERY
		if(propertiesConfig.getProperty("is_query")!=null) {
			if(propertiesConfig.getProperty("is_query").equals("true")) {
				Constantes2.ISDEVELOPING_QUERY_EXPORT=true;
			} else {
				Constantes2.ISDEVELOPING_QUERY_EXPORT=false;
			}				
		} else {
			Constantes2.ISDEVELOPING_QUERY_EXPORT=false;
		}
		
		
		//ISDEVELOPING_MIGRATION --> IS_MIGRATION
		if(propertiesConfig.getProperty("is_migration")!=null) {
			if(propertiesConfig.getProperty("is_migration").equals("true")) {
				Constantes2.ISDEVELOPING_MIGRATION=true;
			} else {
				Constantes2.ISDEVELOPING_MIGRATION=false;
			}				
		} else {
			Constantes2.ISDEVELOPING_MIGRATION=false;
		}


		//ISDEVELOPING_SQL --> IS_DEVELOPING_SQL
		if(propertiesConfig.getProperty("is_developing_sql")!=null) {
			if(propertiesConfig.getProperty("is_developing_sql").equals("true")) {
				Constantes2.ISDEVELOPING_SQL=true;
			} else {
				Constantes2.ISDEVELOPING_SQL=false;
			}				
		} else {
			Constantes2.ISDEVELOPING_SQL=false;
		}


		//PRECARGAR WEB --> IS_DEVELOPING_SQL
		if(propertiesConfig.getProperty("con_precargar_web")!=null) {
			if(propertiesConfig.getProperty("con_precargar_web").equals("true")) {
				Constantes2.CON_PRECARGAR_CLASES_WEB=true;
			} else {
				Constantes2.CON_PRECARGAR_CLASES_WEB=false;
			}				
		} else {
			Constantes2.CON_PRECARGAR_CLASES_WEB=false;
		}

		//FORZAR-MANUAL
		//Constantes.ISDEVELOPING=true;		
	}
}
