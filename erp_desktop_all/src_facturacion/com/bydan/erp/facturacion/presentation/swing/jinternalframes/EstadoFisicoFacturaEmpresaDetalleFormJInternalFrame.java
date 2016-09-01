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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.EstadoFisicoFacturaEmpresaConstantesFunciones;

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
public class EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame extends EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoFisicoFacturaEmpresa;
	
	protected JMenuBar jmenuBarDetalleEstadoFisicoFacturaEmpresa;
	
	protected JMenu jmenuDetalleEstadoFisicoFacturaEmpresa;
	protected JMenu jmenuDetalleArchivoEstadoFisicoFacturaEmpresa;
	protected JMenu jmenuDetalleAccionesEstadoFisicoFacturaEmpresa;
	protected JMenu jmenuDetalleDatosEstadoFisicoFacturaEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoFisicoFacturaEmpresa;	
	protected GridBagConstraints gridBagConstraintsEstadoFisicoFacturaEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoFisicoFacturaEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public EstadoFisicoFacturaEmpresaSessionBean estadofisicofacturaempresaSessionBean;
	
	

	public FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;
	public FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFactura=false;
	public FacturaSessionBean facturaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public EstadoFisicoFacturaEmpresaLogic estadofisicofacturaempresaLogic;
	
	public JScrollPane jScrollPanelDatosEstadoFisicoFacturaEmpresa;
	public JScrollPane jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa;
	public JScrollPane jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa;
	
	protected JPanel jPanelCamposEstadoFisicoFacturaEmpresa;    
	protected JPanel jPanelCamposOcultosEstadoFisicoFacturaEmpresa;    	
	protected JPanel jPanelAccionesEstadoFisicoFacturaEmpresa;
	protected JPanel jPanelAccionesFormularioEstadoFisicoFacturaEmpresa;
    
	
	
	protected Integer iXPanelCamposEstadoFisicoFacturaEmpresa=0;
	protected Integer iYPanelCamposEstadoFisicoFacturaEmpresa=0;
	
	protected Integer iXPanelCamposOcultosEstadoFisicoFacturaEmpresa=0;
	protected Integer iYPanelCamposOcultosEstadoFisicoFacturaEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoFisicoFacturaEmpresa;
	public JButton jButtonModificarEstadoFisicoFacturaEmpresa;
	public JButton jButtonActualizarEstadoFisicoFacturaEmpresa;
    public JButton jButtonEliminarEstadoFisicoFacturaEmpresa;
	public JButton jButtonCancelarEstadoFisicoFacturaEmpresa;
    public JButton jButtonGuardarCambiosEstadoFisicoFacturaEmpresa;
	public JButton jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa;
	protected JButton jButtonCerrarEstadoFisicoFacturaEmpresa;
	
	
	protected JButton jButtonProcesarInformacionEstadoFisicoFacturaEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoFisicoFacturaEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoFisicoFacturaEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoFisicoFacturaEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonModificarToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonActualizarToolBarEstadoFisicoFacturaEmpresa;
    protected JButton jButtonEliminarToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonCancelarToolBarEstadoFisicoFacturaEmpresa;
    protected JButton jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoFisicoFacturaEmpresa;
	protected JButton jButtonCerrarToolBarEstadoFisicoFacturaEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoFisicoFacturaEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemModificarEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemActualizarEstadoFisicoFacturaEmpresa;
    protected JMenuItem jMenuItemEliminarEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemCancelarEstadoFisicoFacturaEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemCerrarEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoFisicoFacturaEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoFisicoFacturaEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoFisicoFacturaEmpresa;
	public JLabel jLabelIdEstadoFisicoFacturaEmpresa;
	public JLabel jLabelidEstadoFisicoFacturaEmpresa;
	public JButton jButtonidEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoFisicoFacturaEmpresa;
	public JLabel jLabelcodigoEstadoFisicoFacturaEmpresa;
	public JTextField jTextFieldcodigoEstadoFisicoFacturaEmpresa;
	public JButton jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoFisicoFacturaEmpresa;
	public JLabel jLabelnombreEstadoFisicoFacturaEmpresa;
	public JTextArea jTextAreanombreEstadoFisicoFacturaEmpresa;
	public JScrollPane jscrollPanenombreEstadoFisicoFacturaEmpresa;
	public JButton jButtonnombreEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneles_pendienteEstadoFisicoFacturaEmpresa;
	public JLabel jLabeles_pendienteEstadoFisicoFacturaEmpresa;
	public JCheckBox jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa;
	public JButton jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEstadoFisicoFacturaEmpresa;
	public JLabel jLabelid_empresaEstadoFisicoFacturaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEstadoFisicoFacturaEmpresa;
	public JButton jButtonid_empresaEstadoFisicoFacturaEmpresa= new JButtonMe();
	public JButton jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa;
	
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
	
	public EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoFisicoFacturaEmpresa=new JPanel();
				this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa=new JPanel();
				this.jmenuBarDetalleEstadoFisicoFacturaEmpresa=new JMenuBar();
				this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoFisicoFacturaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoFisicoFacturaEmpresa() {
		return this.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarEstadoFisicoFacturaEmpresa() {
		return this.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarEstadoFisicoFacturaEmpresa() {
		return this.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoFisicoFacturaEmpresa() {
		return this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoFisicoFacturaEmpresa)	{
		this.jButtonProcesarInformacionEstadoFisicoFacturaEmpresa = jButtonProcesarInformacionEstadoFisicoFacturaEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoFisicoFacturaEmpresa() {
		return this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa = jComboBoxTiposRelacionesEstadoFisicoFacturaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa = jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa() {
		return this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa) {
		this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa = jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadofisicofacturaempresaSessionBean=new EstadoFisicoFacturaEmpresaSessionBean();
		
		this.estadofisicofacturaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofisicofacturaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.facturaSessionBean=new FacturaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoFisicoFacturaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoFisicoFacturaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoFisicoFacturaEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Fisico Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoFisicoFacturaEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoFisicoFacturaEmpresa=new JButtonMe();
				this.jButtonModificarToolBarEstadoFisicoFacturaEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa,
							"actualizar","actualizar","Actualizar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa,
							"eliminar","eliminar","Eliminar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa,
							"cancelar","cancelar","Cancelar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoFisicoFacturaEmpresa,this.jTtoolBarDetalleEstadoFisicoFacturaEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoFisicoFacturaEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoFisicoFacturaEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoFisicoFacturaEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoFisicoFacturaEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoFisicoFacturaEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoFisicoFacturaEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoFisicoFacturaEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoFisicoFacturaEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoFisicoFacturaEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoFisicoFacturaEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoFisicoFacturaEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoFisicoFacturaEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoFisicoFacturaEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoFisicoFacturaEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoFisicoFacturaEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoFisicoFacturaEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoFisicoFacturaEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoFisicoFacturaEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoFisicoFacturaEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoFisicoFacturaEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoFisicoFacturaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoFisicoFacturaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoFisicoFacturaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoFisicoFacturaEmpresa.add(this.jMenuItemDetalleCerrarEstadoFisicoFacturaEmpresa);
		
		this.jmenuDetalleAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemActualizarEstadoFisicoFacturaEmpresa);
		this.jmenuDetalleAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemEliminarEstadoFisicoFacturaEmpresa);
		this.jmenuDetalleAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemCancelarEstadoFisicoFacturaEmpresa);		
		
		//this.jmenuDetalleDatosEstadoFisicoFacturaEmpresa.add(this.jMenuItemDetalleAbrirOrderByEstadoFisicoFacturaEmpresa);				
		this.jmenuDetalleDatosEstadoFisicoFacturaEmpresa.add(this.jMenuItemDetalleMostarOcultarEstadoFisicoFacturaEmpresa);				
				
		//this.jmenuDetalleAccionesEstadoFisicoFacturaEmpresa.add(this.jMenuItemGuardarCambiosEstadoFisicoFacturaEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoFisicoFacturaEmpresa.add(this.jmenuDetalleArchivoEstadoFisicoFacturaEmpresa);		
		this.jmenuBarDetalleEstadoFisicoFacturaEmpresa.add(this.jmenuDetalleAccionesEstadoFisicoFacturaEmpresa);		
		this.jmenuBarDetalleEstadoFisicoFacturaEmpresa.add(this.jmenuDetalleDatosEstadoFisicoFacturaEmpresa);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoFisicoFacturaEmpresa.add(this.jmenuDetalleEstadoFisicoFacturaEmpresa);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoFisicoFacturaEmpresa);				
	}
	
	
	public void inicializarElementosCamposEstadoFisicoFacturaEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoFisicoFacturaEmpresa = new JLabelMe();
		jLabelIdEstadoFisicoFacturaEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoFisicoFacturaEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoFisicoFacturaEmpresa.setToolTipText(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoFisicoFacturaEmpresa= new GridBagLayout();

		this.jPanelidEstadoFisicoFacturaEmpresa.setLayout(this.gridaBagLayoutEstadoFisicoFacturaEmpresa);

		jLabelidEstadoFisicoFacturaEmpresa = new JLabel();
		jLabelidEstadoFisicoFacturaEmpresa.setText("Id");

		jLabelidEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoFisicoFacturaEmpresa = new JLabelMe();
		this.jLabelcodigoEstadoFisicoFacturaEmpresa.setText(""+EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoFisicoFacturaEmpresa.setToolTipText("Codigo");
		this.jLabelcodigoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoFisicoFacturaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoFisicoFacturaEmpresa.setToolTipText(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoFisicoFacturaEmpresa = new GridBagLayout();
		this.jPanelcodigoEstadoFisicoFacturaEmpresa.setLayout(this.gridaBagLayoutEstadoFisicoFacturaEmpresa);


		jTextFieldcodigoEstadoFisicoFacturaEmpresa= new JTextFieldMe();

		jTextFieldcodigoEstadoFisicoFacturaEmpresa.setEnabled(false);
		jTextFieldcodigoEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.setText("U");
		this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoFisicoFacturaEmpresaBusqueda"));

		if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoFisicoFacturaEmpresa = new JLabelMe();
		this.jLabelnombreEstadoFisicoFacturaEmpresa.setText(""+EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoFisicoFacturaEmpresa.setToolTipText("Nombre");
		this.jLabelnombreEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoFisicoFacturaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoFisicoFacturaEmpresa.setToolTipText(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoFisicoFacturaEmpresa = new GridBagLayout();
		this.jPanelnombreEstadoFisicoFacturaEmpresa.setLayout(this.gridaBagLayoutEstadoFisicoFacturaEmpresa);


		jTextAreanombreEstadoFisicoFacturaEmpresa= new JTextAreaMe();
		jTextAreanombreEstadoFisicoFacturaEmpresa.setEnabled(false);
		jTextAreanombreEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFisicoFacturaEmpresa.setLineWrap(true);
		jTextAreanombreEstadoFisicoFacturaEmpresa.setWrapStyleWord(true);
		jTextAreanombreEstadoFisicoFacturaEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoFisicoFacturaEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoFisicoFacturaEmpresa = new JScrollPane(jTextAreanombreEstadoFisicoFacturaEmpresa);
		jscrollPanenombreEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.setText("U");
		this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoFisicoFacturaEmpresaBusqueda"));

		if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoFisicoFacturaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeles_pendienteEstadoFisicoFacturaEmpresa = new JLabelMe();
		this.jLabeles_pendienteEstadoFisicoFacturaEmpresa.setText(""+EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE+" : *");
		this.jLabeles_pendienteEstadoFisicoFacturaEmpresa.setToolTipText("Es Pendiente");
		this.jLabeles_pendienteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_pendienteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_pendienteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_pendienteEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_pendienteEstadoFisicoFacturaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_pendienteEstadoFisicoFacturaEmpresa.setToolTipText(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_ESPENDIENTE);
		this.gridaBagLayoutEstadoFisicoFacturaEmpresa = new GridBagLayout();
		this.jPaneles_pendienteEstadoFisicoFacturaEmpresa.setLayout(this.gridaBagLayoutEstadoFisicoFacturaEmpresa);


		jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa= new JCheckBoxMe();
		jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setEnabled(false);

		jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();
		this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.setText("U");
		this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_pendienteEstadoFisicoFacturaEmpresaBusqueda"));

		if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoFisicoFacturaEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEstadoFisicoFacturaEmpresa = new JLabelMe();
		this.jLabelid_empresaEstadoFisicoFacturaEmpresa.setText(""+EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEstadoFisicoFacturaEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEstadoFisicoFacturaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEstadoFisicoFacturaEmpresa.setToolTipText(EstadoFisicoFacturaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEstadoFisicoFacturaEmpresa = new GridBagLayout();
		this.jPanelid_empresaEstadoFisicoFacturaEmpresa.setLayout(this.gridaBagLayoutEstadoFisicoFacturaEmpresa);


		jComboBoxid_empresaEstadoFisicoFacturaEmpresa= new JComboBoxMe();
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.setEnabled(false);

		this.jButtonid_empresaEstadoFisicoFacturaEmpresa= new JButtonMe();
		this.jButtonid_empresaEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoFisicoFacturaEmpresa.setText("Buscar");
		this.jButtonid_empresaEstadoFisicoFacturaEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEstadoFisicoFacturaEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoFisicoFacturaEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoFisicoFacturaEmpresa"));

		this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.setText("U");
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoFisicoFacturaEmpresaBusqueda"));

		if(this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.setText("U");
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoFisicoFacturaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoFisicoFacturaEmpresaUpdate"));



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
		//this.jInternalFrameDetalleEstadoFisicoFacturaEmpresa = new EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Fisico Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoFisicoFacturaEmpresa= new GridBagLayout();
		

		
		String sToolTipEstadoFisicoFacturaEmpresa="";
		sToolTipEstadoFisicoFacturaEmpresa=EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoFisicoFacturaEmpresa+="(Facturacion.EstadoFisicoFacturaEmpresa)";
		}
		
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoFisicoFacturaEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonModificarEstadoFisicoFacturaEmpresa = new JButtonMe();
        this.jButtonActualizarEstadoFisicoFacturaEmpresa = new JButtonMe();
        this.jButtonEliminarEstadoFisicoFacturaEmpresa = new JButtonMe();
        this.jButtonCancelarEstadoFisicoFacturaEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa = new JButtonMe();
		this.jButtonCerrarEstadoFisicoFacturaEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosEstadoFisicoFacturaEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Fisico Factura";
		
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoFisicoFacturaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoFisicoFacturaEmpresa.setName("jPanelCamposEstadoFisicoFacturaEmpresa"); 

		this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa.setName("jPanelCamposOcultosEstadoFisicoFacturaEmpresa"); 

        this.jPanelAccionesEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoFisicoFacturaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesEstadoFisicoFacturaEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoFisicoFacturaEmpresa.setText("Nuevo");
		this.jButtonModificarEstadoFisicoFacturaEmpresa.setText("Editar");
        this.jButtonActualizarEstadoFisicoFacturaEmpresa.setText("Actualizar");
        this.jButtonEliminarEstadoFisicoFacturaEmpresa.setText("Eliminar");
        this.jButtonCancelarEstadoFisicoFacturaEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.setText("Guardar");
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoFisicoFacturaEmpresa,"nuevo_button","Nuevo",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoFisicoFacturaEmpresa,"modificar_button","Editar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoFisicoFacturaEmpresa,"actualizar_button","Actualizar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoFisicoFacturaEmpresa,"eliminar_button","Eliminar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoFisicoFacturaEmpresa,"cancelar_button","Cancelar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa,"guardarcambios_button","Guardar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa,"guardarcambiostabla_button","Guardar",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoFisicoFacturaEmpresa,"cerrar_button","Salir",this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoFisicoFacturaEmpresa.setToolTipText("Nuevo"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoFisicoFacturaEmpresa.setToolTipText("Editar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoFisicoFacturaEmpresa.setToolTipText("Actualizar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoFisicoFacturaEmpresa.setToolTipText("Eliminar)"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoFisicoFacturaEmpresa.setToolTipText("Cancelar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa.setToolTipText("Guardar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.setToolTipText("Guardar"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.setToolTipText("Salir"+" "+EstadoFisicoFacturaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonNuevoEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoFisicoFacturaEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonActualizarEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoFisicoFacturaEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonEliminarEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoFisicoFacturaEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonCancelarEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoFisicoFacturaEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonCerrarEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoFisicoFacturaEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoFisicoFacturaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFacturaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoFisicoFacturaEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoFisicoFacturaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoFisicoFacturaEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoFisicoFacturaEmpresa.setToolTipText("Nuevo EstadoFisicoFacturaEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoFisicoFacturaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoFisicoFacturaEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoFisicoFacturaEmpresa.setToolTipText("Sin Cerrar Ventana EstadoFisicoFacturaEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoFisicoFacturaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoFisicoFacturaEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoFisicoFacturaEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoFisicoFacturaEmpresa = new JLabelMe();
		
		this.jLabelAccionesEstadoFisicoFacturaEmpresa.setText("Acciones");		
		this.jLabelAccionesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoFisicoFacturaEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoFisicoFacturaEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoFisicoFacturaEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoFisicoFacturaEmpresa = new GridBagLayout();
		
		this.jPanelCamposEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutCamposEstadoFisicoFacturaEmpresa);
		this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutCamposOcultosEstadoFisicoFacturaEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoFisicoFacturaEmpresa.add(jLabelIdEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 1;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoFisicoFacturaEmpresa.add(jLabelidEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);


	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEstadoFisicoFacturaEmpresa.add(jLabelid_empresaEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 2;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadoFisicoFacturaEmpresa.add(jButtonid_empresaEstadoFisicoFacturaEmpresaBusqueda, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 3;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadoFisicoFacturaEmpresa.add(jButtonid_empresaEstadoFisicoFacturaEmpresaUpdate, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
	}

	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 1;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEstadoFisicoFacturaEmpresa.add(jComboBoxid_empresaEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);


	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoFisicoFacturaEmpresa.add(jLabelcodigoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 2;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoFisicoFacturaEmpresa.add(jButtoncodigoEstadoFisicoFacturaEmpresaBusqueda, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
	}

	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 1;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoFisicoFacturaEmpresa.add(jTextFieldcodigoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);


	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoFisicoFacturaEmpresa.add(jLabelnombreEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 2;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoFisicoFacturaEmpresa.add(jButtonnombreEstadoFisicoFacturaEmpresaBusqueda, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
	}

	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 1;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoFisicoFacturaEmpresa.add(jscrollPanenombreEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);


	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_pendienteEstadoFisicoFacturaEmpresa.add(jLabeles_pendienteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 2;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_pendienteEstadoFisicoFacturaEmpresa.add(jButtones_pendienteEstadoFisicoFacturaEmpresaBusqueda, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
	}

	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 1;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_pendienteEstadoFisicoFacturaEmpresa.add(jCheckBoxes_pendienteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iYPanelCamposEstadoFisicoFacturaEmpresa;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iXPanelCamposEstadoFisicoFacturaEmpresa++;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFisicoFacturaEmpresa.add(this.jPanelidEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(iXPanelCamposEstadoFisicoFacturaEmpresa % 1==0) {
		iXPanelCamposEstadoFisicoFacturaEmpresa=0;
		iYPanelCamposEstadoFisicoFacturaEmpresa++;
	}
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iYPanelCamposEstadoFisicoFacturaEmpresa;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iXPanelCamposEstadoFisicoFacturaEmpresa++;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFisicoFacturaEmpresa.add(this.jPanelcodigoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(iXPanelCamposEstadoFisicoFacturaEmpresa % 1==0) {
		iXPanelCamposEstadoFisicoFacturaEmpresa=0;
		iYPanelCamposEstadoFisicoFacturaEmpresa++;
	}
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iYPanelCamposEstadoFisicoFacturaEmpresa;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iXPanelCamposEstadoFisicoFacturaEmpresa++;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFisicoFacturaEmpresa.add(this.jPanelnombreEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(iXPanelCamposEstadoFisicoFacturaEmpresa % 1==0) {
		iXPanelCamposEstadoFisicoFacturaEmpresa=0;
		iYPanelCamposEstadoFisicoFacturaEmpresa++;
	}
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iYPanelCamposEstadoFisicoFacturaEmpresa;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iXPanelCamposEstadoFisicoFacturaEmpresa++;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFisicoFacturaEmpresa.add(this.jPaneles_pendienteEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(iXPanelCamposEstadoFisicoFacturaEmpresa % 1==0) {
		iXPanelCamposEstadoFisicoFacturaEmpresa=0;
		iYPanelCamposEstadoFisicoFacturaEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iYPanelCamposOcultosEstadoFisicoFacturaEmpresa;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iXPanelCamposOcultosEstadoFisicoFacturaEmpresa++;
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFisicoFacturaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa.add(this.jPanelid_empresaEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);



	if(iXPanelCamposOcultosEstadoFisicoFacturaEmpresa % 1==0) {
		iXPanelCamposOcultosEstadoFisicoFacturaEmpresa=0;
		iYPanelCamposOcultosEstadoFisicoFacturaEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoFisicoFacturaEmpresa= new GridBagLayout();
		this.jPanelAccionesEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutAccionesEstadoFisicoFacturaEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoFisicoFacturaEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutAccionesFormularioEstadoFisicoFacturaEmpresa);
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa.add(this.jComboBoxTiposAccionesFormularioEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);

		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa.add(this.jCheckBoxPostAccionNuevoEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa.add(this.jCheckBoxPostAccionSinCerrarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadofisicofacturaempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa.add(this.jCheckBoxPostAccionSinMensajeEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoFisicoFacturaEmpresa.add(this.jButtonModificarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);							

		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoFisicoFacturaEmpresa.add(this.jButtonEliminarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
			
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoFisicoFacturaEmpresa.add(this.jButtonActualizarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);


		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoFisicoFacturaEmpresa.add(this.jButtonGuardarCambiosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);	
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = 0;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoFisicoFacturaEmpresa.add(this.jButtonCancelarEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoFisicoFacturaEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoFisicoFacturaEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadofisicofacturaempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;		
			//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =0;
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoFisicoFacturaEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoFisicoFacturaEmpresa = new EstadoFisicoFacturaEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Fisico Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Fisico Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Fisico Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoFisicoFacturaEmpresaModel estadofisicofacturaempresaModel=new EstadoFisicoFacturaEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoFisicoFacturaEmpresaModel.EstadoFisicoFacturaEmpresaFocusTraversalPolicy estadofisicofacturaempresaFocusTraversalPolicy = estadofisicofacturaempresaModel.new EstadoFisicoFacturaEmpresaFocusTraversalPolicy(this);
			
			//estadofisicofacturaempresaFocusTraversalPolicy.setestadofisicofacturaempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadofisicofacturaempresaModel);
			
			
			this.jContentPaneDetalleEstadoFisicoFacturaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoFisicoFacturaEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleEstadoFisicoFacturaEmpresa.setLayout(gridaBagLayoutDetalleEstadoFisicoFacturaEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoFisicoFacturaEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoFisicoFacturaEmpresa.add(jTtoolBarDetalleEstadoFisicoFacturaEmpresa, gridBagConstraintsEstadoFisicoFacturaEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa=   new JScrollPane(jContentPaneDetalleEstadoFisicoFacturaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleEstadoFisicoFacturaEmpresa.add(jPanelCamposEstadoFisicoFacturaEmpresa, gridBagConstraintsEstadoFisicoFacturaEmpresa);
			
			
			
			
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
						&& estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFactura(this.puedeCargarPorParteFactura,false,-1);
					
					if(this.estadofisicofacturaempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoFisicoFacturaEmpresa= new GridBagConstraints();
						this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
						this.jContentPaneDetalleEstadoFisicoFacturaEmpresa.add(this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoFisicoFacturaEmpresa.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFactura(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
					this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoFisicoFacturaEmpresa.add(jPanelCamposOcultosEstadoFisicoFacturaEmpresa, gridBagConstraintsEstadoFisicoFacturaEmpresa);
				
					this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
	        this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoFisicoFacturaEmpresa.add(this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);							
			
			
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoFisicoFacturaEmpresa.add(this.jPanelAccionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa=   new JScrollPane(this.jPanelCamposEstadoFisicoFacturaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);			
			
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
			
			
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		
			
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoFisicoFacturaEmpresa, this.gridBagConstraintsEstadoFisicoFacturaEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoFisicoFacturaEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoFisicoFacturaEmpresa;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFactura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturaSessionBean=new FacturaSessionBean();
		this.facturaSessionBean.setConGuardarRelaciones(true);
		this.facturaSessionBean.setEsGuardarRelacionado(true);

		this.facturaBeanSwingJInternalFrame=null;//new FacturaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturaBeanSwingJInternalFramePopup=new FacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturaSessionBean.getEsGuardarRelacionado()) {

				FacturaJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoFisicoFacturaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoFisicoFacturaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturaSessionBean.setEsGuardarRelacionado(true);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturaBeanSwingJInternalFrame.setfacturaSessionBean(this.facturaSessionBean);

				//this.gridBagConstraintsEstadoFisicoFacturaEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoFisicoFacturaEmpresa.gridx = 0;
				//this.jContentPaneDetalleEstadoFisicoFacturaEmpresa.add(this.facturaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoFisicoFacturaEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.add("Facturas",this.facturaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.setComponentAt(iIndexTab,this.facturaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturaSessionBean.setEsGuardarRelacionado(false);
				this.facturaBeanSwingJInternalFrame=null;//new FacturaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFactura) {
					this.jTabbedPaneRelacionesEstadoFisicoFacturaEmpresa.add("Facturas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFacturaBeanSwingJInternalFrame(List<EstadoFisicoFacturaEmpresa> estadofisicofacturaempresas,EstadoFisicoFacturaEmpresa estadofisicofacturaempresa,FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.estadofisicofacturaempresaLogic.getConnexion());

					facturaBeanSwingJInternalFrame.setestadofisicofacturaempresasForeignKey(estadofisicofacturaempresas);
					facturaBeanSwingJInternalFrame.setestadofisicofacturaempresaForeignKey(estadofisicofacturaempresa);
					facturaBeanSwingJInternalFrame.facturaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoFisicoFacturaEmpresa(true);
					facturaBeanSwingJInternalFrame.facturaSessionBean.setlidEstadoFisicoFacturaEmpresaActual(estadofisicofacturaempresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturaBeanSwingJInternalFrame.cargarCombosForeignKeyFactura(facturaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoFisicoFacturaEmpresa(true);
					facturaBeanSwingJInternalFrame.setid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresa(estadofisicofacturaempresa.getId());

					if(!this.conCargarFormDetalle) {
						facturaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoFisicoFacturaEmpresaForeignKey(estadofisicofacturaempresa,1,false,true,true);
					facturaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoFisicoFacturaEmpresa");
					facturaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoFisicoFacturaEmpresa");
					facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(true);
					facturaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFactura("n",facturaBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturaBeanSwingJInternalFrame.setAutoscrolls(true);
					facturaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("relacionado");
					} else {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("no_relacionado");
					}

					facturaBeanSwingJInternalFrame.getjButtonRecargarInformacionFactura().setVisible(false);

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
