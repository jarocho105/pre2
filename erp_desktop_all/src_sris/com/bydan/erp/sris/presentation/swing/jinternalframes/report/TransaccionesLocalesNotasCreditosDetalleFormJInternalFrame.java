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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.TransaccionesLocalesNotasCreditosConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame extends TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransaccionesLocalesNotasCreditos;
	
	protected JMenuBar jmenuBarDetalleTransaccionesLocalesNotasCreditos;
	
	protected JMenu jmenuDetalleTransaccionesLocalesNotasCreditos;
	protected JMenu jmenuDetalleArchivoTransaccionesLocalesNotasCreditos;
	protected JMenu jmenuDetalleAccionesTransaccionesLocalesNotasCreditos;
	protected JMenu jmenuDetalleDatosTransaccionesLocalesNotasCreditos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionesLocalesNotasCreditos;	
	protected GridBagConstraints gridBagConstraintsTransaccionesLocalesNotasCreditos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransaccionesLocalesNotasCreditos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public TransaccionesLocalesNotasCreditosSessionBean transaccioneslocalesnotascreditosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public TransaccionesLocalesNotasCreditosLogic transaccioneslocalesnotascreditosLogic;
	
	public JScrollPane jScrollPanelDatosTransaccionesLocalesNotasCreditos;
	public JScrollPane jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos;
	public JScrollPane jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos;
	
	protected JPanel jPanelCamposTransaccionesLocalesNotasCreditos;    
	protected JPanel jPanelCamposOcultosTransaccionesLocalesNotasCreditos;    	
	protected JPanel jPanelAccionesTransaccionesLocalesNotasCreditos;
	protected JPanel jPanelAccionesFormularioTransaccionesLocalesNotasCreditos;
    
	
	
	protected Integer iXPanelCamposTransaccionesLocalesNotasCreditos=0;
	protected Integer iYPanelCamposTransaccionesLocalesNotasCreditos=0;
	
	protected Integer iXPanelCamposOcultosTransaccionesLocalesNotasCreditos=0;
	protected Integer iYPanelCamposOcultosTransaccionesLocalesNotasCreditos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransaccionesLocalesNotasCreditos;
	public JButton jButtonModificarTransaccionesLocalesNotasCreditos;
	public JButton jButtonActualizarTransaccionesLocalesNotasCreditos;
    public JButton jButtonEliminarTransaccionesLocalesNotasCreditos;
	public JButton jButtonCancelarTransaccionesLocalesNotasCreditos;
    public JButton jButtonGuardarCambiosTransaccionesLocalesNotasCreditos;
	public JButton jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos;
	protected JButton jButtonCerrarTransaccionesLocalesNotasCreditos;
	
	
	protected JButton jButtonProcesarInformacionTransaccionesLocalesNotasCreditos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransaccionesLocalesNotasCreditos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransaccionesLocalesNotasCreditos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransaccionesLocalesNotasCreditos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonModificarToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonActualizarToolBarTransaccionesLocalesNotasCreditos;
    protected JButton jButtonEliminarToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonCancelarToolBarTransaccionesLocalesNotasCreditos;
    protected JButton jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonGuardarCambiosTablaToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionesLocalesNotasCreditos;
	protected JButton jButtonCerrarToolBarTransaccionesLocalesNotasCreditos;
	
	protected JButton jButtonProcesarInformacionToolBarTransaccionesLocalesNotasCreditos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemModificarTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemActualizarTransaccionesLocalesNotasCreditos;
    protected JMenuItem jMenuItemEliminarTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemCancelarTransaccionesLocalesNotasCreditos;
    protected JMenuItem jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemCerrarTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos;
	
	protected JMenuItem jMenuItemProcesarInformacionTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionesLocalesNotasCreditos;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionesLocalesNotasCreditos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransaccionesLocalesNotasCreditos;
	public JLabel jLabelIdTransaccionesLocalesNotasCreditos;
	public JLabel jLabelidTransaccionesLocalesNotasCreditos;
	public JButton jButtonidTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeTransaccionesLocalesNotasCreditos;
	public JLabel jLabelfecha_desdeTransaccionesLocalesNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos;

	public JDateChooser jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos;
	public JButton jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaTransaccionesLocalesNotasCreditos;
	public JLabel jLabelfecha_hastaTransaccionesLocalesNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos;

	public JDateChooser jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos;
	public JButton jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos;
	public JLabel jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos;
	public JTextArea jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos;
	public JScrollPane jscrollPanenombre_completo_clienteTransaccionesLocalesNotasCreditos;
	public JButton jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaTransaccionesLocalesNotasCreditos;
	public JLabel jLabeltotal_ivaTransaccionesLocalesNotasCreditos;
	public JTextField jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos;
	public JButton jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos;
	public JLabel jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos;
	public JTextField jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos;
	public JButton jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelivaTransaccionesLocalesNotasCreditos;
	public JLabel jLabelivaTransaccionesLocalesNotasCreditos;
	public JTextField jTextFieldivaTransaccionesLocalesNotasCreditos;
	public JButton jButtonivaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPaneltotalTransaccionesLocalesNotasCreditos;
	public JLabel jLabeltotalTransaccionesLocalesNotasCreditos;
	public JTextField jTextFieldtotalTransaccionesLocalesNotasCreditos;
	public JButton jButtontotalTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelruc_clienteTransaccionesLocalesNotasCreditos;
	public JLabel jLabelruc_clienteTransaccionesLocalesNotasCreditos;
	public JTextField jTextFieldruc_clienteTransaccionesLocalesNotasCreditos;
	public JButton jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransaccionesLocalesNotasCreditos;
	public JLabel jLabelid_empresaTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransaccionesLocalesNotasCreditos;
	public JButton jButtonid_empresaTransaccionesLocalesNotasCreditos= new JButtonMe();
	public JButton jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioTransaccionesLocalesNotasCreditos;
	public JLabel jLabelid_ejercicioTransaccionesLocalesNotasCreditos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos;
	public JButton jButtonid_ejercicioTransaccionesLocalesNotasCreditos= new JButtonMe();
	public JButton jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransaccionesLocalesNotasCreditos=new JPanel();
				this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos=new JPanel();
				this.jmenuBarDetalleTransaccionesLocalesNotasCreditos=new JMenuBar();
				this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesNotasCreditosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionesLocalesNotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransaccionesLocalesNotasCreditos() {
		return this.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos;
	}
	
	public JButton getjButtonEliminarToolBarTransaccionesLocalesNotasCreditos() {
		return this.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos;
	}
	
	public JButton getjButtonCancelarToolBarTransaccionesLocalesNotasCreditos() {
		return this.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos;
	}		
	
	public JButton getjButtonProcesarInformacionTransaccionesLocalesNotasCreditos() {
		return this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionesLocalesNotasCreditos)	{
		this.jButtonProcesarInformacionTransaccionesLocalesNotasCreditos = jButtonProcesarInformacionTransaccionesLocalesNotasCreditos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionesLocalesNotasCreditos() {
		return this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos = jComboBoxTiposRelacionesTransaccionesLocalesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos = jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos() {
		return this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos(
			JComboBox jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos) {
		this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos = jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transaccioneslocalesnotascreditosSessionBean=new TransaccionesLocalesNotasCreditosSessionBean();
		
		this.transaccioneslocalesnotascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioneslocalesnotascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionesLocalesNotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionesLocalesNotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionesLocalesNotasCreditosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transacciones Locales Notas Creditos MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
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
	
		TransaccionesLocalesNotasCreditosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransaccionesLocalesNotasCreditos=new JButtonMe();
				this.jButtonModificarToolBarTransaccionesLocalesNotasCreditos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos,
							"actualizar","actualizar","Actualizar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos,
							"eliminar","eliminar","Eliminar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos,
							"cancelar","cancelar","Cancelar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransaccionesLocalesNotasCreditos,this.jTtoolBarDetalleTransaccionesLocalesNotasCreditos,
							"guardarcambios","guardarcambios","Guardar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransaccionesLocalesNotasCreditos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransaccionesLocalesNotasCreditos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransaccionesLocalesNotasCreditos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransaccionesLocalesNotasCreditos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransaccionesLocalesNotasCreditos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionesLocalesNotasCreditos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionesLocalesNotasCreditos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionesLocalesNotasCreditos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransaccionesLocalesNotasCreditos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransaccionesLocalesNotasCreditos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransaccionesLocalesNotasCreditos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransaccionesLocalesNotasCreditos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransaccionesLocalesNotasCreditos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransaccionesLocalesNotasCreditos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransaccionesLocalesNotasCreditos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransaccionesLocalesNotasCreditos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransaccionesLocalesNotasCreditos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransaccionesLocalesNotasCreditos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransaccionesLocalesNotasCreditos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransaccionesLocalesNotasCreditos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionesLocalesNotasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionesLocalesNotasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionesLocalesNotasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransaccionesLocalesNotasCreditos.add(this.jMenuItemDetalleCerrarTransaccionesLocalesNotasCreditos);
		
		this.jmenuDetalleAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemActualizarTransaccionesLocalesNotasCreditos);
		this.jmenuDetalleAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemEliminarTransaccionesLocalesNotasCreditos);
		this.jmenuDetalleAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemCancelarTransaccionesLocalesNotasCreditos);		
		
		//this.jmenuDetalleDatosTransaccionesLocalesNotasCreditos.add(this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesNotasCreditos);				
		this.jmenuDetalleDatosTransaccionesLocalesNotasCreditos.add(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesNotasCreditos);				
				
		//this.jmenuDetalleAccionesTransaccionesLocalesNotasCreditos.add(this.jMenuItemGuardarCambiosTransaccionesLocalesNotasCreditos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransaccionesLocalesNotasCreditos.add(this.jmenuDetalleArchivoTransaccionesLocalesNotasCreditos);		
		this.jmenuBarDetalleTransaccionesLocalesNotasCreditos.add(this.jmenuDetalleAccionesTransaccionesLocalesNotasCreditos);		
		this.jmenuBarDetalleTransaccionesLocalesNotasCreditos.add(this.jmenuDetalleDatosTransaccionesLocalesNotasCreditos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransaccionesLocalesNotasCreditos);				
	}
	
	
	public void inicializarElementosCamposTransaccionesLocalesNotasCreditos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransaccionesLocalesNotasCreditos = new JLabelMe();
		jLabelIdTransaccionesLocalesNotasCreditos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransaccionesLocalesNotasCreditos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos= new GridBagLayout();

		this.jPanelidTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);

		jLabelidTransaccionesLocalesNotasCreditos = new JLabel();
		jLabelidTransaccionesLocalesNotasCreditos.setText("Id");

		jLabelidTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabelfecha_desdeTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeTransaccionesLocalesNotasCreditos.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPanelfecha_desdeTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		//jFormattedTextFieldfecha_desdeTransaccionesLocalesNotasCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos= new JDateChooser();
		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setEnabled(false);
		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setDate(new Date());
		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeTransaccionesLocalesNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabelfecha_hastaTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaTransaccionesLocalesNotasCreditos.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPanelfecha_hastaTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		//jFormattedTextFieldfecha_hastaTransaccionesLocalesNotasCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos= new JDateChooser();
		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setEnabled(false);
		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setDate(new Date());
		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaTransaccionesLocalesNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos= new JTextAreaMe();
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setEnabled(false);
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setLineWrap(true);
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteTransaccionesLocalesNotasCreditos = new JScrollPane(jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos);
		jscrollPanenombre_completo_clienteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabeltotal_ivaTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaTransaccionesLocalesNotasCreditos.setToolTipText("Total Iva");
		this.jLabeltotal_ivaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPaneltotal_ivaTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos= new JTextFieldMe();
		jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setEnabled(false);
		jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.setText("0.0");

		this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos= new JTextFieldMe();
		jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setEnabled(false);
		jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.setText("0.0");

		this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelivaTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabelivaTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaTransaccionesLocalesNotasCreditos.setToolTipText("Iva");
		this.jLabelivaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPanelivaTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		jTextFieldivaTransaccionesLocalesNotasCreditos= new JTextFieldMe();
		jTextFieldivaTransaccionesLocalesNotasCreditos.setEnabled(false);
		jTextFieldivaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaTransaccionesLocalesNotasCreditos.setText("0.0");

		this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabeltotalTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabeltotalTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalTransaccionesLocalesNotasCreditos.setToolTipText("Total");
		this.jLabeltotalTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPaneltotalTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		jTextFieldtotalTransaccionesLocalesNotasCreditos= new JTextFieldMe();
		jTextFieldtotalTransaccionesLocalesNotasCreditos.setEnabled(false);
		jTextFieldtotalTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalTransaccionesLocalesNotasCreditos.setText("0.0");

		this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelruc_clienteTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabelruc_clienteTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE+" : *");
		this.jLabelruc_clienteTransaccionesLocalesNotasCreditos.setToolTipText("Ruc Cliente");
		this.jLabelruc_clienteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_clienteTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_clienteTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_clienteTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_RUCCLIENTE);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPanelruc_clienteTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		jTextFieldruc_clienteTransaccionesLocalesNotasCreditos= new JTextFieldMe();

		jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setEnabled(false);
		jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_clienteTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_clienteTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_clienteTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransaccionesLocalesNotasCreditos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabelid_empresaTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransaccionesLocalesNotasCreditos.setToolTipText("Empresa");
		this.jLabelid_empresaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPanelid_empresaTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		jComboBoxid_empresaTransaccionesLocalesNotasCreditos= new JComboBoxMe();
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.setEnabled(false);

		this.jButtonid_empresaTransaccionesLocalesNotasCreditos= new JButtonMe();
		this.jButtonid_empresaTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionesLocalesNotasCreditos.setText("Buscar");
		this.jButtonid_empresaTransaccionesLocalesNotasCreditos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransaccionesLocalesNotasCreditos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionesLocalesNotasCreditos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionesLocalesNotasCreditos"));

		this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate= new JButtonMe();
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.setText("U");
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionesLocalesNotasCreditosUpdate"));



					
		this.jLabelid_ejercicioTransaccionesLocalesNotasCreditos = new JLabelMe();
		this.jLabelid_ejercicioTransaccionesLocalesNotasCreditos.setText(""+TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioTransaccionesLocalesNotasCreditos.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioTransaccionesLocalesNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioTransaccionesLocalesNotasCreditos.setToolTipText(TransaccionesLocalesNotasCreditosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		this.jPanelid_ejercicioTransaccionesLocalesNotasCreditos.setLayout(this.gridaBagLayoutTransaccionesLocalesNotasCreditos);


		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos= new JComboBoxMe();
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.setEnabled(false);

		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditos= new JButtonMe();
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditos.setText("Buscar");
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransaccionesLocalesNotasCreditos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransaccionesLocalesNotasCreditos"));

		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.setText("U");
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransaccionesLocalesNotasCreditosBusqueda"));

		if(this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate= new JButtonMe();
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.setText("U");
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransaccionesLocalesNotasCreditosUpdate"));



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
		//this.jInternalFrameDetalleTransaccionesLocalesNotasCreditos = new TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transacciones Locales Notas Creditos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionesLocalesNotasCreditos= new GridBagLayout();
		

		
		String sToolTipTransaccionesLocalesNotasCreditos="";
		sToolTipTransaccionesLocalesNotasCreditos=TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionesLocalesNotasCreditos+="(Sris.TransaccionesLocalesNotasCreditos)";
		}
		
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionesLocalesNotasCreditos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonModificarTransaccionesLocalesNotasCreditos = new JButtonMe();
        this.jButtonActualizarTransaccionesLocalesNotasCreditos = new JButtonMe();
        this.jButtonEliminarTransaccionesLocalesNotasCreditos = new JButtonMe();
        this.jButtonCancelarTransaccionesLocalesNotasCreditos = new JButtonMe();
        this.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos = new JButtonMe();
		this.jButtonCerrarTransaccionesLocalesNotasCreditos = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionesLocalesNotasCreditos = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos = new JScrollPane();
		this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos = new JScrollPane();
				
		
		
		this.jPanelCamposTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transacciones Locales Notas Creditos";
		
		if(!this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Notas Creditoses" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionesLocalesNotasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransaccionesLocalesNotasCreditos.setName("jPanelCamposTransaccionesLocalesNotasCreditos"); 

		this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos.setName("jPanelCamposOcultosTransaccionesLocalesNotasCreditos"); 

        this.jPanelAccionesTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionesLocalesNotasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionesLocalesNotasCreditos.setName("Acciones"); 

		this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransaccionesLocalesNotasCreditos.setText("Nuevo");
		this.jButtonModificarTransaccionesLocalesNotasCreditos.setText("Editar");
        this.jButtonActualizarTransaccionesLocalesNotasCreditos.setText("Actualizar");
        this.jButtonEliminarTransaccionesLocalesNotasCreditos.setText("Eliminar");
        this.jButtonCancelarTransaccionesLocalesNotasCreditos.setText("Cancelar");
        this.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.setText("Guardar");
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionesLocalesNotasCreditos,"nuevo_button","Nuevo",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransaccionesLocalesNotasCreditos,"modificar_button","Editar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransaccionesLocalesNotasCreditos,"actualizar_button","Actualizar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransaccionesLocalesNotasCreditos,"eliminar_button","Eliminar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransaccionesLocalesNotasCreditos,"cancelar_button","Cancelar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos,"guardarcambios_button","Guardar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos,"guardarcambiostabla_button","Guardar",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionesLocalesNotasCreditos,"cerrar_button","Salir",this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransaccionesLocalesNotasCreditos.setToolTipText("Nuevo"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransaccionesLocalesNotasCreditos.setToolTipText("Editar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransaccionesLocalesNotasCreditos.setToolTipText("Actualizar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransaccionesLocalesNotasCreditos.setToolTipText("Eliminar)"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransaccionesLocalesNotasCreditos.setToolTipText("Cancelar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos.setToolTipText("Guardar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.setToolTipText("Guardar"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.setToolTipText("Salir"+" "+TransaccionesLocalesNotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonNuevoTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionesLocalesNotasCreditos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonActualizarTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransaccionesLocalesNotasCreditos"));
		
		//ELIMINAR
		sMapKey = "EliminarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonEliminarTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransaccionesLocalesNotasCreditos"));
		
		//CANCELAR	
		sMapKey = "CancelarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonCancelarTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransaccionesLocalesNotasCreditos"));
		
		//CERRAR		
		sMapKey = "CerrarTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonCerrarTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionesLocalesNotasCreditos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionesLocalesNotasCreditos";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionesLocalesNotasCreditos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransaccionesLocalesNotasCreditos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransaccionesLocalesNotasCreditos.setToolTipText("Nuevo TransaccionesLocalesNotasCreditos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransaccionesLocalesNotasCreditos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransaccionesLocalesNotasCreditos.setToolTipText("Sin Cerrar Ventana TransaccionesLocalesNotasCreditos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransaccionesLocalesNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransaccionesLocalesNotasCreditos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransaccionesLocalesNotasCreditos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransaccionesLocalesNotasCreditos = new JLabelMe();
		
		this.jLabelAccionesTransaccionesLocalesNotasCreditos.setText("Acciones");		
		this.jLabelAccionesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransaccionesLocalesNotasCreditos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransaccionesLocalesNotasCreditos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos=new JTabbedPane();
		this.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransaccionesLocalesNotasCreditos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransaccionesLocalesNotasCreditos = new GridBagLayout();
		
		this.jPanelCamposTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutCamposTransaccionesLocalesNotasCreditos);
		this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutCamposOcultosTransaccionesLocalesNotasCreditos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransaccionesLocalesNotasCreditos.add(jLabelIdTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransaccionesLocalesNotasCreditos.add(jLabelidTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransaccionesLocalesNotasCreditos.add(jLabelid_empresaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccionesLocalesNotasCreditos.add(jButtonid_empresaTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 3;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccionesLocalesNotasCreditos.add(jButtonid_empresaTransaccionesLocalesNotasCreditosUpdate, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransaccionesLocalesNotasCreditos.add(jComboBoxid_empresaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioTransaccionesLocalesNotasCreditos.add(jLabelid_ejercicioTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTransaccionesLocalesNotasCreditos.add(jButtonid_ejercicioTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 3;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTransaccionesLocalesNotasCreditos.add(jButtonid_ejercicioTransaccionesLocalesNotasCreditosUpdate, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioTransaccionesLocalesNotasCreditos.add(jComboBoxid_ejercicioTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeTransaccionesLocalesNotasCreditos.add(jLabelfecha_desdeTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeTransaccionesLocalesNotasCreditos.add(jButtonfecha_desdeTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeTransaccionesLocalesNotasCreditos.add(jDateChooserfecha_desdeTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaTransaccionesLocalesNotasCreditos.add(jLabelfecha_hastaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaTransaccionesLocalesNotasCreditos.add(jButtonfecha_hastaTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaTransaccionesLocalesNotasCreditos.add(jDateChooserfecha_hastaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos.add(jLabelnombre_completo_clienteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos.add(jButtonnombre_completo_clienteTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos.add(jscrollPanenombre_completo_clienteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaTransaccionesLocalesNotasCreditos.add(jLabeltotal_ivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaTransaccionesLocalesNotasCreditos.add(jButtontotal_ivaTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaTransaccionesLocalesNotasCreditos.add(jTextFieldtotal_ivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos.add(jLabeltotal_sin_ivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos.add(jButtontotal_sin_ivaTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos.add(jTextFieldtotal_sin_ivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaTransaccionesLocalesNotasCreditos.add(jLabelivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaTransaccionesLocalesNotasCreditos.add(jButtonivaTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaTransaccionesLocalesNotasCreditos.add(jTextFieldivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalTransaccionesLocalesNotasCreditos.add(jLabeltotalTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalTransaccionesLocalesNotasCreditos.add(jButtontotalTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalTransaccionesLocalesNotasCreditos.add(jTextFieldtotalTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_clienteTransaccionesLocalesNotasCreditos.add(jLabelruc_clienteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_clienteTransaccionesLocalesNotasCreditos.add(jButtonruc_clienteTransaccionesLocalesNotasCreditosBusqueda, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
	}

	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_clienteTransaccionesLocalesNotasCreditos.add(jTextFieldruc_clienteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPanelidTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPanelfecha_desdeTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPanelfecha_hastaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPanelnombre_completo_clienteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPaneltotal_ivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPaneltotal_sin_ivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPanelivaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPaneltotalTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesNotasCreditos.add(this.jPanelruc_clienteTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposTransaccionesLocalesNotasCreditos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposOcultosTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposOcultosTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos.add(this.jPanelid_empresaTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposOcultosTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposOcultosTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposOcultosTransaccionesLocalesNotasCreditos++;
	}
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iYPanelCamposOcultosTransaccionesLocalesNotasCreditos;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iXPanelCamposOcultosTransaccionesLocalesNotasCreditos++;
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos.add(this.jPanelid_ejercicioTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);



	if(iXPanelCamposOcultosTransaccionesLocalesNotasCreditos % 1==0) {
		iXPanelCamposOcultosTransaccionesLocalesNotasCreditos=0;
		iYPanelCamposOcultosTransaccionesLocalesNotasCreditos++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransaccionesLocalesNotasCreditos= new GridBagLayout();
		this.jPanelAccionesTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutAccionesTransaccionesLocalesNotasCreditos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransaccionesLocalesNotasCreditos= new GridBagLayout();
		this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutAccionesFormularioTransaccionesLocalesNotasCreditos);
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos.add(this.jComboBoxTiposAccionesFormularioTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransaccionesLocalesNotasCreditos.add(this.jButtonModificarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);							

		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransaccionesLocalesNotasCreditos.add(this.jButtonEliminarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
			
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionesLocalesNotasCreditos.add(this.jButtonActualizarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);


		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionesLocalesNotasCreditos.add(this.jButtonGuardarCambiosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);	
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = 0;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransaccionesLocalesNotasCreditos.add(this.jButtonCancelarTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionesLocalesNotasCreditos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionesLocalesNotasCreditos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccioneslocalesnotascreditosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;		
			//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =0;
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransaccionesLocalesNotasCreditosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransaccionesLocalesNotasCreditos = new TransaccionesLocalesNotasCreditosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transacciones Locales Notas Creditos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transacciones Locales Notas Creditos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transacciones Locales Notas Creditos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransaccionesLocalesNotasCreditosModel transaccioneslocalesnotascreditosModel=new TransaccionesLocalesNotasCreditosModel(this);
			
			//SI USARA CLASE INTERNA
			//TransaccionesLocalesNotasCreditosModel.TransaccionesLocalesNotasCreditosFocusTraversalPolicy transaccioneslocalesnotascreditosFocusTraversalPolicy = transaccioneslocalesnotascreditosModel.new TransaccionesLocalesNotasCreditosFocusTraversalPolicy(this);
			
			//transaccioneslocalesnotascreditosFocusTraversalPolicy.settransaccioneslocalesnotascreditosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transaccioneslocalesnotascreditosModel);
			
			
			this.jContentPaneDetalleTransaccionesLocalesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransaccionesLocalesNotasCreditos = new GridBagLayout();	
			this.jContentPaneDetalleTransaccionesLocalesNotasCreditos.setLayout(gridaBagLayoutDetalleTransaccionesLocalesNotasCreditos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionesLocalesNotasCreditos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
					
				
				this.jContentPaneDetalleTransaccionesLocalesNotasCreditos.add(jTtoolBarDetalleTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);								
				
}
			
			this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos=   new JScrollPane(jContentPaneDetalleTransaccionesLocalesNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	        
			this.jContentPaneDetalleTransaccionesLocalesNotasCreditos.add(jPanelCamposTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);
			
			
			
			
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
						//&& transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.transaccioneslocalesnotascreditosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransaccionesLocalesNotasCreditos= new GridBagConstraints();
						this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
						this.jContentPaneDetalleTransaccionesLocalesNotasCreditos.add(this.jTabbedPaneRelacionesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransaccionesLocalesNotasCreditos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
					this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
					
				
					this.jContentPaneDetalleTransaccionesLocalesNotasCreditos.add(jPanelCamposOcultosTransaccionesLocalesNotasCreditos, gridBagConstraintsTransaccionesLocalesNotasCreditos);
				
					this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	        this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransaccionesLocalesNotasCreditos.add(this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);							
			
			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
	        this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
	        
			
			this.jContentPaneDetalleTransaccionesLocalesNotasCreditos.add(this.jPanelAccionesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos=   new JScrollPane(this.jPanelCamposTransaccionesLocalesNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);			
			
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
			
			
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		
			
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesNotasCreditos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionesLocalesNotasCreditos, this.gridBagConstraintsTransaccionesLocalesNotasCreditos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransaccionesLocalesNotasCreditos;//jContentPane;
		
		return jScrollPanelDatosEdicionTransaccionesLocalesNotasCreditos;
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
