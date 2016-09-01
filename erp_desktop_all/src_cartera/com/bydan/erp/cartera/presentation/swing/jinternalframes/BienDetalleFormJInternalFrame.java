/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.BienConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class BienDetalleFormJInternalFrame extends BienBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBien;
	
	protected JMenuBar jmenuBarDetalleBien;
	
	protected JMenu jmenuDetalleBien;
	protected JMenu jmenuDetalleArchivoBien;
	protected JMenu jmenuDetalleAccionesBien;
	protected JMenu jmenuDetalleDatosBien;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBien;	
	protected GridBagConstraints gridBagConstraintsBien;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BienBeanSwingJInternalFrameAdditional jInternalFrameDetalleBien;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoBienBeanSwingJInternalFrame tipobienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobien="";
	
	public BienSessionBean bienSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoBienSessionBean tipobienSessionBean;	
	
	public BienLogic bienLogic;
	
	public JScrollPane jScrollPanelDatosBien;
	public JScrollPane jScrollPanelDatosEdicionBien;
	public JScrollPane jScrollPanelDatosGeneralBien;
	
	protected JPanel jPanelCamposBien;    
	protected JPanel jPanelCamposOcultosBien;    	
	protected JPanel jPanelAccionesBien;
	protected JPanel jPanelAccionesFormularioBien;
    
	
	
	protected Integer iXPanelCamposBien=0;
	protected Integer iYPanelCamposBien=0;
	
	protected Integer iXPanelCamposOcultosBien=0;
	protected Integer iYPanelCamposOcultosBien=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBien;
	public JButton jButtonModificarBien;
	public JButton jButtonActualizarBien;
    public JButton jButtonEliminarBien;
	public JButton jButtonCancelarBien;
    public JButton jButtonGuardarCambiosBien;
	public JButton jButtonGuardarCambiosTablaBien;
	protected JButton jButtonCerrarBien;
	
	
	protected JButton jButtonProcesarInformacionBien;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBien;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBien;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBien;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBien;
	protected JButton jButtonModificarToolBarBien;
	protected JButton jButtonActualizarToolBarBien;
    protected JButton jButtonEliminarToolBarBien;
	protected JButton jButtonCancelarToolBarBien;
    protected JButton jButtonGuardarCambiosToolBarBien;
	protected JButton jButtonGuardarCambiosTablaToolBarBien;
	protected JButton jButtonMostrarOcultarTablaToolBarBien;
	protected JButton jButtonCerrarToolBarBien;
	
	protected JButton jButtonProcesarInformacionToolBarBien;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBien;
	protected JMenuItem jMenuItemModificarBien;
	protected JMenuItem jMenuItemActualizarBien;
    protected JMenuItem jMenuItemEliminarBien;
	protected JMenuItem jMenuItemCancelarBien;
    protected JMenuItem jMenuItemGuardarCambiosBien;
	protected JMenuItem jMenuItemGuardarCambiosTablaBien;
	protected JMenuItem jMenuItemCerrarBien;
	protected JMenuItem jMenuItemDetalleCerrarBien;
	protected JMenuItem jMenuItemDetalleMostarOcultarBien;
	
	protected JMenuItem jMenuItemProcesarInformacionBien;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBien;
	protected JMenuItem jMenuItemMostrarOcultarBien;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBien;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBien;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBien;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBien;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBien;
	public JLabel jLabelIdBien;
	public JLabel jLabelidBien;
	public JButton jButtonidBienBusqueda= new JButtonMe();

	public JPanel jPanelnumeroBien;
	public JLabel jLabelnumeroBien;
	public JTextField jTextFieldnumeroBien;
	public JButton jButtonnumeroBienBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionBien;
	public JLabel jLabeldescripcionBien;
	public JTextArea jTextAreadescripcionBien;
	public JScrollPane jscrollPanedescripcionBien;
	public JButton jButtondescripcionBienBusqueda= new JButtonMe();

	public JPanel jPanelvalor_avaluoBien;
	public JLabel jLabelvalor_avaluoBien;
	public JTextField jTextFieldvalor_avaluoBien;
	public JButton jButtonvalor_avaluoBienBusqueda= new JButtonMe();

	public JPanel jPaneldireccionBien;
	public JLabel jLabeldireccionBien;
	public JTextArea jTextAreadireccionBien;
	public JScrollPane jscrollPanedireccionBien;
	public JButton jButtondireccionBienBusqueda= new JButtonMe();

	public JPanel jPaneles_activoBien;
	public JLabel jLabeles_activoBien;
	public JCheckBox jCheckBoxes_activoBien;
	public JButton jButtones_activoBienBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBien;
	public JLabel jLabelid_empresaBien;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBien;
	public JButton jButtonid_empresaBien= new JButtonMe();
	public JButton jButtonid_empresaBienUpdate= new JButtonMe();
	public JButton jButtonid_empresaBienBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteBien;
	public JLabel jLabelid_clienteBien;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBien;
	public JButton jButtonid_clienteBien= new JButtonMe();
	public JButton jButtonid_clienteBienUpdate= new JButtonMe();
	public JButton jButtonid_clienteBienBusqueda= new JButtonMe();

	public JPanel jPanelid_tipobienBien;
	public JLabel jLabelid_tipobienBien;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipobienBien;
	public JButton jButtonid_tipobienBien= new JButtonMe();
	public JButton jButtonid_tipobienBienUpdate= new JButtonMe();
	public JButton jButtonid_tipobienBienBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBien;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BienDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBien=new JPanel();
				this.jPanelAccionesFormularioBien=new JPanel();
				this.jmenuBarDetalleBien=new JMenuBar();
				this.jTtoolBarDetalleBien=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BienDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BienDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BienDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BienDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BienDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Bien No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarBien() {
		return this.jButtonActualizarToolBarBien;
	}
	
	public JButton getjButtonEliminarToolBarBien() {
		return this.jButtonEliminarToolBarBien;
	}
	
	public JButton getjButtonCancelarToolBarBien() {
		return this.jButtonCancelarToolBarBien;
	}		
	
	public JButton getjButtonProcesarInformacionBien() {
		return this.jButtonProcesarInformacionBien;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBien)	{
		this.jButtonProcesarInformacionBien = jButtonProcesarInformacionBien;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBien() {
		return this.jComboBoxTiposAccionesBien;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBien(
			JComboBox jComboBoxTiposRelacionesBien) {
		this.jComboBoxTiposRelacionesBien = jComboBoxTiposRelacionesBien;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBien(
			JComboBox jComboBoxTiposAccionesBien) {
		this.jComboBoxTiposAccionesBien = jComboBoxTiposAccionesBien;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBien() {
		return this.jComboBoxTiposAccionesFormularioBien;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBien(
			JComboBox jComboBoxTiposAccionesFormularioBien) {
		this.jComboBoxTiposAccionesFormularioBien = jComboBoxTiposAccionesFormularioBien;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bienSessionBean=new BienSessionBean();
		
		this.bienSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bienSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bienSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BienJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BienJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BienJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bien MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		BienJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBien= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBien=new JButtonMe();
				this.jButtonModificarToolBarBien=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBien,this.jTtoolBarDetalleBien,
							"actualizar","actualizar","Actualizar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBien,this.jTtoolBarDetalleBien,
							"eliminar","eliminar","Eliminar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBien,this.jTtoolBarDetalleBien,
							"cancelar","cancelar","Cancelar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBien=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBien,this.jTtoolBarDetalleBien,
							"guardarcambios","guardarcambios","Guardar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBien,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBien,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBien,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBien=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBien=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBien=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBien=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBien=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBien= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBien.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBien,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBien= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBien.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBien,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBien= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBien.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBien,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBien= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBien.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBien,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBien= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBien.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBien,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBien= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBien.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBien,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBien= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBien.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBien,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBien= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBien.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBien,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBien= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBien.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBien,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBien= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBien.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBien,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBien, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBien.add(this.jMenuItemDetalleCerrarBien);
		
		this.jmenuDetalleAccionesBien.add(this.jMenuItemActualizarBien);
		this.jmenuDetalleAccionesBien.add(this.jMenuItemEliminarBien);
		this.jmenuDetalleAccionesBien.add(this.jMenuItemCancelarBien);		
		
		//this.jmenuDetalleDatosBien.add(this.jMenuItemDetalleAbrirOrderByBien);				
		this.jmenuDetalleDatosBien.add(this.jMenuItemDetalleMostarOcultarBien);				
				
		//this.jmenuDetalleAccionesBien.add(this.jMenuItemGuardarCambiosBien);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBien, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBien.add(this.jmenuDetalleArchivoBien);		
		this.jmenuBarDetalleBien.add(this.jmenuDetalleAccionesBien);		
		this.jmenuBarDetalleBien.add(this.jmenuDetalleDatosBien);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBien);				
	}
	
	
	public void inicializarElementosCamposBien() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBien = new JLabelMe();
		jLabelIdBien.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBien,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBien = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBien.setToolTipText(BienConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBien= new GridBagLayout();

		this.jPanelidBien.setLayout(this.gridaBagLayoutBien);

		jLabelidBien = new JLabel();
		jLabelidBien.setText("Id");

		jLabelidBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroBien = new JLabelMe();
		this.jLabelnumeroBien.setText(""+BienConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroBien.setToolTipText("Numero");
		this.jLabelnumeroBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroBien.setToolTipText(BienConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutBien = new GridBagLayout();
		this.jPanelnumeroBien.setLayout(this.gridaBagLayoutBien);


		jTextFieldnumeroBien= new JTextFieldMe();

		jTextFieldnumeroBien.setEnabled(false);
		jTextFieldnumeroBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroBien,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroBienBusqueda= new JButtonMe();
		this.jButtonnumeroBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroBienBusqueda.setText("U");
		this.jButtonnumeroBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroBienBusqueda"));

		if(this.bienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroBienBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionBien = new JLabelMe();
		this.jLabeldescripcionBien.setText(""+BienConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionBien.setToolTipText("Descripcion");
		this.jLabeldescripcionBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionBien.setToolTipText(BienConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutBien = new GridBagLayout();
		this.jPaneldescripcionBien.setLayout(this.gridaBagLayoutBien);


		jTextAreadescripcionBien= new JTextAreaMe();
		jTextAreadescripcionBien.setEnabled(false);
		jTextAreadescripcionBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBien.setLineWrap(true);
		jTextAreadescripcionBien.setWrapStyleWord(true);
		jTextAreadescripcionBien.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionBien.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionBien,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionBien = new JScrollPane(jTextAreadescripcionBien);
		jscrollPanedescripcionBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionBienBusqueda= new JButtonMe();
		this.jButtondescripcionBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionBienBusqueda.setText("U");
		this.jButtondescripcionBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionBienBusqueda"));

		if(this.bienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionBienBusqueda.setVisible(false);		}


					
		this.jLabelvalor_avaluoBien = new JLabelMe();
		this.jLabelvalor_avaluoBien.setText(""+BienConstantesFunciones.LABEL_VALORAVALUO+" : *");
		this.jLabelvalor_avaluoBien.setToolTipText("Valor Avaluo");
		this.jLabelvalor_avaluoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_avaluoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_avaluoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_avaluoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_avaluoBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_avaluoBien.setToolTipText(BienConstantesFunciones.LABEL_VALORAVALUO);
		this.gridaBagLayoutBien = new GridBagLayout();
		this.jPanelvalor_avaluoBien.setLayout(this.gridaBagLayoutBien);


		jTextFieldvalor_avaluoBien= new JTextFieldMe();
		jTextFieldvalor_avaluoBien.setEnabled(false);
		jTextFieldvalor_avaluoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_avaluoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_avaluoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_avaluoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_avaluoBien.setText("0.0");

		this.jButtonvalor_avaluoBienBusqueda= new JButtonMe();
		this.jButtonvalor_avaluoBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_avaluoBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_avaluoBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_avaluoBienBusqueda.setText("U");
		this.jButtonvalor_avaluoBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_avaluoBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_avaluoBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_avaluoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_avaluoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_avaluoBienBusqueda"));

		if(this.bienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_avaluoBienBusqueda.setVisible(false);		}


					
		this.jLabeldireccionBien = new JLabelMe();
		this.jLabeldireccionBien.setText(""+BienConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionBien.setToolTipText("Direccion");
		this.jLabeldireccionBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionBien.setToolTipText(BienConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutBien = new GridBagLayout();
		this.jPaneldireccionBien.setLayout(this.gridaBagLayoutBien);


		jTextAreadireccionBien= new JTextAreaMe();
		jTextAreadireccionBien.setEnabled(false);
		jTextAreadireccionBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionBien.setLineWrap(true);
		jTextAreadireccionBien.setWrapStyleWord(true);
		jTextAreadireccionBien.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionBien.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionBien,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionBien = new JScrollPane(jTextAreadireccionBien);
		jscrollPanedireccionBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionBienBusqueda= new JButtonMe();
		this.jButtondireccionBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionBienBusqueda.setText("U");
		this.jButtondireccionBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionBienBusqueda"));

		if(this.bienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionBienBusqueda.setVisible(false);		}


					
		this.jLabeles_activoBien = new JLabelMe();
		this.jLabeles_activoBien.setText(""+BienConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabeles_activoBien.setToolTipText("Es Activo");
		this.jLabeles_activoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_activoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_activoBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_activoBien.setToolTipText(BienConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutBien = new GridBagLayout();
		this.jPaneles_activoBien.setLayout(this.gridaBagLayoutBien);


		jCheckBoxes_activoBien= new JCheckBoxMe();
		jCheckBoxes_activoBien.setEnabled(false);

		jCheckBoxes_activoBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_activoBien,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_activoBienBusqueda= new JButtonMe();
		this.jButtones_activoBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_activoBienBusqueda.setText("U");
		this.jButtones_activoBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_activoBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_activoBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_activoBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_activoBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_activoBienBusqueda"));

		if(this.bienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_activoBienBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBien() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBien = new JLabelMe();
		this.jLabelid_empresaBien.setText(""+BienConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBien.setToolTipText("Empresa");
		this.jLabelid_empresaBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBien.setToolTipText(BienConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBien = new GridBagLayout();
		this.jPanelid_empresaBien.setLayout(this.gridaBagLayoutBien);


		jComboBoxid_empresaBien= new JComboBoxMe();
		jComboBoxid_empresaBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBien,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBien.setEnabled(false);

		this.jButtonid_empresaBien= new JButtonMe();
		this.jButtonid_empresaBien.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBien.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBien.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBien.setText("Buscar");
		this.jButtonid_empresaBien.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBien.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBien,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBien"));

		this.jButtonid_empresaBienBusqueda= new JButtonMe();
		this.jButtonid_empresaBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBienBusqueda.setText("U");
		this.jButtonid_empresaBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBienBusqueda"));

		if(this.bienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBienBusqueda.setVisible(false);		}

		this.jButtonid_empresaBienUpdate= new JButtonMe();
		this.jButtonid_empresaBienUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBienUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBienUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBienUpdate.setText("U");
		this.jButtonid_empresaBienUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBienUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBienUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBienUpdate"));



					
		this.jLabelid_clienteBien = new JLabelMe();
		this.jLabelid_clienteBien.setText(""+BienConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteBien.setToolTipText("Cliente");
		this.jLabelid_clienteBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteBien.setToolTipText(BienConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutBien = new GridBagLayout();
		this.jPanelid_clienteBien.setLayout(this.gridaBagLayoutBien);


		jComboBoxid_clienteBien= new JComboBoxMe();
		jComboBoxid_clienteBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBien,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteBien= new JButtonMe();
		this.jButtonid_clienteBien.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBien.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBien.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteBien.setText("Buscar");
		this.jButtonid_clienteBien.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteBien.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBien,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBien"));

		this.jButtonid_clienteBienBusqueda= new JButtonMe();
		this.jButtonid_clienteBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteBienBusqueda.setText("U");
		this.jButtonid_clienteBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBienBusqueda"));

		if(this.bienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteBienBusqueda.setVisible(false);		}

		this.jButtonid_clienteBienUpdate= new JButtonMe();
		this.jButtonid_clienteBienUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBienUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteBienUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteBienUpdate.setText("U");
		this.jButtonid_clienteBienUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteBienUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteBienUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteBienUpdate"));



					
		this.jLabelid_tipobienBien = new JLabelMe();
		this.jLabelid_tipobienBien.setText(""+BienConstantesFunciones.LABEL_IDTIPOBIEN+" : *");
		this.jLabelid_tipobienBien.setToolTipText("Tipo Bien");
		this.jLabelid_tipobienBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipobienBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipobienBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipobienBien,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipobienBien=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipobienBien.setToolTipText(BienConstantesFunciones.LABEL_IDTIPOBIEN);
		this.gridaBagLayoutBien = new GridBagLayout();
		this.jPanelid_tipobienBien.setLayout(this.gridaBagLayoutBien);


		jComboBoxid_tipobienBien= new JComboBoxMe();
		jComboBoxid_tipobienBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipobienBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipobienBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipobienBien,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipobienBien= new JButtonMe();
		this.jButtonid_tipobienBien.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipobienBien.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipobienBien.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipobienBien.setText("Buscar");
		this.jButtonid_tipobienBien.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipobienBien.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipobienBien,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipobienBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipobienBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipobienBien"));

		this.jButtonid_tipobienBienBusqueda= new JButtonMe();
		this.jButtonid_tipobienBienBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipobienBienBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipobienBienBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipobienBienBusqueda.setText("U");
		this.jButtonid_tipobienBienBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipobienBienBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipobienBienBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipobienBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipobienBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipobienBienBusqueda"));

		if(this.bienSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipobienBienBusqueda.setVisible(false);		}

		this.jButtonid_tipobienBienUpdate= new JButtonMe();
		this.jButtonid_tipobienBienUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipobienBienUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipobienBienUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipobienBienUpdate.setText("U");
		this.jButtonid_tipobienBienUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipobienBienUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipobienBienUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipobienBien.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipobienBien.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipobienBienUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleBien = new BienBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Bien DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBien= new GridBagLayout();
		

		
		String sToolTipBien="";
		sToolTipBien=BienConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBien+="(Cartera.Bien)";
		}
		
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
			sToolTipBien+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBien = new JButtonMe();
		this.jButtonModificarBien = new JButtonMe();
        this.jButtonActualizarBien = new JButtonMe();
        this.jButtonEliminarBien = new JButtonMe();
        this.jButtonCancelarBien = new JButtonMe();
        this.jButtonGuardarCambiosBien = new JButtonMe();
		this.jButtonGuardarCambiosTablaBien = new JButtonMe();
		this.jButtonCerrarBien = new JButtonMe();
		
		this.jScrollPanelDatosBien = new JScrollPane();   
        this.jScrollPanelDatosEdicionBien = new JScrollPane();
		this.jScrollPanelDatosGeneralBien = new JScrollPane();
				
		
		
		this.jPanelCamposBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Bien";
		
		if(!this.bienSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bienes" + this.sPath));
		} else {
			this.jScrollPanelDatosBien.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBien.setName("jPanelCamposBien"); 

		this.jPanelCamposOcultosBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBien.setName("jPanelCamposOcultosBien"); 

        this.jPanelAccionesBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBien.setToolTipText("Acciones");
        this.jPanelAccionesBien.setName("Acciones"); 

		this.jPanelAccionesFormularioBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBien.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBien.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBien, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBien, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBien, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBien, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBien.setText("Nuevo");
		this.jButtonModificarBien.setText("Editar");
        this.jButtonActualizarBien.setText("Actualizar");
        this.jButtonEliminarBien.setText("Eliminar");
        this.jButtonCancelarBien.setText("Cancelar");
        this.jButtonGuardarCambiosBien.setText("Guardar");
		this.jButtonGuardarCambiosTablaBien.setText("Guardar");
		this.jButtonCerrarBien.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBien,"nuevo_button","Nuevo",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBien,"modificar_button","Editar",this.bienSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBien,"actualizar_button","Actualizar",this.bienSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBien,"eliminar_button","Eliminar",this.bienSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBien,"cancelar_button","Cancelar",this.bienSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBien,"guardarcambios_button","Guardar",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBien,"guardarcambiostabla_button","Guardar",this.bienSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBien,"cerrar_button","Salir",this.bienSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBien, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBien, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBien, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBien, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBien.setToolTipText("Nuevo"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBien.setToolTipText("Editar"+" "+BienConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBien.setToolTipText("Actualizar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBien.setToolTipText("Eliminar)"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBien.setToolTipText("Cancelar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBien.setToolTipText("Guardar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBien.setToolTipText("Guardar"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBien.setToolTipText("Salir"+" "+BienConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoBien";
		inputMap = this.jButtonNuevoBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBien.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBien"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBien";
		inputMap = this.jButtonActualizarBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBien"));
		
		//ELIMINAR
		sMapKey = "EliminarBien";
		inputMap = this.jButtonEliminarBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBien"));
		
		//CANCELAR	
		sMapKey = "CancelarBien";
		inputMap = this.jButtonCancelarBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBien"));
		
		//CERRAR		
		sMapKey = "CerrarBien";
		inputMap = this.jButtonCerrarBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBien"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBien";
		inputMap = this.jButtonGuardarCambiosTablaBien.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBien.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBien"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBien = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBien.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBien.setToolTipText("Nuevo Bien");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBien, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBien = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBien.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBien.setToolTipText("Sin Cerrar Ventana Bien");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBien, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBien = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBien.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBien.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBien, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBien = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBien.setText("Accion");
		this.jComboBoxTiposAccionesBien.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBien = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBien.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBien.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBien = new JLabelMe();
		
		this.jLabelAccionesBien.setText("Acciones");		
		this.jLabelAccionesBien.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBien.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBien.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBien();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBien();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBien=new JTabbedPane();
		this.jTabbedPaneRelacionesBien.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBien,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBien.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBien.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBien.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBien, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBien.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBien.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBien.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBien, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBien = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBien = new GridBagLayout();
		
		this.jPanelCamposBien.setLayout(gridaBagLayoutCamposBien);
		this.jPanelCamposOcultosBien.setLayout(gridaBagLayoutCamposOcultosBien);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBien.add(jLabelIdBien, this.gridBagConstraintsBien);



	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBien.add(jLabelidBien, this.gridBagConstraintsBien);


	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBien.add(jLabelid_empresaBien, this.gridBagConstraintsBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 2;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBien.add(jButtonid_empresaBienBusqueda, this.gridBagConstraintsBien);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 3;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBien.add(jButtonid_empresaBienUpdate, this.gridBagConstraintsBien);
	}

	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBien.add(jComboBoxid_empresaBien, this.gridBagConstraintsBien);


	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteBien.add(jLabelid_clienteBien, this.gridBagConstraintsBien);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBien = new GridBagConstraints();
	//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 2;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteBien.add(jButtonid_clienteBien, this.gridBagConstraintsBien);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 3;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteBien.add(jButtonid_clienteBienBusqueda, this.gridBagConstraintsBien);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 4;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteBien.add(jButtonid_clienteBienUpdate, this.gridBagConstraintsBien);
	}

	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteBien.add(jComboBoxid_clienteBien, this.gridBagConstraintsBien);


	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipobienBien.add(jLabelid_tipobienBien, this.gridBagConstraintsBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 2;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipobienBien.add(jButtonid_tipobienBienBusqueda, this.gridBagConstraintsBien);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 3;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipobienBien.add(jButtonid_tipobienBienUpdate, this.gridBagConstraintsBien);
	}

	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipobienBien.add(jComboBoxid_tipobienBien, this.gridBagConstraintsBien);


	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroBien.add(jLabelnumeroBien, this.gridBagConstraintsBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 2;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroBien.add(jButtonnumeroBienBusqueda, this.gridBagConstraintsBien);
	}

	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroBien.add(jTextFieldnumeroBien, this.gridBagConstraintsBien);


	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionBien.add(jLabeldescripcionBien, this.gridBagConstraintsBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 2;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionBien.add(jButtondescripcionBienBusqueda, this.gridBagConstraintsBien);
	}

	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionBien.add(jscrollPanedescripcionBien, this.gridBagConstraintsBien);


	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_avaluoBien.add(jLabelvalor_avaluoBien, this.gridBagConstraintsBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 2;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_avaluoBien.add(jButtonvalor_avaluoBienBusqueda, this.gridBagConstraintsBien);
	}

	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_avaluoBien.add(jTextFieldvalor_avaluoBien, this.gridBagConstraintsBien);


	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionBien.add(jLabeldireccionBien, this.gridBagConstraintsBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 2;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionBien.add(jButtondireccionBienBusqueda, this.gridBagConstraintsBien);
	}

	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionBien.add(jscrollPanedireccionBien, this.gridBagConstraintsBien);


	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 0;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_activoBien.add(jLabeles_activoBien, this.gridBagConstraintsBien);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBien = new GridBagConstraints();
		//this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = 2;
		this.gridBagConstraintsBien.ipadx = 0;
		this.gridBagConstraintsBien.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_activoBien.add(jButtones_activoBienBusqueda, this.gridBagConstraintsBien);
	}

	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBien.gridy = 0;
	this.gridBagConstraintsBien.gridx = 1;
	this.gridBagConstraintsBien.ipadx = 0;
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_activoBien.add(jCheckBoxes_activoBien, this.gridBagConstraintsBien);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBien.add(this.jPanelidBien, this.gridBagConstraintsBien);



	if(iXPanelCamposBien % 1==0) {
		iXPanelCamposBien=0;
		iYPanelCamposBien++;
	}
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBien.add(this.jPanelid_clienteBien, this.gridBagConstraintsBien);



	if(iXPanelCamposBien % 1==0) {
		iXPanelCamposBien=0;
		iYPanelCamposBien++;
	}
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBien.add(this.jPanelid_tipobienBien, this.gridBagConstraintsBien);



	if(iXPanelCamposBien % 1==0) {
		iXPanelCamposBien=0;
		iYPanelCamposBien++;
	}
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBien.add(this.jPanelnumeroBien, this.gridBagConstraintsBien);



	if(iXPanelCamposBien % 1==0) {
		iXPanelCamposBien=0;
		iYPanelCamposBien++;
	}
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBien.add(this.jPaneldescripcionBien, this.gridBagConstraintsBien);



	if(iXPanelCamposBien % 1==0) {
		iXPanelCamposBien=0;
		iYPanelCamposBien++;
	}
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBien.add(this.jPanelvalor_avaluoBien, this.gridBagConstraintsBien);



	if(iXPanelCamposBien % 1==0) {
		iXPanelCamposBien=0;
		iYPanelCamposBien++;
	}
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBien.add(this.jPaneldireccionBien, this.gridBagConstraintsBien);



	if(iXPanelCamposBien % 1==0) {
		iXPanelCamposBien=0;
		iYPanelCamposBien++;
	}
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBien.add(this.jPaneles_activoBien, this.gridBagConstraintsBien);



	if(iXPanelCamposBien % 1==0) {
		iXPanelCamposBien=0;
		iYPanelCamposBien++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBien = new GridBagConstraints();
	this.gridBagConstraintsBien.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBien.gridy = iYPanelCamposOcultosBien;
	this.gridBagConstraintsBien.gridx = iXPanelCamposOcultosBien++;
	this.gridBagConstraintsBien.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBien.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBien.add(this.jPanelid_empresaBien, this.gridBagConstraintsBien);



	if(iXPanelCamposOcultosBien % 1==0) {
		iXPanelCamposOcultosBien=0;
		iYPanelCamposOcultosBien++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBien= new GridBagLayout();
		this.jPanelAccionesBien.setLayout(gridaBagLayoutAccionesBien);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBien= new GridBagLayout();
		this.jPanelAccionesFormularioBien.setLayout(gridaBagLayoutAccionesFormularioBien);
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBien.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBien.add(this.jComboBoxTiposAccionesFormularioBien, this.gridBagConstraintsBien);

		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBien.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBien.add(this.jCheckBoxPostAccionNuevoBien, this.gridBagConstraintsBien);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bienSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBien.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBien.add(this.jCheckBoxPostAccionSinCerrarBien, this.gridBagConstraintsBien);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bienSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bienSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBien.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBien.add(this.jCheckBoxPostAccionSinMensajeBien, this.gridBagConstraintsBien);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx = iPosXAccion++;
			
		this.jPanelAccionesBien.add(this.jButtonModificarBien, this.gridBagConstraintsBien);							

		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBien.gridy = 0;
		this.gridBagConstraintsBien.gridx =iPosXAccion++;
			
		this.jPanelAccionesBien.add(this.jButtonEliminarBien, this.gridBagConstraintsBien);
		
			
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = 0;		
		this.gridBagConstraintsBien.gridx = iPosXAccion++;
		
		this.jPanelAccionesBien.add(this.jButtonActualizarBien, this.gridBagConstraintsBien);


		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = 0;		
		this.gridBagConstraintsBien.gridx = iPosXAccion++;
		
		this.jPanelAccionesBien.add(this.jButtonGuardarCambiosBien, this.gridBagConstraintsBien);	
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = 0;		
		this.gridBagConstraintsBien.gridx =iPosXAccion++;
		
		this.jPanelAccionesBien.add(this.jButtonCancelarBien, this.gridBagConstraintsBien);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBien = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBien);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bienSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBien = new GridBagConstraints();						
			this.gridBagConstraintsBien.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBien.gridx = 0;		
			//this.gridBagConstraintsBien.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBien.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBien.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBien.gridx =0;
		this.gridBagConstraintsBien.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBien.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBien, this.gridBagConstraintsBien);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BienJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBien = new BienBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Bien DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Bien DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bien Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BienModel bienModel=new BienModel(this);
			
			//SI USARA CLASE INTERNA
			//BienModel.BienFocusTraversalPolicy bienFocusTraversalPolicy = bienModel.new BienFocusTraversalPolicy(this);
			
			//bienFocusTraversalPolicy.setbienJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bienModel);
			
			
			this.jContentPaneDetalleBien = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBien = new GridBagLayout();	
			this.jContentPaneDetalleBien.setLayout(gridaBagLayoutDetalleBien);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBien = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBien = new GridBagConstraints();
				this.gridBagConstraintsBien.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBien.gridx = 0;
					
				
				this.jContentPaneDetalleBien.add(jTtoolBarDetalleBien, gridBagConstraintsBien);								
				
}
			
			this.jScrollPanelDatosEdicionBien=   new JScrollPane(jContentPaneDetalleBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBien.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBien.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBien.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBien=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBien.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBien.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBien.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBien.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBien.gridx = 0;
	        
			this.jContentPaneDetalleBien.add(jPanelCamposBien, gridBagConstraintsBien);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& bienSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.bienSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBien= new GridBagConstraints();
						this.gridBagConstraintsBien.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBien.gridx = 0;
						this.jContentPaneDetalleBien.add(this.jTabbedPaneRelacionesBien, this.gridBagConstraintsBien);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBien.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBien.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBien = new GridBagConstraints();
					this.gridBagConstraintsBien.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBien.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBien.gridx = 0;
					
				
					this.jContentPaneDetalleBien.add(jPanelCamposOcultosBien, gridBagConstraintsBien);
				
					this.jPanelCamposOcultosBien.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBien.gridx = 0;
	        this.gridBagConstraintsBien.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBien.add(this.jPanelAccionesFormularioBien, this.gridBagConstraintsBien);							
			
			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
	        this.gridBagConstraintsBien.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBien.gridx = 0;
	        
			
			this.jContentPaneDetalleBien.add(this.jPanelAccionesBien, this.gridBagConstraintsBien);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBien);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBien=   new JScrollPane(this.jPanelCamposBien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBien.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBien.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBien.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBien.gridx = 0;
			this.gridBagConstraintsBien.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBien.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBien.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBien, this.gridBagConstraintsBien);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBien.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBien, this.gridBagConstraintsBien);			
			
			this.gridBagConstraintsBien = new GridBagConstraints();
			this.gridBagConstraintsBien.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBien.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBien, this.gridBagConstraintsBien);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBien, this.gridBagConstraintsBien);
			
			
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBien, this.gridBagConstraintsBien);
		
			
		this.gridBagConstraintsBien = new GridBagConstraints();
		this.gridBagConstraintsBien.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBien.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBien, this.gridBagConstraintsBien);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBien;//jContentPane;
		
		return jScrollPanelDatosEdicionBien;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
