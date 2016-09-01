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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.VisibleFacturaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class VisibleFacturaDetalleFormJInternalFrame extends VisibleFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVisibleFactura;
	
	protected JMenuBar jmenuBarDetalleVisibleFactura;
	
	protected JMenu jmenuDetalleVisibleFactura;
	protected JMenu jmenuDetalleArchivoVisibleFactura;
	protected JMenu jmenuDetalleAccionesVisibleFactura;
	protected JMenu jmenuDetalleDatosVisibleFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVisibleFactura;	
	protected GridBagConstraints gridBagConstraintsVisibleFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VisibleFacturaBeanSwingJInternalFrameAdditional jInternalFrameDetalleVisibleFactura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public VisibleFacturaSessionBean visiblefacturaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public VisibleFacturaLogic visiblefacturaLogic;
	
	public JScrollPane jScrollPanelDatosVisibleFactura;
	public JScrollPane jScrollPanelDatosEdicionVisibleFactura;
	public JScrollPane jScrollPanelDatosGeneralVisibleFactura;
	
	protected JPanel jPanelCamposVisibleFactura;    
	protected JPanel jPanelCamposOcultosVisibleFactura;    	
	protected JPanel jPanelAccionesVisibleFactura;
	protected JPanel jPanelAccionesFormularioVisibleFactura;
    
	
	
	protected Integer iXPanelCamposVisibleFactura=0;
	protected Integer iYPanelCamposVisibleFactura=0;
	
	protected Integer iXPanelCamposOcultosVisibleFactura=0;
	protected Integer iYPanelCamposOcultosVisibleFactura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVisibleFactura;
	public JButton jButtonModificarVisibleFactura;
	public JButton jButtonActualizarVisibleFactura;
    public JButton jButtonEliminarVisibleFactura;
	public JButton jButtonCancelarVisibleFactura;
    public JButton jButtonGuardarCambiosVisibleFactura;
	public JButton jButtonGuardarCambiosTablaVisibleFactura;
	protected JButton jButtonCerrarVisibleFactura;
	
	
	protected JButton jButtonProcesarInformacionVisibleFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVisibleFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVisibleFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVisibleFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVisibleFactura;
	protected JButton jButtonModificarToolBarVisibleFactura;
	protected JButton jButtonActualizarToolBarVisibleFactura;
    protected JButton jButtonEliminarToolBarVisibleFactura;
	protected JButton jButtonCancelarToolBarVisibleFactura;
    protected JButton jButtonGuardarCambiosToolBarVisibleFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarVisibleFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarVisibleFactura;
	protected JButton jButtonCerrarToolBarVisibleFactura;
	
	protected JButton jButtonProcesarInformacionToolBarVisibleFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVisibleFactura;
	protected JMenuItem jMenuItemModificarVisibleFactura;
	protected JMenuItem jMenuItemActualizarVisibleFactura;
    protected JMenuItem jMenuItemEliminarVisibleFactura;
	protected JMenuItem jMenuItemCancelarVisibleFactura;
    protected JMenuItem jMenuItemGuardarCambiosVisibleFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaVisibleFactura;
	protected JMenuItem jMenuItemCerrarVisibleFactura;
	protected JMenuItem jMenuItemDetalleCerrarVisibleFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarVisibleFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionVisibleFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVisibleFactura;
	protected JMenuItem jMenuItemMostrarOcultarVisibleFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVisibleFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVisibleFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVisibleFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVisibleFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVisibleFactura;
	public JLabel jLabelIdVisibleFactura;
	public JLabel jLabelidVisibleFactura;
	public JButton jButtonidVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcabe_consignatarioVisibleFactura;
	public JLabel jLabelcabe_consignatarioVisibleFactura;
	public JCheckBox jCheckBoxcabe_consignatarioVisibleFactura;
	public JButton jButtoncabe_consignatarioVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcabe_tipo_tasaVisibleFactura;
	public JLabel jLabelcabe_tipo_tasaVisibleFactura;
	public JCheckBox jCheckBoxcabe_tipo_tasaVisibleFactura;
	public JButton jButtoncabe_tipo_tasaVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcabe_consultorVisibleFactura;
	public JLabel jLabelcabe_consultorVisibleFactura;
	public JCheckBox jCheckBoxcabe_consultorVisibleFactura;
	public JButton jButtoncabe_consultorVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcabe_iceVisibleFactura;
	public JLabel jLabelcabe_iceVisibleFactura;
	public JCheckBox jCheckBoxcabe_iceVisibleFactura;
	public JButton jButtoncabe_iceVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcabe_transporteVisibleFactura;
	public JLabel jLabelcabe_transporteVisibleFactura;
	public JCheckBox jCheckBoxcabe_transporteVisibleFactura;
	public JButton jButtoncabe_transporteVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcabe_fueVisibleFactura;
	public JLabel jLabelcabe_fueVisibleFactura;
	public JCheckBox jCheckBoxcabe_fueVisibleFactura;
	public JButton jButtoncabe_fueVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcabe_ordenVisibleFactura;
	public JLabel jLabelcabe_ordenVisibleFactura;
	public JCheckBox jCheckBoxcabe_ordenVisibleFactura;
	public JButton jButtoncabe_ordenVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldeta_autori_precioVisibleFactura;
	public JLabel jLabeldeta_autori_precioVisibleFactura;
	public JCheckBox jCheckBoxdeta_autori_precioVisibleFactura;
	public JButton jButtondeta_autori_precioVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldeta_areaVisibleFactura;
	public JLabel jLabeldeta_areaVisibleFactura;
	public JCheckBox jCheckBoxdeta_areaVisibleFactura;
	public JButton jButtondeta_areaVisibleFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldeta_fotoVisibleFactura;
	public JLabel jLabeldeta_fotoVisibleFactura;
	public JCheckBox jCheckBoxdeta_fotoVisibleFactura;
	public JButton jButtondeta_fotoVisibleFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVisibleFactura;
	public JLabel jLabelid_empresaVisibleFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVisibleFactura;
	public JButton jButtonid_empresaVisibleFactura= new JButtonMe();
	public JButton jButtonid_empresaVisibleFacturaUpdate= new JButtonMe();
	public JButton jButtonid_empresaVisibleFacturaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVisibleFactura;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VisibleFacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVisibleFactura=new JPanel();
				this.jPanelAccionesFormularioVisibleFactura=new JPanel();
				this.jmenuBarDetalleVisibleFactura=new JMenuBar();
				this.jTtoolBarDetalleVisibleFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisibleFacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VisibleFacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisibleFacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisibleFacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisibleFacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VisibleFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVisibleFactura() {
		return this.jButtonActualizarToolBarVisibleFactura;
	}
	
	public JButton getjButtonEliminarToolBarVisibleFactura() {
		return this.jButtonEliminarToolBarVisibleFactura;
	}
	
	public JButton getjButtonCancelarToolBarVisibleFactura() {
		return this.jButtonCancelarToolBarVisibleFactura;
	}		
	
	public JButton getjButtonProcesarInformacionVisibleFactura() {
		return this.jButtonProcesarInformacionVisibleFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVisibleFactura)	{
		this.jButtonProcesarInformacionVisibleFactura = jButtonProcesarInformacionVisibleFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVisibleFactura() {
		return this.jComboBoxTiposAccionesVisibleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVisibleFactura(
			JComboBox jComboBoxTiposRelacionesVisibleFactura) {
		this.jComboBoxTiposRelacionesVisibleFactura = jComboBoxTiposRelacionesVisibleFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVisibleFactura(
			JComboBox jComboBoxTiposAccionesVisibleFactura) {
		this.jComboBoxTiposAccionesVisibleFactura = jComboBoxTiposAccionesVisibleFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVisibleFactura() {
		return this.jComboBoxTiposAccionesFormularioVisibleFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVisibleFactura(
			JComboBox jComboBoxTiposAccionesFormularioVisibleFactura) {
		this.jComboBoxTiposAccionesFormularioVisibleFactura = jComboBoxTiposAccionesFormularioVisibleFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.visiblefacturaSessionBean=new VisibleFacturaSessionBean();
		
		this.visiblefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.visiblefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.visiblefacturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VisibleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VisibleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VisibleFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Visibilidad Factura MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
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
	
		VisibleFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVisibleFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVisibleFactura=new JButtonMe();
				this.jButtonModificarToolBarVisibleFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVisibleFactura,this.jTtoolBarDetalleVisibleFactura,
							"actualizar","actualizar","Actualizar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVisibleFactura,this.jTtoolBarDetalleVisibleFactura,
							"eliminar","eliminar","Eliminar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVisibleFactura,this.jTtoolBarDetalleVisibleFactura,
							"cancelar","cancelar","Cancelar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVisibleFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVisibleFactura,this.jTtoolBarDetalleVisibleFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVisibleFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVisibleFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVisibleFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVisibleFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVisibleFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVisibleFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVisibleFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVisibleFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVisibleFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVisibleFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVisibleFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVisibleFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVisibleFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVisibleFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVisibleFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVisibleFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVisibleFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVisibleFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVisibleFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVisibleFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVisibleFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVisibleFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVisibleFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVisibleFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVisibleFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVisibleFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVisibleFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVisibleFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVisibleFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVisibleFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVisibleFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVisibleFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVisibleFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVisibleFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVisibleFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVisibleFactura.add(this.jMenuItemDetalleCerrarVisibleFactura);
		
		this.jmenuDetalleAccionesVisibleFactura.add(this.jMenuItemActualizarVisibleFactura);
		this.jmenuDetalleAccionesVisibleFactura.add(this.jMenuItemEliminarVisibleFactura);
		this.jmenuDetalleAccionesVisibleFactura.add(this.jMenuItemCancelarVisibleFactura);		
		
		//this.jmenuDetalleDatosVisibleFactura.add(this.jMenuItemDetalleAbrirOrderByVisibleFactura);				
		this.jmenuDetalleDatosVisibleFactura.add(this.jMenuItemDetalleMostarOcultarVisibleFactura);				
				
		//this.jmenuDetalleAccionesVisibleFactura.add(this.jMenuItemGuardarCambiosVisibleFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVisibleFactura.add(this.jmenuDetalleArchivoVisibleFactura);		
		this.jmenuBarDetalleVisibleFactura.add(this.jmenuDetalleAccionesVisibleFactura);		
		this.jmenuBarDetalleVisibleFactura.add(this.jmenuDetalleDatosVisibleFactura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVisibleFactura);				
	}
	
	
	public void inicializarElementosCamposVisibleFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVisibleFactura = new JLabelMe();
		jLabelIdVisibleFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVisibleFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVisibleFactura= new GridBagLayout();

		this.jPanelidVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);

		jLabelidVisibleFactura = new JLabel();
		jLabelidVisibleFactura.setText("Id");

		jLabelidVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcabe_consignatarioVisibleFactura = new JLabelMe();
		this.jLabelcabe_consignatarioVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO+" : *");
		this.jLabelcabe_consignatarioVisibleFactura.setToolTipText("Consignatario");
		this.jLabelcabe_consignatarioVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_consignatarioVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_consignatarioVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcabe_consignatarioVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcabe_consignatarioVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcabe_consignatarioVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_CABECONSIGNATARIO);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPanelcabe_consignatarioVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxcabe_consignatarioVisibleFactura= new JCheckBoxMe();
		jCheckBoxcabe_consignatarioVisibleFactura.setEnabled(false);

		jCheckBoxcabe_consignatarioVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_consignatarioVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_consignatarioVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcabe_consignatarioVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncabe_consignatarioVisibleFacturaBusqueda= new JButtonMe();
		this.jButtoncabe_consignatarioVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_consignatarioVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_consignatarioVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncabe_consignatarioVisibleFacturaBusqueda.setText("U");
		this.jButtoncabe_consignatarioVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncabe_consignatarioVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncabe_consignatarioVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcabe_consignatarioVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcabe_consignatarioVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cabe_consignatarioVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncabe_consignatarioVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcabe_tipo_tasaVisibleFactura = new JLabelMe();
		this.jLabelcabe_tipo_tasaVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA+" : *");
		this.jLabelcabe_tipo_tasaVisibleFactura.setToolTipText("Tipo Tasa");
		this.jLabelcabe_tipo_tasaVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_tipo_tasaVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_tipo_tasaVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcabe_tipo_tasaVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcabe_tipo_tasaVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcabe_tipo_tasaVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_CABETIPOTASA);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPanelcabe_tipo_tasaVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxcabe_tipo_tasaVisibleFactura= new JCheckBoxMe();
		jCheckBoxcabe_tipo_tasaVisibleFactura.setEnabled(false);

		jCheckBoxcabe_tipo_tasaVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_tipo_tasaVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_tipo_tasaVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcabe_tipo_tasaVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda= new JButtonMe();
		this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.setText("U");
		this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcabe_tipo_tasaVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcabe_tipo_tasaVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cabe_tipo_tasaVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncabe_tipo_tasaVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcabe_consultorVisibleFactura = new JLabelMe();
		this.jLabelcabe_consultorVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR+" : *");
		this.jLabelcabe_consultorVisibleFactura.setToolTipText("Consultor");
		this.jLabelcabe_consultorVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_consultorVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_consultorVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcabe_consultorVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcabe_consultorVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcabe_consultorVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_CABECONSULTOR);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPanelcabe_consultorVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxcabe_consultorVisibleFactura= new JCheckBoxMe();
		jCheckBoxcabe_consultorVisibleFactura.setEnabled(false);

		jCheckBoxcabe_consultorVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_consultorVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_consultorVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcabe_consultorVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncabe_consultorVisibleFacturaBusqueda= new JButtonMe();
		this.jButtoncabe_consultorVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_consultorVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_consultorVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncabe_consultorVisibleFacturaBusqueda.setText("U");
		this.jButtoncabe_consultorVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncabe_consultorVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncabe_consultorVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcabe_consultorVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcabe_consultorVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cabe_consultorVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncabe_consultorVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcabe_iceVisibleFactura = new JLabelMe();
		this.jLabelcabe_iceVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_CABEICE+" : *");
		this.jLabelcabe_iceVisibleFactura.setToolTipText("Ice");
		this.jLabelcabe_iceVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_iceVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_iceVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcabe_iceVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcabe_iceVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcabe_iceVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_CABEICE);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPanelcabe_iceVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxcabe_iceVisibleFactura= new JCheckBoxMe();
		jCheckBoxcabe_iceVisibleFactura.setEnabled(false);

		jCheckBoxcabe_iceVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_iceVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_iceVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcabe_iceVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncabe_iceVisibleFacturaBusqueda= new JButtonMe();
		this.jButtoncabe_iceVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_iceVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_iceVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncabe_iceVisibleFacturaBusqueda.setText("U");
		this.jButtoncabe_iceVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncabe_iceVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncabe_iceVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcabe_iceVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcabe_iceVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cabe_iceVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncabe_iceVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcabe_transporteVisibleFactura = new JLabelMe();
		this.jLabelcabe_transporteVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE+" : *");
		this.jLabelcabe_transporteVisibleFactura.setToolTipText("Transporte");
		this.jLabelcabe_transporteVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_transporteVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_transporteVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcabe_transporteVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcabe_transporteVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcabe_transporteVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_CABETRANSPORTE);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPanelcabe_transporteVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxcabe_transporteVisibleFactura= new JCheckBoxMe();
		jCheckBoxcabe_transporteVisibleFactura.setEnabled(false);

		jCheckBoxcabe_transporteVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_transporteVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_transporteVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcabe_transporteVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncabe_transporteVisibleFacturaBusqueda= new JButtonMe();
		this.jButtoncabe_transporteVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_transporteVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_transporteVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncabe_transporteVisibleFacturaBusqueda.setText("U");
		this.jButtoncabe_transporteVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncabe_transporteVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncabe_transporteVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcabe_transporteVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcabe_transporteVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cabe_transporteVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncabe_transporteVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcabe_fueVisibleFactura = new JLabelMe();
		this.jLabelcabe_fueVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_CABEFUE+" : *");
		this.jLabelcabe_fueVisibleFactura.setToolTipText("Fuente");
		this.jLabelcabe_fueVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_fueVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_fueVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcabe_fueVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcabe_fueVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcabe_fueVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_CABEFUE);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPanelcabe_fueVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxcabe_fueVisibleFactura= new JCheckBoxMe();
		jCheckBoxcabe_fueVisibleFactura.setEnabled(false);

		jCheckBoxcabe_fueVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_fueVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_fueVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcabe_fueVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncabe_fueVisibleFacturaBusqueda= new JButtonMe();
		this.jButtoncabe_fueVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_fueVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_fueVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncabe_fueVisibleFacturaBusqueda.setText("U");
		this.jButtoncabe_fueVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncabe_fueVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncabe_fueVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcabe_fueVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcabe_fueVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cabe_fueVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncabe_fueVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcabe_ordenVisibleFactura = new JLabelMe();
		this.jLabelcabe_ordenVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_CABEORDEN+" : *");
		this.jLabelcabe_ordenVisibleFactura.setToolTipText("Orden");
		this.jLabelcabe_ordenVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_ordenVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcabe_ordenVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcabe_ordenVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcabe_ordenVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcabe_ordenVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_CABEORDEN);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPanelcabe_ordenVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxcabe_ordenVisibleFactura= new JCheckBoxMe();
		jCheckBoxcabe_ordenVisibleFactura.setEnabled(false);

		jCheckBoxcabe_ordenVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_ordenVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcabe_ordenVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcabe_ordenVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncabe_ordenVisibleFacturaBusqueda= new JButtonMe();
		this.jButtoncabe_ordenVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_ordenVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncabe_ordenVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncabe_ordenVisibleFacturaBusqueda.setText("U");
		this.jButtoncabe_ordenVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncabe_ordenVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncabe_ordenVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcabe_ordenVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcabe_ordenVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cabe_ordenVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncabe_ordenVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldeta_autori_precioVisibleFactura = new JLabelMe();
		this.jLabeldeta_autori_precioVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO+" : *");
		this.jLabeldeta_autori_precioVisibleFactura.setToolTipText("Autorizacion Precio");
		this.jLabeldeta_autori_precioVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldeta_autori_precioVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldeta_autori_precioVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldeta_autori_precioVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldeta_autori_precioVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldeta_autori_precioVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_DETAAUTORIPRECIO);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPaneldeta_autori_precioVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxdeta_autori_precioVisibleFactura= new JCheckBoxMe();
		jCheckBoxdeta_autori_precioVisibleFactura.setEnabled(false);

		jCheckBoxdeta_autori_precioVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxdeta_autori_precioVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxdeta_autori_precioVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxdeta_autori_precioVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondeta_autori_precioVisibleFacturaBusqueda= new JButtonMe();
		this.jButtondeta_autori_precioVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeta_autori_precioVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeta_autori_precioVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondeta_autori_precioVisibleFacturaBusqueda.setText("U");
		this.jButtondeta_autori_precioVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondeta_autori_precioVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondeta_autori_precioVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxdeta_autori_precioVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxdeta_autori_precioVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"deta_autori_precioVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondeta_autori_precioVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldeta_areaVisibleFactura = new JLabelMe();
		this.jLabeldeta_areaVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_DETAAREA+" : *");
		this.jLabeldeta_areaVisibleFactura.setToolTipText("Area");
		this.jLabeldeta_areaVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldeta_areaVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldeta_areaVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldeta_areaVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldeta_areaVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldeta_areaVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_DETAAREA);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPaneldeta_areaVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxdeta_areaVisibleFactura= new JCheckBoxMe();
		jCheckBoxdeta_areaVisibleFactura.setEnabled(false);

		jCheckBoxdeta_areaVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxdeta_areaVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxdeta_areaVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxdeta_areaVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondeta_areaVisibleFacturaBusqueda= new JButtonMe();
		this.jButtondeta_areaVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeta_areaVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeta_areaVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondeta_areaVisibleFacturaBusqueda.setText("U");
		this.jButtondeta_areaVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondeta_areaVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondeta_areaVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxdeta_areaVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxdeta_areaVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"deta_areaVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondeta_areaVisibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldeta_fotoVisibleFactura = new JLabelMe();
		this.jLabeldeta_fotoVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_DETAFOTO+" : *");
		this.jLabeldeta_fotoVisibleFactura.setToolTipText("Foto");
		this.jLabeldeta_fotoVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldeta_fotoVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldeta_fotoVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldeta_fotoVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldeta_fotoVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldeta_fotoVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_DETAFOTO);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPaneldeta_fotoVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jCheckBoxdeta_fotoVisibleFactura= new JCheckBoxMe();
		jCheckBoxdeta_fotoVisibleFactura.setEnabled(false);

		jCheckBoxdeta_fotoVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxdeta_fotoVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxdeta_fotoVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxdeta_fotoVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondeta_fotoVisibleFacturaBusqueda= new JButtonMe();
		this.jButtondeta_fotoVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeta_fotoVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondeta_fotoVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondeta_fotoVisibleFacturaBusqueda.setText("U");
		this.jButtondeta_fotoVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondeta_fotoVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondeta_fotoVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxdeta_fotoVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxdeta_fotoVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"deta_fotoVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondeta_fotoVisibleFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVisibleFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVisibleFactura = new JLabelMe();
		this.jLabelid_empresaVisibleFactura.setText(""+VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVisibleFactura.setToolTipText("Empresa");
		this.jLabelid_empresaVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVisibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVisibleFactura.setToolTipText(VisibleFacturaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVisibleFactura = new GridBagLayout();
		this.jPanelid_empresaVisibleFactura.setLayout(this.gridaBagLayoutVisibleFactura);


		jComboBoxid_empresaVisibleFactura= new JComboBoxMe();
		jComboBoxid_empresaVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVisibleFactura.setEnabled(false);

		this.jButtonid_empresaVisibleFactura= new JButtonMe();
		this.jButtonid_empresaVisibleFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVisibleFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVisibleFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVisibleFactura.setText("Buscar");
		this.jButtonid_empresaVisibleFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVisibleFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVisibleFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVisibleFactura"));

		this.jButtonid_empresaVisibleFacturaBusqueda= new JButtonMe();
		this.jButtonid_empresaVisibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVisibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVisibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVisibleFacturaBusqueda.setText("U");
		this.jButtonid_empresaVisibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVisibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVisibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVisibleFacturaBusqueda"));

		if(this.visiblefacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVisibleFacturaBusqueda.setVisible(false);		}

		this.jButtonid_empresaVisibleFacturaUpdate= new JButtonMe();
		this.jButtonid_empresaVisibleFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVisibleFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVisibleFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVisibleFacturaUpdate.setText("U");
		this.jButtonid_empresaVisibleFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVisibleFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVisibleFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVisibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVisibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVisibleFacturaUpdate"));



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
		//this.jInternalFrameDetalleVisibleFactura = new VisibleFacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Visibilidad Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVisibleFactura= new GridBagLayout();
		

		
		String sToolTipVisibleFactura="";
		sToolTipVisibleFactura=VisibleFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVisibleFactura+="(Facturacion.VisibleFactura)";
		}
		
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVisibleFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVisibleFactura = new JButtonMe();
		this.jButtonModificarVisibleFactura = new JButtonMe();
        this.jButtonActualizarVisibleFactura = new JButtonMe();
        this.jButtonEliminarVisibleFactura = new JButtonMe();
        this.jButtonCancelarVisibleFactura = new JButtonMe();
        this.jButtonGuardarCambiosVisibleFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaVisibleFactura = new JButtonMe();
		this.jButtonCerrarVisibleFactura = new JButtonMe();
		
		this.jScrollPanelDatosVisibleFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionVisibleFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralVisibleFactura = new JScrollPane();
				
		
		
		this.jPanelCamposVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Visibilidad Factura";
		
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visibilidad Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosVisibleFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVisibleFactura.setName("jPanelCamposVisibleFactura"); 

		this.jPanelCamposOcultosVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVisibleFactura.setName("jPanelCamposOcultosVisibleFactura"); 

        this.jPanelAccionesVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVisibleFactura.setToolTipText("Acciones");
        this.jPanelAccionesVisibleFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVisibleFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVisibleFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVisibleFactura.setText("Nuevo");
		this.jButtonModificarVisibleFactura.setText("Editar");
        this.jButtonActualizarVisibleFactura.setText("Actualizar");
        this.jButtonEliminarVisibleFactura.setText("Eliminar");
        this.jButtonCancelarVisibleFactura.setText("Cancelar");
        this.jButtonGuardarCambiosVisibleFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaVisibleFactura.setText("Guardar");
		this.jButtonCerrarVisibleFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVisibleFactura,"nuevo_button","Nuevo",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVisibleFactura,"modificar_button","Editar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVisibleFactura,"actualizar_button","Actualizar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVisibleFactura,"eliminar_button","Eliminar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVisibleFactura,"cancelar_button","Cancelar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVisibleFactura,"guardarcambios_button","Guardar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVisibleFactura,"guardarcambiostabla_button","Guardar",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVisibleFactura,"cerrar_button","Salir",this.visiblefacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVisibleFactura.setToolTipText("Nuevo"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVisibleFactura.setToolTipText("Editar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVisibleFactura.setToolTipText("Actualizar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVisibleFactura.setToolTipText("Eliminar)"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVisibleFactura.setToolTipText("Cancelar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVisibleFactura.setToolTipText("Guardar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVisibleFactura.setToolTipText("Guardar"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVisibleFactura.setToolTipText("Salir"+" "+VisibleFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVisibleFactura";
		inputMap = this.jButtonNuevoVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVisibleFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVisibleFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVisibleFactura";
		inputMap = this.jButtonActualizarVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVisibleFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarVisibleFactura";
		inputMap = this.jButtonEliminarVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVisibleFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarVisibleFactura";
		inputMap = this.jButtonCancelarVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVisibleFactura"));
		
		//CERRAR		
		sMapKey = "CerrarVisibleFactura";
		inputMap = this.jButtonCerrarVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVisibleFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVisibleFactura";
		inputMap = this.jButtonGuardarCambiosTablaVisibleFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVisibleFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVisibleFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVisibleFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVisibleFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVisibleFactura.setToolTipText("Nuevo VisibleFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVisibleFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVisibleFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVisibleFactura.setToolTipText("Sin Cerrar Ventana VisibleFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVisibleFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVisibleFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVisibleFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVisibleFactura.setText("Accion");
		this.jComboBoxTiposAccionesVisibleFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVisibleFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVisibleFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVisibleFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVisibleFactura = new JLabelMe();
		
		this.jLabelAccionesVisibleFactura.setText("Acciones");		
		this.jLabelAccionesVisibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVisibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVisibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVisibleFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVisibleFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVisibleFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesVisibleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVisibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVisibleFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVisibleFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVisibleFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVisibleFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVisibleFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVisibleFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVisibleFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVisibleFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVisibleFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVisibleFactura = new GridBagLayout();
		
		this.jPanelCamposVisibleFactura.setLayout(gridaBagLayoutCamposVisibleFactura);
		this.jPanelCamposOcultosVisibleFactura.setLayout(gridaBagLayoutCamposOcultosVisibleFactura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVisibleFactura.add(jLabelIdVisibleFactura, this.gridBagConstraintsVisibleFactura);



	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVisibleFactura.add(jLabelidVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVisibleFactura.add(jLabelid_empresaVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVisibleFactura.add(jButtonid_empresaVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 3;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVisibleFactura.add(jButtonid_empresaVisibleFacturaUpdate, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVisibleFactura.add(jComboBoxid_empresaVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcabe_consignatarioVisibleFactura.add(jLabelcabe_consignatarioVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcabe_consignatarioVisibleFactura.add(jButtoncabe_consignatarioVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcabe_consignatarioVisibleFactura.add(jCheckBoxcabe_consignatarioVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcabe_tipo_tasaVisibleFactura.add(jLabelcabe_tipo_tasaVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcabe_tipo_tasaVisibleFactura.add(jButtoncabe_tipo_tasaVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcabe_tipo_tasaVisibleFactura.add(jCheckBoxcabe_tipo_tasaVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcabe_consultorVisibleFactura.add(jLabelcabe_consultorVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcabe_consultorVisibleFactura.add(jButtoncabe_consultorVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcabe_consultorVisibleFactura.add(jCheckBoxcabe_consultorVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcabe_iceVisibleFactura.add(jLabelcabe_iceVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcabe_iceVisibleFactura.add(jButtoncabe_iceVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcabe_iceVisibleFactura.add(jCheckBoxcabe_iceVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcabe_transporteVisibleFactura.add(jLabelcabe_transporteVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcabe_transporteVisibleFactura.add(jButtoncabe_transporteVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcabe_transporteVisibleFactura.add(jCheckBoxcabe_transporteVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcabe_fueVisibleFactura.add(jLabelcabe_fueVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcabe_fueVisibleFactura.add(jButtoncabe_fueVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcabe_fueVisibleFactura.add(jCheckBoxcabe_fueVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcabe_ordenVisibleFactura.add(jLabelcabe_ordenVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcabe_ordenVisibleFactura.add(jButtoncabe_ordenVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcabe_ordenVisibleFactura.add(jCheckBoxcabe_ordenVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldeta_autori_precioVisibleFactura.add(jLabeldeta_autori_precioVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldeta_autori_precioVisibleFactura.add(jButtondeta_autori_precioVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldeta_autori_precioVisibleFactura.add(jCheckBoxdeta_autori_precioVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldeta_areaVisibleFactura.add(jLabeldeta_areaVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldeta_areaVisibleFactura.add(jButtondeta_areaVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldeta_areaVisibleFactura.add(jCheckBoxdeta_areaVisibleFactura, this.gridBagConstraintsVisibleFactura);


	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 0;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldeta_fotoVisibleFactura.add(jLabeldeta_fotoVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		//this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = 2;
		this.gridBagConstraintsVisibleFactura.ipadx = 0;
		this.gridBagConstraintsVisibleFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldeta_fotoVisibleFactura.add(jButtondeta_fotoVisibleFacturaBusqueda, this.gridBagConstraintsVisibleFactura);
	}

	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisibleFactura.gridy = 0;
	this.gridBagConstraintsVisibleFactura.gridx = 1;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldeta_fotoVisibleFactura.add(jCheckBoxdeta_fotoVisibleFactura, this.gridBagConstraintsVisibleFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPanelidVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPanelcabe_consignatarioVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPanelcabe_tipo_tasaVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPanelcabe_consultorVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPanelcabe_iceVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPanelcabe_transporteVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPanelcabe_fueVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPanelcabe_ordenVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPaneldeta_autori_precioVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPaneldeta_areaVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisibleFactura.add(this.jPaneldeta_fotoVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposVisibleFactura % 1==0) {
		iXPanelCamposVisibleFactura=0;
		iYPanelCamposVisibleFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisibleFactura.gridy = iYPanelCamposOcultosVisibleFactura;
	this.gridBagConstraintsVisibleFactura.gridx = iXPanelCamposOcultosVisibleFactura++;
	this.gridBagConstraintsVisibleFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisibleFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVisibleFactura.add(this.jPanelid_empresaVisibleFactura, this.gridBagConstraintsVisibleFactura);



	if(iXPanelCamposOcultosVisibleFactura % 1==0) {
		iXPanelCamposOcultosVisibleFactura=0;
		iYPanelCamposOcultosVisibleFactura++;
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
			
		GridBagLayout gridaBagLayoutAccionesVisibleFactura= new GridBagLayout();
		this.jPanelAccionesVisibleFactura.setLayout(gridaBagLayoutAccionesVisibleFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVisibleFactura= new GridBagLayout();
		this.jPanelAccionesFormularioVisibleFactura.setLayout(gridaBagLayoutAccionesFormularioVisibleFactura);
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVisibleFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVisibleFactura.add(this.jComboBoxTiposAccionesFormularioVisibleFactura, this.gridBagConstraintsVisibleFactura);

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVisibleFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVisibleFactura.add(this.jCheckBoxPostAccionNuevoVisibleFactura, this.gridBagConstraintsVisibleFactura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVisibleFactura.add(this.jCheckBoxPostAccionSinCerrarVisibleFactura, this.gridBagConstraintsVisibleFactura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.visiblefacturaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.visiblefacturaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVisibleFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVisibleFactura.add(this.jCheckBoxPostAccionSinMensajeVisibleFactura, this.gridBagConstraintsVisibleFactura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesVisibleFactura.add(this.jButtonModificarVisibleFactura, this.gridBagConstraintsVisibleFactura);							

		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisibleFactura.gridy = 0;
		this.gridBagConstraintsVisibleFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesVisibleFactura.add(this.jButtonEliminarVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
			
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = 0;		
		this.gridBagConstraintsVisibleFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesVisibleFactura.add(this.jButtonActualizarVisibleFactura, this.gridBagConstraintsVisibleFactura);


		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = 0;		
		this.gridBagConstraintsVisibleFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesVisibleFactura.add(this.jButtonGuardarCambiosVisibleFactura, this.gridBagConstraintsVisibleFactura);	
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = 0;		
		this.gridBagConstraintsVisibleFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesVisibleFactura.add(this.jButtonCancelarVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVisibleFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVisibleFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.visiblefacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();						
			this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVisibleFactura.gridx = 0;		
			//this.gridBagConstraintsVisibleFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVisibleFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVisibleFactura.gridx =0;
		this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVisibleFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVisibleFactura, this.gridBagConstraintsVisibleFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VisibleFacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVisibleFactura = new VisibleFacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Visibilidad Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Visibilidad Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Visibilidad Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VisibleFacturaModel visiblefacturaModel=new VisibleFacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//VisibleFacturaModel.VisibleFacturaFocusTraversalPolicy visiblefacturaFocusTraversalPolicy = visiblefacturaModel.new VisibleFacturaFocusTraversalPolicy(this);
			
			//visiblefacturaFocusTraversalPolicy.setvisiblefacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(visiblefacturaModel);
			
			
			this.jContentPaneDetalleVisibleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVisibleFactura = new GridBagLayout();	
			this.jContentPaneDetalleVisibleFactura.setLayout(gridaBagLayoutDetalleVisibleFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVisibleFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
				this.gridBagConstraintsVisibleFactura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVisibleFactura.gridx = 0;
					
				
				this.jContentPaneDetalleVisibleFactura.add(jTtoolBarDetalleVisibleFactura, gridBagConstraintsVisibleFactura);								
				
}
			
			this.jScrollPanelDatosEdicionVisibleFactura=   new JScrollPane(jContentPaneDetalleVisibleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVisibleFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVisibleFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVisibleFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVisibleFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVisibleFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVisibleFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVisibleFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVisibleFactura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVisibleFactura.gridx = 0;
	        
			this.jContentPaneDetalleVisibleFactura.add(jPanelCamposVisibleFactura, gridBagConstraintsVisibleFactura);
			
			
			
			
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
						&& visiblefacturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.visiblefacturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVisibleFactura= new GridBagConstraints();
						this.gridBagConstraintsVisibleFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVisibleFactura.gridx = 0;
						this.jContentPaneDetalleVisibleFactura.add(this.jTabbedPaneRelacionesVisibleFactura, this.gridBagConstraintsVisibleFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVisibleFactura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVisibleFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
					this.gridBagConstraintsVisibleFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVisibleFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVisibleFactura.gridx = 0;
					
				
					this.jContentPaneDetalleVisibleFactura.add(jPanelCamposOcultosVisibleFactura, gridBagConstraintsVisibleFactura);
				
					this.jPanelCamposOcultosVisibleFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVisibleFactura.gridx = 0;
	        this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVisibleFactura.add(this.jPanelAccionesFormularioVisibleFactura, this.gridBagConstraintsVisibleFactura);							
			
			
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
	        this.gridBagConstraintsVisibleFactura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVisibleFactura.gridx = 0;
	        
			
			this.jContentPaneDetalleVisibleFactura.add(this.jPanelAccionesVisibleFactura, this.gridBagConstraintsVisibleFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVisibleFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVisibleFactura=   new JScrollPane(this.jPanelCamposVisibleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVisibleFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVisibleFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVisibleFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVisibleFactura.gridx = 0;
			this.gridBagConstraintsVisibleFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVisibleFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVisibleFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVisibleFactura, this.gridBagConstraintsVisibleFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVisibleFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVisibleFactura, this.gridBagConstraintsVisibleFactura);			
			
			this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
			this.gridBagConstraintsVisibleFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVisibleFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVisibleFactura, this.gridBagConstraintsVisibleFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVisibleFactura, this.gridBagConstraintsVisibleFactura);
			
			
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVisibleFactura, this.gridBagConstraintsVisibleFactura);
		
			
		this.gridBagConstraintsVisibleFactura = new GridBagConstraints();
		this.gridBagConstraintsVisibleFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVisibleFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVisibleFactura, this.gridBagConstraintsVisibleFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVisibleFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionVisibleFactura;
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
