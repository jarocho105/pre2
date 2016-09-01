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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.AnticiposConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class AnticiposDetalleFormJInternalFrame extends AnticiposBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAnticipos;
	
	protected JMenuBar jmenuBarDetalleAnticipos;
	
	protected JMenu jmenuDetalleAnticipos;
	protected JMenu jmenuDetalleArchivoAnticipos;
	protected JMenu jmenuDetalleAccionesAnticipos;
	protected JMenu jmenuDetalleDatosAnticipos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAnticipos;	
	protected GridBagConstraints gridBagConstraintsAnticipos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AnticiposBeanSwingJInternalFrameAdditional jInternalFrameDetalleAnticipos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";
	
	public AnticiposSessionBean anticiposSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoContratoSessionBean tipocontratoSessionBean;	
	
	public AnticiposLogic anticiposLogic;
	
	public JScrollPane jScrollPanelDatosAnticipos;
	public JScrollPane jScrollPanelDatosEdicionAnticipos;
	public JScrollPane jScrollPanelDatosGeneralAnticipos;
	
	protected JPanel jPanelCamposAnticipos;    
	protected JPanel jPanelCamposOcultosAnticipos;    	
	protected JPanel jPanelAccionesAnticipos;
	protected JPanel jPanelAccionesFormularioAnticipos;
    
	
	
	protected Integer iXPanelCamposAnticipos=0;
	protected Integer iYPanelCamposAnticipos=0;
	
	protected Integer iXPanelCamposOcultosAnticipos=0;
	protected Integer iYPanelCamposOcultosAnticipos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAnticipos;
	public JButton jButtonModificarAnticipos;
	public JButton jButtonActualizarAnticipos;
    public JButton jButtonEliminarAnticipos;
	public JButton jButtonCancelarAnticipos;
    public JButton jButtonGuardarCambiosAnticipos;
	public JButton jButtonGuardarCambiosTablaAnticipos;
	protected JButton jButtonCerrarAnticipos;
	
	
	protected JButton jButtonProcesarInformacionAnticipos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAnticipos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAnticipos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAnticipos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAnticipos;
	protected JButton jButtonModificarToolBarAnticipos;
	protected JButton jButtonActualizarToolBarAnticipos;
    protected JButton jButtonEliminarToolBarAnticipos;
	protected JButton jButtonCancelarToolBarAnticipos;
    protected JButton jButtonGuardarCambiosToolBarAnticipos;
	protected JButton jButtonGuardarCambiosTablaToolBarAnticipos;
	protected JButton jButtonMostrarOcultarTablaToolBarAnticipos;
	protected JButton jButtonCerrarToolBarAnticipos;
	
	protected JButton jButtonProcesarInformacionToolBarAnticipos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAnticipos;
	protected JMenuItem jMenuItemModificarAnticipos;
	protected JMenuItem jMenuItemActualizarAnticipos;
    protected JMenuItem jMenuItemEliminarAnticipos;
	protected JMenuItem jMenuItemCancelarAnticipos;
    protected JMenuItem jMenuItemGuardarCambiosAnticipos;
	protected JMenuItem jMenuItemGuardarCambiosTablaAnticipos;
	protected JMenuItem jMenuItemCerrarAnticipos;
	protected JMenuItem jMenuItemDetalleCerrarAnticipos;
	protected JMenuItem jMenuItemDetalleMostarOcultarAnticipos;
	
	protected JMenuItem jMenuItemProcesarInformacionAnticipos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAnticipos;
	protected JMenuItem jMenuItemMostrarOcultarAnticipos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAnticipos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAnticipos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAnticipos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAnticipos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAnticipos;
	public JLabel jLabelIdAnticipos;
	public JLabel jLabelidAnticipos;
	public JButton jButtonidAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelcodigoAnticipos;
	public JLabel jLabelcodigoAnticipos;
	public JTextField jTextFieldcodigoAnticipos;
	public JButton jButtoncodigoAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeAnticipos;
	public JLabel jLabelfecha_desdeAnticipos;
	//public JFormattedTextField jDateChooserfecha_desdeAnticipos;

	public JDateChooser jDateChooserfecha_desdeAnticipos;
	public JButton jButtonfecha_desdeAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaAnticipos;
	public JLabel jLabelfecha_hastaAnticipos;
	//public JFormattedTextField jDateChooserfecha_hastaAnticipos;

	public JDateChooser jDateChooserfecha_hastaAnticipos;
	public JButton jButtonfecha_hastaAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cargoAnticipos;
	public JLabel jLabelcodigo_cargoAnticipos;
	public JTextField jTextFieldcodigo_cargoAnticipos;
	public JButton jButtoncodigo_cargoAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelnombre_estructuraAnticipos;
	public JLabel jLabelnombre_estructuraAnticipos;
	public JTextArea jTextAreanombre_estructuraAnticipos;
	public JScrollPane jscrollPanenombre_estructuraAnticipos;
	public JButton jButtonnombre_estructuraAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_datoAnticipos;
	public JLabel jLabelcodigo_datoAnticipos;
	public JTextField jTextFieldcodigo_datoAnticipos;
	public JButton jButtoncodigo_datoAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoAnticipos;
	public JLabel jLabelnombre_completoAnticipos;
	public JTextArea jTextAreanombre_completoAnticipos;
	public JScrollPane jscrollPanenombre_completoAnticipos;
	public JButton jButtonnombre_completoAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelsueldoAnticipos;
	public JLabel jLabelsueldoAnticipos;
	public JTextField jTextFieldsueldoAnticipos;
	public JButton jButtonsueldoAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelfechaAnticipos;
	public JLabel jLabelfechaAnticipos;
	//public JFormattedTextField jDateChooserfechaAnticipos;

	public JDateChooser jDateChooserfechaAnticipos;
	public JButton jButtonfechaAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelvalorAnticipos;
	public JLabel jLabelvalorAnticipos;
	public JTextField jTextFieldvalorAnticipos;
	public JButton jButtonvalorAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelvalor_adicionalAnticipos;
	public JLabel jLabelvalor_adicionalAnticipos;
	public JTextField jTextFieldvalor_adicionalAnticipos;
	public JButton jButtonvalor_adicionalAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelvalor_prestamoAnticipos;
	public JLabel jLabelvalor_prestamoAnticipos;
	public JTextField jTextFieldvalor_prestamoAnticipos;
	public JButton jButtonvalor_prestamoAnticiposBusqueda= new JButtonMe();

	public JPanel jPaneltotalAnticipos;
	public JLabel jLabeltotalAnticipos;
	public JTextField jTextFieldtotalAnticipos;
	public JButton jButtontotalAnticiposBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAnticipos;
	public JLabel jLabelid_empresaAnticipos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAnticipos;
	public JButton jButtonid_empresaAnticipos= new JButtonMe();
	public JButton jButtonid_empresaAnticiposUpdate= new JButtonMe();
	public JButton jButtonid_empresaAnticiposBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_contratoAnticipos;
	public JLabel jLabelid_tipo_contratoAnticipos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoAnticipos;
	public JButton jButtonid_tipo_contratoAnticipos= new JButtonMe();
	public JButton jButtonid_tipo_contratoAnticiposUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoAnticiposBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAnticipos;
	
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
	public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AnticiposDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAnticipos=new JPanel();
				this.jPanelAccionesFormularioAnticipos=new JPanel();
				this.jmenuBarDetalleAnticipos=new JMenuBar();
				this.jTtoolBarDetalleAnticipos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticiposDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AnticiposDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticiposDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticiposDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticiposDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAnticipos() {
		return this.jButtonActualizarToolBarAnticipos;
	}
	
	public JButton getjButtonEliminarToolBarAnticipos() {
		return this.jButtonEliminarToolBarAnticipos;
	}
	
	public JButton getjButtonCancelarToolBarAnticipos() {
		return this.jButtonCancelarToolBarAnticipos;
	}		
	
	public JButton getjButtonProcesarInformacionAnticipos() {
		return this.jButtonProcesarInformacionAnticipos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAnticipos)	{
		this.jButtonProcesarInformacionAnticipos = jButtonProcesarInformacionAnticipos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAnticipos() {
		return this.jComboBoxTiposAccionesAnticipos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAnticipos(
			JComboBox jComboBoxTiposRelacionesAnticipos) {
		this.jComboBoxTiposRelacionesAnticipos = jComboBoxTiposRelacionesAnticipos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAnticipos(
			JComboBox jComboBoxTiposAccionesAnticipos) {
		this.jComboBoxTiposAccionesAnticipos = jComboBoxTiposAccionesAnticipos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAnticipos() {
		return this.jComboBoxTiposAccionesFormularioAnticipos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAnticipos(
			JComboBox jComboBoxTiposAccionesFormularioAnticipos) {
		this.jComboBoxTiposAccionesFormularioAnticipos = jComboBoxTiposAccionesFormularioAnticipos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.anticiposSessionBean=new AnticiposSessionBean();
		
		this.anticiposSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anticiposSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.anticiposSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AnticiposJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AnticiposJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AnticiposJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Anticipos MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
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
	
		AnticiposJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAnticipos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAnticipos=new JButtonMe();
				this.jButtonModificarToolBarAnticipos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAnticipos,this.jTtoolBarDetalleAnticipos,
							"actualizar","actualizar","Actualizar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAnticipos,this.jTtoolBarDetalleAnticipos,
							"eliminar","eliminar","Eliminar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAnticipos,this.jTtoolBarDetalleAnticipos,
							"cancelar","cancelar","Cancelar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAnticipos,this.jTtoolBarDetalleAnticipos,
							"guardarcambios","guardarcambios","Guardar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAnticipos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAnticipos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAnticipos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAnticipos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAnticipos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAnticipos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAnticipos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAnticipos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAnticipos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAnticipos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAnticipos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAnticipos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAnticipos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAnticipos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAnticipos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAnticipos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAnticipos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAnticipos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAnticipos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAnticipos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAnticipos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAnticipos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAnticipos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAnticipos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAnticipos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAnticipos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAnticipos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAnticipos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAnticipos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAnticipos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAnticipos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAnticipos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAnticipos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAnticipos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAnticipos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAnticipos.add(this.jMenuItemDetalleCerrarAnticipos);
		
		this.jmenuDetalleAccionesAnticipos.add(this.jMenuItemActualizarAnticipos);
		this.jmenuDetalleAccionesAnticipos.add(this.jMenuItemEliminarAnticipos);
		this.jmenuDetalleAccionesAnticipos.add(this.jMenuItemCancelarAnticipos);		
		
		//this.jmenuDetalleDatosAnticipos.add(this.jMenuItemDetalleAbrirOrderByAnticipos);				
		this.jmenuDetalleDatosAnticipos.add(this.jMenuItemDetalleMostarOcultarAnticipos);				
				
		//this.jmenuDetalleAccionesAnticipos.add(this.jMenuItemGuardarCambiosAnticipos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAnticipos.add(this.jmenuDetalleArchivoAnticipos);		
		this.jmenuBarDetalleAnticipos.add(this.jmenuDetalleAccionesAnticipos);		
		this.jmenuBarDetalleAnticipos.add(this.jmenuDetalleDatosAnticipos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAnticipos);				
	}
	
	
	public void inicializarElementosCamposAnticipos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAnticipos = new JLabelMe();
		jLabelIdAnticipos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAnticipos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAnticipos= new GridBagLayout();

		this.jPanelidAnticipos.setLayout(this.gridaBagLayoutAnticipos);

		jLabelidAnticipos = new JLabel();
		jLabelidAnticipos.setText("Id");

		jLabelidAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoAnticipos = new JLabelMe();
		this.jLabelcodigoAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoAnticipos.setToolTipText("Codigo");
		this.jLabelcodigoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelcodigoAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextFieldcodigoAnticipos= new JTextFieldMe();

		jTextFieldcodigoAnticipos.setEnabled(false);
		jTextFieldcodigoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoAnticiposBusqueda= new JButtonMe();
		this.jButtoncodigoAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoAnticiposBusqueda.setText("U");
		this.jButtoncodigoAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelfecha_desdeAnticipos = new JLabelMe();
		this.jLabelfecha_desdeAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeAnticipos.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelfecha_desdeAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		//jFormattedTextFieldfecha_desdeAnticipos= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeAnticipos= new JDateChooser();
		jDateChooserfecha_desdeAnticipos.setEnabled(false);
		jDateChooserfecha_desdeAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeAnticipos.setDate(new Date());
		jDateChooserfecha_desdeAnticipos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeAnticipos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeAnticiposBusqueda= new JButtonMe();
		this.jButtonfecha_desdeAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeAnticiposBusqueda.setText("U");
		this.jButtonfecha_desdeAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaAnticipos = new JLabelMe();
		this.jLabelfecha_hastaAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaAnticipos.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelfecha_hastaAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		//jFormattedTextFieldfecha_hastaAnticipos= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaAnticipos= new JDateChooser();
		jDateChooserfecha_hastaAnticipos.setEnabled(false);
		jDateChooserfecha_hastaAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaAnticipos.setDate(new Date());
		jDateChooserfecha_hastaAnticipos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaAnticipos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaAnticiposBusqueda= new JButtonMe();
		this.jButtonfecha_hastaAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaAnticiposBusqueda.setText("U");
		this.jButtonfecha_hastaAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cargoAnticipos = new JLabelMe();
		this.jLabelcodigo_cargoAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_CODIGOCARGO+" : *");
		this.jLabelcodigo_cargoAnticipos.setToolTipText("Codigo Cargo");
		this.jLabelcodigo_cargoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cargoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cargoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cargoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cargoAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cargoAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_CODIGOCARGO);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelcodigo_cargoAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextFieldcodigo_cargoAnticipos= new JTextFieldMe();

		jTextFieldcodigo_cargoAnticipos.setEnabled(false);
		jTextFieldcodigo_cargoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cargoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cargoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cargoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cargoAnticiposBusqueda= new JButtonMe();
		this.jButtoncodigo_cargoAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cargoAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cargoAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cargoAnticiposBusqueda.setText("U");
		this.jButtoncodigo_cargoAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cargoAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cargoAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cargoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cargoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cargoAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cargoAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelnombre_estructuraAnticipos = new JLabelMe();
		this.jLabelnombre_estructuraAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA+" : *");
		this.jLabelnombre_estructuraAnticipos.setToolTipText("Nombre Estructura");
		this.jLabelnombre_estructuraAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_estructuraAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_estructuraAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_estructuraAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_estructuraAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_estructuraAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_NOMBREESTRUCTURA);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelnombre_estructuraAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextAreanombre_estructuraAnticipos= new JTextAreaMe();
		jTextAreanombre_estructuraAnticipos.setEnabled(false);
		jTextAreanombre_estructuraAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estructuraAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estructuraAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estructuraAnticipos.setLineWrap(true);
		jTextAreanombre_estructuraAnticipos.setWrapStyleWord(true);
		jTextAreanombre_estructuraAnticipos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_estructuraAnticipos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_estructuraAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_estructuraAnticipos = new JScrollPane(jTextAreanombre_estructuraAnticipos);
		jscrollPanenombre_estructuraAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_estructuraAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_estructuraAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_estructuraAnticiposBusqueda= new JButtonMe();
		this.jButtonnombre_estructuraAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_estructuraAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_estructuraAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_estructuraAnticiposBusqueda.setText("U");
		this.jButtonnombre_estructuraAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_estructuraAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_estructuraAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_estructuraAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_estructuraAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_estructuraAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_estructuraAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_datoAnticipos = new JLabelMe();
		this.jLabelcodigo_datoAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_CODIGODATO+" : *");
		this.jLabelcodigo_datoAnticipos.setToolTipText("Codigo Dato");
		this.jLabelcodigo_datoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_datoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_datoAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_datoAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_CODIGODATO);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelcodigo_datoAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextFieldcodigo_datoAnticipos= new JTextFieldMe();

		jTextFieldcodigo_datoAnticipos.setEnabled(false);
		jTextFieldcodigo_datoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_datoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_datoAnticiposBusqueda= new JButtonMe();
		this.jButtoncodigo_datoAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_datoAnticiposBusqueda.setText("U");
		this.jButtoncodigo_datoAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_datoAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_datoAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_datoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_datoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_datoAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_datoAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoAnticipos = new JLabelMe();
		this.jLabelnombre_completoAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoAnticipos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelnombre_completoAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextAreanombre_completoAnticipos= new JTextAreaMe();
		jTextAreanombre_completoAnticipos.setEnabled(false);
		jTextAreanombre_completoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoAnticipos.setLineWrap(true);
		jTextAreanombre_completoAnticipos.setWrapStyleWord(true);
		jTextAreanombre_completoAnticipos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoAnticipos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoAnticipos = new JScrollPane(jTextAreanombre_completoAnticipos);
		jscrollPanenombre_completoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_completoAnticiposBusqueda= new JButtonMe();
		this.jButtonnombre_completoAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoAnticiposBusqueda.setText("U");
		this.jButtonnombre_completoAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelsueldoAnticipos = new JLabelMe();
		this.jLabelsueldoAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_SUELDO+" : *");
		this.jLabelsueldoAnticipos.setToolTipText("Sueldo");
		this.jLabelsueldoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsueldoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsueldoAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsueldoAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_SUELDO);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelsueldoAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextFieldsueldoAnticipos= new JTextFieldMe();
		jTextFieldsueldoAnticipos.setEnabled(false);
		jTextFieldsueldoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsueldoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsueldoAnticipos.setText("0.0");

		this.jButtonsueldoAnticiposBusqueda= new JButtonMe();
		this.jButtonsueldoAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldoAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldoAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsueldoAnticiposBusqueda.setText("U");
		this.jButtonsueldoAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsueldoAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsueldoAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsueldoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsueldoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sueldoAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsueldoAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelfechaAnticipos = new JLabelMe();
		this.jLabelfechaAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAnticipos.setToolTipText("Fecha");
		this.jLabelfechaAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelfechaAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		//jFormattedTextFieldfechaAnticipos= new JFormattedTextFieldMe();

		jDateChooserfechaAnticipos= new JDateChooser();
		jDateChooserfechaAnticipos.setEnabled(false);
		jDateChooserfechaAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAnticipos.setDate(new Date());
		jDateChooserfechaAnticipos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAnticipos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAnticiposBusqueda= new JButtonMe();
		this.jButtonfechaAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAnticiposBusqueda.setText("U");
		this.jButtonfechaAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelvalorAnticipos = new JLabelMe();
		this.jLabelvalorAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorAnticipos.setToolTipText("Valor");
		this.jLabelvalorAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelvalorAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextFieldvalorAnticipos= new JTextFieldMe();
		jTextFieldvalorAnticipos.setEnabled(false);
		jTextFieldvalorAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorAnticipos.setText("0.0");

		this.jButtonvalorAnticiposBusqueda= new JButtonMe();
		this.jButtonvalorAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorAnticiposBusqueda.setText("U");
		this.jButtonvalorAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelvalor_adicionalAnticipos = new JLabelMe();
		this.jLabelvalor_adicionalAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_VALORADICIONAL+" : *");
		this.jLabelvalor_adicionalAnticipos.setToolTipText("Valor Adicional");
		this.jLabelvalor_adicionalAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_adicionalAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_adicionalAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_adicionalAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_adicionalAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_adicionalAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_VALORADICIONAL);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelvalor_adicionalAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextFieldvalor_adicionalAnticipos= new JTextFieldMe();
		jTextFieldvalor_adicionalAnticipos.setEnabled(false);
		jTextFieldvalor_adicionalAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_adicionalAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_adicionalAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_adicionalAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_adicionalAnticipos.setText("0.0");

		this.jButtonvalor_adicionalAnticiposBusqueda= new JButtonMe();
		this.jButtonvalor_adicionalAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_adicionalAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_adicionalAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_adicionalAnticiposBusqueda.setText("U");
		this.jButtonvalor_adicionalAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_adicionalAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_adicionalAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_adicionalAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_adicionalAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_adicionalAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_adicionalAnticiposBusqueda.setVisible(false);		}


					
		this.jLabelvalor_prestamoAnticipos = new JLabelMe();
		this.jLabelvalor_prestamoAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_VALORPRESTAMO+" : *");
		this.jLabelvalor_prestamoAnticipos.setToolTipText("Valor Prestamo");
		this.jLabelvalor_prestamoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_prestamoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_prestamoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_prestamoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_prestamoAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_prestamoAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_VALORPRESTAMO);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelvalor_prestamoAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextFieldvalor_prestamoAnticipos= new JTextFieldMe();
		jTextFieldvalor_prestamoAnticipos.setEnabled(false);
		jTextFieldvalor_prestamoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_prestamoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_prestamoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_prestamoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_prestamoAnticipos.setText("0.0");

		this.jButtonvalor_prestamoAnticiposBusqueda= new JButtonMe();
		this.jButtonvalor_prestamoAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_prestamoAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_prestamoAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_prestamoAnticiposBusqueda.setText("U");
		this.jButtonvalor_prestamoAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_prestamoAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_prestamoAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_prestamoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_prestamoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_prestamoAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_prestamoAnticiposBusqueda.setVisible(false);		}


					
		this.jLabeltotalAnticipos = new JLabelMe();
		this.jLabeltotalAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalAnticipos.setToolTipText("Total");
		this.jLabeltotalAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPaneltotalAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jTextFieldtotalAnticipos= new JTextFieldMe();
		jTextFieldtotalAnticipos.setEnabled(false);
		jTextFieldtotalAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalAnticipos.setText("0.0");

		this.jButtontotalAnticiposBusqueda= new JButtonMe();
		this.jButtontotalAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalAnticiposBusqueda.setText("U");
		this.jButtontotalAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalAnticiposBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAnticipos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAnticipos = new JLabelMe();
		this.jLabelid_empresaAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAnticipos.setToolTipText("Empresa");
		this.jLabelid_empresaAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelid_empresaAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jComboBoxid_empresaAnticipos= new JComboBoxMe();
		jComboBoxid_empresaAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAnticipos.setEnabled(false);

		this.jButtonid_empresaAnticipos= new JButtonMe();
		this.jButtonid_empresaAnticipos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnticipos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnticipos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAnticipos.setText("Buscar");
		this.jButtonid_empresaAnticipos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAnticipos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnticipos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnticipos"));

		this.jButtonid_empresaAnticiposBusqueda= new JButtonMe();
		this.jButtonid_empresaAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAnticiposBusqueda.setText("U");
		this.jButtonid_empresaAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAnticiposBusqueda.setVisible(false);		}

		this.jButtonid_empresaAnticiposUpdate= new JButtonMe();
		this.jButtonid_empresaAnticiposUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnticiposUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAnticiposUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAnticiposUpdate.setText("U");
		this.jButtonid_empresaAnticiposUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAnticiposUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAnticiposUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAnticiposUpdate"));



					
		this.jLabelid_tipo_contratoAnticipos = new JLabelMe();
		this.jLabelid_tipo_contratoAnticipos.setText(""+AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO+" : *");
		this.jLabelid_tipo_contratoAnticipos.setToolTipText("Tipo Contrato");
		this.jLabelid_tipo_contratoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_contratoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_contratoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_contratoAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_contratoAnticipos.setToolTipText(AnticiposConstantesFunciones.LABEL_IDTIPOCONTRATO);
		this.gridaBagLayoutAnticipos = new GridBagLayout();
		this.jPanelid_tipo_contratoAnticipos.setLayout(this.gridaBagLayoutAnticipos);


		jComboBoxid_tipo_contratoAnticipos= new JComboBoxMe();
		jComboBoxid_tipo_contratoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_contratoAnticipos= new JButtonMe();
		this.jButtonid_tipo_contratoAnticipos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoAnticipos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoAnticipos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoAnticipos.setText("Buscar");
		this.jButtonid_tipo_contratoAnticipos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_contratoAnticipos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoAnticipos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_contratoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoAnticipos"));

		this.jButtonid_tipo_contratoAnticiposBusqueda= new JButtonMe();
		this.jButtonid_tipo_contratoAnticiposBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoAnticiposBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoAnticiposBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoAnticiposBusqueda.setText("U");
		this.jButtonid_tipo_contratoAnticiposBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_contratoAnticiposBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoAnticiposBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_contratoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoAnticiposBusqueda"));

		if(this.anticiposSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_contratoAnticiposBusqueda.setVisible(false);		}

		this.jButtonid_tipo_contratoAnticiposUpdate= new JButtonMe();
		this.jButtonid_tipo_contratoAnticiposUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoAnticiposUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoAnticiposUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoAnticiposUpdate.setText("U");
		this.jButtonid_tipo_contratoAnticiposUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_contratoAnticiposUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoAnticiposUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_contratoAnticipos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoAnticipos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoAnticiposUpdate"));



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
		//this.jInternalFrameDetalleAnticipos = new AnticiposBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Anticipos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAnticipos= new GridBagLayout();
		

		
		String sToolTipAnticipos="";
		sToolTipAnticipos=AnticiposConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAnticipos+="(Nomina.Anticipos)";
		}
		
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
			sToolTipAnticipos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAnticipos = new JButtonMe();
		this.jButtonModificarAnticipos = new JButtonMe();
        this.jButtonActualizarAnticipos = new JButtonMe();
        this.jButtonEliminarAnticipos = new JButtonMe();
        this.jButtonCancelarAnticipos = new JButtonMe();
        this.jButtonGuardarCambiosAnticipos = new JButtonMe();
		this.jButtonGuardarCambiosTablaAnticipos = new JButtonMe();
		this.jButtonCerrarAnticipos = new JButtonMe();
		
		this.jScrollPanelDatosAnticipos = new JScrollPane();   
        this.jScrollPanelDatosEdicionAnticipos = new JScrollPane();
		this.jScrollPanelDatosGeneralAnticipos = new JScrollPane();
				
		
		
		this.jPanelCamposAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Anticipos";
		
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticiposes" + this.sPath));
		} else {
			this.jScrollPanelDatosAnticipos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAnticipos.setName("jPanelCamposAnticipos"); 

		this.jPanelCamposOcultosAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAnticipos.setName("jPanelCamposOcultosAnticipos"); 

        this.jPanelAccionesAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAnticipos.setToolTipText("Acciones");
        this.jPanelAccionesAnticipos.setName("Acciones"); 

		this.jPanelAccionesFormularioAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAnticipos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAnticipos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAnticipos.setText("Nuevo");
		this.jButtonModificarAnticipos.setText("Editar");
        this.jButtonActualizarAnticipos.setText("Actualizar");
        this.jButtonEliminarAnticipos.setText("Eliminar");
        this.jButtonCancelarAnticipos.setText("Cancelar");
        this.jButtonGuardarCambiosAnticipos.setText("Guardar");
		this.jButtonGuardarCambiosTablaAnticipos.setText("Guardar");
		this.jButtonCerrarAnticipos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAnticipos,"nuevo_button","Nuevo",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAnticipos,"modificar_button","Editar",this.anticiposSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAnticipos,"actualizar_button","Actualizar",this.anticiposSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAnticipos,"eliminar_button","Eliminar",this.anticiposSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAnticipos,"cancelar_button","Cancelar",this.anticiposSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAnticipos,"guardarcambios_button","Guardar",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAnticipos,"guardarcambiostabla_button","Guardar",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAnticipos,"cerrar_button","Salir",this.anticiposSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAnticipos.setToolTipText("Nuevo"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAnticipos.setToolTipText("Editar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAnticipos.setToolTipText("Actualizar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAnticipos.setToolTipText("Eliminar)"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAnticipos.setToolTipText("Cancelar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAnticipos.setToolTipText("Guardar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAnticipos.setToolTipText("Guardar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAnticipos.setToolTipText("Salir"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAnticipos";
		inputMap = this.jButtonNuevoAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAnticipos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAnticipos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAnticipos";
		inputMap = this.jButtonActualizarAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAnticipos"));
		
		//ELIMINAR
		sMapKey = "EliminarAnticipos";
		inputMap = this.jButtonEliminarAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAnticipos"));
		
		//CANCELAR	
		sMapKey = "CancelarAnticipos";
		inputMap = this.jButtonCancelarAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAnticipos"));
		
		//CERRAR		
		sMapKey = "CerrarAnticipos";
		inputMap = this.jButtonCerrarAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAnticipos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAnticipos";
		inputMap = this.jButtonGuardarCambiosTablaAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAnticipos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAnticipos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAnticipos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAnticipos.setToolTipText("Nuevo Anticipos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAnticipos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAnticipos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAnticipos.setToolTipText("Sin Cerrar Ventana Anticipos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAnticipos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAnticipos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAnticipos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAnticipos.setText("Accion");
		this.jComboBoxTiposAccionesAnticipos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAnticipos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAnticipos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAnticipos = new JLabelMe();
		
		this.jLabelAccionesAnticipos.setText("Acciones");		
		this.jLabelAccionesAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAnticipos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAnticipos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAnticipos=new JTabbedPane();
		this.jTabbedPaneRelacionesAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAnticipos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAnticipos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnticipos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnticipos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAnticipos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAnticipos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAnticipos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAnticipos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAnticipos = new GridBagLayout();
		
		this.jPanelCamposAnticipos.setLayout(gridaBagLayoutCamposAnticipos);
		this.jPanelCamposOcultosAnticipos.setLayout(gridaBagLayoutCamposOcultosAnticipos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAnticipos.add(jLabelIdAnticipos, this.gridBagConstraintsAnticipos);



	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAnticipos.add(jLabelidAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAnticipos.add(jLabelid_empresaAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAnticipos.add(jButtonid_empresaAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 3;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAnticipos.add(jButtonid_empresaAnticiposUpdate, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAnticipos.add(jComboBoxid_empresaAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_contratoAnticipos.add(jLabelid_tipo_contratoAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoAnticipos.add(jButtonid_tipo_contratoAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 3;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoAnticipos.add(jButtonid_tipo_contratoAnticiposUpdate, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_contratoAnticipos.add(jComboBoxid_tipo_contratoAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoAnticipos.add(jLabelcodigoAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoAnticipos.add(jButtoncodigoAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoAnticipos.add(jTextFieldcodigoAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeAnticipos.add(jLabelfecha_desdeAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeAnticipos.add(jButtonfecha_desdeAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeAnticipos.add(jDateChooserfecha_desdeAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaAnticipos.add(jLabelfecha_hastaAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaAnticipos.add(jButtonfecha_hastaAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaAnticipos.add(jDateChooserfecha_hastaAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cargoAnticipos.add(jLabelcodigo_cargoAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cargoAnticipos.add(jButtoncodigo_cargoAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cargoAnticipos.add(jTextFieldcodigo_cargoAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_estructuraAnticipos.add(jLabelnombre_estructuraAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_estructuraAnticipos.add(jButtonnombre_estructuraAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_estructuraAnticipos.add(jscrollPanenombre_estructuraAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_datoAnticipos.add(jLabelcodigo_datoAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_datoAnticipos.add(jButtoncodigo_datoAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_datoAnticipos.add(jTextFieldcodigo_datoAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoAnticipos.add(jLabelnombre_completoAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoAnticipos.add(jButtonnombre_completoAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoAnticipos.add(jscrollPanenombre_completoAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsueldoAnticipos.add(jLabelsueldoAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelsueldoAnticipos.add(jButtonsueldoAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsueldoAnticipos.add(jTextFieldsueldoAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaAnticipos.add(jLabelfechaAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAnticipos.add(jButtonfechaAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaAnticipos.add(jDateChooserfechaAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorAnticipos.add(jLabelvalorAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorAnticipos.add(jButtonvalorAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorAnticipos.add(jTextFieldvalorAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_adicionalAnticipos.add(jLabelvalor_adicionalAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_adicionalAnticipos.add(jButtonvalor_adicionalAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_adicionalAnticipos.add(jTextFieldvalor_adicionalAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_prestamoAnticipos.add(jLabelvalor_prestamoAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_prestamoAnticipos.add(jButtonvalor_prestamoAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_prestamoAnticipos.add(jTextFieldvalor_prestamoAnticipos, this.gridBagConstraintsAnticipos);


	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 0;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalAnticipos.add(jLabeltotalAnticipos, this.gridBagConstraintsAnticipos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 2;
		this.gridBagConstraintsAnticipos.ipadx = 0;
		this.gridBagConstraintsAnticipos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalAnticipos.add(jButtontotalAnticiposBusqueda, this.gridBagConstraintsAnticipos);
	}

	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAnticipos.gridy = 0;
	this.gridBagConstraintsAnticipos.gridx = 1;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalAnticipos.add(jTextFieldtotalAnticipos, this.gridBagConstraintsAnticipos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelidAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelid_tipo_contratoAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelcodigoAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelfecha_desdeAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelfecha_hastaAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelcodigo_cargoAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelnombre_estructuraAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelcodigo_datoAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelnombre_completoAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelsueldoAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelfechaAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelvalorAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelvalor_adicionalAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPanelvalor_prestamoAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAnticipos.add(this.jPaneltotalAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposAnticipos % 2==0) {
		iXPanelCamposAnticipos=0;
		iYPanelCamposAnticipos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAnticipos = new GridBagConstraints();
	this.gridBagConstraintsAnticipos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAnticipos.gridy = iYPanelCamposOcultosAnticipos;
	this.gridBagConstraintsAnticipos.gridx = iXPanelCamposOcultosAnticipos++;
	this.gridBagConstraintsAnticipos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAnticipos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAnticipos.add(this.jPanelid_empresaAnticipos, this.gridBagConstraintsAnticipos);



	if(iXPanelCamposOcultosAnticipos % 2==0) {
		iXPanelCamposOcultosAnticipos=0;
		iYPanelCamposOcultosAnticipos++;
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
			
		GridBagLayout gridaBagLayoutAccionesAnticipos= new GridBagLayout();
		this.jPanelAccionesAnticipos.setLayout(gridaBagLayoutAccionesAnticipos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAnticipos= new GridBagLayout();
		this.jPanelAccionesFormularioAnticipos.setLayout(gridaBagLayoutAccionesFormularioAnticipos);
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAnticipos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAnticipos.add(this.jComboBoxTiposAccionesFormularioAnticipos, this.gridBagConstraintsAnticipos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = iPosXAccion++;
			
		this.jPanelAccionesAnticipos.add(this.jButtonModificarAnticipos, this.gridBagConstraintsAnticipos);							

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx =iPosXAccion++;
			
		this.jPanelAccionesAnticipos.add(this.jButtonEliminarAnticipos, this.gridBagConstraintsAnticipos);
		
			
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = 0;		
		this.gridBagConstraintsAnticipos.gridx = iPosXAccion++;
		
		this.jPanelAccionesAnticipos.add(this.jButtonActualizarAnticipos, this.gridBagConstraintsAnticipos);


		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = 0;		
		this.gridBagConstraintsAnticipos.gridx = iPosXAccion++;
		
		this.jPanelAccionesAnticipos.add(this.jButtonGuardarCambiosAnticipos, this.gridBagConstraintsAnticipos);	
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = 0;		
		this.gridBagConstraintsAnticipos.gridx =iPosXAccion++;
		
		this.jPanelAccionesAnticipos.add(this.jButtonCancelarAnticipos, this.gridBagConstraintsAnticipos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAnticipos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAnticipos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAnticipos = new GridBagConstraints();						
			this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnticipos.gridx = 0;		
			//this.gridBagConstraintsAnticipos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAnticipos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAnticipos.gridx =0;
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAnticipos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAnticipos, this.gridBagConstraintsAnticipos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AnticiposJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAnticipos = new AnticiposBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Anticipos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Anticipos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Anticipos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AnticiposModel anticiposModel=new AnticiposModel(this);
			
			//SI USARA CLASE INTERNA
			//AnticiposModel.AnticiposFocusTraversalPolicy anticiposFocusTraversalPolicy = anticiposModel.new AnticiposFocusTraversalPolicy(this);
			
			//anticiposFocusTraversalPolicy.setanticiposJInternalFrame(this);
			
			this.setFocusTraversalPolicy(anticiposModel);
			
			
			this.jContentPaneDetalleAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAnticipos = new GridBagLayout();	
			this.jContentPaneDetalleAnticipos.setLayout(gridaBagLayoutDetalleAnticipos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAnticipos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAnticipos = new GridBagConstraints();
				this.gridBagConstraintsAnticipos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAnticipos.gridx = 0;
					
				
				this.jContentPaneDetalleAnticipos.add(jTtoolBarDetalleAnticipos, gridBagConstraintsAnticipos);								
				
}
			
			this.jScrollPanelDatosEdicionAnticipos=   new JScrollPane(jContentPaneDetalleAnticipos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAnticipos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnticipos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnticipos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAnticipos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAnticipos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnticipos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnticipos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAnticipos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAnticipos.gridx = 0;
	        
			this.jContentPaneDetalleAnticipos.add(jPanelCamposAnticipos, gridBagConstraintsAnticipos);
			
			
			
			
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
						//&& anticiposSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.anticiposSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAnticipos= new GridBagConstraints();
						this.gridBagConstraintsAnticipos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAnticipos.gridx = 0;
						this.jContentPaneDetalleAnticipos.add(this.jTabbedPaneRelacionesAnticipos, this.gridBagConstraintsAnticipos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAnticipos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAnticipos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAnticipos = new GridBagConstraints();
					this.gridBagConstraintsAnticipos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAnticipos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAnticipos.gridx = 0;
					
				
					this.jContentPaneDetalleAnticipos.add(jPanelCamposOcultosAnticipos, gridBagConstraintsAnticipos);
				
					this.jPanelCamposOcultosAnticipos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAnticipos.gridx = 0;
	        this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAnticipos.add(this.jPanelAccionesFormularioAnticipos, this.gridBagConstraintsAnticipos);							
			
			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
	        this.gridBagConstraintsAnticipos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAnticipos.gridx = 0;
	        
			
			this.jContentPaneDetalleAnticipos.add(this.jPanelAccionesAnticipos, this.gridBagConstraintsAnticipos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAnticipos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAnticipos=   new JScrollPane(this.jPanelCamposAnticipos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAnticipos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnticipos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAnticipos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAnticipos.gridx = 0;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAnticipos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAnticipos, this.gridBagConstraintsAnticipos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAnticipos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAnticipos, this.gridBagConstraintsAnticipos);			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAnticipos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAnticipos, this.gridBagConstraintsAnticipos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAnticipos, this.gridBagConstraintsAnticipos);
			
			
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAnticipos, this.gridBagConstraintsAnticipos);
		
			
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAnticipos, this.gridBagConstraintsAnticipos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAnticipos;//jContentPane;
		
		return jScrollPanelDatosEdicionAnticipos;
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
