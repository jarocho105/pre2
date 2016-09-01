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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.ParametroTesoreriaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class ParametroTesoreriaDetalleFormJInternalFrame extends ParametroTesoreriaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroTesoreria;
	
	protected JMenuBar jmenuBarDetalleParametroTesoreria;
	
	protected JMenu jmenuDetalleParametroTesoreria;
	protected JMenu jmenuDetalleArchivoParametroTesoreria;
	protected JMenu jmenuDetalleAccionesParametroTesoreria;
	protected JMenu jmenuDetalleDatosParametroTesoreria;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroTesoreria;	
	protected GridBagConstraints gridBagConstraintsParametroTesoreria;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroTesoreriaBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroTesoreria;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccioncobrarpagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncobrarpago="";

	protected TransaccionBeanSwingJInternalFrame transaccioncobrardebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncobrardebito="";

	protected TransaccionBeanSwingJInternalFrame transaccioncobrarcreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncobrarcredito="";

	protected TransaccionBeanSwingJInternalFrame transaccionpagarpagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionpagarpago="";

	protected TransaccionBeanSwingJInternalFrame transaccionpagardebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionpagardebito="";

	protected TransaccionBeanSwingJInternalFrame transaccionpagarcreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionpagarcredito="";
	
	public ParametroTesoreriaSessionBean parametrotesoreriaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccioncobrarpagoSessionBean;
	public TransaccionSessionBean transaccioncobrardebitoSessionBean;
	public TransaccionSessionBean transaccioncobrarcreditoSessionBean;
	public TransaccionSessionBean transaccionpagarpagoSessionBean;
	public TransaccionSessionBean transaccionpagardebitoSessionBean;
	public TransaccionSessionBean transaccionpagarcreditoSessionBean;	
	
	public ParametroTesoreriaLogic parametrotesoreriaLogic;
	
	public JScrollPane jScrollPanelDatosParametroTesoreria;
	public JScrollPane jScrollPanelDatosEdicionParametroTesoreria;
	public JScrollPane jScrollPanelDatosGeneralParametroTesoreria;
	
	protected JPanel jPanelCamposParametroTesoreria;    
	protected JPanel jPanelCamposOcultosParametroTesoreria;    	
	protected JPanel jPanelAccionesParametroTesoreria;
	protected JPanel jPanelAccionesFormularioParametroTesoreria;
    
	
	
	protected JTabbedPane jTabbedPaneCamposParametroTesoreria;	
	protected Integer iXPanelCamposParametroTesoreria=0;
	protected Integer iYPanelCamposParametroTesoreria=0;
	
	protected Integer iXPanelCamposOcultosParametroTesoreria=0;
	protected Integer iYPanelCamposOcultosParametroTesoreria=0;
	
	

	protected JPanel jPanelCamposIniciogeneralParametroTesoreria;
	protected Integer iXPanelCamposIniciogeneralParametroTesoreria=0;
	protected Integer iYPanelCamposIniciogeneralParametroTesoreria=0;

	protected JPanel jPanelCamposIniciocuentas_por_cobrarParametroTesoreria;
	protected Integer iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria=0;
	protected Integer iYPanelCamposIniciocuentas_por_cobrarParametroTesoreria=0;

	protected JPanel jPanelCamposIniciocuentas_por_pagarParametroTesoreria;
	protected Integer iXPanelCamposIniciocuentas_por_pagarParametroTesoreria=0;
	protected Integer iYPanelCamposIniciocuentas_por_pagarParametroTesoreria=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroTesoreria;
	public JButton jButtonModificarParametroTesoreria;
	public JButton jButtonActualizarParametroTesoreria;
    public JButton jButtonEliminarParametroTesoreria;
	public JButton jButtonCancelarParametroTesoreria;
    public JButton jButtonGuardarCambiosParametroTesoreria;
	public JButton jButtonGuardarCambiosTablaParametroTesoreria;
	protected JButton jButtonCerrarParametroTesoreria;
	
	
	protected JButton jButtonProcesarInformacionParametroTesoreria;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroTesoreria;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroTesoreria;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroTesoreria;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroTesoreria;
	protected JButton jButtonModificarToolBarParametroTesoreria;
	protected JButton jButtonActualizarToolBarParametroTesoreria;
    protected JButton jButtonEliminarToolBarParametroTesoreria;
	protected JButton jButtonCancelarToolBarParametroTesoreria;
    protected JButton jButtonGuardarCambiosToolBarParametroTesoreria;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroTesoreria;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroTesoreria;
	protected JButton jButtonCerrarToolBarParametroTesoreria;
	
	protected JButton jButtonProcesarInformacionToolBarParametroTesoreria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroTesoreria;
	protected JMenuItem jMenuItemModificarParametroTesoreria;
	protected JMenuItem jMenuItemActualizarParametroTesoreria;
    protected JMenuItem jMenuItemEliminarParametroTesoreria;
	protected JMenuItem jMenuItemCancelarParametroTesoreria;
    protected JMenuItem jMenuItemGuardarCambiosParametroTesoreria;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroTesoreria;
	protected JMenuItem jMenuItemCerrarParametroTesoreria;
	protected JMenuItem jMenuItemDetalleCerrarParametroTesoreria;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroTesoreria;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroTesoreria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroTesoreria;
	protected JMenuItem jMenuItemMostrarOcultarParametroTesoreria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroTesoreria;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroTesoreria;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroTesoreria;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroTesoreria;
	public JLabel jLabelIdParametroTesoreria;
	public JLabel jLabelidParametroTesoreria;
	public JButton jButtonidParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelcon_anticipo_orden_compraParametroTesoreria;
	public JLabel jLabelcon_anticipo_orden_compraParametroTesoreria;
	public JCheckBox jCheckBoxcon_anticipo_orden_compraParametroTesoreria;
	public JButton jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelpor_lotesParametroTesoreria;
	public JLabel jLabelpor_lotesParametroTesoreria;
	public JCheckBox jCheckBoxpor_lotesParametroTesoreria;
	public JButton jButtonpor_lotesParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionParametroTesoreria;
	public JLabel jLabeldescripcionParametroTesoreria;
	public JTextArea jTextAreadescripcionParametroTesoreria;
	public JScrollPane jscrollPanedescripcionParametroTesoreria;
	public JButton jButtondescripcionParametroTesoreriaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroTesoreria;
	public JLabel jLabelid_empresaParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroTesoreria;
	public JButton jButtonid_empresaParametroTesoreria= new JButtonMe();
	public JButton jButtonid_empresaParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cobrar_pagoParametroTesoreria;
	public JLabel jLabelid_transaccion_cobrar_pagoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cobrar_pagoParametroTesoreria;
	public JButton jButtonid_transaccion_cobrar_pagoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cobrar_debitoParametroTesoreria;
	public JLabel jLabelid_transaccion_cobrar_debitoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cobrar_debitoParametroTesoreria;
	public JButton jButtonid_transaccion_cobrar_debitoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cobrar_creditoParametroTesoreria;
	public JLabel jLabelid_transaccion_cobrar_creditoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cobrar_creditoParametroTesoreria;
	public JButton jButtonid_transaccion_cobrar_creditoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_pagar_pagoParametroTesoreria;
	public JLabel jLabelid_transaccion_pagar_pagoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_pagar_pagoParametroTesoreria;
	public JButton jButtonid_transaccion_pagar_pagoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_pagar_debitoParametroTesoreria;
	public JLabel jLabelid_transaccion_pagar_debitoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_pagar_debitoParametroTesoreria;
	public JButton jButtonid_transaccion_pagar_debitoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_pagar_creditoParametroTesoreria;
	public JLabel jLabelid_transaccion_pagar_creditoParametroTesoreria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_pagar_creditoParametroTesoreria;
	public JButton jButtonid_transaccion_pagar_creditoParametroTesoreria= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroTesoreria;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroTesoreriaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroTesoreria=new JPanel();
				this.jPanelAccionesFormularioParametroTesoreria=new JPanel();
				this.jmenuBarDetalleParametroTesoreria=new JMenuBar();
				this.jTtoolBarDetalleParametroTesoreria=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroTesoreriaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroTesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroTesoreria() {
		return this.jButtonActualizarToolBarParametroTesoreria;
	}
	
	public JButton getjButtonEliminarToolBarParametroTesoreria() {
		return this.jButtonEliminarToolBarParametroTesoreria;
	}
	
	public JButton getjButtonCancelarToolBarParametroTesoreria() {
		return this.jButtonCancelarToolBarParametroTesoreria;
	}		
	
	public JButton getjButtonProcesarInformacionParametroTesoreria() {
		return this.jButtonProcesarInformacionParametroTesoreria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroTesoreria)	{
		this.jButtonProcesarInformacionParametroTesoreria = jButtonProcesarInformacionParametroTesoreria;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroTesoreria() {
		return this.jComboBoxTiposAccionesParametroTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroTesoreria(
			JComboBox jComboBoxTiposRelacionesParametroTesoreria) {
		this.jComboBoxTiposRelacionesParametroTesoreria = jComboBoxTiposRelacionesParametroTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroTesoreria(
			JComboBox jComboBoxTiposAccionesParametroTesoreria) {
		this.jComboBoxTiposAccionesParametroTesoreria = jComboBoxTiposAccionesParametroTesoreria;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroTesoreria() {
		return this.jComboBoxTiposAccionesFormularioParametroTesoreria;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroTesoreria(
			JComboBox jComboBoxTiposAccionesFormularioParametroTesoreria) {
		this.jComboBoxTiposAccionesFormularioParametroTesoreria = jComboBoxTiposAccionesFormularioParametroTesoreria;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrotesoreriaSessionBean=new ParametroTesoreriaSessionBean();
		
		this.parametrotesoreriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrotesoreriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrotesoreriaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroTesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroTesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroTesoreriaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Tesoreria MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroTesoreriaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroTesoreria= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroTesoreria=new JButtonMe();
				this.jButtonModificarToolBarParametroTesoreria=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroTesoreria,this.jTtoolBarDetalleParametroTesoreria,
							"actualizar","actualizar","Actualizar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroTesoreria,this.jTtoolBarDetalleParametroTesoreria,
							"eliminar","eliminar","Eliminar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroTesoreria,this.jTtoolBarDetalleParametroTesoreria,
							"cancelar","cancelar","Cancelar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroTesoreria,this.jTtoolBarDetalleParametroTesoreria,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroTesoreria=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroTesoreria=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroTesoreria=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroTesoreria=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroTesoreria=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroTesoreria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroTesoreria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroTesoreria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroTesoreria= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroTesoreria.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroTesoreria,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroTesoreria= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroTesoreria.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroTesoreria,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroTesoreria= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroTesoreria.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroTesoreria,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroTesoreria= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroTesoreria.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroTesoreria,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroTesoreria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroTesoreria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroTesoreria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroTesoreria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroTesoreria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroTesoreria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroTesoreria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroTesoreria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroTesoreria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroTesoreria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroTesoreria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroTesoreria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroTesoreria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroTesoreria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroTesoreria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroTesoreria.add(this.jMenuItemDetalleCerrarParametroTesoreria);
		
		this.jmenuDetalleAccionesParametroTesoreria.add(this.jMenuItemActualizarParametroTesoreria);
		this.jmenuDetalleAccionesParametroTesoreria.add(this.jMenuItemEliminarParametroTesoreria);
		this.jmenuDetalleAccionesParametroTesoreria.add(this.jMenuItemCancelarParametroTesoreria);		
		
		//this.jmenuDetalleDatosParametroTesoreria.add(this.jMenuItemDetalleAbrirOrderByParametroTesoreria);				
		this.jmenuDetalleDatosParametroTesoreria.add(this.jMenuItemDetalleMostarOcultarParametroTesoreria);				
				
		//this.jmenuDetalleAccionesParametroTesoreria.add(this.jMenuItemGuardarCambiosParametroTesoreria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroTesoreria.add(this.jmenuDetalleArchivoParametroTesoreria);		
		this.jmenuBarDetalleParametroTesoreria.add(this.jmenuDetalleAccionesParametroTesoreria);		
		this.jmenuBarDetalleParametroTesoreria.add(this.jmenuDetalleDatosParametroTesoreria);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroTesoreria);				
	}
	
	
	public void inicializarElementosCamposParametroTesoreria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroTesoreria = new JLabelMe();
		jLabelIdParametroTesoreria.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroTesoreria = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroTesoreria= new GridBagLayout();

		this.jPanelidParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);

		jLabelidParametroTesoreria = new JLabel();
		jLabelidParametroTesoreria.setText("Id");

		jLabelidParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_anticipo_orden_compraParametroTesoreria = new JLabelMe();
		this.jLabelcon_anticipo_orden_compraParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA+" : *");
		this.jLabelcon_anticipo_orden_compraParametroTesoreria.setToolTipText("Anticipo Orden Compra");
		this.jLabelcon_anticipo_orden_compraParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_anticipo_orden_compraParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_anticipo_orden_compraParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_anticipo_orden_compraParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_anticipo_orden_compraParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_anticipo_orden_compraParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_CONANTICIPOORDENCOMPRA);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelcon_anticipo_orden_compraParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jCheckBoxcon_anticipo_orden_compraParametroTesoreria= new JCheckBoxMe();
		jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setEnabled(false);

		jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_anticipo_orden_compraParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_anticipo_orden_compraParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.setText("U");
		this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_anticipo_orden_compraParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_anticipo_orden_compraParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_anticipo_orden_compraParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda.setVisible(false);		}


					
		this.jLabelpor_lotesParametroTesoreria = new JLabelMe();
		this.jLabelpor_lotesParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES+" : *");
		this.jLabelpor_lotesParametroTesoreria.setToolTipText("Por Lotes");
		this.jLabelpor_lotesParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpor_lotesParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpor_lotesParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpor_lotesParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpor_lotesParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpor_lotesParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_PORLOTES);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelpor_lotesParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jCheckBoxpor_lotesParametroTesoreria= new JCheckBoxMe();
		jCheckBoxpor_lotesParametroTesoreria.setEnabled(false);

		jCheckBoxpor_lotesParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpor_lotesParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpor_lotesParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpor_lotesParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpor_lotesParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtonpor_lotesParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpor_lotesParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpor_lotesParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpor_lotesParametroTesoreriaBusqueda.setText("U");
		this.jButtonpor_lotesParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpor_lotesParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpor_lotesParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpor_lotesParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpor_lotesParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"por_lotesParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpor_lotesParametroTesoreriaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionParametroTesoreria = new JLabelMe();
		this.jLabeldescripcionParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionParametroTesoreria.setToolTipText("Descripcion");
		this.jLabeldescripcionParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPaneldescripcionParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jTextAreadescripcionParametroTesoreria= new JTextAreaMe();
		jTextAreadescripcionParametroTesoreria.setEnabled(false);
		jTextAreadescripcionParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroTesoreria.setLineWrap(true);
		jTextAreadescripcionParametroTesoreria.setWrapStyleWord(true);
		jTextAreadescripcionParametroTesoreria.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionParametroTesoreria.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionParametroTesoreria = new JScrollPane(jTextAreadescripcionParametroTesoreria);
		jscrollPanedescripcionParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtondescripcionParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionParametroTesoreriaBusqueda.setText("U");
		this.jButtondescripcionParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionParametroTesoreriaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroTesoreria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroTesoreria = new JLabelMe();
		this.jLabelid_empresaParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroTesoreria.setToolTipText("Empresa");
		this.jLabelid_empresaParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelid_empresaParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jComboBoxid_empresaParametroTesoreria= new JComboBoxMe();
		jComboBoxid_empresaParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroTesoreria.setEnabled(false);

		this.jButtonid_empresaParametroTesoreria= new JButtonMe();
		this.jButtonid_empresaParametroTesoreria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroTesoreria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroTesoreria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroTesoreria.setText("Buscar");
		this.jButtonid_empresaParametroTesoreria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroTesoreria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroTesoreria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroTesoreria"));

		this.jButtonid_empresaParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroTesoreriaBusqueda.setText("U");
		this.jButtonid_empresaParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroTesoreriaBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroTesoreriaUpdate= new JButtonMe();
		this.jButtonid_empresaParametroTesoreriaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroTesoreriaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroTesoreriaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroTesoreriaUpdate.setText("U");
		this.jButtonid_empresaParametroTesoreriaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroTesoreriaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroTesoreriaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroTesoreriaUpdate"));



					
		this.jLabelid_transaccion_cobrar_pagoParametroTesoreria = new JLabelMe();
		this.jLabelid_transaccion_cobrar_pagoParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO+" : *");
		this.jLabelid_transaccion_cobrar_pagoParametroTesoreria.setToolTipText("Transaccion Pago");
		this.jLabelid_transaccion_cobrar_pagoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cobrar_pagoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cobrar_pagoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cobrar_pagoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cobrar_pagoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cobrar_pagoParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARPAGO);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelid_transaccion_cobrar_pagoParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cobrar_pagoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cobrar_pagoParametroTesoreria= new JButtonMe();
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreria.setText("Buscar");
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_pagoParametroTesoreria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_pagoParametroTesoreria"));

		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.setText("U");
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_pagoParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate= new JButtonMe();
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.setText("U");
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_pagoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_pagoParametroTesoreriaUpdate"));



					
		this.jLabelid_transaccion_cobrar_debitoParametroTesoreria = new JLabelMe();
		this.jLabelid_transaccion_cobrar_debitoParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO+" : *");
		this.jLabelid_transaccion_cobrar_debitoParametroTesoreria.setToolTipText("Transaccion Debito");
		this.jLabelid_transaccion_cobrar_debitoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cobrar_debitoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cobrar_debitoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cobrar_debitoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cobrar_debitoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cobrar_debitoParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARDEBITO);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelid_transaccion_cobrar_debitoParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cobrar_debitoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cobrar_debitoParametroTesoreria= new JButtonMe();
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreria.setText("Buscar");
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_debitoParametroTesoreria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_debitoParametroTesoreria"));

		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.setText("U");
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_debitoParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate= new JButtonMe();
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.setText("U");
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_debitoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_debitoParametroTesoreriaUpdate"));



					
		this.jLabelid_transaccion_cobrar_creditoParametroTesoreria = new JLabelMe();
		this.jLabelid_transaccion_cobrar_creditoParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO+" : *");
		this.jLabelid_transaccion_cobrar_creditoParametroTesoreria.setToolTipText("Transaccion Credito");
		this.jLabelid_transaccion_cobrar_creditoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cobrar_creditoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cobrar_creditoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cobrar_creditoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cobrar_creditoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cobrar_creditoParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONCOBRARCREDITO);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelid_transaccion_cobrar_creditoParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cobrar_creditoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cobrar_creditoParametroTesoreria= new JButtonMe();
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreria.setText("Buscar");
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_creditoParametroTesoreria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_creditoParametroTesoreria"));

		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.setText("U");
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_creditoParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate= new JButtonMe();
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.setText("U");
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cobrar_creditoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cobrar_creditoParametroTesoreriaUpdate"));



					
		this.jLabelid_transaccion_pagar_pagoParametroTesoreria = new JLabelMe();
		this.jLabelid_transaccion_pagar_pagoParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO+" : *");
		this.jLabelid_transaccion_pagar_pagoParametroTesoreria.setToolTipText("Transaccion Pago.");
		this.jLabelid_transaccion_pagar_pagoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_pagar_pagoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_pagar_pagoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_pagar_pagoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_pagar_pagoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_pagar_pagoParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARPAGO);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelid_transaccion_pagar_pagoParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jComboBoxid_transaccion_pagar_pagoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_pagar_pagoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_pagar_pagoParametroTesoreria= new JButtonMe();
		this.jButtonid_transaccion_pagar_pagoParametroTesoreria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_pagoParametroTesoreria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_pagoParametroTesoreria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_pagoParametroTesoreria.setText("Buscar");
		this.jButtonid_transaccion_pagar_pagoParametroTesoreria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_pagar_pagoParametroTesoreria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_pagoParametroTesoreria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_pagoParametroTesoreria"));

		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.setText("U");
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_pagoParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate= new JButtonMe();
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.setText("U");
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_pagoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_pagoParametroTesoreriaUpdate"));



					
		this.jLabelid_transaccion_pagar_debitoParametroTesoreria = new JLabelMe();
		this.jLabelid_transaccion_pagar_debitoParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO+" : *");
		this.jLabelid_transaccion_pagar_debitoParametroTesoreria.setToolTipText("Transaccion Debito.");
		this.jLabelid_transaccion_pagar_debitoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_pagar_debitoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_pagar_debitoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_pagar_debitoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_pagar_debitoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_pagar_debitoParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARDEBITO);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelid_transaccion_pagar_debitoParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jComboBoxid_transaccion_pagar_debitoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_pagar_debitoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_pagar_debitoParametroTesoreria= new JButtonMe();
		this.jButtonid_transaccion_pagar_debitoParametroTesoreria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_debitoParametroTesoreria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_debitoParametroTesoreria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_debitoParametroTesoreria.setText("Buscar");
		this.jButtonid_transaccion_pagar_debitoParametroTesoreria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_pagar_debitoParametroTesoreria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_debitoParametroTesoreria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_debitoParametroTesoreria"));

		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.setText("U");
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_debitoParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate= new JButtonMe();
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.setText("U");
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_debitoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_debitoParametroTesoreriaUpdate"));



					
		this.jLabelid_transaccion_pagar_creditoParametroTesoreria = new JLabelMe();
		this.jLabelid_transaccion_pagar_creditoParametroTesoreria.setText(""+ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO+" : *");
		this.jLabelid_transaccion_pagar_creditoParametroTesoreria.setToolTipText("Transaccion Credito.");
		this.jLabelid_transaccion_pagar_creditoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_pagar_creditoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_pagar_creditoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_pagar_creditoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_pagar_creditoParametroTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_pagar_creditoParametroTesoreria.setToolTipText(ParametroTesoreriaConstantesFunciones.LABEL_IDTRANSACCIONPAGARCREDITO);
		this.gridaBagLayoutParametroTesoreria = new GridBagLayout();
		this.jPanelid_transaccion_pagar_creditoParametroTesoreria.setLayout(this.gridaBagLayoutParametroTesoreria);


		jComboBoxid_transaccion_pagar_creditoParametroTesoreria= new JComboBoxMe();
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_pagar_creditoParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_pagar_creditoParametroTesoreria= new JButtonMe();
		this.jButtonid_transaccion_pagar_creditoParametroTesoreria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_creditoParametroTesoreria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_creditoParametroTesoreria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_pagar_creditoParametroTesoreria.setText("Buscar");
		this.jButtonid_transaccion_pagar_creditoParametroTesoreria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_pagar_creditoParametroTesoreria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_creditoParametroTesoreria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_creditoParametroTesoreria"));

		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda= new JButtonMe();
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.setText("U");
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_creditoParametroTesoreriaBusqueda"));

		if(this.parametrotesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate= new JButtonMe();
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.setText("U");
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_pagar_creditoParametroTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_pagar_creditoParametroTesoreriaUpdate"));



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
		//this.jInternalFrameDetalleParametroTesoreria = new ParametroTesoreriaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Tesoreria DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroTesoreria= new GridBagLayout();
		

		
		String sToolTipParametroTesoreria="";
		sToolTipParametroTesoreria=ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroTesoreria+="(Tesoreria.ParametroTesoreria)";
		}
		
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroTesoreria+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroTesoreria = new JButtonMe();
		this.jButtonModificarParametroTesoreria = new JButtonMe();
        this.jButtonActualizarParametroTesoreria = new JButtonMe();
        this.jButtonEliminarParametroTesoreria = new JButtonMe();
        this.jButtonCancelarParametroTesoreria = new JButtonMe();
        this.jButtonGuardarCambiosParametroTesoreria = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroTesoreria = new JButtonMe();
		this.jButtonCerrarParametroTesoreria = new JButtonMe();
		
		this.jScrollPanelDatosParametroTesoreria = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroTesoreria = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroTesoreria = new JScrollPane();
				
		
		
		this.jPanelCamposParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposParametroTesoreria=new JTabbedPane();
		
		
		this.jTabbedPaneCamposParametroTesoreria.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Tesoreria";
		
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesorerias" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroTesoreria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroTesoreria.setName("jPanelCamposParametroTesoreria"); 

		this.jPanelCamposOcultosParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroTesoreria.setName("jPanelCamposOcultosParametroTesoreria"); 

        this.jPanelAccionesParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroTesoreria.setToolTipText("Acciones");
        this.jPanelAccionesParametroTesoreria.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroTesoreria.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroTesoreria.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroTesoreria.setName("jPanelCamposFingeneralParametroTesoreria");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Por Cobrar"));
		this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.setName("jPanelCamposFincuentas_por_cobrarParametroTesoreria");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Por Pagar"));
		this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.setName("jPanelCamposFincuentas_por_pagarParametroTesoreria");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroTesoreria.setText("Nuevo");
		this.jButtonModificarParametroTesoreria.setText("Editar");
        this.jButtonActualizarParametroTesoreria.setText("Actualizar");
        this.jButtonEliminarParametroTesoreria.setText("Eliminar");
        this.jButtonCancelarParametroTesoreria.setText("Cancelar");
        this.jButtonGuardarCambiosParametroTesoreria.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroTesoreria.setText("Guardar");
		this.jButtonCerrarParametroTesoreria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroTesoreria,"nuevo_button","Nuevo",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroTesoreria,"modificar_button","Editar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroTesoreria,"actualizar_button","Actualizar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroTesoreria,"eliminar_button","Eliminar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroTesoreria,"cancelar_button","Cancelar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroTesoreria,"guardarcambios_button","Guardar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroTesoreria,"guardarcambiostabla_button","Guardar",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroTesoreria,"cerrar_button","Salir",this.parametrotesoreriaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroTesoreria.setToolTipText("Nuevo"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroTesoreria.setToolTipText("Editar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroTesoreria.setToolTipText("Actualizar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroTesoreria.setToolTipText("Eliminar)"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroTesoreria.setToolTipText("Cancelar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroTesoreria.setToolTipText("Guardar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroTesoreria.setToolTipText("Guardar"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroTesoreria.setToolTipText("Salir"+" "+ParametroTesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroTesoreria";
		inputMap = this.jButtonNuevoParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroTesoreria"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroTesoreria";
		inputMap = this.jButtonActualizarParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroTesoreria"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroTesoreria";
		inputMap = this.jButtonEliminarParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroTesoreria"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroTesoreria";
		inputMap = this.jButtonCancelarParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroTesoreria"));
		
		//CERRAR		
		sMapKey = "CerrarParametroTesoreria";
		inputMap = this.jButtonCerrarParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroTesoreria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroTesoreria";
		inputMap = this.jButtonGuardarCambiosTablaParametroTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroTesoreria"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroTesoreria = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroTesoreria.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroTesoreria.setToolTipText("Nuevo ParametroTesoreria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroTesoreria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroTesoreria.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroTesoreria.setToolTipText("Sin Cerrar Ventana ParametroTesoreria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroTesoreria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroTesoreria.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroTesoreria.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroTesoreria.setText("Accion");
		this.jComboBoxTiposAccionesParametroTesoreria.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroTesoreria.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroTesoreria.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroTesoreria = new JLabelMe();
		
		this.jLabelAccionesParametroTesoreria.setText("Acciones");		
		this.jLabelAccionesParametroTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroTesoreria();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroTesoreria();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroTesoreria=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroTesoreria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroTesoreria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroTesoreria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroTesoreria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroTesoreria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroTesoreria.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroTesoreria = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroTesoreria = new GridBagLayout();
		
		this.jPanelCamposParametroTesoreria.setLayout(gridaBagLayoutCamposParametroTesoreria);
		this.jPanelCamposOcultosParametroTesoreria.setLayout(gridaBagLayoutCamposOcultosParametroTesoreria);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroTesoreria= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroTesoreria.setLayout(gridaBagLayoutCamposIniciogeneralParametroTesoreria);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_por_cobrarParametroTesoreria= new GridBagLayout();
		this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.setLayout(gridaBagLayoutCamposIniciocuentas_por_cobrarParametroTesoreria);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_por_pagarParametroTesoreria= new GridBagLayout();
		this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.setLayout(gridaBagLayoutCamposIniciocuentas_por_pagarParametroTesoreria);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroTesoreria.add(jLabelIdParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroTesoreria.add(jLabelidParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroTesoreria.add(jLabelid_empresaParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroTesoreria.add(jButtonid_empresaParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 3;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroTesoreria.add(jButtonid_empresaParametroTesoreriaUpdate, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroTesoreria.add(jComboBoxid_empresaParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_anticipo_orden_compraParametroTesoreria.add(jLabelcon_anticipo_orden_compraParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_anticipo_orden_compraParametroTesoreria.add(jButtoncon_anticipo_orden_compraParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_anticipo_orden_compraParametroTesoreria.add(jCheckBoxcon_anticipo_orden_compraParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpor_lotesParametroTesoreria.add(jLabelpor_lotesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelpor_lotesParametroTesoreria.add(jButtonpor_lotesParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpor_lotesParametroTesoreria.add(jCheckBoxpor_lotesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cobrar_pagoParametroTesoreria.add(jLabelid_transaccion_cobrar_pagoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cobrar_pagoParametroTesoreria.add(jButtonid_transaccion_cobrar_pagoParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 3;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cobrar_pagoParametroTesoreria.add(jButtonid_transaccion_cobrar_pagoParametroTesoreriaUpdate, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cobrar_pagoParametroTesoreria.add(jComboBoxid_transaccion_cobrar_pagoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cobrar_debitoParametroTesoreria.add(jLabelid_transaccion_cobrar_debitoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cobrar_debitoParametroTesoreria.add(jButtonid_transaccion_cobrar_debitoParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 3;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cobrar_debitoParametroTesoreria.add(jButtonid_transaccion_cobrar_debitoParametroTesoreriaUpdate, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cobrar_debitoParametroTesoreria.add(jComboBoxid_transaccion_cobrar_debitoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cobrar_creditoParametroTesoreria.add(jLabelid_transaccion_cobrar_creditoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cobrar_creditoParametroTesoreria.add(jButtonid_transaccion_cobrar_creditoParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 3;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cobrar_creditoParametroTesoreria.add(jButtonid_transaccion_cobrar_creditoParametroTesoreriaUpdate, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cobrar_creditoParametroTesoreria.add(jComboBoxid_transaccion_cobrar_creditoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_pagar_pagoParametroTesoreria.add(jLabelid_transaccion_pagar_pagoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_pagar_pagoParametroTesoreria.add(jButtonid_transaccion_pagar_pagoParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 3;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_pagar_pagoParametroTesoreria.add(jButtonid_transaccion_pagar_pagoParametroTesoreriaUpdate, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_pagar_pagoParametroTesoreria.add(jComboBoxid_transaccion_pagar_pagoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_pagar_debitoParametroTesoreria.add(jLabelid_transaccion_pagar_debitoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_pagar_debitoParametroTesoreria.add(jButtonid_transaccion_pagar_debitoParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 3;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_pagar_debitoParametroTesoreria.add(jButtonid_transaccion_pagar_debitoParametroTesoreriaUpdate, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_pagar_debitoParametroTesoreria.add(jComboBoxid_transaccion_pagar_debitoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_pagar_creditoParametroTesoreria.add(jLabelid_transaccion_pagar_creditoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_pagar_creditoParametroTesoreria.add(jButtonid_transaccion_pagar_creditoParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 3;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_pagar_creditoParametroTesoreria.add(jButtonid_transaccion_pagar_creditoParametroTesoreriaUpdate, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_pagar_creditoParametroTesoreria.add(jComboBoxid_transaccion_pagar_creditoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 0;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionParametroTesoreria.add(jLabeldescripcionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = 2;
		this.gridBagConstraintsParametroTesoreria.ipadx = 0;
		this.gridBagConstraintsParametroTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionParametroTesoreria.add(jButtondescripcionParametroTesoreriaBusqueda, this.gridBagConstraintsParametroTesoreria);
	}

	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreria.gridy = 0;
	this.gridBagConstraintsParametroTesoreria.gridx = 1;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionParametroTesoreria.add(jscrollPanedescripcionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposOcultosParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposOcultosParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroTesoreria.add(this.jPanelid_empresaParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposOcultosParametroTesoreria % 1==0) {
		iXPanelCamposOcultosParametroTesoreria=0;
		iYPanelCamposOcultosParametroTesoreria++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciogeneralParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciogeneralParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroTesoreria.add(this.jPanelidParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciogeneralParametroTesoreria % 1==0) {
		iXPanelCamposIniciogeneralParametroTesoreria=0;
		iYPanelCamposIniciogeneralParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciogeneralParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciogeneralParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroTesoreria.add(this.jPanelcon_anticipo_orden_compraParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciogeneralParametroTesoreria % 1==0) {
		iXPanelCamposIniciogeneralParametroTesoreria=0;
		iYPanelCamposIniciogeneralParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciogeneralParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciogeneralParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroTesoreria.add(this.jPanelpor_lotesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciogeneralParametroTesoreria % 1==0) {
		iXPanelCamposIniciogeneralParametroTesoreria=0;
		iYPanelCamposIniciogeneralParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciocuentas_por_cobrarParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.add(this.jPanelid_transaccion_cobrar_pagoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria % 1==0) {
		iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria=0;
		iYPanelCamposIniciocuentas_por_cobrarParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciocuentas_por_cobrarParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.add(this.jPanelid_transaccion_cobrar_debitoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria % 1==0) {
		iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria=0;
		iYPanelCamposIniciocuentas_por_cobrarParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciocuentas_por_cobrarParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria.add(this.jPanelid_transaccion_cobrar_creditoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria % 1==0) {
		iXPanelCamposIniciocuentas_por_cobrarParametroTesoreria=0;
		iYPanelCamposIniciocuentas_por_cobrarParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciocuentas_por_pagarParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciocuentas_por_pagarParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.add(this.jPanelid_transaccion_pagar_pagoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciocuentas_por_pagarParametroTesoreria % 1==0) {
		iXPanelCamposIniciocuentas_por_pagarParametroTesoreria=0;
		iYPanelCamposIniciocuentas_por_pagarParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciocuentas_por_pagarParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciocuentas_por_pagarParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.add(this.jPanelid_transaccion_pagar_debitoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciocuentas_por_pagarParametroTesoreria % 1==0) {
		iXPanelCamposIniciocuentas_por_pagarParametroTesoreria=0;
		iYPanelCamposIniciocuentas_por_pagarParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciocuentas_por_pagarParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciocuentas_por_pagarParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria.add(this.jPanelid_transaccion_pagar_creditoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciocuentas_por_pagarParametroTesoreria % 1==0) {
		iXPanelCamposIniciocuentas_por_pagarParametroTesoreria=0;
		iYPanelCamposIniciocuentas_por_pagarParametroTesoreria++;
	}
	this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreria.gridy = iYPanelCamposIniciogeneralParametroTesoreria;
	this.gridBagConstraintsParametroTesoreria.gridx = iXPanelCamposIniciogeneralParametroTesoreria++;
	this.gridBagConstraintsParametroTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroTesoreria.add(this.jPaneldescripcionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);



	if(iXPanelCamposIniciogeneralParametroTesoreria % 1==0) {
		iXPanelCamposIniciogeneralParametroTesoreria=0;
		iYPanelCamposIniciogeneralParametroTesoreria++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesParametroTesoreria= new GridBagLayout();
		this.jPanelAccionesParametroTesoreria.setLayout(gridaBagLayoutAccionesParametroTesoreria);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroTesoreria= new GridBagLayout();
		this.jPanelAccionesFormularioParametroTesoreria.setLayout(gridaBagLayoutAccionesFormularioParametroTesoreria);
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroTesoreria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroTesoreria.add(this.jComboBoxTiposAccionesFormularioParametroTesoreria, this.gridBagConstraintsParametroTesoreria);

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroTesoreria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroTesoreria.add(this.jCheckBoxPostAccionNuevoParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroTesoreria.add(this.jCheckBoxPostAccionSinCerrarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrotesoreriaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroTesoreria.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroTesoreria.add(this.jCheckBoxPostAccionSinMensajeParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroTesoreria.add(this.jButtonModificarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);							

		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreria.gridy = 0;
		this.gridBagConstraintsParametroTesoreria.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroTesoreria.add(this.jButtonEliminarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
			
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = 0;		
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroTesoreria.add(this.jButtonActualizarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);


		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = 0;		
		this.gridBagConstraintsParametroTesoreria.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroTesoreria.add(this.jButtonGuardarCambiosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);	
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = 0;		
		this.gridBagConstraintsParametroTesoreria.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroTesoreria.add(this.jButtonCancelarParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroTesoreria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroTesoreria);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrotesoreriaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();						
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroTesoreria.gridx = 0;		
			//this.gridBagConstraintsParametroTesoreria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroTesoreria.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroTesoreria.gridx =0;
		this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroTesoreria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroTesoreriaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroTesoreria = new ParametroTesoreriaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Tesoreria DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Tesoreria DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Tesoreria Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroTesoreriaModel parametrotesoreriaModel=new ParametroTesoreriaModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroTesoreriaModel.ParametroTesoreriaFocusTraversalPolicy parametrotesoreriaFocusTraversalPolicy = parametrotesoreriaModel.new ParametroTesoreriaFocusTraversalPolicy(this);
			
			//parametrotesoreriaFocusTraversalPolicy.setparametrotesoreriaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrotesoreriaModel);
			
			
			this.jContentPaneDetalleParametroTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroTesoreria = new GridBagLayout();	
			this.jContentPaneDetalleParametroTesoreria.setLayout(gridaBagLayoutDetalleParametroTesoreria);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroTesoreria = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
				this.gridBagConstraintsParametroTesoreria.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroTesoreria.gridx = 0;
					
				
				this.jContentPaneDetalleParametroTesoreria.add(jTtoolBarDetalleParametroTesoreria, gridBagConstraintsParametroTesoreria);								
				
}
			
			this.jScrollPanelDatosEdicionParametroTesoreria=   new JScrollPane(jContentPaneDetalleParametroTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroTesoreria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroTesoreria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroTesoreria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroTesoreria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroTesoreria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroTesoreria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroTesoreria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposParametroTesoreria.add("General",this.jPanelCamposIniciogeneralParametroTesoreria);
		this.jTabbedPaneCamposParametroTesoreria.add("Cuentas Por Cobrar",this.jPanelCamposIniciocuentas_por_cobrarParametroTesoreria);
		this.jTabbedPaneCamposParametroTesoreria.add("Cuentas Por Pagar",this.jPanelCamposIniciocuentas_por_pagarParametroTesoreria);
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
						
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroTesoreria.gridx = 0;
	        
			this.jContentPaneDetalleParametroTesoreria.add(jTabbedPaneCamposParametroTesoreria, gridBagConstraintsParametroTesoreria);
			
			
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
						&& parametrotesoreriaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrotesoreriaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroTesoreria= new GridBagConstraints();
						this.gridBagConstraintsParametroTesoreria.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroTesoreria.gridx = 0;
						this.jContentPaneDetalleParametroTesoreria.add(this.jTabbedPaneRelacionesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroTesoreria.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroTesoreria.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
					this.gridBagConstraintsParametroTesoreria.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroTesoreria.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroTesoreria.gridx = 0;
					
				
					this.jContentPaneDetalleParametroTesoreria.add(jPanelCamposOcultosParametroTesoreria, gridBagConstraintsParametroTesoreria);
				
					this.jPanelCamposOcultosParametroTesoreria.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroTesoreria.gridx = 0;
	        this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroTesoreria.add(this.jPanelAccionesFormularioParametroTesoreria, this.gridBagConstraintsParametroTesoreria);							
			
			
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
	        this.gridBagConstraintsParametroTesoreria.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroTesoreria.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroTesoreria.add(this.jPanelAccionesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroTesoreria);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroTesoreria=   new JScrollPane(this.jPanelCamposParametroTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroTesoreria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroTesoreria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroTesoreria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroTesoreria.gridx = 0;
			this.gridBagConstraintsParametroTesoreria.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroTesoreria.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroTesoreria.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroTesoreria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroTesoreria, this.gridBagConstraintsParametroTesoreria);			
			
			this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroTesoreria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
			
			
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		
			
		this.gridBagConstraintsParametroTesoreria = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroTesoreria, this.gridBagConstraintsParametroTesoreria);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroTesoreria;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroTesoreria;
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
