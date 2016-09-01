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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.TransferenciasConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class TransferenciasDetalleFormJInternalFrame extends TransferenciasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransferencias;
	
	protected JMenuBar jmenuBarDetalleTransferencias;
	
	protected JMenu jmenuDetalleTransferencias;
	protected JMenu jmenuDetalleArchivoTransferencias;
	protected JMenu jmenuDetalleAccionesTransferencias;
	protected JMenu jmenuDetalleDatosTransferencias;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransferencias;	
	protected GridBagConstraints gridBagConstraintsTransferencias;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransferenciasBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransferencias;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TransferenciasSessionBean transferenciasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TransferenciasLogic transferenciasLogic;
	
	public JScrollPane jScrollPanelDatosTransferencias;
	public JScrollPane jScrollPanelDatosEdicionTransferencias;
	public JScrollPane jScrollPanelDatosGeneralTransferencias;
	
	protected JPanel jPanelCamposTransferencias;    
	protected JPanel jPanelCamposOcultosTransferencias;    	
	protected JPanel jPanelAccionesTransferencias;
	protected JPanel jPanelAccionesFormularioTransferencias;
    
	
	
	protected Integer iXPanelCamposTransferencias=0;
	protected Integer iYPanelCamposTransferencias=0;
	
	protected Integer iXPanelCamposOcultosTransferencias=0;
	protected Integer iYPanelCamposOcultosTransferencias=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransferencias;
	public JButton jButtonModificarTransferencias;
	public JButton jButtonActualizarTransferencias;
    public JButton jButtonEliminarTransferencias;
	public JButton jButtonCancelarTransferencias;
    public JButton jButtonGuardarCambiosTransferencias;
	public JButton jButtonGuardarCambiosTablaTransferencias;
	protected JButton jButtonCerrarTransferencias;
	
	
	protected JButton jButtonProcesarInformacionTransferencias;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransferencias;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransferencias;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransferencias;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransferencias;
	protected JButton jButtonModificarToolBarTransferencias;
	protected JButton jButtonActualizarToolBarTransferencias;
    protected JButton jButtonEliminarToolBarTransferencias;
	protected JButton jButtonCancelarToolBarTransferencias;
    protected JButton jButtonGuardarCambiosToolBarTransferencias;
	protected JButton jButtonGuardarCambiosTablaToolBarTransferencias;
	protected JButton jButtonMostrarOcultarTablaToolBarTransferencias;
	protected JButton jButtonCerrarToolBarTransferencias;
	
	protected JButton jButtonProcesarInformacionToolBarTransferencias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransferencias;
	protected JMenuItem jMenuItemModificarTransferencias;
	protected JMenuItem jMenuItemActualizarTransferencias;
    protected JMenuItem jMenuItemEliminarTransferencias;
	protected JMenuItem jMenuItemCancelarTransferencias;
    protected JMenuItem jMenuItemGuardarCambiosTransferencias;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransferencias;
	protected JMenuItem jMenuItemCerrarTransferencias;
	protected JMenuItem jMenuItemDetalleCerrarTransferencias;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransferencias;
	
	protected JMenuItem jMenuItemProcesarInformacionTransferencias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransferencias;
	protected JMenuItem jMenuItemMostrarOcultarTransferencias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransferencias;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransferencias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransferencias;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransferencias;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransferencias;
	public JLabel jLabelIdTransferencias;
	public JLabel jLabelidTransferencias;
	public JButton jButtonidTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelempresa_origenTransferencias;
	public JLabel jLabelempresa_origenTransferencias;
	public JTextArea jTextAreaempresa_origenTransferencias;
	public JScrollPane jscrollPaneempresa_origenTransferencias;
	public JButton jButtonempresa_origenTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelsucursal_origenTransferencias;
	public JLabel jLabelsucursal_origenTransferencias;
	public JTextArea jTextAreasucursal_origenTransferencias;
	public JScrollPane jscrollPanesucursal_origenTransferencias;
	public JButton jButtonsucursal_origenTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelsub_grupo_origenTransferencias;
	public JLabel jLabelsub_grupo_origenTransferencias;
	public JTextArea jTextAreasub_grupo_origenTransferencias;
	public JScrollPane jscrollPanesub_grupo_origenTransferencias;
	public JButton jButtonsub_grupo_origenTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelgrupo_origenTransferencias;
	public JLabel jLabelgrupo_origenTransferencias;
	public JTextArea jTextAreagrupo_origenTransferencias;
	public JScrollPane jscrollPanegrupo_origenTransferencias;
	public JButton jButtongrupo_origenTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelactivo_origenTransferencias;
	public JLabel jLabelactivo_origenTransferencias;
	public JTextArea jTextAreaactivo_origenTransferencias;
	public JScrollPane jscrollPaneactivo_origenTransferencias;
	public JButton jButtonactivo_origenTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelempresa_destinoTransferencias;
	public JLabel jLabelempresa_destinoTransferencias;
	public JTextArea jTextAreaempresa_destinoTransferencias;
	public JScrollPane jscrollPaneempresa_destinoTransferencias;
	public JButton jButtonempresa_destinoTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelsucursal_destinoTransferencias;
	public JLabel jLabelsucursal_destinoTransferencias;
	public JTextArea jTextAreasucursal_destinoTransferencias;
	public JScrollPane jscrollPanesucursal_destinoTransferencias;
	public JButton jButtonsucursal_destinoTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelsub_grupo_destinoTransferencias;
	public JLabel jLabelsub_grupo_destinoTransferencias;
	public JTextArea jTextAreasub_grupo_destinoTransferencias;
	public JScrollPane jscrollPanesub_grupo_destinoTransferencias;
	public JButton jButtonsub_grupo_destinoTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelgrupo_destinoTransferencias;
	public JLabel jLabelgrupo_destinoTransferencias;
	public JTextArea jTextAreagrupo_destinoTransferencias;
	public JScrollPane jscrollPanegrupo_destinoTransferencias;
	public JButton jButtongrupo_destinoTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelactivo_destinoTransferencias;
	public JLabel jLabelactivo_destinoTransferencias;
	public JTextArea jTextAreaactivo_destinoTransferencias;
	public JScrollPane jscrollPaneactivo_destinoTransferencias;
	public JButton jButtonactivo_destinoTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialTransferencias;
	public JLabel jLabelsecuencialTransferencias;
	public JTextField jTextFieldsecuencialTransferencias;
	public JButton jButtonsecuencialTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelfechaTransferencias;
	public JLabel jLabelfechaTransferencias;
	//public JFormattedTextField jDateChooserfechaTransferencias;

	public JDateChooser jDateChooserfechaTransferencias;
	public JButton jButtonfechaTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoTransferencias;
	public JLabel jLabelnumero_documentoTransferencias;
	public JTextField jTextFieldnumero_documentoTransferencias;
	public JButton jButtonnumero_documentoTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelcostoTransferencias;
	public JLabel jLabelcostoTransferencias;
	public JTextField jTextFieldcostoTransferencias;
	public JButton jButtoncostoTransferenciasBusqueda= new JButtonMe();

	public JPanel jPaneldepreciacionTransferencias;
	public JLabel jLabeldepreciacionTransferencias;
	public JTextField jTextFielddepreciacionTransferencias;
	public JButton jButtondepreciacionTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelcosto_origenTransferencias;
	public JLabel jLabelcosto_origenTransferencias;
	public JTextField jTextFieldcosto_origenTransferencias;
	public JButton jButtoncosto_origenTransferenciasBusqueda= new JButtonMe();

	public JPanel jPaneldepreciacion_origenTransferencias;
	public JLabel jLabeldepreciacion_origenTransferencias;
	public JTextField jTextFielddepreciacion_origenTransferencias;
	public JButton jButtondepreciacion_origenTransferenciasBusqueda= new JButtonMe();

	public JPanel jPanelrazonTransferencias;
	public JLabel jLabelrazonTransferencias;
	public JTextArea jTextArearazonTransferencias;
	public JScrollPane jscrollPanerazonTransferencias;
	public JButton jButtonrazonTransferenciasBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTransferencias;
	public JLabel jLabeldescripcionTransferencias;
	public JTextArea jTextAreadescripcionTransferencias;
	public JScrollPane jscrollPanedescripcionTransferencias;
	public JButton jButtondescripcionTransferenciasBusqueda= new JButtonMe();

	public JPanel jPaneltipoTransferencias;
	public JLabel jLabeltipoTransferencias;
	public JTextField jTextFieldtipoTransferencias;
	public JButton jButtontipoTransferenciasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransferencias;
	public JLabel jLabelid_empresaTransferencias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransferencias;
	public JButton jButtonid_empresaTransferencias= new JButtonMe();
	public JButton jButtonid_empresaTransferenciasUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransferenciasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransferencias;
	
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
	public int iHeightFormulario=1232;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransferenciasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransferencias=new JPanel();
				this.jPanelAccionesFormularioTransferencias=new JPanel();
				this.jmenuBarDetalleTransferencias=new JMenuBar();
				this.jTtoolBarDetalleTransferencias=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransferenciasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transferencias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransferencias() {
		return this.jButtonActualizarToolBarTransferencias;
	}
	
	public JButton getjButtonEliminarToolBarTransferencias() {
		return this.jButtonEliminarToolBarTransferencias;
	}
	
	public JButton getjButtonCancelarToolBarTransferencias() {
		return this.jButtonCancelarToolBarTransferencias;
	}		
	
	public JButton getjButtonProcesarInformacionTransferencias() {
		return this.jButtonProcesarInformacionTransferencias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransferencias)	{
		this.jButtonProcesarInformacionTransferencias = jButtonProcesarInformacionTransferencias;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransferencias() {
		return this.jComboBoxTiposAccionesTransferencias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransferencias(
			JComboBox jComboBoxTiposRelacionesTransferencias) {
		this.jComboBoxTiposRelacionesTransferencias = jComboBoxTiposRelacionesTransferencias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransferencias(
			JComboBox jComboBoxTiposAccionesTransferencias) {
		this.jComboBoxTiposAccionesTransferencias = jComboBoxTiposAccionesTransferencias;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransferencias() {
		return this.jComboBoxTiposAccionesFormularioTransferencias;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransferencias(
			JComboBox jComboBoxTiposAccionesFormularioTransferencias) {
		this.jComboBoxTiposAccionesFormularioTransferencias = jComboBoxTiposAccionesFormularioTransferencias;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transferenciasSessionBean=new TransferenciasSessionBean();
		
		this.transferenciasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transferenciasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transferenciasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransferenciasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransferenciasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransferenciasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transferencias MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
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
	
		TransferenciasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransferencias= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransferencias=new JButtonMe();
				this.jButtonModificarToolBarTransferencias=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransferencias,this.jTtoolBarDetalleTransferencias,
							"actualizar","actualizar","Actualizar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransferencias,this.jTtoolBarDetalleTransferencias,
							"eliminar","eliminar","Eliminar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransferencias,this.jTtoolBarDetalleTransferencias,
							"cancelar","cancelar","Cancelar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransferencias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransferencias,this.jTtoolBarDetalleTransferencias,
							"guardarcambios","guardarcambios","Guardar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransferencias=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransferencias=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransferencias=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransferencias=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransferencias=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransferencias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransferencias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransferencias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransferencias= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransferencias.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransferencias,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransferencias= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransferencias.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransferencias,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransferencias= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransferencias.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransferencias,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransferencias= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransferencias.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransferencias,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransferencias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransferencias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransferencias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransferencias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransferencias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransferencias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransferencias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransferencias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransferencias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransferencias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransferencias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransferencias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransferencias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransferencias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransferencias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransferencias.add(this.jMenuItemDetalleCerrarTransferencias);
		
		this.jmenuDetalleAccionesTransferencias.add(this.jMenuItemActualizarTransferencias);
		this.jmenuDetalleAccionesTransferencias.add(this.jMenuItemEliminarTransferencias);
		this.jmenuDetalleAccionesTransferencias.add(this.jMenuItemCancelarTransferencias);		
		
		//this.jmenuDetalleDatosTransferencias.add(this.jMenuItemDetalleAbrirOrderByTransferencias);				
		this.jmenuDetalleDatosTransferencias.add(this.jMenuItemDetalleMostarOcultarTransferencias);				
				
		//this.jmenuDetalleAccionesTransferencias.add(this.jMenuItemGuardarCambiosTransferencias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransferencias.add(this.jmenuDetalleArchivoTransferencias);		
		this.jmenuBarDetalleTransferencias.add(this.jmenuDetalleAccionesTransferencias);		
		this.jmenuBarDetalleTransferencias.add(this.jmenuDetalleDatosTransferencias);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransferencias);				
	}
	
	
	public void inicializarElementosCamposTransferencias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransferencias = new JLabelMe();
		jLabelIdTransferencias.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransferencias = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransferencias= new GridBagLayout();

		this.jPanelidTransferencias.setLayout(this.gridaBagLayoutTransferencias);

		jLabelidTransferencias = new JLabel();
		jLabelidTransferencias.setText("Id");

		jLabelidTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelempresa_origenTransferencias = new JLabelMe();
		this.jLabelempresa_origenTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN+" : *");
		this.jLabelempresa_origenTransferencias.setToolTipText("Empresa Origen");
		this.jLabelempresa_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelempresa_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelempresa_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelempresa_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelempresa_origenTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelempresa_origenTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_EMPRESAORIGEN);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelempresa_origenTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreaempresa_origenTransferencias= new JTextAreaMe();
		jTextAreaempresa_origenTransferencias.setEnabled(false);
		jTextAreaempresa_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_origenTransferencias.setLineWrap(true);
		jTextAreaempresa_origenTransferencias.setWrapStyleWord(true);
		jTextAreaempresa_origenTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaempresa_origenTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaempresa_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneempresa_origenTransferencias = new JScrollPane(jTextAreaempresa_origenTransferencias);
		jscrollPaneempresa_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneempresa_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneempresa_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonempresa_origenTransferenciasBusqueda= new JButtonMe();
		this.jButtonempresa_origenTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempresa_origenTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempresa_origenTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonempresa_origenTransferenciasBusqueda.setText("U");
		this.jButtonempresa_origenTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonempresa_origenTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonempresa_origenTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaempresa_origenTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaempresa_origenTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"empresa_origenTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonempresa_origenTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelsucursal_origenTransferencias = new JLabelMe();
		this.jLabelsucursal_origenTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN+" : *");
		this.jLabelsucursal_origenTransferencias.setToolTipText("Sucursal Origen");
		this.jLabelsucursal_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsucursal_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsucursal_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsucursal_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsucursal_origenTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsucursal_origenTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_SUCURSALORIGEN);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelsucursal_origenTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreasucursal_origenTransferencias= new JTextAreaMe();
		jTextAreasucursal_origenTransferencias.setEnabled(false);
		jTextAreasucursal_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasucursal_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasucursal_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasucursal_origenTransferencias.setLineWrap(true);
		jTextAreasucursal_origenTransferencias.setWrapStyleWord(true);
		jTextAreasucursal_origenTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasucursal_origenTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreasucursal_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesucursal_origenTransferencias = new JScrollPane(jTextAreasucursal_origenTransferencias);
		jscrollPanesucursal_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesucursal_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesucursal_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsucursal_origenTransferenciasBusqueda= new JButtonMe();
		this.jButtonsucursal_origenTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsucursal_origenTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsucursal_origenTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsucursal_origenTransferenciasBusqueda.setText("U");
		this.jButtonsucursal_origenTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsucursal_origenTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsucursal_origenTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasucursal_origenTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasucursal_origenTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sucursal_origenTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsucursal_origenTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelsub_grupo_origenTransferencias = new JLabelMe();
		this.jLabelsub_grupo_origenTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN+" : *");
		this.jLabelsub_grupo_origenTransferencias.setToolTipText("Sub Grupo Origen");
		this.jLabelsub_grupo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsub_grupo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsub_grupo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_grupo_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_grupo_origenTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_grupo_origenTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_SUBGRUPOORIGEN);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelsub_grupo_origenTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreasub_grupo_origenTransferencias= new JTextAreaMe();
		jTextAreasub_grupo_origenTransferencias.setEnabled(false);
		jTextAreasub_grupo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasub_grupo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasub_grupo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasub_grupo_origenTransferencias.setLineWrap(true);
		jTextAreasub_grupo_origenTransferencias.setWrapStyleWord(true);
		jTextAreasub_grupo_origenTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasub_grupo_origenTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreasub_grupo_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesub_grupo_origenTransferencias = new JScrollPane(jTextAreasub_grupo_origenTransferencias);
		jscrollPanesub_grupo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesub_grupo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesub_grupo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsub_grupo_origenTransferenciasBusqueda= new JButtonMe();
		this.jButtonsub_grupo_origenTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_grupo_origenTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_grupo_origenTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_grupo_origenTransferenciasBusqueda.setText("U");
		this.jButtonsub_grupo_origenTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_grupo_origenTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_grupo_origenTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasub_grupo_origenTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasub_grupo_origenTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_grupo_origenTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_grupo_origenTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelgrupo_origenTransferencias = new JLabelMe();
		this.jLabelgrupo_origenTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN+" : *");
		this.jLabelgrupo_origenTransferencias.setToolTipText("Grupo Origen");
		this.jLabelgrupo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgrupo_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgrupo_origenTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgrupo_origenTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_GRUPOORIGEN);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelgrupo_origenTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreagrupo_origenTransferencias= new JTextAreaMe();
		jTextAreagrupo_origenTransferencias.setEnabled(false);
		jTextAreagrupo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupo_origenTransferencias.setLineWrap(true);
		jTextAreagrupo_origenTransferencias.setWrapStyleWord(true);
		jTextAreagrupo_origenTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreagrupo_origenTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreagrupo_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanegrupo_origenTransferencias = new JScrollPane(jTextAreagrupo_origenTransferencias);
		jscrollPanegrupo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanegrupo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanegrupo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtongrupo_origenTransferenciasBusqueda= new JButtonMe();
		this.jButtongrupo_origenTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupo_origenTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupo_origenTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongrupo_origenTransferenciasBusqueda.setText("U");
		this.jButtongrupo_origenTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongrupo_origenTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongrupo_origenTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreagrupo_origenTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreagrupo_origenTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"grupo_origenTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongrupo_origenTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelactivo_origenTransferencias = new JLabelMe();
		this.jLabelactivo_origenTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN+" : *");
		this.jLabelactivo_origenTransferencias.setToolTipText("Activo Origen");
		this.jLabelactivo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelactivo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelactivo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelactivo_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelactivo_origenTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelactivo_origenTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_ACTIVOORIGEN);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelactivo_origenTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreaactivo_origenTransferencias= new JTextAreaMe();
		jTextAreaactivo_origenTransferencias.setEnabled(false);
		jTextAreaactivo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactivo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactivo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactivo_origenTransferencias.setLineWrap(true);
		jTextAreaactivo_origenTransferencias.setWrapStyleWord(true);
		jTextAreaactivo_origenTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaactivo_origenTransferencias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaactivo_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneactivo_origenTransferencias = new JScrollPane(jTextAreaactivo_origenTransferencias);
		jscrollPaneactivo_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactivo_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactivo_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonactivo_origenTransferenciasBusqueda= new JButtonMe();
		this.jButtonactivo_origenTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactivo_origenTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactivo_origenTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonactivo_origenTransferenciasBusqueda.setText("U");
		this.jButtonactivo_origenTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonactivo_origenTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonactivo_origenTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaactivo_origenTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaactivo_origenTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"activo_origenTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonactivo_origenTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelempresa_destinoTransferencias = new JLabelMe();
		this.jLabelempresa_destinoTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO+" : *");
		this.jLabelempresa_destinoTransferencias.setToolTipText("Empresa Destino");
		this.jLabelempresa_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempresa_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelempresa_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelempresa_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelempresa_destinoTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelempresa_destinoTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_EMPRESADESTINO);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelempresa_destinoTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreaempresa_destinoTransferencias= new JTextAreaMe();
		jTextAreaempresa_destinoTransferencias.setEnabled(false);
		jTextAreaempresa_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaempresa_destinoTransferencias.setLineWrap(true);
		jTextAreaempresa_destinoTransferencias.setWrapStyleWord(true);
		jTextAreaempresa_destinoTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaempresa_destinoTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaempresa_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneempresa_destinoTransferencias = new JScrollPane(jTextAreaempresa_destinoTransferencias);
		jscrollPaneempresa_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneempresa_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneempresa_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonempresa_destinoTransferenciasBusqueda= new JButtonMe();
		this.jButtonempresa_destinoTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempresa_destinoTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonempresa_destinoTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonempresa_destinoTransferenciasBusqueda.setText("U");
		this.jButtonempresa_destinoTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonempresa_destinoTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonempresa_destinoTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaempresa_destinoTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaempresa_destinoTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"empresa_destinoTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonempresa_destinoTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelsucursal_destinoTransferencias = new JLabelMe();
		this.jLabelsucursal_destinoTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO+" : *");
		this.jLabelsucursal_destinoTransferencias.setToolTipText("Sucursal Destino");
		this.jLabelsucursal_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsucursal_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsucursal_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsucursal_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsucursal_destinoTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsucursal_destinoTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_SUCURSALDESTINO);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelsucursal_destinoTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreasucursal_destinoTransferencias= new JTextAreaMe();
		jTextAreasucursal_destinoTransferencias.setEnabled(false);
		jTextAreasucursal_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasucursal_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasucursal_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasucursal_destinoTransferencias.setLineWrap(true);
		jTextAreasucursal_destinoTransferencias.setWrapStyleWord(true);
		jTextAreasucursal_destinoTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasucursal_destinoTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreasucursal_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesucursal_destinoTransferencias = new JScrollPane(jTextAreasucursal_destinoTransferencias);
		jscrollPanesucursal_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesucursal_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesucursal_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsucursal_destinoTransferenciasBusqueda= new JButtonMe();
		this.jButtonsucursal_destinoTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsucursal_destinoTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsucursal_destinoTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsucursal_destinoTransferenciasBusqueda.setText("U");
		this.jButtonsucursal_destinoTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsucursal_destinoTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsucursal_destinoTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasucursal_destinoTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasucursal_destinoTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sucursal_destinoTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsucursal_destinoTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelsub_grupo_destinoTransferencias = new JLabelMe();
		this.jLabelsub_grupo_destinoTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO+" : *");
		this.jLabelsub_grupo_destinoTransferencias.setToolTipText("Sub Grupo Destino");
		this.jLabelsub_grupo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsub_grupo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsub_grupo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_grupo_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_grupo_destinoTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_grupo_destinoTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_SUBGRUPODESTINO);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelsub_grupo_destinoTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreasub_grupo_destinoTransferencias= new JTextAreaMe();
		jTextAreasub_grupo_destinoTransferencias.setEnabled(false);
		jTextAreasub_grupo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasub_grupo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasub_grupo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasub_grupo_destinoTransferencias.setLineWrap(true);
		jTextAreasub_grupo_destinoTransferencias.setWrapStyleWord(true);
		jTextAreasub_grupo_destinoTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasub_grupo_destinoTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreasub_grupo_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesub_grupo_destinoTransferencias = new JScrollPane(jTextAreasub_grupo_destinoTransferencias);
		jscrollPanesub_grupo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesub_grupo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesub_grupo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsub_grupo_destinoTransferenciasBusqueda= new JButtonMe();
		this.jButtonsub_grupo_destinoTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_grupo_destinoTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_grupo_destinoTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_grupo_destinoTransferenciasBusqueda.setText("U");
		this.jButtonsub_grupo_destinoTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_grupo_destinoTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_grupo_destinoTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasub_grupo_destinoTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasub_grupo_destinoTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_grupo_destinoTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_grupo_destinoTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelgrupo_destinoTransferencias = new JLabelMe();
		this.jLabelgrupo_destinoTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_GRUPODESTINO+" : *");
		this.jLabelgrupo_destinoTransferencias.setToolTipText("Grupo Destino");
		this.jLabelgrupo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgrupo_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgrupo_destinoTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgrupo_destinoTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_GRUPODESTINO);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelgrupo_destinoTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreagrupo_destinoTransferencias= new JTextAreaMe();
		jTextAreagrupo_destinoTransferencias.setEnabled(false);
		jTextAreagrupo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagrupo_destinoTransferencias.setLineWrap(true);
		jTextAreagrupo_destinoTransferencias.setWrapStyleWord(true);
		jTextAreagrupo_destinoTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreagrupo_destinoTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreagrupo_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanegrupo_destinoTransferencias = new JScrollPane(jTextAreagrupo_destinoTransferencias);
		jscrollPanegrupo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanegrupo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanegrupo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtongrupo_destinoTransferenciasBusqueda= new JButtonMe();
		this.jButtongrupo_destinoTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupo_destinoTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupo_destinoTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongrupo_destinoTransferenciasBusqueda.setText("U");
		this.jButtongrupo_destinoTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongrupo_destinoTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongrupo_destinoTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreagrupo_destinoTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreagrupo_destinoTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"grupo_destinoTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongrupo_destinoTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelactivo_destinoTransferencias = new JLabelMe();
		this.jLabelactivo_destinoTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO+" : *");
		this.jLabelactivo_destinoTransferencias.setToolTipText("Activo Destino");
		this.jLabelactivo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelactivo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelactivo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelactivo_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelactivo_destinoTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelactivo_destinoTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_ACTIVODESTINO);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelactivo_destinoTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreaactivo_destinoTransferencias= new JTextAreaMe();
		jTextAreaactivo_destinoTransferencias.setEnabled(false);
		jTextAreaactivo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactivo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactivo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaactivo_destinoTransferencias.setLineWrap(true);
		jTextAreaactivo_destinoTransferencias.setWrapStyleWord(true);
		jTextAreaactivo_destinoTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaactivo_destinoTransferencias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaactivo_destinoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneactivo_destinoTransferencias = new JScrollPane(jTextAreaactivo_destinoTransferencias);
		jscrollPaneactivo_destinoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactivo_destinoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneactivo_destinoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonactivo_destinoTransferenciasBusqueda= new JButtonMe();
		this.jButtonactivo_destinoTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactivo_destinoTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonactivo_destinoTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonactivo_destinoTransferenciasBusqueda.setText("U");
		this.jButtonactivo_destinoTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonactivo_destinoTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonactivo_destinoTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaactivo_destinoTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaactivo_destinoTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"activo_destinoTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonactivo_destinoTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialTransferencias = new JLabelMe();
		this.jLabelsecuencialTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialTransferencias.setToolTipText("Secuencial");
		this.jLabelsecuencialTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelsecuencialTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextFieldsecuencialTransferencias= new JTextFieldMe();

		jTextFieldsecuencialTransferencias.setEnabled(false);
		jTextFieldsecuencialTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialTransferenciasBusqueda= new JButtonMe();
		this.jButtonsecuencialTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialTransferenciasBusqueda.setText("U");
		this.jButtonsecuencialTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelfechaTransferencias = new JLabelMe();
		this.jLabelfechaTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaTransferencias.setToolTipText("Fecha");
		this.jLabelfechaTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelfechaTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		//jFormattedTextFieldfechaTransferencias= new JFormattedTextFieldMe();

		jDateChooserfechaTransferencias= new JDateChooser();
		jDateChooserfechaTransferencias.setEnabled(false);
		jDateChooserfechaTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaTransferencias.setDate(new Date());
		jDateChooserfechaTransferencias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaTransferencias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaTransferenciasBusqueda= new JButtonMe();
		this.jButtonfechaTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaTransferenciasBusqueda.setText("U");
		this.jButtonfechaTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoTransferencias = new JLabelMe();
		this.jLabelnumero_documentoTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoTransferencias.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelnumero_documentoTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextFieldnumero_documentoTransferencias= new JTextFieldMe();

		jTextFieldnumero_documentoTransferencias.setEnabled(false);
		jTextFieldnumero_documentoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoTransferenciasBusqueda= new JButtonMe();
		this.jButtonnumero_documentoTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoTransferenciasBusqueda.setText("U");
		this.jButtonnumero_documentoTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelcostoTransferencias = new JLabelMe();
		this.jLabelcostoTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoTransferencias.setToolTipText("Costo");
		this.jLabelcostoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelcostoTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextFieldcostoTransferencias= new JTextFieldMe();
		jTextFieldcostoTransferencias.setEnabled(false);
		jTextFieldcostoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoTransferencias.setText("0.0");

		this.jButtoncostoTransferenciasBusqueda= new JButtonMe();
		this.jButtoncostoTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoTransferenciasBusqueda.setText("U");
		this.jButtoncostoTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabeldepreciacionTransferencias = new JLabelMe();
		this.jLabeldepreciacionTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_DEPRECIACION+" : *");
		this.jLabeldepreciacionTransferencias.setToolTipText("Depreciacion");
		this.jLabeldepreciacionTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldepreciacionTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldepreciacionTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldepreciacionTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldepreciacionTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldepreciacionTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_DEPRECIACION);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPaneldepreciacionTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextFielddepreciacionTransferencias= new JTextFieldMe();
		jTextFielddepreciacionTransferencias.setEnabled(false);
		jTextFielddepreciacionTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepreciacionTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepreciacionTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddepreciacionTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddepreciacionTransferencias.setText("0.0");

		this.jButtondepreciacionTransferenciasBusqueda= new JButtonMe();
		this.jButtondepreciacionTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepreciacionTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepreciacionTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondepreciacionTransferenciasBusqueda.setText("U");
		this.jButtondepreciacionTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondepreciacionTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondepreciacionTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddepreciacionTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddepreciacionTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"depreciacionTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondepreciacionTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelcosto_origenTransferencias = new JLabelMe();
		this.jLabelcosto_origenTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_COSTOORIGEN+" : *");
		this.jLabelcosto_origenTransferencias.setToolTipText("Costo Origen");
		this.jLabelcosto_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_origenTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_origenTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_COSTOORIGEN);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelcosto_origenTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextFieldcosto_origenTransferencias= new JTextFieldMe();
		jTextFieldcosto_origenTransferencias.setEnabled(false);
		jTextFieldcosto_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_origenTransferencias.setText("0.0");

		this.jButtoncosto_origenTransferenciasBusqueda= new JButtonMe();
		this.jButtoncosto_origenTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_origenTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_origenTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_origenTransferenciasBusqueda.setText("U");
		this.jButtoncosto_origenTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_origenTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_origenTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_origenTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_origenTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_origenTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_origenTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabeldepreciacion_origenTransferencias = new JLabelMe();
		this.jLabeldepreciacion_origenTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN+" : *");
		this.jLabeldepreciacion_origenTransferencias.setToolTipText("Depreciacion Origen");
		this.jLabeldepreciacion_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldepreciacion_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldepreciacion_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldepreciacion_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldepreciacion_origenTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldepreciacion_origenTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_DEPRECIACIONORIGEN);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPaneldepreciacion_origenTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextFielddepreciacion_origenTransferencias= new JTextFieldMe();
		jTextFielddepreciacion_origenTransferencias.setEnabled(false);
		jTextFielddepreciacion_origenTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepreciacion_origenTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepreciacion_origenTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddepreciacion_origenTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddepreciacion_origenTransferencias.setText("0.0");

		this.jButtondepreciacion_origenTransferenciasBusqueda= new JButtonMe();
		this.jButtondepreciacion_origenTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepreciacion_origenTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepreciacion_origenTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondepreciacion_origenTransferenciasBusqueda.setText("U");
		this.jButtondepreciacion_origenTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondepreciacion_origenTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondepreciacion_origenTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddepreciacion_origenTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddepreciacion_origenTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"depreciacion_origenTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondepreciacion_origenTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabelrazonTransferencias = new JLabelMe();
		this.jLabelrazonTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_RAZON+" : *");
		this.jLabelrazonTransferencias.setToolTipText("Razon");
		this.jLabelrazonTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrazonTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrazonTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrazonTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrazonTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrazonTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_RAZON);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelrazonTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextArearazonTransferencias= new JTextAreaMe();
		jTextArearazonTransferencias.setEnabled(false);
		jTextArearazonTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazonTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazonTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazonTransferencias.setLineWrap(true);
		jTextArearazonTransferencias.setWrapStyleWord(true);
		jTextArearazonTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearazonTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearazonTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerazonTransferencias = new JScrollPane(jTextArearazonTransferencias);
		jscrollPanerazonTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerazonTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerazonTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonrazonTransferenciasBusqueda= new JButtonMe();
		this.jButtonrazonTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrazonTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrazonTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrazonTransferenciasBusqueda.setText("U");
		this.jButtonrazonTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrazonTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrazonTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearazonTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearazonTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"razonTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrazonTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTransferencias = new JLabelMe();
		this.jLabeldescripcionTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTransferencias.setToolTipText("Descripcion");
		this.jLabeldescripcionTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPaneldescripcionTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextAreadescripcionTransferencias= new JTextAreaMe();
		jTextAreadescripcionTransferencias.setEnabled(false);
		jTextAreadescripcionTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransferencias.setLineWrap(true);
		jTextAreadescripcionTransferencias.setWrapStyleWord(true);
		jTextAreadescripcionTransferencias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTransferencias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTransferencias = new JScrollPane(jTextAreadescripcionTransferencias);
		jscrollPanedescripcionTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTransferenciasBusqueda= new JButtonMe();
		this.jButtondescripcionTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTransferenciasBusqueda.setText("U");
		this.jButtondescripcionTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTransferenciasBusqueda.setVisible(false);		}


					
		this.jLabeltipoTransferencias = new JLabelMe();
		this.jLabeltipoTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoTransferencias.setToolTipText("Tipo");
		this.jLabeltipoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPaneltipoTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jTextFieldtipoTransferencias= new JTextFieldMe();

		jTextFieldtipoTransferencias.setEnabled(false);
		jTextFieldtipoTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoTransferenciasBusqueda= new JButtonMe();
		this.jButtontipoTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoTransferenciasBusqueda.setText("U");
		this.jButtontipoTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoTransferenciasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransferencias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransferencias = new JLabelMe();
		this.jLabelid_empresaTransferencias.setText(""+TransferenciasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransferencias.setToolTipText("Empresa");
		this.jLabelid_empresaTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransferencias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransferencias.setToolTipText(TransferenciasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransferencias = new GridBagLayout();
		this.jPanelid_empresaTransferencias.setLayout(this.gridaBagLayoutTransferencias);


		jComboBoxid_empresaTransferencias= new JComboBoxMe();
		jComboBoxid_empresaTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransferencias.setEnabled(false);

		this.jButtonid_empresaTransferencias= new JButtonMe();
		this.jButtonid_empresaTransferencias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferencias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferencias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferencias.setText("Buscar");
		this.jButtonid_empresaTransferencias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransferencias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferencias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferencias"));

		this.jButtonid_empresaTransferenciasBusqueda= new JButtonMe();
		this.jButtonid_empresaTransferenciasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransferenciasBusqueda.setText("U");
		this.jButtonid_empresaTransferenciasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransferenciasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferenciasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferenciasBusqueda"));

		if(this.transferenciasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransferenciasBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransferenciasUpdate= new JButtonMe();
		this.jButtonid_empresaTransferenciasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransferenciasUpdate.setText("U");
		this.jButtonid_empresaTransferenciasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransferenciasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferenciasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransferencias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferencias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferenciasUpdate"));



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
		//this.jInternalFrameDetalleTransferencias = new TransferenciasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transferencias DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransferencias= new GridBagLayout();
		

		
		String sToolTipTransferencias="";
		sToolTipTransferencias=TransferenciasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransferencias+="(ActivosFijos.Transferencias)";
		}
		
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransferencias+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransferencias = new JButtonMe();
		this.jButtonModificarTransferencias = new JButtonMe();
        this.jButtonActualizarTransferencias = new JButtonMe();
        this.jButtonEliminarTransferencias = new JButtonMe();
        this.jButtonCancelarTransferencias = new JButtonMe();
        this.jButtonGuardarCambiosTransferencias = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransferencias = new JButtonMe();
		this.jButtonCerrarTransferencias = new JButtonMe();
		
		this.jScrollPanelDatosTransferencias = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransferencias = new JScrollPane();
		this.jScrollPanelDatosGeneralTransferencias = new JScrollPane();
				
		
		
		this.jPanelCamposTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transferencias";
		
		if(!this.transferenciasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciases" + this.sPath));
		} else {
			this.jScrollPanelDatosTransferencias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransferencias.setName("jPanelCamposTransferencias"); 

		this.jPanelCamposOcultosTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransferencias.setName("jPanelCamposOcultosTransferencias"); 

        this.jPanelAccionesTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransferencias.setToolTipText("Acciones");
        this.jPanelAccionesTransferencias.setName("Acciones"); 

		this.jPanelAccionesFormularioTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransferencias.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransferencias.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransferencias.setText("Nuevo");
		this.jButtonModificarTransferencias.setText("Editar");
        this.jButtonActualizarTransferencias.setText("Actualizar");
        this.jButtonEliminarTransferencias.setText("Eliminar");
        this.jButtonCancelarTransferencias.setText("Cancelar");
        this.jButtonGuardarCambiosTransferencias.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransferencias.setText("Guardar");
		this.jButtonCerrarTransferencias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransferencias,"nuevo_button","Nuevo",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransferencias,"modificar_button","Editar",this.transferenciasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransferencias,"actualizar_button","Actualizar",this.transferenciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransferencias,"eliminar_button","Eliminar",this.transferenciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransferencias,"cancelar_button","Cancelar",this.transferenciasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransferencias,"guardarcambios_button","Guardar",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransferencias,"guardarcambiostabla_button","Guardar",this.transferenciasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransferencias,"cerrar_button","Salir",this.transferenciasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransferencias.setToolTipText("Nuevo"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransferencias.setToolTipText("Editar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransferencias.setToolTipText("Actualizar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransferencias.setToolTipText("Eliminar)"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransferencias.setToolTipText("Cancelar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransferencias.setToolTipText("Guardar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransferencias.setToolTipText("Guardar"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransferencias.setToolTipText("Salir"+" "+TransferenciasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransferencias";
		inputMap = this.jButtonNuevoTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransferencias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransferencias"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransferencias";
		inputMap = this.jButtonActualizarTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransferencias"));
		
		//ELIMINAR
		sMapKey = "EliminarTransferencias";
		inputMap = this.jButtonEliminarTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransferencias"));
		
		//CANCELAR	
		sMapKey = "CancelarTransferencias";
		inputMap = this.jButtonCancelarTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransferencias"));
		
		//CERRAR		
		sMapKey = "CerrarTransferencias";
		inputMap = this.jButtonCerrarTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransferencias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransferencias";
		inputMap = this.jButtonGuardarCambiosTablaTransferencias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransferencias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransferencias"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransferencias = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransferencias.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransferencias.setToolTipText("Nuevo Transferencias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransferencias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransferencias.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransferencias.setToolTipText("Sin Cerrar Ventana Transferencias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransferencias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransferencias.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransferencias.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransferencias.setText("Accion");
		this.jComboBoxTiposAccionesTransferencias.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransferencias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransferencias.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransferencias.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransferencias = new JLabelMe();
		
		this.jLabelAccionesTransferencias.setText("Acciones");		
		this.jLabelAccionesTransferencias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferencias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferencias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransferencias();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransferencias();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransferencias=new JTabbedPane();
		this.jTabbedPaneRelacionesTransferencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransferencias,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransferencias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferencias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferencias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransferencias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransferencias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransferencias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransferencias.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransferencias, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransferencias = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransferencias = new GridBagLayout();
		
		this.jPanelCamposTransferencias.setLayout(gridaBagLayoutCamposTransferencias);
		this.jPanelCamposOcultosTransferencias.setLayout(gridaBagLayoutCamposOcultosTransferencias);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransferencias.add(jLabelIdTransferencias, this.gridBagConstraintsTransferencias);



	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransferencias.add(jLabelidTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransferencias.add(jLabelid_empresaTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransferencias.add(jButtonid_empresaTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 3;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransferencias.add(jButtonid_empresaTransferenciasUpdate, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransferencias.add(jComboBoxid_empresaTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelempresa_origenTransferencias.add(jLabelempresa_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelempresa_origenTransferencias.add(jButtonempresa_origenTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelempresa_origenTransferencias.add(jscrollPaneempresa_origenTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsucursal_origenTransferencias.add(jLabelsucursal_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelsucursal_origenTransferencias.add(jButtonsucursal_origenTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsucursal_origenTransferencias.add(jscrollPanesucursal_origenTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_grupo_origenTransferencias.add(jLabelsub_grupo_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_grupo_origenTransferencias.add(jButtonsub_grupo_origenTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_grupo_origenTransferencias.add(jscrollPanesub_grupo_origenTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgrupo_origenTransferencias.add(jLabelgrupo_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelgrupo_origenTransferencias.add(jButtongrupo_origenTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgrupo_origenTransferencias.add(jscrollPanegrupo_origenTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelactivo_origenTransferencias.add(jLabelactivo_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelactivo_origenTransferencias.add(jButtonactivo_origenTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelactivo_origenTransferencias.add(jscrollPaneactivo_origenTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelempresa_destinoTransferencias.add(jLabelempresa_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelempresa_destinoTransferencias.add(jButtonempresa_destinoTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelempresa_destinoTransferencias.add(jscrollPaneempresa_destinoTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsucursal_destinoTransferencias.add(jLabelsucursal_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelsucursal_destinoTransferencias.add(jButtonsucursal_destinoTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsucursal_destinoTransferencias.add(jscrollPanesucursal_destinoTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_grupo_destinoTransferencias.add(jLabelsub_grupo_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_grupo_destinoTransferencias.add(jButtonsub_grupo_destinoTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_grupo_destinoTransferencias.add(jscrollPanesub_grupo_destinoTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgrupo_destinoTransferencias.add(jLabelgrupo_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelgrupo_destinoTransferencias.add(jButtongrupo_destinoTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgrupo_destinoTransferencias.add(jscrollPanegrupo_destinoTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelactivo_destinoTransferencias.add(jLabelactivo_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelactivo_destinoTransferencias.add(jButtonactivo_destinoTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelactivo_destinoTransferencias.add(jscrollPaneactivo_destinoTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialTransferencias.add(jLabelsecuencialTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialTransferencias.add(jButtonsecuencialTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialTransferencias.add(jTextFieldsecuencialTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaTransferencias.add(jLabelfechaTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaTransferencias.add(jButtonfechaTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaTransferencias.add(jDateChooserfechaTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoTransferencias.add(jLabelnumero_documentoTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoTransferencias.add(jButtonnumero_documentoTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoTransferencias.add(jTextFieldnumero_documentoTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoTransferencias.add(jLabelcostoTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoTransferencias.add(jButtoncostoTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoTransferencias.add(jTextFieldcostoTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldepreciacionTransferencias.add(jLabeldepreciacionTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldepreciacionTransferencias.add(jButtondepreciacionTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldepreciacionTransferencias.add(jTextFielddepreciacionTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_origenTransferencias.add(jLabelcosto_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_origenTransferencias.add(jButtoncosto_origenTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_origenTransferencias.add(jTextFieldcosto_origenTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldepreciacion_origenTransferencias.add(jLabeldepreciacion_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldepreciacion_origenTransferencias.add(jButtondepreciacion_origenTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldepreciacion_origenTransferencias.add(jTextFielddepreciacion_origenTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrazonTransferencias.add(jLabelrazonTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPanelrazonTransferencias.add(jButtonrazonTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrazonTransferencias.add(jscrollPanerazonTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTransferencias.add(jLabeldescripcionTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTransferencias.add(jButtondescripcionTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTransferencias.add(jscrollPanedescripcionTransferencias, this.gridBagConstraintsTransferencias);


	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 0;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoTransferencias.add(jLabeltipoTransferencias, this.gridBagConstraintsTransferencias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		//this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = 2;
		this.gridBagConstraintsTransferencias.ipadx = 0;
		this.gridBagConstraintsTransferencias.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoTransferencias.add(jButtontipoTransferenciasBusqueda, this.gridBagConstraintsTransferencias);
	}

	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencias.gridy = 0;
	this.gridBagConstraintsTransferencias.gridx = 1;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoTransferencias.add(jTextFieldtipoTransferencias, this.gridBagConstraintsTransferencias);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelidTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelempresa_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelsucursal_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelsub_grupo_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelgrupo_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelactivo_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelempresa_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelsucursal_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelsub_grupo_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelgrupo_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelactivo_destinoTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelsecuencialTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelfechaTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelnumero_documentoTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelcostoTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPaneldepreciacionTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelcosto_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPaneldepreciacion_origenTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPanelrazonTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPaneldescripcionTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransferencias.add(this.jPaneltipoTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposTransferencias % 2==0) {
		iXPanelCamposTransferencias=0;
		iYPanelCamposTransferencias++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransferencias = new GridBagConstraints();
	this.gridBagConstraintsTransferencias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencias.gridy = iYPanelCamposOcultosTransferencias;
	this.gridBagConstraintsTransferencias.gridx = iXPanelCamposOcultosTransferencias++;
	this.gridBagConstraintsTransferencias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransferencias.add(this.jPanelid_empresaTransferencias, this.gridBagConstraintsTransferencias);



	if(iXPanelCamposOcultosTransferencias % 2==0) {
		iXPanelCamposOcultosTransferencias=0;
		iYPanelCamposOcultosTransferencias++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransferencias= new GridBagLayout();
		this.jPanelAccionesTransferencias.setLayout(gridaBagLayoutAccionesTransferencias);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransferencias= new GridBagLayout();
		this.jPanelAccionesFormularioTransferencias.setLayout(gridaBagLayoutAccionesFormularioTransferencias);
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransferencias.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransferencias.add(this.jComboBoxTiposAccionesFormularioTransferencias, this.gridBagConstraintsTransferencias);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransferencias.add(this.jButtonModificarTransferencias, this.gridBagConstraintsTransferencias);							

		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencias.gridy = 0;
		this.gridBagConstraintsTransferencias.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransferencias.add(this.jButtonEliminarTransferencias, this.gridBagConstraintsTransferencias);
		
			
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = 0;		
		this.gridBagConstraintsTransferencias.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransferencias.add(this.jButtonActualizarTransferencias, this.gridBagConstraintsTransferencias);


		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = 0;		
		this.gridBagConstraintsTransferencias.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransferencias.add(this.jButtonGuardarCambiosTransferencias, this.gridBagConstraintsTransferencias);	
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = 0;		
		this.gridBagConstraintsTransferencias.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransferencias.add(this.jButtonCancelarTransferencias, this.gridBagConstraintsTransferencias);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransferencias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransferencias);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transferenciasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransferencias = new GridBagConstraints();						
			this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferencias.gridx = 0;		
			//this.gridBagConstraintsTransferencias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransferencias.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransferencias.gridx =0;
		this.gridBagConstraintsTransferencias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransferencias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransferencias, this.gridBagConstraintsTransferencias);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransferenciasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransferencias = new TransferenciasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transferencias DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transferencias DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transferencias Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransferenciasModel transferenciasModel=new TransferenciasModel(this);
			
			//SI USARA CLASE INTERNA
			//TransferenciasModel.TransferenciasFocusTraversalPolicy transferenciasFocusTraversalPolicy = transferenciasModel.new TransferenciasFocusTraversalPolicy(this);
			
			//transferenciasFocusTraversalPolicy.settransferenciasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transferenciasModel);
			
			
			this.jContentPaneDetalleTransferencias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransferencias = new GridBagLayout();	
			this.jContentPaneDetalleTransferencias.setLayout(gridaBagLayoutDetalleTransferencias);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransferencias = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransferencias = new GridBagConstraints();
				this.gridBagConstraintsTransferencias.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransferencias.gridx = 0;
					
				
				this.jContentPaneDetalleTransferencias.add(jTtoolBarDetalleTransferencias, gridBagConstraintsTransferencias);								
				
}
			
			this.jScrollPanelDatosEdicionTransferencias=   new JScrollPane(jContentPaneDetalleTransferencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransferencias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferencias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferencias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransferencias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransferencias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferencias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferencias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransferencias.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransferencias.gridx = 0;
	        
			this.jContentPaneDetalleTransferencias.add(jPanelCamposTransferencias, gridBagConstraintsTransferencias);
			
			
			
			
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
						//&& transferenciasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.transferenciasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransferencias= new GridBagConstraints();
						this.gridBagConstraintsTransferencias.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransferencias.gridx = 0;
						this.jContentPaneDetalleTransferencias.add(this.jTabbedPaneRelacionesTransferencias, this.gridBagConstraintsTransferencias);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransferencias.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransferencias.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransferencias = new GridBagConstraints();
					this.gridBagConstraintsTransferencias.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransferencias.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransferencias.gridx = 0;
					
				
					this.jContentPaneDetalleTransferencias.add(jPanelCamposOcultosTransferencias, gridBagConstraintsTransferencias);
				
					this.jPanelCamposOcultosTransferencias.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransferencias.gridx = 0;
	        this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransferencias.add(this.jPanelAccionesFormularioTransferencias, this.gridBagConstraintsTransferencias);							
			
			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
	        this.gridBagConstraintsTransferencias.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransferencias.gridx = 0;
	        
			
			this.jContentPaneDetalleTransferencias.add(this.jPanelAccionesTransferencias, this.gridBagConstraintsTransferencias);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransferencias);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransferencias=   new JScrollPane(this.jPanelCamposTransferencias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransferencias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferencias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferencias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransferencias.gridx = 0;
			this.gridBagConstraintsTransferencias.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransferencias.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransferencias.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransferencias, this.gridBagConstraintsTransferencias);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransferencias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransferencias, this.gridBagConstraintsTransferencias);			
			
			this.gridBagConstraintsTransferencias = new GridBagConstraints();
			this.gridBagConstraintsTransferencias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransferencias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransferencias, this.gridBagConstraintsTransferencias);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransferencias, this.gridBagConstraintsTransferencias);
			
			
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransferencias, this.gridBagConstraintsTransferencias);
		
			
		this.gridBagConstraintsTransferencias = new GridBagConstraints();
		this.gridBagConstraintsTransferencias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransferencias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransferencias, this.gridBagConstraintsTransferencias);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransferencias;//jContentPane;
		
		return jScrollPanelDatosEdicionTransferencias;
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
