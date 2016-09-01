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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.contabilidad.util.report.EstadosFlujosCajasConstantesFunciones;

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
public class EstadosFlujosCajasDetalleFormJInternalFrame extends EstadosFlujosCajasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadosFlujosCajas;
	
	protected JMenuBar jmenuBarDetalleEstadosFlujosCajas;
	
	protected JMenu jmenuDetalleEstadosFlujosCajas;
	protected JMenu jmenuDetalleArchivoEstadosFlujosCajas;
	protected JMenu jmenuDetalleAccionesEstadosFlujosCajas;
	protected JMenu jmenuDetalleDatosEstadosFlujosCajas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadosFlujosCajas;	
	protected GridBagConstraints gridBagConstraintsEstadosFlujosCajas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadosFlujosCajasBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadosFlujosCajas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";
	
	public EstadosFlujosCajasSessionBean estadosflujoscajasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;	
	
	public EstadosFlujosCajasLogic estadosflujoscajasLogic;
	
	public JScrollPane jScrollPanelDatosEstadosFlujosCajas;
	public JScrollPane jScrollPanelDatosEdicionEstadosFlujosCajas;
	public JScrollPane jScrollPanelDatosGeneralEstadosFlujosCajas;
	
	protected JPanel jPanelCamposEstadosFlujosCajas;    
	protected JPanel jPanelCamposOcultosEstadosFlujosCajas;    	
	protected JPanel jPanelAccionesEstadosFlujosCajas;
	protected JPanel jPanelAccionesFormularioEstadosFlujosCajas;
    
	
	
	protected Integer iXPanelCamposEstadosFlujosCajas=0;
	protected Integer iYPanelCamposEstadosFlujosCajas=0;
	
	protected Integer iXPanelCamposOcultosEstadosFlujosCajas=0;
	protected Integer iYPanelCamposOcultosEstadosFlujosCajas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadosFlujosCajas;
	public JButton jButtonModificarEstadosFlujosCajas;
	public JButton jButtonActualizarEstadosFlujosCajas;
    public JButton jButtonEliminarEstadosFlujosCajas;
	public JButton jButtonCancelarEstadosFlujosCajas;
    public JButton jButtonGuardarCambiosEstadosFlujosCajas;
	public JButton jButtonGuardarCambiosTablaEstadosFlujosCajas;
	protected JButton jButtonCerrarEstadosFlujosCajas;
	
	
	protected JButton jButtonProcesarInformacionEstadosFlujosCajas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadosFlujosCajas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadosFlujosCajas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadosFlujosCajas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadosFlujosCajas;
	protected JButton jButtonModificarToolBarEstadosFlujosCajas;
	protected JButton jButtonActualizarToolBarEstadosFlujosCajas;
    protected JButton jButtonEliminarToolBarEstadosFlujosCajas;
	protected JButton jButtonCancelarToolBarEstadosFlujosCajas;
    protected JButton jButtonGuardarCambiosToolBarEstadosFlujosCajas;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadosFlujosCajas;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadosFlujosCajas;
	protected JButton jButtonCerrarToolBarEstadosFlujosCajas;
	
	protected JButton jButtonProcesarInformacionToolBarEstadosFlujosCajas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadosFlujosCajas;
	protected JMenuItem jMenuItemModificarEstadosFlujosCajas;
	protected JMenuItem jMenuItemActualizarEstadosFlujosCajas;
    protected JMenuItem jMenuItemEliminarEstadosFlujosCajas;
	protected JMenuItem jMenuItemCancelarEstadosFlujosCajas;
    protected JMenuItem jMenuItemGuardarCambiosEstadosFlujosCajas;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadosFlujosCajas;
	protected JMenuItem jMenuItemCerrarEstadosFlujosCajas;
	protected JMenuItem jMenuItemDetalleCerrarEstadosFlujosCajas;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadosFlujosCajas;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadosFlujosCajas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadosFlujosCajas;
	protected JMenuItem jMenuItemMostrarOcultarEstadosFlujosCajas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadosFlujosCajas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadosFlujosCajas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadosFlujosCajas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadosFlujosCajas;
	public JLabel jLabelIdEstadosFlujosCajas;
	public JLabel jLabelidEstadosFlujosCajas;
	public JButton jButtonidEstadosFlujosCajasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_centro_actividadEstadosFlujosCajas;
	public JLabel jLabelnombre_centro_actividadEstadosFlujosCajas;
	public JTextArea jTextAreanombre_centro_actividadEstadosFlujosCajas;
	public JScrollPane jscrollPanenombre_centro_actividadEstadosFlujosCajas;
	public JButton jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_centro_actividadEstadosFlujosCajas;
	public JLabel jLabelcodigo_centro_actividadEstadosFlujosCajas;
	public JTextField jTextFieldcodigo_centro_actividadEstadosFlujosCajas;
	public JButton jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda= new JButtonMe();

	public JPanel jPanelmensualEstadosFlujosCajas;
	public JLabel jLabelmensualEstadosFlujosCajas;
	public JTextField jTextFieldmensualEstadosFlujosCajas;
	public JButton jButtonmensualEstadosFlujosCajasBusqueda= new JButtonMe();

	public JPanel jPanelacumuladoEstadosFlujosCajas;
	public JLabel jLabelacumuladoEstadosFlujosCajas;
	public JTextField jTextFieldacumuladoEstadosFlujosCajas;
	public JButton jButtonacumuladoEstadosFlujosCajasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEstadosFlujosCajas;
	public JLabel jLabelid_empresaEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEstadosFlujosCajas;
	public JButton jButtonid_empresaEstadosFlujosCajas= new JButtonMe();
	public JButton jButtonid_empresaEstadosFlujosCajasUpdate= new JButtonMe();
	public JButton jButtonid_empresaEstadosFlujosCajasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioEstadosFlujosCajas;
	public JLabel jLabelid_ejercicioEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioEstadosFlujosCajas;
	public JButton jButtonid_ejercicioEstadosFlujosCajas= new JButtonMe();
	public JButton jButtonid_ejercicioEstadosFlujosCajasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioEstadosFlujosCajasBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoEstadosFlujosCajas;
	public JLabel jLabelid_periodoEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoEstadosFlujosCajas;
	public JButton jButtonid_periodoEstadosFlujosCajas= new JButtonMe();
	public JButton jButtonid_periodoEstadosFlujosCajasUpdate= new JButtonMe();
	public JButton jButtonid_periodoEstadosFlujosCajasBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_actividadEstadosFlujosCajas;
	public JLabel jLabelid_centro_actividadEstadosFlujosCajas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadEstadosFlujosCajas;
	public JButton jButtonid_centro_actividadEstadosFlujosCajas= new JButtonMe();
	public JButton jButtonid_centro_actividadEstadosFlujosCajasUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadEstadosFlujosCajasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadosFlujosCajas;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadosFlujosCajasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadosFlujosCajas=new JPanel();
				this.jPanelAccionesFormularioEstadosFlujosCajas=new JPanel();
				this.jmenuBarDetalleEstadosFlujosCajas=new JMenuBar();
				this.jTtoolBarDetalleEstadosFlujosCajas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosFlujosCajasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadosFlujosCajasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosFlujosCajasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosFlujosCajasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadosFlujosCajasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadosFlujosCajas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadosFlujosCajas() {
		return this.jButtonActualizarToolBarEstadosFlujosCajas;
	}
	
	public JButton getjButtonEliminarToolBarEstadosFlujosCajas() {
		return this.jButtonEliminarToolBarEstadosFlujosCajas;
	}
	
	public JButton getjButtonCancelarToolBarEstadosFlujosCajas() {
		return this.jButtonCancelarToolBarEstadosFlujosCajas;
	}		
	
	public JButton getjButtonProcesarInformacionEstadosFlujosCajas() {
		return this.jButtonProcesarInformacionEstadosFlujosCajas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadosFlujosCajas)	{
		this.jButtonProcesarInformacionEstadosFlujosCajas = jButtonProcesarInformacionEstadosFlujosCajas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadosFlujosCajas() {
		return this.jComboBoxTiposAccionesEstadosFlujosCajas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadosFlujosCajas(
			JComboBox jComboBoxTiposRelacionesEstadosFlujosCajas) {
		this.jComboBoxTiposRelacionesEstadosFlujosCajas = jComboBoxTiposRelacionesEstadosFlujosCajas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadosFlujosCajas(
			JComboBox jComboBoxTiposAccionesEstadosFlujosCajas) {
		this.jComboBoxTiposAccionesEstadosFlujosCajas = jComboBoxTiposAccionesEstadosFlujosCajas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadosFlujosCajas() {
		return this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadosFlujosCajas(
			JComboBox jComboBoxTiposAccionesFormularioEstadosFlujosCajas) {
		this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas = jComboBoxTiposAccionesFormularioEstadosFlujosCajas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadosflujoscajasSessionBean=new EstadosFlujosCajasSessionBean();
		
		this.estadosflujoscajasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosflujoscajasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadosflujoscajasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadosFlujosCajasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadosFlujosCajasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadosFlujosCajasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estados Flujos Cajas MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadosFlujosCajasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadosFlujosCajas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadosFlujosCajas=new JButtonMe();
				this.jButtonModificarToolBarEstadosFlujosCajas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadosFlujosCajas,this.jTtoolBarDetalleEstadosFlujosCajas,
							"actualizar","actualizar","Actualizar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadosFlujosCajas,this.jTtoolBarDetalleEstadosFlujosCajas,
							"eliminar","eliminar","Eliminar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadosFlujosCajas,this.jTtoolBarDetalleEstadosFlujosCajas,
							"cancelar","cancelar","Cancelar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadosFlujosCajas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadosFlujosCajas,this.jTtoolBarDetalleEstadosFlujosCajas,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadosFlujosCajas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadosFlujosCajas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadosFlujosCajas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadosFlujosCajas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadosFlujosCajas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadosFlujosCajas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadosFlujosCajas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadosFlujosCajas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadosFlujosCajas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadosFlujosCajas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadosFlujosCajas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadosFlujosCajas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadosFlujosCajas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadosFlujosCajas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadosFlujosCajas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadosFlujosCajas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadosFlujosCajas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadosFlujosCajas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadosFlujosCajas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadosFlujosCajas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadosFlujosCajas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadosFlujosCajas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadosFlujosCajas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadosFlujosCajas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadosFlujosCajas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadosFlujosCajas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadosFlujosCajas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadosFlujosCajas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadosFlujosCajas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadosFlujosCajas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadosFlujosCajas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadosFlujosCajas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadosFlujosCajas.add(this.jMenuItemDetalleCerrarEstadosFlujosCajas);
		
		this.jmenuDetalleAccionesEstadosFlujosCajas.add(this.jMenuItemActualizarEstadosFlujosCajas);
		this.jmenuDetalleAccionesEstadosFlujosCajas.add(this.jMenuItemEliminarEstadosFlujosCajas);
		this.jmenuDetalleAccionesEstadosFlujosCajas.add(this.jMenuItemCancelarEstadosFlujosCajas);		
		
		//this.jmenuDetalleDatosEstadosFlujosCajas.add(this.jMenuItemDetalleAbrirOrderByEstadosFlujosCajas);				
		this.jmenuDetalleDatosEstadosFlujosCajas.add(this.jMenuItemDetalleMostarOcultarEstadosFlujosCajas);				
				
		//this.jmenuDetalleAccionesEstadosFlujosCajas.add(this.jMenuItemGuardarCambiosEstadosFlujosCajas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadosFlujosCajas.add(this.jmenuDetalleArchivoEstadosFlujosCajas);		
		this.jmenuBarDetalleEstadosFlujosCajas.add(this.jmenuDetalleAccionesEstadosFlujosCajas);		
		this.jmenuBarDetalleEstadosFlujosCajas.add(this.jmenuDetalleDatosEstadosFlujosCajas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadosFlujosCajas);				
	}
	
	
	public void inicializarElementosCamposEstadosFlujosCajas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadosFlujosCajas = new JLabelMe();
		jLabelIdEstadosFlujosCajas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadosFlujosCajas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadosFlujosCajas= new GridBagLayout();

		this.jPanelidEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);

		jLabelidEstadosFlujosCajas = new JLabel();
		jLabelidEstadosFlujosCajas.setText("Id");

		jLabelidEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_centro_actividadEstadosFlujosCajas = new JLabelMe();
		this.jLabelnombre_centro_actividadEstadosFlujosCajas.setText(""+EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD+" : *");
		this.jLabelnombre_centro_actividadEstadosFlujosCajas.setToolTipText("Nombre Centro Activad");
		this.jLabelnombre_centro_actividadEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_centro_actividadEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_centro_actividadEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_centro_actividadEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_centro_actividadEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_centro_actividadEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD);
		this.gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		this.jPanelnombre_centro_actividadEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);


		jTextAreanombre_centro_actividadEstadosFlujosCajas= new JTextAreaMe();
		jTextAreanombre_centro_actividadEstadosFlujosCajas.setEnabled(false);
		jTextAreanombre_centro_actividadEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_centro_actividadEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_centro_actividadEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_centro_actividadEstadosFlujosCajas.setLineWrap(true);
		jTextAreanombre_centro_actividadEstadosFlujosCajas.setWrapStyleWord(true);
		jTextAreanombre_centro_actividadEstadosFlujosCajas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_centro_actividadEstadosFlujosCajas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_centro_actividadEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_centro_actividadEstadosFlujosCajas = new JScrollPane(jTextAreanombre_centro_actividadEstadosFlujosCajas);
		jscrollPanenombre_centro_actividadEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_centro_actividadEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_centro_actividadEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda= new JButtonMe();
		this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.setText("U");
		this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_centro_actividadEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_centro_actividadEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_centro_actividadEstadosFlujosCajasBusqueda"));

		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_centro_actividadEstadosFlujosCajas = new JLabelMe();
		this.jLabelcodigo_centro_actividadEstadosFlujosCajas.setText(""+EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD+" : *");
		this.jLabelcodigo_centro_actividadEstadosFlujosCajas.setToolTipText("Codigo Centro Activad");
		this.jLabelcodigo_centro_actividadEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_centro_actividadEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_centro_actividadEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_centro_actividadEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_centro_actividadEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_centro_actividadEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_CODIGOCENTROACTIVIDAD);
		this.gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		this.jPanelcodigo_centro_actividadEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);


		jTextFieldcodigo_centro_actividadEstadosFlujosCajas= new JTextFieldMe();

		jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setEnabled(false);
		jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_centro_actividadEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_centro_actividadEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda= new JButtonMe();
		this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.setText("U");
		this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_centro_actividadEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_centro_actividadEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_centro_actividadEstadosFlujosCajasBusqueda"));

		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda.setVisible(false);		}


					
		this.jLabelmensualEstadosFlujosCajas = new JLabelMe();
		this.jLabelmensualEstadosFlujosCajas.setText(""+EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL+" : *");
		this.jLabelmensualEstadosFlujosCajas.setToolTipText("Mensual");
		this.jLabelmensualEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmensualEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmensualEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmensualEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmensualEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmensualEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_MENSUAL);
		this.gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		this.jPanelmensualEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);


		jTextFieldmensualEstadosFlujosCajas= new JTextFieldMe();
		jTextFieldmensualEstadosFlujosCajas.setEnabled(false);
		jTextFieldmensualEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmensualEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmensualEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmensualEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmensualEstadosFlujosCajas.setText("0.0");

		this.jButtonmensualEstadosFlujosCajasBusqueda= new JButtonMe();
		this.jButtonmensualEstadosFlujosCajasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmensualEstadosFlujosCajasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmensualEstadosFlujosCajasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmensualEstadosFlujosCajasBusqueda.setText("U");
		this.jButtonmensualEstadosFlujosCajasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmensualEstadosFlujosCajasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmensualEstadosFlujosCajasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmensualEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmensualEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mensualEstadosFlujosCajasBusqueda"));

		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmensualEstadosFlujosCajasBusqueda.setVisible(false);		}


					
		this.jLabelacumuladoEstadosFlujosCajas = new JLabelMe();
		this.jLabelacumuladoEstadosFlujosCajas.setText(""+EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO+" : *");
		this.jLabelacumuladoEstadosFlujosCajas.setToolTipText("Acumulado");
		this.jLabelacumuladoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacumuladoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacumuladoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelacumuladoEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelacumuladoEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelacumuladoEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_ACUMULADO);
		this.gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		this.jPanelacumuladoEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);


		jTextFieldacumuladoEstadosFlujosCajas= new JTextFieldMe();
		jTextFieldacumuladoEstadosFlujosCajas.setEnabled(false);
		jTextFieldacumuladoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacumuladoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacumuladoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldacumuladoEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldacumuladoEstadosFlujosCajas.setText("0.0");

		this.jButtonacumuladoEstadosFlujosCajasBusqueda= new JButtonMe();
		this.jButtonacumuladoEstadosFlujosCajasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacumuladoEstadosFlujosCajasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacumuladoEstadosFlujosCajasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonacumuladoEstadosFlujosCajasBusqueda.setText("U");
		this.jButtonacumuladoEstadosFlujosCajasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonacumuladoEstadosFlujosCajasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonacumuladoEstadosFlujosCajasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldacumuladoEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldacumuladoEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"acumuladoEstadosFlujosCajasBusqueda"));

		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonacumuladoEstadosFlujosCajasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadosFlujosCajas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEstadosFlujosCajas = new JLabelMe();
		this.jLabelid_empresaEstadosFlujosCajas.setText(""+EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEstadosFlujosCajas.setToolTipText("Empresa");
		this.jLabelid_empresaEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		this.jPanelid_empresaEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);


		jComboBoxid_empresaEstadosFlujosCajas= new JComboBoxMe();
		jComboBoxid_empresaEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEstadosFlujosCajas.setEnabled(false);

		this.jButtonid_empresaEstadosFlujosCajas= new JButtonMe();
		this.jButtonid_empresaEstadosFlujosCajas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadosFlujosCajas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadosFlujosCajas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadosFlujosCajas.setText("Buscar");
		this.jButtonid_empresaEstadosFlujosCajas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEstadosFlujosCajas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadosFlujosCajas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadosFlujosCajas"));

		this.jButtonid_empresaEstadosFlujosCajasBusqueda= new JButtonMe();
		this.jButtonid_empresaEstadosFlujosCajasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadosFlujosCajasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadosFlujosCajasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadosFlujosCajasBusqueda.setText("U");
		this.jButtonid_empresaEstadosFlujosCajasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEstadosFlujosCajasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadosFlujosCajasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadosFlujosCajasBusqueda"));

		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEstadosFlujosCajasBusqueda.setVisible(false);		}

		this.jButtonid_empresaEstadosFlujosCajasUpdate= new JButtonMe();
		this.jButtonid_empresaEstadosFlujosCajasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadosFlujosCajasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadosFlujosCajasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadosFlujosCajasUpdate.setText("U");
		this.jButtonid_empresaEstadosFlujosCajasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEstadosFlujosCajasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadosFlujosCajasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadosFlujosCajasUpdate"));



					
		this.jLabelid_ejercicioEstadosFlujosCajas = new JLabelMe();
		this.jLabelid_ejercicioEstadosFlujosCajas.setText(""+EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioEstadosFlujosCajas.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		this.jPanelid_ejercicioEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);


		jComboBoxid_ejercicioEstadosFlujosCajas= new JComboBoxMe();
		jComboBoxid_ejercicioEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioEstadosFlujosCajas.setEnabled(false);

		this.jButtonid_ejercicioEstadosFlujosCajas= new JButtonMe();
		this.jButtonid_ejercicioEstadosFlujosCajas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEstadosFlujosCajas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEstadosFlujosCajas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEstadosFlujosCajas.setText("Buscar");
		this.jButtonid_ejercicioEstadosFlujosCajas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioEstadosFlujosCajas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEstadosFlujosCajas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEstadosFlujosCajas"));

		this.jButtonid_ejercicioEstadosFlujosCajasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioEstadosFlujosCajasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEstadosFlujosCajasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEstadosFlujosCajasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEstadosFlujosCajasBusqueda.setText("U");
		this.jButtonid_ejercicioEstadosFlujosCajasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioEstadosFlujosCajasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEstadosFlujosCajasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEstadosFlujosCajasBusqueda"));

		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioEstadosFlujosCajasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioEstadosFlujosCajasUpdate= new JButtonMe();
		this.jButtonid_ejercicioEstadosFlujosCajasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEstadosFlujosCajasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEstadosFlujosCajasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEstadosFlujosCajasUpdate.setText("U");
		this.jButtonid_ejercicioEstadosFlujosCajasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioEstadosFlujosCajasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEstadosFlujosCajasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEstadosFlujosCajasUpdate"));



					
		this.jLabelid_periodoEstadosFlujosCajas = new JLabelMe();
		this.jLabelid_periodoEstadosFlujosCajas.setText(""+EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoEstadosFlujosCajas.setToolTipText("Periodo");
		this.jLabelid_periodoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		this.jPanelid_periodoEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);


		jComboBoxid_periodoEstadosFlujosCajas= new JComboBoxMe();
		jComboBoxid_periodoEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoEstadosFlujosCajas.setEnabled(false);

		this.jButtonid_periodoEstadosFlujosCajas= new JButtonMe();
		this.jButtonid_periodoEstadosFlujosCajas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEstadosFlujosCajas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEstadosFlujosCajas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEstadosFlujosCajas.setText("Buscar");
		this.jButtonid_periodoEstadosFlujosCajas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoEstadosFlujosCajas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEstadosFlujosCajas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEstadosFlujosCajas"));

		this.jButtonid_periodoEstadosFlujosCajasBusqueda= new JButtonMe();
		this.jButtonid_periodoEstadosFlujosCajasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEstadosFlujosCajasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEstadosFlujosCajasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEstadosFlujosCajasBusqueda.setText("U");
		this.jButtonid_periodoEstadosFlujosCajasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoEstadosFlujosCajasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEstadosFlujosCajasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEstadosFlujosCajasBusqueda"));

		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoEstadosFlujosCajasBusqueda.setVisible(false);		}

		this.jButtonid_periodoEstadosFlujosCajasUpdate= new JButtonMe();
		this.jButtonid_periodoEstadosFlujosCajasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEstadosFlujosCajasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEstadosFlujosCajasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEstadosFlujosCajasUpdate.setText("U");
		this.jButtonid_periodoEstadosFlujosCajasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoEstadosFlujosCajasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEstadosFlujosCajasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEstadosFlujosCajasUpdate"));



					
		this.jLabelid_centro_actividadEstadosFlujosCajas = new JLabelMe();
		this.jLabelid_centro_actividadEstadosFlujosCajas.setText(""+EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD+" : *");
		this.jLabelid_centro_actividadEstadosFlujosCajas.setToolTipText("Centro Activad");
		this.jLabelid_centro_actividadEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_actividadEstadosFlujosCajas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_actividadEstadosFlujosCajas.setToolTipText(EstadosFlujosCajasConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
		this.gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		this.jPanelid_centro_actividadEstadosFlujosCajas.setLayout(this.gridaBagLayoutEstadosFlujosCajas);


		jComboBoxid_centro_actividadEstadosFlujosCajas= new JComboBoxMe();
		jComboBoxid_centro_actividadEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_actividadEstadosFlujosCajas= new JButtonMe();
		this.jButtonid_centro_actividadEstadosFlujosCajas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadEstadosFlujosCajas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadEstadosFlujosCajas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadEstadosFlujosCajas.setText("Buscar");
		this.jButtonid_centro_actividadEstadosFlujosCajas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_actividadEstadosFlujosCajas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadEstadosFlujosCajas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_actividadEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadEstadosFlujosCajas"));

		this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda= new JButtonMe();
		this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.setText("U");
		this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_actividadEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadEstadosFlujosCajasBusqueda"));

		if(this.estadosflujoscajasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_actividadEstadosFlujosCajasBusqueda.setVisible(false);		}

		this.jButtonid_centro_actividadEstadosFlujosCajasUpdate= new JButtonMe();
		this.jButtonid_centro_actividadEstadosFlujosCajasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadEstadosFlujosCajasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadEstadosFlujosCajasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadEstadosFlujosCajasUpdate.setText("U");
		this.jButtonid_centro_actividadEstadosFlujosCajasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_actividadEstadosFlujosCajasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadEstadosFlujosCajasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_actividadEstadosFlujosCajas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadEstadosFlujosCajas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadEstadosFlujosCajasUpdate"));



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
		//this.jInternalFrameDetalleEstadosFlujosCajas = new EstadosFlujosCajasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estados Flujos Cajas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadosFlujosCajas= new GridBagLayout();
		

		
		String sToolTipEstadosFlujosCajas="";
		sToolTipEstadosFlujosCajas=EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadosFlujosCajas+="(Contabilidad.EstadosFlujosCajas)";
		}
		
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadosFlujosCajas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadosFlujosCajas = new JButtonMe();
		this.jButtonModificarEstadosFlujosCajas = new JButtonMe();
        this.jButtonActualizarEstadosFlujosCajas = new JButtonMe();
        this.jButtonEliminarEstadosFlujosCajas = new JButtonMe();
        this.jButtonCancelarEstadosFlujosCajas = new JButtonMe();
        this.jButtonGuardarCambiosEstadosFlujosCajas = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas = new JButtonMe();
		this.jButtonCerrarEstadosFlujosCajas = new JButtonMe();
		
		this.jScrollPanelDatosEstadosFlujosCajas = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadosFlujosCajas = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadosFlujosCajas = new JScrollPane();
				
		
		
		this.jPanelCamposEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estados Flujos Cajas";
		
		if(!this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados Flujos Cajases" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadosFlujosCajas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadosFlujosCajas.setName("jPanelCamposEstadosFlujosCajas"); 

		this.jPanelCamposOcultosEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadosFlujosCajas.setName("jPanelCamposOcultosEstadosFlujosCajas"); 

        this.jPanelAccionesEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadosFlujosCajas.setToolTipText("Acciones");
        this.jPanelAccionesEstadosFlujosCajas.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadosFlujosCajas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadosFlujosCajas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadosFlujosCajas.setText("Nuevo");
		this.jButtonModificarEstadosFlujosCajas.setText("Editar");
        this.jButtonActualizarEstadosFlujosCajas.setText("Actualizar");
        this.jButtonEliminarEstadosFlujosCajas.setText("Eliminar");
        this.jButtonCancelarEstadosFlujosCajas.setText("Cancelar");
        this.jButtonGuardarCambiosEstadosFlujosCajas.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.setText("Guardar");
		this.jButtonCerrarEstadosFlujosCajas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadosFlujosCajas,"nuevo_button","Nuevo",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadosFlujosCajas,"modificar_button","Editar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadosFlujosCajas,"actualizar_button","Actualizar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadosFlujosCajas,"eliminar_button","Eliminar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadosFlujosCajas,"cancelar_button","Cancelar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadosFlujosCajas,"guardarcambios_button","Guardar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadosFlujosCajas,"guardarcambiostabla_button","Guardar",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadosFlujosCajas,"cerrar_button","Salir",this.estadosflujoscajasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadosFlujosCajas.setToolTipText("Nuevo"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadosFlujosCajas.setToolTipText("Editar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadosFlujosCajas.setToolTipText("Actualizar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadosFlujosCajas.setToolTipText("Eliminar)"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadosFlujosCajas.setToolTipText("Cancelar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadosFlujosCajas.setToolTipText("Guardar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.setToolTipText("Guardar"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadosFlujosCajas.setToolTipText("Salir"+" "+EstadosFlujosCajasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadosFlujosCajas";
		inputMap = this.jButtonNuevoEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadosFlujosCajas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadosFlujosCajas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadosFlujosCajas";
		inputMap = this.jButtonActualizarEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadosFlujosCajas"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadosFlujosCajas";
		inputMap = this.jButtonEliminarEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadosFlujosCajas"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadosFlujosCajas";
		inputMap = this.jButtonCancelarEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadosFlujosCajas"));
		
		//CERRAR		
		sMapKey = "CerrarEstadosFlujosCajas";
		inputMap = this.jButtonCerrarEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadosFlujosCajas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadosFlujosCajas";
		inputMap = this.jButtonGuardarCambiosTablaEstadosFlujosCajas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadosFlujosCajas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadosFlujosCajas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadosFlujosCajas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadosFlujosCajas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadosFlujosCajas.setToolTipText("Nuevo EstadosFlujosCajas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadosFlujosCajas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadosFlujosCajas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadosFlujosCajas.setToolTipText("Sin Cerrar Ventana EstadosFlujosCajas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadosFlujosCajas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadosFlujosCajas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadosFlujosCajas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadosFlujosCajas.setText("Accion");
		this.jComboBoxTiposAccionesEstadosFlujosCajas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadosFlujosCajas = new JLabelMe();
		
		this.jLabelAccionesEstadosFlujosCajas.setText("Acciones");		
		this.jLabelAccionesEstadosFlujosCajas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadosFlujosCajas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadosFlujosCajas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadosFlujosCajas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadosFlujosCajas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadosFlujosCajas=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadosFlujosCajas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadosFlujosCajas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadosFlujosCajas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadosFlujosCajas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadosFlujosCajas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadosFlujosCajas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadosFlujosCajas = new GridBagLayout();
		
		this.jPanelCamposEstadosFlujosCajas.setLayout(gridaBagLayoutCamposEstadosFlujosCajas);
		this.jPanelCamposOcultosEstadosFlujosCajas.setLayout(gridaBagLayoutCamposOcultosEstadosFlujosCajas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadosFlujosCajas.add(jLabelIdEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadosFlujosCajas.add(jLabelidEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEstadosFlujosCajas.add(jLabelid_empresaEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 2;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadosFlujosCajas.add(jButtonid_empresaEstadosFlujosCajasBusqueda, this.gridBagConstraintsEstadosFlujosCajas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 3;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadosFlujosCajas.add(jButtonid_empresaEstadosFlujosCajasUpdate, this.gridBagConstraintsEstadosFlujosCajas);
	}

	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEstadosFlujosCajas.add(jComboBoxid_empresaEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioEstadosFlujosCajas.add(jLabelid_ejercicioEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 2;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEstadosFlujosCajas.add(jButtonid_ejercicioEstadosFlujosCajasBusqueda, this.gridBagConstraintsEstadosFlujosCajas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 3;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEstadosFlujosCajas.add(jButtonid_ejercicioEstadosFlujosCajasUpdate, this.gridBagConstraintsEstadosFlujosCajas);
	}

	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioEstadosFlujosCajas.add(jComboBoxid_ejercicioEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoEstadosFlujosCajas.add(jLabelid_periodoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 2;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEstadosFlujosCajas.add(jButtonid_periodoEstadosFlujosCajasBusqueda, this.gridBagConstraintsEstadosFlujosCajas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 3;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEstadosFlujosCajas.add(jButtonid_periodoEstadosFlujosCajasUpdate, this.gridBagConstraintsEstadosFlujosCajas);
	}

	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoEstadosFlujosCajas.add(jComboBoxid_periodoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_actividadEstadosFlujosCajas.add(jLabelid_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 2;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadEstadosFlujosCajas.add(jButtonid_centro_actividadEstadosFlujosCajasBusqueda, this.gridBagConstraintsEstadosFlujosCajas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 3;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadEstadosFlujosCajas.add(jButtonid_centro_actividadEstadosFlujosCajasUpdate, this.gridBagConstraintsEstadosFlujosCajas);
	}

	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_actividadEstadosFlujosCajas.add(jComboBoxid_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_centro_actividadEstadosFlujosCajas.add(jLabelnombre_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 2;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_centro_actividadEstadosFlujosCajas.add(jButtonnombre_centro_actividadEstadosFlujosCajasBusqueda, this.gridBagConstraintsEstadosFlujosCajas);
	}

	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_centro_actividadEstadosFlujosCajas.add(jscrollPanenombre_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_centro_actividadEstadosFlujosCajas.add(jLabelcodigo_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 2;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_centro_actividadEstadosFlujosCajas.add(jButtoncodigo_centro_actividadEstadosFlujosCajasBusqueda, this.gridBagConstraintsEstadosFlujosCajas);
	}

	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_centro_actividadEstadosFlujosCajas.add(jTextFieldcodigo_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmensualEstadosFlujosCajas.add(jLabelmensualEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 2;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelmensualEstadosFlujosCajas.add(jButtonmensualEstadosFlujosCajasBusqueda, this.gridBagConstraintsEstadosFlujosCajas);
	}

	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmensualEstadosFlujosCajas.add(jTextFieldmensualEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelacumuladoEstadosFlujosCajas.add(jLabelacumuladoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		//this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 2;
		this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
		this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(0, 0, 0, 0);
		this.jPanelacumuladoEstadosFlujosCajas.add(jButtonacumuladoEstadosFlujosCajasBusqueda, this.gridBagConstraintsEstadosFlujosCajas);
	}

	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = 1;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelacumuladoEstadosFlujosCajas.add(jTextFieldacumuladoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosFlujosCajas.add(this.jPanelidEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposEstadosFlujosCajas % 1==0) {
		iXPanelCamposEstadosFlujosCajas=0;
		iYPanelCamposEstadosFlujosCajas++;
	}
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosFlujosCajas.add(this.jPanelid_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposEstadosFlujosCajas % 1==0) {
		iXPanelCamposEstadosFlujosCajas=0;
		iYPanelCamposEstadosFlujosCajas++;
	}
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosFlujosCajas.add(this.jPanelnombre_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposEstadosFlujosCajas % 1==0) {
		iXPanelCamposEstadosFlujosCajas=0;
		iYPanelCamposEstadosFlujosCajas++;
	}
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosFlujosCajas.add(this.jPanelcodigo_centro_actividadEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposEstadosFlujosCajas % 1==0) {
		iXPanelCamposEstadosFlujosCajas=0;
		iYPanelCamposEstadosFlujosCajas++;
	}
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosFlujosCajas.add(this.jPanelmensualEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposEstadosFlujosCajas % 1==0) {
		iXPanelCamposEstadosFlujosCajas=0;
		iYPanelCamposEstadosFlujosCajas++;
	}
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadosFlujosCajas.add(this.jPanelacumuladoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposEstadosFlujosCajas % 1==0) {
		iXPanelCamposEstadosFlujosCajas=0;
		iYPanelCamposEstadosFlujosCajas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposOcultosEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposOcultosEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadosFlujosCajas.add(this.jPanelid_empresaEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposOcultosEstadosFlujosCajas % 1==0) {
		iXPanelCamposOcultosEstadosFlujosCajas=0;
		iYPanelCamposOcultosEstadosFlujosCajas++;
	}
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposOcultosEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposOcultosEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadosFlujosCajas.add(this.jPanelid_ejercicioEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposOcultosEstadosFlujosCajas % 1==0) {
		iXPanelCamposOcultosEstadosFlujosCajas=0;
		iYPanelCamposOcultosEstadosFlujosCajas++;
	}
	this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadosFlujosCajas.gridy = iYPanelCamposOcultosEstadosFlujosCajas;
	this.gridBagConstraintsEstadosFlujosCajas.gridx = iXPanelCamposOcultosEstadosFlujosCajas++;
	this.gridBagConstraintsEstadosFlujosCajas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadosFlujosCajas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadosFlujosCajas.add(this.jPanelid_periodoEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);



	if(iXPanelCamposOcultosEstadosFlujosCajas % 1==0) {
		iXPanelCamposOcultosEstadosFlujosCajas=0;
		iYPanelCamposOcultosEstadosFlujosCajas++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadosFlujosCajas= new GridBagLayout();
		this.jPanelAccionesEstadosFlujosCajas.setLayout(gridaBagLayoutAccionesEstadosFlujosCajas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadosFlujosCajas= new GridBagLayout();
		this.jPanelAccionesFormularioEstadosFlujosCajas.setLayout(gridaBagLayoutAccionesFormularioEstadosFlujosCajas);
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadosFlujosCajas.add(this.jComboBoxTiposAccionesFormularioEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadosFlujosCajas.add(this.jButtonModificarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);							

		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;
		this.gridBagConstraintsEstadosFlujosCajas.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadosFlujosCajas.add(this.jButtonEliminarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
			
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadosFlujosCajas.add(this.jButtonActualizarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);


		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadosFlujosCajas.add(this.jButtonGuardarCambiosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);	
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = 0;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadosFlujosCajas.add(this.jButtonCancelarEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadosFlujosCajas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadosFlujosCajas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadosflujoscajasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();						
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;		
			//this.gridBagConstraintsEstadosFlujosCajas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadosFlujosCajas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadosFlujosCajas.gridx =0;
		this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadosFlujosCajas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadosFlujosCajasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadosFlujosCajas = new EstadosFlujosCajasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estados Flujos Cajas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estados Flujos Cajas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estados Flujos Cajas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadosFlujosCajasModel estadosflujoscajasModel=new EstadosFlujosCajasModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadosFlujosCajasModel.EstadosFlujosCajasFocusTraversalPolicy estadosflujoscajasFocusTraversalPolicy = estadosflujoscajasModel.new EstadosFlujosCajasFocusTraversalPolicy(this);
			
			//estadosflujoscajasFocusTraversalPolicy.setestadosflujoscajasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadosflujoscajasModel);
			
			
			this.jContentPaneDetalleEstadosFlujosCajas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadosFlujosCajas = new GridBagLayout();	
			this.jContentPaneDetalleEstadosFlujosCajas.setLayout(gridaBagLayoutDetalleEstadosFlujosCajas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadosFlujosCajas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
				this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
					
				
				this.jContentPaneDetalleEstadosFlujosCajas.add(jTtoolBarDetalleEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);								
				
}
			
			this.jScrollPanelDatosEdicionEstadosFlujosCajas=   new JScrollPane(jContentPaneDetalleEstadosFlujosCajas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadosFlujosCajas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	        
			this.jContentPaneDetalleEstadosFlujosCajas.add(jPanelCamposEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);
			
			
			
			
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
						//&& estadosflujoscajasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadosflujoscajasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadosFlujosCajas= new GridBagConstraints();
						this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
						this.jContentPaneDetalleEstadosFlujosCajas.add(this.jTabbedPaneRelacionesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadosFlujosCajas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadosFlujosCajas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
					this.gridBagConstraintsEstadosFlujosCajas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
					
				
					this.jContentPaneDetalleEstadosFlujosCajas.add(jPanelCamposOcultosEstadosFlujosCajas, gridBagConstraintsEstadosFlujosCajas);
				
					this.jPanelCamposOcultosEstadosFlujosCajas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	        this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadosFlujosCajas.add(this.jPanelAccionesFormularioEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);							
			
			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
	        this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadosFlujosCajas.add(this.jPanelAccionesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadosFlujosCajas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadosFlujosCajas=   new JScrollPane(this.jPanelCamposEstadosFlujosCajas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadosFlujosCajas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadosFlujosCajas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadosFlujosCajas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
			this.gridBagConstraintsEstadosFlujosCajas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadosFlujosCajas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadosFlujosCajas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);			
			
			this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
			this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
			
			
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		
			
		this.gridBagConstraintsEstadosFlujosCajas = new GridBagConstraints();
		this.gridBagConstraintsEstadosFlujosCajas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadosFlujosCajas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadosFlujosCajas, this.gridBagConstraintsEstadosFlujosCajas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadosFlujosCajas;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadosFlujosCajas;
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
