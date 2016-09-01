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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoPrioridadEmpresaProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoPrioridadEmpresaProduDetalleFormJInternalFrame extends TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPrioridadEmpresaProdu;
	
	protected JMenuBar jmenuBarDetalleTipoPrioridadEmpresaProdu;
	
	protected JMenu jmenuDetalleTipoPrioridadEmpresaProdu;
	protected JMenu jmenuDetalleArchivoTipoPrioridadEmpresaProdu;
	protected JMenu jmenuDetalleAccionesTipoPrioridadEmpresaProdu;
	protected JMenu jmenuDetalleDatosTipoPrioridadEmpresaProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrioridadEmpresaProdu;	
	protected GridBagConstraints gridBagConstraintsTipoPrioridadEmpresaProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPrioridadEmpresaProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean;
	
	

	public OrdenProduBeanSwingJInternalFrame ordenproduBeanSwingJInternalFrame=null;
	public OrdenProduBeanSwingJInternalFrame ordenproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteOrdenProdu=false;
	public OrdenProduSessionBean ordenproduSessionBean;

	public PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame=null;
	public PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoProdu=false;
	public PedidoProduSessionBean pedidoproduSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogic;
	
	public JScrollPane jScrollPanelDatosTipoPrioridadEmpresaProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu;
	
	protected JPanel jPanelCamposTipoPrioridadEmpresaProdu;    
	protected JPanel jPanelCamposOcultosTipoPrioridadEmpresaProdu;    	
	protected JPanel jPanelAccionesTipoPrioridadEmpresaProdu;
	protected JPanel jPanelAccionesFormularioTipoPrioridadEmpresaProdu;
    
	
	
	protected Integer iXPanelCamposTipoPrioridadEmpresaProdu=0;
	protected Integer iYPanelCamposTipoPrioridadEmpresaProdu=0;
	
	protected Integer iXPanelCamposOcultosTipoPrioridadEmpresaProdu=0;
	protected Integer iYPanelCamposOcultosTipoPrioridadEmpresaProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPrioridadEmpresaProdu;
	public JButton jButtonModificarTipoPrioridadEmpresaProdu;
	public JButton jButtonActualizarTipoPrioridadEmpresaProdu;
    public JButton jButtonEliminarTipoPrioridadEmpresaProdu;
	public JButton jButtonCancelarTipoPrioridadEmpresaProdu;
    public JButton jButtonGuardarCambiosTipoPrioridadEmpresaProdu;
	public JButton jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu;
	protected JButton jButtonCerrarTipoPrioridadEmpresaProdu;
	
	
	protected JButton jButtonProcesarInformacionTipoPrioridadEmpresaProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPrioridadEmpresaProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPrioridadEmpresaProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPrioridadEmpresaProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonModificarToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonActualizarToolBarTipoPrioridadEmpresaProdu;
    protected JButton jButtonEliminarToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonCancelarToolBarTipoPrioridadEmpresaProdu;
    protected JButton jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrioridadEmpresaProdu;
	protected JButton jButtonCerrarToolBarTipoPrioridadEmpresaProdu;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPrioridadEmpresaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemModificarTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemActualizarTipoPrioridadEmpresaProdu;
    protected JMenuItem jMenuItemEliminarTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemCancelarTipoPrioridadEmpresaProdu;
    protected JMenuItem jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemCerrarTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrioridadEmpresaProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrioridadEmpresaProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrioridadEmpresaProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPrioridadEmpresaProdu;
	public JLabel jLabelIdTipoPrioridadEmpresaProdu;
	public JLabel jLabelidTipoPrioridadEmpresaProdu;
	public JButton jButtonidTipoPrioridadEmpresaProduBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPrioridadEmpresaProdu;
	public JLabel jLabelnombreTipoPrioridadEmpresaProdu;
	public JTextArea jTextAreanombreTipoPrioridadEmpresaProdu;
	public JScrollPane jscrollPanenombreTipoPrioridadEmpresaProdu;
	public JButton jButtonnombreTipoPrioridadEmpresaProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoPrioridadEmpresaProdu;
	public JLabel jLabeldescripcionTipoPrioridadEmpresaProdu;
	public JTextArea jTextAreadescripcionTipoPrioridadEmpresaProdu;
	public JScrollPane jscrollPanedescripcionTipoPrioridadEmpresaProdu;
	public JButton jButtondescripcionTipoPrioridadEmpresaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoPrioridadEmpresaProdu;
	public JLabel jLabelid_empresaTipoPrioridadEmpresaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoPrioridadEmpresaProdu;
	public JButton jButtonid_empresaTipoPrioridadEmpresaProdu= new JButtonMe();
	public JButton jButtonid_empresaTipoPrioridadEmpresaProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoPrioridadEmpresaProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPrioridadEmpresaProdu;
	
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
	
	public TipoPrioridadEmpresaProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPrioridadEmpresaProdu=new JPanel();
				this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu=new JPanel();
				this.jmenuBarDetalleTipoPrioridadEmpresaProdu=new JMenuBar();
				this.jTtoolBarDetalleTipoPrioridadEmpresaProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadEmpresaProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPrioridadEmpresaProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadEmpresaProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadEmpresaProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrioridadEmpresaProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrioridadEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPrioridadEmpresaProdu() {
		return this.jButtonActualizarToolBarTipoPrioridadEmpresaProdu;
	}
	
	public JButton getjButtonEliminarToolBarTipoPrioridadEmpresaProdu() {
		return this.jButtonEliminarToolBarTipoPrioridadEmpresaProdu;
	}
	
	public JButton getjButtonCancelarToolBarTipoPrioridadEmpresaProdu() {
		return this.jButtonCancelarToolBarTipoPrioridadEmpresaProdu;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPrioridadEmpresaProdu() {
		return this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrioridadEmpresaProdu)	{
		this.jButtonProcesarInformacionTipoPrioridadEmpresaProdu = jButtonProcesarInformacionTipoPrioridadEmpresaProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrioridadEmpresaProdu() {
		return this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu = jComboBoxTiposRelacionesTipoPrioridadEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposAccionesTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu = jComboBoxTiposAccionesTipoPrioridadEmpresaProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu() {
		return this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu(
			JComboBox jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu) {
		this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu = jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprioridadempresaproduSessionBean=new TipoPrioridadEmpresaProduSessionBean();
		
		this.tipoprioridadempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprioridadempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.ordenproduSessionBean=new OrdenProduSessionBean();
		//this.pedidoproduSessionBean=new PedidoProduSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPrioridadEmpresaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prioridad Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPrioridadEmpresaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPrioridadEmpresaProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPrioridadEmpresaProdu=new JButtonMe();
				this.jButtonModificarToolBarTipoPrioridadEmpresaProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarDetalleTipoPrioridadEmpresaProdu,
							"actualizar","actualizar","Actualizar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarDetalleTipoPrioridadEmpresaProdu,
							"eliminar","eliminar","Eliminar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarDetalleTipoPrioridadEmpresaProdu,
							"cancelar","cancelar","Cancelar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPrioridadEmpresaProdu,this.jTtoolBarDetalleTipoPrioridadEmpresaProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPrioridadEmpresaProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPrioridadEmpresaProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPrioridadEmpresaProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPrioridadEmpresaProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPrioridadEmpresaProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrioridadEmpresaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrioridadEmpresaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrioridadEmpresaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPrioridadEmpresaProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPrioridadEmpresaProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPrioridadEmpresaProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPrioridadEmpresaProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPrioridadEmpresaProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPrioridadEmpresaProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPrioridadEmpresaProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPrioridadEmpresaProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPrioridadEmpresaProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPrioridadEmpresaProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPrioridadEmpresaProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPrioridadEmpresaProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrioridadEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrioridadEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrioridadEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPrioridadEmpresaProdu.add(this.jMenuItemDetalleCerrarTipoPrioridadEmpresaProdu);
		
		this.jmenuDetalleAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemActualizarTipoPrioridadEmpresaProdu);
		this.jmenuDetalleAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemEliminarTipoPrioridadEmpresaProdu);
		this.jmenuDetalleAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemCancelarTipoPrioridadEmpresaProdu);		
		
		//this.jmenuDetalleDatosTipoPrioridadEmpresaProdu.add(this.jMenuItemDetalleAbrirOrderByTipoPrioridadEmpresaProdu);				
		this.jmenuDetalleDatosTipoPrioridadEmpresaProdu.add(this.jMenuItemDetalleMostarOcultarTipoPrioridadEmpresaProdu);				
				
		//this.jmenuDetalleAccionesTipoPrioridadEmpresaProdu.add(this.jMenuItemGuardarCambiosTipoPrioridadEmpresaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPrioridadEmpresaProdu.add(this.jmenuDetalleArchivoTipoPrioridadEmpresaProdu);		
		this.jmenuBarDetalleTipoPrioridadEmpresaProdu.add(this.jmenuDetalleAccionesTipoPrioridadEmpresaProdu);		
		this.jmenuBarDetalleTipoPrioridadEmpresaProdu.add(this.jmenuDetalleDatosTipoPrioridadEmpresaProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoPrioridadEmpresaProdu.add(this.jmenuDetalleTipoPrioridadEmpresaProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPrioridadEmpresaProdu);				
	}
	
	
	public void inicializarElementosCamposTipoPrioridadEmpresaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPrioridadEmpresaProdu = new JLabelMe();
		jLabelIdTipoPrioridadEmpresaProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPrioridadEmpresaProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPrioridadEmpresaProdu.setToolTipText(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPrioridadEmpresaProdu= new GridBagLayout();

		this.jPanelidTipoPrioridadEmpresaProdu.setLayout(this.gridaBagLayoutTipoPrioridadEmpresaProdu);

		jLabelidTipoPrioridadEmpresaProdu = new JLabel();
		jLabelidTipoPrioridadEmpresaProdu.setText("Id");

		jLabelidTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoPrioridadEmpresaProdu = new JLabelMe();
		this.jLabelnombreTipoPrioridadEmpresaProdu.setText(""+TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPrioridadEmpresaProdu.setToolTipText("Nombre");
		this.jLabelnombreTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPrioridadEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPrioridadEmpresaProdu.setToolTipText(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPrioridadEmpresaProdu = new GridBagLayout();
		this.jPanelnombreTipoPrioridadEmpresaProdu.setLayout(this.gridaBagLayoutTipoPrioridadEmpresaProdu);


		jTextAreanombreTipoPrioridadEmpresaProdu= new JTextAreaMe();
		jTextAreanombreTipoPrioridadEmpresaProdu.setEnabled(false);
		jTextAreanombreTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrioridadEmpresaProdu.setLineWrap(true);
		jTextAreanombreTipoPrioridadEmpresaProdu.setWrapStyleWord(true);
		jTextAreanombreTipoPrioridadEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPrioridadEmpresaProdu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPrioridadEmpresaProdu = new JScrollPane(jTextAreanombreTipoPrioridadEmpresaProdu);
		jscrollPanenombreTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPrioridadEmpresaProduBusqueda= new JButtonMe();
		this.jButtonnombreTipoPrioridadEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPrioridadEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPrioridadEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPrioridadEmpresaProduBusqueda.setText("U");
		this.jButtonnombreTipoPrioridadEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPrioridadEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPrioridadEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPrioridadEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPrioridadEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPrioridadEmpresaProduBusqueda"));

		if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPrioridadEmpresaProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoPrioridadEmpresaProdu = new JLabelMe();
		this.jLabeldescripcionTipoPrioridadEmpresaProdu.setText(""+TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoPrioridadEmpresaProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoPrioridadEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoPrioridadEmpresaProdu.setToolTipText(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoPrioridadEmpresaProdu = new GridBagLayout();
		this.jPaneldescripcionTipoPrioridadEmpresaProdu.setLayout(this.gridaBagLayoutTipoPrioridadEmpresaProdu);


		jTextAreadescripcionTipoPrioridadEmpresaProdu= new JTextAreaMe();
		jTextAreadescripcionTipoPrioridadEmpresaProdu.setEnabled(false);
		jTextAreadescripcionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPrioridadEmpresaProdu.setLineWrap(true);
		jTextAreadescripcionTipoPrioridadEmpresaProdu.setWrapStyleWord(true);
		jTextAreadescripcionTipoPrioridadEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoPrioridadEmpresaProdu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoPrioridadEmpresaProdu = new JScrollPane(jTextAreadescripcionTipoPrioridadEmpresaProdu);
		jscrollPanedescripcionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda= new JButtonMe();
		this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.setText("U");
		this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoPrioridadEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoPrioridadEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoPrioridadEmpresaProduBusqueda"));

		if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoPrioridadEmpresaProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPrioridadEmpresaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoPrioridadEmpresaProdu = new JLabelMe();
		this.jLabelid_empresaTipoPrioridadEmpresaProdu.setText(""+TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoPrioridadEmpresaProdu.setToolTipText("Empresa");
		this.jLabelid_empresaTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoPrioridadEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoPrioridadEmpresaProdu.setToolTipText(TipoPrioridadEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoPrioridadEmpresaProdu = new GridBagLayout();
		this.jPanelid_empresaTipoPrioridadEmpresaProdu.setLayout(this.gridaBagLayoutTipoPrioridadEmpresaProdu);


		jComboBoxid_empresaTipoPrioridadEmpresaProdu= new JComboBoxMe();
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.setEnabled(false);

		this.jButtonid_empresaTipoPrioridadEmpresaProdu= new JButtonMe();
		this.jButtonid_empresaTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrioridadEmpresaProdu.setText("Buscar");
		this.jButtonid_empresaTipoPrioridadEmpresaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoPrioridadEmpresaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrioridadEmpresaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrioridadEmpresaProdu"));

		this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.setText("U");
		this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrioridadEmpresaProduBusqueda"));

		if(this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoPrioridadEmpresaProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoPrioridadEmpresaProduUpdate= new JButtonMe();
		this.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.setText("U");
		this.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoPrioridadEmpresaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrioridadEmpresaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrioridadEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrioridadEmpresaProduUpdate"));



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
		//this.jInternalFrameDetalleTipoPrioridadEmpresaProdu = new TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Prioridad Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrioridadEmpresaProdu= new GridBagLayout();
		

		
		String sToolTipTipoPrioridadEmpresaProdu="";
		sToolTipTipoPrioridadEmpresaProdu=TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrioridadEmpresaProdu+="(Produccion.TipoPrioridadEmpresaProdu)";
		}
		
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrioridadEmpresaProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonModificarTipoPrioridadEmpresaProdu = new JButtonMe();
        this.jButtonActualizarTipoPrioridadEmpresaProdu = new JButtonMe();
        this.jButtonEliminarTipoPrioridadEmpresaProdu = new JButtonMe();
        this.jButtonCancelarTipoPrioridadEmpresaProdu = new JButtonMe();
        this.jButtonGuardarCambiosTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu = new JButtonMe();
		this.jButtonCerrarTipoPrioridadEmpresaProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrioridadEmpresaProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prioridad Empresa";
		
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prioridad Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrioridadEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPrioridadEmpresaProdu.setName("jPanelCamposTipoPrioridadEmpresaProdu"); 

		this.jPanelCamposOcultosTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPrioridadEmpresaProdu.setName("jPanelCamposOcultosTipoPrioridadEmpresaProdu"); 

        this.jPanelAccionesTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrioridadEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrioridadEmpresaProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPrioridadEmpresaProdu.setText("Nuevo");
		this.jButtonModificarTipoPrioridadEmpresaProdu.setText("Editar");
        this.jButtonActualizarTipoPrioridadEmpresaProdu.setText("Actualizar");
        this.jButtonEliminarTipoPrioridadEmpresaProdu.setText("Eliminar");
        this.jButtonCancelarTipoPrioridadEmpresaProdu.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.setText("Guardar");
		this.jButtonCerrarTipoPrioridadEmpresaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrioridadEmpresaProdu,"nuevo_button","Nuevo",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPrioridadEmpresaProdu,"modificar_button","Editar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPrioridadEmpresaProdu,"actualizar_button","Actualizar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPrioridadEmpresaProdu,"eliminar_button","Eliminar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPrioridadEmpresaProdu,"cancelar_button","Cancelar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPrioridadEmpresaProdu,"guardarcambios_button","Guardar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu,"guardarcambiostabla_button","Guardar",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrioridadEmpresaProdu,"cerrar_button","Salir",this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPrioridadEmpresaProdu.setToolTipText("Nuevo"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPrioridadEmpresaProdu.setToolTipText("Editar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPrioridadEmpresaProdu.setToolTipText("Actualizar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPrioridadEmpresaProdu.setToolTipText("Eliminar)"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPrioridadEmpresaProdu.setToolTipText("Cancelar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPrioridadEmpresaProdu.setToolTipText("Guardar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.setToolTipText("Guardar"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrioridadEmpresaProdu.setToolTipText("Salir"+" "+TipoPrioridadEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonNuevoTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrioridadEmpresaProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonActualizarTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPrioridadEmpresaProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonEliminarTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPrioridadEmpresaProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonCancelarTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPrioridadEmpresaProdu"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonCerrarTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrioridadEmpresaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrioridadEmpresaProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrioridadEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrioridadEmpresaProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPrioridadEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPrioridadEmpresaProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPrioridadEmpresaProdu.setToolTipText("Nuevo TipoPrioridadEmpresaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPrioridadEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPrioridadEmpresaProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPrioridadEmpresaProdu.setToolTipText("Sin Cerrar Ventana TipoPrioridadEmpresaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPrioridadEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPrioridadEmpresaProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPrioridadEmpresaProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPrioridadEmpresaProdu = new JLabelMe();
		
		this.jLabelAccionesTipoPrioridadEmpresaProdu.setText("Acciones");		
		this.jLabelAccionesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPrioridadEmpresaProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPrioridadEmpresaProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPrioridadEmpresaProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPrioridadEmpresaProdu = new GridBagLayout();
		
		this.jPanelCamposTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutCamposTipoPrioridadEmpresaProdu);
		this.jPanelCamposOcultosTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutCamposOcultosTipoPrioridadEmpresaProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPrioridadEmpresaProdu.add(jLabelIdTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);



	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPrioridadEmpresaProdu.add(jLabelidTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);


	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoPrioridadEmpresaProdu.add(jLabelid_empresaTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPrioridadEmpresaProdu.add(jButtonid_empresaTipoPrioridadEmpresaProduBusqueda, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 3;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPrioridadEmpresaProdu.add(jButtonid_empresaTipoPrioridadEmpresaProduUpdate, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
	}

	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoPrioridadEmpresaProdu.add(jComboBoxid_empresaTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);


	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPrioridadEmpresaProdu.add(jLabelnombreTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPrioridadEmpresaProdu.add(jButtonnombreTipoPrioridadEmpresaProduBusqueda, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
	}

	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPrioridadEmpresaProdu.add(jscrollPanenombreTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);


	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoPrioridadEmpresaProdu.add(jLabeldescripcionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoPrioridadEmpresaProdu.add(jButtondescripcionTipoPrioridadEmpresaProduBusqueda, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
	}

	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoPrioridadEmpresaProdu.add(jscrollPanedescripcionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iYPanelCamposTipoPrioridadEmpresaProdu;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iXPanelCamposTipoPrioridadEmpresaProdu++;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrioridadEmpresaProdu.add(this.jPanelidTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);



	if(iXPanelCamposTipoPrioridadEmpresaProdu % 1==0) {
		iXPanelCamposTipoPrioridadEmpresaProdu=0;
		iYPanelCamposTipoPrioridadEmpresaProdu++;
	}
	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iYPanelCamposTipoPrioridadEmpresaProdu;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iXPanelCamposTipoPrioridadEmpresaProdu++;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrioridadEmpresaProdu.add(this.jPanelnombreTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);



	if(iXPanelCamposTipoPrioridadEmpresaProdu % 1==0) {
		iXPanelCamposTipoPrioridadEmpresaProdu=0;
		iYPanelCamposTipoPrioridadEmpresaProdu++;
	}
	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iYPanelCamposTipoPrioridadEmpresaProdu;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iXPanelCamposTipoPrioridadEmpresaProdu++;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrioridadEmpresaProdu.add(this.jPaneldescripcionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);



	if(iXPanelCamposTipoPrioridadEmpresaProdu % 1==0) {
		iXPanelCamposTipoPrioridadEmpresaProdu=0;
		iYPanelCamposTipoPrioridadEmpresaProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iYPanelCamposOcultosTipoPrioridadEmpresaProdu;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iXPanelCamposOcultosTipoPrioridadEmpresaProdu++;
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrioridadEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoPrioridadEmpresaProdu.add(this.jPanelid_empresaTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);



	if(iXPanelCamposOcultosTipoPrioridadEmpresaProdu % 1==0) {
		iXPanelCamposOcultosTipoPrioridadEmpresaProdu=0;
		iYPanelCamposOcultosTipoPrioridadEmpresaProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPrioridadEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutAccionesTipoPrioridadEmpresaProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPrioridadEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutAccionesFormularioTipoPrioridadEmpresaProdu);
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu.add(this.jComboBoxTiposAccionesFormularioTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);

		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu.add(this.jCheckBoxPostAccionNuevoTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu.add(this.jCheckBoxPostAccionSinCerrarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprioridadempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu.add(this.jCheckBoxPostAccionSinMensajeTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPrioridadEmpresaProdu.add(this.jButtonModificarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);							

		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPrioridadEmpresaProdu.add(this.jButtonEliminarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
			
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrioridadEmpresaProdu.add(this.jButtonActualizarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);


		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrioridadEmpresaProdu.add(this.jButtonGuardarCambiosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);	
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPrioridadEmpresaProdu.add(this.jButtonCancelarTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrioridadEmpresaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrioridadEmpresaProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprioridadempresaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;		
			//this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =0;
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPrioridadEmpresaProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPrioridadEmpresaProdu = new TipoPrioridadEmpresaProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Prioridad Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Prioridad Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prioridad Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPrioridadEmpresaProduModel tipoprioridadempresaproduModel=new TipoPrioridadEmpresaProduModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPrioridadEmpresaProduModel.TipoPrioridadEmpresaProduFocusTraversalPolicy tipoprioridadempresaproduFocusTraversalPolicy = tipoprioridadempresaproduModel.new TipoPrioridadEmpresaProduFocusTraversalPolicy(this);
			
			//tipoprioridadempresaproduFocusTraversalPolicy.settipoprioridadempresaproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprioridadempresaproduModel);
			
			
			this.jContentPaneDetalleTipoPrioridadEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPrioridadEmpresaProdu = new GridBagLayout();	
			this.jContentPaneDetalleTipoPrioridadEmpresaProdu.setLayout(gridaBagLayoutDetalleTipoPrioridadEmpresaProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrioridadEmpresaProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPrioridadEmpresaProdu.add(jTtoolBarDetalleTipoPrioridadEmpresaProdu, gridBagConstraintsTipoPrioridadEmpresaProdu);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu=   new JScrollPane(jContentPaneDetalleTipoPrioridadEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
	        
			this.jContentPaneDetalleTipoPrioridadEmpresaProdu.add(jPanelCamposTipoPrioridadEmpresaProdu, gridBagConstraintsTipoPrioridadEmpresaProdu);
			
			
			
			
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
						&& tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameOrdenProdu(this.puedeCargarPorParteOrdenProdu,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoProdu(this.puedeCargarPorPartePedidoProdu,false,-1);
					
					if(this.tipoprioridadempresaproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPrioridadEmpresaProdu= new GridBagConstraints();
						this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
						this.jContentPaneDetalleTipoPrioridadEmpresaProdu.add(this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPrioridadEmpresaProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameOrdenProdu(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoProdu(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPrioridadEmpresaProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
					this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPrioridadEmpresaProdu.add(jPanelCamposOcultosTipoPrioridadEmpresaProdu, gridBagConstraintsTipoPrioridadEmpresaProdu);
				
					this.jPanelCamposOcultosTipoPrioridadEmpresaProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
	        this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPrioridadEmpresaProdu.add(this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);							
			
			
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
	        this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPrioridadEmpresaProdu.add(this.jPanelAccionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu=   new JScrollPane(this.jPanelCamposTipoPrioridadEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);			
			
			this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
			
			
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		
			
		this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrioridadEmpresaProdu, this.gridBagConstraintsTipoPrioridadEmpresaProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPrioridadEmpresaProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPrioridadEmpresaProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameOrdenProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ordenproduSessionBean=new OrdenProduSessionBean();
		this.ordenproduSessionBean.setConGuardarRelaciones(false);
		this.ordenproduSessionBean.setEsGuardarRelacionado(true);

		this.ordenproduBeanSwingJInternalFrame=null;//new OrdenProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ordenproduBeanSwingJInternalFramePopup=new OrdenProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ordenproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {

				OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ordenproduSessionBean.setEsGuardarRelacionado(true);

				this.ordenproduBeanSwingJInternalFrame=new OrdenProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.ordenproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ordenproduBeanSwingJInternalFrame.setordenproduSessionBean(this.ordenproduSessionBean);

				//this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
				//this.jContentPaneDetalleTipoPrioridadEmpresaProdu.add(this.ordenproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrioridadEmpresaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.add("Orden Producciones",this.ordenproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setComponentAt(iIndexTab,this.ordenproduBeanSwingJInternalFrame.getContentPane());
				}

				//OrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ordenproduSessionBean.setEsGuardarRelacionado(false);
				this.ordenproduBeanSwingJInternalFrame=null;//new OrdenProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteOrdenProdu) {
					this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.add("Orden Producciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoproduSessionBean=new PedidoProduSessionBean();
		this.pedidoproduSessionBean.setConGuardarRelaciones(false);
		this.pedidoproduSessionBean.setEsGuardarRelacionado(true);

		this.pedidoproduBeanSwingJInternalFrame=null;//new PedidoProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoproduBeanSwingJInternalFramePopup=new PedidoProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {

				PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrioridadEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoproduSessionBean.setEsGuardarRelacionado(true);

				this.pedidoproduBeanSwingJInternalFrame=new PedidoProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pedidoproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoproduBeanSwingJInternalFrame.setpedidoproduSessionBean(this.pedidoproduSessionBean);

				//this.gridBagConstraintsTipoPrioridadEmpresaProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrioridadEmpresaProdu.gridx = 0;
				//this.jContentPaneDetalleTipoPrioridadEmpresaProdu.add(this.pedidoproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrioridadEmpresaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.add("Pedido Producciones",this.pedidoproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.setComponentAt(iIndexTab,this.pedidoproduBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoproduSessionBean.setEsGuardarRelacionado(false);
				this.pedidoproduBeanSwingJInternalFrame=null;//new PedidoProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoProdu) {
					this.jTabbedPaneRelacionesTipoPrioridadEmpresaProdu.add("Pedido Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarOrdenProduBeanSwingJInternalFrame(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus,TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,OrdenProduBeanSwingJInternalFrame ordenproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ordenproduBeanSwingJInternalFrame=new OrdenProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ordenproduBeanSwingJInternalFrame.getOrdenProduLogic().setConnexion(this.tipoprioridadempresaproduLogic.getConnexion());

					ordenproduBeanSwingJInternalFrame.settipoprioridadempresaprodusForeignKey(tipoprioridadempresaprodus);
					ordenproduBeanSwingJInternalFrame.settipoprioridadempresaproduForeignKey(tipoprioridadempresaprodu);
					ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu(true);
					ordenproduBeanSwingJInternalFrame.ordenproduSessionBean.setlidTipoPrioridadEmpresaProduActual(tipoprioridadempresaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ordenproduBeanSwingJInternalFrame.cargarCombosForeignKeyOrdenProdu(ordenproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					ordenproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrioridadEmpresaProdu(true);
					ordenproduBeanSwingJInternalFrame.setid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu.getId());

					if(!this.conCargarFormDetalle) {
						ordenproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ordenproduBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrioridadEmpresaProduForeignKey(tipoprioridadempresaprodu,1,false,true,true);
					ordenproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ordenproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrioridadEmpresaProdu");
					ordenproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrioridadEmpresaProdu");
					ordenproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenProdu(true);
					ordenproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesOrdenProdu("n",ordenproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, ordenproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ordenproduBeanSwingJInternalFrame.setAutoscrolls(true);
					ordenproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ordenproduBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenProdu("relacionado");
					} else {
						ordenproduBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenProdu("no_relacionado");
					}

					ordenproduBeanSwingJInternalFrame.getjButtonRecargarInformacionOrdenProdu().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoProduBeanSwingJInternalFrame(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodus,TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoproduBeanSwingJInternalFrame=new PedidoProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoproduBeanSwingJInternalFrame.getPedidoProduLogic().setConnexion(this.tipoprioridadempresaproduLogic.getConnexion());

					pedidoproduBeanSwingJInternalFrame.settipoprioridadempresaprodusForeignKey(tipoprioridadempresaprodus);
					pedidoproduBeanSwingJInternalFrame.settipoprioridadempresaproduForeignKey(tipoprioridadempresaprodu);
					pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu(true);
					pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setlidTipoPrioridadEmpresaProduActual(tipoprioridadempresaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoproduBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoProdu(pedidoproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrioridadEmpresaProdu(true);
					pedidoproduBeanSwingJInternalFrame.setid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu(tipoprioridadempresaprodu.getId());

					if(!this.conCargarFormDetalle) {
						pedidoproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoproduBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrioridadEmpresaProduForeignKey(tipoprioridadempresaprodu,1,false,true,true);
					pedidoproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrioridadEmpresaProdu");
					pedidoproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrioridadEmpresaProdu");
					pedidoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoProdu(true);
					pedidoproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoProdu("n",pedidoproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoproduBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoProdu("relacionado");
					} else {
						pedidoproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoProdu("no_relacionado");
					}

					pedidoproduBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoProdu().setVisible(false);

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
