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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ProcesoAsientoInicialEjercicioConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame extends ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoAsientoInicialEjercicio;
	
	protected JMenuBar jmenuBarDetalleProcesoAsientoInicialEjercicio;
	
	protected JMenu jmenuDetalleProcesoAsientoInicialEjercicio;
	protected JMenu jmenuDetalleArchivoProcesoAsientoInicialEjercicio;
	protected JMenu jmenuDetalleAccionesProcesoAsientoInicialEjercicio;
	protected JMenu jmenuDetalleDatosProcesoAsientoInicialEjercicio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoAsientoInicialEjercicio;	
	protected GridBagConstraints gridBagConstraintsProcesoAsientoInicialEjercicio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoAsientoInicialEjercicio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";
	
	public ProcesoAsientoInicialEjercicioSessionBean procesoasientoinicialejercicioSessionBean;
	
	
	
	
	public TipoDocumentoSessionBean tipodocumentoSessionBean;	
	
	public ProcesoAsientoInicialEjercicioLogic procesoasientoinicialejercicioLogic;
	
	public JScrollPane jScrollPanelDatosProcesoAsientoInicialEjercicio;
	public JScrollPane jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio;
	public JScrollPane jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio;
	
	protected JPanel jPanelCamposProcesoAsientoInicialEjercicio;    
	protected JPanel jPanelCamposOcultosProcesoAsientoInicialEjercicio;    	
	protected JPanel jPanelAccionesProcesoAsientoInicialEjercicio;
	protected JPanel jPanelAccionesFormularioProcesoAsientoInicialEjercicio;
    
	
	
	protected Integer iXPanelCamposProcesoAsientoInicialEjercicio=0;
	protected Integer iYPanelCamposProcesoAsientoInicialEjercicio=0;
	
	protected Integer iXPanelCamposOcultosProcesoAsientoInicialEjercicio=0;
	protected Integer iYPanelCamposOcultosProcesoAsientoInicialEjercicio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoAsientoInicialEjercicio;
	public JButton jButtonModificarProcesoAsientoInicialEjercicio;
	public JButton jButtonActualizarProcesoAsientoInicialEjercicio;
    public JButton jButtonEliminarProcesoAsientoInicialEjercicio;
	public JButton jButtonCancelarProcesoAsientoInicialEjercicio;
    public JButton jButtonGuardarCambiosProcesoAsientoInicialEjercicio;
	public JButton jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio;
	protected JButton jButtonCerrarProcesoAsientoInicialEjercicio;
	
	
	protected JButton jButtonProcesarInformacionProcesoAsientoInicialEjercicio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoAsientoInicialEjercicio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoAsientoInicialEjercicio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoAsientoInicialEjercicio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonModificarToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonActualizarToolBarProcesoAsientoInicialEjercicio;
    protected JButton jButtonEliminarToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonCancelarToolBarProcesoAsientoInicialEjercicio;
    protected JButton jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoAsientoInicialEjercicio;
	protected JButton jButtonCerrarToolBarProcesoAsientoInicialEjercicio;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoAsientoInicialEjercicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemModificarProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemActualizarProcesoAsientoInicialEjercicio;
    protected JMenuItem jMenuItemEliminarProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemCancelarProcesoAsientoInicialEjercicio;
    protected JMenuItem jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemCerrarProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio;
	protected JMenuItem jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoAsientoInicialEjercicio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoAsientoInicialEjercicio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoAsientoInicialEjercicio;
	public JLabel jLabelIdProcesoAsientoInicialEjercicio;
	public JLabel jLabelidProcesoAsientoInicialEjercicio;
	public JButton jButtonidProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioProcesoAsientoInicialEjercicio;
	public JLabel jLabelfecha_inicioProcesoAsientoInicialEjercicio;
	//public JFormattedTextField jDateChooserfecha_inicioProcesoAsientoInicialEjercicio;

	public JDateChooser jDateChooserfecha_inicioProcesoAsientoInicialEjercicio;
	public JButton jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finProcesoAsientoInicialEjercicio;
	public JLabel jLabelfecha_finProcesoAsientoInicialEjercicio;
	//public JFormattedTextField jDateChooserfecha_finProcesoAsientoInicialEjercicio;

	public JDateChooser jDateChooserfecha_finProcesoAsientoInicialEjercicio;
	public JButton jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoProcesoAsientoInicialEjercicio;
	public JLabel jLabelid_tipo_documentoProcesoAsientoInicialEjercicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio;
	public JButton jButtonid_tipo_documentoProcesoAsientoInicialEjercicio= new JButtonMe();
	public JButton jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoAsientoInicialEjercicio;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoAsientoInicialEjercicio=new JPanel();
				this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio=new JPanel();
				this.jmenuBarDetalleProcesoAsientoInicialEjercicio=new JMenuBar();
				this.jTtoolBarDetalleProcesoAsientoInicialEjercicio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoAsientoInicialEjercicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoAsientoInicialEjercicio() {
		return this.jButtonActualizarToolBarProcesoAsientoInicialEjercicio;
	}
	
	public JButton getjButtonEliminarToolBarProcesoAsientoInicialEjercicio() {
		return this.jButtonEliminarToolBarProcesoAsientoInicialEjercicio;
	}
	
	public JButton getjButtonCancelarToolBarProcesoAsientoInicialEjercicio() {
		return this.jButtonCancelarToolBarProcesoAsientoInicialEjercicio;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoAsientoInicialEjercicio() {
		return this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoAsientoInicialEjercicio)	{
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio = jButtonProcesarInformacionProcesoAsientoInicialEjercicio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoAsientoInicialEjercicio() {
		return this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio = jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposAccionesProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio = jComboBoxTiposAccionesProcesoAsientoInicialEjercicio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio() {
		return this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio(
			JComboBox jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio) {
		this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio = jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesoasientoinicialejercicioSessionBean=new ProcesoAsientoInicialEjercicioSessionBean();
		
		this.procesoasientoinicialejercicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoasientoinicialejercicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoAsientoInicialEjercicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoAsientoInicialEjercicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoAsientoInicialEjercicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Asiento Inicial Ejercicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoAsientoInicialEjercicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoAsientoInicialEjercicio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoAsientoInicialEjercicio=new JButtonMe();
				this.jButtonModificarToolBarProcesoAsientoInicialEjercicio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarDetalleProcesoAsientoInicialEjercicio,
							"actualizar","actualizar","Actualizar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarDetalleProcesoAsientoInicialEjercicio,
							"eliminar","eliminar","Eliminar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarDetalleProcesoAsientoInicialEjercicio,
							"cancelar","cancelar","Cancelar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio,this.jTtoolBarDetalleProcesoAsientoInicialEjercicio,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoAsientoInicialEjercicio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoAsientoInicialEjercicio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoAsientoInicialEjercicio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoAsientoInicialEjercicio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoAsientoInicialEjercicio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoAsientoInicialEjercicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoAsientoInicialEjercicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoAsientoInicialEjercicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoAsientoInicialEjercicio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoAsientoInicialEjercicio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoAsientoInicialEjercicio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoAsientoInicialEjercicio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoAsientoInicialEjercicio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoAsientoInicialEjercicio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoAsientoInicialEjercicio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoAsientoInicialEjercicio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoAsientoInicialEjercicio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoAsientoInicialEjercicio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoAsientoInicialEjercicio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoAsientoInicialEjercicio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoAsientoInicialEjercicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoAsientoInicialEjercicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoAsientoInicialEjercicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoAsientoInicialEjercicio.add(this.jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio);
		
		this.jmenuDetalleAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemActualizarProcesoAsientoInicialEjercicio);
		this.jmenuDetalleAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemEliminarProcesoAsientoInicialEjercicio);
		this.jmenuDetalleAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemCancelarProcesoAsientoInicialEjercicio);		
		
		//this.jmenuDetalleDatosProcesoAsientoInicialEjercicio.add(this.jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio);				
		this.jmenuDetalleDatosProcesoAsientoInicialEjercicio.add(this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio);				
				
		//this.jmenuDetalleAccionesProcesoAsientoInicialEjercicio.add(this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoAsientoInicialEjercicio.add(this.jmenuDetalleArchivoProcesoAsientoInicialEjercicio);		
		this.jmenuBarDetalleProcesoAsientoInicialEjercicio.add(this.jmenuDetalleAccionesProcesoAsientoInicialEjercicio);		
		this.jmenuBarDetalleProcesoAsientoInicialEjercicio.add(this.jmenuDetalleDatosProcesoAsientoInicialEjercicio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoAsientoInicialEjercicio);				
	}
	
	
	public void inicializarElementosCamposProcesoAsientoInicialEjercicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoAsientoInicialEjercicio = new JLabelMe();
		jLabelIdProcesoAsientoInicialEjercicio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoAsientoInicialEjercicio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoAsientoInicialEjercicio.setToolTipText(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoAsientoInicialEjercicio= new GridBagLayout();

		this.jPanelidProcesoAsientoInicialEjercicio.setLayout(this.gridaBagLayoutProcesoAsientoInicialEjercicio);

		jLabelidProcesoAsientoInicialEjercicio = new JLabel();
		jLabelidProcesoAsientoInicialEjercicio.setText("Id");

		jLabelidProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioProcesoAsientoInicialEjercicio = new JLabelMe();
		this.jLabelfecha_inicioProcesoAsientoInicialEjercicio.setText(""+ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioProcesoAsientoInicialEjercicio.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioProcesoAsientoInicialEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioProcesoAsientoInicialEjercicio.setToolTipText(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutProcesoAsientoInicialEjercicio = new GridBagLayout();
		this.jPanelfecha_inicioProcesoAsientoInicialEjercicio.setLayout(this.gridaBagLayoutProcesoAsientoInicialEjercicio);


		//jFormattedTextFieldfecha_inicioProcesoAsientoInicialEjercicio= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio= new JDateChooser();
		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setEnabled(false);
		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setDate(new Date());
		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioProcesoAsientoInicialEjercicio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();
		this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.setText("U");
		this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioProcesoAsientoInicialEjercicioBusqueda"));

		if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finProcesoAsientoInicialEjercicio = new JLabelMe();
		this.jLabelfecha_finProcesoAsientoInicialEjercicio.setText(""+ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finProcesoAsientoInicialEjercicio.setToolTipText("Fecha Fin");
		this.jLabelfecha_finProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finProcesoAsientoInicialEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finProcesoAsientoInicialEjercicio.setToolTipText(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutProcesoAsientoInicialEjercicio = new GridBagLayout();
		this.jPanelfecha_finProcesoAsientoInicialEjercicio.setLayout(this.gridaBagLayoutProcesoAsientoInicialEjercicio);


		//jFormattedTextFieldfecha_finProcesoAsientoInicialEjercicio= new JFormattedTextFieldMe();

		jDateChooserfecha_finProcesoAsientoInicialEjercicio= new JDateChooser();
		jDateChooserfecha_finProcesoAsientoInicialEjercicio.setEnabled(false);
		jDateChooserfecha_finProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finProcesoAsientoInicialEjercicio.setDate(new Date());
		jDateChooserfecha_finProcesoAsientoInicialEjercicio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finProcesoAsientoInicialEjercicio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();
		this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.setText("U");
		this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finProcesoAsientoInicialEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finProcesoAsientoInicialEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finProcesoAsientoInicialEjercicioBusqueda"));

		if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoAsientoInicialEjercicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_documentoProcesoAsientoInicialEjercicio = new JLabelMe();
		this.jLabelid_tipo_documentoProcesoAsientoInicialEjercicio.setText(""+ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoProcesoAsientoInicialEjercicio.setToolTipText("Tipo Documento");
		this.jLabelid_tipo_documentoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio.setToolTipText(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutProcesoAsientoInicialEjercicio = new GridBagLayout();
		this.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio.setLayout(this.gridaBagLayoutProcesoAsientoInicialEjercicio);


		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio= new JComboBoxMe();
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicio= new JButtonMe();
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicio.setText("Procesar");
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicio.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicio,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesoAsientoInicialEjercicio"));

		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.setText("U");
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesoAsientoInicialEjercicioBusqueda"));

		if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.setText("U");
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesoAsientoInicialEjercicioUpdate"));



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
		//this.jInternalFrameDetalleProcesoAsientoInicialEjercicio = new ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Asiento Inicial Ejercicio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoAsientoInicialEjercicio= new GridBagLayout();
		

		
		String sToolTipProcesoAsientoInicialEjercicio="";
		sToolTipProcesoAsientoInicialEjercicio=ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoAsientoInicialEjercicio+="(Contabilidad.ProcesoAsientoInicialEjercicio)";
		}
		
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoAsientoInicialEjercicio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonModificarProcesoAsientoInicialEjercicio = new JButtonMe();
        this.jButtonActualizarProcesoAsientoInicialEjercicio = new JButtonMe();
        this.jButtonEliminarProcesoAsientoInicialEjercicio = new JButtonMe();
        this.jButtonCancelarProcesoAsientoInicialEjercicio = new JButtonMe();
        this.jButtonGuardarCambiosProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio = new JButtonMe();
		this.jButtonCerrarProcesoAsientoInicialEjercicio = new JButtonMe();
		
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Asiento Inicial Ejercicio";
		
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Asiento Inicial Ejercicios" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoAsientoInicialEjercicio.setName("jPanelCamposProcesoAsientoInicialEjercicio"); 

		this.jPanelCamposOcultosProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoAsientoInicialEjercicio.setName("jPanelCamposOcultosProcesoAsientoInicialEjercicio"); 

        this.jPanelAccionesProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoAsientoInicialEjercicio.setToolTipText("Acciones");
        this.jPanelAccionesProcesoAsientoInicialEjercicio.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoAsientoInicialEjercicio.setText("Nuevo");
		this.jButtonModificarProcesoAsientoInicialEjercicio.setText("Editar");
        this.jButtonActualizarProcesoAsientoInicialEjercicio.setText("Actualizar");
        this.jButtonEliminarProcesoAsientoInicialEjercicio.setText("Eliminar");
        this.jButtonCancelarProcesoAsientoInicialEjercicio.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.setText("Guardar");
		this.jButtonCerrarProcesoAsientoInicialEjercicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoAsientoInicialEjercicio,"nuevo_button","Nuevo",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoAsientoInicialEjercicio,"modificar_button","Editar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoAsientoInicialEjercicio,"actualizar_button","Actualizar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoAsientoInicialEjercicio,"eliminar_button","Eliminar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoAsientoInicialEjercicio,"cancelar_button","Cancelar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoAsientoInicialEjercicio,"guardarcambios_button","Guardar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio,"guardarcambiostabla_button","Guardar",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoAsientoInicialEjercicio,"cerrar_button","Salir",this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoAsientoInicialEjercicio.setToolTipText("Nuevo"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoAsientoInicialEjercicio.setToolTipText("Editar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoAsientoInicialEjercicio.setToolTipText("Actualizar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoAsientoInicialEjercicio.setToolTipText("Eliminar)"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoAsientoInicialEjercicio.setToolTipText("Cancelar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.setToolTipText("Guardar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.setToolTipText("Guardar"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoAsientoInicialEjercicio.setToolTipText("Salir"+" "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonNuevoProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoAsientoInicialEjercicio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonActualizarProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoAsientoInicialEjercicio"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonEliminarProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoAsientoInicialEjercicio"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonCancelarProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoAsientoInicialEjercicio"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonCerrarProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoAsientoInicialEjercicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoAsientoInicialEjercicio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoAsientoInicialEjercicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoAsientoInicialEjercicio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoAsientoInicialEjercicio.setToolTipText("Nuevo ProcesoAsientoInicialEjercicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoAsientoInicialEjercicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoAsientoInicialEjercicio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoAsientoInicialEjercicio.setToolTipText("Sin Cerrar Ventana ProcesoAsientoInicialEjercicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoAsientoInicialEjercicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoAsientoInicialEjercicio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoAsientoInicialEjercicio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setText("Accion");
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoAsientoInicialEjercicio = new JLabelMe();
		
		this.jLabelAccionesProcesoAsientoInicialEjercicio.setText("Acciones");		
		this.jLabelAccionesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoAsientoInicialEjercicio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoAsientoInicialEjercicio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoAsientoInicialEjercicio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoAsientoInicialEjercicio = new GridBagLayout();
		
		this.jPanelCamposProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutCamposProcesoAsientoInicialEjercicio);
		this.jPanelCamposOcultosProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutCamposOcultosProcesoAsientoInicialEjercicio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoAsientoInicialEjercicio.add(jLabelIdProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);



	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 1;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoAsientoInicialEjercicio.add(jLabelidProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);


	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio.add(jLabelid_tipo_documentoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 2;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio.add(jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 3;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio.add(jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
	}

	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 1;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio.add(jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);


	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioProcesoAsientoInicialEjercicio.add(jLabelfecha_inicioProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 2;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioProcesoAsientoInicialEjercicio.add(jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
	}

	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 1;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioProcesoAsientoInicialEjercicio.add(jDateChooserfecha_inicioProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);


	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finProcesoAsientoInicialEjercicio.add(jLabelfecha_finProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 2;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finProcesoAsientoInicialEjercicio.add(jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
	}

	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 1;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finProcesoAsientoInicialEjercicio.add(jDateChooserfecha_finProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iYPanelCamposProcesoAsientoInicialEjercicio;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iXPanelCamposProcesoAsientoInicialEjercicio++;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoAsientoInicialEjercicio.add(this.jPanelidProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);



	if(iXPanelCamposProcesoAsientoInicialEjercicio % 1==0) {
		iXPanelCamposProcesoAsientoInicialEjercicio=0;
		iYPanelCamposProcesoAsientoInicialEjercicio++;
	}
	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iYPanelCamposProcesoAsientoInicialEjercicio;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iXPanelCamposProcesoAsientoInicialEjercicio++;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoAsientoInicialEjercicio.add(this.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);



	if(iXPanelCamposProcesoAsientoInicialEjercicio % 1==0) {
		iXPanelCamposProcesoAsientoInicialEjercicio=0;
		iYPanelCamposProcesoAsientoInicialEjercicio++;
	}
	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iYPanelCamposProcesoAsientoInicialEjercicio;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iXPanelCamposProcesoAsientoInicialEjercicio++;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoAsientoInicialEjercicio.add(this.jPanelfecha_inicioProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);



	if(iXPanelCamposProcesoAsientoInicialEjercicio % 1==0) {
		iXPanelCamposProcesoAsientoInicialEjercicio=0;
		iYPanelCamposProcesoAsientoInicialEjercicio++;
	}
	this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iYPanelCamposProcesoAsientoInicialEjercicio;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iXPanelCamposProcesoAsientoInicialEjercicio++;
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoAsientoInicialEjercicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoAsientoInicialEjercicio.add(this.jPanelfecha_finProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);



	if(iXPanelCamposProcesoAsientoInicialEjercicio % 1==0) {
		iXPanelCamposProcesoAsientoInicialEjercicio=0;
		iYPanelCamposProcesoAsientoInicialEjercicio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoAsientoInicialEjercicio= new GridBagLayout();
		this.jPanelAccionesProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutAccionesProcesoAsientoInicialEjercicio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoAsientoInicialEjercicio= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutAccionesFormularioProcesoAsientoInicialEjercicio);
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio.add(this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoAsientoInicialEjercicio.add(this.jButtonModificarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);							

		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoAsientoInicialEjercicio.add(this.jButtonEliminarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
			
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoAsientoInicialEjercicio.add(this.jButtonActualizarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);


		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoAsientoInicialEjercicio.add(this.jButtonGuardarCambiosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);	
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = 0;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoAsientoInicialEjercicio.add(this.jButtonCancelarProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoAsientoInicialEjercicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoAsientoInicialEjercicio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();						
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;		
			//this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =0;
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoAsientoInicialEjercicio = new ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Asiento Inicial Ejercicio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Asiento Inicial Ejercicio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Asiento Inicial Ejercicio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoAsientoInicialEjercicioModel procesoasientoinicialejercicioModel=new ProcesoAsientoInicialEjercicioModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoAsientoInicialEjercicioModel.ProcesoAsientoInicialEjercicioFocusTraversalPolicy procesoasientoinicialejercicioFocusTraversalPolicy = procesoasientoinicialejercicioModel.new ProcesoAsientoInicialEjercicioFocusTraversalPolicy(this);
			
			//procesoasientoinicialejercicioFocusTraversalPolicy.setprocesoasientoinicialejercicioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesoasientoinicialejercicioModel);
			
			
			this.jContentPaneDetalleProcesoAsientoInicialEjercicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoAsientoInicialEjercicio = new GridBagLayout();	
			this.jContentPaneDetalleProcesoAsientoInicialEjercicio.setLayout(gridaBagLayoutDetalleProcesoAsientoInicialEjercicio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoAsientoInicialEjercicio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
				this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoAsientoInicialEjercicio.add(jTtoolBarDetalleProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio=   new JScrollPane(jContentPaneDetalleProcesoAsientoInicialEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
	        
			this.jContentPaneDetalleProcesoAsientoInicialEjercicio.add(jPanelCamposProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);
			
			
			
			
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
						//&& procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoAsientoInicialEjercicio= new GridBagConstraints();
						this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
						this.jContentPaneDetalleProcesoAsientoInicialEjercicio.add(this.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoAsientoInicialEjercicio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
					this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoAsientoInicialEjercicio.add(jPanelCamposOcultosProcesoAsientoInicialEjercicio, gridBagConstraintsProcesoAsientoInicialEjercicio);
				
					this.jPanelCamposOcultosProcesoAsientoInicialEjercicio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
	        this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoAsientoInicialEjercicio.add(this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);							
			
			
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
	        this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoAsientoInicialEjercicio.add(this.jPanelAccionesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio=   new JScrollPane(this.jPanelCamposProcesoAsientoInicialEjercicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);			
			
			this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
			
			
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		
			
		this.gridBagConstraintsProcesoAsientoInicialEjercicio = new GridBagConstraints();
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoAsientoInicialEjercicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoAsientoInicialEjercicio, this.gridBagConstraintsProcesoAsientoInicialEjercicio);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoAsientoInicialEjercicio.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoAsientoInicialEjercicio;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio;
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
