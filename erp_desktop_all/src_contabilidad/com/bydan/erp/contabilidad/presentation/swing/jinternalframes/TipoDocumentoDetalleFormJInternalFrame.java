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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoDocumentoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoDocumentoDetalleFormJInternalFrame extends TipoDocumentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDocumento;
	
	protected JMenuBar jmenuBarDetalleTipoDocumento;
	
	protected JMenu jmenuDetalleTipoDocumento;
	protected JMenu jmenuDetalleArchivoTipoDocumento;
	protected JMenu jmenuDetalleAccionesTipoDocumento;
	protected JMenu jmenuDetalleDatosTipoDocumento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDocumento;	
	protected GridBagConstraints gridBagConstraintsTipoDocumento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDocumentoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDocumento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";
	
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;	
	
	public TipoDocumentoLogic tipodocumentoLogic;
	
	public JScrollPane jScrollPanelDatosTipoDocumento;
	public JScrollPane jScrollPanelDatosEdicionTipoDocumento;
	public JScrollPane jScrollPanelDatosGeneralTipoDocumento;
	
	protected JPanel jPanelCamposTipoDocumento;    
	protected JPanel jPanelCamposOcultosTipoDocumento;    	
	protected JPanel jPanelAccionesTipoDocumento;
	protected JPanel jPanelAccionesFormularioTipoDocumento;
    
	
	
	protected Integer iXPanelCamposTipoDocumento=0;
	protected Integer iYPanelCamposTipoDocumento=0;
	
	protected Integer iXPanelCamposOcultosTipoDocumento=0;
	protected Integer iYPanelCamposOcultosTipoDocumento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDocumento;
	public JButton jButtonModificarTipoDocumento;
	public JButton jButtonActualizarTipoDocumento;
    public JButton jButtonEliminarTipoDocumento;
	public JButton jButtonCancelarTipoDocumento;
    public JButton jButtonGuardarCambiosTipoDocumento;
	public JButton jButtonGuardarCambiosTablaTipoDocumento;
	protected JButton jButtonCerrarTipoDocumento;
	
	
	protected JButton jButtonProcesarInformacionTipoDocumento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDocumento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDocumento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDocumento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDocumento;
	protected JButton jButtonModificarToolBarTipoDocumento;
	protected JButton jButtonActualizarToolBarTipoDocumento;
    protected JButton jButtonEliminarToolBarTipoDocumento;
	protected JButton jButtonCancelarToolBarTipoDocumento;
    protected JButton jButtonGuardarCambiosToolBarTipoDocumento;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDocumento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDocumento;
	protected JButton jButtonCerrarToolBarTipoDocumento;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDocumento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDocumento;
	protected JMenuItem jMenuItemModificarTipoDocumento;
	protected JMenuItem jMenuItemActualizarTipoDocumento;
    protected JMenuItem jMenuItemEliminarTipoDocumento;
	protected JMenuItem jMenuItemCancelarTipoDocumento;
    protected JMenuItem jMenuItemGuardarCambiosTipoDocumento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDocumento;
	protected JMenuItem jMenuItemCerrarTipoDocumento;
	protected JMenuItem jMenuItemDetalleCerrarTipoDocumento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDocumento;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDocumento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDocumento;
	protected JMenuItem jMenuItemMostrarOcultarTipoDocumento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDocumento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDocumento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDocumento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDocumento;
	public JLabel jLabelIdTipoDocumento;
	public JLabel jLabelidTipoDocumento;
	public JButton jButtonidTipoDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDocumento;
	public JLabel jLabelcodigoTipoDocumento;
	public JTextField jTextFieldcodigoTipoDocumento;
	public JButton jButtoncodigoTipoDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDocumento;
	public JLabel jLabelnombreTipoDocumento;
	public JTextArea jTextAreanombreTipoDocumento;
	public JScrollPane jscrollPanenombreTipoDocumento;
	public JButton jButtonnombreTipoDocumentoBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoTipoDocumento;
	public JLabel jLabeles_defectoTipoDocumento;
	public JCheckBox jCheckBoxes_defectoTipoDocumento;
	public JButton jButtones_defectoTipoDocumentoBusqueda= new JButtonMe();

	public JPanel jPaneles_mayorTipoDocumento;
	public JLabel jLabeles_mayorTipoDocumento;
	public JCheckBox jCheckBoxes_mayorTipoDocumento;
	public JButton jButtones_mayorTipoDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDocumento;
	public JLabel jLabelid_empresaTipoDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDocumento;
	public JButton jButtonid_empresaTipoDocumento= new JButtonMe();
	public JButton jButtonid_empresaTipoDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloTipoDocumento;
	public JLabel jLabelid_moduloTipoDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTipoDocumento;
	public JButton jButtonid_moduloTipoDocumento= new JButtonMe();
	public JButton jButtonid_moduloTipoDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_moduloTipoDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoTipoDocumento;
	public JLabel jLabelid_tipo_movimientoTipoDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoTipoDocumento;
	public JButton jButtonid_tipo_movimientoTipoDocumento= new JButtonMe();
	public JButton jButtonid_tipo_movimientoTipoDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoTipoDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimiento_moduloTipoDocumento;
	public JLabel jLabelid_tipo_movimiento_moduloTipoDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloTipoDocumento;
	public JButton jButtonid_tipo_movimiento_moduloTipoDocumento= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDocumento;
	
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
	
	public TipoDocumentoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDocumento=new JPanel();
				this.jPanelAccionesFormularioTipoDocumento=new JPanel();
				this.jmenuBarDetalleTipoDocumento=new JMenuBar();
				this.jTtoolBarDetalleTipoDocumento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDocumentoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDocumento() {
		return this.jButtonActualizarToolBarTipoDocumento;
	}
	
	public JButton getjButtonEliminarToolBarTipoDocumento() {
		return this.jButtonEliminarToolBarTipoDocumento;
	}
	
	public JButton getjButtonCancelarToolBarTipoDocumento() {
		return this.jButtonCancelarToolBarTipoDocumento;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDocumento() {
		return this.jButtonProcesarInformacionTipoDocumento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDocumento)	{
		this.jButtonProcesarInformacionTipoDocumento = jButtonProcesarInformacionTipoDocumento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDocumento() {
		return this.jComboBoxTiposAccionesTipoDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDocumento(
			JComboBox jComboBoxTiposRelacionesTipoDocumento) {
		this.jComboBoxTiposRelacionesTipoDocumento = jComboBoxTiposRelacionesTipoDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDocumento(
			JComboBox jComboBoxTiposAccionesTipoDocumento) {
		this.jComboBoxTiposAccionesTipoDocumento = jComboBoxTiposAccionesTipoDocumento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDocumento() {
		return this.jComboBoxTiposAccionesFormularioTipoDocumento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDocumento(
			JComboBox jComboBoxTiposAccionesFormularioTipoDocumento) {
		this.jComboBoxTiposAccionesFormularioTipoDocumento = jComboBoxTiposAccionesFormularioTipoDocumento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
		
		this.tipodocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodocumentoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDocumentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Documento MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDocumento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDocumento=new JButtonMe();
				this.jButtonModificarToolBarTipoDocumento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDocumento,this.jTtoolBarDetalleTipoDocumento,
							"actualizar","actualizar","Actualizar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDocumento,this.jTtoolBarDetalleTipoDocumento,
							"eliminar","eliminar","Eliminar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDocumento,this.jTtoolBarDetalleTipoDocumento,
							"cancelar","cancelar","Cancelar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDocumento,this.jTtoolBarDetalleTipoDocumento,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDocumento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDocumento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDocumento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDocumento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDocumento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDocumento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDocumento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDocumento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDocumento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDocumento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDocumento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDocumento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDocumento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDocumento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDocumento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDocumento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDocumento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDocumento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDocumento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDocumento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDocumento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDocumento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDocumento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDocumento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDocumento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDocumento.add(this.jMenuItemDetalleCerrarTipoDocumento);
		
		this.jmenuDetalleAccionesTipoDocumento.add(this.jMenuItemActualizarTipoDocumento);
		this.jmenuDetalleAccionesTipoDocumento.add(this.jMenuItemEliminarTipoDocumento);
		this.jmenuDetalleAccionesTipoDocumento.add(this.jMenuItemCancelarTipoDocumento);		
		
		//this.jmenuDetalleDatosTipoDocumento.add(this.jMenuItemDetalleAbrirOrderByTipoDocumento);				
		this.jmenuDetalleDatosTipoDocumento.add(this.jMenuItemDetalleMostarOcultarTipoDocumento);				
				
		//this.jmenuDetalleAccionesTipoDocumento.add(this.jMenuItemGuardarCambiosTipoDocumento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDocumento.add(this.jmenuDetalleArchivoTipoDocumento);		
		this.jmenuBarDetalleTipoDocumento.add(this.jmenuDetalleAccionesTipoDocumento);		
		this.jmenuBarDetalleTipoDocumento.add(this.jmenuDetalleDatosTipoDocumento);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDocumento);				
	}
	
	
	public void inicializarElementosCamposTipoDocumento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDocumento = new JLabelMe();
		jLabelIdTipoDocumento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDocumento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDocumento= new GridBagLayout();

		this.jPanelidTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);

		jLabelidTipoDocumento = new JLabel();
		jLabelidTipoDocumento.setText("Id");

		jLabelidTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDocumento = new JLabelMe();
		this.jLabelcodigoTipoDocumento.setText(""+TipoDocumentoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDocumento.setToolTipText("Codigo");
		this.jLabelcodigoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDocumento = new GridBagLayout();
		this.jPanelcodigoTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);


		jTextFieldcodigoTipoDocumento= new JTextFieldMe();

		jTextFieldcodigoTipoDocumento.setEnabled(false);
		jTextFieldcodigoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDocumentoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDocumentoBusqueda.setText("U");
		this.jButtoncodigoTipoDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDocumentoBusqueda"));

		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDocumentoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDocumento = new JLabelMe();
		this.jLabelnombreTipoDocumento.setText(""+TipoDocumentoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDocumento.setToolTipText("Nombre");
		this.jLabelnombreTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDocumento = new GridBagLayout();
		this.jPanelnombreTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);


		jTextAreanombreTipoDocumento= new JTextAreaMe();
		jTextAreanombreTipoDocumento.setEnabled(false);
		jTextAreanombreTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDocumento.setLineWrap(true);
		jTextAreanombreTipoDocumento.setWrapStyleWord(true);
		jTextAreanombreTipoDocumento.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDocumento.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDocumento = new JScrollPane(jTextAreanombreTipoDocumento);
		jscrollPanenombreTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoDocumentoBusqueda= new JButtonMe();
		this.jButtonnombreTipoDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDocumentoBusqueda.setText("U");
		this.jButtonnombreTipoDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDocumentoBusqueda"));

		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDocumentoBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoTipoDocumento = new JLabelMe();
		this.jLabeles_defectoTipoDocumento.setText(""+TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoTipoDocumento.setToolTipText("Es Defecto");
		this.jLabeles_defectoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutTipoDocumento = new GridBagLayout();
		this.jPaneles_defectoTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);


		jCheckBoxes_defectoTipoDocumento= new JCheckBoxMe();
		jCheckBoxes_defectoTipoDocumento.setEnabled(false);

		jCheckBoxes_defectoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoTipoDocumentoBusqueda= new JButtonMe();
		this.jButtones_defectoTipoDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoTipoDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoTipoDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoTipoDocumentoBusqueda.setText("U");
		this.jButtones_defectoTipoDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoTipoDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoTipoDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoTipoDocumentoBusqueda"));

		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoTipoDocumentoBusqueda.setVisible(false);		}


					
		this.jLabeles_mayorTipoDocumento = new JLabelMe();
		this.jLabeles_mayorTipoDocumento.setText(""+TipoDocumentoConstantesFunciones.LABEL_ESMAYOR+" : *");
		this.jLabeles_mayorTipoDocumento.setToolTipText("Es Mayor");
		this.jLabeles_mayorTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mayorTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mayorTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_mayorTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_mayorTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_mayorTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_ESMAYOR);
		this.gridaBagLayoutTipoDocumento = new GridBagLayout();
		this.jPaneles_mayorTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);


		jCheckBoxes_mayorTipoDocumento= new JCheckBoxMe();
		jCheckBoxes_mayorTipoDocumento.setEnabled(false);

		jCheckBoxes_mayorTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mayorTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mayorTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_mayorTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_mayorTipoDocumentoBusqueda= new JButtonMe();
		this.jButtones_mayorTipoDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mayorTipoDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mayorTipoDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_mayorTipoDocumentoBusqueda.setText("U");
		this.jButtones_mayorTipoDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_mayorTipoDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_mayorTipoDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_mayorTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_mayorTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_mayorTipoDocumentoBusqueda"));

		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_mayorTipoDocumentoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDocumento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDocumento = new JLabelMe();
		this.jLabelid_empresaTipoDocumento.setText(""+TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDocumento.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDocumento = new GridBagLayout();
		this.jPanelid_empresaTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);


		jComboBoxid_empresaTipoDocumento= new JComboBoxMe();
		jComboBoxid_empresaTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDocumento.setEnabled(false);

		this.jButtonid_empresaTipoDocumento= new JButtonMe();
		this.jButtonid_empresaTipoDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDocumento.setText("Buscar");
		this.jButtonid_empresaTipoDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDocumento"));

		this.jButtonid_empresaTipoDocumentoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDocumentoBusqueda.setText("U");
		this.jButtonid_empresaTipoDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDocumentoBusqueda"));

		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDocumentoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDocumentoUpdate.setText("U");
		this.jButtonid_empresaTipoDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDocumentoUpdate"));



					
		this.jLabelid_moduloTipoDocumento = new JLabelMe();
		this.jLabelid_moduloTipoDocumento.setText(""+TipoDocumentoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTipoDocumento.setToolTipText("Modulo");
		this.jLabelid_moduloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTipoDocumento = new GridBagLayout();
		this.jPanelid_moduloTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);


		jComboBoxid_moduloTipoDocumento= new JComboBoxMe();
		jComboBoxid_moduloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloTipoDocumento= new JButtonMe();
		this.jButtonid_moduloTipoDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoDocumento.setText("Buscar");
		this.jButtonid_moduloTipoDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTipoDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoDocumento"));

		this.jButtonid_moduloTipoDocumentoBusqueda= new JButtonMe();
		this.jButtonid_moduloTipoDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoDocumentoBusqueda.setText("U");
		this.jButtonid_moduloTipoDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTipoDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoDocumentoBusqueda"));

		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTipoDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_moduloTipoDocumentoUpdate= new JButtonMe();
		this.jButtonid_moduloTipoDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoDocumentoUpdate.setText("U");
		this.jButtonid_moduloTipoDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTipoDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoDocumentoUpdate"));



					
		this.jLabelid_tipo_movimientoTipoDocumento = new JLabelMe();
		this.jLabelid_tipo_movimientoTipoDocumento.setText(""+TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoTipoDocumento.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutTipoDocumento = new GridBagLayout();
		this.jPanelid_tipo_movimientoTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);


		jComboBoxid_tipo_movimientoTipoDocumento= new JComboBoxMe();
		jComboBoxid_tipo_movimientoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoTipoDocumento= new JButtonMe();
		this.jButtonid_tipo_movimientoTipoDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoTipoDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoTipoDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoTipoDocumento.setText("Buscar");
		this.jButtonid_tipo_movimientoTipoDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoTipoDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoTipoDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoTipoDocumento"));

		this.jButtonid_tipo_movimientoTipoDocumentoBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoTipoDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoTipoDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoTipoDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoTipoDocumentoBusqueda.setText("U");
		this.jButtonid_tipo_movimientoTipoDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoTipoDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoTipoDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoTipoDocumentoBusqueda"));

		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoTipoDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoTipoDocumentoUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoTipoDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoTipoDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoTipoDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoTipoDocumentoUpdate.setText("U");
		this.jButtonid_tipo_movimientoTipoDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoTipoDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoTipoDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoTipoDocumentoUpdate"));



					
		this.jLabelid_tipo_movimiento_moduloTipoDocumento = new JLabelMe();
		this.jLabelid_tipo_movimiento_moduloTipoDocumento.setText(""+TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO+" : *");
		this.jLabelid_tipo_movimiento_moduloTipoDocumento.setToolTipText("Tipo Movimiento Modulo");
		this.jLabelid_tipo_movimiento_moduloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimiento_moduloTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimiento_moduloTipoDocumento.setToolTipText(TipoDocumentoConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		this.gridaBagLayoutTipoDocumento = new GridBagLayout();
		this.jPanelid_tipo_movimiento_moduloTipoDocumento.setLayout(this.gridaBagLayoutTipoDocumento);


		jComboBoxid_tipo_movimiento_moduloTipoDocumento= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.setEnabled(false);

		this.jButtonid_tipo_movimiento_moduloTipoDocumento= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloTipoDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloTipoDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloTipoDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloTipoDocumento.setText("Buscar");
		this.jButtonid_tipo_movimiento_moduloTipoDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimiento_moduloTipoDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloTipoDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloTipoDocumento"));

		this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.setText("U");
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloTipoDocumentoBusqueda"));

		if(this.tipodocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.setText("U");
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloTipoDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloTipoDocumentoUpdate"));



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
		//this.jInternalFrameDetalleTipoDocumento = new TipoDocumentoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Documento DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDocumento= new GridBagLayout();
		

		
		String sToolTipTipoDocumento="";
		sToolTipTipoDocumento=TipoDocumentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDocumento+="(Contabilidad.TipoDocumento)";
		}
		
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDocumento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDocumento = new JButtonMe();
		this.jButtonModificarTipoDocumento = new JButtonMe();
        this.jButtonActualizarTipoDocumento = new JButtonMe();
        this.jButtonEliminarTipoDocumento = new JButtonMe();
        this.jButtonCancelarTipoDocumento = new JButtonMe();
        this.jButtonGuardarCambiosTipoDocumento = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDocumento = new JButtonMe();
		this.jButtonCerrarTipoDocumento = new JButtonMe();
		
		this.jScrollPanelDatosTipoDocumento = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDocumento = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDocumento = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Documento";
		
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documentos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDocumento.setName("jPanelCamposTipoDocumento"); 

		this.jPanelCamposOcultosTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDocumento.setName("jPanelCamposOcultosTipoDocumento"); 

        this.jPanelAccionesTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDocumento.setToolTipText("Acciones");
        this.jPanelAccionesTipoDocumento.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDocumento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDocumento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDocumento.setText("Nuevo");
		this.jButtonModificarTipoDocumento.setText("Editar");
        this.jButtonActualizarTipoDocumento.setText("Actualizar");
        this.jButtonEliminarTipoDocumento.setText("Eliminar");
        this.jButtonCancelarTipoDocumento.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDocumento.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDocumento.setText("Guardar");
		this.jButtonCerrarTipoDocumento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDocumento,"nuevo_button","Nuevo",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDocumento,"modificar_button","Editar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDocumento,"actualizar_button","Actualizar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDocumento,"eliminar_button","Eliminar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDocumento,"cancelar_button","Cancelar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDocumento,"guardarcambios_button","Guardar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDocumento,"guardarcambiostabla_button","Guardar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDocumento,"cerrar_button","Salir",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDocumento.setToolTipText("Nuevo"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDocumento.setToolTipText("Editar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDocumento.setToolTipText("Actualizar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDocumento.setToolTipText("Eliminar)"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDocumento.setToolTipText("Cancelar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDocumento.setToolTipText("Guardar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDocumento.setToolTipText("Guardar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDocumento.setToolTipText("Salir"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDocumento";
		inputMap = this.jButtonNuevoTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDocumento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDocumento";
		inputMap = this.jButtonActualizarTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDocumento"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDocumento";
		inputMap = this.jButtonEliminarTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDocumento"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDocumento";
		inputMap = this.jButtonCancelarTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDocumento"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDocumento";
		inputMap = this.jButtonCerrarTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDocumento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDocumento";
		inputMap = this.jButtonGuardarCambiosTablaTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDocumento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDocumento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDocumento.setToolTipText("Nuevo TipoDocumento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDocumento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDocumento.setToolTipText("Sin Cerrar Ventana TipoDocumento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDocumento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDocumento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDocumento.setText("Accion");
		this.jComboBoxTiposAccionesTipoDocumento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDocumento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDocumento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDocumento = new JLabelMe();
		
		this.jLabelAccionesTipoDocumento.setText("Acciones");		
		this.jLabelAccionesTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDocumento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDocumento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDocumento=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDocumento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDocumento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDocumento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDocumento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDocumento = new GridBagLayout();
		
		this.jPanelCamposTipoDocumento.setLayout(gridaBagLayoutCamposTipoDocumento);
		this.jPanelCamposOcultosTipoDocumento.setLayout(gridaBagLayoutCamposOcultosTipoDocumento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDocumento.add(jLabelIdTipoDocumento, this.gridBagConstraintsTipoDocumento);



	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDocumento.add(jLabelidTipoDocumento, this.gridBagConstraintsTipoDocumento);


	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDocumento.add(jLabelid_empresaTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 2;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDocumento.add(jButtonid_empresaTipoDocumentoBusqueda, this.gridBagConstraintsTipoDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 3;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDocumento.add(jButtonid_empresaTipoDocumentoUpdate, this.gridBagConstraintsTipoDocumento);
	}

	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDocumento.add(jComboBoxid_empresaTipoDocumento, this.gridBagConstraintsTipoDocumento);


	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTipoDocumento.add(jLabelid_moduloTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 2;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoDocumento.add(jButtonid_moduloTipoDocumentoBusqueda, this.gridBagConstraintsTipoDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 3;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoDocumento.add(jButtonid_moduloTipoDocumentoUpdate, this.gridBagConstraintsTipoDocumento);
	}

	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTipoDocumento.add(jComboBoxid_moduloTipoDocumento, this.gridBagConstraintsTipoDocumento);


	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoTipoDocumento.add(jLabelid_tipo_movimientoTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 2;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoTipoDocumento.add(jButtonid_tipo_movimientoTipoDocumentoBusqueda, this.gridBagConstraintsTipoDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 3;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoTipoDocumento.add(jButtonid_tipo_movimientoTipoDocumentoUpdate, this.gridBagConstraintsTipoDocumento);
	}

	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoTipoDocumento.add(jComboBoxid_tipo_movimientoTipoDocumento, this.gridBagConstraintsTipoDocumento);


	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDocumento.add(jLabelcodigoTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 2;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDocumento.add(jButtoncodigoTipoDocumentoBusqueda, this.gridBagConstraintsTipoDocumento);
	}

	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDocumento.add(jTextFieldcodigoTipoDocumento, this.gridBagConstraintsTipoDocumento);


	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDocumento.add(jLabelnombreTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 2;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDocumento.add(jButtonnombreTipoDocumentoBusqueda, this.gridBagConstraintsTipoDocumento);
	}

	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDocumento.add(jscrollPanenombreTipoDocumento, this.gridBagConstraintsTipoDocumento);


	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimiento_moduloTipoDocumento.add(jLabelid_tipo_movimiento_moduloTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 2;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloTipoDocumento.add(jButtonid_tipo_movimiento_moduloTipoDocumentoBusqueda, this.gridBagConstraintsTipoDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 3;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloTipoDocumento.add(jButtonid_tipo_movimiento_moduloTipoDocumentoUpdate, this.gridBagConstraintsTipoDocumento);
	}

	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimiento_moduloTipoDocumento.add(jComboBoxid_tipo_movimiento_moduloTipoDocumento, this.gridBagConstraintsTipoDocumento);


	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoTipoDocumento.add(jLabeles_defectoTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 2;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoTipoDocumento.add(jButtones_defectoTipoDocumentoBusqueda, this.gridBagConstraintsTipoDocumento);
	}

	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoTipoDocumento.add(jCheckBoxes_defectoTipoDocumento, this.gridBagConstraintsTipoDocumento);


	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 0;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_mayorTipoDocumento.add(jLabeles_mayorTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 2;
		this.gridBagConstraintsTipoDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_mayorTipoDocumento.add(jButtones_mayorTipoDocumentoBusqueda, this.gridBagConstraintsTipoDocumento);
	}

	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDocumento.gridy = 0;
	this.gridBagConstraintsTipoDocumento.gridx = 1;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_mayorTipoDocumento.add(jCheckBoxes_mayorTipoDocumento, this.gridBagConstraintsTipoDocumento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumento.add(this.jPanelidTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposTipoDocumento % 1==0) {
		iXPanelCamposTipoDocumento=0;
		iYPanelCamposTipoDocumento++;
	}
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumento.add(this.jPanelid_moduloTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposTipoDocumento % 1==0) {
		iXPanelCamposTipoDocumento=0;
		iYPanelCamposTipoDocumento++;
	}
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumento.add(this.jPanelid_tipo_movimientoTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposTipoDocumento % 1==0) {
		iXPanelCamposTipoDocumento=0;
		iYPanelCamposTipoDocumento++;
	}
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumento.add(this.jPanelcodigoTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposTipoDocumento % 1==0) {
		iXPanelCamposTipoDocumento=0;
		iYPanelCamposTipoDocumento++;
	}
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumento.add(this.jPanelnombreTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposTipoDocumento % 1==0) {
		iXPanelCamposTipoDocumento=0;
		iYPanelCamposTipoDocumento++;
	}
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumento.add(this.jPaneles_defectoTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposTipoDocumento % 1==0) {
		iXPanelCamposTipoDocumento=0;
		iYPanelCamposTipoDocumento++;
	}
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDocumento.add(this.jPaneles_mayorTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposTipoDocumento % 1==0) {
		iXPanelCamposTipoDocumento=0;
		iYPanelCamposTipoDocumento++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposOcultosTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposOcultosTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDocumento.add(this.jPanelid_empresaTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposOcultosTipoDocumento % 1==0) {
		iXPanelCamposOcultosTipoDocumento=0;
		iYPanelCamposOcultosTipoDocumento++;
	}
	this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDocumento.gridy = iYPanelCamposOcultosTipoDocumento;
	this.gridBagConstraintsTipoDocumento.gridx = iXPanelCamposOcultosTipoDocumento++;
	this.gridBagConstraintsTipoDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDocumento.add(this.jPanelid_tipo_movimiento_moduloTipoDocumento, this.gridBagConstraintsTipoDocumento);



	if(iXPanelCamposOcultosTipoDocumento % 1==0) {
		iXPanelCamposOcultosTipoDocumento=0;
		iYPanelCamposOcultosTipoDocumento++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDocumento= new GridBagLayout();
		this.jPanelAccionesTipoDocumento.setLayout(gridaBagLayoutAccionesTipoDocumento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDocumento= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDocumento.setLayout(gridaBagLayoutAccionesFormularioTipoDocumento);
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDocumento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDocumento.add(this.jComboBoxTiposAccionesFormularioTipoDocumento, this.gridBagConstraintsTipoDocumento);

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDocumento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDocumento.add(this.jCheckBoxPostAccionNuevoTipoDocumento, this.gridBagConstraintsTipoDocumento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDocumento.add(this.jCheckBoxPostAccionSinCerrarTipoDocumento, this.gridBagConstraintsTipoDocumento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodocumentoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDocumento.add(this.jCheckBoxPostAccionSinMensajeTipoDocumento, this.gridBagConstraintsTipoDocumento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDocumento.add(this.jButtonModificarTipoDocumento, this.gridBagConstraintsTipoDocumento);							

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDocumento.add(this.jButtonEliminarTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
			
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = 0;		
		this.gridBagConstraintsTipoDocumento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDocumento.add(this.jButtonActualizarTipoDocumento, this.gridBagConstraintsTipoDocumento);


		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = 0;		
		this.gridBagConstraintsTipoDocumento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDocumento.add(this.jButtonGuardarCambiosTipoDocumento, this.gridBagConstraintsTipoDocumento);	
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = 0;		
		this.gridBagConstraintsTipoDocumento.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDocumento.add(this.jButtonCancelarTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDocumento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDocumento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();						
			this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumento.gridx = 0;		
			//this.gridBagConstraintsTipoDocumento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDocumento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumento.gridx =0;
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDocumento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDocumento, this.gridBagConstraintsTipoDocumento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDocumento = new TipoDocumentoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Documento DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Documento DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Documento Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDocumentoModel tipodocumentoModel=new TipoDocumentoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDocumentoModel.TipoDocumentoFocusTraversalPolicy tipodocumentoFocusTraversalPolicy = tipodocumentoModel.new TipoDocumentoFocusTraversalPolicy(this);
			
			//tipodocumentoFocusTraversalPolicy.settipodocumentoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodocumentoModel);
			
			
			this.jContentPaneDetalleTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDocumento = new GridBagLayout();	
			this.jContentPaneDetalleTipoDocumento.setLayout(gridaBagLayoutDetalleTipoDocumento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDocumento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDocumento.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDocumento.add(jTtoolBarDetalleTipoDocumento, gridBagConstraintsTipoDocumento);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDocumento=   new JScrollPane(jContentPaneDetalleTipoDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDocumento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDocumento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDocumento.gridx = 0;
	        
			this.jContentPaneDetalleTipoDocumento.add(jPanelCamposTipoDocumento, gridBagConstraintsTipoDocumento);
			
			
			
			
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
						&& tipodocumentoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipodocumentoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDocumento= new GridBagConstraints();
						this.gridBagConstraintsTipoDocumento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDocumento.gridx = 0;
						this.jContentPaneDetalleTipoDocumento.add(this.jTabbedPaneRelacionesTipoDocumento, this.gridBagConstraintsTipoDocumento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDocumento.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDocumento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
					this.gridBagConstraintsTipoDocumento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDocumento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDocumento.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDocumento.add(jPanelCamposOcultosTipoDocumento, gridBagConstraintsTipoDocumento);
				
					this.jPanelCamposOcultosTipoDocumento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoDocumento.gridx = 0;
	        this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDocumento.add(this.jPanelAccionesFormularioTipoDocumento, this.gridBagConstraintsTipoDocumento);							
			
			
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
	        this.gridBagConstraintsTipoDocumento.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoDocumento.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDocumento.add(this.jPanelAccionesTipoDocumento, this.gridBagConstraintsTipoDocumento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDocumento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDocumento=   new JScrollPane(this.jPanelCamposTipoDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumento.gridx = 0;
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDocumento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDocumento, this.gridBagConstraintsTipoDocumento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDocumento, this.gridBagConstraintsTipoDocumento);			
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDocumento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDocumento, this.gridBagConstraintsTipoDocumento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDocumento, this.gridBagConstraintsTipoDocumento);
			
			
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
			
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDocumento, this.gridBagConstraintsTipoDocumento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDocumento;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDocumento;
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
