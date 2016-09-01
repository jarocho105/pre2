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
import com.bydan.erp.inventario.util.ConversionInvenConstantesFunciones;

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
public class ConversionInvenDetalleFormJInternalFrame extends ConversionInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConversionInven;
	
	protected JMenuBar jmenuBarDetalleConversionInven;
	
	protected JMenu jmenuDetalleConversionInven;
	protected JMenu jmenuDetalleArchivoConversionInven;
	protected JMenu jmenuDetalleAccionesConversionInven;
	protected JMenu jmenuDetalleDatosConversionInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConversionInven;	
	protected GridBagConstraints gridBagConstraintsConversionInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConversionInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleConversionInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoConversionInvenBeanSwingJInternalFrame tipoconversioninvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoconversioninven="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected UnidadBeanSwingJInternalFrame unidadconversionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidadconversion="";
	
	public ConversionInvenSessionBean conversioninvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoConversionInvenSessionBean tipoconversioninvenSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public UnidadSessionBean unidadconversionSessionBean;	
	
	public ConversionInvenLogic conversioninvenLogic;
	
	public JScrollPane jScrollPanelDatosConversionInven;
	public JScrollPane jScrollPanelDatosEdicionConversionInven;
	public JScrollPane jScrollPanelDatosGeneralConversionInven;
	
	protected JPanel jPanelCamposConversionInven;    
	protected JPanel jPanelCamposOcultosConversionInven;    	
	protected JPanel jPanelAccionesConversionInven;
	protected JPanel jPanelAccionesFormularioConversionInven;
    
	
	
	protected Integer iXPanelCamposConversionInven=0;
	protected Integer iYPanelCamposConversionInven=0;
	
	protected Integer iXPanelCamposOcultosConversionInven=0;
	protected Integer iYPanelCamposOcultosConversionInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConversionInven;
	public JButton jButtonModificarConversionInven;
	public JButton jButtonActualizarConversionInven;
    public JButton jButtonEliminarConversionInven;
	public JButton jButtonCancelarConversionInven;
    public JButton jButtonGuardarCambiosConversionInven;
	public JButton jButtonGuardarCambiosTablaConversionInven;
	protected JButton jButtonCerrarConversionInven;
	
	
	protected JButton jButtonProcesarInformacionConversionInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConversionInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConversionInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConversionInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConversionInven;
	protected JButton jButtonModificarToolBarConversionInven;
	protected JButton jButtonActualizarToolBarConversionInven;
    protected JButton jButtonEliminarToolBarConversionInven;
	protected JButton jButtonCancelarToolBarConversionInven;
    protected JButton jButtonGuardarCambiosToolBarConversionInven;
	protected JButton jButtonGuardarCambiosTablaToolBarConversionInven;
	protected JButton jButtonMostrarOcultarTablaToolBarConversionInven;
	protected JButton jButtonCerrarToolBarConversionInven;
	
	protected JButton jButtonProcesarInformacionToolBarConversionInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConversionInven;
	protected JMenuItem jMenuItemModificarConversionInven;
	protected JMenuItem jMenuItemActualizarConversionInven;
    protected JMenuItem jMenuItemEliminarConversionInven;
	protected JMenuItem jMenuItemCancelarConversionInven;
    protected JMenuItem jMenuItemGuardarCambiosConversionInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaConversionInven;
	protected JMenuItem jMenuItemCerrarConversionInven;
	protected JMenuItem jMenuItemDetalleCerrarConversionInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarConversionInven;
	
	protected JMenuItem jMenuItemProcesarInformacionConversionInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConversionInven;
	protected JMenuItem jMenuItemMostrarOcultarConversionInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConversionInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConversionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConversionInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConversionInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConversionInven;
	public JLabel jLabelIdConversionInven;
	public JLabel jLabelidConversionInven;
	public JButton jButtonidConversionInvenBusqueda= new JButtonMe();

	public JPanel jPanelvalorConversionInven;
	public JLabel jLabelvalorConversionInven;
	public JTextField jTextFieldvalorConversionInven;
	public JButton jButtonvalorConversionInvenBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionConversionInven;
	public JLabel jLabeldescripcionConversionInven;
	public JTextField jTextFielddescripcionConversionInven;
	public JButton jButtondescripcionConversionInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConversionInven;
	public JLabel jLabelid_empresaConversionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConversionInven;
	public JButton jButtonid_empresaConversionInven= new JButtonMe();
	public JButton jButtonid_empresaConversionInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaConversionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_conversion_invenConversionInven;
	public JLabel jLabelid_tipo_conversion_invenConversionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_conversion_invenConversionInven;
	public JButton jButtonid_tipo_conversion_invenConversionInven= new JButtonMe();
	public JButton jButtonid_tipo_conversion_invenConversionInvenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_conversion_invenConversionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadConversionInven;
	public JLabel jLabelid_unidadConversionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadConversionInven;
	public JButton jButtonid_unidadConversionInven= new JButtonMe();
	public JButton jButtonid_unidadConversionInvenUpdate= new JButtonMe();
	public JButton jButtonid_unidadConversionInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_unidad_conversionConversionInven;
	public JLabel jLabelid_unidad_conversionConversionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidad_conversionConversionInven;
	public JButton jButtonid_unidad_conversionConversionInven= new JButtonMe();
	public JButton jButtonid_unidad_conversionConversionInvenUpdate= new JButtonMe();
	public JButton jButtonid_unidad_conversionConversionInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConversionInven;
	
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
	
	public ConversionInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConversionInven=new JPanel();
				this.jPanelAccionesFormularioConversionInven=new JPanel();
				this.jmenuBarDetalleConversionInven=new JMenuBar();
				this.jTtoolBarDetalleConversionInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConversionInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConversionInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConversionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConversionInven() {
		return this.jButtonActualizarToolBarConversionInven;
	}
	
	public JButton getjButtonEliminarToolBarConversionInven() {
		return this.jButtonEliminarToolBarConversionInven;
	}
	
	public JButton getjButtonCancelarToolBarConversionInven() {
		return this.jButtonCancelarToolBarConversionInven;
	}		
	
	public JButton getjButtonProcesarInformacionConversionInven() {
		return this.jButtonProcesarInformacionConversionInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConversionInven)	{
		this.jButtonProcesarInformacionConversionInven = jButtonProcesarInformacionConversionInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConversionInven() {
		return this.jComboBoxTiposAccionesConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConversionInven(
			JComboBox jComboBoxTiposRelacionesConversionInven) {
		this.jComboBoxTiposRelacionesConversionInven = jComboBoxTiposRelacionesConversionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConversionInven(
			JComboBox jComboBoxTiposAccionesConversionInven) {
		this.jComboBoxTiposAccionesConversionInven = jComboBoxTiposAccionesConversionInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConversionInven() {
		return this.jComboBoxTiposAccionesFormularioConversionInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConversionInven(
			JComboBox jComboBoxTiposAccionesFormularioConversionInven) {
		this.jComboBoxTiposAccionesFormularioConversionInven = jComboBoxTiposAccionesFormularioConversionInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.conversioninvenSessionBean=new ConversionInvenSessionBean();
		
		this.conversioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conversioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conversioninvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConversionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConversionInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conversion Inven MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
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
	
		ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConversionInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConversionInven=new JButtonMe();
				this.jButtonModificarToolBarConversionInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConversionInven,this.jTtoolBarDetalleConversionInven,
							"actualizar","actualizar","Actualizar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConversionInven,this.jTtoolBarDetalleConversionInven,
							"eliminar","eliminar","Eliminar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConversionInven,this.jTtoolBarDetalleConversionInven,
							"cancelar","cancelar","Cancelar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConversionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConversionInven,this.jTtoolBarDetalleConversionInven,
							"guardarcambios","guardarcambios","Guardar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConversionInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConversionInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConversionInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConversionInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConversionInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConversionInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConversionInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConversionInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConversionInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConversionInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConversionInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConversionInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConversionInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConversionInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConversionInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConversionInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConversionInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConversionInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConversionInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConversionInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConversionInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConversionInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConversionInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConversionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConversionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConversionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConversionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConversionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConversionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConversionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConversionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConversionInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConversionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConversionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConversionInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConversionInven.add(this.jMenuItemDetalleCerrarConversionInven);
		
		this.jmenuDetalleAccionesConversionInven.add(this.jMenuItemActualizarConversionInven);
		this.jmenuDetalleAccionesConversionInven.add(this.jMenuItemEliminarConversionInven);
		this.jmenuDetalleAccionesConversionInven.add(this.jMenuItemCancelarConversionInven);		
		
		//this.jmenuDetalleDatosConversionInven.add(this.jMenuItemDetalleAbrirOrderByConversionInven);				
		this.jmenuDetalleDatosConversionInven.add(this.jMenuItemDetalleMostarOcultarConversionInven);				
				
		//this.jmenuDetalleAccionesConversionInven.add(this.jMenuItemGuardarCambiosConversionInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConversionInven.add(this.jmenuDetalleArchivoConversionInven);		
		this.jmenuBarDetalleConversionInven.add(this.jmenuDetalleAccionesConversionInven);		
		this.jmenuBarDetalleConversionInven.add(this.jmenuDetalleDatosConversionInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConversionInven);				
	}
	
	
	public void inicializarElementosCamposConversionInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConversionInven = new JLabelMe();
		jLabelIdConversionInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConversionInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConversionInven.setToolTipText(ConversionInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConversionInven= new GridBagLayout();

		this.jPanelidConversionInven.setLayout(this.gridaBagLayoutConversionInven);

		jLabelidConversionInven = new JLabel();
		jLabelidConversionInven.setText("Id");

		jLabelidConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorConversionInven = new JLabelMe();
		this.jLabelvalorConversionInven.setText(""+ConversionInvenConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorConversionInven.setToolTipText("Valor");
		this.jLabelvalorConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorConversionInven.setToolTipText(ConversionInvenConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutConversionInven = new GridBagLayout();
		this.jPanelvalorConversionInven.setLayout(this.gridaBagLayoutConversionInven);


		jTextFieldvalorConversionInven= new JTextFieldMe();
		jTextFieldvalorConversionInven.setEnabled(false);
		jTextFieldvalorConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorConversionInven.setText("0.0");

		this.jButtonvalorConversionInvenBusqueda= new JButtonMe();
		this.jButtonvalorConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorConversionInvenBusqueda.setText("U");
		this.jButtonvalorConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorConversionInvenBusqueda"));

		if(this.conversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorConversionInvenBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionConversionInven = new JLabelMe();
		this.jLabeldescripcionConversionInven.setText(""+ConversionInvenConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionConversionInven.setToolTipText("Descripcion");
		this.jLabeldescripcionConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionConversionInven.setToolTipText(ConversionInvenConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutConversionInven = new GridBagLayout();
		this.jPaneldescripcionConversionInven.setLayout(this.gridaBagLayoutConversionInven);


		jTextFielddescripcionConversionInven= new JTextFieldMe();

		jTextFielddescripcionConversionInven.setEnabled(false);
		jTextFielddescripcionConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescripcionConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondescripcionConversionInvenBusqueda= new JButtonMe();
		this.jButtondescripcionConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionConversionInvenBusqueda.setText("U");
		this.jButtondescripcionConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescripcionConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescripcionConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionConversionInvenBusqueda"));

		if(this.conversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionConversionInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConversionInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConversionInven = new JLabelMe();
		this.jLabelid_empresaConversionInven.setText(""+ConversionInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConversionInven.setToolTipText("Empresa");
		this.jLabelid_empresaConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConversionInven.setToolTipText(ConversionInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConversionInven = new GridBagLayout();
		this.jPanelid_empresaConversionInven.setLayout(this.gridaBagLayoutConversionInven);


		jComboBoxid_empresaConversionInven= new JComboBoxMe();
		jComboBoxid_empresaConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConversionInven.setEnabled(false);

		this.jButtonid_empresaConversionInven= new JButtonMe();
		this.jButtonid_empresaConversionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConversionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConversionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConversionInven.setText("Buscar");
		this.jButtonid_empresaConversionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConversionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConversionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConversionInven"));

		this.jButtonid_empresaConversionInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConversionInvenBusqueda.setText("U");
		this.jButtonid_empresaConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConversionInvenBusqueda"));

		if(this.conversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConversionInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaConversionInvenUpdate= new JButtonMe();
		this.jButtonid_empresaConversionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConversionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConversionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConversionInvenUpdate.setText("U");
		this.jButtonid_empresaConversionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConversionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConversionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConversionInvenUpdate"));



					
		this.jLabelid_tipo_conversion_invenConversionInven = new JLabelMe();
		this.jLabelid_tipo_conversion_invenConversionInven.setText(""+ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN+" : *");
		this.jLabelid_tipo_conversion_invenConversionInven.setToolTipText("Tipo Conversion");
		this.jLabelid_tipo_conversion_invenConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_conversion_invenConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_conversion_invenConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_conversion_invenConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_conversion_invenConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_conversion_invenConversionInven.setToolTipText(ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN);
		this.gridaBagLayoutConversionInven = new GridBagLayout();
		this.jPanelid_tipo_conversion_invenConversionInven.setLayout(this.gridaBagLayoutConversionInven);


		jComboBoxid_tipo_conversion_invenConversionInven= new JComboBoxMe();
		jComboBoxid_tipo_conversion_invenConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_conversion_invenConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_conversion_invenConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_conversion_invenConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_conversion_invenConversionInven= new JButtonMe();
		this.jButtonid_tipo_conversion_invenConversionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_conversion_invenConversionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_conversion_invenConversionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_conversion_invenConversionInven.setText("Buscar");
		this.jButtonid_tipo_conversion_invenConversionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_conversion_invenConversionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_conversion_invenConversionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_conversion_invenConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_conversion_invenConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_conversion_invenConversionInven"));

		this.jButtonid_tipo_conversion_invenConversionInvenBusqueda= new JButtonMe();
		this.jButtonid_tipo_conversion_invenConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_conversion_invenConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_conversion_invenConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_conversion_invenConversionInvenBusqueda.setText("U");
		this.jButtonid_tipo_conversion_invenConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_conversion_invenConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_conversion_invenConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_conversion_invenConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_conversion_invenConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_conversion_invenConversionInvenBusqueda"));

		if(this.conversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_conversion_invenConversionInvenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_conversion_invenConversionInvenUpdate= new JButtonMe();
		this.jButtonid_tipo_conversion_invenConversionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_conversion_invenConversionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_conversion_invenConversionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_conversion_invenConversionInvenUpdate.setText("U");
		this.jButtonid_tipo_conversion_invenConversionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_conversion_invenConversionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_conversion_invenConversionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_conversion_invenConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_conversion_invenConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_conversion_invenConversionInvenUpdate"));



					
		this.jLabelid_unidadConversionInven = new JLabelMe();
		this.jLabelid_unidadConversionInven.setText(""+ConversionInvenConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadConversionInven.setToolTipText("Unidad");
		this.jLabelid_unidadConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadConversionInven.setToolTipText(ConversionInvenConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutConversionInven = new GridBagLayout();
		this.jPanelid_unidadConversionInven.setLayout(this.gridaBagLayoutConversionInven);


		jComboBoxid_unidadConversionInven= new JComboBoxMe();
		jComboBoxid_unidadConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadConversionInven= new JButtonMe();
		this.jButtonid_unidadConversionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadConversionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadConversionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadConversionInven.setText("Buscar");
		this.jButtonid_unidadConversionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadConversionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadConversionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadConversionInven"));

		this.jButtonid_unidadConversionInvenBusqueda= new JButtonMe();
		this.jButtonid_unidadConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadConversionInvenBusqueda.setText("U");
		this.jButtonid_unidadConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadConversionInvenBusqueda"));

		if(this.conversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadConversionInvenBusqueda.setVisible(false);		}

		this.jButtonid_unidadConversionInvenUpdate= new JButtonMe();
		this.jButtonid_unidadConversionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadConversionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadConversionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadConversionInvenUpdate.setText("U");
		this.jButtonid_unidadConversionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadConversionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadConversionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadConversionInvenUpdate"));



					
		this.jLabelid_unidad_conversionConversionInven = new JLabelMe();
		this.jLabelid_unidad_conversionConversionInven.setText(""+ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION+" : *");
		this.jLabelid_unidad_conversionConversionInven.setToolTipText("Unidad Conversion");
		this.jLabelid_unidad_conversionConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_unidad_conversionConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_unidad_conversionConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidad_conversionConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidad_conversionConversionInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidad_conversionConversionInven.setToolTipText(ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION);
		this.gridaBagLayoutConversionInven = new GridBagLayout();
		this.jPanelid_unidad_conversionConversionInven.setLayout(this.gridaBagLayoutConversionInven);


		jComboBoxid_unidad_conversionConversionInven= new JComboBoxMe();
		jComboBoxid_unidad_conversionConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_conversionConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidad_conversionConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidad_conversionConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidad_conversionConversionInven= new JButtonMe();
		this.jButtonid_unidad_conversionConversionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_conversionConversionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_conversionConversionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidad_conversionConversionInven.setText("Buscar");
		this.jButtonid_unidad_conversionConversionInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidad_conversionConversionInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_conversionConversionInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidad_conversionConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_conversionConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_conversionConversionInven"));

		this.jButtonid_unidad_conversionConversionInvenBusqueda= new JButtonMe();
		this.jButtonid_unidad_conversionConversionInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_conversionConversionInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_conversionConversionInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidad_conversionConversionInvenBusqueda.setText("U");
		this.jButtonid_unidad_conversionConversionInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidad_conversionConversionInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_conversionConversionInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidad_conversionConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_conversionConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_conversionConversionInvenBusqueda"));

		if(this.conversioninvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidad_conversionConversionInvenBusqueda.setVisible(false);		}

		this.jButtonid_unidad_conversionConversionInvenUpdate= new JButtonMe();
		this.jButtonid_unidad_conversionConversionInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_conversionConversionInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidad_conversionConversionInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidad_conversionConversionInvenUpdate.setText("U");
		this.jButtonid_unidad_conversionConversionInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidad_conversionConversionInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidad_conversionConversionInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidad_conversionConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidad_conversionConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidad_conversionConversionInvenUpdate"));



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
		//this.jInternalFrameDetalleConversionInven = new ConversionInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Conversion Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConversionInven= new GridBagLayout();
		

		
		String sToolTipConversionInven="";
		sToolTipConversionInven=ConversionInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConversionInven+="(Inventario.ConversionInven)";
		}
		
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipConversionInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConversionInven = new JButtonMe();
		this.jButtonModificarConversionInven = new JButtonMe();
        this.jButtonActualizarConversionInven = new JButtonMe();
        this.jButtonEliminarConversionInven = new JButtonMe();
        this.jButtonCancelarConversionInven = new JButtonMe();
        this.jButtonGuardarCambiosConversionInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaConversionInven = new JButtonMe();
		this.jButtonCerrarConversionInven = new JButtonMe();
		
		this.jScrollPanelDatosConversionInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionConversionInven = new JScrollPane();
		this.jScrollPanelDatosGeneralConversionInven = new JScrollPane();
				
		
		
		this.jPanelCamposConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Conversion Inven";
		
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conversion Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosConversionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConversionInven.setName("jPanelCamposConversionInven"); 

		this.jPanelCamposOcultosConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConversionInven.setName("jPanelCamposOcultosConversionInven"); 

        this.jPanelAccionesConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConversionInven.setToolTipText("Acciones");
        this.jPanelAccionesConversionInven.setName("Acciones"); 

		this.jPanelAccionesFormularioConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConversionInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConversionInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConversionInven.setText("Nuevo");
		this.jButtonModificarConversionInven.setText("Editar");
        this.jButtonActualizarConversionInven.setText("Actualizar");
        this.jButtonEliminarConversionInven.setText("Eliminar");
        this.jButtonCancelarConversionInven.setText("Cancelar");
        this.jButtonGuardarCambiosConversionInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaConversionInven.setText("Guardar");
		this.jButtonCerrarConversionInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConversionInven,"nuevo_button","Nuevo",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConversionInven,"modificar_button","Editar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConversionInven,"actualizar_button","Actualizar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConversionInven,"eliminar_button","Eliminar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConversionInven,"cancelar_button","Cancelar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConversionInven,"guardarcambios_button","Guardar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConversionInven,"guardarcambiostabla_button","Guardar",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConversionInven,"cerrar_button","Salir",this.conversioninvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConversionInven.setToolTipText("Nuevo"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConversionInven.setToolTipText("Editar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConversionInven.setToolTipText("Actualizar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConversionInven.setToolTipText("Eliminar)"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConversionInven.setToolTipText("Cancelar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConversionInven.setToolTipText("Guardar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConversionInven.setToolTipText("Guardar"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConversionInven.setToolTipText("Salir"+" "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConversionInven";
		inputMap = this.jButtonNuevoConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConversionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConversionInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConversionInven";
		inputMap = this.jButtonActualizarConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConversionInven"));
		
		//ELIMINAR
		sMapKey = "EliminarConversionInven";
		inputMap = this.jButtonEliminarConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConversionInven"));
		
		//CANCELAR	
		sMapKey = "CancelarConversionInven";
		inputMap = this.jButtonCancelarConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConversionInven"));
		
		//CERRAR		
		sMapKey = "CerrarConversionInven";
		inputMap = this.jButtonCerrarConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConversionInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConversionInven";
		inputMap = this.jButtonGuardarCambiosTablaConversionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConversionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConversionInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConversionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConversionInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConversionInven.setToolTipText("Nuevo ConversionInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConversionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConversionInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConversionInven.setToolTipText("Sin Cerrar Ventana ConversionInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConversionInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConversionInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConversionInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConversionInven.setText("Accion");
		this.jComboBoxTiposAccionesConversionInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConversionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConversionInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConversionInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConversionInven = new JLabelMe();
		
		this.jLabelAccionesConversionInven.setText("Acciones");		
		this.jLabelAccionesConversionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConversionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConversionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConversionInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConversionInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConversionInven=new JTabbedPane();
		this.jTabbedPaneRelacionesConversionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConversionInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConversionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConversionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConversionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConversionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConversionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConversionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConversionInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConversionInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConversionInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConversionInven = new GridBagLayout();
		
		this.jPanelCamposConversionInven.setLayout(gridaBagLayoutCamposConversionInven);
		this.jPanelCamposOcultosConversionInven.setLayout(gridaBagLayoutCamposOcultosConversionInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 0;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConversionInven.add(jLabelIdConversionInven, this.gridBagConstraintsConversionInven);



	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 1;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConversionInven.add(jLabelidConversionInven, this.gridBagConstraintsConversionInven);


	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 0;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConversionInven.add(jLabelid_empresaConversionInven, this.gridBagConstraintsConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 2;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConversionInven.add(jButtonid_empresaConversionInvenBusqueda, this.gridBagConstraintsConversionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 3;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConversionInven.add(jButtonid_empresaConversionInvenUpdate, this.gridBagConstraintsConversionInven);
	}

	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 1;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConversionInven.add(jComboBoxid_empresaConversionInven, this.gridBagConstraintsConversionInven);


	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 0;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_conversion_invenConversionInven.add(jLabelid_tipo_conversion_invenConversionInven, this.gridBagConstraintsConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 2;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_conversion_invenConversionInven.add(jButtonid_tipo_conversion_invenConversionInvenBusqueda, this.gridBagConstraintsConversionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 3;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_conversion_invenConversionInven.add(jButtonid_tipo_conversion_invenConversionInvenUpdate, this.gridBagConstraintsConversionInven);
	}

	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 1;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_conversion_invenConversionInven.add(jComboBoxid_tipo_conversion_invenConversionInven, this.gridBagConstraintsConversionInven);


	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 0;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadConversionInven.add(jLabelid_unidadConversionInven, this.gridBagConstraintsConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 2;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadConversionInven.add(jButtonid_unidadConversionInvenBusqueda, this.gridBagConstraintsConversionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 3;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadConversionInven.add(jButtonid_unidadConversionInvenUpdate, this.gridBagConstraintsConversionInven);
	}

	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 1;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadConversionInven.add(jComboBoxid_unidadConversionInven, this.gridBagConstraintsConversionInven);


	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 0;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidad_conversionConversionInven.add(jLabelid_unidad_conversionConversionInven, this.gridBagConstraintsConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 2;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidad_conversionConversionInven.add(jButtonid_unidad_conversionConversionInvenBusqueda, this.gridBagConstraintsConversionInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 3;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidad_conversionConversionInven.add(jButtonid_unidad_conversionConversionInvenUpdate, this.gridBagConstraintsConversionInven);
	}

	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 1;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidad_conversionConversionInven.add(jComboBoxid_unidad_conversionConversionInven, this.gridBagConstraintsConversionInven);


	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 0;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorConversionInven.add(jLabelvalorConversionInven, this.gridBagConstraintsConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 2;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorConversionInven.add(jButtonvalorConversionInvenBusqueda, this.gridBagConstraintsConversionInven);
	}

	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 1;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorConversionInven.add(jTextFieldvalorConversionInven, this.gridBagConstraintsConversionInven);


	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 0;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionConversionInven.add(jLabeldescripcionConversionInven, this.gridBagConstraintsConversionInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		//this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = 2;
		this.gridBagConstraintsConversionInven.ipadx = 0;
		this.gridBagConstraintsConversionInven.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionConversionInven.add(jButtondescripcionConversionInvenBusqueda, this.gridBagConstraintsConversionInven);
	}

	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConversionInven.gridy = 0;
	this.gridBagConstraintsConversionInven.gridx = 1;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionConversionInven.add(jTextFielddescripcionConversionInven, this.gridBagConstraintsConversionInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionInven.gridy = iYPanelCamposConversionInven;
	this.gridBagConstraintsConversionInven.gridx = iXPanelCamposConversionInven++;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionInven.add(this.jPanelidConversionInven, this.gridBagConstraintsConversionInven);



	if(iXPanelCamposConversionInven % 1==0) {
		iXPanelCamposConversionInven=0;
		iYPanelCamposConversionInven++;
	}
	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionInven.gridy = iYPanelCamposConversionInven;
	this.gridBagConstraintsConversionInven.gridx = iXPanelCamposConversionInven++;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionInven.add(this.jPanelid_tipo_conversion_invenConversionInven, this.gridBagConstraintsConversionInven);



	if(iXPanelCamposConversionInven % 1==0) {
		iXPanelCamposConversionInven=0;
		iYPanelCamposConversionInven++;
	}
	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionInven.gridy = iYPanelCamposConversionInven;
	this.gridBagConstraintsConversionInven.gridx = iXPanelCamposConversionInven++;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionInven.add(this.jPanelid_unidadConversionInven, this.gridBagConstraintsConversionInven);



	if(iXPanelCamposConversionInven % 1==0) {
		iXPanelCamposConversionInven=0;
		iYPanelCamposConversionInven++;
	}
	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionInven.gridy = iYPanelCamposConversionInven;
	this.gridBagConstraintsConversionInven.gridx = iXPanelCamposConversionInven++;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionInven.add(this.jPanelid_unidad_conversionConversionInven, this.gridBagConstraintsConversionInven);



	if(iXPanelCamposConversionInven % 1==0) {
		iXPanelCamposConversionInven=0;
		iYPanelCamposConversionInven++;
	}
	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionInven.gridy = iYPanelCamposConversionInven;
	this.gridBagConstraintsConversionInven.gridx = iXPanelCamposConversionInven++;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionInven.add(this.jPanelvalorConversionInven, this.gridBagConstraintsConversionInven);



	if(iXPanelCamposConversionInven % 1==0) {
		iXPanelCamposConversionInven=0;
		iYPanelCamposConversionInven++;
	}
	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionInven.gridy = iYPanelCamposConversionInven;
	this.gridBagConstraintsConversionInven.gridx = iXPanelCamposConversionInven++;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConversionInven.add(this.jPaneldescripcionConversionInven, this.gridBagConstraintsConversionInven);



	if(iXPanelCamposConversionInven % 1==0) {
		iXPanelCamposConversionInven=0;
		iYPanelCamposConversionInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConversionInven = new GridBagConstraints();
	this.gridBagConstraintsConversionInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConversionInven.gridy = iYPanelCamposOcultosConversionInven;
	this.gridBagConstraintsConversionInven.gridx = iXPanelCamposOcultosConversionInven++;
	this.gridBagConstraintsConversionInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConversionInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConversionInven.add(this.jPanelid_empresaConversionInven, this.gridBagConstraintsConversionInven);



	if(iXPanelCamposOcultosConversionInven % 1==0) {
		iXPanelCamposOcultosConversionInven=0;
		iYPanelCamposOcultosConversionInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesConversionInven= new GridBagLayout();
		this.jPanelAccionesConversionInven.setLayout(gridaBagLayoutAccionesConversionInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConversionInven= new GridBagLayout();
		this.jPanelAccionesFormularioConversionInven.setLayout(gridaBagLayoutAccionesFormularioConversionInven);
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConversionInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConversionInven.add(this.jComboBoxTiposAccionesFormularioConversionInven, this.gridBagConstraintsConversionInven);

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConversionInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConversionInven.add(this.jCheckBoxPostAccionNuevoConversionInven, this.gridBagConstraintsConversionInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.conversioninvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConversionInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConversionInven.add(this.jCheckBoxPostAccionSinCerrarConversionInven, this.gridBagConstraintsConversionInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.conversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConversionInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConversionInven.add(this.jCheckBoxPostAccionSinMensajeConversionInven, this.gridBagConstraintsConversionInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesConversionInven.add(this.jButtonModificarConversionInven, this.gridBagConstraintsConversionInven);							

		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConversionInven.gridy = 0;
		this.gridBagConstraintsConversionInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesConversionInven.add(this.jButtonEliminarConversionInven, this.gridBagConstraintsConversionInven);
		
			
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = 0;		
		this.gridBagConstraintsConversionInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesConversionInven.add(this.jButtonActualizarConversionInven, this.gridBagConstraintsConversionInven);


		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = 0;		
		this.gridBagConstraintsConversionInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesConversionInven.add(this.jButtonGuardarCambiosConversionInven, this.gridBagConstraintsConversionInven);	
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = 0;		
		this.gridBagConstraintsConversionInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesConversionInven.add(this.jButtonCancelarConversionInven, this.gridBagConstraintsConversionInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConversionInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConversionInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConversionInven = new GridBagConstraints();						
			this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConversionInven.gridx = 0;		
			//this.gridBagConstraintsConversionInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConversionInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConversionInven.gridx =0;
		this.gridBagConstraintsConversionInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConversionInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConversionInven, this.gridBagConstraintsConversionInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConversionInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConversionInven = new ConversionInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Conversion Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Conversion Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conversion Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConversionInvenModel conversioninvenModel=new ConversionInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//ConversionInvenModel.ConversionInvenFocusTraversalPolicy conversioninvenFocusTraversalPolicy = conversioninvenModel.new ConversionInvenFocusTraversalPolicy(this);
			
			//conversioninvenFocusTraversalPolicy.setconversioninvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(conversioninvenModel);
			
			
			this.jContentPaneDetalleConversionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConversionInven = new GridBagLayout();	
			this.jContentPaneDetalleConversionInven.setLayout(gridaBagLayoutDetalleConversionInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConversionInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConversionInven = new GridBagConstraints();
				this.gridBagConstraintsConversionInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConversionInven.gridx = 0;
					
				
				this.jContentPaneDetalleConversionInven.add(jTtoolBarDetalleConversionInven, gridBagConstraintsConversionInven);								
				
}
			
			this.jScrollPanelDatosEdicionConversionInven=   new JScrollPane(jContentPaneDetalleConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConversionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConversionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConversionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConversionInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConversionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConversionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConversionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConversionInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConversionInven.gridx = 0;
	        
			this.jContentPaneDetalleConversionInven.add(jPanelCamposConversionInven, gridBagConstraintsConversionInven);
			
			
			
			
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
						&& conversioninvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConversionInven= new GridBagConstraints();
						this.gridBagConstraintsConversionInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConversionInven.gridx = 0;
						this.jContentPaneDetalleConversionInven.add(this.jTabbedPaneRelacionesConversionInven, this.gridBagConstraintsConversionInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConversionInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConversionInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConversionInven = new GridBagConstraints();
					this.gridBagConstraintsConversionInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConversionInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConversionInven.gridx = 0;
					
				
					this.jContentPaneDetalleConversionInven.add(jPanelCamposOcultosConversionInven, gridBagConstraintsConversionInven);
				
					this.jPanelCamposOcultosConversionInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConversionInven.gridx = 0;
	        this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConversionInven.add(this.jPanelAccionesFormularioConversionInven, this.gridBagConstraintsConversionInven);							
			
			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
	        this.gridBagConstraintsConversionInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConversionInven.gridx = 0;
	        
			
			this.jContentPaneDetalleConversionInven.add(this.jPanelAccionesConversionInven, this.gridBagConstraintsConversionInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConversionInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConversionInven=   new JScrollPane(this.jPanelCamposConversionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConversionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConversionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConversionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConversionInven.gridx = 0;
			this.gridBagConstraintsConversionInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConversionInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConversionInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConversionInven, this.gridBagConstraintsConversionInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConversionInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConversionInven, this.gridBagConstraintsConversionInven);			
			
			this.gridBagConstraintsConversionInven = new GridBagConstraints();
			this.gridBagConstraintsConversionInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConversionInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConversionInven, this.gridBagConstraintsConversionInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConversionInven, this.gridBagConstraintsConversionInven);
			
			
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConversionInven, this.gridBagConstraintsConversionInven);
		
			
		this.gridBagConstraintsConversionInven = new GridBagConstraints();
		this.gridBagConstraintsConversionInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConversionInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConversionInven, this.gridBagConstraintsConversionInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConversionInven;//jContentPane;
		
		return jScrollPanelDatosEdicionConversionInven;
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
