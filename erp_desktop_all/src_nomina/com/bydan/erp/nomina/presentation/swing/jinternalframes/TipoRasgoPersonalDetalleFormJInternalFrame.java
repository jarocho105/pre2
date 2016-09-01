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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoRasgoPersonalConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoRasgoPersonalDetalleFormJInternalFrame extends TipoRasgoPersonalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRasgoPersonal;
	
	protected JMenuBar jmenuBarDetalleTipoRasgoPersonal;
	
	protected JMenu jmenuDetalleTipoRasgoPersonal;
	protected JMenu jmenuDetalleArchivoTipoRasgoPersonal;
	protected JMenu jmenuDetalleAccionesTipoRasgoPersonal;
	protected JMenu jmenuDetalleDatosTipoRasgoPersonal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRasgoPersonal;	
	protected GridBagConstraints gridBagConstraintsTipoRasgoPersonal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRasgoPersonalBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRasgoPersonal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoRasgoPersonalSessionBean tiporasgopersonalSessionBean;
	
	

	public RasgoPersonalBeanSwingJInternalFrame rasgopersonalBeanSwingJInternalFrame=null;
	public RasgoPersonalBeanSwingJInternalFrame rasgopersonalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRasgoPersonal=false;
	public RasgoPersonalSessionBean rasgopersonalSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoRasgoPersonalLogic tiporasgopersonalLogic;
	
	public JScrollPane jScrollPanelDatosTipoRasgoPersonal;
	public JScrollPane jScrollPanelDatosEdicionTipoRasgoPersonal;
	public JScrollPane jScrollPanelDatosGeneralTipoRasgoPersonal;
	
	protected JPanel jPanelCamposTipoRasgoPersonal;    
	protected JPanel jPanelCamposOcultosTipoRasgoPersonal;    	
	protected JPanel jPanelAccionesTipoRasgoPersonal;
	protected JPanel jPanelAccionesFormularioTipoRasgoPersonal;
    
	
	
	protected Integer iXPanelCamposTipoRasgoPersonal=0;
	protected Integer iYPanelCamposTipoRasgoPersonal=0;
	
	protected Integer iXPanelCamposOcultosTipoRasgoPersonal=0;
	protected Integer iYPanelCamposOcultosTipoRasgoPersonal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRasgoPersonal;
	public JButton jButtonModificarTipoRasgoPersonal;
	public JButton jButtonActualizarTipoRasgoPersonal;
    public JButton jButtonEliminarTipoRasgoPersonal;
	public JButton jButtonCancelarTipoRasgoPersonal;
    public JButton jButtonGuardarCambiosTipoRasgoPersonal;
	public JButton jButtonGuardarCambiosTablaTipoRasgoPersonal;
	protected JButton jButtonCerrarTipoRasgoPersonal;
	
	
	protected JButton jButtonProcesarInformacionTipoRasgoPersonal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRasgoPersonal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRasgoPersonal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRasgoPersonal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRasgoPersonal;
	protected JButton jButtonModificarToolBarTipoRasgoPersonal;
	protected JButton jButtonActualizarToolBarTipoRasgoPersonal;
    protected JButton jButtonEliminarToolBarTipoRasgoPersonal;
	protected JButton jButtonCancelarToolBarTipoRasgoPersonal;
    protected JButton jButtonGuardarCambiosToolBarTipoRasgoPersonal;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRasgoPersonal;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRasgoPersonal;
	protected JButton jButtonCerrarToolBarTipoRasgoPersonal;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRasgoPersonal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRasgoPersonal;
	protected JMenuItem jMenuItemModificarTipoRasgoPersonal;
	protected JMenuItem jMenuItemActualizarTipoRasgoPersonal;
    protected JMenuItem jMenuItemEliminarTipoRasgoPersonal;
	protected JMenuItem jMenuItemCancelarTipoRasgoPersonal;
    protected JMenuItem jMenuItemGuardarCambiosTipoRasgoPersonal;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRasgoPersonal;
	protected JMenuItem jMenuItemCerrarTipoRasgoPersonal;
	protected JMenuItem jMenuItemDetalleCerrarTipoRasgoPersonal;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRasgoPersonal;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRasgoPersonal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRasgoPersonal;
	protected JMenuItem jMenuItemMostrarOcultarTipoRasgoPersonal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRasgoPersonal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRasgoPersonal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRasgoPersonal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRasgoPersonal;
	public JLabel jLabelIdTipoRasgoPersonal;
	public JLabel jLabelidTipoRasgoPersonal;
	public JButton jButtonidTipoRasgoPersonalBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRasgoPersonal;
	public JLabel jLabelcodigoTipoRasgoPersonal;
	public JTextField jTextFieldcodigoTipoRasgoPersonal;
	public JButton jButtoncodigoTipoRasgoPersonalBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRasgoPersonal;
	public JLabel jLabelnombreTipoRasgoPersonal;
	public JTextArea jTextAreanombreTipoRasgoPersonal;
	public JScrollPane jscrollPanenombreTipoRasgoPersonal;
	public JButton jButtonnombreTipoRasgoPersonalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoRasgoPersonal;
	public JLabel jLabelid_empresaTipoRasgoPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoRasgoPersonal;
	public JButton jButtonid_empresaTipoRasgoPersonal= new JButtonMe();
	public JButton jButtonid_empresaTipoRasgoPersonalUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoRasgoPersonalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRasgoPersonal;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoRasgoPersonalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRasgoPersonal=new JPanel();
				this.jPanelAccionesFormularioTipoRasgoPersonal=new JPanel();
				this.jmenuBarDetalleTipoRasgoPersonal=new JMenuBar();
				this.jTtoolBarDetalleTipoRasgoPersonal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRasgoPersonalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRasgoPersonalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRasgoPersonalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRasgoPersonalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRasgoPersonalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRasgoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRasgoPersonal() {
		return this.jButtonActualizarToolBarTipoRasgoPersonal;
	}
	
	public JButton getjButtonEliminarToolBarTipoRasgoPersonal() {
		return this.jButtonEliminarToolBarTipoRasgoPersonal;
	}
	
	public JButton getjButtonCancelarToolBarTipoRasgoPersonal() {
		return this.jButtonCancelarToolBarTipoRasgoPersonal;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRasgoPersonal() {
		return this.jButtonProcesarInformacionTipoRasgoPersonal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRasgoPersonal)	{
		this.jButtonProcesarInformacionTipoRasgoPersonal = jButtonProcesarInformacionTipoRasgoPersonal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRasgoPersonal() {
		return this.jComboBoxTiposAccionesTipoRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRasgoPersonal(
			JComboBox jComboBoxTiposRelacionesTipoRasgoPersonal) {
		this.jComboBoxTiposRelacionesTipoRasgoPersonal = jComboBoxTiposRelacionesTipoRasgoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRasgoPersonal(
			JComboBox jComboBoxTiposAccionesTipoRasgoPersonal) {
		this.jComboBoxTiposAccionesTipoRasgoPersonal = jComboBoxTiposAccionesTipoRasgoPersonal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRasgoPersonal() {
		return this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRasgoPersonal(
			JComboBox jComboBoxTiposAccionesFormularioTipoRasgoPersonal) {
		this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal = jComboBoxTiposAccionesFormularioTipoRasgoPersonal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
		
		this.tiporasgopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporasgopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporasgopersonalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRasgoPersonalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Rasgo Personal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRasgoPersonal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRasgoPersonal=new JButtonMe();
				this.jButtonModificarToolBarTipoRasgoPersonal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRasgoPersonal,this.jTtoolBarDetalleTipoRasgoPersonal,
							"actualizar","actualizar","Actualizar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRasgoPersonal,this.jTtoolBarDetalleTipoRasgoPersonal,
							"eliminar","eliminar","Eliminar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRasgoPersonal,this.jTtoolBarDetalleTipoRasgoPersonal,
							"cancelar","cancelar","Cancelar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRasgoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRasgoPersonal,this.jTtoolBarDetalleTipoRasgoPersonal,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRasgoPersonal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRasgoPersonal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRasgoPersonal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRasgoPersonal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRasgoPersonal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRasgoPersonal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRasgoPersonal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRasgoPersonal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRasgoPersonal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRasgoPersonal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRasgoPersonal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRasgoPersonal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRasgoPersonal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRasgoPersonal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRasgoPersonal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRasgoPersonal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRasgoPersonal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRasgoPersonal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRasgoPersonal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRasgoPersonal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRasgoPersonal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRasgoPersonal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRasgoPersonal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRasgoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRasgoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRasgoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRasgoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRasgoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRasgoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRasgoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRasgoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRasgoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRasgoPersonal.add(this.jMenuItemDetalleCerrarTipoRasgoPersonal);
		
		this.jmenuDetalleAccionesTipoRasgoPersonal.add(this.jMenuItemActualizarTipoRasgoPersonal);
		this.jmenuDetalleAccionesTipoRasgoPersonal.add(this.jMenuItemEliminarTipoRasgoPersonal);
		this.jmenuDetalleAccionesTipoRasgoPersonal.add(this.jMenuItemCancelarTipoRasgoPersonal);		
		
		//this.jmenuDetalleDatosTipoRasgoPersonal.add(this.jMenuItemDetalleAbrirOrderByTipoRasgoPersonal);				
		this.jmenuDetalleDatosTipoRasgoPersonal.add(this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal);				
				
		//this.jmenuDetalleAccionesTipoRasgoPersonal.add(this.jMenuItemGuardarCambiosTipoRasgoPersonal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRasgoPersonal.add(this.jmenuDetalleArchivoTipoRasgoPersonal);		
		this.jmenuBarDetalleTipoRasgoPersonal.add(this.jmenuDetalleAccionesTipoRasgoPersonal);		
		this.jmenuBarDetalleTipoRasgoPersonal.add(this.jmenuDetalleDatosTipoRasgoPersonal);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoRasgoPersonal.add(this.jmenuDetalleTipoRasgoPersonal);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRasgoPersonal);				
	}
	
	
	public void inicializarElementosCamposTipoRasgoPersonal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRasgoPersonal = new JLabelMe();
		jLabelIdTipoRasgoPersonal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRasgoPersonal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRasgoPersonal.setToolTipText(TipoRasgoPersonalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRasgoPersonal= new GridBagLayout();

		this.jPanelidTipoRasgoPersonal.setLayout(this.gridaBagLayoutTipoRasgoPersonal);

		jLabelidTipoRasgoPersonal = new JLabel();
		jLabelidTipoRasgoPersonal.setText("Id");

		jLabelidTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoRasgoPersonal = new JLabelMe();
		this.jLabelcodigoTipoRasgoPersonal.setText(""+TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRasgoPersonal.setToolTipText("Codigo");
		this.jLabelcodigoTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRasgoPersonal.setToolTipText(TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRasgoPersonal = new GridBagLayout();
		this.jPanelcodigoTipoRasgoPersonal.setLayout(this.gridaBagLayoutTipoRasgoPersonal);


		jTextFieldcodigoTipoRasgoPersonal= new JTextFieldMe();

		jTextFieldcodigoTipoRasgoPersonal.setEnabled(false);
		jTextFieldcodigoTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoRasgoPersonalBusqueda= new JButtonMe();
		this.jButtoncodigoTipoRasgoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRasgoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRasgoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoRasgoPersonalBusqueda.setText("U");
		this.jButtoncodigoTipoRasgoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoRasgoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoRasgoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoRasgoPersonalBusqueda"));

		if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoRasgoPersonalBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoRasgoPersonal = new JLabelMe();
		this.jLabelnombreTipoRasgoPersonal.setText(""+TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRasgoPersonal.setToolTipText("Nombre");
		this.jLabelnombreTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRasgoPersonal.setToolTipText(TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRasgoPersonal = new GridBagLayout();
		this.jPanelnombreTipoRasgoPersonal.setLayout(this.gridaBagLayoutTipoRasgoPersonal);


		jTextAreanombreTipoRasgoPersonal= new JTextAreaMe();
		jTextAreanombreTipoRasgoPersonal.setEnabled(false);
		jTextAreanombreTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRasgoPersonal.setLineWrap(true);
		jTextAreanombreTipoRasgoPersonal.setWrapStyleWord(true);
		jTextAreanombreTipoRasgoPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRasgoPersonal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRasgoPersonal = new JScrollPane(jTextAreanombreTipoRasgoPersonal);
		jscrollPanenombreTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoRasgoPersonalBusqueda= new JButtonMe();
		this.jButtonnombreTipoRasgoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRasgoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRasgoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRasgoPersonalBusqueda.setText("U");
		this.jButtonnombreTipoRasgoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRasgoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRasgoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRasgoPersonalBusqueda"));

		if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRasgoPersonalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRasgoPersonal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoRasgoPersonal = new JLabelMe();
		this.jLabelid_empresaTipoRasgoPersonal.setText(""+TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoRasgoPersonal.setToolTipText("Empresa");
		this.jLabelid_empresaTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoRasgoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoRasgoPersonal.setToolTipText(TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoRasgoPersonal = new GridBagLayout();
		this.jPanelid_empresaTipoRasgoPersonal.setLayout(this.gridaBagLayoutTipoRasgoPersonal);


		jComboBoxid_empresaTipoRasgoPersonal= new JComboBoxMe();
		jComboBoxid_empresaTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoRasgoPersonal.setEnabled(false);

		this.jButtonid_empresaTipoRasgoPersonal= new JButtonMe();
		this.jButtonid_empresaTipoRasgoPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRasgoPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRasgoPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRasgoPersonal.setText("Buscar");
		this.jButtonid_empresaTipoRasgoPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoRasgoPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRasgoPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRasgoPersonal"));

		this.jButtonid_empresaTipoRasgoPersonalBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoRasgoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRasgoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRasgoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRasgoPersonalBusqueda.setText("U");
		this.jButtonid_empresaTipoRasgoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoRasgoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRasgoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRasgoPersonalBusqueda"));

		if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoRasgoPersonalBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoRasgoPersonalUpdate= new JButtonMe();
		this.jButtonid_empresaTipoRasgoPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRasgoPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRasgoPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRasgoPersonalUpdate.setText("U");
		this.jButtonid_empresaTipoRasgoPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoRasgoPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRasgoPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRasgoPersonalUpdate"));



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
		//this.jInternalFrameDetalleTipoRasgoPersonal = new TipoRasgoPersonalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Rasgo Personal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRasgoPersonal= new GridBagLayout();
		

		
		String sToolTipTipoRasgoPersonal="";
		sToolTipTipoRasgoPersonal=TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRasgoPersonal+="(Nomina.TipoRasgoPersonal)";
		}
		
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRasgoPersonal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRasgoPersonal = new JButtonMe();
		this.jButtonModificarTipoRasgoPersonal = new JButtonMe();
        this.jButtonActualizarTipoRasgoPersonal = new JButtonMe();
        this.jButtonEliminarTipoRasgoPersonal = new JButtonMe();
        this.jButtonCancelarTipoRasgoPersonal = new JButtonMe();
        this.jButtonGuardarCambiosTipoRasgoPersonal = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal = new JButtonMe();
		this.jButtonCerrarTipoRasgoPersonal = new JButtonMe();
		
		this.jScrollPanelDatosTipoRasgoPersonal = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRasgoPersonal = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRasgoPersonal = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Rasgo Personal";
		
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rasgo Personales" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRasgoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRasgoPersonal.setName("jPanelCamposTipoRasgoPersonal"); 

		this.jPanelCamposOcultosTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRasgoPersonal.setName("jPanelCamposOcultosTipoRasgoPersonal"); 

        this.jPanelAccionesTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRasgoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesTipoRasgoPersonal.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRasgoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRasgoPersonal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRasgoPersonal.setText("Nuevo");
		this.jButtonModificarTipoRasgoPersonal.setText("Editar");
        this.jButtonActualizarTipoRasgoPersonal.setText("Actualizar");
        this.jButtonEliminarTipoRasgoPersonal.setText("Eliminar");
        this.jButtonCancelarTipoRasgoPersonal.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRasgoPersonal.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.setText("Guardar");
		this.jButtonCerrarTipoRasgoPersonal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRasgoPersonal,"nuevo_button","Nuevo",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRasgoPersonal,"modificar_button","Editar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRasgoPersonal,"actualizar_button","Actualizar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRasgoPersonal,"eliminar_button","Eliminar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRasgoPersonal,"cancelar_button","Cancelar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRasgoPersonal,"guardarcambios_button","Guardar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRasgoPersonal,"guardarcambiostabla_button","Guardar",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRasgoPersonal,"cerrar_button","Salir",this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRasgoPersonal.setToolTipText("Nuevo"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRasgoPersonal.setToolTipText("Editar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRasgoPersonal.setToolTipText("Actualizar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRasgoPersonal.setToolTipText("Eliminar)"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRasgoPersonal.setToolTipText("Cancelar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRasgoPersonal.setToolTipText("Guardar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.setToolTipText("Guardar"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRasgoPersonal.setToolTipText("Salir"+" "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRasgoPersonal";
		inputMap = this.jButtonNuevoTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRasgoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRasgoPersonal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRasgoPersonal";
		inputMap = this.jButtonActualizarTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRasgoPersonal"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRasgoPersonal";
		inputMap = this.jButtonEliminarTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRasgoPersonal"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRasgoPersonal";
		inputMap = this.jButtonCancelarTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRasgoPersonal"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRasgoPersonal";
		inputMap = this.jButtonCerrarTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRasgoPersonal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRasgoPersonal";
		inputMap = this.jButtonGuardarCambiosTablaTipoRasgoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRasgoPersonal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRasgoPersonal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRasgoPersonal.setToolTipText("Nuevo TipoRasgoPersonal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRasgoPersonal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRasgoPersonal.setToolTipText("Sin Cerrar Ventana TipoRasgoPersonal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRasgoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRasgoPersonal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRasgoPersonal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRasgoPersonal.setText("Accion");
		this.jComboBoxTiposAccionesTipoRasgoPersonal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRasgoPersonal = new JLabelMe();
		
		this.jLabelAccionesTipoRasgoPersonal.setText("Acciones");		
		this.jLabelAccionesTipoRasgoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRasgoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRasgoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRasgoPersonal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRasgoPersonal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRasgoPersonal=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRasgoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRasgoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRasgoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRasgoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRasgoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRasgoPersonal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRasgoPersonal = new GridBagLayout();
		
		this.jPanelCamposTipoRasgoPersonal.setLayout(gridaBagLayoutCamposTipoRasgoPersonal);
		this.jPanelCamposOcultosTipoRasgoPersonal.setLayout(gridaBagLayoutCamposOcultosTipoRasgoPersonal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRasgoPersonal.add(jLabelIdTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);



	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = 1;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRasgoPersonal.add(jLabelidTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);


	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoRasgoPersonal.add(jLabelid_empresaTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 2;
		this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRasgoPersonal.add(jButtonid_empresaTipoRasgoPersonalBusqueda, this.gridBagConstraintsTipoRasgoPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 3;
		this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRasgoPersonal.add(jButtonid_empresaTipoRasgoPersonalUpdate, this.gridBagConstraintsTipoRasgoPersonal);
	}

	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = 1;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoRasgoPersonal.add(jComboBoxid_empresaTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);


	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRasgoPersonal.add(jLabelcodigoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 2;
		this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRasgoPersonal.add(jButtoncodigoTipoRasgoPersonalBusqueda, this.gridBagConstraintsTipoRasgoPersonal);
	}

	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = 1;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRasgoPersonal.add(jTextFieldcodigoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);


	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRasgoPersonal.add(jLabelnombreTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 2;
		this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
		this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRasgoPersonal.add(jButtonnombreTipoRasgoPersonalBusqueda, this.gridBagConstraintsTipoRasgoPersonal);
	}

	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = 1;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRasgoPersonal.add(jscrollPanenombreTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = iYPanelCamposTipoRasgoPersonal;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = iXPanelCamposTipoRasgoPersonal++;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRasgoPersonal.add(this.jPanelidTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);



	if(iXPanelCamposTipoRasgoPersonal % 1==0) {
		iXPanelCamposTipoRasgoPersonal=0;
		iYPanelCamposTipoRasgoPersonal++;
	}
	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = iYPanelCamposTipoRasgoPersonal;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = iXPanelCamposTipoRasgoPersonal++;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRasgoPersonal.add(this.jPanelcodigoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);



	if(iXPanelCamposTipoRasgoPersonal % 1==0) {
		iXPanelCamposTipoRasgoPersonal=0;
		iYPanelCamposTipoRasgoPersonal++;
	}
	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = iYPanelCamposTipoRasgoPersonal;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = iXPanelCamposTipoRasgoPersonal++;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRasgoPersonal.add(this.jPanelnombreTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);



	if(iXPanelCamposTipoRasgoPersonal % 1==0) {
		iXPanelCamposTipoRasgoPersonal=0;
		iYPanelCamposTipoRasgoPersonal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRasgoPersonal.gridy = iYPanelCamposOcultosTipoRasgoPersonal;
	this.gridBagConstraintsTipoRasgoPersonal.gridx = iXPanelCamposOcultosTipoRasgoPersonal++;
	this.gridBagConstraintsTipoRasgoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRasgoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoRasgoPersonal.add(this.jPanelid_empresaTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);



	if(iXPanelCamposOcultosTipoRasgoPersonal % 1==0) {
		iXPanelCamposOcultosTipoRasgoPersonal=0;
		iYPanelCamposOcultosTipoRasgoPersonal++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRasgoPersonal= new GridBagLayout();
		this.jPanelAccionesTipoRasgoPersonal.setLayout(gridaBagLayoutAccionesTipoRasgoPersonal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRasgoPersonal= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRasgoPersonal.setLayout(gridaBagLayoutAccionesFormularioTipoRasgoPersonal);
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRasgoPersonal.add(this.jComboBoxTiposAccionesFormularioTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);

		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRasgoPersonal.add(this.jCheckBoxPostAccionNuevoTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRasgoPersonal.add(this.jCheckBoxPostAccionSinCerrarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRasgoPersonal.add(this.jCheckBoxPostAccionSinMensajeTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRasgoPersonal.add(this.jButtonModificarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);							

		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;
		this.gridBagConstraintsTipoRasgoPersonal.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRasgoPersonal.add(this.jButtonEliminarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
			
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRasgoPersonal.add(this.jButtonActualizarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);


		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRasgoPersonal.add(this.jButtonGuardarCambiosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);	
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = 0;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRasgoPersonal.add(this.jButtonCancelarTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRasgoPersonal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRasgoPersonal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();						
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;		
			//this.gridBagConstraintsTipoRasgoPersonal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRasgoPersonal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRasgoPersonal.gridx =0;
		this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRasgoPersonal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRasgoPersonal = new TipoRasgoPersonalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Rasgo Personal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Rasgo Personal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Rasgo Personal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRasgoPersonalModel tiporasgopersonalModel=new TipoRasgoPersonalModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRasgoPersonalModel.TipoRasgoPersonalFocusTraversalPolicy tiporasgopersonalFocusTraversalPolicy = tiporasgopersonalModel.new TipoRasgoPersonalFocusTraversalPolicy(this);
			
			//tiporasgopersonalFocusTraversalPolicy.settiporasgopersonalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporasgopersonalModel);
			
			
			this.jContentPaneDetalleTipoRasgoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRasgoPersonal = new GridBagLayout();	
			this.jContentPaneDetalleTipoRasgoPersonal.setLayout(gridaBagLayoutDetalleTipoRasgoPersonal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRasgoPersonal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
				this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRasgoPersonal.add(jTtoolBarDetalleTipoRasgoPersonal, gridBagConstraintsTipoRasgoPersonal);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRasgoPersonal=   new JScrollPane(jContentPaneDetalleTipoRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRasgoPersonal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
	        
			this.jContentPaneDetalleTipoRasgoPersonal.add(jPanelCamposTipoRasgoPersonal, gridBagConstraintsTipoRasgoPersonal);
			
			
			
			
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
						&& tiporasgopersonalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameRasgoPersonal(this.puedeCargarPorParteRasgoPersonal,false,-1);
					
					if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRasgoPersonal= new GridBagConstraints();
						this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
						this.jContentPaneDetalleTipoRasgoPersonal.add(this.jTabbedPaneRelacionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRasgoPersonal.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameRasgoPersonal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRasgoPersonal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
					this.gridBagConstraintsTipoRasgoPersonal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRasgoPersonal.add(jPanelCamposOcultosTipoRasgoPersonal, gridBagConstraintsTipoRasgoPersonal);
				
					this.jPanelCamposOcultosTipoRasgoPersonal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
	        this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRasgoPersonal.add(this.jPanelAccionesFormularioTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);							
			
			
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
	        this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRasgoPersonal.add(this.jPanelAccionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRasgoPersonal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRasgoPersonal=   new JScrollPane(this.jPanelCamposTipoRasgoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRasgoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRasgoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRasgoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
			this.gridBagConstraintsTipoRasgoPersonal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRasgoPersonal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRasgoPersonal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);			
			
			this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
			
			
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		
			
		this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoRasgoPersonal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRasgoPersonal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRasgoPersonal, this.gridBagConstraintsTipoRasgoPersonal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRasgoPersonal;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRasgoPersonal;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameRasgoPersonal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		this.rasgopersonalSessionBean.setConGuardarRelaciones(false);
		this.rasgopersonalSessionBean.setEsGuardarRelacionado(true);

		this.rasgopersonalBeanSwingJInternalFrame=null;//new RasgoPersonalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rasgopersonalBeanSwingJInternalFramePopup=new RasgoPersonalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rasgopersonalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {

				RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL;
				RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rasgopersonalSessionBean.setEsGuardarRelacionado(true);

				this.rasgopersonalBeanSwingJInternalFrame=new RasgoPersonalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rasgopersonalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rasgopersonalBeanSwingJInternalFrame.setrasgopersonalSessionBean(this.rasgopersonalSessionBean);

				//this.gridBagConstraintsTipoRasgoPersonal = new GridBagConstraints();
				//this.gridBagConstraintsTipoRasgoPersonal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRasgoPersonal.gridx = 0;
				//this.jContentPaneDetalleTipoRasgoPersonal.add(this.rasgopersonalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRasgoPersonal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRasgoPersonal.add("Rasgo Personales",this.rasgopersonalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRasgoPersonal.setComponentAt(iIndexTab,this.rasgopersonalBeanSwingJInternalFrame.getContentPane());
				}

				//RasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rasgopersonalSessionBean.setEsGuardarRelacionado(false);
				this.rasgopersonalBeanSwingJInternalFrame=null;//new RasgoPersonalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRasgoPersonal) {
					this.jTabbedPaneRelacionesTipoRasgoPersonal.add("Rasgo Personales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRasgoPersonalBeanSwingJInternalFrame(List<TipoRasgoPersonal> tiporasgopersonals,TipoRasgoPersonal tiporasgopersonal,RasgoPersonalBeanSwingJInternalFrame rasgopersonalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rasgopersonalBeanSwingJInternalFrame=new RasgoPersonalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rasgopersonalBeanSwingJInternalFrame.getRasgoPersonalLogic().setConnexion(this.tiporasgopersonalLogic.getConnexion());

					rasgopersonalBeanSwingJInternalFrame.settiporasgopersonalsForeignKey(tiporasgopersonals);
					rasgopersonalBeanSwingJInternalFrame.settiporasgopersonalForeignKey(tiporasgopersonal);
					rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.setisBusquedaDesdeForeignKeySesionTipoRasgoPersonal(true);
					rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.setlidTipoRasgoPersonalActual(tiporasgopersonal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rasgopersonalBeanSwingJInternalFrame.cargarCombosForeignKeyRasgoPersonal(rasgopersonalBeanSwingJInternalFrame.isCargarCombosDependencia);
					rasgopersonalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRasgoPersonal(true);
					rasgopersonalBeanSwingJInternalFrame.setid_tipo_rasgo_personalFK_IdTipoRasgoPersonal(tiporasgopersonal.getId());

					if(!this.conCargarFormDetalle) {
						rasgopersonalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rasgopersonalBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoRasgoPersonalForeignKey(tiporasgopersonal,1,false,true,true);
					rasgopersonalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rasgopersonalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRasgoPersonal");
					rasgopersonalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRasgoPersonal");
					rasgopersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaRasgoPersonal(true);
					rasgopersonalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRasgoPersonal("n",rasgopersonalBeanSwingJInternalFrame.isGuardarCambiosEnLote, rasgopersonalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rasgopersonalBeanSwingJInternalFrame.setAutoscrolls(true);
					rasgopersonalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rasgopersonalBeanSwingJInternalFrame.actualizarEstadoPanelsRasgoPersonal("relacionado");
					} else {
						rasgopersonalBeanSwingJInternalFrame.actualizarEstadoPanelsRasgoPersonal("no_relacionado");
					}

					rasgopersonalBeanSwingJInternalFrame.getjButtonRecargarInformacionRasgoPersonal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
