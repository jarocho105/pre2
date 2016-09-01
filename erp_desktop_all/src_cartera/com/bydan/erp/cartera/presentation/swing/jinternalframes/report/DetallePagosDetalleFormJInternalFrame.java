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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.DetallePagosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class DetallePagosDetalleFormJInternalFrame extends DetallePagosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePagos;
	
	protected JMenuBar jmenuBarDetalleDetallePagos;
	
	protected JMenu jmenuDetalleDetallePagos;
	protected JMenu jmenuDetalleArchivoDetallePagos;
	protected JMenu jmenuDetalleAccionesDetallePagos;
	protected JMenu jmenuDetalleDatosDetallePagos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePagos;	
	protected GridBagConstraints gridBagConstraintsDetallePagos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePagosBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePagos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public DetallePagosSessionBean detallepagosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public ZonaSessionBean zonaSessionBean;	
	
	public DetallePagosLogic detallepagosLogic;
	
	public JScrollPane jScrollPanelDatosDetallePagos;
	public JScrollPane jScrollPanelDatosEdicionDetallePagos;
	public JScrollPane jScrollPanelDatosGeneralDetallePagos;
	
	protected JPanel jPanelCamposDetallePagos;    
	protected JPanel jPanelCamposOcultosDetallePagos;    	
	protected JPanel jPanelAccionesDetallePagos;
	protected JPanel jPanelAccionesFormularioDetallePagos;
    
	
	
	protected Integer iXPanelCamposDetallePagos=0;
	protected Integer iYPanelCamposDetallePagos=0;
	
	protected Integer iXPanelCamposOcultosDetallePagos=0;
	protected Integer iYPanelCamposOcultosDetallePagos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePagos;
	public JButton jButtonModificarDetallePagos;
	public JButton jButtonActualizarDetallePagos;
    public JButton jButtonEliminarDetallePagos;
	public JButton jButtonCancelarDetallePagos;
    public JButton jButtonGuardarCambiosDetallePagos;
	public JButton jButtonGuardarCambiosTablaDetallePagos;
	protected JButton jButtonCerrarDetallePagos;
	
	
	protected JButton jButtonProcesarInformacionDetallePagos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePagos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePagos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePagos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePagos;
	protected JButton jButtonModificarToolBarDetallePagos;
	protected JButton jButtonActualizarToolBarDetallePagos;
    protected JButton jButtonEliminarToolBarDetallePagos;
	protected JButton jButtonCancelarToolBarDetallePagos;
    protected JButton jButtonGuardarCambiosToolBarDetallePagos;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePagos;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePagos;
	protected JButton jButtonCerrarToolBarDetallePagos;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePagos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePagos;
	protected JMenuItem jMenuItemModificarDetallePagos;
	protected JMenuItem jMenuItemActualizarDetallePagos;
    protected JMenuItem jMenuItemEliminarDetallePagos;
	protected JMenuItem jMenuItemCancelarDetallePagos;
    protected JMenuItem jMenuItemGuardarCambiosDetallePagos;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePagos;
	protected JMenuItem jMenuItemCerrarDetallePagos;
	protected JMenuItem jMenuItemDetalleCerrarDetallePagos;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePagos;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePagos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePagos;
	protected JMenuItem jMenuItemMostrarOcultarDetallePagos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePagos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePagos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePagos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePagos;
	public JLabel jLabelIdDetallePagos;
	public JLabel jLabelidDetallePagos;
	public JButton jButtonidDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeDetallePagos;
	public JLabel jLabelfecha_emision_desdeDetallePagos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeDetallePagos;

	public JDateChooser jDateChooserfecha_emision_desdeDetallePagos;
	public JButton jButtonfecha_emision_desdeDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaDetallePagos;
	public JLabel jLabelfecha_emision_hastaDetallePagos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaDetallePagos;

	public JDateChooser jDateChooserfecha_emision_hastaDetallePagos;
	public JButton jButtonfecha_emision_hastaDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDetallePagos;
	public JLabel jLabelcodigoDetallePagos;
	public JTextField jTextFieldcodigoDetallePagos;
	public JButton jButtoncodigoDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteDetallePagos;
	public JLabel jLabelnombre_clienteDetallePagos;
	public JTextArea jTextAreanombre_clienteDetallePagos;
	public JScrollPane jscrollPanenombre_clienteDetallePagos;
	public JButton jButtonnombre_clienteDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelrucDetallePagos;
	public JLabel jLabelrucDetallePagos;
	public JTextField jTextFieldrucDetallePagos;
	public JButton jButtonrucDetallePagosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_facturasDetallePagos;
	public JLabel jLabeltotal_facturasDetallePagos;
	public JTextField jTextFieldtotal_facturasDetallePagos;
	public JButton jButtontotal_facturasDetallePagosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_abonosDetallePagos;
	public JLabel jLabeltotal_abonosDetallePagos;
	public JTextField jTextFieldtotal_abonosDetallePagos;
	public JButton jButtontotal_abonosDetallePagosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_facturas_actualDetallePagos;
	public JLabel jLabeltotal_facturas_actualDetallePagos;
	public JTextField jTextFieldtotal_facturas_actualDetallePagos;
	public JButton jButtontotal_facturas_actualDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelabonos_anteriorDetallePagos;
	public JLabel jLabelabonos_anteriorDetallePagos;
	public JTextField jTextFieldabonos_anteriorDetallePagos;
	public JButton jButtonabonos_anteriorDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelabonos_actualDetallePagos;
	public JLabel jLabelabonos_actualDetallePagos;
	public JTextField jTextFieldabonos_actualDetallePagos;
	public JButton jButtonabonos_actualDetallePagosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetallePagos;
	public JLabel jLabelid_empresaDetallePagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePagos;
	public JButton jButtonid_empresaDetallePagos= new JButtonMe();
	public JButton jButtonid_empresaDetallePagosUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteDetallePagos;
	public JLabel jLabelid_grupo_clienteDetallePagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteDetallePagos;
	public JButton jButtonid_grupo_clienteDetallePagos= new JButtonMe();
	public JButton jButtonid_grupo_clienteDetallePagosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteDetallePagosBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaDetallePagos;
	public JLabel jLabelid_zonaDetallePagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaDetallePagos;
	public JButton jButtonid_zonaDetallePagos= new JButtonMe();
	public JButton jButtonid_zonaDetallePagosUpdate= new JButtonMe();
	public JButton jButtonid_zonaDetallePagosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePagos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePagosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePagos=new JPanel();
				this.jPanelAccionesFormularioDetallePagos=new JPanel();
				this.jmenuBarDetalleDetallePagos=new JMenuBar();
				this.jTtoolBarDetalleDetallePagos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePagosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePagos() {
		return this.jButtonActualizarToolBarDetallePagos;
	}
	
	public JButton getjButtonEliminarToolBarDetallePagos() {
		return this.jButtonEliminarToolBarDetallePagos;
	}
	
	public JButton getjButtonCancelarToolBarDetallePagos() {
		return this.jButtonCancelarToolBarDetallePagos;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePagos() {
		return this.jButtonProcesarInformacionDetallePagos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePagos)	{
		this.jButtonProcesarInformacionDetallePagos = jButtonProcesarInformacionDetallePagos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePagos() {
		return this.jComboBoxTiposAccionesDetallePagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePagos(
			JComboBox jComboBoxTiposRelacionesDetallePagos) {
		this.jComboBoxTiposRelacionesDetallePagos = jComboBoxTiposRelacionesDetallePagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePagos(
			JComboBox jComboBoxTiposAccionesDetallePagos) {
		this.jComboBoxTiposAccionesDetallePagos = jComboBoxTiposAccionesDetallePagos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePagos() {
		return this.jComboBoxTiposAccionesFormularioDetallePagos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePagos(
			JComboBox jComboBoxTiposAccionesFormularioDetallePagos) {
		this.jComboBoxTiposAccionesFormularioDetallePagos = jComboBoxTiposAccionesFormularioDetallePagos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallepagosSessionBean=new DetallePagosSessionBean();
		
		this.detallepagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepagosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePagosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePagosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pagos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePagosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePagos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePagos=new JButtonMe();
				this.jButtonModificarToolBarDetallePagos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePagos,this.jTtoolBarDetalleDetallePagos,
							"actualizar","actualizar","Actualizar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePagos,this.jTtoolBarDetalleDetallePagos,
							"eliminar","eliminar","Eliminar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePagos,this.jTtoolBarDetalleDetallePagos,
							"cancelar","cancelar","Cancelar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePagos,this.jTtoolBarDetalleDetallePagos,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePagos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePagos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePagos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePagos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePagos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePagos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePagos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePagos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePagos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePagos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePagos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePagos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePagos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePagos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePagos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePagos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePagos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePagos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePagos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePagos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePagos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePagos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePagos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePagos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePagos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePagos.add(this.jMenuItemDetalleCerrarDetallePagos);
		
		this.jmenuDetalleAccionesDetallePagos.add(this.jMenuItemActualizarDetallePagos);
		this.jmenuDetalleAccionesDetallePagos.add(this.jMenuItemEliminarDetallePagos);
		this.jmenuDetalleAccionesDetallePagos.add(this.jMenuItemCancelarDetallePagos);		
		
		//this.jmenuDetalleDatosDetallePagos.add(this.jMenuItemDetalleAbrirOrderByDetallePagos);				
		this.jmenuDetalleDatosDetallePagos.add(this.jMenuItemDetalleMostarOcultarDetallePagos);				
				
		//this.jmenuDetalleAccionesDetallePagos.add(this.jMenuItemGuardarCambiosDetallePagos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePagos.add(this.jmenuDetalleArchivoDetallePagos);		
		this.jmenuBarDetalleDetallePagos.add(this.jmenuDetalleAccionesDetallePagos);		
		this.jmenuBarDetalleDetallePagos.add(this.jmenuDetalleDatosDetallePagos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePagos);				
	}
	
	
	public void inicializarElementosCamposDetallePagos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePagos = new JLabelMe();
		jLabelIdDetallePagos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePagos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePagos= new GridBagLayout();

		this.jPanelidDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);

		jLabelidDetallePagos = new JLabel();
		jLabelidDetallePagos.setText("Id");

		jLabelidDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeDetallePagos = new JLabelMe();
		this.jLabelfecha_emision_desdeDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeDetallePagos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelfecha_emision_desdeDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		//jFormattedTextFieldfecha_emision_desdeDetallePagos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeDetallePagos= new JDateChooser();
		jDateChooserfecha_emision_desdeDetallePagos.setEnabled(false);
		jDateChooserfecha_emision_desdeDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeDetallePagos.setDate(new Date());
		jDateChooserfecha_emision_desdeDetallePagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeDetallePagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeDetallePagosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeDetallePagosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaDetallePagos = new JLabelMe();
		this.jLabelfecha_emision_hastaDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaDetallePagos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelfecha_emision_hastaDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		//jFormattedTextFieldfecha_emision_hastaDetallePagos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaDetallePagos= new JDateChooser();
		jDateChooserfecha_emision_hastaDetallePagos.setEnabled(false);
		jDateChooserfecha_emision_hastaDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaDetallePagos.setDate(new Date());
		jDateChooserfecha_emision_hastaDetallePagos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaDetallePagos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaDetallePagosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaDetallePagosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoDetallePagos = new JLabelMe();
		this.jLabelcodigoDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDetallePagos.setToolTipText("Codigo");
		this.jLabelcodigoDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelcodigoDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jTextFieldcodigoDetallePagos= new JTextFieldMe();

		jTextFieldcodigoDetallePagos.setEnabled(false);
		jTextFieldcodigoDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoDetallePagosBusqueda= new JButtonMe();
		this.jButtoncodigoDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDetallePagosBusqueda.setText("U");
		this.jButtoncodigoDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteDetallePagos = new JLabelMe();
		this.jLabelnombre_clienteDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteDetallePagos.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelnombre_clienteDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jTextAreanombre_clienteDetallePagos= new JTextAreaMe();
		jTextAreanombre_clienteDetallePagos.setEnabled(false);
		jTextAreanombre_clienteDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteDetallePagos.setLineWrap(true);
		jTextAreanombre_clienteDetallePagos.setWrapStyleWord(true);
		jTextAreanombre_clienteDetallePagos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteDetallePagos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteDetallePagos = new JScrollPane(jTextAreanombre_clienteDetallePagos);
		jscrollPanenombre_clienteDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteDetallePagosBusqueda= new JButtonMe();
		this.jButtonnombre_clienteDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteDetallePagosBusqueda.setText("U");
		this.jButtonnombre_clienteDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabelrucDetallePagos = new JLabelMe();
		this.jLabelrucDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucDetallePagos.setToolTipText("Ruc");
		this.jLabelrucDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelrucDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jTextFieldrucDetallePagos= new JTextFieldMe();

		jTextFieldrucDetallePagos.setEnabled(false);
		jTextFieldrucDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucDetallePagosBusqueda= new JButtonMe();
		this.jButtonrucDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucDetallePagosBusqueda.setText("U");
		this.jButtonrucDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_facturasDetallePagos = new JLabelMe();
		this.jLabeltotal_facturasDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS+" : *");
		this.jLabeltotal_facturasDetallePagos.setToolTipText("Total Facturas");
		this.jLabeltotal_facturasDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_facturasDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_facturasDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_facturasDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_facturasDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_facturasDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPaneltotal_facturasDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jTextFieldtotal_facturasDetallePagos= new JTextFieldMe();
		jTextFieldtotal_facturasDetallePagos.setEnabled(false);
		jTextFieldtotal_facturasDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturasDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturasDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_facturasDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_facturasDetallePagos.setText("0.0");

		this.jButtontotal_facturasDetallePagosBusqueda= new JButtonMe();
		this.jButtontotal_facturasDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturasDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturasDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_facturasDetallePagosBusqueda.setText("U");
		this.jButtontotal_facturasDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_facturasDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_facturasDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_facturasDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_facturasDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_facturasDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_facturasDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_abonosDetallePagos = new JLabelMe();
		this.jLabeltotal_abonosDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_TOTALABONOS+" : *");
		this.jLabeltotal_abonosDetallePagos.setToolTipText("Total Abonos");
		this.jLabeltotal_abonosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_abonosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_abonosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_abonosDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_abonosDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_abonosDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_TOTALABONOS);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPaneltotal_abonosDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jTextFieldtotal_abonosDetallePagos= new JTextFieldMe();
		jTextFieldtotal_abonosDetallePagos.setEnabled(false);
		jTextFieldtotal_abonosDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_abonosDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_abonosDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_abonosDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_abonosDetallePagos.setText("0.0");

		this.jButtontotal_abonosDetallePagosBusqueda= new JButtonMe();
		this.jButtontotal_abonosDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_abonosDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_abonosDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_abonosDetallePagosBusqueda.setText("U");
		this.jButtontotal_abonosDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_abonosDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_abonosDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_abonosDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_abonosDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_abonosDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_abonosDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_facturas_actualDetallePagos = new JLabelMe();
		this.jLabeltotal_facturas_actualDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL+" : *");
		this.jLabeltotal_facturas_actualDetallePagos.setToolTipText("Total Facturas Actual");
		this.jLabeltotal_facturas_actualDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_facturas_actualDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_facturas_actualDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_facturas_actualDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_facturas_actualDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_facturas_actualDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPaneltotal_facturas_actualDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jTextFieldtotal_facturas_actualDetallePagos= new JTextFieldMe();
		jTextFieldtotal_facturas_actualDetallePagos.setEnabled(false);
		jTextFieldtotal_facturas_actualDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturas_actualDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_facturas_actualDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_facturas_actualDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_facturas_actualDetallePagos.setText("0.0");

		this.jButtontotal_facturas_actualDetallePagosBusqueda= new JButtonMe();
		this.jButtontotal_facturas_actualDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturas_actualDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_facturas_actualDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_facturas_actualDetallePagosBusqueda.setText("U");
		this.jButtontotal_facturas_actualDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_facturas_actualDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_facturas_actualDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_facturas_actualDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_facturas_actualDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_facturas_actualDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_facturas_actualDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabelabonos_anteriorDetallePagos = new JLabelMe();
		this.jLabelabonos_anteriorDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR+" : *");
		this.jLabelabonos_anteriorDetallePagos.setToolTipText("Abonos Anterior");
		this.jLabelabonos_anteriorDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelabonos_anteriorDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelabonos_anteriorDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelabonos_anteriorDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelabonos_anteriorDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelabonos_anteriorDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelabonos_anteriorDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jTextFieldabonos_anteriorDetallePagos= new JTextFieldMe();
		jTextFieldabonos_anteriorDetallePagos.setEnabled(false);
		jTextFieldabonos_anteriorDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabonos_anteriorDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabonos_anteriorDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldabonos_anteriorDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldabonos_anteriorDetallePagos.setText("0.0");

		this.jButtonabonos_anteriorDetallePagosBusqueda= new JButtonMe();
		this.jButtonabonos_anteriorDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabonos_anteriorDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabonos_anteriorDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonabonos_anteriorDetallePagosBusqueda.setText("U");
		this.jButtonabonos_anteriorDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonabonos_anteriorDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonabonos_anteriorDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldabonos_anteriorDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldabonos_anteriorDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"abonos_anteriorDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonabonos_anteriorDetallePagosBusqueda.setVisible(false);		}


					
		this.jLabelabonos_actualDetallePagos = new JLabelMe();
		this.jLabelabonos_actualDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL+" : *");
		this.jLabelabonos_actualDetallePagos.setToolTipText("Abonos Actual");
		this.jLabelabonos_actualDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelabonos_actualDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelabonos_actualDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelabonos_actualDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelabonos_actualDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelabonos_actualDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelabonos_actualDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jTextFieldabonos_actualDetallePagos= new JTextFieldMe();
		jTextFieldabonos_actualDetallePagos.setEnabled(false);
		jTextFieldabonos_actualDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabonos_actualDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabonos_actualDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldabonos_actualDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldabonos_actualDetallePagos.setText("0.0");

		this.jButtonabonos_actualDetallePagosBusqueda= new JButtonMe();
		this.jButtonabonos_actualDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabonos_actualDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabonos_actualDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonabonos_actualDetallePagosBusqueda.setText("U");
		this.jButtonabonos_actualDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonabonos_actualDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonabonos_actualDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldabonos_actualDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldabonos_actualDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"abonos_actualDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonabonos_actualDetallePagosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePagos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetallePagos = new JLabelMe();
		this.jLabelid_empresaDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePagos.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelid_empresaDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jComboBoxid_empresaDetallePagos= new JComboBoxMe();
		jComboBoxid_empresaDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePagos.setEnabled(false);

		this.jButtonid_empresaDetallePagos= new JButtonMe();
		this.jButtonid_empresaDetallePagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePagos.setText("Buscar");
		this.jButtonid_empresaDetallePagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePagos"));

		this.jButtonid_empresaDetallePagosBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePagosBusqueda.setText("U");
		this.jButtonid_empresaDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePagosBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePagosUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePagosUpdate.setText("U");
		this.jButtonid_empresaDetallePagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePagosUpdate"));



					
		this.jLabelid_grupo_clienteDetallePagos = new JLabelMe();
		this.jLabelid_grupo_clienteDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteDetallePagos.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelid_grupo_clienteDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jComboBoxid_grupo_clienteDetallePagos= new JComboBoxMe();
		jComboBoxid_grupo_clienteDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteDetallePagos= new JButtonMe();
		this.jButtonid_grupo_clienteDetallePagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteDetallePagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteDetallePagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteDetallePagos.setText("Buscar");
		this.jButtonid_grupo_clienteDetallePagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteDetallePagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteDetallePagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteDetallePagos"));

		this.jButtonid_grupo_clienteDetallePagosBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteDetallePagosBusqueda.setText("U");
		this.jButtonid_grupo_clienteDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteDetallePagosBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteDetallePagosUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteDetallePagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteDetallePagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteDetallePagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteDetallePagosUpdate.setText("U");
		this.jButtonid_grupo_clienteDetallePagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteDetallePagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteDetallePagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteDetallePagosUpdate"));



					
		this.jLabelid_zonaDetallePagos = new JLabelMe();
		this.jLabelid_zonaDetallePagos.setText(""+DetallePagosConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaDetallePagos.setToolTipText("Zona");
		this.jLabelid_zonaDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaDetallePagos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaDetallePagos.setToolTipText(DetallePagosConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutDetallePagos = new GridBagLayout();
		this.jPanelid_zonaDetallePagos.setLayout(this.gridaBagLayoutDetallePagos);


		jComboBoxid_zonaDetallePagos= new JComboBoxMe();
		jComboBoxid_zonaDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaDetallePagos= new JButtonMe();
		this.jButtonid_zonaDetallePagos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaDetallePagos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaDetallePagos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaDetallePagos.setText("Buscar");
		this.jButtonid_zonaDetallePagos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaDetallePagos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaDetallePagos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaDetallePagos"));

		this.jButtonid_zonaDetallePagosBusqueda= new JButtonMe();
		this.jButtonid_zonaDetallePagosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaDetallePagosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaDetallePagosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaDetallePagosBusqueda.setText("U");
		this.jButtonid_zonaDetallePagosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaDetallePagosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaDetallePagosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaDetallePagosBusqueda"));

		if(this.detallepagosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaDetallePagosBusqueda.setVisible(false);		}

		this.jButtonid_zonaDetallePagosUpdate= new JButtonMe();
		this.jButtonid_zonaDetallePagosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaDetallePagosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaDetallePagosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaDetallePagosUpdate.setText("U");
		this.jButtonid_zonaDetallePagosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaDetallePagosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaDetallePagosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaDetallePagosUpdate"));



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
		//this.jInternalFrameDetalleDetallePagos = new DetallePagosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Pagos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePagos= new GridBagLayout();
		

		
		String sToolTipDetallePagos="";
		sToolTipDetallePagos=DetallePagosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePagos+="(Cartera.DetallePagos)";
		}
		
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePagos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePagos = new JButtonMe();
		this.jButtonModificarDetallePagos = new JButtonMe();
        this.jButtonActualizarDetallePagos = new JButtonMe();
        this.jButtonEliminarDetallePagos = new JButtonMe();
        this.jButtonCancelarDetallePagos = new JButtonMe();
        this.jButtonGuardarCambiosDetallePagos = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePagos = new JButtonMe();
		this.jButtonCerrarDetallePagos = new JButtonMe();
		
		this.jScrollPanelDatosDetallePagos = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePagos = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePagos = new JScrollPane();
				
		
		
		this.jPanelCamposDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pagos";
		
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagoses" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePagos.setName("jPanelCamposDetallePagos"); 

		this.jPanelCamposOcultosDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePagos.setName("jPanelCamposOcultosDetallePagos"); 

        this.jPanelAccionesDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePagos.setToolTipText("Acciones");
        this.jPanelAccionesDetallePagos.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePagos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePagos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePagos.setText("Nuevo");
		this.jButtonModificarDetallePagos.setText("Editar");
        this.jButtonActualizarDetallePagos.setText("Actualizar");
        this.jButtonEliminarDetallePagos.setText("Eliminar");
        this.jButtonCancelarDetallePagos.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePagos.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePagos.setText("Guardar");
		this.jButtonCerrarDetallePagos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePagos,"nuevo_button","Nuevo",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePagos,"modificar_button","Editar",this.detallepagosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePagos,"actualizar_button","Actualizar",this.detallepagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePagos,"eliminar_button","Eliminar",this.detallepagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePagos,"cancelar_button","Cancelar",this.detallepagosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePagos,"guardarcambios_button","Guardar",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePagos,"guardarcambiostabla_button","Guardar",this.detallepagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePagos,"cerrar_button","Salir",this.detallepagosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePagos.setToolTipText("Nuevo"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePagos.setToolTipText("Editar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePagos.setToolTipText("Actualizar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePagos.setToolTipText("Eliminar)"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePagos.setToolTipText("Cancelar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePagos.setToolTipText("Guardar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePagos.setToolTipText("Guardar"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePagos.setToolTipText("Salir"+" "+DetallePagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePagos";
		inputMap = this.jButtonNuevoDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePagos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePagos";
		inputMap = this.jButtonActualizarDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePagos"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePagos";
		inputMap = this.jButtonEliminarDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePagos"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePagos";
		inputMap = this.jButtonCancelarDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePagos"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePagos";
		inputMap = this.jButtonCerrarDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePagos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePagos";
		inputMap = this.jButtonGuardarCambiosTablaDetallePagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePagos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePagos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePagos.setToolTipText("Nuevo DetallePagos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePagos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePagos.setToolTipText("Sin Cerrar Ventana DetallePagos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePagos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePagos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePagos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePagos.setText("Accion");
		this.jComboBoxTiposAccionesDetallePagos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePagos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePagos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePagos = new JLabelMe();
		
		this.jLabelAccionesDetallePagos.setText("Acciones");		
		this.jLabelAccionesDetallePagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePagos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePagos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePagos=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePagos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePagos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePagos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePagos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePagos = new GridBagLayout();
		
		this.jPanelCamposDetallePagos.setLayout(gridaBagLayoutCamposDetallePagos);
		this.jPanelCamposOcultosDetallePagos.setLayout(gridaBagLayoutCamposOcultosDetallePagos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallePagos.add(jLabelIdDetallePagos, this.gridBagConstraintsDetallePagos);



	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallePagos.add(jLabelidDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallePagos.add(jLabelid_empresaDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePagos.add(jButtonid_empresaDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 3;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePagos.add(jButtonid_empresaDetallePagosUpdate, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallePagos.add(jComboBoxid_empresaDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteDetallePagos.add(jLabelid_grupo_clienteDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteDetallePagos.add(jButtonid_grupo_clienteDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 3;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteDetallePagos.add(jButtonid_grupo_clienteDetallePagosUpdate, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteDetallePagos.add(jComboBoxid_grupo_clienteDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaDetallePagos.add(jLabelid_zonaDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaDetallePagos.add(jButtonid_zonaDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 3;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaDetallePagos.add(jButtonid_zonaDetallePagosUpdate, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaDetallePagos.add(jComboBoxid_zonaDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeDetallePagos.add(jLabelfecha_emision_desdeDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeDetallePagos.add(jButtonfecha_emision_desdeDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeDetallePagos.add(jDateChooserfecha_emision_desdeDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaDetallePagos.add(jLabelfecha_emision_hastaDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaDetallePagos.add(jButtonfecha_emision_hastaDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaDetallePagos.add(jDateChooserfecha_emision_hastaDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDetallePagos.add(jLabelcodigoDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDetallePagos.add(jButtoncodigoDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDetallePagos.add(jTextFieldcodigoDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteDetallePagos.add(jLabelnombre_clienteDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteDetallePagos.add(jButtonnombre_clienteDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteDetallePagos.add(jscrollPanenombre_clienteDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucDetallePagos.add(jLabelrucDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucDetallePagos.add(jButtonrucDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucDetallePagos.add(jTextFieldrucDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_facturasDetallePagos.add(jLabeltotal_facturasDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_facturasDetallePagos.add(jButtontotal_facturasDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_facturasDetallePagos.add(jTextFieldtotal_facturasDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_abonosDetallePagos.add(jLabeltotal_abonosDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_abonosDetallePagos.add(jButtontotal_abonosDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_abonosDetallePagos.add(jTextFieldtotal_abonosDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_facturas_actualDetallePagos.add(jLabeltotal_facturas_actualDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_facturas_actualDetallePagos.add(jButtontotal_facturas_actualDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_facturas_actualDetallePagos.add(jTextFieldtotal_facturas_actualDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelabonos_anteriorDetallePagos.add(jLabelabonos_anteriorDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelabonos_anteriorDetallePagos.add(jButtonabonos_anteriorDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelabonos_anteriorDetallePagos.add(jTextFieldabonos_anteriorDetallePagos, this.gridBagConstraintsDetallePagos);


	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 0;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelabonos_actualDetallePagos.add(jLabelabonos_actualDetallePagos, this.gridBagConstraintsDetallePagos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = 2;
		this.gridBagConstraintsDetallePagos.ipadx = 0;
		this.gridBagConstraintsDetallePagos.insets = new Insets(0, 0, 0, 0);
		this.jPanelabonos_actualDetallePagos.add(jButtonabonos_actualDetallePagosBusqueda, this.gridBagConstraintsDetallePagos);
	}

	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagos.gridy = 0;
	this.gridBagConstraintsDetallePagos.gridx = 1;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelabonos_actualDetallePagos.add(jTextFieldabonos_actualDetallePagos, this.gridBagConstraintsDetallePagos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelidDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelid_grupo_clienteDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelid_zonaDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelfecha_emision_desdeDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelfecha_emision_hastaDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelcodigoDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelnombre_clienteDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelrucDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPaneltotal_facturasDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPaneltotal_abonosDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPaneltotal_facturas_actualDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelabonos_anteriorDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagos.add(this.jPanelabonos_actualDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposDetallePagos % 2==0) {
		iXPanelCamposDetallePagos=0;
		iYPanelCamposDetallePagos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagos.gridy = iYPanelCamposOcultosDetallePagos;
	this.gridBagConstraintsDetallePagos.gridx = iXPanelCamposOcultosDetallePagos++;
	this.gridBagConstraintsDetallePagos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePagos.add(this.jPanelid_empresaDetallePagos, this.gridBagConstraintsDetallePagos);



	if(iXPanelCamposOcultosDetallePagos % 2==0) {
		iXPanelCamposOcultosDetallePagos=0;
		iYPanelCamposOcultosDetallePagos++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePagos= new GridBagLayout();
		this.jPanelAccionesDetallePagos.setLayout(gridaBagLayoutAccionesDetallePagos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePagos= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePagos.setLayout(gridaBagLayoutAccionesFormularioDetallePagos);
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePagos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePagos.add(this.jComboBoxTiposAccionesFormularioDetallePagos, this.gridBagConstraintsDetallePagos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePagos.add(this.jButtonModificarDetallePagos, this.gridBagConstraintsDetallePagos);							

		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagos.gridy = 0;
		this.gridBagConstraintsDetallePagos.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePagos.add(this.jButtonEliminarDetallePagos, this.gridBagConstraintsDetallePagos);
		
			
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = 0;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePagos.add(this.jButtonActualizarDetallePagos, this.gridBagConstraintsDetallePagos);


		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = 0;		
		this.gridBagConstraintsDetallePagos.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePagos.add(this.jButtonGuardarCambiosDetallePagos, this.gridBagConstraintsDetallePagos);	
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = 0;		
		this.gridBagConstraintsDetallePagos.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePagos.add(this.jButtonCancelarDetallePagos, this.gridBagConstraintsDetallePagos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePagos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePagos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();						
			this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePagos.gridx = 0;		
			//this.gridBagConstraintsDetallePagos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePagos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePagos.gridx =0;
		this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePagos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePagos, this.gridBagConstraintsDetallePagos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePagosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePagos = new DetallePagosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Pagos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Pagos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pagos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallePagosModel detallepagosModel=new DetallePagosModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePagosModel.DetallePagosFocusTraversalPolicy detallepagosFocusTraversalPolicy = detallepagosModel.new DetallePagosFocusTraversalPolicy(this);
			
			//detallepagosFocusTraversalPolicy.setdetallepagosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallepagosModel);
			
			
			this.jContentPaneDetalleDetallePagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePagos = new GridBagLayout();	
			this.jContentPaneDetalleDetallePagos.setLayout(gridaBagLayoutDetalleDetallePagos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePagos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePagos = new GridBagConstraints();
				this.gridBagConstraintsDetallePagos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePagos.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePagos.add(jTtoolBarDetalleDetallePagos, gridBagConstraintsDetallePagos);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePagos=   new JScrollPane(jContentPaneDetalleDetallePagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePagos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePagos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePagos.gridx = 0;
	        
			this.jContentPaneDetalleDetallePagos.add(jPanelCamposDetallePagos, gridBagConstraintsDetallePagos);
			
			
			
			
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
						//&& detallepagosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallepagosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePagos= new GridBagConstraints();
						this.gridBagConstraintsDetallePagos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePagos.gridx = 0;
						this.jContentPaneDetalleDetallePagos.add(this.jTabbedPaneRelacionesDetallePagos, this.gridBagConstraintsDetallePagos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePagos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePagos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePagos = new GridBagConstraints();
					this.gridBagConstraintsDetallePagos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePagos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePagos.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePagos.add(jPanelCamposOcultosDetallePagos, gridBagConstraintsDetallePagos);
				
					this.jPanelCamposOcultosDetallePagos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePagos.gridx = 0;
	        this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePagos.add(this.jPanelAccionesFormularioDetallePagos, this.gridBagConstraintsDetallePagos);							
			
			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
	        this.gridBagConstraintsDetallePagos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePagos.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePagos.add(this.jPanelAccionesDetallePagos, this.gridBagConstraintsDetallePagos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePagos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePagos=   new JScrollPane(this.jPanelCamposDetallePagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePagos.gridx = 0;
			this.gridBagConstraintsDetallePagos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePagos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePagos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePagos, this.gridBagConstraintsDetallePagos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePagos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePagos, this.gridBagConstraintsDetallePagos);			
			
			this.gridBagConstraintsDetallePagos = new GridBagConstraints();
			this.gridBagConstraintsDetallePagos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePagos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePagos, this.gridBagConstraintsDetallePagos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePagos, this.gridBagConstraintsDetallePagos);
			
			
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePagos, this.gridBagConstraintsDetallePagos);
		
			
		this.gridBagConstraintsDetallePagos = new GridBagConstraints();
		this.gridBagConstraintsDetallePagos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePagos, this.gridBagConstraintsDetallePagos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePagos;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePagos;
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
