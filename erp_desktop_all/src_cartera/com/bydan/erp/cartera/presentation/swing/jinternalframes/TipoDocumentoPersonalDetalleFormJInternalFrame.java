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
import com.bydan.erp.cartera.util.TipoDocumentoPersonalConstantesFunciones;

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
public class TipoDocumentoPersonalDetalleFormJInternalFrame extends TipoDocumentoPersonalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDocumentoPersonal;
	
	protected JMenuBar jmenuBarDetalleTipoDocumentoPersonal;
	
	protected JMenu jmenuDetalleTipoDocumentoPersonal;
	protected JMenu jmenuDetalleArchivoTipoDocumentoPersonal;
	protected JMenu jmenuDetalleAccionesTipoDocumentoPersonal;
	protected JMenu jmenuDetalleDatosTipoDocumentoPersonal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDocumentoPersonal;	
	protected GridBagConstraints gridBagConstraintsTipoDocumentoPersonal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDocumentoPersonalBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDocumentoPersonal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoDocumentoPersonalSessionBean tipodocumentopersonalSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoDocumentoPersonalLogic tipodocumentopersonalLogic;
	
	public JScrollPane jScrollPanelDatosTipoDocumentoPersonal;
	public JScrollPane jScrollPanelDatosEdicionTipoDocumentoPersonal;
	public JScrollPane jScrollPanelDatosGeneralTipoDocumentoPersonal;
	
	protected JPanel jPanelCamposTipoDocumentoPersonal;    
	protected JPanel jPanelCamposOcultosTipoDocumentoPersonal;    	
	protected JPanel jPanelAccionesTipoDocumentoPersonal;
	protected JPanel jPanelAccionesFormularioTipoDocumentoPersonal;
    
	
	
	protected Integer iXPanelCamposTipoDocumentoPersonal=0;
	protected Integer iYPanelCamposTipoDocumentoPersonal=0;
	
	protected Integer iXPanelCamposOcultosTipoDocumentoPersonal=0;
	protected Integer iYPanelCamposOcultosTipoDocumentoPersonal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDocumentoPersonal;
	public JButton jButtonModificarTipoDocumentoPersonal;
	public JButton jButtonActualizarTipoDocumentoPersonal;
    public JButton jButtonEliminarTipoDocumentoPersonal;
	public JButton jButtonCancelarTipoDocumentoPersonal;
    public JButton jButtonGuardarCambiosTipoDocumentoPersonal;
	public JButton jButtonGuardarCambiosTablaTipoDocumentoPersonal;
	protected JButton jButtonCerrarTipoDocumentoPersonal;
	
	
	protected JButton jButtonProcesarInformacionTipoDocumentoPersonal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDocumentoPersonal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDocumentoPersonal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDocumentoPersonal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDocumentoPersonal;
	protected JButton jButtonModificarToolBarTipoDocumentoPersonal;
	protected JButton jButtonActualizarToolBarTipoDocumentoPersonal;
    protected JButton jButtonEliminarToolBarTipoDocumentoPersonal;
	protected JButton jButtonCancelarToolBarTipoDocumentoPersonal;
    protected JButton jButtonGuardarCambiosToolBarTipoDocumentoPersonal;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDocumentoPersonal;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDocumentoPersonal;
	protected JButton jButtonCerrarToolBarTipoDocumentoPersonal;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDocumentoPersonal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDocumentoPersonal;
	protected JMenuItem jMenuItemModificarTipoDocumentoPersonal;
	protected JMenuItem jMenuItemActualizarTipoDocumentoPersonal;
    protected JMenuItem jMenuItemEliminarTipoDocumentoPersonal;
	protected JMenuItem jMenuItemCancelarTipoDocumentoPersonal;
    protected JMenuItem jMenuItemGuardarCambiosTipoDocumentoPersonal;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDocumentoPersonal;
	protected JMenuItem jMenuItemCerrarTipoDocumentoPersonal;
	protected JMenuItem jMenuItemDetalleCerrarTipoDocumentoPersonal;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDocumentoPersonal;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDocumentoPersonal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal;
	protected JMenuItem jMenuItemMostrarOcultarTipoDocumentoPersonal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDocumentoPersonal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDocumentoPersonal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDocumentoPersonal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDocumentoPersonal;
	public JLabel jLabelIdTipoDocumentoPersonal;
	public JTextFieldMe jTextFieldidTipoDocumentoPersonal;
	public JButton jButtonidTipoDocumentoPersonalBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDocumentoPersonal;
	public JLabel jLabelcodigoTipoDocumentoPersonal;
	public JTextField jTextFieldcodigoTipoDocumentoPersonal;
	public JButton jButtoncodigoTipoDocumentoPersonalBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDocumentoPersonal;
	public JLabel jLabelnombreTipoDocumentoPersonal;
	public JTextArea jTextAreanombreTipoDocumentoPersonal;
	public JScrollPane jscrollPanenombreTipoDocumentoPersonal;
	public JButton jButtonnombreTipoDocumentoPersonalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoDocumentoPersonal;
	public JLabel jLabelid_paisTipoDocumentoPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoDocumentoPersonal;
	public JButton jButtonid_paisTipoDocumentoPersonal= new JButtonMe();
	public JButton jButtonid_paisTipoDocumentoPersonalUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoDocumentoPersonalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDocumentoPersonal;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoDocumentoPersonalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDocumentoPersonal=new JPanel();
				this.jPanelAccionesFormularioTipoDocumentoPersonal=new JPanel();
				this.jmenuBarDetalleTipoDocumentoPersonal=new JMenuBar();
				this.jTtoolBarDetalleTipoDocumentoPersonal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoPersonalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDocumentoPersonalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoPersonalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoPersonalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoPersonalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDocumentoPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDocumentoPersonal() {
		return this.jButtonActualizarToolBarTipoDocumentoPersonal;
	}
	
	public JButton getjButtonEliminarToolBarTipoDocumentoPersonal() {
		return this.jButtonEliminarToolBarTipoDocumentoPersonal;
	}
	
	public JButton getjButtonCancelarToolBarTipoDocumentoPersonal() {
		return this.jButtonCancelarToolBarTipoDocumentoPersonal;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDocumentoPersonal() {
		return this.jButtonProcesarInformacionTipoDocumentoPersonal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDocumentoPersonal)	{
		this.jButtonProcesarInformacionTipoDocumentoPersonal = jButtonProcesarInformacionTipoDocumentoPersonal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDocumentoPersonal() {
		return this.jComboBoxTiposAccionesTipoDocumentoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDocumentoPersonal(
			JComboBox jComboBoxTiposRelacionesTipoDocumentoPersonal) {
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal = jComboBoxTiposRelacionesTipoDocumentoPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDocumentoPersonal(
			JComboBox jComboBoxTiposAccionesTipoDocumentoPersonal) {
		this.jComboBoxTiposAccionesTipoDocumentoPersonal = jComboBoxTiposAccionesTipoDocumentoPersonal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDocumentoPersonal() {
		return this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDocumentoPersonal(
			JComboBox jComboBoxTiposAccionesFormularioTipoDocumentoPersonal) {
		this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal = jComboBoxTiposAccionesFormularioTipoDocumentoPersonal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
		
		this.tipodocumentopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDocumentoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDocumentoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDocumentoPersonalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Documento Personal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDocumentoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDocumentoPersonal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDocumentoPersonal=new JButtonMe();
				this.jButtonModificarToolBarTipoDocumentoPersonal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDocumentoPersonal,this.jTtoolBarDetalleTipoDocumentoPersonal,
							"actualizar","actualizar","Actualizar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDocumentoPersonal,this.jTtoolBarDetalleTipoDocumentoPersonal,
							"eliminar","eliminar","Eliminar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDocumentoPersonal,this.jTtoolBarDetalleTipoDocumentoPersonal,
							"cancelar","cancelar","Cancelar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDocumentoPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDocumentoPersonal,this.jTtoolBarDetalleTipoDocumentoPersonal,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDocumentoPersonal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDocumentoPersonal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDocumentoPersonal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDocumentoPersonal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDocumentoPersonal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDocumentoPersonal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDocumentoPersonal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDocumentoPersonal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDocumentoPersonal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDocumentoPersonal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDocumentoPersonal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDocumentoPersonal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDocumentoPersonal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDocumentoPersonal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDocumentoPersonal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDocumentoPersonal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDocumentoPersonal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDocumentoPersonal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDocumentoPersonal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDocumentoPersonal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDocumentoPersonal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDocumentoPersonal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDocumentoPersonal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDocumentoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDocumentoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDocumentoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDocumentoPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDocumentoPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDocumentoPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDocumentoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDocumentoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDocumentoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDocumentoPersonal.add(this.jMenuItemDetalleCerrarTipoDocumentoPersonal);
		
		this.jmenuDetalleAccionesTipoDocumentoPersonal.add(this.jMenuItemActualizarTipoDocumentoPersonal);
		this.jmenuDetalleAccionesTipoDocumentoPersonal.add(this.jMenuItemEliminarTipoDocumentoPersonal);
		this.jmenuDetalleAccionesTipoDocumentoPersonal.add(this.jMenuItemCancelarTipoDocumentoPersonal);		
		
		//this.jmenuDetalleDatosTipoDocumentoPersonal.add(this.jMenuItemDetalleAbrirOrderByTipoDocumentoPersonal);				
		this.jmenuDetalleDatosTipoDocumentoPersonal.add(this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal);				
				
		//this.jmenuDetalleAccionesTipoDocumentoPersonal.add(this.jMenuItemGuardarCambiosTipoDocumentoPersonal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDocumentoPersonal.add(this.jmenuDetalleArchivoTipoDocumentoPersonal);		
		this.jmenuBarDetalleTipoDocumentoPersonal.add(this.jmenuDetalleAccionesTipoDocumentoPersonal);		
		this.jmenuBarDetalleTipoDocumentoPersonal.add(this.jmenuDetalleDatosTipoDocumentoPersonal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDocumentoPersonal);				
	}
	
	
	public void inicializarElementosCamposTipoDocumentoPersonal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDocumentoPersonal = new JLabelMe();
		jLabelIdTipoDocumentoPersonal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDocumentoPersonal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDocumentoPersonal.setToolTipText(TipoDocumentoPersonalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDocumentoPersonal= new GridBagLayout();

		this.jPanelidTipoDocumentoPersonal.setLayout(this.gridaBagLayoutTipoDocumentoPersonal);

		jTextFieldidTipoDocumentoPersonal = new JTextFieldMe();
		jTextFieldidTipoDocumentoPersonal.setText("Id");

		jTextFieldidTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDocumentoPersonal = new JLabelMe();
		this.jLabelcodigoTipoDocumentoPersonal.setText(""+TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDocumentoPersonal.setToolTipText("Codigo");
		this.jLabelcodigoTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDocumentoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDocumentoPersonal.setToolTipText(TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDocumentoPersonal = new GridBagLayout();
		this.jPanelcodigoTipoDocumentoPersonal.setLayout(this.gridaBagLayoutTipoDocumentoPersonal);


		jTextFieldcodigoTipoDocumentoPersonal= new JTextFieldMe();

		jTextFieldcodigoTipoDocumentoPersonal.setEnabled(false);
		jTextFieldcodigoTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDocumentoPersonalBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDocumentoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDocumentoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDocumentoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDocumentoPersonalBusqueda.setText("U");
		this.jButtoncodigoTipoDocumentoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDocumentoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDocumentoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDocumentoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDocumentoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDocumentoPersonalBusqueda"));

		if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDocumentoPersonalBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDocumentoPersonal = new JLabelMe();
		this.jLabelnombreTipoDocumentoPersonal.setText(""+TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDocumentoPersonal.setToolTipText("Nombre");
		this.jLabelnombreTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDocumentoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDocumentoPersonal.setToolTipText(TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDocumentoPersonal = new GridBagLayout();
		this.jPanelnombreTipoDocumentoPersonal.setLayout(this.gridaBagLayoutTipoDocumentoPersonal);


		jTextAreanombreTipoDocumentoPersonal= new JTextAreaMe();
		jTextAreanombreTipoDocumentoPersonal.setEnabled(false);
		jTextAreanombreTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumentoPersonal.setLineWrap(true);
		jTextAreanombreTipoDocumentoPersonal.setWrapStyleWord(true);
		jTextAreanombreTipoDocumentoPersonal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDocumentoPersonal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDocumentoPersonal = new JScrollPane(jTextAreanombreTipoDocumentoPersonal);
		jscrollPanenombreTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoDocumentoPersonalBusqueda= new JButtonMe();
		this.jButtonnombreTipoDocumentoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDocumentoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDocumentoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDocumentoPersonalBusqueda.setText("U");
		this.jButtonnombreTipoDocumentoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDocumentoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDocumentoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDocumentoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDocumentoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDocumentoPersonalBusqueda"));

		if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDocumentoPersonalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDocumentoPersonal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoDocumentoPersonal = new JLabelMe();
		this.jLabelid_paisTipoDocumentoPersonal.setText(""+TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoDocumentoPersonal.setToolTipText("Pais");
		this.jLabelid_paisTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoDocumentoPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoDocumentoPersonal.setToolTipText(TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoDocumentoPersonal = new GridBagLayout();
		this.jPanelid_paisTipoDocumentoPersonal.setLayout(this.gridaBagLayoutTipoDocumentoPersonal);


		jComboBoxid_paisTipoDocumentoPersonal= new JComboBoxMe();
		jComboBoxid_paisTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoDocumentoPersonal= new JButtonMe();
		this.jButtonid_paisTipoDocumentoPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoDocumentoPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoDocumentoPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoDocumentoPersonal.setText("Buscar");
		this.jButtonid_paisTipoDocumentoPersonal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoDocumentoPersonal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoDocumentoPersonal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoDocumentoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoDocumentoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoDocumentoPersonal"));

		this.jButtonid_paisTipoDocumentoPersonalBusqueda= new JButtonMe();
		this.jButtonid_paisTipoDocumentoPersonalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoDocumentoPersonalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoDocumentoPersonalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoDocumentoPersonalBusqueda.setText("U");
		this.jButtonid_paisTipoDocumentoPersonalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoDocumentoPersonalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoDocumentoPersonalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoDocumentoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoDocumentoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoDocumentoPersonalBusqueda"));

		if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoDocumentoPersonalBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoDocumentoPersonalUpdate= new JButtonMe();
		this.jButtonid_paisTipoDocumentoPersonalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoDocumentoPersonalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoDocumentoPersonalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoDocumentoPersonalUpdate.setText("U");
		this.jButtonid_paisTipoDocumentoPersonalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoDocumentoPersonalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoDocumentoPersonalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoDocumentoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoDocumentoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoDocumentoPersonalUpdate"));



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
		//this.jInternalFrameDetalleTipoDocumentoPersonal = new TipoDocumentoPersonalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Documento Personal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDocumentoPersonal= new GridBagLayout();
		

		
		String sToolTipTipoDocumentoPersonal="";
		sToolTipTipoDocumentoPersonal=TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDocumentoPersonal+="(Cartera.TipoDocumentoPersonal)";
		}
		
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDocumentoPersonal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDocumentoPersonal = new JButtonMe();
		this.jButtonModificarTipoDocumentoPersonal = new JButtonMe();
        this.jButtonActualizarTipoDocumentoPersonal = new JButtonMe();
        this.jButtonEliminarTipoDocumentoPersonal = new JButtonMe();
        this.jButtonCancelarTipoDocumentoPersonal = new JButtonMe();
        this.jButtonGuardarCambiosTipoDocumentoPersonal = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal = new JButtonMe();
		this.jButtonCerrarTipoDocumentoPersonal = new JButtonMe();
		
		this.jScrollPanelDatosTipoDocumentoPersonal = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDocumentoPersonal = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDocumentoPersonal = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Documento Personal";
		
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documento Personals" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDocumentoPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDocumentoPersonal.setName("jPanelCamposTipoDocumentoPersonal"); 

		this.jPanelCamposOcultosTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDocumentoPersonal.setName("jPanelCamposOcultosTipoDocumentoPersonal"); 

        this.jPanelAccionesTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDocumentoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesTipoDocumentoPersonal.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDocumentoPersonal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDocumentoPersonal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDocumentoPersonal.setText("Nuevo");
		this.jButtonModificarTipoDocumentoPersonal.setText("Editar");
        this.jButtonActualizarTipoDocumentoPersonal.setText("Actualizar");
        this.jButtonEliminarTipoDocumentoPersonal.setText("Eliminar");
        this.jButtonCancelarTipoDocumentoPersonal.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDocumentoPersonal.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.setText("Guardar");
		this.jButtonCerrarTipoDocumentoPersonal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDocumentoPersonal,"nuevo_button","Nuevo",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDocumentoPersonal,"modificar_button","Editar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDocumentoPersonal,"actualizar_button","Actualizar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDocumentoPersonal,"eliminar_button","Eliminar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDocumentoPersonal,"cancelar_button","Cancelar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDocumentoPersonal,"guardarcambios_button","Guardar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDocumentoPersonal,"guardarcambiostabla_button","Guardar",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDocumentoPersonal,"cerrar_button","Salir",this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDocumentoPersonal.setToolTipText("Nuevo"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDocumentoPersonal.setToolTipText("Editar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDocumentoPersonal.setToolTipText("Actualizar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDocumentoPersonal.setToolTipText("Eliminar)"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDocumentoPersonal.setToolTipText("Cancelar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDocumentoPersonal.setToolTipText("Guardar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.setToolTipText("Guardar"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDocumentoPersonal.setToolTipText("Salir"+" "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDocumentoPersonal";
		inputMap = this.jButtonNuevoTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDocumentoPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDocumentoPersonal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDocumentoPersonal";
		inputMap = this.jButtonActualizarTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDocumentoPersonal"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDocumentoPersonal";
		inputMap = this.jButtonEliminarTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDocumentoPersonal"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDocumentoPersonal";
		inputMap = this.jButtonCancelarTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDocumentoPersonal"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDocumentoPersonal";
		inputMap = this.jButtonCerrarTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDocumentoPersonal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDocumentoPersonal";
		inputMap = this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDocumentoPersonal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDocumentoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDocumentoPersonal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDocumentoPersonal.setToolTipText("Nuevo TipoDocumentoPersonal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDocumentoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDocumentoPersonal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDocumentoPersonal.setToolTipText("Sin Cerrar Ventana TipoDocumentoPersonal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDocumentoPersonal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDocumentoPersonal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDocumentoPersonal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDocumentoPersonal.setText("Accion");
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDocumentoPersonal = new JLabelMe();
		
		this.jLabelAccionesTipoDocumentoPersonal.setText("Acciones");		
		this.jLabelAccionesTipoDocumentoPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumentoPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumentoPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDocumentoPersonal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDocumentoPersonal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDocumentoPersonal=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDocumentoPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDocumentoPersonal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDocumentoPersonal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDocumentoPersonal = new GridBagLayout();
		
		this.jPanelCamposTipoDocumentoPersonal.setLayout(gridaBagLayoutCamposTipoDocumentoPersonal);
		this.jPanelCamposOcultosTipoDocumentoPersonal.setLayout(gridaBagLayoutCamposOcultosTipoDocumentoPersonal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDocumentoPersonal.add(jLabelIdTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);



	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = 1;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDocumentoPersonal.add(jTextFieldidTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);


	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoDocumentoPersonal.add(jLabelid_paisTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 2;
		this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoDocumentoPersonal.add(jButtonid_paisTipoDocumentoPersonalBusqueda, this.gridBagConstraintsTipoDocumentoPersonal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 3;
		this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoDocumentoPersonal.add(jButtonid_paisTipoDocumentoPersonalUpdate, this.gridBagConstraintsTipoDocumentoPersonal);
	}

	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = 1;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoDocumentoPersonal.add(jComboBoxid_paisTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);


	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDocumentoPersonal.add(jLabelcodigoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 2;
		this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDocumentoPersonal.add(jButtoncodigoTipoDocumentoPersonalBusqueda, this.gridBagConstraintsTipoDocumentoPersonal);
	}

	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = 1;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDocumentoPersonal.add(jTextFieldcodigoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);


	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDocumentoPersonal.add(jLabelnombreTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 2;
		this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDocumentoPersonal.add(jButtonnombreTipoDocumentoPersonalBusqueda, this.gridBagConstraintsTipoDocumentoPersonal);
	}

	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = 1;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDocumentoPersonal.add(jscrollPanenombreTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = iYPanelCamposTipoDocumentoPersonal;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = iXPanelCamposTipoDocumentoPersonal++;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumentoPersonal.add(this.jPanelidTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);



	if(iXPanelCamposTipoDocumentoPersonal % 1==0) {
		iXPanelCamposTipoDocumentoPersonal=0;
		iYPanelCamposTipoDocumentoPersonal++;
	}
	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = iYPanelCamposTipoDocumentoPersonal;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = iXPanelCamposTipoDocumentoPersonal++;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumentoPersonal.add(this.jPanelid_paisTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);



	if(iXPanelCamposTipoDocumentoPersonal % 1==0) {
		iXPanelCamposTipoDocumentoPersonal=0;
		iYPanelCamposTipoDocumentoPersonal++;
	}
	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = iYPanelCamposTipoDocumentoPersonal;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = iXPanelCamposTipoDocumentoPersonal++;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumentoPersonal.add(this.jPanelcodigoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);



	if(iXPanelCamposTipoDocumentoPersonal % 1==0) {
		iXPanelCamposTipoDocumentoPersonal=0;
		iYPanelCamposTipoDocumentoPersonal++;
	}
	this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumentoPersonal.gridy = iYPanelCamposTipoDocumentoPersonal;
	this.gridBagConstraintsTipoDocumentoPersonal.gridx = iXPanelCamposTipoDocumentoPersonal++;
	this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumentoPersonal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumentoPersonal.add(this.jPanelnombreTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);



	if(iXPanelCamposTipoDocumentoPersonal % 1==0) {
		iXPanelCamposTipoDocumentoPersonal=0;
		iYPanelCamposTipoDocumentoPersonal++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDocumentoPersonal= new GridBagLayout();
		this.jPanelAccionesTipoDocumentoPersonal.setLayout(gridaBagLayoutAccionesTipoDocumentoPersonal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDocumentoPersonal= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDocumentoPersonal.setLayout(gridaBagLayoutAccionesFormularioTipoDocumentoPersonal);
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDocumentoPersonal.add(this.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);

		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDocumentoPersonal.add(this.jCheckBoxPostAccionNuevoTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDocumentoPersonal.add(this.jCheckBoxPostAccionSinCerrarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDocumentoPersonal.add(this.jCheckBoxPostAccionSinMensajeTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDocumentoPersonal.add(this.jButtonModificarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);							

		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDocumentoPersonal.add(this.jButtonEliminarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
			
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDocumentoPersonal.add(this.jButtonActualizarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);


		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDocumentoPersonal.add(this.jButtonGuardarCambiosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);	
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = 0;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDocumentoPersonal.add(this.jButtonCancelarTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDocumentoPersonal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDocumentoPersonal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();						
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;		
			//this.gridBagConstraintsTipoDocumentoPersonal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDocumentoPersonal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumentoPersonal.gridx =0;
		this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDocumentoPersonal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDocumentoPersonal = new TipoDocumentoPersonalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Documento Personal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Documento Personal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Documento Personal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDocumentoPersonalModel tipodocumentopersonalModel=new TipoDocumentoPersonalModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDocumentoPersonalModel.TipoDocumentoPersonalFocusTraversalPolicy tipodocumentopersonalFocusTraversalPolicy = tipodocumentopersonalModel.new TipoDocumentoPersonalFocusTraversalPolicy(this);
			
			//tipodocumentopersonalFocusTraversalPolicy.settipodocumentopersonalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodocumentopersonalModel);
			
			
			this.jContentPaneDetalleTipoDocumentoPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDocumentoPersonal = new GridBagLayout();	
			this.jContentPaneDetalleTipoDocumentoPersonal.setLayout(gridaBagLayoutDetalleTipoDocumentoPersonal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDocumentoPersonal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDocumentoPersonal.add(jTtoolBarDetalleTipoDocumentoPersonal, gridBagConstraintsTipoDocumentoPersonal);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDocumentoPersonal=   new JScrollPane(jContentPaneDetalleTipoDocumentoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDocumentoPersonal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
	        
			this.jContentPaneDetalleTipoDocumentoPersonal.add(jPanelCamposTipoDocumentoPersonal, gridBagConstraintsTipoDocumentoPersonal);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipodocumentopersonalSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDocumentoPersonal= new GridBagConstraints();
						this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
						this.jContentPaneDetalleTipoDocumentoPersonal.add(this.jTabbedPaneRelacionesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDocumentoPersonal.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDocumentoPersonal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
					this.gridBagConstraintsTipoDocumentoPersonal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDocumentoPersonal.add(jPanelCamposOcultosTipoDocumentoPersonal, gridBagConstraintsTipoDocumentoPersonal);
				
					this.jPanelCamposOcultosTipoDocumentoPersonal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
	        this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDocumentoPersonal.add(this.jPanelAccionesFormularioTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);							
			
			
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
	        this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDocumentoPersonal.add(this.jPanelAccionesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDocumentoPersonal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDocumentoPersonal=   new JScrollPane(this.jPanelCamposTipoDocumentoPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
			this.gridBagConstraintsTipoDocumentoPersonal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDocumentoPersonal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDocumentoPersonal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);			
			
			this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
			
			
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		
			
		this.gridBagConstraintsTipoDocumentoPersonal = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumentoPersonal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumentoPersonal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDocumentoPersonal, this.gridBagConstraintsTipoDocumentoPersonal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDocumentoPersonal;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDocumentoPersonal;
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
