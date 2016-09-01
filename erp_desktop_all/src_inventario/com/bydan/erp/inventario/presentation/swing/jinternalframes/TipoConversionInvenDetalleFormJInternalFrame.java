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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoConversionInvenConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoConversionInvenDetalleFormJInternalFrame extends TipoConversionInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoConversionInven;
	
	protected JMenuBar jmenuBarDetalleTipoConversionInven;
	
	protected JMenu jmenuDetalleTipoConversionInven;
	protected JMenu jmenuDetalleArchivoTipoConversionInven;
	protected JMenu jmenuDetalleAccionesTipoConversionInven;
	protected JMenu jmenuDetalleDatosTipoConversionInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoConversionInven;	
	protected GridBagConstraints gridBagConstraintsTipoConversionInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoConversionInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoConversionInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoConversionInvenSessionBean tipoconversioninvenSessionBean;
	
	

	public ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFrame=null;
	public ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConversionInven=false;
	public ConversionInvenSessionBean conversioninvenSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoConversionInvenLogic tipoconversioninvenLogic;
	
	public JScrollPane jScrollPanelDatosTipoConversionInven;
	public JScrollPane jScrollPanelDatosEdicionTipoConversionInven;
	public JScrollPane jScrollPanelDatosGeneralTipoConversionInven;
	
	protected JPanel jPanelCamposTipoConversionInven;    
	protected JPanel jPanelCamposOcultosTipoConversionInven;    	
	protected JPanel jPanelAccionesTipoConversionInven;
	protected JPanel jPanelAccionesFormularioTipoConversionInven;
    
	
	
	protected Integer iXPanelCamposTipoConversionInven=0;
	protected Integer iYPanelCamposTipoConversionInven=0;
	
	protected Integer iXPanelCamposOcultosTipoConversionInven=0;
	protected Integer iYPanelCamposOcultosTipoConversionInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoConversionInven;
	public JButton jButtonModificarTipoConversionInven;
	public JButton jButtonActualizarTipoConversionInven;
    public JButton jButtonEliminarTipoConversionInven;
	public JButton jButtonCancelarTipoConversionInven;
    public JButton jButtonGuardarCambiosTipoConversionInven;
	public JButton jButtonGuardarCambiosTablaTipoConversionInven;
	protected JButton jButtonCerrarTipoConversionInven;
	
	
	protected JButton jButtonProcesarInformacionTipoConversionInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoConversionInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoConversionInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoConversionInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoConversionInven;
	protected JButton jButtonModificarToolBarTipoConversionInven;
	protected JButton jButtonActualizarToolBarTipoConversionInven;
    protected JButton jButtonEliminarToolBarTipoConversionInven;
	protected JButton jButtonCancelarToolBarTipoConversionInven;
    protected JButton jButtonGuardarCambiosToolBarTipoConversionInven;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoConversionInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoConversionInven;
	protected JButton jButtonCerrarToolBarTipoConversionInven;
	
	protected JButton jButtonProcesarInformacionToolBarTipoConversionInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoConversionInven;
	protected JMenuItem jMenuItemModificarTipoConversionInven;
	protected JMenuItem jMenuItemActualizarTipoConversionInven;
    protected JMenuItem jMenuItemEliminarTipoConversionInven;
	protected JMenuItem jMenuItemCancelarTipoConversionInven;
    protected JMenuItem jMenuItemGuardarCambiosTipoConversionInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoConversionInven;
	protected JMenuItem jMenuItemCerrarTipoConversionInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoConversionInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoConversionInven;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoConversionInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoConversionInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoConversionInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoConversionInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoConversionInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoConversionInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoConversionInven;
	public JLabel jLabelIdTipoConversionInven;
	public JLabel jLabelidTipoConversionInven;
	public JButton jButtonidTipoConversionInvenBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoConversionInven;
	public JLabel jLabelcodigoTipoConversionInven;
	public JTextField jTextFieldcodigoTipoConversionInven;
	public JButton jButtoncodigoTipoConversionInvenBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoConversionInven;
	public JLabel jLabelnombreTipoConversionInven;
	public JTextArea jTextAreanombreTipoConversionInven;
	public JScrollPane jscrollPanenombreTipoConversionInven;
	public JButton jButtonnombreTipoConversionInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoConversionInven;
	public JLabel jLabelid_empresaTipoConversionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoConversionInven;
	public JButton jButtonid_empresaTipoConversionInven= new JButtonMe();
	public JButton jButtonid_empresaTipoConversionInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoConversionInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoConversionInven;
	
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
	
	public TipoConversionInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoConversionInven=new JPanel();
				this.jPanelAccionesFormularioTipoConversionInven=new JPanel();
				this.jmenuBarDetalleTipoConversionInven=new JMenuBar();
				this.jTtoolBarDetalleTipoConversionInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConversionInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoConversionInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConversionInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConversionInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConversionInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoConversionInven() {
		return this.jButtonActualizarToolBarTipoConversionInven;
	}
	
	public JButton getjButtonEliminarToolBarTipoConversionInven() {
		return this.jButtonEliminarToolBarTipoConversionInven;
	}
	
	public JButton getjButtonCancelarToolBarTipoConversionInven() {
		return this.jButtonCancelarToolBarTipoConversionInven;
	}		
	
	public JButton getjButtonProcesarInformacionTipoConversionInven() {
		return this.jButtonProcesarInformacionTipoConversionInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoConversionInven)	{
		this.jButtonProcesarInformacionTipoConversionInven = jButtonProcesarInformacionTipoConversionInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoConversionInven() {
		return this.jComboBoxTiposAccionesTipoConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoConversionInven(
			JComboBox jComboBoxTiposRelacionesTipoConversionInven) {
		this.jComboBoxTiposRelacionesTipoConversionInven = jComboBoxTiposRelacionesTipoConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoConversionInven(
			JComboBox jComboBoxTiposAccionesTipoConversionInven) {
		this.jComboBoxTiposAccionesTipoConversionInven = jComboBoxTiposAccionesTipoConversionInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoConversionInven() {
		return this.jComboBoxTiposAccionesFormularioTipoConversionInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoConversionInven(
			JComboBox jComboBoxTiposAccionesFormularioTipoConversionInven) {
		this.jComboBoxTiposAccionesFormularioTipoConversionInven = jComboBoxTiposAccionesFormularioTipoConversionInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
		
		this.tipoconversioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconversioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoconversioninvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.conversioninvenSessionBean=new ConversionInvenSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoConversionInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Conversion Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoConversionInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoConversionInven=new JButtonMe();
				this.jButtonModificarToolBarTipoConversionInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoConversionInven,this.jTtoolBarDetalleTipoConversionInven,
							"actualizar","actualizar","Actualizar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoConversionInven,this.jTtoolBarDetalleTipoConversionInven,
							"eliminar","eliminar","Eliminar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoConversionInven,this.jTtoolBarDetalleTipoConversionInven,
							"cancelar","cancelar","Cancelar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoConversionInven,this.jTtoolBarDetalleTipoConversionInven,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoConversionInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoConversionInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoConversionInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoConversionInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoConversionInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoConversionInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoConversionInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoConversionInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoConversionInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoConversionInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoConversionInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoConversionInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoConversionInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoConversionInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoConversionInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoConversionInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoConversionInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoConversionInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoConversionInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoConversionInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoConversionInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoConversionInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoConversionInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoConversionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoConversionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoConversionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoConversionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoConversionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoConversionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoConversionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoConversionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoConversionInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoConversionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoConversionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoConversionInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoConversionInven.add(this.jMenuItemDetalleCerrarTipoConversionInven);
		
		this.jmenuDetalleAccionesTipoConversionInven.add(this.jMenuItemActualizarTipoConversionInven);
		this.jmenuDetalleAccionesTipoConversionInven.add(this.jMenuItemEliminarTipoConversionInven);
		this.jmenuDetalleAccionesTipoConversionInven.add(this.jMenuItemCancelarTipoConversionInven);		
		
		//this.jmenuDetalleDatosTipoConversionInven.add(this.jMenuItemDetalleAbrirOrderByTipoConversionInven);				
		this.jmenuDetalleDatosTipoConversionInven.add(this.jMenuItemDetalleMostarOcultarTipoConversionInven);				
				
		//this.jmenuDetalleAccionesTipoConversionInven.add(this.jMenuItemGuardarCambiosTipoConversionInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoConversionInven.add(this.jmenuDetalleArchivoTipoConversionInven);		
		this.jmenuBarDetalleTipoConversionInven.add(this.jmenuDetalleAccionesTipoConversionInven);		
		this.jmenuBarDetalleTipoConversionInven.add(this.jmenuDetalleDatosTipoConversionInven);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoConversionInven.add(this.jmenuDetalleTipoConversionInven);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoConversionInven);				
	}
	
	
	public void inicializarElementosCamposTipoConversionInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoConversionInven = new JLabelMe();
		jLabelIdTipoConversionInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoConversionInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoConversionInven.setToolTipText(TipoConversionInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoConversionInven= new GridBagLayout();

		this.jPanelidTipoConversionInven.setLayout(this.gridaBagLayoutTipoConversionInven);

		jLabelidTipoConversionInven = new JLabel();
		jLabelidTipoConversionInven.setText("Id");

		jLabelidTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoConversionInven = new JLabelMe();
		this.jLabelcodigoTipoConversionInven.setText(""+TipoConversionInvenConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoConversionInven.setToolTipText("Codigo");
		this.jLabelcodigoTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoConversionInven.setToolTipText(TipoConversionInvenConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoConversionInven = new GridBagLayout();
		this.jPanelcodigoTipoConversionInven.setLayout(this.gridaBagLayoutTipoConversionInven);


		jTextFieldcodigoTipoConversionInven= new JTextFieldMe();

		jTextFieldcodigoTipoConversionInven.setEnabled(false);
		jTextFieldcodigoTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoConversionInvenBusqueda= new JButtonMe();
		this.jButtoncodigoTipoConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoConversionInvenBusqueda.setText("U");
		this.jButtoncodigoTipoConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoConversionInvenBusqueda"));

		if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoConversionInvenBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoConversionInven = new JLabelMe();
		this.jLabelnombreTipoConversionInven.setText(""+TipoConversionInvenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoConversionInven.setToolTipText("Nombre");
		this.jLabelnombreTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoConversionInven.setToolTipText(TipoConversionInvenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoConversionInven = new GridBagLayout();
		this.jPanelnombreTipoConversionInven.setLayout(this.gridaBagLayoutTipoConversionInven);


		jTextAreanombreTipoConversionInven= new JTextAreaMe();
		jTextAreanombreTipoConversionInven.setEnabled(false);
		jTextAreanombreTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConversionInven.setLineWrap(true);
		jTextAreanombreTipoConversionInven.setWrapStyleWord(true);
		jTextAreanombreTipoConversionInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoConversionInven.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoConversionInven = new JScrollPane(jTextAreanombreTipoConversionInven);
		jscrollPanenombreTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoConversionInvenBusqueda= new JButtonMe();
		this.jButtonnombreTipoConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoConversionInvenBusqueda.setText("U");
		this.jButtonnombreTipoConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoConversionInvenBusqueda"));

		if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoConversionInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoConversionInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoConversionInven = new JLabelMe();
		this.jLabelid_empresaTipoConversionInven.setText(""+TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoConversionInven.setToolTipText("Empresa");
		this.jLabelid_empresaTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoConversionInven.setToolTipText(TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoConversionInven = new GridBagLayout();
		this.jPanelid_empresaTipoConversionInven.setLayout(this.gridaBagLayoutTipoConversionInven);


		jComboBoxid_empresaTipoConversionInven= new JComboBoxMe();
		jComboBoxid_empresaTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoConversionInven.setEnabled(false);

		this.jButtonid_empresaTipoConversionInven= new JButtonMe();
		this.jButtonid_empresaTipoConversionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoConversionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoConversionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoConversionInven.setText("Buscar");
		this.jButtonid_empresaTipoConversionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoConversionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoConversionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoConversionInven"));

		this.jButtonid_empresaTipoConversionInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoConversionInvenBusqueda.setText("U");
		this.jButtonid_empresaTipoConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoConversionInvenBusqueda"));

		if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoConversionInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoConversionInvenUpdate= new JButtonMe();
		this.jButtonid_empresaTipoConversionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoConversionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoConversionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoConversionInvenUpdate.setText("U");
		this.jButtonid_empresaTipoConversionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoConversionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoConversionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoConversionInvenUpdate"));



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
		//this.jInternalFrameDetalleTipoConversionInven = new TipoConversionInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Conversion Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoConversionInven= new GridBagLayout();
		

		
		String sToolTipTipoConversionInven="";
		sToolTipTipoConversionInven=TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoConversionInven+="(Inventario.TipoConversionInven)";
		}
		
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoConversionInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoConversionInven = new JButtonMe();
		this.jButtonModificarTipoConversionInven = new JButtonMe();
        this.jButtonActualizarTipoConversionInven = new JButtonMe();
        this.jButtonEliminarTipoConversionInven = new JButtonMe();
        this.jButtonCancelarTipoConversionInven = new JButtonMe();
        this.jButtonGuardarCambiosTipoConversionInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoConversionInven = new JButtonMe();
		this.jButtonCerrarTipoConversionInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoConversionInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoConversionInven = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoConversionInven = new JScrollPane();
				
		
		
		this.jPanelCamposTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Conversion Inven";
		
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conversion Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoConversionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoConversionInven.setName("jPanelCamposTipoConversionInven"); 

		this.jPanelCamposOcultosTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoConversionInven.setName("jPanelCamposOcultosTipoConversionInven"); 

        this.jPanelAccionesTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoConversionInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoConversionInven.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoConversionInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoConversionInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoConversionInven.setText("Nuevo");
		this.jButtonModificarTipoConversionInven.setText("Editar");
        this.jButtonActualizarTipoConversionInven.setText("Actualizar");
        this.jButtonEliminarTipoConversionInven.setText("Eliminar");
        this.jButtonCancelarTipoConversionInven.setText("Cancelar");
        this.jButtonGuardarCambiosTipoConversionInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoConversionInven.setText("Guardar");
		this.jButtonCerrarTipoConversionInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoConversionInven,"nuevo_button","Nuevo",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoConversionInven,"modificar_button","Editar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoConversionInven,"actualizar_button","Actualizar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoConversionInven,"eliminar_button","Eliminar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoConversionInven,"cancelar_button","Cancelar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoConversionInven,"guardarcambios_button","Guardar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoConversionInven,"guardarcambiostabla_button","Guardar",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoConversionInven,"cerrar_button","Salir",this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoConversionInven.setToolTipText("Nuevo"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoConversionInven.setToolTipText("Editar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoConversionInven.setToolTipText("Actualizar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoConversionInven.setToolTipText("Eliminar)"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoConversionInven.setToolTipText("Cancelar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoConversionInven.setToolTipText("Guardar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoConversionInven.setToolTipText("Guardar"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoConversionInven.setToolTipText("Salir"+" "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoConversionInven";
		inputMap = this.jButtonNuevoTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoConversionInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoConversionInven";
		inputMap = this.jButtonActualizarTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoConversionInven"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoConversionInven";
		inputMap = this.jButtonEliminarTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoConversionInven"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoConversionInven";
		inputMap = this.jButtonCancelarTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoConversionInven"));
		
		//CERRAR		
		sMapKey = "CerrarTipoConversionInven";
		inputMap = this.jButtonCerrarTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoConversionInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoConversionInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoConversionInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoConversionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoConversionInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoConversionInven.setToolTipText("Nuevo TipoConversionInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoConversionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoConversionInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoConversionInven.setToolTipText("Sin Cerrar Ventana TipoConversionInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoConversionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoConversionInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoConversionInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoConversionInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoConversionInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoConversionInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoConversionInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoConversionInven = new JLabelMe();
		
		this.jLabelAccionesTipoConversionInven.setText("Acciones");		
		this.jLabelAccionesTipoConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoConversionInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoConversionInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoConversionInven=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoConversionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConversionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConversionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoConversionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoConversionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoConversionInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoConversionInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoConversionInven = new GridBagLayout();
		
		this.jPanelCamposTipoConversionInven.setLayout(gridaBagLayoutCamposTipoConversionInven);
		this.jPanelCamposOcultosTipoConversionInven.setLayout(gridaBagLayoutCamposOcultosTipoConversionInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConversionInven.gridy = 0;
	this.gridBagConstraintsTipoConversionInven.gridx = 0;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoConversionInven.add(jLabelIdTipoConversionInven, this.gridBagConstraintsTipoConversionInven);



	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConversionInven.gridy = 0;
	this.gridBagConstraintsTipoConversionInven.gridx = 1;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoConversionInven.add(jLabelidTipoConversionInven, this.gridBagConstraintsTipoConversionInven);


	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConversionInven.gridy = 0;
	this.gridBagConstraintsTipoConversionInven.gridx = 0;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoConversionInven.add(jLabelid_empresaTipoConversionInven, this.gridBagConstraintsTipoConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = 0;
		this.gridBagConstraintsTipoConversionInven.gridx = 2;
		this.gridBagConstraintsTipoConversionInven.ipadx = 0;
		this.gridBagConstraintsTipoConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoConversionInven.add(jButtonid_empresaTipoConversionInvenBusqueda, this.gridBagConstraintsTipoConversionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = 0;
		this.gridBagConstraintsTipoConversionInven.gridx = 3;
		this.gridBagConstraintsTipoConversionInven.ipadx = 0;
		this.gridBagConstraintsTipoConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoConversionInven.add(jButtonid_empresaTipoConversionInvenUpdate, this.gridBagConstraintsTipoConversionInven);
	}

	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConversionInven.gridy = 0;
	this.gridBagConstraintsTipoConversionInven.gridx = 1;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoConversionInven.add(jComboBoxid_empresaTipoConversionInven, this.gridBagConstraintsTipoConversionInven);


	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConversionInven.gridy = 0;
	this.gridBagConstraintsTipoConversionInven.gridx = 0;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoConversionInven.add(jLabelcodigoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = 0;
		this.gridBagConstraintsTipoConversionInven.gridx = 2;
		this.gridBagConstraintsTipoConversionInven.ipadx = 0;
		this.gridBagConstraintsTipoConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoConversionInven.add(jButtoncodigoTipoConversionInvenBusqueda, this.gridBagConstraintsTipoConversionInven);
	}

	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConversionInven.gridy = 0;
	this.gridBagConstraintsTipoConversionInven.gridx = 1;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoConversionInven.add(jTextFieldcodigoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);


	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConversionInven.gridy = 0;
	this.gridBagConstraintsTipoConversionInven.gridx = 0;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoConversionInven.add(jLabelnombreTipoConversionInven, this.gridBagConstraintsTipoConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConversionInven.gridy = 0;
		this.gridBagConstraintsTipoConversionInven.gridx = 2;
		this.gridBagConstraintsTipoConversionInven.ipadx = 0;
		this.gridBagConstraintsTipoConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoConversionInven.add(jButtonnombreTipoConversionInvenBusqueda, this.gridBagConstraintsTipoConversionInven);
	}

	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConversionInven.gridy = 0;
	this.gridBagConstraintsTipoConversionInven.gridx = 1;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoConversionInven.add(jscrollPanenombreTipoConversionInven, this.gridBagConstraintsTipoConversionInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConversionInven.gridy = iYPanelCamposTipoConversionInven;
	this.gridBagConstraintsTipoConversionInven.gridx = iXPanelCamposTipoConversionInven++;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConversionInven.add(this.jPanelidTipoConversionInven, this.gridBagConstraintsTipoConversionInven);



	if(iXPanelCamposTipoConversionInven % 1==0) {
		iXPanelCamposTipoConversionInven=0;
		iYPanelCamposTipoConversionInven++;
	}
	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConversionInven.gridy = iYPanelCamposTipoConversionInven;
	this.gridBagConstraintsTipoConversionInven.gridx = iXPanelCamposTipoConversionInven++;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConversionInven.add(this.jPanelcodigoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);



	if(iXPanelCamposTipoConversionInven % 1==0) {
		iXPanelCamposTipoConversionInven=0;
		iYPanelCamposTipoConversionInven++;
	}
	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConversionInven.gridy = iYPanelCamposTipoConversionInven;
	this.gridBagConstraintsTipoConversionInven.gridx = iXPanelCamposTipoConversionInven++;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConversionInven.add(this.jPanelnombreTipoConversionInven, this.gridBagConstraintsTipoConversionInven);



	if(iXPanelCamposTipoConversionInven % 1==0) {
		iXPanelCamposTipoConversionInven=0;
		iYPanelCamposTipoConversionInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConversionInven.gridy = iYPanelCamposOcultosTipoConversionInven;
	this.gridBagConstraintsTipoConversionInven.gridx = iXPanelCamposOcultosTipoConversionInven++;
	this.gridBagConstraintsTipoConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoConversionInven.add(this.jPanelid_empresaTipoConversionInven, this.gridBagConstraintsTipoConversionInven);



	if(iXPanelCamposOcultosTipoConversionInven % 1==0) {
		iXPanelCamposOcultosTipoConversionInven=0;
		iYPanelCamposOcultosTipoConversionInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoConversionInven= new GridBagLayout();
		this.jPanelAccionesTipoConversionInven.setLayout(gridaBagLayoutAccionesTipoConversionInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoConversionInven= new GridBagLayout();
		this.jPanelAccionesFormularioTipoConversionInven.setLayout(gridaBagLayoutAccionesFormularioTipoConversionInven);
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoConversionInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoConversionInven.add(this.jComboBoxTiposAccionesFormularioTipoConversionInven, this.gridBagConstraintsTipoConversionInven);

		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoConversionInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoConversionInven.add(this.jCheckBoxPostAccionNuevoTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoConversionInven.add(this.jCheckBoxPostAccionSinCerrarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoConversionInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoConversionInven.add(this.jCheckBoxPostAccionSinMensajeTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = 0;
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoConversionInven.add(this.jButtonModificarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);							

		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConversionInven.gridy = 0;
		this.gridBagConstraintsTipoConversionInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoConversionInven.add(this.jButtonEliminarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
			
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = 0;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoConversionInven.add(this.jButtonActualizarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);


		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = 0;		
		this.gridBagConstraintsTipoConversionInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoConversionInven.add(this.jButtonGuardarCambiosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);	
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = 0;		
		this.gridBagConstraintsTipoConversionInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoConversionInven.add(this.jButtonCancelarTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoConversionInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoConversionInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConversionInven.gridx = 0;		
			//this.gridBagConstraintsTipoConversionInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoConversionInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoConversionInven.gridx =0;
		this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoConversionInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoConversionInven = new TipoConversionInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Conversion Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Conversion Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Conversion Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoConversionInvenModel tipoconversioninvenModel=new TipoConversionInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoConversionInvenModel.TipoConversionInvenFocusTraversalPolicy tipoconversioninvenFocusTraversalPolicy = tipoconversioninvenModel.new TipoConversionInvenFocusTraversalPolicy(this);
			
			//tipoconversioninvenFocusTraversalPolicy.settipoconversioninvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoconversioninvenModel);
			
			
			this.jContentPaneDetalleTipoConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoConversionInven = new GridBagLayout();	
			this.jContentPaneDetalleTipoConversionInven.setLayout(gridaBagLayoutDetalleTipoConversionInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoConversionInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
				this.gridBagConstraintsTipoConversionInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoConversionInven.gridx = 0;
					
				
				this.jContentPaneDetalleTipoConversionInven.add(jTtoolBarDetalleTipoConversionInven, gridBagConstraintsTipoConversionInven);								
				
}
			
			this.jScrollPanelDatosEdicionTipoConversionInven=   new JScrollPane(jContentPaneDetalleTipoConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoConversionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConversionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConversionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoConversionInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoConversionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConversionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConversionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoConversionInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoConversionInven.gridx = 0;
	        
			this.jContentPaneDetalleTipoConversionInven.add(jPanelCamposTipoConversionInven, gridBagConstraintsTipoConversionInven);
			
			
			
			
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
						&& tipoconversioninvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameConversionInven(this.puedeCargarPorParteConversionInven,false,-1);
					
					if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoConversionInven= new GridBagConstraints();
						this.gridBagConstraintsTipoConversionInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoConversionInven.gridx = 0;
						this.jContentPaneDetalleTipoConversionInven.add(this.jTabbedPaneRelacionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoConversionInven.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameConversionInven(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoConversionInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
					this.gridBagConstraintsTipoConversionInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoConversionInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoConversionInven.gridx = 0;
					
				
					this.jContentPaneDetalleTipoConversionInven.add(jPanelCamposOcultosTipoConversionInven, gridBagConstraintsTipoConversionInven);
				
					this.jPanelCamposOcultosTipoConversionInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoConversionInven.gridx = 0;
	        this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoConversionInven.add(this.jPanelAccionesFormularioTipoConversionInven, this.gridBagConstraintsTipoConversionInven);							
			
			
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
	        this.gridBagConstraintsTipoConversionInven.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoConversionInven.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoConversionInven.add(this.jPanelAccionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoConversionInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoConversionInven=   new JScrollPane(this.jPanelCamposTipoConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoConversionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConversionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConversionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoConversionInven.gridx = 0;
			this.gridBagConstraintsTipoConversionInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoConversionInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoConversionInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoConversionInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoConversionInven, this.gridBagConstraintsTipoConversionInven);			
			
			this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
			this.gridBagConstraintsTipoConversionInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoConversionInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
			
			
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		
			
		this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
		this.gridBagConstraintsTipoConversionInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoConversionInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoConversionInven, this.gridBagConstraintsTipoConversionInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoConversionInven;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoConversionInven;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameConversionInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.conversioninvenSessionBean=new ConversionInvenSessionBean();
		this.conversioninvenSessionBean.setConGuardarRelaciones(false);
		this.conversioninvenSessionBean.setEsGuardarRelacionado(true);

		this.conversioninvenBeanSwingJInternalFrame=null;//new ConversionInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.conversioninvenBeanSwingJInternalFramePopup=new ConversionInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.conversioninvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {

				ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=TipoConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.conversioninvenSessionBean.setEsGuardarRelacionado(true);

				this.conversioninvenBeanSwingJInternalFrame=new ConversionInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.conversioninvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.conversioninvenBeanSwingJInternalFrame.setconversioninvenSessionBean(this.conversioninvenSessionBean);

				//this.gridBagConstraintsTipoConversionInven = new GridBagConstraints();
				//this.gridBagConstraintsTipoConversionInven.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoConversionInven.gridx = 0;
				//this.jContentPaneDetalleTipoConversionInven.add(this.conversioninvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoConversionInven);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoConversionInven.add("Conversion Invenes",this.conversioninvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoConversionInven.setComponentAt(iIndexTab,this.conversioninvenBeanSwingJInternalFrame.getContentPane());
				}

				//ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.conversioninvenSessionBean.setEsGuardarRelacionado(false);
				this.conversioninvenBeanSwingJInternalFrame=null;//new ConversionInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConversionInven) {
					this.jTabbedPaneRelacionesTipoConversionInven.add("Conversion Invenes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarConversionInvenBeanSwingJInternalFrame(List<TipoConversionInven> tipoconversioninvens,TipoConversionInven tipoconversioninven,ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//conversioninvenBeanSwingJInternalFrame=new ConversionInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					conversioninvenBeanSwingJInternalFrame.getConversionInvenLogic().setConnexion(this.tipoconversioninvenLogic.getConnexion());

					conversioninvenBeanSwingJInternalFrame.settipoconversioninvensForeignKey(tipoconversioninvens);
					conversioninvenBeanSwingJInternalFrame.settipoconversioninvenForeignKey(tipoconversioninven);
					conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setisBusquedaDesdeForeignKeySesionTipoConversionInven(true);
					conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setlidTipoConversionInvenActual(tipoconversioninven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					conversioninvenBeanSwingJInternalFrame.cargarCombosForeignKeyConversionInven(conversioninvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					conversioninvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoConversionInven(true);
					conversioninvenBeanSwingJInternalFrame.setid_tipo_conversion_invenFK_IdTipoConversionInven(tipoconversioninven.getId());

					if(!this.conCargarFormDetalle) {
						conversioninvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					conversioninvenBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoConversionInvenForeignKey(tipoconversioninven,1,false,true,true);
					conversioninvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					conversioninvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoConversionInven");
					conversioninvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoConversionInven");
					conversioninvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaConversionInven(true);
					conversioninvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConversionInven("n",conversioninvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, conversioninvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					conversioninvenBeanSwingJInternalFrame.setAutoscrolls(true);
					conversioninvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						conversioninvenBeanSwingJInternalFrame.actualizarEstadoPanelsConversionInven("relacionado");
					} else {
						conversioninvenBeanSwingJInternalFrame.actualizarEstadoPanelsConversionInven("no_relacionado");
					}

					conversioninvenBeanSwingJInternalFrame.getjButtonRecargarInformacionConversionInven().setVisible(false);

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
