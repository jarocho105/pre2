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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.CargaFamiliarConstantesFunciones;

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
public class CargaFamiliarDetalleFormJInternalFrame extends CargaFamiliarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCargaFamiliar;
	
	protected JMenuBar jmenuBarDetalleCargaFamiliar;
	
	protected JMenu jmenuDetalleCargaFamiliar;
	protected JMenu jmenuDetalleArchivoCargaFamiliar;
	protected JMenu jmenuDetalleAccionesCargaFamiliar;
	protected JMenu jmenuDetalleDatosCargaFamiliar;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargaFamiliar;	
	protected GridBagConstraints gridBagConstraintsCargaFamiliar;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CargaFamiliarBeanSwingJInternalFrameAdditional jInternalFrameDetalleCargaFamiliar;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoCargaFamiBeanSwingJInternalFrame tipocargafamiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocargafami="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";
	
	public CargaFamiliarSessionBean cargafamiliarSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoCargaFamiSessionBean tipocargafamiSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;	
	
	public CargaFamiliarLogic cargafamiliarLogic;
	
	public JScrollPane jScrollPanelDatosCargaFamiliar;
	public JScrollPane jScrollPanelDatosEdicionCargaFamiliar;
	public JScrollPane jScrollPanelDatosGeneralCargaFamiliar;
	
	protected JPanel jPanelCamposCargaFamiliar;    
	protected JPanel jPanelCamposOcultosCargaFamiliar;    	
	protected JPanel jPanelAccionesCargaFamiliar;
	protected JPanel jPanelAccionesFormularioCargaFamiliar;
    
	
	
	protected Integer iXPanelCamposCargaFamiliar=0;
	protected Integer iYPanelCamposCargaFamiliar=0;
	
	protected Integer iXPanelCamposOcultosCargaFamiliar=0;
	protected Integer iYPanelCamposOcultosCargaFamiliar=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCargaFamiliar;
	public JButton jButtonModificarCargaFamiliar;
	public JButton jButtonActualizarCargaFamiliar;
    public JButton jButtonEliminarCargaFamiliar;
	public JButton jButtonCancelarCargaFamiliar;
    public JButton jButtonGuardarCambiosCargaFamiliar;
	public JButton jButtonGuardarCambiosTablaCargaFamiliar;
	protected JButton jButtonCerrarCargaFamiliar;
	
	
	protected JButton jButtonProcesarInformacionCargaFamiliar;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCargaFamiliar;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCargaFamiliar;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCargaFamiliar;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargaFamiliar;
	protected JButton jButtonModificarToolBarCargaFamiliar;
	protected JButton jButtonActualizarToolBarCargaFamiliar;
    protected JButton jButtonEliminarToolBarCargaFamiliar;
	protected JButton jButtonCancelarToolBarCargaFamiliar;
    protected JButton jButtonGuardarCambiosToolBarCargaFamiliar;
	protected JButton jButtonGuardarCambiosTablaToolBarCargaFamiliar;
	protected JButton jButtonMostrarOcultarTablaToolBarCargaFamiliar;
	protected JButton jButtonCerrarToolBarCargaFamiliar;
	
	protected JButton jButtonProcesarInformacionToolBarCargaFamiliar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargaFamiliar;
	protected JMenuItem jMenuItemModificarCargaFamiliar;
	protected JMenuItem jMenuItemActualizarCargaFamiliar;
    protected JMenuItem jMenuItemEliminarCargaFamiliar;
	protected JMenuItem jMenuItemCancelarCargaFamiliar;
    protected JMenuItem jMenuItemGuardarCambiosCargaFamiliar;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargaFamiliar;
	protected JMenuItem jMenuItemCerrarCargaFamiliar;
	protected JMenuItem jMenuItemDetalleCerrarCargaFamiliar;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargaFamiliar;
	
	protected JMenuItem jMenuItemProcesarInformacionCargaFamiliar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargaFamiliar;
	protected JMenuItem jMenuItemMostrarOcultarCargaFamiliar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCargaFamiliar;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargaFamiliar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargaFamiliar;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCargaFamiliar;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCargaFamiliar;
	public JLabel jLabelIdCargaFamiliar;
	public JLabel jLabelidCargaFamiliar;
	public JButton jButtonidCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelcedulaCargaFamiliar;
	public JLabel jLabelcedulaCargaFamiliar;
	public JTextField jTextFieldcedulaCargaFamiliar;
	public JButton jButtoncedulaCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelapellidoCargaFamiliar;
	public JLabel jLabelapellidoCargaFamiliar;
	public JTextArea jTextAreaapellidoCargaFamiliar;
	public JScrollPane jscrollPaneapellidoCargaFamiliar;
	public JButton jButtonapellidoCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelnombreCargaFamiliar;
	public JLabel jLabelnombreCargaFamiliar;
	public JTextArea jTextAreanombreCargaFamiliar;
	public JScrollPane jscrollPanenombreCargaFamiliar;
	public JButton jButtonnombreCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPaneldireccionCargaFamiliar;
	public JLabel jLabeldireccionCargaFamiliar;
	public JTextArea jTextAreadireccionCargaFamiliar;
	public JScrollPane jscrollPanedireccionCargaFamiliar;
	public JButton jButtondireccionCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimientoCargaFamiliar;
	public JLabel jLabelfecha_nacimientoCargaFamiliar;
	//public JFormattedTextField jDateChooserfecha_nacimientoCargaFamiliar;

	public JDateChooser jDateChooserfecha_nacimientoCargaFamiliar;
	public JButton jButtonfecha_nacimientoCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelvalor_cupoCargaFamiliar;
	public JLabel jLabelvalor_cupoCargaFamiliar;
	public JTextField jTextFieldvalor_cupoCargaFamiliar;
	public JButton jButtonvalor_cupoCargaFamiliarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCargaFamiliar;
	public JLabel jLabelid_empresaCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCargaFamiliar;
	public JButton jButtonid_empresaCargaFamiliar= new JButtonMe();
	public JButton jButtonid_empresaCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_empresaCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteCargaFamiliar;
	public JLabel jLabelid_clienteCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteCargaFamiliar;
	public JButton jButtonid_clienteCargaFamiliar= new JButtonMe();
	public JButton jButtonid_clienteCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_clienteCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_carga_famiCargaFamiliar;
	public JLabel jLabelid_tipo_carga_famiCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_carga_famiCargaFamiliar;
	public JButton jButtonid_tipo_carga_famiCargaFamiliar= new JButtonMe();
	public JButton jButtonid_tipo_carga_famiCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_carga_famiCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_generoCargaFamiliar;
	public JLabel jLabelid_tipo_generoCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoCargaFamiliar;
	public JButton jButtonid_tipo_generoCargaFamiliar= new JButtonMe();
	public JButton jButtonid_tipo_generoCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoCargaFamiliarBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_civilCargaFamiliar;
	public JLabel jLabelid_estado_civilCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilCargaFamiliar;
	public JButton jButtonid_estado_civilCargaFamiliar= new JButtonMe();
	public JButton jButtonid_estado_civilCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilCargaFamiliarBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCargaFamiliar;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CargaFamiliarDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCargaFamiliar=new JPanel();
				this.jPanelAccionesFormularioCargaFamiliar=new JPanel();
				this.jmenuBarDetalleCargaFamiliar=new JMenuBar();
				this.jTtoolBarDetalleCargaFamiliar=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliarDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CargaFamiliarDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliarDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliarDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliarDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCargaFamiliar() {
		return this.jButtonActualizarToolBarCargaFamiliar;
	}
	
	public JButton getjButtonEliminarToolBarCargaFamiliar() {
		return this.jButtonEliminarToolBarCargaFamiliar;
	}
	
	public JButton getjButtonCancelarToolBarCargaFamiliar() {
		return this.jButtonCancelarToolBarCargaFamiliar;
	}		
	
	public JButton getjButtonProcesarInformacionCargaFamiliar() {
		return this.jButtonProcesarInformacionCargaFamiliar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargaFamiliar)	{
		this.jButtonProcesarInformacionCargaFamiliar = jButtonProcesarInformacionCargaFamiliar;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargaFamiliar() {
		return this.jComboBoxTiposAccionesCargaFamiliar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargaFamiliar(
			JComboBox jComboBoxTiposRelacionesCargaFamiliar) {
		this.jComboBoxTiposRelacionesCargaFamiliar = jComboBoxTiposRelacionesCargaFamiliar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargaFamiliar(
			JComboBox jComboBoxTiposAccionesCargaFamiliar) {
		this.jComboBoxTiposAccionesCargaFamiliar = jComboBoxTiposAccionesCargaFamiliar;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCargaFamiliar() {
		return this.jComboBoxTiposAccionesFormularioCargaFamiliar;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCargaFamiliar(
			JComboBox jComboBoxTiposAccionesFormularioCargaFamiliar) {
		this.jComboBoxTiposAccionesFormularioCargaFamiliar = jComboBoxTiposAccionesFormularioCargaFamiliar;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		
		this.cargafamiliarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargafamiliarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargafamiliarSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargaFamiliarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Carga Familiar MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
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
	
		CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCargaFamiliar= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCargaFamiliar=new JButtonMe();
				this.jButtonModificarToolBarCargaFamiliar=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCargaFamiliar,this.jTtoolBarDetalleCargaFamiliar,
							"actualizar","actualizar","Actualizar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCargaFamiliar,this.jTtoolBarDetalleCargaFamiliar,
							"eliminar","eliminar","Eliminar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCargaFamiliar,this.jTtoolBarDetalleCargaFamiliar,
							"cancelar","cancelar","Cancelar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCargaFamiliar,this.jTtoolBarDetalleCargaFamiliar,
							"guardarcambios","guardarcambios","Guardar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCargaFamiliar=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCargaFamiliar=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCargaFamiliar=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCargaFamiliar=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCargaFamiliar=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargaFamiliar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargaFamiliar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargaFamiliar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCargaFamiliar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCargaFamiliar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCargaFamiliar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCargaFamiliar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCargaFamiliar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCargaFamiliar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCargaFamiliar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCargaFamiliar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCargaFamiliar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCargaFamiliar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCargaFamiliar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCargaFamiliar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCargaFamiliar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargaFamiliar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargaFamiliar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargaFamiliar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargaFamiliar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargaFamiliar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCargaFamiliar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCargaFamiliar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCargaFamiliar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargaFamiliar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargaFamiliar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargaFamiliar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargaFamiliar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargaFamiliar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargaFamiliar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCargaFamiliar.add(this.jMenuItemDetalleCerrarCargaFamiliar);
		
		this.jmenuDetalleAccionesCargaFamiliar.add(this.jMenuItemActualizarCargaFamiliar);
		this.jmenuDetalleAccionesCargaFamiliar.add(this.jMenuItemEliminarCargaFamiliar);
		this.jmenuDetalleAccionesCargaFamiliar.add(this.jMenuItemCancelarCargaFamiliar);		
		
		//this.jmenuDetalleDatosCargaFamiliar.add(this.jMenuItemDetalleAbrirOrderByCargaFamiliar);				
		this.jmenuDetalleDatosCargaFamiliar.add(this.jMenuItemDetalleMostarOcultarCargaFamiliar);				
				
		//this.jmenuDetalleAccionesCargaFamiliar.add(this.jMenuItemGuardarCambiosCargaFamiliar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCargaFamiliar.add(this.jmenuDetalleArchivoCargaFamiliar);		
		this.jmenuBarDetalleCargaFamiliar.add(this.jmenuDetalleAccionesCargaFamiliar);		
		this.jmenuBarDetalleCargaFamiliar.add(this.jmenuDetalleDatosCargaFamiliar);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCargaFamiliar);				
	}
	
	
	public void inicializarElementosCamposCargaFamiliar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCargaFamiliar = new JLabelMe();
		jLabelIdCargaFamiliar.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCargaFamiliar = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCargaFamiliar= new GridBagLayout();

		this.jPanelidCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);

		jLabelidCargaFamiliar = new JLabel();
		jLabelidCargaFamiliar.setText("Id");

		jLabelidCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcedulaCargaFamiliar = new JLabelMe();
		this.jLabelcedulaCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_CEDULA+" : *");
		this.jLabelcedulaCargaFamiliar.setToolTipText("Cedula");
		this.jLabelcedulaCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcedulaCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcedulaCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcedulaCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_CEDULA);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelcedulaCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jTextFieldcedulaCargaFamiliar= new JTextFieldMe();

		jTextFieldcedulaCargaFamiliar.setEnabled(false);
		jTextFieldcedulaCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcedulaCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncedulaCargaFamiliarBusqueda= new JButtonMe();
		this.jButtoncedulaCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncedulaCargaFamiliarBusqueda.setText("U");
		this.jButtoncedulaCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncedulaCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncedulaCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcedulaCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcedulaCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cedulaCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncedulaCargaFamiliarBusqueda.setVisible(false);		}


					
		this.jLabelapellidoCargaFamiliar = new JLabelMe();
		this.jLabelapellidoCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoCargaFamiliar.setToolTipText("Apellido");
		this.jLabelapellidoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelapellidoCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jTextAreaapellidoCargaFamiliar= new JTextAreaMe();
		jTextAreaapellidoCargaFamiliar.setEnabled(false);
		jTextAreaapellidoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCargaFamiliar.setLineWrap(true);
		jTextAreaapellidoCargaFamiliar.setWrapStyleWord(true);
		jTextAreaapellidoCargaFamiliar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoCargaFamiliar.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoCargaFamiliar = new JScrollPane(jTextAreaapellidoCargaFamiliar);
		jscrollPaneapellidoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonapellidoCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoCargaFamiliarBusqueda.setText("U");
		this.jButtonapellidoCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoCargaFamiliarBusqueda.setVisible(false);		}


					
		this.jLabelnombreCargaFamiliar = new JLabelMe();
		this.jLabelnombreCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCargaFamiliar.setToolTipText("Nombre");
		this.jLabelnombreCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelnombreCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jTextAreanombreCargaFamiliar= new JTextAreaMe();
		jTextAreanombreCargaFamiliar.setEnabled(false);
		jTextAreanombreCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargaFamiliar.setLineWrap(true);
		jTextAreanombreCargaFamiliar.setWrapStyleWord(true);
		jTextAreanombreCargaFamiliar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCargaFamiliar.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCargaFamiliar = new JScrollPane(jTextAreanombreCargaFamiliar);
		jscrollPanenombreCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonnombreCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCargaFamiliarBusqueda.setText("U");
		this.jButtonnombreCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCargaFamiliarBusqueda.setVisible(false);		}


					
		this.jLabeldireccionCargaFamiliar = new JLabelMe();
		this.jLabeldireccionCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionCargaFamiliar.setToolTipText("Direccion");
		this.jLabeldireccionCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPaneldireccionCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jTextAreadireccionCargaFamiliar= new JTextAreaMe();
		jTextAreadireccionCargaFamiliar.setEnabled(false);
		jTextAreadireccionCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCargaFamiliar.setLineWrap(true);
		jTextAreadireccionCargaFamiliar.setWrapStyleWord(true);
		jTextAreadireccionCargaFamiliar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionCargaFamiliar.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionCargaFamiliar = new JScrollPane(jTextAreadireccionCargaFamiliar);
		jscrollPanedireccionCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionCargaFamiliarBusqueda= new JButtonMe();
		this.jButtondireccionCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionCargaFamiliarBusqueda.setText("U");
		this.jButtondireccionCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionCargaFamiliarBusqueda.setVisible(false);		}


					
		this.jLabelfecha_nacimientoCargaFamiliar = new JLabelMe();
		this.jLabelfecha_nacimientoCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO+" : *");
		this.jLabelfecha_nacimientoCargaFamiliar.setToolTipText("Fecha Nacimiento");
		this.jLabelfecha_nacimientoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimientoCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimientoCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_FECHANACIMIENTO);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelfecha_nacimientoCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		//jFormattedTextFieldfecha_nacimientoCargaFamiliar= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimientoCargaFamiliar= new JDateChooser();
		jDateChooserfecha_nacimientoCargaFamiliar.setEnabled(false);
		jDateChooserfecha_nacimientoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimientoCargaFamiliar.setDate(new Date());
		jDateChooserfecha_nacimientoCargaFamiliar.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimientoCargaFamiliar.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimientoCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonfecha_nacimientoCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimientoCargaFamiliarBusqueda.setText("U");
		this.jButtonfecha_nacimientoCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimientoCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimientoCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimientoCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimientoCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimientoCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimientoCargaFamiliarBusqueda.setVisible(false);		}


					
		this.jLabelvalor_cupoCargaFamiliar = new JLabelMe();
		this.jLabelvalor_cupoCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_VALORCUPO+" : *");
		this.jLabelvalor_cupoCargaFamiliar.setToolTipText("Valor Cupo");
		this.jLabelvalor_cupoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_cupoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_cupoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_cupoCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_cupoCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_cupoCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_VALORCUPO);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelvalor_cupoCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jTextFieldvalor_cupoCargaFamiliar= new JTextFieldMe();
		jTextFieldvalor_cupoCargaFamiliar.setEnabled(false);
		jTextFieldvalor_cupoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cupoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cupoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_cupoCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_cupoCargaFamiliar.setText("0.0");

		this.jButtonvalor_cupoCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonvalor_cupoCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cupoCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cupoCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_cupoCargaFamiliarBusqueda.setText("U");
		this.jButtonvalor_cupoCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_cupoCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_cupoCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_cupoCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_cupoCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_cupoCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_cupoCargaFamiliarBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCargaFamiliar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCargaFamiliar = new JLabelMe();
		this.jLabelid_empresaCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCargaFamiliar.setToolTipText("Empresa");
		this.jLabelid_empresaCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelid_empresaCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jComboBoxid_empresaCargaFamiliar= new JComboBoxMe();
		jComboBoxid_empresaCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCargaFamiliar.setEnabled(false);

		this.jButtonid_empresaCargaFamiliar= new JButtonMe();
		this.jButtonid_empresaCargaFamiliar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargaFamiliar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargaFamiliar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargaFamiliar.setText("Buscar");
		this.jButtonid_empresaCargaFamiliar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCargaFamiliar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargaFamiliar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargaFamiliar"));

		this.jButtonid_empresaCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonid_empresaCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargaFamiliarBusqueda.setText("U");
		this.jButtonid_empresaCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCargaFamiliarBusqueda.setVisible(false);		}

		this.jButtonid_empresaCargaFamiliarUpdate= new JButtonMe();
		this.jButtonid_empresaCargaFamiliarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargaFamiliarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargaFamiliarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargaFamiliarUpdate.setText("U");
		this.jButtonid_empresaCargaFamiliarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCargaFamiliarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargaFamiliarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargaFamiliarUpdate"));



					
		this.jLabelid_clienteCargaFamiliar = new JLabelMe();
		this.jLabelid_clienteCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteCargaFamiliar.setToolTipText("Cliente");
		this.jLabelid_clienteCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelid_clienteCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jComboBoxid_clienteCargaFamiliar= new JComboBoxMe();
		jComboBoxid_clienteCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteCargaFamiliar= new JButtonMe();
		this.jButtonid_clienteCargaFamiliar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCargaFamiliar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCargaFamiliar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCargaFamiliar.setText("Buscar");
		this.jButtonid_clienteCargaFamiliar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteCargaFamiliar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCargaFamiliar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCargaFamiliar"));

		this.jButtonid_clienteCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonid_clienteCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCargaFamiliarBusqueda.setText("U");
		this.jButtonid_clienteCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteCargaFamiliarBusqueda.setVisible(false);		}

		this.jButtonid_clienteCargaFamiliarUpdate= new JButtonMe();
		this.jButtonid_clienteCargaFamiliarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCargaFamiliarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCargaFamiliarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCargaFamiliarUpdate.setText("U");
		this.jButtonid_clienteCargaFamiliarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteCargaFamiliarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCargaFamiliarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCargaFamiliarUpdate"));



					
		this.jLabelid_tipo_carga_famiCargaFamiliar = new JLabelMe();
		this.jLabelid_tipo_carga_famiCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI+" : *");
		this.jLabelid_tipo_carga_famiCargaFamiliar.setToolTipText("Tipo Carga Fami");
		this.jLabelid_tipo_carga_famiCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_carga_famiCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_carga_famiCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_carga_famiCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_carga_famiCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_carga_famiCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_IDTIPOCARGAFAMI);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelid_tipo_carga_famiCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jComboBoxid_tipo_carga_famiCargaFamiliar= new JComboBoxMe();
		jComboBoxid_tipo_carga_famiCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_carga_famiCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_carga_famiCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_carga_famiCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_carga_famiCargaFamiliar= new JButtonMe();
		this.jButtonid_tipo_carga_famiCargaFamiliar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_carga_famiCargaFamiliar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_carga_famiCargaFamiliar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_carga_famiCargaFamiliar.setText("Buscar");
		this.jButtonid_tipo_carga_famiCargaFamiliar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_carga_famiCargaFamiliar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_carga_famiCargaFamiliar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_carga_famiCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_carga_famiCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_carga_famiCargaFamiliar"));

		this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.setText("U");
		this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_carga_famiCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_carga_famiCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_carga_famiCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_carga_famiCargaFamiliarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_carga_famiCargaFamiliarUpdate= new JButtonMe();
		this.jButtonid_tipo_carga_famiCargaFamiliarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_carga_famiCargaFamiliarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_carga_famiCargaFamiliarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_carga_famiCargaFamiliarUpdate.setText("U");
		this.jButtonid_tipo_carga_famiCargaFamiliarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_carga_famiCargaFamiliarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_carga_famiCargaFamiliarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_carga_famiCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_carga_famiCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_carga_famiCargaFamiliarUpdate"));



					
		this.jLabelid_tipo_generoCargaFamiliar = new JLabelMe();
		this.jLabelid_tipo_generoCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO+" : *");
		this.jLabelid_tipo_generoCargaFamiliar.setToolTipText("Tipo Genero");
		this.jLabelid_tipo_generoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_generoCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_generoCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_IDTIPOGENERO);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelid_tipo_generoCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jComboBoxid_tipo_generoCargaFamiliar= new JComboBoxMe();
		jComboBoxid_tipo_generoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_generoCargaFamiliar= new JButtonMe();
		this.jButtonid_tipo_generoCargaFamiliar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCargaFamiliar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCargaFamiliar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCargaFamiliar.setText("Buscar");
		this.jButtonid_tipo_generoCargaFamiliar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_generoCargaFamiliar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoCargaFamiliar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_generoCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoCargaFamiliar"));

		this.jButtonid_tipo_generoCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonid_tipo_generoCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoCargaFamiliarBusqueda.setText("U");
		this.jButtonid_tipo_generoCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_generoCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_generoCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_generoCargaFamiliarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_generoCargaFamiliarUpdate= new JButtonMe();
		this.jButtonid_tipo_generoCargaFamiliarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoCargaFamiliarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoCargaFamiliarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoCargaFamiliarUpdate.setText("U");
		this.jButtonid_tipo_generoCargaFamiliarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_generoCargaFamiliarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoCargaFamiliarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_generoCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoCargaFamiliarUpdate"));



					
		this.jLabelid_estado_civilCargaFamiliar = new JLabelMe();
		this.jLabelid_estado_civilCargaFamiliar.setText(""+CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL+" : *");
		this.jLabelid_estado_civilCargaFamiliar.setToolTipText("Estado Civil");
		this.jLabelid_estado_civilCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_civilCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_civilCargaFamiliar.setToolTipText(CargaFamiliarConstantesFunciones.LABEL_IDESTADOCIVIL);
		this.gridaBagLayoutCargaFamiliar = new GridBagLayout();
		this.jPanelid_estado_civilCargaFamiliar.setLayout(this.gridaBagLayoutCargaFamiliar);


		jComboBoxid_estado_civilCargaFamiliar= new JComboBoxMe();
		jComboBoxid_estado_civilCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_civilCargaFamiliar= new JButtonMe();
		this.jButtonid_estado_civilCargaFamiliar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCargaFamiliar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCargaFamiliar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCargaFamiliar.setText("Buscar");
		this.jButtonid_estado_civilCargaFamiliar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_civilCargaFamiliar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilCargaFamiliar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_civilCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilCargaFamiliar"));

		this.jButtonid_estado_civilCargaFamiliarBusqueda= new JButtonMe();
		this.jButtonid_estado_civilCargaFamiliarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilCargaFamiliarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilCargaFamiliarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilCargaFamiliarBusqueda.setText("U");
		this.jButtonid_estado_civilCargaFamiliarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_civilCargaFamiliarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilCargaFamiliarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_civilCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilCargaFamiliarBusqueda"));

		if(this.cargafamiliarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_civilCargaFamiliarBusqueda.setVisible(false);		}

		this.jButtonid_estado_civilCargaFamiliarUpdate= new JButtonMe();
		this.jButtonid_estado_civilCargaFamiliarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilCargaFamiliarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilCargaFamiliarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilCargaFamiliarUpdate.setText("U");
		this.jButtonid_estado_civilCargaFamiliarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_civilCargaFamiliarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilCargaFamiliarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_civilCargaFamiliar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCargaFamiliar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilCargaFamiliarUpdate"));



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
		//this.jInternalFrameDetalleCargaFamiliar = new CargaFamiliarBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Carga Familiar DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargaFamiliar= new GridBagLayout();
		

		
		String sToolTipCargaFamiliar="";
		sToolTipCargaFamiliar=CargaFamiliarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargaFamiliar+="(Cartera.CargaFamiliar)";
		}
		
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargaFamiliar+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCargaFamiliar = new JButtonMe();
		this.jButtonModificarCargaFamiliar = new JButtonMe();
        this.jButtonActualizarCargaFamiliar = new JButtonMe();
        this.jButtonEliminarCargaFamiliar = new JButtonMe();
        this.jButtonCancelarCargaFamiliar = new JButtonMe();
        this.jButtonGuardarCambiosCargaFamiliar = new JButtonMe();
		this.jButtonGuardarCambiosTablaCargaFamiliar = new JButtonMe();
		this.jButtonCerrarCargaFamiliar = new JButtonMe();
		
		this.jScrollPanelDatosCargaFamiliar = new JScrollPane();   
        this.jScrollPanelDatosEdicionCargaFamiliar = new JScrollPane();
		this.jScrollPanelDatosGeneralCargaFamiliar = new JScrollPane();
				
		
		
		this.jPanelCamposCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Carga Familiar";
		
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiares" + this.sPath));
		} else {
			this.jScrollPanelDatosCargaFamiliar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCargaFamiliar.setName("jPanelCamposCargaFamiliar"); 

		this.jPanelCamposOcultosCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCargaFamiliar.setName("jPanelCamposOcultosCargaFamiliar"); 

        this.jPanelAccionesCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargaFamiliar.setToolTipText("Acciones");
        this.jPanelAccionesCargaFamiliar.setName("Acciones"); 

		this.jPanelAccionesFormularioCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCargaFamiliar.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCargaFamiliar.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCargaFamiliar.setText("Nuevo");
		this.jButtonModificarCargaFamiliar.setText("Editar");
        this.jButtonActualizarCargaFamiliar.setText("Actualizar");
        this.jButtonEliminarCargaFamiliar.setText("Eliminar");
        this.jButtonCancelarCargaFamiliar.setText("Cancelar");
        this.jButtonGuardarCambiosCargaFamiliar.setText("Guardar");
		this.jButtonGuardarCambiosTablaCargaFamiliar.setText("Guardar");
		this.jButtonCerrarCargaFamiliar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargaFamiliar,"nuevo_button","Nuevo",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCargaFamiliar,"modificar_button","Editar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCargaFamiliar,"actualizar_button","Actualizar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCargaFamiliar,"eliminar_button","Eliminar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCargaFamiliar,"cancelar_button","Cancelar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCargaFamiliar,"guardarcambios_button","Guardar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargaFamiliar,"guardarcambiostabla_button","Guardar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargaFamiliar,"cerrar_button","Salir",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCargaFamiliar.setToolTipText("Nuevo"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCargaFamiliar.setToolTipText("Editar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCargaFamiliar.setToolTipText("Actualizar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCargaFamiliar.setToolTipText("Eliminar)"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCargaFamiliar.setToolTipText("Cancelar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCargaFamiliar.setToolTipText("Guardar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCargaFamiliar.setToolTipText("Guardar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargaFamiliar.setToolTipText("Salir"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargaFamiliar";
		inputMap = this.jButtonNuevoCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargaFamiliar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargaFamiliar"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCargaFamiliar";
		inputMap = this.jButtonActualizarCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCargaFamiliar"));
		
		//ELIMINAR
		sMapKey = "EliminarCargaFamiliar";
		inputMap = this.jButtonEliminarCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCargaFamiliar"));
		
		//CANCELAR	
		sMapKey = "CancelarCargaFamiliar";
		inputMap = this.jButtonCancelarCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCargaFamiliar"));
		
		//CERRAR		
		sMapKey = "CerrarCargaFamiliar";
		inputMap = this.jButtonCerrarCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargaFamiliar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargaFamiliar";
		inputMap = this.jButtonGuardarCambiosTablaCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargaFamiliar"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCargaFamiliar = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCargaFamiliar.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCargaFamiliar.setToolTipText("Nuevo CargaFamiliar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCargaFamiliar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCargaFamiliar.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCargaFamiliar.setToolTipText("Sin Cerrar Ventana CargaFamiliar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCargaFamiliar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCargaFamiliar.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCargaFamiliar.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargaFamiliar.setText("Accion");
		this.jComboBoxTiposAccionesCargaFamiliar.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCargaFamiliar.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCargaFamiliar.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCargaFamiliar = new JLabelMe();
		
		this.jLabelAccionesCargaFamiliar.setText("Acciones");		
		this.jLabelAccionesCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCargaFamiliar();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCargaFamiliar();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCargaFamiliar=new JTabbedPane();
		this.jTabbedPaneRelacionesCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCargaFamiliar,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCargaFamiliar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargaFamiliar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargaFamiliar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCargaFamiliar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargaFamiliar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargaFamiliar.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCargaFamiliar = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCargaFamiliar = new GridBagLayout();
		
		this.jPanelCamposCargaFamiliar.setLayout(gridaBagLayoutCamposCargaFamiliar);
		this.jPanelCamposOcultosCargaFamiliar.setLayout(gridaBagLayoutCamposOcultosCargaFamiliar);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCargaFamiliar.add(jLabelIdCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCargaFamiliar.add(jLabelidCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCargaFamiliar.add(jLabelid_empresaCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargaFamiliar.add(jButtonid_empresaCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 3;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargaFamiliar.add(jButtonid_empresaCargaFamiliarUpdate, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCargaFamiliar.add(jComboBoxid_empresaCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteCargaFamiliar.add(jLabelid_clienteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 2;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteCargaFamiliar.add(jButtonid_clienteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 3;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCargaFamiliar.add(jButtonid_clienteCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 4;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCargaFamiliar.add(jButtonid_clienteCargaFamiliarUpdate, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteCargaFamiliar.add(jComboBoxid_clienteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_carga_famiCargaFamiliar.add(jLabelid_tipo_carga_famiCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_carga_famiCargaFamiliar.add(jButtonid_tipo_carga_famiCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 3;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_carga_famiCargaFamiliar.add(jButtonid_tipo_carga_famiCargaFamiliarUpdate, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_carga_famiCargaFamiliar.add(jComboBoxid_tipo_carga_famiCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_generoCargaFamiliar.add(jLabelid_tipo_generoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoCargaFamiliar.add(jButtonid_tipo_generoCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 3;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoCargaFamiliar.add(jButtonid_tipo_generoCargaFamiliarUpdate, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_generoCargaFamiliar.add(jComboBoxid_tipo_generoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_civilCargaFamiliar.add(jLabelid_estado_civilCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilCargaFamiliar.add(jButtonid_estado_civilCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 3;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilCargaFamiliar.add(jButtonid_estado_civilCargaFamiliarUpdate, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_civilCargaFamiliar.add(jComboBoxid_estado_civilCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcedulaCargaFamiliar.add(jLabelcedulaCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcedulaCargaFamiliar.add(jButtoncedulaCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcedulaCargaFamiliar.add(jTextFieldcedulaCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoCargaFamiliar.add(jLabelapellidoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoCargaFamiliar.add(jButtonapellidoCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoCargaFamiliar.add(jscrollPaneapellidoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCargaFamiliar.add(jLabelnombreCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCargaFamiliar.add(jButtonnombreCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCargaFamiliar.add(jscrollPanenombreCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionCargaFamiliar.add(jLabeldireccionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionCargaFamiliar.add(jButtondireccionCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionCargaFamiliar.add(jscrollPanedireccionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimientoCargaFamiliar.add(jLabelfecha_nacimientoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimientoCargaFamiliar.add(jButtonfecha_nacimientoCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimientoCargaFamiliar.add(jDateChooserfecha_nacimientoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 0;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_cupoCargaFamiliar.add(jLabelvalor_cupoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 2;
		this.gridBagConstraintsCargaFamiliar.ipadx = 0;
		this.gridBagConstraintsCargaFamiliar.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_cupoCargaFamiliar.add(jButtonvalor_cupoCargaFamiliarBusqueda, this.gridBagConstraintsCargaFamiliar);
	}

	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargaFamiliar.gridy = 0;
	this.gridBagConstraintsCargaFamiliar.gridx = 1;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_cupoCargaFamiliar.add(jTextFieldvalor_cupoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelidCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelid_clienteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelid_tipo_carga_famiCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelid_tipo_generoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelid_estado_civilCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelcedulaCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelapellidoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelnombreCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPaneldireccionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelfecha_nacimientoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargaFamiliar.add(this.jPanelvalor_cupoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposCargaFamiliar % 1==0) {
		iXPanelCamposCargaFamiliar=0;
		iYPanelCamposCargaFamiliar++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargaFamiliar.gridy = iYPanelCamposOcultosCargaFamiliar;
	this.gridBagConstraintsCargaFamiliar.gridx = iXPanelCamposOcultosCargaFamiliar++;
	this.gridBagConstraintsCargaFamiliar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargaFamiliar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCargaFamiliar.add(this.jPanelid_empresaCargaFamiliar, this.gridBagConstraintsCargaFamiliar);



	if(iXPanelCamposOcultosCargaFamiliar % 1==0) {
		iXPanelCamposOcultosCargaFamiliar=0;
		iYPanelCamposOcultosCargaFamiliar++;
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
			
		GridBagLayout gridaBagLayoutAccionesCargaFamiliar= new GridBagLayout();
		this.jPanelAccionesCargaFamiliar.setLayout(gridaBagLayoutAccionesCargaFamiliar);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCargaFamiliar= new GridBagLayout();
		this.jPanelAccionesFormularioCargaFamiliar.setLayout(gridaBagLayoutAccionesFormularioCargaFamiliar);
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargaFamiliar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargaFamiliar.add(this.jComboBoxTiposAccionesFormularioCargaFamiliar, this.gridBagConstraintsCargaFamiliar);

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargaFamiliar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargaFamiliar.add(this.jCheckBoxPostAccionNuevoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargaFamiliar.add(this.jCheckBoxPostAccionSinCerrarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cargafamiliarSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargaFamiliar.add(this.jCheckBoxPostAccionSinMensajeCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccion++;
			
		this.jPanelAccionesCargaFamiliar.add(this.jButtonModificarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);							

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx =iPosXAccion++;
			
		this.jPanelAccionesCargaFamiliar.add(this.jButtonEliminarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
			
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = 0;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargaFamiliar.add(this.jButtonActualizarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = 0;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargaFamiliar.add(this.jButtonGuardarCambiosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);	
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = 0;		
		this.gridBagConstraintsCargaFamiliar.gridx =iPosXAccion++;
		
		this.jPanelAccionesCargaFamiliar.add(this.jButtonCancelarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargaFamiliar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargaFamiliar);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();						
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargaFamiliar.gridx = 0;		
			//this.gridBagConstraintsCargaFamiliar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargaFamiliar.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargaFamiliar.gridx =0;
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargaFamiliar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCargaFamiliar = new CargaFamiliarBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Carga Familiar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Carga Familiar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Carga Familiar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CargaFamiliarModel cargafamiliarModel=new CargaFamiliarModel(this);
			
			//SI USARA CLASE INTERNA
			//CargaFamiliarModel.CargaFamiliarFocusTraversalPolicy cargafamiliarFocusTraversalPolicy = cargafamiliarModel.new CargaFamiliarFocusTraversalPolicy(this);
			
			//cargafamiliarFocusTraversalPolicy.setcargafamiliarJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cargafamiliarModel);
			
			
			this.jContentPaneDetalleCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCargaFamiliar = new GridBagLayout();	
			this.jContentPaneDetalleCargaFamiliar.setLayout(gridaBagLayoutDetalleCargaFamiliar);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargaFamiliar = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
				this.gridBagConstraintsCargaFamiliar.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCargaFamiliar.gridx = 0;
					
				
				this.jContentPaneDetalleCargaFamiliar.add(jTtoolBarDetalleCargaFamiliar, gridBagConstraintsCargaFamiliar);								
				
}
			
			this.jScrollPanelDatosEdicionCargaFamiliar=   new JScrollPane(jContentPaneDetalleCargaFamiliar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargaFamiliar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargaFamiliar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargaFamiliar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCargaFamiliar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargaFamiliar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargaFamiliar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargaFamiliar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCargaFamiliar.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCargaFamiliar.gridx = 0;
	        
			this.jContentPaneDetalleCargaFamiliar.add(jPanelCamposCargaFamiliar, gridBagConstraintsCargaFamiliar);
			
			
			
			
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
						&& cargafamiliarSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cargafamiliarSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCargaFamiliar= new GridBagConstraints();
						this.gridBagConstraintsCargaFamiliar.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCargaFamiliar.gridx = 0;
						this.jContentPaneDetalleCargaFamiliar.add(this.jTabbedPaneRelacionesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCargaFamiliar.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCargaFamiliar.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
					this.gridBagConstraintsCargaFamiliar.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCargaFamiliar.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCargaFamiliar.gridx = 0;
					
				
					this.jContentPaneDetalleCargaFamiliar.add(jPanelCamposOcultosCargaFamiliar, gridBagConstraintsCargaFamiliar);
				
					this.jPanelCamposOcultosCargaFamiliar.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCargaFamiliar.gridx = 0;
	        this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCargaFamiliar.add(this.jPanelAccionesFormularioCargaFamiliar, this.gridBagConstraintsCargaFamiliar);							
			
			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
	        this.gridBagConstraintsCargaFamiliar.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCargaFamiliar.gridx = 0;
	        
			
			this.jContentPaneDetalleCargaFamiliar.add(this.jPanelAccionesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCargaFamiliar);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCargaFamiliar=   new JScrollPane(this.jPanelCamposCargaFamiliar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargaFamiliar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargaFamiliar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargaFamiliar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCargaFamiliar.gridx = 0;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCargaFamiliar.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargaFamiliar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargaFamiliar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			
			
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
			
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCargaFamiliar;//jContentPane;
		
		return jScrollPanelDatosEdicionCargaFamiliar;
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
