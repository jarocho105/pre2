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
import com.bydan.erp.activosfijos.util.report.ResponsablesConstantesFunciones;

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
public class ResponsablesDetalleFormJInternalFrame extends ResponsablesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleResponsables;
	
	protected JMenuBar jmenuBarDetalleResponsables;
	
	protected JMenu jmenuDetalleResponsables;
	protected JMenu jmenuDetalleArchivoResponsables;
	protected JMenu jmenuDetalleAccionesResponsables;
	protected JMenu jmenuDetalleDatosResponsables;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResponsables;	
	protected GridBagConstraints gridBagConstraintsResponsables;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ResponsablesBeanSwingJInternalFrameAdditional jInternalFrameDetalleResponsables;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ResponsablesSessionBean responsablesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ResponsablesLogic responsablesLogic;
	
	public JScrollPane jScrollPanelDatosResponsables;
	public JScrollPane jScrollPanelDatosEdicionResponsables;
	public JScrollPane jScrollPanelDatosGeneralResponsables;
	
	protected JPanel jPanelCamposResponsables;    
	protected JPanel jPanelCamposOcultosResponsables;    	
	protected JPanel jPanelAccionesResponsables;
	protected JPanel jPanelAccionesFormularioResponsables;
    
	
	
	protected Integer iXPanelCamposResponsables=0;
	protected Integer iYPanelCamposResponsables=0;
	
	protected Integer iXPanelCamposOcultosResponsables=0;
	protected Integer iYPanelCamposOcultosResponsables=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoResponsables;
	public JButton jButtonModificarResponsables;
	public JButton jButtonActualizarResponsables;
    public JButton jButtonEliminarResponsables;
	public JButton jButtonCancelarResponsables;
    public JButton jButtonGuardarCambiosResponsables;
	public JButton jButtonGuardarCambiosTablaResponsables;
	protected JButton jButtonCerrarResponsables;
	
	
	protected JButton jButtonProcesarInformacionResponsables;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoResponsables;
	protected JCheckBox jCheckBoxPostAccionSinCerrarResponsables;
	protected JCheckBox jCheckBoxPostAccionSinMensajeResponsables;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResponsables;
	protected JButton jButtonModificarToolBarResponsables;
	protected JButton jButtonActualizarToolBarResponsables;
    protected JButton jButtonEliminarToolBarResponsables;
	protected JButton jButtonCancelarToolBarResponsables;
    protected JButton jButtonGuardarCambiosToolBarResponsables;
	protected JButton jButtonGuardarCambiosTablaToolBarResponsables;
	protected JButton jButtonMostrarOcultarTablaToolBarResponsables;
	protected JButton jButtonCerrarToolBarResponsables;
	
	protected JButton jButtonProcesarInformacionToolBarResponsables;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResponsables;
	protected JMenuItem jMenuItemModificarResponsables;
	protected JMenuItem jMenuItemActualizarResponsables;
    protected JMenuItem jMenuItemEliminarResponsables;
	protected JMenuItem jMenuItemCancelarResponsables;
    protected JMenuItem jMenuItemGuardarCambiosResponsables;
	protected JMenuItem jMenuItemGuardarCambiosTablaResponsables;
	protected JMenuItem jMenuItemCerrarResponsables;
	protected JMenuItem jMenuItemDetalleCerrarResponsables;
	protected JMenuItem jMenuItemDetalleMostarOcultarResponsables;
	
	protected JMenuItem jMenuItemProcesarInformacionResponsables;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResponsables;
	protected JMenuItem jMenuItemMostrarOcultarResponsables;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResponsables;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResponsables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResponsables;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioResponsables;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidResponsables;
	public JLabel jLabelIdResponsables;
	public JLabel jLabelidResponsables;
	public JButton jButtonidResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_empleadoResponsables;
	public JLabel jLabelcodigo_empleadoResponsables;
	public JTextField jTextFieldcodigo_empleadoResponsables;
	public JButton jButtoncodigo_empleadoResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_empleadoResponsables;
	public JLabel jLabelnombre_empleadoResponsables;
	public JTextArea jTextAreanombre_empleadoResponsables;
	public JScrollPane jscrollPanenombre_empleadoResponsables;
	public JButton jButtonnombre_empleadoResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelapellido_empleadoResponsables;
	public JLabel jLabelapellido_empleadoResponsables;
	public JTextArea jTextAreaapellido_empleadoResponsables;
	public JScrollPane jscrollPaneapellido_empleadoResponsables;
	public JButton jButtonapellido_empleadoResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_estructuraResponsables;
	public JLabel jLabelnombre_estructuraResponsables;
	public JTextArea jTextAreanombre_estructuraResponsables;
	public JScrollPane jscrollPanenombre_estructuraResponsables;
	public JButton jButtonnombre_estructuraResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelubicacionResponsables;
	public JLabel jLabelubicacionResponsables;
	public JTextArea jTextAreaubicacionResponsables;
	public JScrollPane jscrollPaneubicacionResponsables;
	public JButton jButtonubicacionResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelfechaResponsables;
	public JLabel jLabelfechaResponsables;
	//public JFormattedTextField jDateChooserfechaResponsables;

	public JDateChooser jDateChooserfechaResponsables;
	public JButton jButtonfechaResponsablesBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionResponsables;
	public JLabel jLabeldescripcionResponsables;
	public JTextArea jTextAreadescripcionResponsables;
	public JScrollPane jscrollPanedescripcionResponsables;
	public JButton jButtondescripcionResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelnombreResponsables;
	public JLabel jLabelnombreResponsables;
	public JTextArea jTextAreanombreResponsables;
	public JScrollPane jscrollPanenombreResponsables;
	public JButton jButtonnombreResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelclaveResponsables;
	public JLabel jLabelclaveResponsables;
	public JTextField jTextFieldclaveResponsables;
	public JButton jButtonclaveResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sub_grupoResponsables;
	public JLabel jLabelcodigo_sub_grupoResponsables;
	public JTextField jTextFieldcodigo_sub_grupoResponsables;
	public JButton jButtoncodigo_sub_grupoResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoResponsables;
	public JLabel jLabelnombre_sub_grupoResponsables;
	public JTextArea jTextAreanombre_sub_grupoResponsables;
	public JScrollPane jscrollPanenombre_sub_grupoResponsables;
	public JButton jButtonnombre_sub_grupoResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoResponsables;
	public JLabel jLabelcodigo_detalle_grupoResponsables;
	public JTextField jTextFieldcodigo_detalle_grupoResponsables;
	public JButton jButtoncodigo_detalle_grupoResponsablesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoResponsables;
	public JLabel jLabelnombre_detalle_grupoResponsables;
	public JTextArea jTextAreanombre_detalle_grupoResponsables;
	public JScrollPane jscrollPanenombre_detalle_grupoResponsables;
	public JButton jButtonnombre_detalle_grupoResponsablesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaResponsables;
	public JLabel jLabelid_empresaResponsables;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaResponsables;
	public JButton jButtonid_empresaResponsables= new JButtonMe();
	public JButton jButtonid_empresaResponsablesUpdate= new JButtonMe();
	public JButton jButtonid_empresaResponsablesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesResponsables;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ResponsablesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposResponsables=new JPanel();
				this.jPanelAccionesFormularioResponsables=new JPanel();
				this.jmenuBarDetalleResponsables=new JMenuBar();
				this.jTtoolBarDetalleResponsables=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsablesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ResponsablesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsablesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsablesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsablesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarResponsables() {
		return this.jButtonActualizarToolBarResponsables;
	}
	
	public JButton getjButtonEliminarToolBarResponsables() {
		return this.jButtonEliminarToolBarResponsables;
	}
	
	public JButton getjButtonCancelarToolBarResponsables() {
		return this.jButtonCancelarToolBarResponsables;
	}		
	
	public JButton getjButtonProcesarInformacionResponsables() {
		return this.jButtonProcesarInformacionResponsables;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResponsables)	{
		this.jButtonProcesarInformacionResponsables = jButtonProcesarInformacionResponsables;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResponsables() {
		return this.jComboBoxTiposAccionesResponsables;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResponsables(
			JComboBox jComboBoxTiposRelacionesResponsables) {
		this.jComboBoxTiposRelacionesResponsables = jComboBoxTiposRelacionesResponsables;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResponsables(
			JComboBox jComboBoxTiposAccionesResponsables) {
		this.jComboBoxTiposAccionesResponsables = jComboBoxTiposAccionesResponsables;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioResponsables() {
		return this.jComboBoxTiposAccionesFormularioResponsables;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioResponsables(
			JComboBox jComboBoxTiposAccionesFormularioResponsables) {
		this.jComboBoxTiposAccionesFormularioResponsables = jComboBoxTiposAccionesFormularioResponsables;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.responsablesSessionBean=new ResponsablesSessionBean();
		
		this.responsablesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsablesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.responsablesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResponsablesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResponsablesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResponsablesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Responsables MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
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
	
		ResponsablesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleResponsables= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarResponsables=new JButtonMe();
				this.jButtonModificarToolBarResponsables=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarResponsables,this.jTtoolBarDetalleResponsables,
							"actualizar","actualizar","Actualizar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarResponsables,this.jTtoolBarDetalleResponsables,
							"eliminar","eliminar","Eliminar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarResponsables,this.jTtoolBarDetalleResponsables,
							"cancelar","cancelar","Cancelar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarResponsables,this.jTtoolBarDetalleResponsables,
							"guardarcambios","guardarcambios","Guardar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarResponsables,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarResponsables,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarResponsables,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleResponsables=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleResponsables=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoResponsables=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesResponsables=new JMenuMe("Acciones");
		this.jmenuDetalleDatosResponsables=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResponsables= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResponsables.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResponsables,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarResponsables= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarResponsables.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarResponsables,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarResponsables= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarResponsables.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarResponsables,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarResponsables= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarResponsables.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarResponsables,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarResponsables= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarResponsables.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarResponsables,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosResponsables= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResponsables.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResponsables,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResponsables= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResponsables.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResponsables,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarResponsables= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarResponsables.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarResponsables,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResponsables= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResponsables.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResponsables,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResponsables= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResponsables.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResponsables,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoResponsables.add(this.jMenuItemDetalleCerrarResponsables);
		
		this.jmenuDetalleAccionesResponsables.add(this.jMenuItemActualizarResponsables);
		this.jmenuDetalleAccionesResponsables.add(this.jMenuItemEliminarResponsables);
		this.jmenuDetalleAccionesResponsables.add(this.jMenuItemCancelarResponsables);		
		
		//this.jmenuDetalleDatosResponsables.add(this.jMenuItemDetalleAbrirOrderByResponsables);				
		this.jmenuDetalleDatosResponsables.add(this.jMenuItemDetalleMostarOcultarResponsables);				
				
		//this.jmenuDetalleAccionesResponsables.add(this.jMenuItemGuardarCambiosResponsables);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleResponsables.add(this.jmenuDetalleArchivoResponsables);		
		this.jmenuBarDetalleResponsables.add(this.jmenuDetalleAccionesResponsables);		
		this.jmenuBarDetalleResponsables.add(this.jmenuDetalleDatosResponsables);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleResponsables);				
	}
	
	
	public void inicializarElementosCamposResponsables() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdResponsables = new JLabelMe();
		jLabelIdResponsables.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidResponsables = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutResponsables= new GridBagLayout();

		this.jPanelidResponsables.setLayout(this.gridaBagLayoutResponsables);

		jLabelidResponsables = new JLabel();
		jLabelidResponsables.setText("Id");

		jLabelidResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_empleadoResponsables = new JLabelMe();
		this.jLabelcodigo_empleadoResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO+" : *");
		this.jLabelcodigo_empleadoResponsables.setToolTipText("Codigo Empleado");
		this.jLabelcodigo_empleadoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_empleadoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_empleadoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_empleadoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_empleadoResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_empleadoResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelcodigo_empleadoResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextFieldcodigo_empleadoResponsables= new JTextFieldMe();

		jTextFieldcodigo_empleadoResponsables.setEnabled(false);
		jTextFieldcodigo_empleadoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_empleadoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_empleadoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_empleadoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_empleadoResponsablesBusqueda= new JButtonMe();
		this.jButtoncodigo_empleadoResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_empleadoResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_empleadoResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_empleadoResponsablesBusqueda.setText("U");
		this.jButtoncodigo_empleadoResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_empleadoResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_empleadoResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_empleadoResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_empleadoResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_empleadoResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_empleadoResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_empleadoResponsables = new JLabelMe();
		this.jLabelnombre_empleadoResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO+" : *");
		this.jLabelnombre_empleadoResponsables.setToolTipText("Nombre Empleado");
		this.jLabelnombre_empleadoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_empleadoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_empleadoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_empleadoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_empleadoResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_empleadoResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelnombre_empleadoResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextAreanombre_empleadoResponsables= new JTextAreaMe();
		jTextAreanombre_empleadoResponsables.setEnabled(false);
		jTextAreanombre_empleadoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empleadoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empleadoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empleadoResponsables.setLineWrap(true);
		jTextAreanombre_empleadoResponsables.setWrapStyleWord(true);
		jTextAreanombre_empleadoResponsables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_empleadoResponsables.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_empleadoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_empleadoResponsables = new JScrollPane(jTextAreanombre_empleadoResponsables);
		jscrollPanenombre_empleadoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empleadoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empleadoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_empleadoResponsablesBusqueda= new JButtonMe();
		this.jButtonnombre_empleadoResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empleadoResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empleadoResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_empleadoResponsablesBusqueda.setText("U");
		this.jButtonnombre_empleadoResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_empleadoResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_empleadoResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_empleadoResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_empleadoResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_empleadoResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_empleadoResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelapellido_empleadoResponsables = new JLabelMe();
		this.jLabelapellido_empleadoResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO+" : *");
		this.jLabelapellido_empleadoResponsables.setToolTipText("Apello Empleado");
		this.jLabelapellido_empleadoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellido_empleadoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellido_empleadoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelapellido_empleadoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellido_empleadoResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellido_empleadoResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelapellido_empleadoResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextAreaapellido_empleadoResponsables= new JTextAreaMe();
		jTextAreaapellido_empleadoResponsables.setEnabled(false);
		jTextAreaapellido_empleadoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellido_empleadoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellido_empleadoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellido_empleadoResponsables.setLineWrap(true);
		jTextAreaapellido_empleadoResponsables.setWrapStyleWord(true);
		jTextAreaapellido_empleadoResponsables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellido_empleadoResponsables.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaapellido_empleadoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellido_empleadoResponsables = new JScrollPane(jTextAreaapellido_empleadoResponsables);
		jscrollPaneapellido_empleadoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellido_empleadoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellido_empleadoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellido_empleadoResponsablesBusqueda= new JButtonMe();
		this.jButtonapellido_empleadoResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellido_empleadoResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellido_empleadoResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellido_empleadoResponsablesBusqueda.setText("U");
		this.jButtonapellido_empleadoResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellido_empleadoResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellido_empleadoResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellido_empleadoResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellido_empleadoResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellido_empleadoResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellido_empleadoResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_estructuraResponsables = new JLabelMe();
		this.jLabelnombre_estructuraResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA+" : *");
		this.jLabelnombre_estructuraResponsables.setToolTipText("Nombre Estructura");
		this.jLabelnombre_estructuraResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_estructuraResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_estructuraResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_estructuraResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_estructuraResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_estructuraResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelnombre_estructuraResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextAreanombre_estructuraResponsables= new JTextAreaMe();
		jTextAreanombre_estructuraResponsables.setEnabled(false);
		jTextAreanombre_estructuraResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estructuraResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estructuraResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estructuraResponsables.setLineWrap(true);
		jTextAreanombre_estructuraResponsables.setWrapStyleWord(true);
		jTextAreanombre_estructuraResponsables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_estructuraResponsables.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_estructuraResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_estructuraResponsables = new JScrollPane(jTextAreanombre_estructuraResponsables);
		jscrollPanenombre_estructuraResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_estructuraResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_estructuraResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_estructuraResponsablesBusqueda= new JButtonMe();
		this.jButtonnombre_estructuraResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_estructuraResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_estructuraResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_estructuraResponsablesBusqueda.setText("U");
		this.jButtonnombre_estructuraResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_estructuraResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_estructuraResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_estructuraResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_estructuraResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_estructuraResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_estructuraResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelubicacionResponsables = new JLabelMe();
		this.jLabelubicacionResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_UBICACION+" : *");
		this.jLabelubicacionResponsables.setToolTipText("Ubicacion");
		this.jLabelubicacionResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelubicacionResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelubicacionResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelubicacionResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelubicacionResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelubicacionResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_UBICACION);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelubicacionResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextAreaubicacionResponsables= new JTextAreaMe();
		jTextAreaubicacionResponsables.setEnabled(false);
		jTextAreaubicacionResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionResponsables.setLineWrap(true);
		jTextAreaubicacionResponsables.setWrapStyleWord(true);
		jTextAreaubicacionResponsables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaubicacionResponsables.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaubicacionResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneubicacionResponsables = new JScrollPane(jTextAreaubicacionResponsables);
		jscrollPaneubicacionResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneubicacionResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneubicacionResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonubicacionResponsablesBusqueda= new JButtonMe();
		this.jButtonubicacionResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonubicacionResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonubicacionResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonubicacionResponsablesBusqueda.setText("U");
		this.jButtonubicacionResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonubicacionResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonubicacionResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaubicacionResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaubicacionResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ubicacionResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonubicacionResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelfechaResponsables = new JLabelMe();
		this.jLabelfechaResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaResponsables.setToolTipText("Fecha");
		this.jLabelfechaResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelfechaResponsables.setLayout(this.gridaBagLayoutResponsables);


		//jFormattedTextFieldfechaResponsables= new JFormattedTextFieldMe();

		jDateChooserfechaResponsables= new JDateChooser();
		jDateChooserfechaResponsables.setEnabled(false);
		jDateChooserfechaResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaResponsables,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaResponsables.setDate(new Date());
		jDateChooserfechaResponsables.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaResponsables.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaResponsablesBusqueda= new JButtonMe();
		this.jButtonfechaResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaResponsablesBusqueda.setText("U");
		this.jButtonfechaResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaResponsablesBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionResponsables = new JLabelMe();
		this.jLabeldescripcionResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionResponsables.setToolTipText("Descripcion");
		this.jLabeldescripcionResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPaneldescripcionResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextAreadescripcionResponsables= new JTextAreaMe();
		jTextAreadescripcionResponsables.setEnabled(false);
		jTextAreadescripcionResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionResponsables.setLineWrap(true);
		jTextAreadescripcionResponsables.setWrapStyleWord(true);
		jTextAreadescripcionResponsables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionResponsables.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionResponsables = new JScrollPane(jTextAreadescripcionResponsables);
		jscrollPanedescripcionResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionResponsablesBusqueda= new JButtonMe();
		this.jButtondescripcionResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionResponsablesBusqueda.setText("U");
		this.jButtondescripcionResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelnombreResponsables = new JLabelMe();
		this.jLabelnombreResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreResponsables.setToolTipText("Nombre");
		this.jLabelnombreResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelnombreResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextAreanombreResponsables= new JTextAreaMe();
		jTextAreanombreResponsables.setEnabled(false);
		jTextAreanombreResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreResponsables.setLineWrap(true);
		jTextAreanombreResponsables.setWrapStyleWord(true);
		jTextAreanombreResponsables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreResponsables.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreResponsables = new JScrollPane(jTextAreanombreResponsables);
		jscrollPanenombreResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreResponsablesBusqueda= new JButtonMe();
		this.jButtonnombreResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreResponsablesBusqueda.setText("U");
		this.jButtonnombreResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelclaveResponsables = new JLabelMe();
		this.jLabelclaveResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveResponsables.setToolTipText("Clave");
		this.jLabelclaveResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelclaveResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextFieldclaveResponsables= new JTextFieldMe();

		jTextFieldclaveResponsables.setEnabled(false);
		jTextFieldclaveResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveResponsablesBusqueda= new JButtonMe();
		this.jButtonclaveResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveResponsablesBusqueda.setText("U");
		this.jButtonclaveResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_sub_grupoResponsables = new JLabelMe();
		this.jLabelcodigo_sub_grupoResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO+" : *");
		this.jLabelcodigo_sub_grupoResponsables.setToolTipText("Codigo Sub Grupo");
		this.jLabelcodigo_sub_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sub_grupoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sub_grupoResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sub_grupoResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelcodigo_sub_grupoResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextFieldcodigo_sub_grupoResponsables= new JTextFieldMe();

		jTextFieldcodigo_sub_grupoResponsables.setEnabled(false);
		jTextFieldcodigo_sub_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sub_grupoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sub_grupoResponsablesBusqueda= new JButtonMe();
		this.jButtoncodigo_sub_grupoResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sub_grupoResponsablesBusqueda.setText("U");
		this.jButtoncodigo_sub_grupoResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sub_grupoResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sub_grupoResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sub_grupoResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sub_grupoResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sub_grupoResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sub_grupoResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sub_grupoResponsables = new JLabelMe();
		this.jLabelnombre_sub_grupoResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoResponsables.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelnombre_sub_grupoResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextAreanombre_sub_grupoResponsables= new JTextAreaMe();
		jTextAreanombre_sub_grupoResponsables.setEnabled(false);
		jTextAreanombre_sub_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoResponsables.setLineWrap(true);
		jTextAreanombre_sub_grupoResponsables.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoResponsables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoResponsables.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoResponsables = new JScrollPane(jTextAreanombre_sub_grupoResponsables);
		jscrollPanenombre_sub_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoResponsablesBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoResponsablesBusqueda.setText("U");
		this.jButtonnombre_sub_grupoResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoResponsables = new JLabelMe();
		this.jLabelcodigo_detalle_grupoResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoResponsables.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextFieldcodigo_detalle_grupoResponsables= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoResponsables.setEnabled(false);
		jTextFieldcodigo_detalle_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoResponsablesBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoResponsablesBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoResponsablesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoResponsables = new JLabelMe();
		this.jLabelnombre_detalle_grupoResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoResponsables.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelnombre_detalle_grupoResponsables.setLayout(this.gridaBagLayoutResponsables);


		jTextAreanombre_detalle_grupoResponsables= new JTextAreaMe();
		jTextAreanombre_detalle_grupoResponsables.setEnabled(false);
		jTextAreanombre_detalle_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoResponsables.setLineWrap(true);
		jTextAreanombre_detalle_grupoResponsables.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoResponsables.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoResponsables.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoResponsables = new JScrollPane(jTextAreanombre_detalle_grupoResponsables);
		jscrollPanenombre_detalle_grupoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoResponsablesBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoResponsablesBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoResponsablesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysResponsables() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaResponsables = new JLabelMe();
		this.jLabelid_empresaResponsables.setText(""+ResponsablesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaResponsables.setToolTipText("Empresa");
		this.jLabelid_empresaResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaResponsables,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaResponsables.setToolTipText(ResponsablesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutResponsables = new GridBagLayout();
		this.jPanelid_empresaResponsables.setLayout(this.gridaBagLayoutResponsables);


		jComboBoxid_empresaResponsables= new JComboBoxMe();
		jComboBoxid_empresaResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaResponsables,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaResponsables.setEnabled(false);

		this.jButtonid_empresaResponsables= new JButtonMe();
		this.jButtonid_empresaResponsables.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsables.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsables.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsables.setText("Buscar");
		this.jButtonid_empresaResponsables.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaResponsables.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsables,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsables"));

		this.jButtonid_empresaResponsablesBusqueda= new JButtonMe();
		this.jButtonid_empresaResponsablesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsablesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsablesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResponsablesBusqueda.setText("U");
		this.jButtonid_empresaResponsablesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaResponsablesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsablesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsablesBusqueda"));

		if(this.responsablesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaResponsablesBusqueda.setVisible(false);		}

		this.jButtonid_empresaResponsablesUpdate= new JButtonMe();
		this.jButtonid_empresaResponsablesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsablesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsablesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResponsablesUpdate.setText("U");
		this.jButtonid_empresaResponsablesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaResponsablesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsablesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsablesUpdate"));



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
		//this.jInternalFrameDetalleResponsables = new ResponsablesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Responsables DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResponsables= new GridBagLayout();
		

		
		String sToolTipResponsables="";
		sToolTipResponsables=ResponsablesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResponsables+="(ActivosFijos.Responsables)";
		}
		
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
			sToolTipResponsables+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoResponsables = new JButtonMe();
		this.jButtonModificarResponsables = new JButtonMe();
        this.jButtonActualizarResponsables = new JButtonMe();
        this.jButtonEliminarResponsables = new JButtonMe();
        this.jButtonCancelarResponsables = new JButtonMe();
        this.jButtonGuardarCambiosResponsables = new JButtonMe();
		this.jButtonGuardarCambiosTablaResponsables = new JButtonMe();
		this.jButtonCerrarResponsables = new JButtonMe();
		
		this.jScrollPanelDatosResponsables = new JScrollPane();   
        this.jScrollPanelDatosEdicionResponsables = new JScrollPane();
		this.jScrollPanelDatosGeneralResponsables = new JScrollPane();
				
		
		
		this.jPanelCamposResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Responsables";
		
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsableses" + this.sPath));
		} else {
			this.jScrollPanelDatosResponsables.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposResponsables.setName("jPanelCamposResponsables"); 

		this.jPanelCamposOcultosResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosResponsables.setName("jPanelCamposOcultosResponsables"); 

        this.jPanelAccionesResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResponsables.setToolTipText("Acciones");
        this.jPanelAccionesResponsables.setName("Acciones"); 

		this.jPanelAccionesFormularioResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioResponsables.setToolTipText("Acciones");
        this.jPanelAccionesFormularioResponsables.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResponsables, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoResponsables.setText("Nuevo");
		this.jButtonModificarResponsables.setText("Editar");
        this.jButtonActualizarResponsables.setText("Actualizar");
        this.jButtonEliminarResponsables.setText("Eliminar");
        this.jButtonCancelarResponsables.setText("Cancelar");
        this.jButtonGuardarCambiosResponsables.setText("Guardar");
		this.jButtonGuardarCambiosTablaResponsables.setText("Guardar");
		this.jButtonCerrarResponsables.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResponsables,"nuevo_button","Nuevo",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarResponsables,"modificar_button","Editar",this.responsablesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarResponsables,"actualizar_button","Actualizar",this.responsablesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarResponsables,"eliminar_button","Eliminar",this.responsablesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarResponsables,"cancelar_button","Cancelar",this.responsablesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosResponsables,"guardarcambios_button","Guardar",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResponsables,"guardarcambiostabla_button","Guardar",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResponsables,"cerrar_button","Salir",this.responsablesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoResponsables.setToolTipText("Nuevo"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarResponsables.setToolTipText("Editar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarResponsables.setToolTipText("Actualizar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarResponsables.setToolTipText("Eliminar)"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarResponsables.setToolTipText("Cancelar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosResponsables.setToolTipText("Guardar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaResponsables.setToolTipText("Guardar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResponsables.setToolTipText("Salir"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResponsables";
		inputMap = this.jButtonNuevoResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResponsables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResponsables"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarResponsables";
		inputMap = this.jButtonActualizarResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarResponsables"));
		
		//ELIMINAR
		sMapKey = "EliminarResponsables";
		inputMap = this.jButtonEliminarResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarResponsables"));
		
		//CANCELAR	
		sMapKey = "CancelarResponsables";
		inputMap = this.jButtonCancelarResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarResponsables"));
		
		//CERRAR		
		sMapKey = "CerrarResponsables";
		inputMap = this.jButtonCerrarResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResponsables"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResponsables";
		inputMap = this.jButtonGuardarCambiosTablaResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResponsables"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoResponsables = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoResponsables.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoResponsables.setToolTipText("Nuevo Responsables");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarResponsables = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarResponsables.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarResponsables.setToolTipText("Sin Cerrar Ventana Responsables");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeResponsables = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeResponsables.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeResponsables.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeResponsables, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesResponsables = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResponsables.setText("Accion");
		this.jComboBoxTiposAccionesResponsables.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioResponsables = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioResponsables.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioResponsables.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesResponsables = new JLabelMe();
		
		this.jLabelAccionesResponsables.setText("Acciones");		
		this.jLabelAccionesResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposResponsables();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysResponsables();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesResponsables=new JTabbedPane();
		this.jTabbedPaneRelacionesResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesResponsables,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesResponsables.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsables.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsables.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioResponsables.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResponsables.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResponsables.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioResponsables, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposResponsables = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosResponsables = new GridBagLayout();
		
		this.jPanelCamposResponsables.setLayout(gridaBagLayoutCamposResponsables);
		this.jPanelCamposOcultosResponsables.setLayout(gridaBagLayoutCamposOcultosResponsables);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidResponsables.add(jLabelIdResponsables, this.gridBagConstraintsResponsables);



	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidResponsables.add(jLabelidResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaResponsables.add(jLabelid_empresaResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResponsables.add(jButtonid_empresaResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 3;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResponsables.add(jButtonid_empresaResponsablesUpdate, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaResponsables.add(jComboBoxid_empresaResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_empleadoResponsables.add(jLabelcodigo_empleadoResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_empleadoResponsables.add(jButtoncodigo_empleadoResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_empleadoResponsables.add(jTextFieldcodigo_empleadoResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_empleadoResponsables.add(jLabelnombre_empleadoResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_empleadoResponsables.add(jButtonnombre_empleadoResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_empleadoResponsables.add(jscrollPanenombre_empleadoResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellido_empleadoResponsables.add(jLabelapellido_empleadoResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellido_empleadoResponsables.add(jButtonapellido_empleadoResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellido_empleadoResponsables.add(jscrollPaneapellido_empleadoResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_estructuraResponsables.add(jLabelnombre_estructuraResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_estructuraResponsables.add(jButtonnombre_estructuraResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_estructuraResponsables.add(jscrollPanenombre_estructuraResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelubicacionResponsables.add(jLabelubicacionResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelubicacionResponsables.add(jButtonubicacionResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelubicacionResponsables.add(jscrollPaneubicacionResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaResponsables.add(jLabelfechaResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaResponsables.add(jButtonfechaResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaResponsables.add(jDateChooserfechaResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionResponsables.add(jLabeldescripcionResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionResponsables.add(jButtondescripcionResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionResponsables.add(jscrollPanedescripcionResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreResponsables.add(jLabelnombreResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreResponsables.add(jButtonnombreResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreResponsables.add(jscrollPanenombreResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveResponsables.add(jLabelclaveResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveResponsables.add(jButtonclaveResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveResponsables.add(jTextFieldclaveResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sub_grupoResponsables.add(jLabelcodigo_sub_grupoResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sub_grupoResponsables.add(jButtoncodigo_sub_grupoResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sub_grupoResponsables.add(jTextFieldcodigo_sub_grupoResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoResponsables.add(jLabelnombre_sub_grupoResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoResponsables.add(jButtonnombre_sub_grupoResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoResponsables.add(jscrollPanenombre_sub_grupoResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoResponsables.add(jLabelcodigo_detalle_grupoResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoResponsables.add(jButtoncodigo_detalle_grupoResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoResponsables.add(jTextFieldcodigo_detalle_grupoResponsables, this.gridBagConstraintsResponsables);


	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 0;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoResponsables.add(jLabelnombre_detalle_grupoResponsables, this.gridBagConstraintsResponsables);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 2;
		this.gridBagConstraintsResponsables.ipadx = 0;
		this.gridBagConstraintsResponsables.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoResponsables.add(jButtonnombre_detalle_grupoResponsablesBusqueda, this.gridBagConstraintsResponsables);
	}

	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsables.gridy = 0;
	this.gridBagConstraintsResponsables.gridx = 1;
	this.gridBagConstraintsResponsables.ipadx = 0;
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoResponsables.add(jscrollPanenombre_detalle_grupoResponsables, this.gridBagConstraintsResponsables);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelidResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelcodigo_empleadoResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelnombre_empleadoResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelapellido_empleadoResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelnombre_estructuraResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelubicacionResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelfechaResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPaneldescripcionResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelnombreResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelclaveResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelcodigo_sub_grupoResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelnombre_sub_grupoResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelcodigo_detalle_grupoResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsables.add(this.jPanelnombre_detalle_grupoResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposResponsables % 2==0) {
		iXPanelCamposResponsables=0;
		iYPanelCamposResponsables++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsResponsables = new GridBagConstraints();
	this.gridBagConstraintsResponsables.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsables.gridy = iYPanelCamposOcultosResponsables;
	this.gridBagConstraintsResponsables.gridx = iXPanelCamposOcultosResponsables++;
	this.gridBagConstraintsResponsables.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsables.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResponsables.add(this.jPanelid_empresaResponsables, this.gridBagConstraintsResponsables);



	if(iXPanelCamposOcultosResponsables % 2==0) {
		iXPanelCamposOcultosResponsables=0;
		iYPanelCamposOcultosResponsables++;
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
			
		GridBagLayout gridaBagLayoutAccionesResponsables= new GridBagLayout();
		this.jPanelAccionesResponsables.setLayout(gridaBagLayoutAccionesResponsables);
		
		GridBagLayout gridaBagLayoutAccionesFormularioResponsables= new GridBagLayout();
		this.jPanelAccionesFormularioResponsables.setLayout(gridaBagLayoutAccionesFormularioResponsables);
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResponsables.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResponsables.add(this.jComboBoxTiposAccionesFormularioResponsables, this.gridBagConstraintsResponsables);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = iPosXAccion++;
			
		this.jPanelAccionesResponsables.add(this.jButtonModificarResponsables, this.gridBagConstraintsResponsables);							

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx =iPosXAccion++;
			
		this.jPanelAccionesResponsables.add(this.jButtonEliminarResponsables, this.gridBagConstraintsResponsables);
		
			
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = 0;		
		this.gridBagConstraintsResponsables.gridx = iPosXAccion++;
		
		this.jPanelAccionesResponsables.add(this.jButtonActualizarResponsables, this.gridBagConstraintsResponsables);


		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = 0;		
		this.gridBagConstraintsResponsables.gridx = iPosXAccion++;
		
		this.jPanelAccionesResponsables.add(this.jButtonGuardarCambiosResponsables, this.gridBagConstraintsResponsables);	
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = 0;		
		this.gridBagConstraintsResponsables.gridx =iPosXAccion++;
		
		this.jPanelAccionesResponsables.add(this.jButtonCancelarResponsables, this.gridBagConstraintsResponsables);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResponsables = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResponsables);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResponsables = new GridBagConstraints();						
			this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsables.gridx = 0;		
			//this.gridBagConstraintsResponsables.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResponsables.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResponsables.gridx =0;
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResponsables.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResponsables, this.gridBagConstraintsResponsables);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ResponsablesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleResponsables = new ResponsablesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Responsables DATOS");
			
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
			
	        //this.setTitle("[FOR] - Responsables DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Responsables Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ResponsablesModel responsablesModel=new ResponsablesModel(this);
			
			//SI USARA CLASE INTERNA
			//ResponsablesModel.ResponsablesFocusTraversalPolicy responsablesFocusTraversalPolicy = responsablesModel.new ResponsablesFocusTraversalPolicy(this);
			
			//responsablesFocusTraversalPolicy.setresponsablesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(responsablesModel);
			
			
			this.jContentPaneDetalleResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleResponsables = new GridBagLayout();	
			this.jContentPaneDetalleResponsables.setLayout(gridaBagLayoutDetalleResponsables);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResponsables = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsResponsables = new GridBagConstraints();
				this.gridBagConstraintsResponsables.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsResponsables.gridx = 0;
					
				
				this.jContentPaneDetalleResponsables.add(jTtoolBarDetalleResponsables, gridBagConstraintsResponsables);								
				
}
			
			this.jScrollPanelDatosEdicionResponsables=   new JScrollPane(jContentPaneDetalleResponsables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResponsables.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsables.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsables.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralResponsables=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResponsables.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsables.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsables.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			
			
	        this.gridBagConstraintsResponsables.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsResponsables.gridx = 0;
	        
			this.jContentPaneDetalleResponsables.add(jPanelCamposResponsables, gridBagConstraintsResponsables);
			
			
			
			
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
						//&& responsablesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.responsablesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsResponsables= new GridBagConstraints();
						this.gridBagConstraintsResponsables.gridy = iGridyRelaciones++;
						this.gridBagConstraintsResponsables.gridx = 0;
						this.jContentPaneDetalleResponsables.add(this.jTabbedPaneRelacionesResponsables, this.gridBagConstraintsResponsables);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesResponsables.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosResponsables.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsResponsables = new GridBagConstraints();
					this.gridBagConstraintsResponsables.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsResponsables.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsResponsables.gridx = 0;
					
				
					this.jContentPaneDetalleResponsables.add(jPanelCamposOcultosResponsables, gridBagConstraintsResponsables);
				
					this.jPanelCamposOcultosResponsables.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsResponsables.gridx = 0;
	        this.gridBagConstraintsResponsables.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleResponsables.add(this.jPanelAccionesFormularioResponsables, this.gridBagConstraintsResponsables);							
			
			
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
	        this.gridBagConstraintsResponsables.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsResponsables.gridx = 0;
	        
			
			this.jContentPaneDetalleResponsables.add(this.jPanelAccionesResponsables, this.gridBagConstraintsResponsables);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionResponsables);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionResponsables=   new JScrollPane(this.jPanelCamposResponsables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResponsables.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsables.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsables.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsResponsables.gridx = 0;
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsResponsables.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionResponsables, this.gridBagConstraintsResponsables);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResponsables.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioResponsables, this.gridBagConstraintsResponsables);			
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResponsables.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesResponsables, this.gridBagConstraintsResponsables);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResponsables, this.gridBagConstraintsResponsables);
			
			
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResponsables, this.gridBagConstraintsResponsables);
		
			
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResponsables, this.gridBagConstraintsResponsables);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralResponsables;//jContentPane;
		
		return jScrollPanelDatosEdicionResponsables;
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
