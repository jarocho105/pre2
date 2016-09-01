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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.TipoNivelEduConstantesFunciones;

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
public class TipoNivelEduDetalleFormJInternalFrame extends TipoNivelEduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoNivelEdu;
	
	protected JMenuBar jmenuBarDetalleTipoNivelEdu;
	
	protected JMenu jmenuDetalleTipoNivelEdu;
	protected JMenu jmenuDetalleArchivoTipoNivelEdu;
	protected JMenu jmenuDetalleAccionesTipoNivelEdu;
	protected JMenu jmenuDetalleDatosTipoNivelEdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoNivelEdu;	
	protected GridBagConstraints gridBagConstraintsTipoNivelEdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoNivelEduBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoNivelEdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoNivelEduSessionBean tiponiveleduSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;
	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubCliente=false;
	public SubClienteSessionBean subclienteSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoNivelEduLogic tiponiveleduLogic;
	
	public JScrollPane jScrollPanelDatosTipoNivelEdu;
	public JScrollPane jScrollPanelDatosEdicionTipoNivelEdu;
	public JScrollPane jScrollPanelDatosGeneralTipoNivelEdu;
	
	protected JPanel jPanelCamposTipoNivelEdu;    
	protected JPanel jPanelCamposOcultosTipoNivelEdu;    	
	protected JPanel jPanelAccionesTipoNivelEdu;
	protected JPanel jPanelAccionesFormularioTipoNivelEdu;
    
	
	
	protected Integer iXPanelCamposTipoNivelEdu=0;
	protected Integer iYPanelCamposTipoNivelEdu=0;
	
	protected Integer iXPanelCamposOcultosTipoNivelEdu=0;
	protected Integer iYPanelCamposOcultosTipoNivelEdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoNivelEdu;
	public JButton jButtonModificarTipoNivelEdu;
	public JButton jButtonActualizarTipoNivelEdu;
    public JButton jButtonEliminarTipoNivelEdu;
	public JButton jButtonCancelarTipoNivelEdu;
    public JButton jButtonGuardarCambiosTipoNivelEdu;
	public JButton jButtonGuardarCambiosTablaTipoNivelEdu;
	protected JButton jButtonCerrarTipoNivelEdu;
	
	
	protected JButton jButtonProcesarInformacionTipoNivelEdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoNivelEdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoNivelEdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoNivelEdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoNivelEdu;
	protected JButton jButtonModificarToolBarTipoNivelEdu;
	protected JButton jButtonActualizarToolBarTipoNivelEdu;
    protected JButton jButtonEliminarToolBarTipoNivelEdu;
	protected JButton jButtonCancelarToolBarTipoNivelEdu;
    protected JButton jButtonGuardarCambiosToolBarTipoNivelEdu;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoNivelEdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoNivelEdu;
	protected JButton jButtonCerrarToolBarTipoNivelEdu;
	
	protected JButton jButtonProcesarInformacionToolBarTipoNivelEdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoNivelEdu;
	protected JMenuItem jMenuItemModificarTipoNivelEdu;
	protected JMenuItem jMenuItemActualizarTipoNivelEdu;
    protected JMenuItem jMenuItemEliminarTipoNivelEdu;
	protected JMenuItem jMenuItemCancelarTipoNivelEdu;
    protected JMenuItem jMenuItemGuardarCambiosTipoNivelEdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoNivelEdu;
	protected JMenuItem jMenuItemCerrarTipoNivelEdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoNivelEdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoNivelEdu;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoNivelEdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoNivelEdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoNivelEdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoNivelEdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoNivelEdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoNivelEdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoNivelEdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoNivelEdu;
	public JLabel jLabelIdTipoNivelEdu;
	public JLabel jLabelidTipoNivelEdu;
	public JButton jButtonidTipoNivelEduBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoNivelEdu;
	public JLabel jLabelcodigoTipoNivelEdu;
	public JTextField jTextFieldcodigoTipoNivelEdu;
	public JButton jButtoncodigoTipoNivelEduBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoNivelEdu;
	public JLabel jLabelnombreTipoNivelEdu;
	public JTextArea jTextAreanombreTipoNivelEdu;
	public JScrollPane jscrollPanenombreTipoNivelEdu;
	public JButton jButtonnombreTipoNivelEduBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoTipoNivelEdu;
	public JLabel jLabeles_defectoTipoNivelEdu;
	public JCheckBox jCheckBoxes_defectoTipoNivelEdu;
	public JButton jButtones_defectoTipoNivelEduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoNivelEdu;
	public JLabel jLabelid_empresaTipoNivelEdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoNivelEdu;
	public JButton jButtonid_empresaTipoNivelEdu= new JButtonMe();
	public JButton jButtonid_empresaTipoNivelEduUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoNivelEduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoNivelEdu;
	
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
	
	public TipoNivelEduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoNivelEdu=new JPanel();
				this.jPanelAccionesFormularioTipoNivelEdu=new JPanel();
				this.jmenuBarDetalleTipoNivelEdu=new JMenuBar();
				this.jTtoolBarDetalleTipoNivelEdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNivelEduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoNivelEduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNivelEduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNivelEduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNivelEduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoNivelEdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoNivelEdu() {
		return this.jButtonActualizarToolBarTipoNivelEdu;
	}
	
	public JButton getjButtonEliminarToolBarTipoNivelEdu() {
		return this.jButtonEliminarToolBarTipoNivelEdu;
	}
	
	public JButton getjButtonCancelarToolBarTipoNivelEdu() {
		return this.jButtonCancelarToolBarTipoNivelEdu;
	}		
	
	public JButton getjButtonProcesarInformacionTipoNivelEdu() {
		return this.jButtonProcesarInformacionTipoNivelEdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoNivelEdu)	{
		this.jButtonProcesarInformacionTipoNivelEdu = jButtonProcesarInformacionTipoNivelEdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoNivelEdu() {
		return this.jComboBoxTiposAccionesTipoNivelEdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoNivelEdu(
			JComboBox jComboBoxTiposRelacionesTipoNivelEdu) {
		this.jComboBoxTiposRelacionesTipoNivelEdu = jComboBoxTiposRelacionesTipoNivelEdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoNivelEdu(
			JComboBox jComboBoxTiposAccionesTipoNivelEdu) {
		this.jComboBoxTiposAccionesTipoNivelEdu = jComboBoxTiposAccionesTipoNivelEdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoNivelEdu() {
		return this.jComboBoxTiposAccionesFormularioTipoNivelEdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoNivelEdu(
			JComboBox jComboBoxTiposAccionesFormularioTipoNivelEdu) {
		this.jComboBoxTiposAccionesFormularioTipoNivelEdu = jComboBoxTiposAccionesFormularioTipoNivelEdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiponiveleduSessionBean=new TipoNivelEduSessionBean();
		
		this.tiponiveleduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponiveleduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiponiveleduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.subclienteSessionBean=new SubClienteSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoNivelEduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Nivel Edu MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoNivelEduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoNivelEdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoNivelEdu=new JButtonMe();
				this.jButtonModificarToolBarTipoNivelEdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoNivelEdu,this.jTtoolBarDetalleTipoNivelEdu,
							"actualizar","actualizar","Actualizar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoNivelEdu,this.jTtoolBarDetalleTipoNivelEdu,
							"eliminar","eliminar","Eliminar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoNivelEdu,this.jTtoolBarDetalleTipoNivelEdu,
							"cancelar","cancelar","Cancelar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoNivelEdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoNivelEdu,this.jTtoolBarDetalleTipoNivelEdu,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoNivelEdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoNivelEdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoNivelEdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoNivelEdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoNivelEdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoNivelEdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoNivelEdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoNivelEdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoNivelEdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoNivelEdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoNivelEdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoNivelEdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoNivelEdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoNivelEdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoNivelEdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoNivelEdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoNivelEdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoNivelEdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoNivelEdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoNivelEdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoNivelEdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoNivelEdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoNivelEdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoNivelEdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoNivelEdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoNivelEdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoNivelEdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoNivelEdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoNivelEdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoNivelEdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoNivelEdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoNivelEdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoNivelEdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoNivelEdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoNivelEdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoNivelEdu.add(this.jMenuItemDetalleCerrarTipoNivelEdu);
		
		this.jmenuDetalleAccionesTipoNivelEdu.add(this.jMenuItemActualizarTipoNivelEdu);
		this.jmenuDetalleAccionesTipoNivelEdu.add(this.jMenuItemEliminarTipoNivelEdu);
		this.jmenuDetalleAccionesTipoNivelEdu.add(this.jMenuItemCancelarTipoNivelEdu);		
		
		//this.jmenuDetalleDatosTipoNivelEdu.add(this.jMenuItemDetalleAbrirOrderByTipoNivelEdu);				
		this.jmenuDetalleDatosTipoNivelEdu.add(this.jMenuItemDetalleMostarOcultarTipoNivelEdu);				
				
		//this.jmenuDetalleAccionesTipoNivelEdu.add(this.jMenuItemGuardarCambiosTipoNivelEdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoNivelEdu.add(this.jmenuDetalleArchivoTipoNivelEdu);		
		this.jmenuBarDetalleTipoNivelEdu.add(this.jmenuDetalleAccionesTipoNivelEdu);		
		this.jmenuBarDetalleTipoNivelEdu.add(this.jmenuDetalleDatosTipoNivelEdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoNivelEdu.add(this.jmenuDetalleTipoNivelEdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoNivelEdu);				
	}
	
	
	public void inicializarElementosCamposTipoNivelEdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoNivelEdu = new JLabelMe();
		jLabelIdTipoNivelEdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoNivelEdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoNivelEdu.setToolTipText(TipoNivelEduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoNivelEdu= new GridBagLayout();

		this.jPanelidTipoNivelEdu.setLayout(this.gridaBagLayoutTipoNivelEdu);

		jLabelidTipoNivelEdu = new JLabel();
		jLabelidTipoNivelEdu.setText("Id");

		jLabelidTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoNivelEdu = new JLabelMe();
		this.jLabelcodigoTipoNivelEdu.setText(""+TipoNivelEduConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoNivelEdu.setToolTipText("Codigo");
		this.jLabelcodigoTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoNivelEdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoNivelEdu.setToolTipText(TipoNivelEduConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoNivelEdu = new GridBagLayout();
		this.jPanelcodigoTipoNivelEdu.setLayout(this.gridaBagLayoutTipoNivelEdu);


		jTextFieldcodigoTipoNivelEdu= new JTextFieldMe();

		jTextFieldcodigoTipoNivelEdu.setEnabled(false);
		jTextFieldcodigoTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoNivelEduBusqueda= new JButtonMe();
		this.jButtoncodigoTipoNivelEduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoNivelEduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoNivelEduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoNivelEduBusqueda.setText("U");
		this.jButtoncodigoTipoNivelEduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoNivelEduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoNivelEduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoNivelEduBusqueda"));

		if(this.tiponiveleduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoNivelEduBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoNivelEdu = new JLabelMe();
		this.jLabelnombreTipoNivelEdu.setText(""+TipoNivelEduConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoNivelEdu.setToolTipText("Nombre");
		this.jLabelnombreTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoNivelEdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoNivelEdu.setToolTipText(TipoNivelEduConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoNivelEdu = new GridBagLayout();
		this.jPanelnombreTipoNivelEdu.setLayout(this.gridaBagLayoutTipoNivelEdu);


		jTextAreanombreTipoNivelEdu= new JTextAreaMe();
		jTextAreanombreTipoNivelEdu.setEnabled(false);
		jTextAreanombreTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNivelEdu.setLineWrap(true);
		jTextAreanombreTipoNivelEdu.setWrapStyleWord(true);
		jTextAreanombreTipoNivelEdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoNivelEdu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoNivelEdu = new JScrollPane(jTextAreanombreTipoNivelEdu);
		jscrollPanenombreTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoNivelEduBusqueda= new JButtonMe();
		this.jButtonnombreTipoNivelEduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoNivelEduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoNivelEduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoNivelEduBusqueda.setText("U");
		this.jButtonnombreTipoNivelEduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoNivelEduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoNivelEduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoNivelEduBusqueda"));

		if(this.tiponiveleduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoNivelEduBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoTipoNivelEdu = new JLabelMe();
		this.jLabeles_defectoTipoNivelEdu.setText(""+TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoTipoNivelEdu.setToolTipText("Es Defecto");
		this.jLabeles_defectoTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoTipoNivelEdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoTipoNivelEdu.setToolTipText(TipoNivelEduConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutTipoNivelEdu = new GridBagLayout();
		this.jPaneles_defectoTipoNivelEdu.setLayout(this.gridaBagLayoutTipoNivelEdu);


		jCheckBoxes_defectoTipoNivelEdu= new JCheckBoxMe();
		jCheckBoxes_defectoTipoNivelEdu.setEnabled(false);

		jCheckBoxes_defectoTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoTipoNivelEduBusqueda= new JButtonMe();
		this.jButtones_defectoTipoNivelEduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoTipoNivelEduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoTipoNivelEduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoTipoNivelEduBusqueda.setText("U");
		this.jButtones_defectoTipoNivelEduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoTipoNivelEduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoTipoNivelEduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoTipoNivelEduBusqueda"));

		if(this.tiponiveleduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoTipoNivelEduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoNivelEdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoNivelEdu = new JLabelMe();
		this.jLabelid_empresaTipoNivelEdu.setText(""+TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoNivelEdu.setToolTipText("Empresa");
		this.jLabelid_empresaTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoNivelEdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoNivelEdu.setToolTipText(TipoNivelEduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoNivelEdu = new GridBagLayout();
		this.jPanelid_empresaTipoNivelEdu.setLayout(this.gridaBagLayoutTipoNivelEdu);


		jComboBoxid_empresaTipoNivelEdu= new JComboBoxMe();
		jComboBoxid_empresaTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoNivelEdu.setEnabled(false);

		this.jButtonid_empresaTipoNivelEdu= new JButtonMe();
		this.jButtonid_empresaTipoNivelEdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoNivelEdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoNivelEdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoNivelEdu.setText("Buscar");
		this.jButtonid_empresaTipoNivelEdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoNivelEdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoNivelEdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoNivelEdu"));

		this.jButtonid_empresaTipoNivelEduBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoNivelEduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoNivelEduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoNivelEduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoNivelEduBusqueda.setText("U");
		this.jButtonid_empresaTipoNivelEduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoNivelEduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoNivelEduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoNivelEduBusqueda"));

		if(this.tiponiveleduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoNivelEduBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoNivelEduUpdate= new JButtonMe();
		this.jButtonid_empresaTipoNivelEduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoNivelEduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoNivelEduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoNivelEduUpdate.setText("U");
		this.jButtonid_empresaTipoNivelEduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoNivelEduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoNivelEduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoNivelEdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoNivelEdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoNivelEduUpdate"));



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
		//this.jInternalFrameDetalleTipoNivelEdu = new TipoNivelEduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Nivel Edu DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoNivelEdu= new GridBagLayout();
		

		
		String sToolTipTipoNivelEdu="";
		sToolTipTipoNivelEdu=TipoNivelEduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoNivelEdu+="(Cartera.TipoNivelEdu)";
		}
		
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoNivelEdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoNivelEdu = new JButtonMe();
		this.jButtonModificarTipoNivelEdu = new JButtonMe();
        this.jButtonActualizarTipoNivelEdu = new JButtonMe();
        this.jButtonEliminarTipoNivelEdu = new JButtonMe();
        this.jButtonCancelarTipoNivelEdu = new JButtonMe();
        this.jButtonGuardarCambiosTipoNivelEdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoNivelEdu = new JButtonMe();
		this.jButtonCerrarTipoNivelEdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoNivelEdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoNivelEdu = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoNivelEdu = new JScrollPane();
				
		
		
		this.jPanelCamposTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Nivel Edu";
		
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nivel Edus" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoNivelEdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoNivelEdu.setName("jPanelCamposTipoNivelEdu"); 

		this.jPanelCamposOcultosTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoNivelEdu.setName("jPanelCamposOcultosTipoNivelEdu"); 

        this.jPanelAccionesTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoNivelEdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoNivelEdu.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoNivelEdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoNivelEdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoNivelEdu.setText("Nuevo");
		this.jButtonModificarTipoNivelEdu.setText("Editar");
        this.jButtonActualizarTipoNivelEdu.setText("Actualizar");
        this.jButtonEliminarTipoNivelEdu.setText("Eliminar");
        this.jButtonCancelarTipoNivelEdu.setText("Cancelar");
        this.jButtonGuardarCambiosTipoNivelEdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoNivelEdu.setText("Guardar");
		this.jButtonCerrarTipoNivelEdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoNivelEdu,"nuevo_button","Nuevo",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoNivelEdu,"modificar_button","Editar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoNivelEdu,"actualizar_button","Actualizar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoNivelEdu,"eliminar_button","Eliminar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoNivelEdu,"cancelar_button","Cancelar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoNivelEdu,"guardarcambios_button","Guardar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoNivelEdu,"guardarcambiostabla_button","Guardar",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoNivelEdu,"cerrar_button","Salir",this.tiponiveleduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoNivelEdu.setToolTipText("Nuevo"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoNivelEdu.setToolTipText("Editar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoNivelEdu.setToolTipText("Actualizar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoNivelEdu.setToolTipText("Eliminar)"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoNivelEdu.setToolTipText("Cancelar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoNivelEdu.setToolTipText("Guardar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoNivelEdu.setToolTipText("Guardar"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoNivelEdu.setToolTipText("Salir"+" "+TipoNivelEduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoNivelEdu";
		inputMap = this.jButtonNuevoTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoNivelEdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoNivelEdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoNivelEdu";
		inputMap = this.jButtonActualizarTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoNivelEdu"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoNivelEdu";
		inputMap = this.jButtonEliminarTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoNivelEdu"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoNivelEdu";
		inputMap = this.jButtonCancelarTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoNivelEdu"));
		
		//CERRAR		
		sMapKey = "CerrarTipoNivelEdu";
		inputMap = this.jButtonCerrarTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoNivelEdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoNivelEdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoNivelEdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoNivelEdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoNivelEdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoNivelEdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoNivelEdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoNivelEdu.setToolTipText("Nuevo TipoNivelEdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoNivelEdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoNivelEdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoNivelEdu.setToolTipText("Sin Cerrar Ventana TipoNivelEdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoNivelEdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoNivelEdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoNivelEdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoNivelEdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoNivelEdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoNivelEdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoNivelEdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoNivelEdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoNivelEdu = new JLabelMe();
		
		this.jLabelAccionesTipoNivelEdu.setText("Acciones");		
		this.jLabelAccionesTipoNivelEdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNivelEdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNivelEdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoNivelEdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoNivelEdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoNivelEdu=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoNivelEdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoNivelEdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoNivelEdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNivelEdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNivelEdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoNivelEdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoNivelEdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoNivelEdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoNivelEdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoNivelEdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoNivelEdu = new GridBagLayout();
		
		this.jPanelCamposTipoNivelEdu.setLayout(gridaBagLayoutCamposTipoNivelEdu);
		this.jPanelCamposOcultosTipoNivelEdu.setLayout(gridaBagLayoutCamposOcultosTipoNivelEdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 0;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoNivelEdu.add(jLabelIdTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 1;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoNivelEdu.add(jLabelidTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);


	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 0;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoNivelEdu.add(jLabelid_empresaTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;
		this.gridBagConstraintsTipoNivelEdu.gridx = 2;
		this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
		this.gridBagConstraintsTipoNivelEdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoNivelEdu.add(jButtonid_empresaTipoNivelEduBusqueda, this.gridBagConstraintsTipoNivelEdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;
		this.gridBagConstraintsTipoNivelEdu.gridx = 3;
		this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
		this.gridBagConstraintsTipoNivelEdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoNivelEdu.add(jButtonid_empresaTipoNivelEduUpdate, this.gridBagConstraintsTipoNivelEdu);
	}

	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 1;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoNivelEdu.add(jComboBoxid_empresaTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);


	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 0;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoNivelEdu.add(jLabelcodigoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;
		this.gridBagConstraintsTipoNivelEdu.gridx = 2;
		this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
		this.gridBagConstraintsTipoNivelEdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoNivelEdu.add(jButtoncodigoTipoNivelEduBusqueda, this.gridBagConstraintsTipoNivelEdu);
	}

	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 1;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoNivelEdu.add(jTextFieldcodigoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);


	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 0;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoNivelEdu.add(jLabelnombreTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;
		this.gridBagConstraintsTipoNivelEdu.gridx = 2;
		this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
		this.gridBagConstraintsTipoNivelEdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoNivelEdu.add(jButtonnombreTipoNivelEduBusqueda, this.gridBagConstraintsTipoNivelEdu);
	}

	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 1;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoNivelEdu.add(jscrollPanenombreTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);


	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 0;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoTipoNivelEdu.add(jLabeles_defectoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;
		this.gridBagConstraintsTipoNivelEdu.gridx = 2;
		this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
		this.gridBagConstraintsTipoNivelEdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoTipoNivelEdu.add(jButtones_defectoTipoNivelEduBusqueda, this.gridBagConstraintsTipoNivelEdu);
	}

	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNivelEdu.gridy = 0;
	this.gridBagConstraintsTipoNivelEdu.gridx = 1;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoTipoNivelEdu.add(jCheckBoxes_defectoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNivelEdu.gridy = iYPanelCamposTipoNivelEdu;
	this.gridBagConstraintsTipoNivelEdu.gridx = iXPanelCamposTipoNivelEdu++;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNivelEdu.add(this.jPanelidTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(iXPanelCamposTipoNivelEdu % 1==0) {
		iXPanelCamposTipoNivelEdu=0;
		iYPanelCamposTipoNivelEdu++;
	}
	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNivelEdu.gridy = iYPanelCamposTipoNivelEdu;
	this.gridBagConstraintsTipoNivelEdu.gridx = iXPanelCamposTipoNivelEdu++;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNivelEdu.add(this.jPanelcodigoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(iXPanelCamposTipoNivelEdu % 1==0) {
		iXPanelCamposTipoNivelEdu=0;
		iYPanelCamposTipoNivelEdu++;
	}
	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNivelEdu.gridy = iYPanelCamposTipoNivelEdu;
	this.gridBagConstraintsTipoNivelEdu.gridx = iXPanelCamposTipoNivelEdu++;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNivelEdu.add(this.jPanelnombreTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(iXPanelCamposTipoNivelEdu % 1==0) {
		iXPanelCamposTipoNivelEdu=0;
		iYPanelCamposTipoNivelEdu++;
	}
	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNivelEdu.gridy = iYPanelCamposTipoNivelEdu;
	this.gridBagConstraintsTipoNivelEdu.gridx = iXPanelCamposTipoNivelEdu++;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNivelEdu.add(this.jPaneles_defectoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(iXPanelCamposTipoNivelEdu % 1==0) {
		iXPanelCamposTipoNivelEdu=0;
		iYPanelCamposTipoNivelEdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNivelEdu.gridy = iYPanelCamposOcultosTipoNivelEdu;
	this.gridBagConstraintsTipoNivelEdu.gridx = iXPanelCamposOcultosTipoNivelEdu++;
	this.gridBagConstraintsTipoNivelEdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNivelEdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoNivelEdu.add(this.jPanelid_empresaTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);



	if(iXPanelCamposOcultosTipoNivelEdu % 1==0) {
		iXPanelCamposOcultosTipoNivelEdu=0;
		iYPanelCamposOcultosTipoNivelEdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoNivelEdu= new GridBagLayout();
		this.jPanelAccionesTipoNivelEdu.setLayout(gridaBagLayoutAccionesTipoNivelEdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoNivelEdu= new GridBagLayout();
		this.jPanelAccionesFormularioTipoNivelEdu.setLayout(gridaBagLayoutAccionesFormularioTipoNivelEdu);
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoNivelEdu.add(this.jComboBoxTiposAccionesFormularioTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);

		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoNivelEdu.add(this.jCheckBoxPostAccionNuevoTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoNivelEdu.add(this.jCheckBoxPostAccionSinCerrarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiponiveleduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiponiveleduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoNivelEdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoNivelEdu.add(this.jCheckBoxPostAccionSinMensajeTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoNivelEdu.add(this.jButtonModificarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);							

		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;
		this.gridBagConstraintsTipoNivelEdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoNivelEdu.add(this.jButtonEliminarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
			
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoNivelEdu.add(this.jButtonActualizarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);


		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;		
		this.gridBagConstraintsTipoNivelEdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoNivelEdu.add(this.jButtonGuardarCambiosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);	
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = 0;		
		this.gridBagConstraintsTipoNivelEdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoNivelEdu.add(this.jButtonCancelarTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoNivelEdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoNivelEdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiponiveleduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoNivelEdu.gridx = 0;		
			//this.gridBagConstraintsTipoNivelEdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoNivelEdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoNivelEdu.gridx =0;
		this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoNivelEdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoNivelEduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoNivelEdu = new TipoNivelEduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Nivel Edu DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Nivel Edu DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Nivel Edu Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoNivelEduModel tiponiveleduModel=new TipoNivelEduModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoNivelEduModel.TipoNivelEduFocusTraversalPolicy tiponiveleduFocusTraversalPolicy = tiponiveleduModel.new TipoNivelEduFocusTraversalPolicy(this);
			
			//tiponiveleduFocusTraversalPolicy.settiponiveleduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiponiveleduModel);
			
			
			this.jContentPaneDetalleTipoNivelEdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoNivelEdu = new GridBagLayout();	
			this.jContentPaneDetalleTipoNivelEdu.setLayout(gridaBagLayoutDetalleTipoNivelEdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoNivelEdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
				this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoNivelEdu.gridx = 0;
					
				
				this.jContentPaneDetalleTipoNivelEdu.add(jTtoolBarDetalleTipoNivelEdu, gridBagConstraintsTipoNivelEdu);								
				
}
			
			this.jScrollPanelDatosEdicionTipoNivelEdu=   new JScrollPane(jContentPaneDetalleTipoNivelEdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoNivelEdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNivelEdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNivelEdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoNivelEdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoNivelEdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNivelEdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNivelEdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoNivelEdu.gridx = 0;
	        
			this.jContentPaneDetalleTipoNivelEdu.add(jPanelCamposTipoNivelEdu, gridBagConstraintsTipoNivelEdu);
			
			
			
			
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
						&& tiponiveleduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(this.puedeCargarPorParteSubCliente,false,-1);
					
					if(this.tiponiveleduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoNivelEdu= new GridBagConstraints();
						this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoNivelEdu.gridx = 0;
						this.jContentPaneDetalleTipoNivelEdu.add(this.jTabbedPaneRelacionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoNivelEdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoNivelEdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
					this.gridBagConstraintsTipoNivelEdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoNivelEdu.gridx = 0;
					
				
					this.jContentPaneDetalleTipoNivelEdu.add(jPanelCamposOcultosTipoNivelEdu, gridBagConstraintsTipoNivelEdu);
				
					this.jPanelCamposOcultosTipoNivelEdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsTipoNivelEdu.gridx = 0;
	        this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoNivelEdu.add(this.jPanelAccionesFormularioTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);							
			
			
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
	        this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsTipoNivelEdu.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoNivelEdu.add(this.jPanelAccionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoNivelEdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoNivelEdu=   new JScrollPane(this.jPanelCamposTipoNivelEdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoNivelEdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNivelEdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNivelEdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoNivelEdu.gridx = 0;
			this.gridBagConstraintsTipoNivelEdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoNivelEdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoNivelEdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoNivelEdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);			
			
			this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
			this.gridBagConstraintsTipoNivelEdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoNivelEdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
			
			
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		
			
		this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
		this.gridBagConstraintsTipoNivelEdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoNivelEdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoNivelEdu, this.gridBagConstraintsTipoNivelEdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoNivelEdu;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoNivelEdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoNivelEdu.gridx = 0;
				//this.jContentPaneDetalleTipoNivelEdu.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoNivelEdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoNivelEdu.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoNivelEdu.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesTipoNivelEdu.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoNivelEdu.gridx = 0;
				//this.jContentPaneDetalleTipoNivelEdu.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoNivelEdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoNivelEdu.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoNivelEdu.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesTipoNivelEdu.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subclienteSessionBean=new SubClienteSessionBean();
		this.subclienteSessionBean.setConGuardarRelaciones(false);
		this.subclienteSessionBean.setEsGuardarRelacionado(true);

		this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {

				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoNivelEduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subclienteSessionBean.setEsGuardarRelacionado(true);

				this.subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subclienteBeanSwingJInternalFrame.setsubclienteSessionBean(this.subclienteSessionBean);

				//this.gridBagConstraintsTipoNivelEdu = new GridBagConstraints();
				//this.gridBagConstraintsTipoNivelEdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoNivelEdu.gridx = 0;
				//this.jContentPaneDetalleTipoNivelEdu.add(this.subclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoNivelEdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoNivelEdu.add("Sub Clientes",this.subclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoNivelEdu.setComponentAt(iIndexTab,this.subclienteBeanSwingJInternalFrame.getContentPane());
				}

				//SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subclienteSessionBean.setEsGuardarRelacionado(false);
				this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubCliente) {
					this.jTabbedPaneRelacionesTipoNivelEdu.add("Sub Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<TipoNivelEdu> tiponiveledus,TipoNivelEdu tiponiveledu,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tiponiveleduLogic.getConnexion());

					clienteBeanSwingJInternalFrame.settiponiveledusForeignKey(tiponiveledus);
					clienteBeanSwingJInternalFrame.settiponiveleduForeignKey(tiponiveledu);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoNivelEdu(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidTipoNivelEduActual(tiponiveledu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoNivelEdu(true);
					clienteBeanSwingJInternalFrame.setid_tipo_nivel_eduFK_IdTipoNivelEdu(tiponiveledu.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoNivelEduForeignKey(tiponiveledu,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoNivelEdu");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoNivelEdu");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubClienteBeanSwingJInternalFrame(List<TipoNivelEdu> tiponiveledus,TipoNivelEdu tiponiveledu,SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subclienteBeanSwingJInternalFrame.getSubClienteLogic().setConnexion(this.tiponiveleduLogic.getConnexion());

					subclienteBeanSwingJInternalFrame.settiponiveledusForeignKey(tiponiveledus);
					subclienteBeanSwingJInternalFrame.settiponiveleduForeignKey(tiponiveledu);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoNivelEdu(true);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setlidTipoNivelEduActual(tiponiveledu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subclienteBeanSwingJInternalFrame.cargarCombosForeignKeySubCliente(subclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					subclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoNivelEdu(true);
					subclienteBeanSwingJInternalFrame.setid_tipo_nivel_eduFK_IdTipoNivelEdu(tiponiveledu.getId());

					if(!this.conCargarFormDetalle) {
						subclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoNivelEduForeignKey(tiponiveledu,1,false,true,true);
					subclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoNivelEdu");
					subclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoNivelEdu");
					subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(true);
					subclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubCliente("n",subclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, subclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					subclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("relacionado");
					} else {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");
					}

					subclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionSubCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<TipoNivelEdu> tiponiveledus,TipoNivelEdu tiponiveledu,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.tiponiveleduLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.settiponiveledusForeignKey(tiponiveledus);
					parametrocarteradefectoBeanSwingJInternalFrame.settiponiveleduForeignKey(tiponiveledu);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoNivelEdu(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidTipoNivelEduActual(tiponiveledu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoNivelEdu(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_tipo_nivel_eduFK_IdTipoNivelEdu(tiponiveledu.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoNivelEduForeignKey(tiponiveledu,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoNivelEdu");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoNivelEdu");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

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
