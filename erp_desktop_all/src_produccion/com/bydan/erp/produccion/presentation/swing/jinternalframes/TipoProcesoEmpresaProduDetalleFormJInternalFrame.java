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

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.produccion.util.TipoProcesoEmpresaProduConstantesFunciones;

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
public class TipoProcesoEmpresaProduDetalleFormJInternalFrame extends TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProcesoEmpresaProdu;
	
	protected JMenuBar jmenuBarDetalleTipoProcesoEmpresaProdu;
	
	protected JMenu jmenuDetalleTipoProcesoEmpresaProdu;
	protected JMenu jmenuDetalleArchivoTipoProcesoEmpresaProdu;
	protected JMenu jmenuDetalleAccionesTipoProcesoEmpresaProdu;
	protected JMenu jmenuDetalleDatosTipoProcesoEmpresaProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProcesoEmpresaProdu;	
	protected GridBagConstraints gridBagConstraintsTipoProcesoEmpresaProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProcesoEmpresaProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	
	

	public ProductoProduManoBeanSwingJInternalFrame productoprodumanoBeanSwingJInternalFrame=null;
	public ProductoProduManoBeanSwingJInternalFrame productoprodumanoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProduMano=false;
	public ProductoProduManoSessionBean productoprodumanoSessionBean;

	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame productoordendetaprodumanoBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduManoBeanSwingJInternalFrame productoordendetaprodumanoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProduMano=false;
	public ProductoOrdenDetaProduManoSessionBean productoordendetaprodumanoSessionBean;

	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProduMaquina=false;
	public ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean;

	public ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;
	public ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProduMaquina=false;
	public ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic;
	
	public JScrollPane jScrollPanelDatosTipoProcesoEmpresaProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoProcesoEmpresaProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoProcesoEmpresaProdu;
	
	protected JPanel jPanelCamposTipoProcesoEmpresaProdu;    
	protected JPanel jPanelCamposOcultosTipoProcesoEmpresaProdu;    	
	protected JPanel jPanelAccionesTipoProcesoEmpresaProdu;
	protected JPanel jPanelAccionesFormularioTipoProcesoEmpresaProdu;
    
	
	
	protected Integer iXPanelCamposTipoProcesoEmpresaProdu=0;
	protected Integer iYPanelCamposTipoProcesoEmpresaProdu=0;
	
	protected Integer iXPanelCamposOcultosTipoProcesoEmpresaProdu=0;
	protected Integer iYPanelCamposOcultosTipoProcesoEmpresaProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProcesoEmpresaProdu;
	public JButton jButtonModificarTipoProcesoEmpresaProdu;
	public JButton jButtonActualizarTipoProcesoEmpresaProdu;
    public JButton jButtonEliminarTipoProcesoEmpresaProdu;
	public JButton jButtonCancelarTipoProcesoEmpresaProdu;
    public JButton jButtonGuardarCambiosTipoProcesoEmpresaProdu;
	public JButton jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu;
	protected JButton jButtonCerrarTipoProcesoEmpresaProdu;
	
	
	protected JButton jButtonProcesarInformacionTipoProcesoEmpresaProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProcesoEmpresaProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProcesoEmpresaProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProcesoEmpresaProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonModificarToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonActualizarToolBarTipoProcesoEmpresaProdu;
    protected JButton jButtonEliminarToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonCancelarToolBarTipoProcesoEmpresaProdu;
    protected JButton jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProcesoEmpresaProdu;
	protected JButton jButtonCerrarToolBarTipoProcesoEmpresaProdu;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProcesoEmpresaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemModificarTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemActualizarTipoProcesoEmpresaProdu;
    protected JMenuItem jMenuItemEliminarTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemCancelarTipoProcesoEmpresaProdu;
    protected JMenuItem jMenuItemGuardarCambiosTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemCerrarTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProcesoEmpresaProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoProcesoEmpresaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProcesoEmpresaProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProcesoEmpresaProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProcesoEmpresaProdu;
	public JLabel jLabelIdTipoProcesoEmpresaProdu;
	public JLabel jLabelidTipoProcesoEmpresaProdu;
	public JButton jButtonidTipoProcesoEmpresaProduBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProcesoEmpresaProdu;
	public JLabel jLabelnombreTipoProcesoEmpresaProdu;
	public JTextArea jTextAreanombreTipoProcesoEmpresaProdu;
	public JScrollPane jscrollPanenombreTipoProcesoEmpresaProdu;
	public JButton jButtonnombreTipoProcesoEmpresaProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoProcesoEmpresaProdu;
	public JLabel jLabeldescripcionTipoProcesoEmpresaProdu;
	public JTextArea jTextAreadescripcionTipoProcesoEmpresaProdu;
	public JScrollPane jscrollPanedescripcionTipoProcesoEmpresaProdu;
	public JButton jButtondescripcionTipoProcesoEmpresaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoProcesoEmpresaProdu;
	public JLabel jLabelid_empresaTipoProcesoEmpresaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoProcesoEmpresaProdu;
	public JButton jButtonid_empresaTipoProcesoEmpresaProdu= new JButtonMe();
	public JButton jButtonid_empresaTipoProcesoEmpresaProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoProcesoEmpresaProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProcesoEmpresaProdu;
	
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
	
	public TipoProcesoEmpresaProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProcesoEmpresaProdu=new JPanel();
				this.jPanelAccionesFormularioTipoProcesoEmpresaProdu=new JPanel();
				this.jmenuBarDetalleTipoProcesoEmpresaProdu=new JMenuBar();
				this.jTtoolBarDetalleTipoProcesoEmpresaProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoEmpresaProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProcesoEmpresaProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoEmpresaProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoEmpresaProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoEmpresaProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProcesoEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProcesoEmpresaProdu() {
		return this.jButtonActualizarToolBarTipoProcesoEmpresaProdu;
	}
	
	public JButton getjButtonEliminarToolBarTipoProcesoEmpresaProdu() {
		return this.jButtonEliminarToolBarTipoProcesoEmpresaProdu;
	}
	
	public JButton getjButtonCancelarToolBarTipoProcesoEmpresaProdu() {
		return this.jButtonCancelarToolBarTipoProcesoEmpresaProdu;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProcesoEmpresaProdu() {
		return this.jButtonProcesarInformacionTipoProcesoEmpresaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProcesoEmpresaProdu)	{
		this.jButtonProcesarInformacionTipoProcesoEmpresaProdu = jButtonProcesarInformacionTipoProcesoEmpresaProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProcesoEmpresaProdu() {
		return this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposRelacionesTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposRelacionesTipoProcesoEmpresaProdu = jComboBoxTiposRelacionesTipoProcesoEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposAccionesTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu = jComboBoxTiposAccionesTipoProcesoEmpresaProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu() {
		return this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu(
			JComboBox jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu) {
		this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu = jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprocesoempresaproduSessionBean=new TipoProcesoEmpresaProduSessionBean();
		
		this.tipoprocesoempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesoempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		//this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		//this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		//this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProcesoEmpresaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proceso Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProcesoEmpresaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProcesoEmpresaProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProcesoEmpresaProdu=new JButtonMe();
				this.jButtonModificarToolBarTipoProcesoEmpresaProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProcesoEmpresaProdu,this.jTtoolBarDetalleTipoProcesoEmpresaProdu,
							"actualizar","actualizar","Actualizar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProcesoEmpresaProdu,this.jTtoolBarDetalleTipoProcesoEmpresaProdu,
							"eliminar","eliminar","Eliminar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProcesoEmpresaProdu,this.jTtoolBarDetalleTipoProcesoEmpresaProdu,
							"cancelar","cancelar","Cancelar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProcesoEmpresaProdu,this.jTtoolBarDetalleTipoProcesoEmpresaProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProcesoEmpresaProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProcesoEmpresaProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProcesoEmpresaProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProcesoEmpresaProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProcesoEmpresaProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProcesoEmpresaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProcesoEmpresaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProcesoEmpresaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProcesoEmpresaProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProcesoEmpresaProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProcesoEmpresaProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProcesoEmpresaProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProcesoEmpresaProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProcesoEmpresaProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProcesoEmpresaProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProcesoEmpresaProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProcesoEmpresaProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProcesoEmpresaProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProcesoEmpresaProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProcesoEmpresaProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProcesoEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProcesoEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProcesoEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProcesoEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProcesoEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProcesoEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProcesoEmpresaProdu.add(this.jMenuItemDetalleCerrarTipoProcesoEmpresaProdu);
		
		this.jmenuDetalleAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemActualizarTipoProcesoEmpresaProdu);
		this.jmenuDetalleAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemEliminarTipoProcesoEmpresaProdu);
		this.jmenuDetalleAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemCancelarTipoProcesoEmpresaProdu);		
		
		//this.jmenuDetalleDatosTipoProcesoEmpresaProdu.add(this.jMenuItemDetalleAbrirOrderByTipoProcesoEmpresaProdu);				
		this.jmenuDetalleDatosTipoProcesoEmpresaProdu.add(this.jMenuItemDetalleMostarOcultarTipoProcesoEmpresaProdu);				
				
		//this.jmenuDetalleAccionesTipoProcesoEmpresaProdu.add(this.jMenuItemGuardarCambiosTipoProcesoEmpresaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProcesoEmpresaProdu.add(this.jmenuDetalleArchivoTipoProcesoEmpresaProdu);		
		this.jmenuBarDetalleTipoProcesoEmpresaProdu.add(this.jmenuDetalleAccionesTipoProcesoEmpresaProdu);		
		this.jmenuBarDetalleTipoProcesoEmpresaProdu.add(this.jmenuDetalleDatosTipoProcesoEmpresaProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoProcesoEmpresaProdu.add(this.jmenuDetalleTipoProcesoEmpresaProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProcesoEmpresaProdu);				
	}
	
	
	public void inicializarElementosCamposTipoProcesoEmpresaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProcesoEmpresaProdu = new JLabelMe();
		jLabelIdTipoProcesoEmpresaProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProcesoEmpresaProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProcesoEmpresaProdu.setToolTipText(TipoProcesoEmpresaProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProcesoEmpresaProdu= new GridBagLayout();

		this.jPanelidTipoProcesoEmpresaProdu.setLayout(this.gridaBagLayoutTipoProcesoEmpresaProdu);

		jLabelidTipoProcesoEmpresaProdu = new JLabel();
		jLabelidTipoProcesoEmpresaProdu.setText("Id");

		jLabelidTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoProcesoEmpresaProdu = new JLabelMe();
		this.jLabelnombreTipoProcesoEmpresaProdu.setText(""+TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProcesoEmpresaProdu.setToolTipText("Nombre");
		this.jLabelnombreTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProcesoEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProcesoEmpresaProdu.setToolTipText(TipoProcesoEmpresaProduConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProcesoEmpresaProdu = new GridBagLayout();
		this.jPanelnombreTipoProcesoEmpresaProdu.setLayout(this.gridaBagLayoutTipoProcesoEmpresaProdu);


		jTextAreanombreTipoProcesoEmpresaProdu= new JTextAreaMe();
		jTextAreanombreTipoProcesoEmpresaProdu.setEnabled(false);
		jTextAreanombreTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProcesoEmpresaProdu.setLineWrap(true);
		jTextAreanombreTipoProcesoEmpresaProdu.setWrapStyleWord(true);
		jTextAreanombreTipoProcesoEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProcesoEmpresaProdu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProcesoEmpresaProdu = new JScrollPane(jTextAreanombreTipoProcesoEmpresaProdu);
		jscrollPanenombreTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProcesoEmpresaProduBusqueda= new JButtonMe();
		this.jButtonnombreTipoProcesoEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProcesoEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProcesoEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProcesoEmpresaProduBusqueda.setText("U");
		this.jButtonnombreTipoProcesoEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProcesoEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProcesoEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProcesoEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProcesoEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProcesoEmpresaProduBusqueda"));

		if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProcesoEmpresaProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoProcesoEmpresaProdu = new JLabelMe();
		this.jLabeldescripcionTipoProcesoEmpresaProdu.setText(""+TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoProcesoEmpresaProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoProcesoEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoProcesoEmpresaProdu.setToolTipText(TipoProcesoEmpresaProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoProcesoEmpresaProdu = new GridBagLayout();
		this.jPaneldescripcionTipoProcesoEmpresaProdu.setLayout(this.gridaBagLayoutTipoProcesoEmpresaProdu);


		jTextAreadescripcionTipoProcesoEmpresaProdu= new JTextAreaMe();
		jTextAreadescripcionTipoProcesoEmpresaProdu.setEnabled(false);
		jTextAreadescripcionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoProcesoEmpresaProdu.setLineWrap(true);
		jTextAreadescripcionTipoProcesoEmpresaProdu.setWrapStyleWord(true);
		jTextAreadescripcionTipoProcesoEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoProcesoEmpresaProdu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoProcesoEmpresaProdu = new JScrollPane(jTextAreadescripcionTipoProcesoEmpresaProdu);
		jscrollPanedescripcionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoProcesoEmpresaProduBusqueda= new JButtonMe();
		this.jButtondescripcionTipoProcesoEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoProcesoEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoProcesoEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoProcesoEmpresaProduBusqueda.setText("U");
		this.jButtondescripcionTipoProcesoEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoProcesoEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoProcesoEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoProcesoEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoProcesoEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoProcesoEmpresaProduBusqueda"));

		if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoProcesoEmpresaProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProcesoEmpresaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoProcesoEmpresaProdu = new JLabelMe();
		this.jLabelid_empresaTipoProcesoEmpresaProdu.setText(""+TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoProcesoEmpresaProdu.setToolTipText("Empresa");
		this.jLabelid_empresaTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoProcesoEmpresaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoProcesoEmpresaProdu.setToolTipText(TipoProcesoEmpresaProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoProcesoEmpresaProdu = new GridBagLayout();
		this.jPanelid_empresaTipoProcesoEmpresaProdu.setLayout(this.gridaBagLayoutTipoProcesoEmpresaProdu);


		jComboBoxid_empresaTipoProcesoEmpresaProdu= new JComboBoxMe();
		jComboBoxid_empresaTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoProcesoEmpresaProdu.setEnabled(false);

		this.jButtonid_empresaTipoProcesoEmpresaProdu= new JButtonMe();
		this.jButtonid_empresaTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoProcesoEmpresaProdu.setText("Buscar");
		this.jButtonid_empresaTipoProcesoEmpresaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoProcesoEmpresaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProcesoEmpresaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoProcesoEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProcesoEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProcesoEmpresaProdu"));

		this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.setText("U");
		this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoProcesoEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProcesoEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProcesoEmpresaProduBusqueda"));

		if(this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoProcesoEmpresaProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoProcesoEmpresaProduUpdate= new JButtonMe();
		this.jButtonid_empresaTipoProcesoEmpresaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProcesoEmpresaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoProcesoEmpresaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoProcesoEmpresaProduUpdate.setText("U");
		this.jButtonid_empresaTipoProcesoEmpresaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoProcesoEmpresaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoProcesoEmpresaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoProcesoEmpresaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoProcesoEmpresaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoProcesoEmpresaProduUpdate"));



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
		//this.jInternalFrameDetalleTipoProcesoEmpresaProdu = new TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Proceso Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProcesoEmpresaProdu= new GridBagLayout();
		

		
		String sToolTipTipoProcesoEmpresaProdu="";
		sToolTipTipoProcesoEmpresaProdu=TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProcesoEmpresaProdu+="(Produccion.TipoProcesoEmpresaProdu)";
		}
		
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProcesoEmpresaProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonModificarTipoProcesoEmpresaProdu = new JButtonMe();
        this.jButtonActualizarTipoProcesoEmpresaProdu = new JButtonMe();
        this.jButtonEliminarTipoProcesoEmpresaProdu = new JButtonMe();
        this.jButtonCancelarTipoProcesoEmpresaProdu = new JButtonMe();
        this.jButtonGuardarCambiosTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu = new JButtonMe();
		this.jButtonCerrarTipoProcesoEmpresaProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoProcesoEmpresaProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proceso Empresa";
		
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProcesoEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProcesoEmpresaProdu.setName("jPanelCamposTipoProcesoEmpresaProdu"); 

		this.jPanelCamposOcultosTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProcesoEmpresaProdu.setName("jPanelCamposOcultosTipoProcesoEmpresaProdu"); 

        this.jPanelAccionesTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProcesoEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoProcesoEmpresaProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProcesoEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProcesoEmpresaProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProcesoEmpresaProdu.setText("Nuevo");
		this.jButtonModificarTipoProcesoEmpresaProdu.setText("Editar");
        this.jButtonActualizarTipoProcesoEmpresaProdu.setText("Actualizar");
        this.jButtonEliminarTipoProcesoEmpresaProdu.setText("Eliminar");
        this.jButtonCancelarTipoProcesoEmpresaProdu.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProcesoEmpresaProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.setText("Guardar");
		this.jButtonCerrarTipoProcesoEmpresaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProcesoEmpresaProdu,"nuevo_button","Nuevo",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProcesoEmpresaProdu,"modificar_button","Editar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProcesoEmpresaProdu,"actualizar_button","Actualizar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProcesoEmpresaProdu,"eliminar_button","Eliminar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProcesoEmpresaProdu,"cancelar_button","Cancelar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProcesoEmpresaProdu,"guardarcambios_button","Guardar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu,"guardarcambiostabla_button","Guardar",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProcesoEmpresaProdu,"cerrar_button","Salir",this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProcesoEmpresaProdu.setToolTipText("Nuevo"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProcesoEmpresaProdu.setToolTipText("Editar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProcesoEmpresaProdu.setToolTipText("Actualizar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProcesoEmpresaProdu.setToolTipText("Eliminar)"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProcesoEmpresaProdu.setToolTipText("Cancelar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProcesoEmpresaProdu.setToolTipText("Guardar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.setToolTipText("Guardar"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProcesoEmpresaProdu.setToolTipText("Salir"+" "+TipoProcesoEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProcesoEmpresaProdu";
		inputMap = this.jButtonNuevoTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProcesoEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProcesoEmpresaProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonActualizarTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProcesoEmpresaProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonEliminarTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProcesoEmpresaProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonCancelarTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProcesoEmpresaProdu"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProcesoEmpresaProdu";
		inputMap = this.jButtonCerrarTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProcesoEmpresaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProcesoEmpresaProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProcesoEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProcesoEmpresaProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProcesoEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProcesoEmpresaProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProcesoEmpresaProdu.setToolTipText("Nuevo TipoProcesoEmpresaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProcesoEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProcesoEmpresaProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProcesoEmpresaProdu.setToolTipText("Sin Cerrar Ventana TipoProcesoEmpresaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProcesoEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProcesoEmpresaProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProcesoEmpresaProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProcesoEmpresaProdu = new JLabelMe();
		
		this.jLabelAccionesTipoProcesoEmpresaProdu.setText("Acciones");		
		this.jLabelAccionesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProcesoEmpresaProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProcesoEmpresaProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProcesoEmpresaProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProcesoEmpresaProdu = new GridBagLayout();
		
		this.jPanelCamposTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutCamposTipoProcesoEmpresaProdu);
		this.jPanelCamposOcultosTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutCamposOcultosTipoProcesoEmpresaProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProcesoEmpresaProdu.add(jLabelIdTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);



	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProcesoEmpresaProdu.add(jLabelidTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);


	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoProcesoEmpresaProdu.add(jLabelid_empresaTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoProcesoEmpresaProdu.add(jButtonid_empresaTipoProcesoEmpresaProduBusqueda, this.gridBagConstraintsTipoProcesoEmpresaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 3;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoProcesoEmpresaProdu.add(jButtonid_empresaTipoProcesoEmpresaProduUpdate, this.gridBagConstraintsTipoProcesoEmpresaProdu);
	}

	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoProcesoEmpresaProdu.add(jComboBoxid_empresaTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);


	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProcesoEmpresaProdu.add(jLabelnombreTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProcesoEmpresaProdu.add(jButtonnombreTipoProcesoEmpresaProduBusqueda, this.gridBagConstraintsTipoProcesoEmpresaProdu);
	}

	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProcesoEmpresaProdu.add(jscrollPanenombreTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);


	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoProcesoEmpresaProdu.add(jLabeldescripcionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 2;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoProcesoEmpresaProdu.add(jButtondescripcionTipoProcesoEmpresaProduBusqueda, this.gridBagConstraintsTipoProcesoEmpresaProdu);
	}

	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 1;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoProcesoEmpresaProdu.add(jscrollPanedescripcionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iYPanelCamposTipoProcesoEmpresaProdu;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iXPanelCamposTipoProcesoEmpresaProdu++;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoEmpresaProdu.add(this.jPanelidTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);



	if(iXPanelCamposTipoProcesoEmpresaProdu % 1==0) {
		iXPanelCamposTipoProcesoEmpresaProdu=0;
		iYPanelCamposTipoProcesoEmpresaProdu++;
	}
	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iYPanelCamposTipoProcesoEmpresaProdu;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iXPanelCamposTipoProcesoEmpresaProdu++;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoEmpresaProdu.add(this.jPanelnombreTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);



	if(iXPanelCamposTipoProcesoEmpresaProdu % 1==0) {
		iXPanelCamposTipoProcesoEmpresaProdu=0;
		iYPanelCamposTipoProcesoEmpresaProdu++;
	}
	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iYPanelCamposTipoProcesoEmpresaProdu;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iXPanelCamposTipoProcesoEmpresaProdu++;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProcesoEmpresaProdu.add(this.jPaneldescripcionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);



	if(iXPanelCamposTipoProcesoEmpresaProdu % 1==0) {
		iXPanelCamposTipoProcesoEmpresaProdu=0;
		iYPanelCamposTipoProcesoEmpresaProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iYPanelCamposOcultosTipoProcesoEmpresaProdu;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iXPanelCamposOcultosTipoProcesoEmpresaProdu++;
	this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProcesoEmpresaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoProcesoEmpresaProdu.add(this.jPanelid_empresaTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);



	if(iXPanelCamposOcultosTipoProcesoEmpresaProdu % 1==0) {
		iXPanelCamposOcultosTipoProcesoEmpresaProdu=0;
		iYPanelCamposOcultosTipoProcesoEmpresaProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProcesoEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutAccionesTipoProcesoEmpresaProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProcesoEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutAccionesFormularioTipoProcesoEmpresaProdu);
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProcesoEmpresaProdu.add(this.jComboBoxTiposAccionesFormularioTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);

		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProcesoEmpresaProdu.add(this.jCheckBoxPostAccionNuevoTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProcesoEmpresaProdu.add(this.jCheckBoxPostAccionSinCerrarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprocesoempresaproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProcesoEmpresaProdu.add(this.jCheckBoxPostAccionSinMensajeTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProcesoEmpresaProdu.add(this.jButtonModificarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);							

		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProcesoEmpresaProdu.add(this.jButtonEliminarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
			
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoEmpresaProdu.add(this.jButtonActualizarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);


		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoEmpresaProdu.add(this.jButtonGuardarCambiosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);	
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = 0;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProcesoEmpresaProdu.add(this.jButtonCancelarTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProcesoEmpresaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProcesoEmpresaProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprocesoempresaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;		
			//this.gridBagConstraintsTipoProcesoEmpresaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProcesoEmpresaProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =0;
		this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProcesoEmpresaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProcesoEmpresaProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProcesoEmpresaProdu = new TipoProcesoEmpresaProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Proceso Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Proceso Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proceso Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProcesoEmpresaProduModel tipoprocesoempresaproduModel=new TipoProcesoEmpresaProduModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProcesoEmpresaProduModel.TipoProcesoEmpresaProduFocusTraversalPolicy tipoprocesoempresaproduFocusTraversalPolicy = tipoprocesoempresaproduModel.new TipoProcesoEmpresaProduFocusTraversalPolicy(this);
			
			//tipoprocesoempresaproduFocusTraversalPolicy.settipoprocesoempresaproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprocesoempresaproduModel);
			
			
			this.jContentPaneDetalleTipoProcesoEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProcesoEmpresaProdu = new GridBagLayout();	
			this.jContentPaneDetalleTipoProcesoEmpresaProdu.setLayout(gridaBagLayoutDetalleTipoProcesoEmpresaProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProcesoEmpresaProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(jTtoolBarDetalleTipoProcesoEmpresaProdu, gridBagConstraintsTipoProcesoEmpresaProdu);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu=   new JScrollPane(jContentPaneDetalleTipoProcesoEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
	        
			this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(jPanelCamposTipoProcesoEmpresaProdu, gridBagConstraintsTipoProcesoEmpresaProdu);
			
			
			
			
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
						&& tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMano(this.puedeCargarPorParteProductoOrdenDetaProduMano,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(this.puedeCargarPorParteProductoOrdenDetaProduMaquina,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMano(this.puedeCargarPorParteProductoProduMano,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(this.puedeCargarPorParteProductoProduMaquina,false,-1);
					
					if(this.tipoprocesoempresaproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProcesoEmpresaProdu= new GridBagConstraints();
						this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
						this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProcesoEmpresaProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMano(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMano(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProcesoEmpresaProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
					this.gridBagConstraintsTipoProcesoEmpresaProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(jPanelCamposOcultosTipoProcesoEmpresaProdu, gridBagConstraintsTipoProcesoEmpresaProdu);
				
					this.jPanelCamposOcultosTipoProcesoEmpresaProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
	        this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(this.jPanelAccionesFormularioTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);							
			
			
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
	        this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(this.jPanelAccionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProcesoEmpresaProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu=   new JScrollPane(this.jPanelCamposTipoProcesoEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProcesoEmpresaProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);			
			
			this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
			
			
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		
			
		this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProcesoEmpresaProdu, this.gridBagConstraintsTipoProcesoEmpresaProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProcesoEmpresaProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProcesoEmpresaProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMano(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaprodumanoSessionBean=new ProductoOrdenDetaProduManoSessionBean();
		this.productoordendetaprodumanoSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaprodumanoBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaprodumanoBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaprodumanoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaprodumanoBeanSwingJInternalFrame=new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaprodumanoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaprodumanoBeanSwingJInternalFrame.setproductoordendetaprodumanoSessionBean(this.productoordendetaprodumanoSessionBean);

				//this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
				//this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(this.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProcesoEmpresaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.add("Orden  Mano De Obraes",this.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setComponentAt(iIndexTab,this.productoordendetaprodumanoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduManoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaprodumanoSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaprodumanoBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaprodumanoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProduMano) {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.add("Orden  Mano De Obraes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaprodumaquinaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaprodumaquinaBeanSwingJInternalFrame.setproductoordendetaprodumaquinaSessionBean(this.productoordendetaprodumaquinaSessionBean);

				//this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
				//this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProcesoEmpresaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.add("Orden Maquinaes",this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setComponentAt(iIndexTab,this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProduMaquina) {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.add("Orden Maquinaes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoProduMano(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
		this.productoprodumanoSessionBean.setConGuardarRelaciones(false);
		this.productoprodumanoSessionBean.setEsGuardarRelacionado(true);

		this.productoprodumanoBeanSwingJInternalFrame=null;//new ProductoProduManoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoprodumanoBeanSwingJInternalFramePopup=new ProductoProduManoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoprodumanoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {

				ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduManoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoprodumanoSessionBean.setEsGuardarRelacionado(true);

				this.productoprodumanoBeanSwingJInternalFrame=new ProductoProduManoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoprodumanoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoprodumanoBeanSwingJInternalFrame.setproductoprodumanoSessionBean(this.productoprodumanoSessionBean);

				//this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
				//this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(this.productoprodumanoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProcesoEmpresaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.add("Producto Mano De Obra Producciones",this.productoprodumanoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setComponentAt(iIndexTab,this.productoprodumanoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoprodumanoSessionBean.setEsGuardarRelacionado(false);
				this.productoprodumanoBeanSwingJInternalFrame=null;//new ProductoProduManoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoprodumanoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProduMano) {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.add("Producto Mano De Obra Producciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		this.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);
		this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);

		this.productoprodumaquinaBeanSwingJInternalFrame=null;//new ProductoProduMaquinaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoprodumaquinaBeanSwingJInternalFramePopup=new ProductoProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoprodumaquinaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {

				ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProcesoEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);

				this.productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoprodumaquinaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoprodumaquinaBeanSwingJInternalFrame.setproductoprodumaquinaSessionBean(this.productoprodumaquinaSessionBean);

				//this.gridBagConstraintsTipoProcesoEmpresaProdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProcesoEmpresaProdu.gridx = 0;
				//this.jContentPaneDetalleTipoProcesoEmpresaProdu.add(this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProcesoEmpresaProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.add("Producto Maquina Producciones",this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.setComponentAt(iIndexTab,this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				this.productoprodumaquinaBeanSwingJInternalFrame=null;//new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProduMaquina) {
					this.jTabbedPaneRelacionesTipoProcesoEmpresaProdu.add("Producto Maquina Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoProduManoBeanSwingJInternalFrame(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus,TipoProcesoEmpresaProdu tipoprocesoempresaprodu,ProductoProduManoBeanSwingJInternalFrame productoprodumanoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoprodumanoBeanSwingJInternalFrame=new ProductoProduManoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoprodumanoBeanSwingJInternalFrame.getProductoProduManoLogic().setConnexion(this.tipoprocesoempresaproduLogic.getConnexion());

					productoprodumanoBeanSwingJInternalFrame.settipoprocesoempresaprodusForeignKey(tipoprocesoempresaprodus);
					productoprodumanoBeanSwingJInternalFrame.settipoprocesoempresaproduForeignKey(tipoprocesoempresaprodu);
					productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(true);
					productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setlidTipoProcesoEmpresaProduActual(tipoprocesoempresaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoprodumanoBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProduMano(productoprodumanoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoprodumanoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(true);
					productoprodumanoBeanSwingJInternalFrame.setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(tipoprocesoempresaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoprodumanoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoprodumanoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProcesoEmpresaProduForeignKey(tipoprocesoempresaprodu,1,false,true,true);
					productoprodumanoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoprodumanoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProcesoEmpresaProdu");
					productoprodumanoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProcesoEmpresaProdu");
					productoprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMano(true);
					productoprodumanoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProduMano("n",productoprodumanoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoprodumanoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoprodumanoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoprodumanoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMano("relacionado");
					} else {
						productoprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMano("no_relacionado");
					}

					productoprodumanoBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProduMano().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoOrdenDetaProduManoBeanSwingJInternalFrame(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus,TipoProcesoEmpresaProdu tipoprocesoempresaprodu,ProductoOrdenDetaProduManoBeanSwingJInternalFrame productoordendetaprodumanoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaprodumanoBeanSwingJInternalFrame=new ProductoOrdenDetaProduManoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaprodumanoBeanSwingJInternalFrame.getProductoOrdenDetaProduManoLogic().setConnexion(this.tipoprocesoempresaproduLogic.getConnexion());

					productoordendetaprodumanoBeanSwingJInternalFrame.settipoprocesoempresaprodusForeignKey(tipoprocesoempresaprodus);
					productoordendetaprodumanoBeanSwingJInternalFrame.settipoprocesoempresaproduForeignKey(tipoprocesoempresaprodu);
					productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(true);
					productoordendetaprodumanoBeanSwingJInternalFrame.productoordendetaprodumanoSessionBean.setlidTipoProcesoEmpresaProduActual(tipoprocesoempresaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaprodumanoBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProduMano(productoordendetaprodumanoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaprodumanoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(true);
					productoordendetaprodumanoBeanSwingJInternalFrame.setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(tipoprocesoempresaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaprodumanoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaprodumanoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProcesoEmpresaProduForeignKey(tipoprocesoempresaprodu,1,false,true,true);
					productoordendetaprodumanoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaprodumanoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProcesoEmpresaProdu");
					productoordendetaprodumanoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProcesoEmpresaProdu");
					productoordendetaprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMano(true);
					productoordendetaprodumanoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMano("n",productoordendetaprodumanoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaprodumanoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaprodumanoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaprodumanoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMano("relacionado");
					} else {
						productoordendetaprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMano("no_relacionado");
					}

					productoordendetaprodumanoBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProduMano().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus,TipoProcesoEmpresaProdu tipoprocesoempresaprodu,ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaprodumaquinaBeanSwingJInternalFrame.getProductoOrdenDetaProduMaquinaLogic().setConnexion(this.tipoprocesoempresaproduLogic.getConnexion());

					productoordendetaprodumaquinaBeanSwingJInternalFrame.settipoprocesoempresaprodusForeignKey(tipoprocesoempresaprodus);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.settipoprocesoempresaproduForeignKey(tipoprocesoempresaprodu);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setlidTipoProcesoEmpresaProduActual(tipoprocesoempresaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaprodumaquinaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(tipoprocesoempresaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaprodumaquinaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProcesoEmpresaProduForeignKey(tipoprocesoempresaprodu,1,false,true,true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaprodumaquinaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProcesoEmpresaProdu");
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProcesoEmpresaProdu");
					productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n",productoordendetaprodumaquinaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaprodumaquinaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("relacionado");
					} else {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("no_relacionado");
					}

					productoordendetaprodumaquinaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProduMaquina().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoProduMaquinaBeanSwingJInternalFrame(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodus,TipoProcesoEmpresaProdu tipoprocesoempresaprodu,ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoprodumaquinaBeanSwingJInternalFrame.getProductoProduMaquinaLogic().setConnexion(this.tipoprocesoempresaproduLogic.getConnexion());

					productoprodumaquinaBeanSwingJInternalFrame.settipoprocesoempresaprodusForeignKey(tipoprocesoempresaprodus);
					productoprodumaquinaBeanSwingJInternalFrame.settipoprocesoempresaproduForeignKey(tipoprocesoempresaprodu);
					productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu(true);
					productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setlidTipoProcesoEmpresaProduActual(tipoprocesoempresaprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoprodumaquinaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProduMaquina(productoprodumaquinaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoprodumaquinaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(true);
					productoprodumaquinaBeanSwingJInternalFrame.setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(tipoprocesoempresaprodu.getId());

					if(!this.conCargarFormDetalle) {
						productoprodumaquinaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoprodumaquinaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProcesoEmpresaProduForeignKey(tipoprocesoempresaprodu,1,false,true,true);
					productoprodumaquinaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoprodumaquinaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProcesoEmpresaProdu");
					productoprodumaquinaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProcesoEmpresaProdu");
					productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(true);
					productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProduMaquina("n",productoprodumaquinaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoprodumaquinaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoprodumaquinaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoprodumaquinaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("relacionado");
					} else {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("no_relacionado");
					}

					productoprodumaquinaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProduMaquina().setVisible(false);

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
