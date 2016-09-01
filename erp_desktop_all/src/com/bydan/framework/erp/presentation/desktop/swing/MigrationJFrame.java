

package com.bydan.framework.erp.presentation.desktop.swing;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

import org.apache.log4j.Logger;
import javax.swing.UIManager.*;

//import com.bydan.erp.service.ejb.interfaces.TipoProfeciaImplementable;
//import com.bydan.erp.util.TipoProfeciaConstantesFunciones;
import com.bydan.framework.ConstantesCommon;
import com.bydan.framework.erp.util.ConnexionType;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.DeepLoadType;
import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.util.ParameterDbType;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;
import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
import com.bydan.jh.business.entity.saefact;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.AccionBeanSwingJInternalFrame;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.SistemaBeanSwingJInternalFrame;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.SistemaJInternalFrame;
//import com.bydan.erp.seguridad.service.ejb.interfaces.*;

import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.logic.*;

import java.awt.event.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

@SuppressWarnings("unused")
public class MigrationJFrame extends JFrame implements Runnable,ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//protected static SistemaAdditionable sistemaAdditionable=SistemaConstantesFunciones.getSistemaAdditionableEjbReference(SistemaConstantesFunciones.SREMOTEEJBNAMEADDITIONAL);
	//protected static SistemaAdditionableHome sistemaAdditionableHome= SistemaConstantesFunciones.getSistemaAdditionableHomeEjbReference(SistemaConstantesFunciones.SLOCALEJBNAMEADDITIONAL);
		
	//protected static ParametroGeneralSgImplementable parametroGeneralSgImplementable=ParametroGeneralSgConstantesFunciones.getParametroGeneralSgImplementableEjbReference(ParametroGeneralSgConstantesFunciones.SREMOTEEJBNAMEADDITIONAL);
	//protected static ParametroGeneralSgImplementableHome parametroGeneralSgImplementableHome= ParametroGeneralSgConstantesFunciones.getParametroGeneralSgImplementableHomeEjbReference(ParametroGeneralSgConstantesFunciones.SLOCALEJBNAMEADDITIONAL);
	
	//protected static ParametroGeneralUsuarioImplementable parametroGeneralUsuarioImplementable=ParametroGeneralUsuarioConstantesFunciones.getParametroGeneralUsuarioImplementableEjbReference(ParametroGeneralUsuarioConstantesFunciones.SREMOTEEJBNAMEADDITIONAL);
	//protected static ParametroGeneralUsuarioImplementableHome parametroGeneralUsuarioImplementableHome= ParametroGeneralUsuarioConstantesFunciones.getParametroGeneralUsuarioImplementableHomeEjbReference(ParametroGeneralUsuarioConstantesFunciones.SLOCALEJBNAMEADDITIONAL);
	
	protected SistemaLogicAdditional sistemaLogicAdditional;
	protected UsuarioLogicAdditional usuarioLogicAdditional;
	protected ParametroGeneralSgLogic parametroGeneralSgLogic;
	protected ParametroGeneralSg parametroGeneralSg;
	protected ParametroGeneralUsuarioLogic parametroGeneralUsuarioLogic;
	protected ParametroGeneralUsuario parametroGeneralUsuario;
	protected Usuario usuarioActual;
	
	protected DatosCliente datosCliente;
	
	private JButton jButtonAceptar;
	private JButton jButtonProcesoGeneral;
    private JButton jButtonCancelar;
    private JLabel jLabelUsuario;
    private JLabel jLabelPassword;
    private JPasswordField jPasswordFieldPassword;
    private JTextField jTextFieldUsuario;
    
    private JPanel jContentPane;
    private JPanel jPanelLogin;
    
    private static Logger logger = Logger.getLogger(MigrationJFrame.class);  
	
    //static final int xOffset = 10, yOffset = 35;
    
    public String sTipo="";
    public MigrationJFrame migrationJFrame=null;
    
    public MigrationJFrame(MigrationJFrame migrationJFrame,String sTipo) {
    	this.migrationJFrame=migrationJFrame;
    	this.sTipo=sTipo;
    }
    
    public void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	try {
		
    		/*51 TipoEstadoPedido*/
    		//ProcessMigration.TipoEstadoPedido(false);
    		
    		/*52 EstadoPedido*/
    		//ProcessMigration.EstadoPedido(false);
    		
    		/*53 TipoPrioridadPedido*/
    		//ProcessMigration.TipoPrioridadPedido(false);
    		
    		/*54 PrioridadPedido*/
    		//ProcessMigration.PrioridadPedido(false);
    		
    		/*55 Continente*/
    		//ProcessMigration.Continente(false);
    		
    		/*56 Pais*/
    		//ProcessMigration.Pais(false);
    		
    		/*57 Region*/
    		//ProcessMigration.Region(false);
    		
    		/*58 Provincia*/
    		//ProcessMigration.Provincia(false);
    		
    		/*59 Ciudad*/
    		//ProcessMigration.Ciudad(false);
    		
    		/*60 Zona*/
    		//ProcessMigration.Zona(false);
    		
    		/*60 Puerto*/
    		//ProcessMigration.Puerto(false);
    		
    		/*61 CostoGastoImpor*/
    		//ProcessMigration.CostoGastoImpor(false);
    		
    		/*62 Arancel*/
    		//ProcessMigration.Arancel(false);
    		
    		/*63 Arancel*/
    		//ProcessMigration.Embarcador(false);
    		
    		/*64 PeriodoDeclara*/
    		//ProcessMigration.PeriodoDeclara(false);
    		
    		/*65 ImpuestoRenta*/    		
    		//ProcessMigration.ImpuestoRenta(false);
    		
    		/*66 ImpuestoRenta*/    		
    		//ProcessMigration.VariableNomi(false);    		
    		
    		/*67 RubroEmplea*/
    		//ProcessMigration.RubroEmplea(false);
    		
    		/*68 TipoAfiliacion*/
    		//ProcessMigration.TipoAfiliacion(false);
    		
    		/*69 TipoUnidad*/
    		//ProcessMigration.TipoUnidad(false);
    		
    		/*70 Unidad*/
    		//ProcessMigration.Unidad(false);
    		
    		/*71 CentroActividad*/
    		//ProcessMigration.CentroActividad(false);
    		
    		/*72 TipoDescripcionAsiento*/
    		ProcessMigration.TipoDescripcionAsiento(false);
    		
    		
    		//EXPORTAR QUERIES
    		/*
    		String sFinalQuery="";
    		
    		Constantes2.SFILENAME_EXPORT="pais_queries.sql";
    		PaisLogic paisLogic=new PaisLogic();
    		
    		paisLogic.getTodosPaissWithConnection(sFinalQuery, new Pagination());
    		*/
    		
    		/*
    		for(Pais pais:paisLogic.getPaiss()) {
    			pais.setIsChanged(true);
    			pais.setIsNew(true);
    		}
    		
    		paisLogic.savePaissWithConnection();
    		*/
    		
    		
    		
    		//Constantes2.SPATH_EXPORT+="pais_queries.sql";
    		
    		//JOptionPane.showMessageDialog(this,"PROCESADO","INFO",JOptionPane.INFORMATION_MESSAGE);
	    	
    		System.out.println("PROCESADO");
    		
    		
    		/*
    		this.cargarDatosCliente();
    		
    		//TipoProfeciaImplementable tipoprofeciaImplementable= TipoProfeciaConstantesFunciones.getTipoProfeciaImplementableEjbReference(TipoProfeciaConstantesFunciones.SREMOTEEJBNAME);

    		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));	
			
	    	String sUsuario=this.jTextFieldUsuario.getText();
	    	String sPassword=new String(this.jPasswordFieldPassword.getPassword());
	    	
	    	
	    	//OpcionImplementable opcionImplementable=OpcionConstantesFunciones.getOpcionImplementableEjbReference(OpcionConstantesFunciones.SREMOTEEJBNAME);
	    	
	    	//Set<Opcion> opciones=opcionImplementable.getTodosOpcionsWithConnection("", new Pagination(), new DatosCliente());
	    	Boolean isValidado=false;
	    	
	    	//EntityManagerFactory JPAENTITYMANAGERFACTORY= Persistence.createEntityManagerFactory("PersistenceUnitSeguridad");
	    	
	    	if(Constantes.ISUSAEJBLOGICLAYER) {	
				this.usuarioLogicAdditional.setDatosCliente(this.datosCliente);
	    		this.usuarioActual=this.usuarioLogicAdditional.validarUsuario(sUsuario, sPassword);
				
				if(this.usuarioActual.getId()>0) {
					isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
				isValidado=this.sistemaAdditionable.validarUsuario(sUsuario,sPassword);
			
			} else if(Constantes.ISUSAEJBHOME) {
				isValidado=this.sistemaAdditionableHome.validarUsuario(sUsuario,sPassword);				
			}
	    	
	    	if(isValidado) {   	    		
	    		
	    		if(Constantes.ISUSAEJBLOGICLAYER) {	
	    			this.usuarioActual=this.usuarioLogicAdditional.validarUsuario(sUsuario,sPassword);			
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					this.usuarioActual=this.sistemaAdditionable.validarUsuarioConUsuario(sUsuario,sPassword);
				
				} else if(Constantes.ISUSAEJBHOME) {
					this.usuarioActual=this.sistemaAdditionableHome.validarUsuarioConUsuario(sUsuario,sPassword);			
				}
	    		
	    		this.cargarParametroGeneralUsuario(this.usuarioActual.getId());
	    		
	    		final Usuario usuarioActualFinal=this.usuarioActual;
	    		final ParametroGeneralSg parametroGeneralSg=this.parametroGeneralSg;
	    		final ParametroGeneralUsuario parametroGeneralUsuario=this.parametroGeneralUsuario;
	    		
	    		
		    	java.awt.EventQueue.invokeLater (
		        	new Runnable()  {
			            public void run() {			            	
			                try {
			                	setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));				            		
								//new MainJFrame(usuarioActualFinal).setVisible(true);
			                	new MainMenuJFrame(usuarioActualFinal,parametroGeneralSg,parametroGeneralUsuario).setVisible(true);
								
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            }
		        	}
		       );
		    	
		    	this.dispose();
		    	
	    	} else {
	    		JOptionPane.showMessageDialog(this,"USUARIO O PASSWORD INCORRECTO","ERROR",JOptionPane.ERROR_MESSAGE);
	    	}
	    	*/
    	} catch(Exception e) {
    		FuncionesSwing.manageException(this, e,logger);
    	}
    }
    
    
    public MigrationJFrame() {
    	try {
    		long start = System.currentTimeMillis();  
    		EntityManagerFactory JPAENTITYMANAGERFACTORY=null;
    		
    		if(Constantes.CONNEXIONTYPE.equals(ConnexionType.HIBERNATE)) {
    			JPAENTITYMANAGERFACTORY=Persistence.createEntityManagerFactory("PersistenceUnitSeguridad");
    		}
    		
    		double diff = (double)System.currentTimeMillis() - start;  
    	    System.out.println("time (ms): " + diff);  
    	        
    		datosCliente=new DatosCliente();
    		sistemaLogicAdditional=new SistemaLogicAdditional();
    		usuarioLogicAdditional=new UsuarioLogicAdditional();    		    	
    		parametroGeneralSgLogic=new ParametroGeneralSgLogic();
    		parametroGeneralUsuarioLogic=new ParametroGeneralUsuarioLogic();
    		
    		initComponents();
    		
    		if(Constantes.ISDEVELOPING) {    			    			
    			JRootPane rootPane = this.getRootPane();
    			rootPane.setDefaultButton(this.jButtonAceptar);
    			
    		}
    		
    		this.cargarParametroGeneral();
    		
    	} catch(Exception e) {
    		try {
				FuncionesSwing.manageException(this, e,logger);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
    }

    private void jButtonProcesoGeneralActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	try {
    		//PERFIL OPCION
    		
    		PerfilOpcionLogic perfilopcionLogic=new PerfilOpcionLogic();
    		
    		String sFinalQuery="";
    		
    		Pagination pagination=new Pagination();
    		pagination.setiFirstResult(-1);
    		pagination.setiMaxResults(-1);
    		
    		perfilopcionLogic.getTodosPerfilOpcionsWithConnection(sFinalQuery, pagination);
    		
    		ArrayList<Classe> classes=new ArrayList<Classe>();
    		
    		classes.add(new Classe(Opcion.class));
    			
    		perfilopcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
    			
    		for(PerfilOpcion perfilopcion:perfilopcionLogic.getPerfilOpcions()) {
    			perfilopcion.setid_sistema(perfilopcion.getOpcion().getid_sistema());
    			perfilopcion.setid_modulo(perfilopcion.getOpcion().getid_modulo());
    			perfilopcion.setid_grupo_opcion(perfilopcion.getOpcion().getid_grupo_opcion());
    			
    		}
    		
    		//perfilopcionLogic.savePerfilOpcionsWithConnection();
    		
    		
    		
    		
    		//OPCION
    		/*
    		OpcionLogic opcionLogic=new OpcionLogic();
    		
    		String sFinalQuery=" order by id ";
    		
    		Pagination pagination=new Pagination();
    		pagination.setiFirstResult(-1);
    		pagination.setiMaxResults(-1);
    		
    		opcionLogic.getTodosOpcionsWithConnection(sFinalQuery, pagination);
    		
    		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/opcion_update.txt"));
    	    String sIdOpcion="";
    	    */
    	    /*
    		for(Opcion opcion:opcionLogic.getOpcions()) {
    			if(opcion.getid_opcion()!=null && opcion.getid_opcion()>0) {
    				sIdOpcion=opcion.getid_opcion().toString();
    			} else {
    				sIdOpcion="null";
    			}
    			
    			bufferedWriter.write("\r\n update seguridad.opcion set id_opcion="+sIdOpcion+" where id="+opcion.getId()+";");
    		}
    		
    		bufferedWriter.close();
    		*/
    	    
    		System.out.println("Finalizado");
    		
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public void cargarParametroGeneral() throws Exception {
    	this.cargarDatosCliente();
    	
    	String finalQuery=SeguridadSql.GetWhereParametroGeneralActivo(this.parametroGeneralSgLogic.getConnexionType(), this.parametroGeneralSgLogic.getParameterDbType());
		
    	if(Constantes.ISUSAEJBLOGICLAYER) {	
			this.parametroGeneralSgLogic.setDatosCliente(this.datosCliente);
						
						
			this.parametroGeneralSgLogic.getEntityWithConnection(finalQuery);
			
			if(this.parametroGeneralSgLogic.getParametroGeneralSg()!=null && this.parametroGeneralSgLogic.getParametroGeneralSg().getId()>0) {
				this.parametroGeneralSg=this.parametroGeneralSgLogic.getParametroGeneralSg();
				//System.out.println(this.parametroGeneralSgLogic.getParametroGeneralSg().getnombre_empresa());
			} else {
				this.parametroGeneralSg= new ParametroGeneralSg();
			}
			
    		/*
			Usuario usuario=this.usuarioLogicAdditional.validarUsuario(sUsuario, sPassword);
			
			if(usuario.getId()>0) {
				isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			}
			*/
		} else if(Constantes.ISUSAEJBREMOTE) {
			//this.parametroGeneralSg=MigrationJFrame.parametroGeneralSgImplementable.getEntity(finalQuery,this.datosCliente);
		
		} else if(Constantes.ISUSAEJBHOME) {
			//this.parametroGeneralSg=MigrationJFrame.parametroGeneralSgImplementableHome.getEntity(finalQuery,this.datosCliente);				
		}
    	
    	this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,new Modulo(),new Usuario()));
    	
    	//LoginJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralSg.getid_tipo_visual().toString()));
    }
    
    public void cargarParametroGeneralUsuario(Long lIdUsuario) throws Exception {
    	this.cargarDatosCliente();
    	
    	
    	if(Constantes.ISUSAEJBLOGICLAYER) {	
			this.parametroGeneralUsuarioLogic.setDatosCliente(this.datosCliente);
						
						
			this.parametroGeneralUsuarioLogic.getEntityWithConnection(lIdUsuario);
			
			if(this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario()!=null && this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario().getId()>0) {
				this.parametroGeneralUsuario=this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario();
				//System.out.println(this.parametroGeneralUsuarioLogic.getParametroGeneralUsuario().getnombre_empresa());
			} else {
				this.parametroGeneralUsuario= new ParametroGeneralUsuario();
			}
			
    		/*
			Usuario usuario=this.usuarioLogicAdditional.validarUsuario(sUsuario, sPassword);
			
			if(usuario.getId()>0) {
				isValidado=true;//usuarioLogicAdditional.validarUsuarioSeguridad(strNombreUsuario, strClaveUsuario);
			}
			*/
		} else if(Constantes.ISUSAEJBREMOTE) {
			//this.parametroGeneralUsuario=MigrationJFrame.parametroGeneralUsuarioImplementable.getEntity(lIdUsuario,this.datosCliente);
		
		} else if(Constantes.ISUSAEJBHOME) {
			//this.parametroGeneralUsuario=MigrationJFrame.parametroGeneralUsuarioImplementableHome.getEntity(lIdUsuario,this.datosCliente);				
		}
    	
    	//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralUsuario,new Modulo(),new Usuario()));
    	
    	MigrationJFrame.SetLookAndFeel(Integer.parseInt(this.parametroGeneralUsuario.getid_tipo_visual().toString()));
    }
    
    public ParametroGeneralSg getParametroGeneralSg() {
		return parametroGeneralSg;
	}

	public void setParametroGeneralSg(ParametroGeneralSg parametroGeneralSg) {
		this.parametroGeneralSg = parametroGeneralSg;
	}

	
	public ParametroGeneralUsuario getParametroGeneralUsuario() {
		return parametroGeneralUsuario;
	}

	public void setParametroGeneralUsuario(
			ParametroGeneralUsuario parametroGeneralUsuario) {
		this.parametroGeneralUsuario = parametroGeneralUsuario;
	}

	private void initComponents() {
    	  
    	int intX=Toolkit.getDefaultToolkit().getScreenSize().width/2-this.getWidth();
    	int intY=Toolkit.getDefaultToolkit().getScreenSize().height/2-this.getHeight();
    	
    	this.setLocation(intX, intY);
    	 
    	String sUsuarioDefault="";
    	String sPasswordDefault="";
    	
    	if(Constantes.ISDEVELOPING) {
    		sUsuarioDefault="ADMIN";
    		sPasswordDefault="123456";
    	}
    	//this.setTitle("Login");
    	//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		
		//this.setSize((screenSize.width-xOffset*3)/2,screenSize.height-yOffset*3);
		
		this.setSize(new Dimension(400,150));
		   	
    	this.jLabelUsuario = new JLabel();
    	this.jTextFieldUsuario = new JTextField();
    	this.jPasswordFieldPassword = new JPasswordField();
    	this.jLabelPassword = new JLabel();
    	this.jButtonAceptar = new JButton();
    	this.jButtonProcesoGeneral = new JButton();
    	
    	this.jButtonCancelar = new JButton();

    	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Login");

        this.jLabelUsuario.setText("Dato1");
        this.jLabelPassword.setText("Dato2");
                
        this.jTextFieldUsuario.setText(sUsuarioDefault);
        this.jTextFieldUsuario.setMinimumSize(new Dimension(100,20));
		this.jTextFieldUsuario.setMaximumSize(new Dimension(100,20));
		this.jTextFieldUsuario.setPreferredSize(new Dimension(100,20));
		
        this.jPasswordFieldPassword.setText(sPasswordDefault);
        this.jPasswordFieldPassword.setMinimumSize(new Dimension(100,20));
		this.jPasswordFieldPassword.setMaximumSize(new Dimension(100,20));
		this.jPasswordFieldPassword.setPreferredSize(new Dimension(100,20));
        
		String sMapKey = "CTRL_1";
		InputMap inputMap =null;
		
        this.jButtonAceptar.setText("Procesar");
        this.jButtonProcesoGeneral.setText("Procesar General");
            
        /*
        this.jButtonAceptar.addActionListener (
        	new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                try {
						jButtonAceptarActionPerformed(evt);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
        );
		*/
        
        this.jButtonAceptar.addActionListener(new MigrationJFrame(this,"jButtonAceptarActionPerformed"));
        
        this.jButtonProcesoGeneral.setVisible(false);
        
        /*
        this.jButtonProcesoGeneral.addActionListener (
            	new java.awt.event.ActionListener() {
    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
    	                try {
    						jButtonProcesoGeneralActionPerformed(evt);
    					} catch (Exception e) {
    						// TODO Auto-generated catch block
    						e.printStackTrace();
    					}
    	            }
    	        }
            );
        */
        
        this.jButtonProcesoGeneral.addActionListener(new MigrationJFrame(this,"jButtonProcesoGeneralActionPerformed"));
        
        sMapKey = "F5";
		inputMap = this.jButtonAceptar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_1 , KeyEvent.CTRL_MASK), sMapKey);
		inputMap.put(KeyStroke.getKeyStroke("F5"), sMapKey);
		
		/*
		this.jButtonAceptar.getActionMap().put(sMapKey, new AbstractAction() {
		  private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
		    	try {
					jButtonAceptarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		*/
		
		this.jButtonAceptar.getActionMap().put(sMapKey,new AbstractActionGeneral(this,"jButtonAceptarActionPerformedMigrationJFrame"));
        
        this.jButtonCancelar.setText("Cancelar");
        
        /*
        this.jButtonCancelar.addActionListener (
        	new java.awt.event.ActionListener() {
		        public void actionPerformed(java.awt.event.ActionEvent evt) {
		            try {
						jButtonCancelarActionPerformed(evt);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		    }
        );
        */
        this.jButtonCancelar.addActionListener(new MigrationJFrame(this,"jButtonCancelarActionPerformed"));
        
        
        sMapKey="F6";
        inputMap = this.jButtonCancelar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_2 , KeyEvent.CTRL_MASK), sMapKey);
        inputMap.put(KeyStroke.getKeyStroke("F6"), sMapKey);
        
        /*
		this.jButtonCancelar.getActionMap().put(sMapKey, new AbstractAction() {
		  private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
		    	try {
					jButtonCancelarActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		});
		*/
		
        this.jButtonCancelar.getActionMap().put(sMapKey,new AbstractActionGeneral(this,"jButtonCancelarActionPerformedMigrationJFrame"));
        
        
        this.jContentPane = new JPanel();        
        this.jPanelLogin = new JPanel();
          
        this.jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        this.jPanelLogin.setToolTipText("Login");
        this.jPanelLogin.setName("Login"); 
        
        
        this.jContentPane.setLayout(new GridBagLayout());
        this.jPanelLogin.setLayout(new GridBagLayout());
       // GridBagLayout gridaBagLayout= new GridBagLayout();
        
			
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 0;			
		this.jPanelLogin.add(this.jLabelUsuario, gridBagConstraints);
		
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridx = 1;			
		this.jPanelLogin.add(this.jTextFieldUsuario, gridBagConstraints);
		
        
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 0;			
		this.jPanelLogin.add(this.jLabelPassword, gridBagConstraints);
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridx = 1;			
		this.jPanelLogin.add(this.jPasswordFieldPassword, gridBagConstraints);
		
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridx = 0;			
		this.jPanelLogin.add(this.jButtonAceptar, gridBagConstraints);
		
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridx = 1;			
		this.jPanelLogin.add(this.jButtonCancelar, gridBagConstraints);
		
		gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridx = 2;			
		this.jPanelLogin.add(this.jButtonProcesoGeneral, gridBagConstraints);
		
        gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridy =0;		
		gridBagConstraints.gridx = 0;
		this.jContentPane.add(this.jPanelLogin, gridBagConstraints);
				
		
		this.setContentPane(this.jContentPane);
		
		
		/*
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAceptar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelPassword))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldUsuario, GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPassword, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();|
        */ 
		
		
    }

	public void actionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if(this.sTipo.equals("jButtonAceptarActionPerformed")) {
				this.migrationJFrame.jButtonAceptarActionPerformed(evt);
			
			} else if(this.sTipo.equals("jButtonProcesoGeneralActionPerformed")) {
				this.migrationJFrame.jButtonProcesoGeneralActionPerformed(evt);
				
			} else if(this.sTipo.equals("jButtonCancelarActionPerformed")) {
				this.migrationJFrame.jButtonCancelarActionPerformed(evt);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	 
    private void cargarDatosCliente() {
    	this.datosCliente.setIdUsuario(17L);
		this.datosCliente.setsIPPC("0.0.0.0");
		this.datosCliente.setsNamePC("x");
		this.datosCliente.setsUsuarioPC("u");
    }
    
    
	public static void ConexionMiniEstructura(Boolean esHibernate) throws SQLException, Exception{
		int iTotal=0;
		long time_start = System.currentTimeMillis();
		
		if(esHibernate) {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.HIBERNATE;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		
		} else {
			com.bydan.framework.jh.business.entity.Constantes.CONNEXIONTYPE=com.bydan.framework.jh.business.entity.ConnexionType.JDBC32;
			com.bydan.framework.jh.business.entity.Constantes.PARAMETERDBTYPE=com.bydan.framework.jh.business.entity.ParameterDbType.INFORMIX;
		}
					
		saefact saefact=new saefact();
		
		long time_persistence = System.currentTimeMillis();
		
		String sFinalQuery="";
		
		List<saefact> saefacts = new  ArrayList<saefact>();				
		
		saefacts=saefact.getEntitiesWithConnection(sFinalQuery);
		
		long time_query = System.currentTimeMillis();
		
			
		for(saefact saefact2:saefacts) {
			System.out.println(saefact2.getfact_tot_fact());
		}
		
		iTotal=saefacts.size();
		
		
		System.out.println("TIEMPO DEMORADO CARGAR PERSISTENCIA(ms): " + ((double)time_persistence - time_start));  		
		System.out.println("TIEMPO DEMORADO EJECUTAR QUERY(ms): " + ((double)time_query - time_persistence)); 		
	    System.out.println("TIEMPO TOTAL DEMORADO (ms): " + ((double)time_query - time_start));   
	    
	    System.out.println("TOTAL No ITEMS : " + iTotal);
	}		
	
    public void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
    	try {
	    	quit();
    		
    		//CON ID AUTOMATICO
    		/*
    		TipoDetalleDocumentoLogic tipoDetalleDocumentoLogic=new TipoDetalleDocumentoLogic();
    		String sFinalQuery="";
    		Pagination pagination=new Pagination();
    		
    		tipoDetalleDocumentoLogic.setConnexionType(ConnexionType.JDBC32);
    		tipoDetalleDocumentoLogic.setParameterDbType(ParameterDbType.POSTGRES);
    		
    		tipoDetalleDocumentoLogic.getTodosTipoDetalleDocumentosWithConnection(sFinalQuery, pagination);
	    	
    		for(TipoDetalleDocumento tipoDetalleDocumento:tipoDetalleDocumentoLogic.getTipoDetalleDocumentos()) {
    			System.out.println(tipoDetalleDocumento.getId()+","+tipoDetalleDocumento.getid_empresa()+","+tipoDetalleDocumento.getcodigo()+","+tipoDetalleDocumento.getnombre()+","+tipoDetalleDocumento.getVersionRow());
    		}
    		*/
    		//INSERT
    		/*
    		TipoDetalleDocumento tipoDetalleDocumento=new TipoDetalleDocumento();
    		tipoDetalleDocumento.setid_empresa(1L);
    		tipoDetalleDocumento.setcodigo("4");
    		tipoDetalleDocumento.setnombre("44");
    		
    		tipoDetalleDocumentoLogic.setTipoDetalleDocumento(tipoDetalleDocumento);
    		*/
    		
    		//UPDATE
    		/*
    		tipoDetalleDocumentoLogic.getEntityWithConnection(4L);
    		tipoDetalleDocumentoLogic.getTipoDetalleDocumento().setcodigo("a4g");
    		tipoDetalleDocumentoLogic.getTipoDetalleDocumento().setnombre("a44h");
    		tipoDetalleDocumentoLogic.getTipoDetalleDocumento().setid_empresa(1L);
    		*/
    		
    		//DELETE
    		/*
    		tipoDetalleDocumentoLogic.getEntityWithConnection(4L);
    		tipoDetalleDocumentoLogic.getTipoDetalleDocumento().setIsDeleted(true);
    		*/
    		
    		//tipoDetalleDocumentoLogic.saveTipoDetalleDocumentoWithConnection();
    		
	    	//CON ID AUTOMATICO FIN
	    	
	    	
	    	
	    	
	    	
	    	
	    	
    		
    		//SIN ID AUTOMATICO
    		/*
    		TipoComprobanteLogic tipoComprobanteLogic=new TipoComprobanteLogic();
    		String sFinalQuery="";
    		Pagination pagination=new Pagination();
    		
    		tipoComprobanteLogic.setConnexionType(ConnexionType.JDBC32);
    		tipoComprobanteLogic.setParameterDbType(ParameterDbType.POSTGRES);
    		
    		tipoComprobanteLogic.getTodosTipoComprobantesWithConnection(sFinalQuery, pagination);
	    	
    		for(TipoComprobante tipoComprobante:tipoComprobanteLogic.getTipoComprobantes()) {
    			System.out.println(tipoComprobante.getId()+","+tipoComprobante.getcodigo()+","+tipoComprobante.getnombre()+","+tipoComprobante.getVersionRow());
    		}
    		*/
    		    		
    		//INSERT
    		/*
    		TipoComprobante tipoComprobante=new TipoComprobante();
    		tipoComprobante.setId(4L);
    		tipoComprobante.setcodigo("4");
    		tipoComprobante.setnombre("44");
    		
    		tipoComprobanteLogic.setTipoComprobante(tipoComprobante);
    		*/
    		
    		//UPDATE
    		/*
    		tipoComprobanteLogic.getEntityWithConnection(4L);
    		tipoComprobanteLogic.getTipoComprobante().setcodigo("a4g");
    		tipoComprobanteLogic.getTipoComprobante().setnombre("a44h");
    		*/
    		
    		//DELETE
    		/*
    		tipoComprobanteLogic.getEntityWithConnection(4L);
    		tipoComprobanteLogic.getTipoComprobante().setIsDeleted(true);
    		
    		
    		tipoComprobanteLogic.saveTipoComprobanteWithConnection();
    		*/
    		
	    	//SIN ID AUTOMATICO FIN
    		
    		
	    } catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
    }
    
    protected void quit() {
        System.exit(0);
    }
    
    protected static void SetLookAndFeel(int iTipo) {
    	try {
			//int iTipo=Integer.parseInt(lTipo.toString());
			
    		switch(iTipo) { 
    			case 1: UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    			break;

    			case 2: UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    			break;

    			case 3: UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    			break; 

    			case 4: UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    			break; 
    			
    			case 5:
		    			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		    		        if ("Nimbus".equals(info.getName())) {
		    		        	System.out.println(info.getClassName());
		    		            UIManager.setLookAndFeel(info.getClassName());
		    		            break;
		    		        }
		    		    }
    			break; 
    			
    			default: UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

    		};
    		
    		
    	} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    public static void main(String args[]) {
    	//LoginJFrame.SetLookAndFeel(1L);
    	 
    	/*
        java.awt.EventQueue.invokeLater (
        	new Runnable() {
	            public void run() {
	                //new LoginJFrame().setVisible(true);
	            	try {
						//new SistemaBeanSwingJInternalFrame().setVisible(true);
	            		new MigrationJFrame().setVisible(true);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
        	}
       );
       */
    	
    	java.awt.EventQueue.invokeLater(new MigrationJFrame(null,"main"));
    }
    
    public void run() {
		try {
			if(this.sTipo.equals("main")) {
				MigrationJFrame migrationJFrame=new MigrationJFrame();
				
				migrationJFrame.setVisible(true);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*1 TipoMovimientoModulo*/
/*2 Manual TipoMovimiento*/
//ProcessMigration.TipoMovimientoModulo(false);

/*2 TipoDocumento*/
//ProcessMigration.TipoDocumento(false);

/*3 Secuenciales */
//ProcessMigration.Secuencial(false);
	
/*4 TipoTransaccion */
//ProcessMigration.TipoTransaccionModulo(false);

/*5 TipoComprobante*/
//ProcessMigration.TipoComprobante(false);

/*6 TipoRetencion*/
//ProcessMigration.TipoRetencion(false);

/*7 TipoRetencionFuenteIva*/
//ProcessMigration.TipoRetencionFuenteIva(false);

/*8 Transaccion*/
//ProcessMigration.Transaccion(false);

/*9 TipoLineaFlujoCaja*/
//ProcessMigration.TipoLineaFlujoCaja(false);

/*10 LineaFlujoCaja*/
//ProcessMigration.LineaFlujoCaja(false);

/*11 TipoParametroFormularioIva*/
//ProcessMigration.TipoParametroFormularioIva(false);

/*12 ParametroFormularioIva*/
//ProcessMigration.ParametroFormularioIva(false);

/*13 TIPO FORMATO FUE MANUAL*/

/*14 Formato*/
//ProcessMigration.Formato(false);

/*15 TipoGasto*/
//ProcessMigration.TipoGasto(false);

/*16 TipoGastoEmpresa*/
//ProcessMigration.TipoGastoEmpresa(false);

/*17 CentroCosto*/
//ProcessMigration.CentroCosto(false);

/*18 TransaccionConta*/
//ProcessMigration.TransaccionConta(false);

/*19 TipoTributario*/
//ProcessMigration.TipoTributario(false);

/*20 TipoRetencionIva*/
//ProcessMigration.TipoRetencionIva(false);

/*21 TipoIva*/
//ProcessMigration.TipoIva(false);

/*22 GrupoCliente*/
//ProcessMigration.GrupoCliente(false);

/*23 TipoTituloCliente*/
//ProcessMigration.TipoTituloCliente(false);

/*24 TituloCliente*/
//ProcessMigration.TituloCliente(false);

/*25 TipoBanco*/
//ProcessMigration.TipoBanco(false);

/*26 Banco*/
//ProcessMigration.Banco(false);

/*27 PeriodoImportExport*/
//ProcessMigration.PeriodoImportExport(false);

/*28 TipoIce*/
//ProcessMigration.TipoIce(false);

/*29 TipoFormaPago*/
//ProcessMigration.TipoFormaPago(false);

/*30 TipoCliente*/
//ProcessMigration.TipoCliente(false);

/*31 TipoGarantia*/
//ProcessMigration.TipoGarantia(false);

/*31 TipoGarantiaEmpresa*/
//ProcessMigration.TipoGarantiaEmpresa(false);

/*32 RadioVenciProve*/
//ProcessMigration.RadioVenciProve(false);

/*33 RadioVenciClienteProve*/
//ProcessMigration.RadioVenciClienteProve(false);

/*34 TipoTransporte*/
//ProcessMigration.TipoTransporte(false);

/*35 Transporte*/
//ProcessMigration.Transporte(false);

/*36 TipoEstadoActivoFijo*/
//ProcessMigration.TipoEstadoActivoFijo(false);

/*37 EstadoActivoFijo*/
//ProcessMigration.EstadoActivoFijo(false);

/*37 TipoActivoFijo*/
//ProcessMigration.TipoActivoFijo(false);

/*38 TipoActivoFijoEmpresa*/
//ProcessMigration.TipoActivoFijoEmpresa(false);

/*39 TipoCalculoDepreciacion*/
//ProcessMigration.TipoCalculoDepreciacion(false);

/*40 TipoDepreciacionEmpresa*/
//ProcessMigration.TipoDepreciacionEmpresa(false);

/*41 TipoGrupoActivoFijo*/
//ProcessMigration.TipoGrupoActivoFijo(false);

/*42 TipoGrupoActivoFijo*/
//ProcessMigration.DetalleGrupoActivoFijo(false);

/*43 TipoSubGrupoActivoFijo*/
//ProcessMigration.TipoSubGrupoActivoFijo(false);

/*44 SubGrupoActivoFijo*/
//ProcessMigration.SubGrupoActivoFijo(false);

/*45 TipoDevolucion*/
//ProcessMigration.TipoDevolucion(false);

/*46 TipoDevolucionEmpresa*/
//ProcessMigration.TipoDevolucionEmpresa(false);

/*47 EstadoFisicoFactura*/
//ProcessMigration.EstadoFisicoFactura(false);

/*47 EstadoFisicoFactura*/
//ProcessMigration.EstadoFisicoFacturaEmpresa(false);

/*48 TipoCuentaContableTipo*/
//ProcessMigration.TipoCuentaContableTipo(false);

/*49 CuentaContableTipo*/
//ProcessMigration.CuentaContableTipo(false);

/*50 TipoPrecio*/
//ProcessMigration.TipoPrecio(false);