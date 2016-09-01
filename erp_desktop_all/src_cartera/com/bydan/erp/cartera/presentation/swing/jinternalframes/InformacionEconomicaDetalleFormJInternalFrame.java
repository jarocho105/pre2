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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.cartera.util.InformacionEconomicaConstantesFunciones;

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
public class InformacionEconomicaDetalleFormJInternalFrame extends InformacionEconomicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleInformacionEconomica;
	
	protected JMenuBar jmenuBarDetalleInformacionEconomica;
	
	protected JMenu jmenuDetalleInformacionEconomica;
	protected JMenu jmenuDetalleArchivoInformacionEconomica;
	protected JMenu jmenuDetalleAccionesInformacionEconomica;
	protected JMenu jmenuDetalleDatosInformacionEconomica;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInformacionEconomica;	
	protected GridBagConstraints gridBagConstraintsInformacionEconomica;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected InformacionEconomicaBeanSwingJInternalFrameAdditional jInternalFrameDetalleInformacionEconomica;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoVinculacionBeanSwingJInternalFrame tipovinculacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovinculacion="";
	
	public InformacionEconomicaSessionBean informacioneconomicaSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoVinculacionSessionBean tipovinculacionSessionBean;	
	
	public InformacionEconomicaLogic informacioneconomicaLogic;
	
	public JScrollPane jScrollPanelDatosInformacionEconomica;
	public JScrollPane jScrollPanelDatosEdicionInformacionEconomica;
	public JScrollPane jScrollPanelDatosGeneralInformacionEconomica;
	
	protected JPanel jPanelCamposInformacionEconomica;    
	protected JPanel jPanelCamposOcultosInformacionEconomica;    	
	protected JPanel jPanelAccionesInformacionEconomica;
	protected JPanel jPanelAccionesFormularioInformacionEconomica;
    
	
	
	protected Integer iXPanelCamposInformacionEconomica=0;
	protected Integer iYPanelCamposInformacionEconomica=0;
	
	protected Integer iXPanelCamposOcultosInformacionEconomica=0;
	protected Integer iYPanelCamposOcultosInformacionEconomica=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoInformacionEconomica;
	public JButton jButtonModificarInformacionEconomica;
	public JButton jButtonActualizarInformacionEconomica;
    public JButton jButtonEliminarInformacionEconomica;
	public JButton jButtonCancelarInformacionEconomica;
    public JButton jButtonGuardarCambiosInformacionEconomica;
	public JButton jButtonGuardarCambiosTablaInformacionEconomica;
	protected JButton jButtonCerrarInformacionEconomica;
	
	
	protected JButton jButtonProcesarInformacionInformacionEconomica;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoInformacionEconomica;
	protected JCheckBox jCheckBoxPostAccionSinCerrarInformacionEconomica;
	protected JCheckBox jCheckBoxPostAccionSinMensajeInformacionEconomica;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInformacionEconomica;
	protected JButton jButtonModificarToolBarInformacionEconomica;
	protected JButton jButtonActualizarToolBarInformacionEconomica;
    protected JButton jButtonEliminarToolBarInformacionEconomica;
	protected JButton jButtonCancelarToolBarInformacionEconomica;
    protected JButton jButtonGuardarCambiosToolBarInformacionEconomica;
	protected JButton jButtonGuardarCambiosTablaToolBarInformacionEconomica;
	protected JButton jButtonMostrarOcultarTablaToolBarInformacionEconomica;
	protected JButton jButtonCerrarToolBarInformacionEconomica;
	
	protected JButton jButtonProcesarInformacionToolBarInformacionEconomica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInformacionEconomica;
	protected JMenuItem jMenuItemModificarInformacionEconomica;
	protected JMenuItem jMenuItemActualizarInformacionEconomica;
    protected JMenuItem jMenuItemEliminarInformacionEconomica;
	protected JMenuItem jMenuItemCancelarInformacionEconomica;
    protected JMenuItem jMenuItemGuardarCambiosInformacionEconomica;
	protected JMenuItem jMenuItemGuardarCambiosTablaInformacionEconomica;
	protected JMenuItem jMenuItemCerrarInformacionEconomica;
	protected JMenuItem jMenuItemDetalleCerrarInformacionEconomica;
	protected JMenuItem jMenuItemDetalleMostarOcultarInformacionEconomica;
	
	protected JMenuItem jMenuItemProcesarInformacionInformacionEconomica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInformacionEconomica;
	protected JMenuItem jMenuItemMostrarOcultarInformacionEconomica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInformacionEconomica;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInformacionEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInformacionEconomica;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioInformacionEconomica;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidInformacionEconomica;
	public JLabel jLabelIdInformacionEconomica;
	public JLabel jLabelidInformacionEconomica;
	public JButton jButtonidInformacionEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoactualizacionInformacionEconomica;
	public JLabel jLabelcodigoactualizacionInformacionEconomica;
	public JTextField jTextFieldcodigoactualizacionInformacionEconomica;
	public JButton jButtoncodigoactualizacionInformacionEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelcodigodestinofinancieroInformacionEconomica;
	public JLabel jLabelcodigodestinofinancieroInformacionEconomica;
	public JTextField jTextFieldcodigodestinofinancieroInformacionEconomica;
	public JButton jButtoncodigodestinofinancieroInformacionEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelorigenrecursosInformacionEconomica;
	public JLabel jLabelorigenrecursosInformacionEconomica;
	public JTextField jTextFieldorigenrecursosInformacionEconomica;
	public JButton jButtonorigenrecursosInformacionEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelcuasavinculacionInformacionEconomica;
	public JLabel jLabelcuasavinculacionInformacionEconomica;
	public JTextField jTextFieldcuasavinculacionInformacionEconomica;
	public JButton jButtoncuasavinculacionInformacionEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelsectorizacionInformacionEconomica;
	public JLabel jLabelsectorizacionInformacionEconomica;
	public JTextField jTextFieldsectorizacionInformacionEconomica;
	public JButton jButtonsectorizacionInformacionEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelesactivoInformacionEconomica;
	public JLabel jLabelesactivoInformacionEconomica;
	public JCheckBox jCheckBoxesactivoInformacionEconomica;
	public JButton jButtonesactivoInformacionEconomicaBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteInformacionEconomica;
	public JLabel jLabelidclienteInformacionEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteInformacionEconomica;
	public JButton jButtonidclienteInformacionEconomica= new JButtonMe();
	public JButton jButtonidclienteInformacionEconomicaUpdate= new JButtonMe();
	public JButton jButtonidclienteInformacionEconomicaBusqueda= new JButtonMe();

	public JPanel jPanelidvalorclientevinculacionInformacionEconomica;
	public JLabel jLabelidvalorclientevinculacionInformacionEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientevinculacionInformacionEconomica;
	public JButton jButtonidvalorclientevinculacionInformacionEconomica= new JButtonMe();
	public JButton jButtonidvalorclientevinculacionInformacionEconomicaUpdate= new JButtonMe();
	public JButton jButtonidvalorclientevinculacionInformacionEconomicaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesInformacionEconomica;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public InformacionEconomicaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposInformacionEconomica=new JPanel();
				this.jPanelAccionesFormularioInformacionEconomica=new JPanel();
				this.jmenuBarDetalleInformacionEconomica=new JMenuBar();
				this.jTtoolBarDetalleInformacionEconomica=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionEconomicaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public InformacionEconomicaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionEconomicaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionEconomicaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionEconomicaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("InformacionEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarInformacionEconomica() {
		return this.jButtonActualizarToolBarInformacionEconomica;
	}
	
	public JButton getjButtonEliminarToolBarInformacionEconomica() {
		return this.jButtonEliminarToolBarInformacionEconomica;
	}
	
	public JButton getjButtonCancelarToolBarInformacionEconomica() {
		return this.jButtonCancelarToolBarInformacionEconomica;
	}		
	
	public JButton getjButtonProcesarInformacionInformacionEconomica() {
		return this.jButtonProcesarInformacionInformacionEconomica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInformacionEconomica)	{
		this.jButtonProcesarInformacionInformacionEconomica = jButtonProcesarInformacionInformacionEconomica;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInformacionEconomica() {
		return this.jComboBoxTiposAccionesInformacionEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInformacionEconomica(
			JComboBox jComboBoxTiposRelacionesInformacionEconomica) {
		this.jComboBoxTiposRelacionesInformacionEconomica = jComboBoxTiposRelacionesInformacionEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInformacionEconomica(
			JComboBox jComboBoxTiposAccionesInformacionEconomica) {
		this.jComboBoxTiposAccionesInformacionEconomica = jComboBoxTiposAccionesInformacionEconomica;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioInformacionEconomica() {
		return this.jComboBoxTiposAccionesFormularioInformacionEconomica;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioInformacionEconomica(
			JComboBox jComboBoxTiposAccionesFormularioInformacionEconomica) {
		this.jComboBoxTiposAccionesFormularioInformacionEconomica = jComboBoxTiposAccionesFormularioInformacionEconomica;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		
		this.informacioneconomicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacioneconomicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.informacioneconomicaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InformacionEconomicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Informacion Economica MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
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
	
		InformacionEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleInformacionEconomica= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarInformacionEconomica=new JButtonMe();
				this.jButtonModificarToolBarInformacionEconomica=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarInformacionEconomica,this.jTtoolBarDetalleInformacionEconomica,
							"actualizar","actualizar","Actualizar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarInformacionEconomica,this.jTtoolBarDetalleInformacionEconomica,
							"eliminar","eliminar","Eliminar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarInformacionEconomica,this.jTtoolBarDetalleInformacionEconomica,
							"cancelar","cancelar","Cancelar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarInformacionEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarInformacionEconomica,this.jTtoolBarDetalleInformacionEconomica,
							"guardarcambios","guardarcambios","Guardar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleInformacionEconomica=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleInformacionEconomica=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoInformacionEconomica=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesInformacionEconomica=new JMenuMe("Acciones");
		this.jmenuDetalleDatosInformacionEconomica=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInformacionEconomica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInformacionEconomica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInformacionEconomica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarInformacionEconomica= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarInformacionEconomica.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarInformacionEconomica,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarInformacionEconomica= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarInformacionEconomica.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarInformacionEconomica,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarInformacionEconomica= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarInformacionEconomica.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarInformacionEconomica,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarInformacionEconomica= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarInformacionEconomica.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarInformacionEconomica,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosInformacionEconomica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInformacionEconomica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInformacionEconomica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInformacionEconomica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInformacionEconomica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInformacionEconomica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarInformacionEconomica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarInformacionEconomica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarInformacionEconomica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInformacionEconomica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInformacionEconomica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInformacionEconomica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInformacionEconomica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInformacionEconomica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInformacionEconomica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoInformacionEconomica.add(this.jMenuItemDetalleCerrarInformacionEconomica);
		
		this.jmenuDetalleAccionesInformacionEconomica.add(this.jMenuItemActualizarInformacionEconomica);
		this.jmenuDetalleAccionesInformacionEconomica.add(this.jMenuItemEliminarInformacionEconomica);
		this.jmenuDetalleAccionesInformacionEconomica.add(this.jMenuItemCancelarInformacionEconomica);		
		
		//this.jmenuDetalleDatosInformacionEconomica.add(this.jMenuItemDetalleAbrirOrderByInformacionEconomica);				
		this.jmenuDetalleDatosInformacionEconomica.add(this.jMenuItemDetalleMostarOcultarInformacionEconomica);				
				
		//this.jmenuDetalleAccionesInformacionEconomica.add(this.jMenuItemGuardarCambiosInformacionEconomica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleInformacionEconomica.add(this.jmenuDetalleArchivoInformacionEconomica);		
		this.jmenuBarDetalleInformacionEconomica.add(this.jmenuDetalleAccionesInformacionEconomica);		
		this.jmenuBarDetalleInformacionEconomica.add(this.jmenuDetalleDatosInformacionEconomica);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleInformacionEconomica);				
	}
	
	
	public void inicializarElementosCamposInformacionEconomica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdInformacionEconomica = new JLabelMe();
		jLabelIdInformacionEconomica.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidInformacionEconomica = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutInformacionEconomica= new GridBagLayout();

		this.jPanelidInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);

		jLabelidInformacionEconomica = new JLabel();
		jLabelidInformacionEconomica.setText("Id");

		jLabelidInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoactualizacionInformacionEconomica = new JLabelMe();
		this.jLabelcodigoactualizacionInformacionEconomica.setText(""+InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION+" : *");
		this.jLabelcodigoactualizacionInformacionEconomica.setToolTipText("Codigo Actualizacion");
		this.jLabelcodigoactualizacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigoactualizacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigoactualizacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoactualizacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoactualizacionInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoactualizacionInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION);
		this.gridaBagLayoutInformacionEconomica = new GridBagLayout();
		this.jPanelcodigoactualizacionInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);


		jTextFieldcodigoactualizacionInformacionEconomica= new JTextFieldMe();

		jTextFieldcodigoactualizacionInformacionEconomica.setEnabled(false);
		jTextFieldcodigoactualizacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoactualizacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoactualizacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoactualizacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoactualizacionInformacionEconomicaBusqueda= new JButtonMe();
		this.jButtoncodigoactualizacionInformacionEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoactualizacionInformacionEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoactualizacionInformacionEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoactualizacionInformacionEconomicaBusqueda.setText("U");
		this.jButtoncodigoactualizacionInformacionEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoactualizacionInformacionEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoactualizacionInformacionEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoactualizacionInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoactualizacionInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoactualizacionInformacionEconomicaBusqueda"));

		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoactualizacionInformacionEconomicaBusqueda.setVisible(false);		}


					
		this.jLabelcodigodestinofinancieroInformacionEconomica = new JLabelMe();
		this.jLabelcodigodestinofinancieroInformacionEconomica.setText(""+InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO+" : *");
		this.jLabelcodigodestinofinancieroInformacionEconomica.setToolTipText("Codigo Destino Financiero");
		this.jLabelcodigodestinofinancieroInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigodestinofinancieroInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigodestinofinancieroInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigodestinofinancieroInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigodestinofinancieroInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigodestinofinancieroInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO);
		this.gridaBagLayoutInformacionEconomica = new GridBagLayout();
		this.jPanelcodigodestinofinancieroInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);


		jTextFieldcodigodestinofinancieroInformacionEconomica= new JTextFieldMe();

		jTextFieldcodigodestinofinancieroInformacionEconomica.setEnabled(false);
		jTextFieldcodigodestinofinancieroInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigodestinofinancieroInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigodestinofinancieroInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigodestinofinancieroInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda= new JButtonMe();
		this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.setText("U");
		this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigodestinofinancieroInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigodestinofinancieroInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigodestinofinancieroInformacionEconomicaBusqueda"));

		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.setVisible(false);		}


					
		this.jLabelorigenrecursosInformacionEconomica = new JLabelMe();
		this.jLabelorigenrecursosInformacionEconomica.setText(""+InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS+" : *");
		this.jLabelorigenrecursosInformacionEconomica.setToolTipText("Origen Recursos");
		this.jLabelorigenrecursosInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelorigenrecursosInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelorigenrecursosInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelorigenrecursosInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelorigenrecursosInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelorigenrecursosInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS);
		this.gridaBagLayoutInformacionEconomica = new GridBagLayout();
		this.jPanelorigenrecursosInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);


		jTextFieldorigenrecursosInformacionEconomica= new JTextFieldMe();

		jTextFieldorigenrecursosInformacionEconomica.setEnabled(false);
		jTextFieldorigenrecursosInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorigenrecursosInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorigenrecursosInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldorigenrecursosInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonorigenrecursosInformacionEconomicaBusqueda= new JButtonMe();
		this.jButtonorigenrecursosInformacionEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorigenrecursosInformacionEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorigenrecursosInformacionEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonorigenrecursosInformacionEconomicaBusqueda.setText("U");
		this.jButtonorigenrecursosInformacionEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonorigenrecursosInformacionEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonorigenrecursosInformacionEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldorigenrecursosInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldorigenrecursosInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"origenrecursosInformacionEconomicaBusqueda"));

		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonorigenrecursosInformacionEconomicaBusqueda.setVisible(false);		}


					
		this.jLabelcuasavinculacionInformacionEconomica = new JLabelMe();
		this.jLabelcuasavinculacionInformacionEconomica.setText(""+InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION+" : *");
		this.jLabelcuasavinculacionInformacionEconomica.setToolTipText("Cuasa Vinculacion");
		this.jLabelcuasavinculacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcuasavinculacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcuasavinculacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcuasavinculacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcuasavinculacionInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcuasavinculacionInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION);
		this.gridaBagLayoutInformacionEconomica = new GridBagLayout();
		this.jPanelcuasavinculacionInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);


		jTextFieldcuasavinculacionInformacionEconomica= new JTextFieldMe();

		jTextFieldcuasavinculacionInformacionEconomica.setEnabled(false);
		jTextFieldcuasavinculacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuasavinculacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuasavinculacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcuasavinculacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncuasavinculacionInformacionEconomicaBusqueda= new JButtonMe();
		this.jButtoncuasavinculacionInformacionEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuasavinculacionInformacionEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuasavinculacionInformacionEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncuasavinculacionInformacionEconomicaBusqueda.setText("U");
		this.jButtoncuasavinculacionInformacionEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncuasavinculacionInformacionEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncuasavinculacionInformacionEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcuasavinculacionInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcuasavinculacionInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cuasavinculacionInformacionEconomicaBusqueda"));

		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncuasavinculacionInformacionEconomicaBusqueda.setVisible(false);		}


					
		this.jLabelsectorizacionInformacionEconomica = new JLabelMe();
		this.jLabelsectorizacionInformacionEconomica.setText(""+InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION+" : *");
		this.jLabelsectorizacionInformacionEconomica.setToolTipText("Sectorizacion");
		this.jLabelsectorizacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsectorizacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsectorizacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsectorizacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsectorizacionInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsectorizacionInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION);
		this.gridaBagLayoutInformacionEconomica = new GridBagLayout();
		this.jPanelsectorizacionInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);


		jTextFieldsectorizacionInformacionEconomica= new JTextFieldMe();

		jTextFieldsectorizacionInformacionEconomica.setEnabled(false);
		jTextFieldsectorizacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsectorizacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsectorizacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsectorizacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsectorizacionInformacionEconomicaBusqueda= new JButtonMe();
		this.jButtonsectorizacionInformacionEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsectorizacionInformacionEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsectorizacionInformacionEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsectorizacionInformacionEconomicaBusqueda.setText("U");
		this.jButtonsectorizacionInformacionEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsectorizacionInformacionEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsectorizacionInformacionEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsectorizacionInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsectorizacionInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sectorizacionInformacionEconomicaBusqueda"));

		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsectorizacionInformacionEconomicaBusqueda.setVisible(false);		}


					
		this.jLabelesactivoInformacionEconomica = new JLabelMe();
		this.jLabelesactivoInformacionEconomica.setText(""+InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoInformacionEconomica.setToolTipText("Es Activo");
		this.jLabelesactivoInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutInformacionEconomica = new GridBagLayout();
		this.jPanelesactivoInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);


		jCheckBoxesactivoInformacionEconomica= new JCheckBoxMe();
		jCheckBoxesactivoInformacionEconomica.setEnabled(false);

		jCheckBoxesactivoInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoInformacionEconomicaBusqueda= new JButtonMe();
		this.jButtonesactivoInformacionEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoInformacionEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoInformacionEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoInformacionEconomicaBusqueda.setText("U");
		this.jButtonesactivoInformacionEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoInformacionEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoInformacionEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoInformacionEconomicaBusqueda"));

		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoInformacionEconomicaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysInformacionEconomica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelidclienteInformacionEconomica = new JLabelMe();
		this.jLabelidclienteInformacionEconomica.setText(""+InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelidclienteInformacionEconomica.setToolTipText("Cliente");
		this.jLabelidclienteInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidclienteInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidclienteInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidclienteInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidclienteInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutInformacionEconomica = new GridBagLayout();
		this.jPanelidclienteInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);


		jComboBoxidclienteInformacionEconomica= new JComboBoxMe();
		jComboBoxidclienteInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidclienteInformacionEconomica= new JButtonMe();
		this.jButtonidclienteInformacionEconomica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionEconomica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionEconomica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidclienteInformacionEconomica.setText("Buscar");
		this.jButtonidclienteInformacionEconomica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidclienteInformacionEconomica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionEconomica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidclienteInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionEconomica"));

		this.jButtonidclienteInformacionEconomicaBusqueda= new JButtonMe();
		this.jButtonidclienteInformacionEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteInformacionEconomicaBusqueda.setText("U");
		this.jButtonidclienteInformacionEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidclienteInformacionEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidclienteInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionEconomicaBusqueda"));

		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidclienteInformacionEconomicaBusqueda.setVisible(false);		}

		this.jButtonidclienteInformacionEconomicaUpdate= new JButtonMe();
		this.jButtonidclienteInformacionEconomicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionEconomicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidclienteInformacionEconomicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidclienteInformacionEconomicaUpdate.setText("U");
		this.jButtonidclienteInformacionEconomicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidclienteInformacionEconomicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidclienteInformacionEconomicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidclienteInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidclienteInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idclienteInformacionEconomicaUpdate"));



					
		this.jLabelidvalorclientevinculacionInformacionEconomica = new JLabelMe();
		this.jLabelidvalorclientevinculacionInformacionEconomica.setText(""+InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION+" : *");
		this.jLabelidvalorclientevinculacionInformacionEconomica.setToolTipText("Tipo Vinculacion");
		this.jLabelidvalorclientevinculacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientevinculacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvalorclientevinculacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientevinculacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvalorclientevinculacionInformacionEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvalorclientevinculacionInformacionEconomica.setToolTipText(InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION);
		this.gridaBagLayoutInformacionEconomica = new GridBagLayout();
		this.jPanelidvalorclientevinculacionInformacionEconomica.setLayout(this.gridaBagLayoutInformacionEconomica);


		jComboBoxidvalorclientevinculacionInformacionEconomica= new JComboBoxMe();
		jComboBoxidvalorclientevinculacionInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientevinculacionInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientevinculacionInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientevinculacionInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvalorclientevinculacionInformacionEconomica= new JButtonMe();
		this.jButtonidvalorclientevinculacionInformacionEconomica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientevinculacionInformacionEconomica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientevinculacionInformacionEconomica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvalorclientevinculacionInformacionEconomica.setText("Buscar");
		this.jButtonidvalorclientevinculacionInformacionEconomica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvalorclientevinculacionInformacionEconomica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientevinculacionInformacionEconomica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvalorclientevinculacionInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientevinculacionInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientevinculacionInformacionEconomica"));

		this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda= new JButtonMe();
		this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.setText("U");
		this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvalorclientevinculacionInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientevinculacionInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientevinculacionInformacionEconomicaBusqueda"));

		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.setVisible(false);		}

		this.jButtonidvalorclientevinculacionInformacionEconomicaUpdate= new JButtonMe();
		this.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.setText("U");
		this.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvalorclientevinculacionInformacionEconomicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvalorclientevinculacionInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvalorclientevinculacionInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvalorclientevinculacionInformacionEconomicaUpdate"));



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
		//this.jInternalFrameDetalleInformacionEconomica = new InformacionEconomicaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Informacion Economica DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInformacionEconomica= new GridBagLayout();
		

		
		String sToolTipInformacionEconomica="";
		sToolTipInformacionEconomica=InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInformacionEconomica+="(Cartera.InformacionEconomica)";
		}
		
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipInformacionEconomica+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoInformacionEconomica = new JButtonMe();
		this.jButtonModificarInformacionEconomica = new JButtonMe();
        this.jButtonActualizarInformacionEconomica = new JButtonMe();
        this.jButtonEliminarInformacionEconomica = new JButtonMe();
        this.jButtonCancelarInformacionEconomica = new JButtonMe();
        this.jButtonGuardarCambiosInformacionEconomica = new JButtonMe();
		this.jButtonGuardarCambiosTablaInformacionEconomica = new JButtonMe();
		this.jButtonCerrarInformacionEconomica = new JButtonMe();
		
		this.jScrollPanelDatosInformacionEconomica = new JScrollPane();   
        this.jScrollPanelDatosEdicionInformacionEconomica = new JScrollPane();
		this.jScrollPanelDatosGeneralInformacionEconomica = new JScrollPane();
				
		
		
		this.jPanelCamposInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Informacion Economica";
		
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Economicas" + this.sPath));
		} else {
			this.jScrollPanelDatosInformacionEconomica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposInformacionEconomica.setName("jPanelCamposInformacionEconomica"); 

		this.jPanelCamposOcultosInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosInformacionEconomica.setName("jPanelCamposOcultosInformacionEconomica"); 

        this.jPanelAccionesInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInformacionEconomica.setToolTipText("Acciones");
        this.jPanelAccionesInformacionEconomica.setName("Acciones"); 

		this.jPanelAccionesFormularioInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioInformacionEconomica.setToolTipText("Acciones");
        this.jPanelAccionesFormularioInformacionEconomica.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoInformacionEconomica.setText("Nuevo");
		this.jButtonModificarInformacionEconomica.setText("Editar");
        this.jButtonActualizarInformacionEconomica.setText("Actualizar");
        this.jButtonEliminarInformacionEconomica.setText("Eliminar");
        this.jButtonCancelarInformacionEconomica.setText("Cancelar");
        this.jButtonGuardarCambiosInformacionEconomica.setText("Guardar");
		this.jButtonGuardarCambiosTablaInformacionEconomica.setText("Guardar");
		this.jButtonCerrarInformacionEconomica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInformacionEconomica,"nuevo_button","Nuevo",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarInformacionEconomica,"modificar_button","Editar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarInformacionEconomica,"actualizar_button","Actualizar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarInformacionEconomica,"eliminar_button","Eliminar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarInformacionEconomica,"cancelar_button","Cancelar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosInformacionEconomica,"guardarcambios_button","Guardar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInformacionEconomica,"guardarcambiostabla_button","Guardar",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInformacionEconomica,"cerrar_button","Salir",this.informacioneconomicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoInformacionEconomica.setToolTipText("Nuevo"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarInformacionEconomica.setToolTipText("Editar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarInformacionEconomica.setToolTipText("Actualizar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarInformacionEconomica.setToolTipText("Eliminar)"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarInformacionEconomica.setToolTipText("Cancelar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosInformacionEconomica.setToolTipText("Guardar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaInformacionEconomica.setToolTipText("Guardar"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInformacionEconomica.setToolTipText("Salir"+" "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInformacionEconomica";
		inputMap = this.jButtonNuevoInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInformacionEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInformacionEconomica"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarInformacionEconomica";
		inputMap = this.jButtonActualizarInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarInformacionEconomica"));
		
		//ELIMINAR
		sMapKey = "EliminarInformacionEconomica";
		inputMap = this.jButtonEliminarInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarInformacionEconomica"));
		
		//CANCELAR	
		sMapKey = "CancelarInformacionEconomica";
		inputMap = this.jButtonCancelarInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarInformacionEconomica"));
		
		//CERRAR		
		sMapKey = "CerrarInformacionEconomica";
		inputMap = this.jButtonCerrarInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInformacionEconomica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInformacionEconomica";
		inputMap = this.jButtonGuardarCambiosTablaInformacionEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInformacionEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInformacionEconomica"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoInformacionEconomica = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoInformacionEconomica.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoInformacionEconomica.setToolTipText("Nuevo InformacionEconomica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarInformacionEconomica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarInformacionEconomica.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarInformacionEconomica.setToolTipText("Sin Cerrar Ventana InformacionEconomica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeInformacionEconomica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeInformacionEconomica.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeInformacionEconomica.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInformacionEconomica.setText("Accion");
		this.jComboBoxTiposAccionesInformacionEconomica.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioInformacionEconomica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioInformacionEconomica.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioInformacionEconomica.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesInformacionEconomica = new JLabelMe();
		
		this.jLabelAccionesInformacionEconomica.setText("Acciones");		
		this.jLabelAccionesInformacionEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposInformacionEconomica();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysInformacionEconomica();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesInformacionEconomica=new JTabbedPane();
		this.jTabbedPaneRelacionesInformacionEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesInformacionEconomica,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesInformacionEconomica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionEconomica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionEconomica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInformacionEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioInformacionEconomica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInformacionEconomica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioInformacionEconomica.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioInformacionEconomica, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposInformacionEconomica = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosInformacionEconomica = new GridBagLayout();
		
		this.jPanelCamposInformacionEconomica.setLayout(gridaBagLayoutCamposInformacionEconomica);
		this.jPanelCamposOcultosInformacionEconomica.setLayout(gridaBagLayoutCamposOcultosInformacionEconomica);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidInformacionEconomica.add(jLabelIdInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidInformacionEconomica.add(jLabelidInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidclienteInformacionEconomica.add(jLabelidclienteInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 2;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
	this.jPanelidclienteInformacionEconomica.add(jButtonidclienteInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 3;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteInformacionEconomica.add(jButtonidclienteInformacionEconomicaBusqueda, this.gridBagConstraintsInformacionEconomica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 4;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelidclienteInformacionEconomica.add(jButtonidclienteInformacionEconomicaUpdate, this.gridBagConstraintsInformacionEconomica);
	}

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidclienteInformacionEconomica.add(jComboBoxidclienteInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvalorclientevinculacionInformacionEconomica.add(jLabelidvalorclientevinculacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 2;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientevinculacionInformacionEconomica.add(jButtonidvalorclientevinculacionInformacionEconomicaBusqueda, this.gridBagConstraintsInformacionEconomica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 3;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvalorclientevinculacionInformacionEconomica.add(jButtonidvalorclientevinculacionInformacionEconomicaUpdate, this.gridBagConstraintsInformacionEconomica);
	}

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvalorclientevinculacionInformacionEconomica.add(jComboBoxidvalorclientevinculacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoactualizacionInformacionEconomica.add(jLabelcodigoactualizacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 2;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoactualizacionInformacionEconomica.add(jButtoncodigoactualizacionInformacionEconomicaBusqueda, this.gridBagConstraintsInformacionEconomica);
	}

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoactualizacionInformacionEconomica.add(jTextFieldcodigoactualizacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigodestinofinancieroInformacionEconomica.add(jLabelcodigodestinofinancieroInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 2;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigodestinofinancieroInformacionEconomica.add(jButtoncodigodestinofinancieroInformacionEconomicaBusqueda, this.gridBagConstraintsInformacionEconomica);
	}

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigodestinofinancieroInformacionEconomica.add(jTextFieldcodigodestinofinancieroInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelorigenrecursosInformacionEconomica.add(jLabelorigenrecursosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 2;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelorigenrecursosInformacionEconomica.add(jButtonorigenrecursosInformacionEconomicaBusqueda, this.gridBagConstraintsInformacionEconomica);
	}

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelorigenrecursosInformacionEconomica.add(jTextFieldorigenrecursosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcuasavinculacionInformacionEconomica.add(jLabelcuasavinculacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 2;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelcuasavinculacionInformacionEconomica.add(jButtoncuasavinculacionInformacionEconomicaBusqueda, this.gridBagConstraintsInformacionEconomica);
	}

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcuasavinculacionInformacionEconomica.add(jTextFieldcuasavinculacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsectorizacionInformacionEconomica.add(jLabelsectorizacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 2;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelsectorizacionInformacionEconomica.add(jButtonsectorizacionInformacionEconomicaBusqueda, this.gridBagConstraintsInformacionEconomica);
	}

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsectorizacionInformacionEconomica.add(jTextFieldsectorizacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 0;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoInformacionEconomica.add(jLabelesactivoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		//this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = 2;
		this.gridBagConstraintsInformacionEconomica.ipadx = 0;
		this.gridBagConstraintsInformacionEconomica.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoInformacionEconomica.add(jButtonesactivoInformacionEconomicaBusqueda, this.gridBagConstraintsInformacionEconomica);
	}

	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsInformacionEconomica.gridy = 0;
	this.gridBagConstraintsInformacionEconomica.gridx = 1;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoInformacionEconomica.add(jCheckBoxesactivoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelidInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelidclienteInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelidvalorclientevinculacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelcodigoactualizacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelcodigodestinofinancieroInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelorigenrecursosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelcuasavinculacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelsectorizacionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
	this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsInformacionEconomica.gridy = iYPanelCamposInformacionEconomica;
	this.gridBagConstraintsInformacionEconomica.gridx = iXPanelCamposInformacionEconomica++;
	this.gridBagConstraintsInformacionEconomica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsInformacionEconomica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInformacionEconomica.add(this.jPanelesactivoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);



	if(iXPanelCamposInformacionEconomica % 1==0) {
		iXPanelCamposInformacionEconomica=0;
		iYPanelCamposInformacionEconomica++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesInformacionEconomica= new GridBagLayout();
		this.jPanelAccionesInformacionEconomica.setLayout(gridaBagLayoutAccionesInformacionEconomica);
		
		GridBagLayout gridaBagLayoutAccionesFormularioInformacionEconomica= new GridBagLayout();
		this.jPanelAccionesFormularioInformacionEconomica.setLayout(gridaBagLayoutAccionesFormularioInformacionEconomica);
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsInformacionEconomica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioInformacionEconomica.add(this.jComboBoxTiposAccionesFormularioInformacionEconomica, this.gridBagConstraintsInformacionEconomica);

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsInformacionEconomica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioInformacionEconomica.add(this.jCheckBoxPostAccionNuevoInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioInformacionEconomica.add(this.jCheckBoxPostAccionSinCerrarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsInformacionEconomica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioInformacionEconomica.add(this.jCheckBoxPostAccionSinMensajeInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccion++;
			
		this.jPanelAccionesInformacionEconomica.add(this.jButtonModificarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);							

		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionEconomica.gridy = 0;
		this.gridBagConstraintsInformacionEconomica.gridx =iPosXAccion++;
			
		this.jPanelAccionesInformacionEconomica.add(this.jButtonEliminarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
			
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = 0;		
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccion++;
		
		this.jPanelAccionesInformacionEconomica.add(this.jButtonActualizarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);


		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = 0;		
		this.gridBagConstraintsInformacionEconomica.gridx = iPosXAccion++;
		
		this.jPanelAccionesInformacionEconomica.add(this.jButtonGuardarCambiosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);	
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = 0;		
		this.gridBagConstraintsInformacionEconomica.gridx =iPosXAccion++;
		
		this.jPanelAccionesInformacionEconomica.add(this.jButtonCancelarInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInformacionEconomica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInformacionEconomica);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();						
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionEconomica.gridx = 0;		
			//this.gridBagConstraintsInformacionEconomica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInformacionEconomica.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInformacionEconomica.gridx =0;
		this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInformacionEconomica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleInformacionEconomica = new InformacionEconomicaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Informacion Economica DATOS");
			
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
			
	        //this.setTitle("[FOR] - Informacion Economica DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Informacion Economica Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			InformacionEconomicaModel informacioneconomicaModel=new InformacionEconomicaModel(this);
			
			//SI USARA CLASE INTERNA
			//InformacionEconomicaModel.InformacionEconomicaFocusTraversalPolicy informacioneconomicaFocusTraversalPolicy = informacioneconomicaModel.new InformacionEconomicaFocusTraversalPolicy(this);
			
			//informacioneconomicaFocusTraversalPolicy.setinformacioneconomicaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(informacioneconomicaModel);
			
			
			this.jContentPaneDetalleInformacionEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleInformacionEconomica = new GridBagLayout();	
			this.jContentPaneDetalleInformacionEconomica.setLayout(gridaBagLayoutDetalleInformacionEconomica);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInformacionEconomica = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
				this.gridBagConstraintsInformacionEconomica.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsInformacionEconomica.gridx = 0;
					
				
				this.jContentPaneDetalleInformacionEconomica.add(jTtoolBarDetalleInformacionEconomica, gridBagConstraintsInformacionEconomica);								
				
}
			
			this.jScrollPanelDatosEdicionInformacionEconomica=   new JScrollPane(jContentPaneDetalleInformacionEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInformacionEconomica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionEconomica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionEconomica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralInformacionEconomica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInformacionEconomica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionEconomica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionEconomica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			
			
	        this.gridBagConstraintsInformacionEconomica.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsInformacionEconomica.gridx = 0;
	        
			this.jContentPaneDetalleInformacionEconomica.add(jPanelCamposInformacionEconomica, gridBagConstraintsInformacionEconomica);
			
			
			
			
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
						&& informacioneconomicaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsInformacionEconomica= new GridBagConstraints();
						this.gridBagConstraintsInformacionEconomica.gridy = iGridyRelaciones++;
						this.gridBagConstraintsInformacionEconomica.gridx = 0;
						this.jContentPaneDetalleInformacionEconomica.add(this.jTabbedPaneRelacionesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesInformacionEconomica.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosInformacionEconomica.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
					this.gridBagConstraintsInformacionEconomica.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsInformacionEconomica.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsInformacionEconomica.gridx = 0;
					
				
					this.jContentPaneDetalleInformacionEconomica.add(jPanelCamposOcultosInformacionEconomica, gridBagConstraintsInformacionEconomica);
				
					this.jPanelCamposOcultosInformacionEconomica.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsInformacionEconomica.gridx = 0;
	        this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleInformacionEconomica.add(this.jPanelAccionesFormularioInformacionEconomica, this.gridBagConstraintsInformacionEconomica);							
			
			
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
	        this.gridBagConstraintsInformacionEconomica.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsInformacionEconomica.gridx = 0;
	        
			
			this.jContentPaneDetalleInformacionEconomica.add(this.jPanelAccionesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionInformacionEconomica);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionInformacionEconomica=   new JScrollPane(this.jPanelCamposInformacionEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionInformacionEconomica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionEconomica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionInformacionEconomica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsInformacionEconomica.gridx = 0;
			this.gridBagConstraintsInformacionEconomica.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsInformacionEconomica.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsInformacionEconomica.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInformacionEconomica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioInformacionEconomica, this.gridBagConstraintsInformacionEconomica);			
			
			this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
			this.gridBagConstraintsInformacionEconomica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsInformacionEconomica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
			
			
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		
			
		this.gridBagConstraintsInformacionEconomica = new GridBagConstraints();
		this.gridBagConstraintsInformacionEconomica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInformacionEconomica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInformacionEconomica, this.gridBagConstraintsInformacionEconomica);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralInformacionEconomica;//jContentPane;
		
		return jScrollPanelDatosEdicionInformacionEconomica;
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
