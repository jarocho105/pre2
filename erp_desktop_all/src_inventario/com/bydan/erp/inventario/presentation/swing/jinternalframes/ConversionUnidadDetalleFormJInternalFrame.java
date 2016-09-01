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
import com.bydan.erp.inventario.util.ConversionUnidadConstantesFunciones;

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
public class ConversionUnidadDetalleFormJInternalFrame extends ConversionUnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConversionUnidad;
	
	protected JMenuBar jmenuBarDetalleConversionUnidad;
	
	protected JMenu jmenuDetalleConversionUnidad;
	protected JMenu jmenuDetalleArchivoConversionUnidad;
	protected JMenu jmenuDetalleAccionesConversionUnidad;
	protected JMenu jmenuDetalleDatosConversionUnidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConversionUnidad;	
	protected GridBagConstraints gridBagConstraintsConversionUnidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConversionUnidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleConversionUnidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected UnidadBeanSwingJInternalFrame unidaddesdeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidaddesde="";

	protected UnidadBeanSwingJInternalFrame unidadhastaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidadhasta="";
	
	public ConversionUnidadSessionBean conversionunidadSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public UnidadSessionBean unidaddesdeSessionBean;
	public UnidadSessionBean unidadhastaSessionBean;	
	
	public ConversionUnidadLogic conversionunidadLogic;
	
	public JScrollPane jScrollPanelDatosConversionUnidad;
	public JScrollPane jScrollPanelDatosEdicionConversionUnidad;
	public JScrollPane jScrollPanelDatosGeneralConversionUnidad;
	
	protected JPanel jPanelCamposConversionUnidad;    
	protected JPanel jPanelCamposOcultosConversionUnidad;    	
	protected JPanel jPanelAccionesConversionUnidad;
	protected JPanel jPanelAccionesFormularioConversionUnidad;
    
	
	
	protected Integer iXPanelCamposConversionUnidad=0;
	protected Integer iYPanelCamposConversionUnidad=0;
	
	protected Integer iXPanelCamposOcultosConversionUnidad=0;
	protected Integer iYPanelCamposOcultosConversionUnidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConversionUnidad;
	public JButton jButtonModificarConversionUnidad;
	public JButton jButtonActualizarConversionUnidad;
    public JButton jButtonEliminarConversionUnidad;
	public JButton jButtonCancelarConversionUnidad;
    public JButton jButtonGuardarCambiosConversionUnidad;
	public JButton jButtonGuardarCambiosTablaConversionUnidad;
	protected JButton jButtonCerrarConversionUnidad;
	
	
	protected JButton jButtonProcesarInformacionConversionUnidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConversionUnidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConversionUnidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConversionUnidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConversionUnidad;
	protected JButton jButtonModificarToolBarConversionUnidad;
	protected JButton jButtonActualizarToolBarConversionUnidad;
    protected JButton jButtonEliminarToolBarConversionUnidad;
	protected JButton jButtonCancelarToolBarConversionUnidad;
    protected JButton jButtonGuardarCambiosToolBarConversionUnidad;
	protected JButton jButtonGuardarCambiosTablaToolBarConversionUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarConversionUnidad;
	protected JButton jButtonCerrarToolBarConversionUnidad;
	
	protected JButton jButtonProcesarInformacionToolBarConversionUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConversionUnidad;
	protected JMenuItem jMenuItemModificarConversionUnidad;
	protected JMenuItem jMenuItemActualizarConversionUnidad;
    protected JMenuItem jMenuItemEliminarConversionUnidad;
	protected JMenuItem jMenuItemCancelarConversionUnidad;
    protected JMenuItem jMenuItemGuardarCambiosConversionUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaConversionUnidad;
	protected JMenuItem jMenuItemCerrarConversionUnidad;
	protected JMenuItem jMenuItemDetalleCerrarConversionUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarConversionUnidad;
	
	protected JMenuItem jMenuItemProcesarInformacionConversionUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConversionUnidad;
	protected JMenuItem jMenuItemMostrarOcultarConversionUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConversionUnidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConversionUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConversionUnidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConversionUnidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConversionUnidad;
	public JLabel jLabelIdConversionUnidad;
	public JLabel jLabelidConversionUnidad;
	public JButton jButtonidConversionUnidadBusqueda= new JButtonMe();

	public JPanel jPanelvalorConversionUnidad;
	public JLabel jLabelvalorConversionUnidad;
	public JTextField jTextFieldvalorConversionUnidad;
	public JButton jButtonvalorConversionUnidadBusqueda= new JButtonMe();

	public JPanel jPanelrelacionConversionUnidad;
	public JLabel jLabelrelacionConversionUnidad;
	public JTextField jTextFieldrelacionConversionUnidad;
	public JButton jButtonrelacionConversionUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConversionUnidad;
	public JLabel jLabelid_empresaConversionUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConversionUnidad;
	public JButton jButtonid_empresaConversionUnidad= new JButtonMe();
	public JButton jButtonid_empresaConversionUnidadUpdate= new JButtonMe();
	public JButton jButtonid_empresaConversionUnidadBusqueda= new JButtonMe();

	public JPanel jPanelid_unidad_desdeConversionUnidad;
	public JLabel jLabelid_unidad_desdeConversionUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidad_desdeConversionUnidad;
	public JButton jButtonid_unidad_desdeConversionUnidad= new JButtonMe();
	public JButton jButtonid_unidad_desdeConversionUnidadUpdate= new JButtonMe();
	public JButton jButtonid_unidad_desdeConversionUnidadBusqueda= new JButtonMe();

	public JPanel jPanelid_unidad_hastaConversionUnidad;
	public JLabel jLabelid_unidad_hastaConversionUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidad_hastaConversionUnidad;
	public JButton jButtonid_unidad_hastaConversionUnidad= new JButtonMe();
	public JButton jButtonid_unidad_hastaConversionUnidadUpdate= new JButtonMe();
	public JButton jButtonid_unidad_hastaConversionUnidadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConversionUnidad;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConversionUnidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConversionUnidad=new JPanel();
				this.jPanelAccionesFormularioConversionUnidad=new JPanel();
				this.jmenuBarDetalleConversionUnidad=new JMenuBar();
				this.jTtoolBarDetalleConversionUnidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionUnidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConversionUnidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionUnidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionUnidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionUnidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConversionUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConversionUnidad() {
		return this.jButtonActualizarToolBarConversionUnidad;
	}
	
	public JButton getjButtonEliminarToolBarConversionUnidad() {
		return this.jButtonEliminarToolBarConversionUnidad;
	}
	
	public JButton getjButtonCancelarToolBarConversionUnidad() {
		return this.jButtonCancelarToolBarConversionUnidad;
	}		
	
	public JButton getjButtonProcesarInformacionConversionUnidad() {
		return this.jButtonProcesarInformacionConversionUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConversionUnidad)	{
		this.jButtonProcesarInformacionConversionUnidad = jButtonProcesarInformacionConversionUnidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConversionUnidad() {
		return this.jComboBoxTiposAccionesConversionUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConversionUnidad(
			JComboBox jComboBoxTiposRelacionesConversionUnidad) {
		this.jComboBoxTiposRelacionesConversionUnidad = jComboBoxTiposRelacionesConversionUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConversionUnidad(
			JComboBox jComboBoxTiposAccionesConversionUnidad) {
		this.jComboBoxTiposAccionesConversionUnidad = jComboBoxTiposAccionesConversionUnidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConversionUnidad() {
		return this.jComboBoxTiposAccionesFormularioConversionUnidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConversionUnidad(
			JComboBox jComboBoxTiposAccionesFormularioConversionUnidad) {
		this.jComboBoxTiposAccionesFormularioConversionUnidad = jComboBoxTiposAccionesFormularioConversionUnidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
		
		this.conversionunidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conversionunidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conversionunidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConversionUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConversionUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConversionUnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conversion Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
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
	
		ConversionUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConversionUnidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConversionUnidad=new JButtonMe();
				this.jButtonModificarToolBarConversionUnidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConversionUnidad,this.jTtoolBarDetalleConversionUnidad,
							"actualizar","actualizar","Actualizar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConversionUnidad,this.jTtoolBarDetalleConversionUnidad,
							"eliminar","eliminar","Eliminar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConversionUnidad,this.jTtoolBarDetalleConversionUnidad,
							"cancelar","cancelar","Cancelar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConversionUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConversionUnidad,this.jTtoolBarDetalleConversionUnidad,
							"guardarcambios","guardarcambios","Guardar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConversionUnidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConversionUnidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConversionUnidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConversionUnidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConversionUnidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConversionUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConversionUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConversionUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConversionUnidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConversionUnidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConversionUnidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConversionUnidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConversionUnidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConversionUnidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConversionUnidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConversionUnidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConversionUnidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConversionUnidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConversionUnidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConversionUnidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConversionUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConversionUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConversionUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConversionUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConversionUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConversionUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConversionUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConversionUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConversionUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConversionUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConversionUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConversionUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConversionUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConversionUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConversionUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConversionUnidad.add(this.jMenuItemDetalleCerrarConversionUnidad);
		
		this.jmenuDetalleAccionesConversionUnidad.add(this.jMenuItemActualizarConversionUnidad);
		this.jmenuDetalleAccionesConversionUnidad.add(this.jMenuItemEliminarConversionUnidad);
		this.jmenuDetalleAccionesConversionUnidad.add(this.jMenuItemCancelarConversionUnidad);		
		
		//this.jmenuDetalleDatosConversionUnidad.add(this.jMenuItemDetalleAbrirOrderByConversionUnidad);				
		this.jmenuDetalleDatosConversionUnidad.add(this.jMenuItemDetalleMostarOcultarConversionUnidad);				
				
		//this.jmenuDetalleAccionesConversionUnidad.add(this.jMenuItemGuardarCambiosConversionUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConversionUnidad.add(this.jmenuDetalleArchivoConversionUnidad);		
		this.jmenuBarDetalleConversionUnidad.add(this.jmenuDetalleAccionesConversionUnidad);		
		this.jmenuBarDetalleConversionUnidad.add(this.jmenuDetalleDatosConversionUnidad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConversionUnidad);				
	}
	
	
	public void inicializarElementosCamposConversionUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConversionUnidad = new JLabelMe();
		jLabelIdConversionUnidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConversionUnidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConversionUnidad.setToolTipText(ConversionUnidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConversionUnidad= new GridBagLayout();

		this.jPanelidConversionUnidad.setLayout(this.gridaBagLayoutConversionUnidad);

		jLabelidConversionUnidad = new JLabel();
		jLabelidConversionUnidad.setText("Id");

		jLabelidConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorConversionUnidad = new JLabelMe();
		this.jLabelvalorConversionUnidad.setText(""+ConversionUnidadConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorConversionUnidad.setToolTipText("Valor");
		this.jLabelvalorConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorConversionUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorConversionUnidad.setToolTipText(ConversionUnidadConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutConversionUnidad = new GridBagLayout();
		this.jPanelvalorConversionUnidad.setLayout(this.gridaBagLayoutConversionUnidad);


		jTextFieldvalorConversionUnidad= new JTextFieldMe();
		jTextFieldvalorConversionUnidad.setEnabled(false);
		jTextFieldvalorConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorConversionUnidad.setText("0.0");

		this.jButtonvalorConversionUnidadBusqueda= new JButtonMe();
		this.jButtonvalorConversionUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorConversionUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorConversionUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorConversionUnidadBusqueda.setText("U");
		this.jButtonvalorConversionUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorConversionUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorConversionUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorConversionUnidadBusqueda"));

		if(this.conversionunidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorConversionUnidadBusqueda.setVisible(false);		}


					
		this.jLabelrelacionConversionUnidad = new JLabelMe();
		this.jLabelrelacionConversionUnidad.setText(""+ConversionUnidadConstantesFunciones.LABEL_RELACION+" : *");
		this.jLabelrelacionConversionUnidad.setToolTipText("Relacion");
		this.jLabelrelacionConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrelacionConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrelacionConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrelacionConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrelacionConversionUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrelacionConversionUnidad.setToolTipText(ConversionUnidadConstantesFunciones.LABEL_RELACION);
		this.gridaBagLayoutConversionUnidad = new GridBagLayout();
		this.jPanelrelacionConversionUnidad.setLayout(this.gridaBagLayoutConversionUnidad);


		jTextFieldrelacionConversionUnidad= new JTextFieldMe();
		jTextFieldrelacionConversionUnidad.setEnabled(false);
		jTextFieldrelacionConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrelacionConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrelacionConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrelacionConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldrelacionConversionUnidad.setText("0.0");

		this.jButtonrelacionConversionUnidadBusqueda= new JButtonMe();
		this.jButtonrelacionConversionUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrelacionConversionUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrelacionConversionUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrelacionConversionUnidadBusqueda.setText("U");
		this.jButtonrelacionConversionUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrelacionConversionUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrelacionConversionUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrelacionConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrelacionConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"relacionConversionUnidadBusqueda"));

		if(this.conversionunidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrelacionConversionUnidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConversionUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConversionUnidad = new JLabelMe();
		this.jLabelid_empresaConversionUnidad.setText(""+ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConversionUnidad.setToolTipText("Empresa");
		this.jLabelid_empresaConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConversionUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConversionUnidad.setToolTipText(ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConversionUnidad = new GridBagLayout();
		this.jPanelid_empresaConversionUnidad.setLayout(this.gridaBagLayoutConversionUnidad);


		jComboBoxid_empresaConversionUnidad= new JComboBoxMe();
		jComboBoxid_empresaConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConversionUnidad.setEnabled(false);

		this.jButtonid_empresaConversionUnidad= new JButtonMe();
		this.jButtonid_empresaConversionUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConversionUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConversionUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConversionUnidad.setText("Buscar");
		this.jButtonid_empresaConversionUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConversionUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConversionUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConversionUnidad"));

		this.jButtonid_empresaConversionUnidadBusqueda= new JButtonMe();
		this.jButtonid_empresaConversionUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConversionUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConversionUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConversionUnidadBusqueda.setText("U");
		this.jButtonid_empresaConversionUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConversionUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConversionUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConversionUnidadBusqueda"));

		if(this.conversionunidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConversionUnidadBusqueda.setVisible(false);		}

		this.jButtonid_empresaConversionUnidadUpdate= new JButtonMe();
		this.jButtonid_empresaConversionUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConversionUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConversionUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConversionUnidadUpdate.setText("U");
		this.jButtonid_empresaConversionUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConversionUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConversionUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConversionUnidadUpdate"));



					
		this.jLabelid_unidad_desdeConversionUnidad = new JLabelMe();
		this.jLabelid_unidad_desdeConversionUnidad.setText(""+ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE+" : *");
		this.jLabelid_unidad_desdeConversionUnidad.setToolTipText("Unidad Desde");
		this.jLabelid_unidad_desdeConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidad_desdeConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidad_desdeConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidad_desdeConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidad_desdeConversionUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidad_desdeConversionUnidad.setToolTipText(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE);
		this.gridaBagLayoutConversionUnidad = new GridBagLayout();
		this.jPanelid_unidad_desdeConversionUnidad.setLayout(this.gridaBagLayoutConversionUnidad);


		jComboBoxid_unidad_desdeConversionUnidad= new JComboBoxMe();
		jComboBoxid_unidad_desdeConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_desdeConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_desdeConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidad_desdeConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidad_desdeConversionUnidad= new JButtonMe();
		this.jButtonid_unidad_desdeConversionUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_desdeConversionUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_desdeConversionUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_desdeConversionUnidad.setText("Buscar");
		this.jButtonid_unidad_desdeConversionUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidad_desdeConversionUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_desdeConversionUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidad_desdeConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_desdeConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_desdeConversionUnidad"));

		this.jButtonid_unidad_desdeConversionUnidadBusqueda= new JButtonMe();
		this.jButtonid_unidad_desdeConversionUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_desdeConversionUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_desdeConversionUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidad_desdeConversionUnidadBusqueda.setText("U");
		this.jButtonid_unidad_desdeConversionUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidad_desdeConversionUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_desdeConversionUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidad_desdeConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_desdeConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_desdeConversionUnidadBusqueda"));

		if(this.conversionunidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidad_desdeConversionUnidadBusqueda.setVisible(false);		}

		this.jButtonid_unidad_desdeConversionUnidadUpdate= new JButtonMe();
		this.jButtonid_unidad_desdeConversionUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_desdeConversionUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_desdeConversionUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidad_desdeConversionUnidadUpdate.setText("U");
		this.jButtonid_unidad_desdeConversionUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidad_desdeConversionUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_desdeConversionUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidad_desdeConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_desdeConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_desdeConversionUnidadUpdate"));



					
		this.jLabelid_unidad_hastaConversionUnidad = new JLabelMe();
		this.jLabelid_unidad_hastaConversionUnidad.setText(""+ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA+" : *");
		this.jLabelid_unidad_hastaConversionUnidad.setToolTipText("Unidad Hasta");
		this.jLabelid_unidad_hastaConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidad_hastaConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidad_hastaConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidad_hastaConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidad_hastaConversionUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidad_hastaConversionUnidad.setToolTipText(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA);
		this.gridaBagLayoutConversionUnidad = new GridBagLayout();
		this.jPanelid_unidad_hastaConversionUnidad.setLayout(this.gridaBagLayoutConversionUnidad);


		jComboBoxid_unidad_hastaConversionUnidad= new JComboBoxMe();
		jComboBoxid_unidad_hastaConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_hastaConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_hastaConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidad_hastaConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidad_hastaConversionUnidad= new JButtonMe();
		this.jButtonid_unidad_hastaConversionUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_hastaConversionUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_hastaConversionUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_hastaConversionUnidad.setText("Buscar");
		this.jButtonid_unidad_hastaConversionUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidad_hastaConversionUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_hastaConversionUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidad_hastaConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_hastaConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_hastaConversionUnidad"));

		this.jButtonid_unidad_hastaConversionUnidadBusqueda= new JButtonMe();
		this.jButtonid_unidad_hastaConversionUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_hastaConversionUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_hastaConversionUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidad_hastaConversionUnidadBusqueda.setText("U");
		this.jButtonid_unidad_hastaConversionUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidad_hastaConversionUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_hastaConversionUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidad_hastaConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_hastaConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_hastaConversionUnidadBusqueda"));

		if(this.conversionunidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidad_hastaConversionUnidadBusqueda.setVisible(false);		}

		this.jButtonid_unidad_hastaConversionUnidadUpdate= new JButtonMe();
		this.jButtonid_unidad_hastaConversionUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_hastaConversionUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_hastaConversionUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidad_hastaConversionUnidadUpdate.setText("U");
		this.jButtonid_unidad_hastaConversionUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidad_hastaConversionUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_hastaConversionUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidad_hastaConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_hastaConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_hastaConversionUnidadUpdate"));



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
		//this.jInternalFrameDetalleConversionUnidad = new ConversionUnidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Conversion Unidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConversionUnidad= new GridBagLayout();
		

		
		String sToolTipConversionUnidad="";
		sToolTipConversionUnidad=ConversionUnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConversionUnidad+="(Inventario.ConversionUnidad)";
		}
		
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipConversionUnidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConversionUnidad = new JButtonMe();
		this.jButtonModificarConversionUnidad = new JButtonMe();
        this.jButtonActualizarConversionUnidad = new JButtonMe();
        this.jButtonEliminarConversionUnidad = new JButtonMe();
        this.jButtonCancelarConversionUnidad = new JButtonMe();
        this.jButtonGuardarCambiosConversionUnidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaConversionUnidad = new JButtonMe();
		this.jButtonCerrarConversionUnidad = new JButtonMe();
		
		this.jScrollPanelDatosConversionUnidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionConversionUnidad = new JScrollPane();
		this.jScrollPanelDatosGeneralConversionUnidad = new JScrollPane();
				
		
		
		this.jPanelCamposConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Conversion Unidad";
		
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Unidades" + this.sPath));
		} else {
			this.jScrollPanelDatosConversionUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConversionUnidad.setName("jPanelCamposConversionUnidad"); 

		this.jPanelCamposOcultosConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConversionUnidad.setName("jPanelCamposOcultosConversionUnidad"); 

        this.jPanelAccionesConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConversionUnidad.setToolTipText("Acciones");
        this.jPanelAccionesConversionUnidad.setName("Acciones"); 

		this.jPanelAccionesFormularioConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConversionUnidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConversionUnidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConversionUnidad.setText("Nuevo");
		this.jButtonModificarConversionUnidad.setText("Editar");
        this.jButtonActualizarConversionUnidad.setText("Actualizar");
        this.jButtonEliminarConversionUnidad.setText("Eliminar");
        this.jButtonCancelarConversionUnidad.setText("Cancelar");
        this.jButtonGuardarCambiosConversionUnidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaConversionUnidad.setText("Guardar");
		this.jButtonCerrarConversionUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConversionUnidad,"nuevo_button","Nuevo",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConversionUnidad,"modificar_button","Editar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConversionUnidad,"actualizar_button","Actualizar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConversionUnidad,"eliminar_button","Eliminar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConversionUnidad,"cancelar_button","Cancelar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConversionUnidad,"guardarcambios_button","Guardar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConversionUnidad,"guardarcambiostabla_button","Guardar",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConversionUnidad,"cerrar_button","Salir",this.conversionunidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConversionUnidad.setToolTipText("Nuevo"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConversionUnidad.setToolTipText("Editar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConversionUnidad.setToolTipText("Actualizar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConversionUnidad.setToolTipText("Eliminar)"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConversionUnidad.setToolTipText("Cancelar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConversionUnidad.setToolTipText("Guardar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConversionUnidad.setToolTipText("Guardar"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConversionUnidad.setToolTipText("Salir"+" "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConversionUnidad";
		inputMap = this.jButtonNuevoConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConversionUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConversionUnidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConversionUnidad";
		inputMap = this.jButtonActualizarConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConversionUnidad"));
		
		//ELIMINAR
		sMapKey = "EliminarConversionUnidad";
		inputMap = this.jButtonEliminarConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConversionUnidad"));
		
		//CANCELAR	
		sMapKey = "CancelarConversionUnidad";
		inputMap = this.jButtonCancelarConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConversionUnidad"));
		
		//CERRAR		
		sMapKey = "CerrarConversionUnidad";
		inputMap = this.jButtonCerrarConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConversionUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConversionUnidad";
		inputMap = this.jButtonGuardarCambiosTablaConversionUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConversionUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConversionUnidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConversionUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConversionUnidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConversionUnidad.setToolTipText("Nuevo ConversionUnidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConversionUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConversionUnidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConversionUnidad.setToolTipText("Sin Cerrar Ventana ConversionUnidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConversionUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConversionUnidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConversionUnidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConversionUnidad.setText("Accion");
		this.jComboBoxTiposAccionesConversionUnidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConversionUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConversionUnidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConversionUnidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConversionUnidad = new JLabelMe();
		
		this.jLabelAccionesConversionUnidad.setText("Acciones");		
		this.jLabelAccionesConversionUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConversionUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConversionUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConversionUnidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConversionUnidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConversionUnidad=new JTabbedPane();
		this.jTabbedPaneRelacionesConversionUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConversionUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConversionUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConversionUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConversionUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConversionUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConversionUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConversionUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConversionUnidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConversionUnidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConversionUnidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConversionUnidad = new GridBagLayout();
		
		this.jPanelCamposConversionUnidad.setLayout(gridaBagLayoutCamposConversionUnidad);
		this.jPanelCamposOcultosConversionUnidad.setLayout(gridaBagLayoutCamposOcultosConversionUnidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 0;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConversionUnidad.add(jLabelIdConversionUnidad, this.gridBagConstraintsConversionUnidad);



	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 1;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConversionUnidad.add(jLabelidConversionUnidad, this.gridBagConstraintsConversionUnidad);


	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 0;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConversionUnidad.add(jLabelid_empresaConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 2;
		this.gridBagConstraintsConversionUnidad.ipadx = 0;
		this.gridBagConstraintsConversionUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConversionUnidad.add(jButtonid_empresaConversionUnidadBusqueda, this.gridBagConstraintsConversionUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 3;
		this.gridBagConstraintsConversionUnidad.ipadx = 0;
		this.gridBagConstraintsConversionUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConversionUnidad.add(jButtonid_empresaConversionUnidadUpdate, this.gridBagConstraintsConversionUnidad);
	}

	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 1;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConversionUnidad.add(jComboBoxid_empresaConversionUnidad, this.gridBagConstraintsConversionUnidad);


	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 0;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidad_desdeConversionUnidad.add(jLabelid_unidad_desdeConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 2;
		this.gridBagConstraintsConversionUnidad.ipadx = 0;
		this.gridBagConstraintsConversionUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidad_desdeConversionUnidad.add(jButtonid_unidad_desdeConversionUnidadBusqueda, this.gridBagConstraintsConversionUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 3;
		this.gridBagConstraintsConversionUnidad.ipadx = 0;
		this.gridBagConstraintsConversionUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidad_desdeConversionUnidad.add(jButtonid_unidad_desdeConversionUnidadUpdate, this.gridBagConstraintsConversionUnidad);
	}

	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 1;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidad_desdeConversionUnidad.add(jComboBoxid_unidad_desdeConversionUnidad, this.gridBagConstraintsConversionUnidad);


	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 0;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidad_hastaConversionUnidad.add(jLabelid_unidad_hastaConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 2;
		this.gridBagConstraintsConversionUnidad.ipadx = 0;
		this.gridBagConstraintsConversionUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidad_hastaConversionUnidad.add(jButtonid_unidad_hastaConversionUnidadBusqueda, this.gridBagConstraintsConversionUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 3;
		this.gridBagConstraintsConversionUnidad.ipadx = 0;
		this.gridBagConstraintsConversionUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidad_hastaConversionUnidad.add(jButtonid_unidad_hastaConversionUnidadUpdate, this.gridBagConstraintsConversionUnidad);
	}

	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 1;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidad_hastaConversionUnidad.add(jComboBoxid_unidad_hastaConversionUnidad, this.gridBagConstraintsConversionUnidad);


	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 0;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorConversionUnidad.add(jLabelvalorConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 2;
		this.gridBagConstraintsConversionUnidad.ipadx = 0;
		this.gridBagConstraintsConversionUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorConversionUnidad.add(jButtonvalorConversionUnidadBusqueda, this.gridBagConstraintsConversionUnidad);
	}

	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 1;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorConversionUnidad.add(jTextFieldvalorConversionUnidad, this.gridBagConstraintsConversionUnidad);


	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 0;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrelacionConversionUnidad.add(jLabelrelacionConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		//this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = 2;
		this.gridBagConstraintsConversionUnidad.ipadx = 0;
		this.gridBagConstraintsConversionUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelrelacionConversionUnidad.add(jButtonrelacionConversionUnidadBusqueda, this.gridBagConstraintsConversionUnidad);
	}

	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionUnidad.gridy = 0;
	this.gridBagConstraintsConversionUnidad.gridx = 1;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrelacionConversionUnidad.add(jTextFieldrelacionConversionUnidad, this.gridBagConstraintsConversionUnidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionUnidad.gridy = iYPanelCamposConversionUnidad;
	this.gridBagConstraintsConversionUnidad.gridx = iXPanelCamposConversionUnidad++;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionUnidad.add(this.jPanelidConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(iXPanelCamposConversionUnidad % 1==0) {
		iXPanelCamposConversionUnidad=0;
		iYPanelCamposConversionUnidad++;
	}
	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionUnidad.gridy = iYPanelCamposConversionUnidad;
	this.gridBagConstraintsConversionUnidad.gridx = iXPanelCamposConversionUnidad++;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionUnidad.add(this.jPanelid_unidad_desdeConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(iXPanelCamposConversionUnidad % 1==0) {
		iXPanelCamposConversionUnidad=0;
		iYPanelCamposConversionUnidad++;
	}
	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionUnidad.gridy = iYPanelCamposConversionUnidad;
	this.gridBagConstraintsConversionUnidad.gridx = iXPanelCamposConversionUnidad++;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionUnidad.add(this.jPanelid_unidad_hastaConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(iXPanelCamposConversionUnidad % 1==0) {
		iXPanelCamposConversionUnidad=0;
		iYPanelCamposConversionUnidad++;
	}
	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionUnidad.gridy = iYPanelCamposConversionUnidad;
	this.gridBagConstraintsConversionUnidad.gridx = iXPanelCamposConversionUnidad++;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionUnidad.add(this.jPanelvalorConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(iXPanelCamposConversionUnidad % 1==0) {
		iXPanelCamposConversionUnidad=0;
		iYPanelCamposConversionUnidad++;
	}
	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionUnidad.gridy = iYPanelCamposConversionUnidad;
	this.gridBagConstraintsConversionUnidad.gridx = iXPanelCamposConversionUnidad++;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionUnidad.add(this.jPanelrelacionConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(iXPanelCamposConversionUnidad % 1==0) {
		iXPanelCamposConversionUnidad=0;
		iYPanelCamposConversionUnidad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionUnidad.gridy = iYPanelCamposOcultosConversionUnidad;
	this.gridBagConstraintsConversionUnidad.gridx = iXPanelCamposOcultosConversionUnidad++;
	this.gridBagConstraintsConversionUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConversionUnidad.add(this.jPanelid_empresaConversionUnidad, this.gridBagConstraintsConversionUnidad);



	if(iXPanelCamposOcultosConversionUnidad % 1==0) {
		iXPanelCamposOcultosConversionUnidad=0;
		iYPanelCamposOcultosConversionUnidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesConversionUnidad= new GridBagLayout();
		this.jPanelAccionesConversionUnidad.setLayout(gridaBagLayoutAccionesConversionUnidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConversionUnidad= new GridBagLayout();
		this.jPanelAccionesFormularioConversionUnidad.setLayout(gridaBagLayoutAccionesFormularioConversionUnidad);
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConversionUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConversionUnidad.add(this.jComboBoxTiposAccionesFormularioConversionUnidad, this.gridBagConstraintsConversionUnidad);

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConversionUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConversionUnidad.add(this.jCheckBoxPostAccionNuevoConversionUnidad, this.gridBagConstraintsConversionUnidad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.conversionunidadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConversionUnidad.add(this.jCheckBoxPostAccionSinCerrarConversionUnidad, this.gridBagConstraintsConversionUnidad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.conversionunidadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConversionUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConversionUnidad.add(this.jCheckBoxPostAccionSinMensajeConversionUnidad, this.gridBagConstraintsConversionUnidad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesConversionUnidad.add(this.jButtonModificarConversionUnidad, this.gridBagConstraintsConversionUnidad);							

		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionUnidad.gridy = 0;
		this.gridBagConstraintsConversionUnidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesConversionUnidad.add(this.jButtonEliminarConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
			
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = 0;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesConversionUnidad.add(this.jButtonActualizarConversionUnidad, this.gridBagConstraintsConversionUnidad);


		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = 0;		
		this.gridBagConstraintsConversionUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesConversionUnidad.add(this.jButtonGuardarCambiosConversionUnidad, this.gridBagConstraintsConversionUnidad);	
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = 0;		
		this.gridBagConstraintsConversionUnidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesConversionUnidad.add(this.jButtonCancelarConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConversionUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConversionUnidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();						
			this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConversionUnidad.gridx = 0;		
			//this.gridBagConstraintsConversionUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConversionUnidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConversionUnidad.gridx =0;
		this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConversionUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConversionUnidad, this.gridBagConstraintsConversionUnidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConversionUnidad = new ConversionUnidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Conversion Unidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Conversion Unidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conversion Unidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConversionUnidadModel conversionunidadModel=new ConversionUnidadModel(this);
			
			//SI USARA CLASE INTERNA
			//ConversionUnidadModel.ConversionUnidadFocusTraversalPolicy conversionunidadFocusTraversalPolicy = conversionunidadModel.new ConversionUnidadFocusTraversalPolicy(this);
			
			//conversionunidadFocusTraversalPolicy.setconversionunidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(conversionunidadModel);
			
			
			this.jContentPaneDetalleConversionUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConversionUnidad = new GridBagLayout();	
			this.jContentPaneDetalleConversionUnidad.setLayout(gridaBagLayoutDetalleConversionUnidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConversionUnidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
				this.gridBagConstraintsConversionUnidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConversionUnidad.gridx = 0;
					
				
				this.jContentPaneDetalleConversionUnidad.add(jTtoolBarDetalleConversionUnidad, gridBagConstraintsConversionUnidad);								
				
}
			
			this.jScrollPanelDatosEdicionConversionUnidad=   new JScrollPane(jContentPaneDetalleConversionUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConversionUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConversionUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConversionUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConversionUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConversionUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConversionUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConversionUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConversionUnidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConversionUnidad.gridx = 0;
	        
			this.jContentPaneDetalleConversionUnidad.add(jPanelCamposConversionUnidad, gridBagConstraintsConversionUnidad);
			
			
			
			
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
						&& conversionunidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConversionUnidad= new GridBagConstraints();
						this.gridBagConstraintsConversionUnidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConversionUnidad.gridx = 0;
						this.jContentPaneDetalleConversionUnidad.add(this.jTabbedPaneRelacionesConversionUnidad, this.gridBagConstraintsConversionUnidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConversionUnidad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConversionUnidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
					this.gridBagConstraintsConversionUnidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConversionUnidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConversionUnidad.gridx = 0;
					
				
					this.jContentPaneDetalleConversionUnidad.add(jPanelCamposOcultosConversionUnidad, gridBagConstraintsConversionUnidad);
				
					this.jPanelCamposOcultosConversionUnidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConversionUnidad.gridx = 0;
	        this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConversionUnidad.add(this.jPanelAccionesFormularioConversionUnidad, this.gridBagConstraintsConversionUnidad);							
			
			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
	        this.gridBagConstraintsConversionUnidad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConversionUnidad.gridx = 0;
	        
			
			this.jContentPaneDetalleConversionUnidad.add(this.jPanelAccionesConversionUnidad, this.gridBagConstraintsConversionUnidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConversionUnidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConversionUnidad=   new JScrollPane(this.jPanelCamposConversionUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConversionUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConversionUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConversionUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConversionUnidad.gridx = 0;
			this.gridBagConstraintsConversionUnidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConversionUnidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConversionUnidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConversionUnidad, this.gridBagConstraintsConversionUnidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConversionUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConversionUnidad, this.gridBagConstraintsConversionUnidad);			
			
			this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
			this.gridBagConstraintsConversionUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConversionUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConversionUnidad, this.gridBagConstraintsConversionUnidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConversionUnidad, this.gridBagConstraintsConversionUnidad);
			
			
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConversionUnidad, this.gridBagConstraintsConversionUnidad);
		
			
		this.gridBagConstraintsConversionUnidad = new GridBagConstraints();
		this.gridBagConstraintsConversionUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConversionUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConversionUnidad, this.gridBagConstraintsConversionUnidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConversionUnidad;//jContentPane;
		
		return jScrollPanelDatosEdicionConversionUnidad;
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
