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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.TipoIdentificacionConstantesFunciones;
import com.bydan.erp.cartera.util.TipoIdentificacionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoIdentificacionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoIdentificacionBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoIdentificacionBeanSwingJInternalFrame extends TipoIdentificacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoIdentificacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoIdentificacion> tipoidentificacionValidator = new ClassValidator<TipoIdentificacion>(TipoIdentificacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoIdentificacion tipoidentificacion;	
	public TipoIdentificacion tipoidentificacionAux;
	public TipoIdentificacion tipoidentificacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoIdentificacion tipoidentificacionTotales;
	public Long idTipoIdentificacionActual;
	public Long iIdNuevoTipoIdentificacion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosConyuge=false;

	public Boolean getIsTienePermisosConyuge() {
		return isTienePermisosConyuge;
	}

	public void setIsTienePermisosConyuge(Boolean isTienePermisosConyuge) {
		this.isTienePermisosConyuge= isTienePermisosConyuge;
	}


	public Boolean isTienePermisosCobrador=false;

	public Boolean getIsTienePermisosCobrador() {
		return isTienePermisosCobrador;
	}

	public void setIsTienePermisosCobrador(Boolean isTienePermisosCobrador) {
		this.isTienePermisosCobrador= isTienePermisosCobrador;
	}


	public Boolean isTienePermisosRepresentanteLegal=false;

	public Boolean getIsTienePermisosRepresentanteLegal() {
		return isTienePermisosRepresentanteLegal;
	}

	public void setIsTienePermisosRepresentanteLegal(Boolean isTienePermisosRepresentanteLegal) {
		this.isTienePermisosRepresentanteLegal= isTienePermisosRepresentanteLegal;
	}


	public Boolean isTienePermisosSubCliente=false;

	public Boolean getIsTienePermisosSubCliente() {
		return isTienePermisosSubCliente;
	}

	public void setIsTienePermisosSubCliente(Boolean isTienePermisosSubCliente) {
		this.isTienePermisosSubCliente= isTienePermisosSubCliente;
	}


	public Boolean isTienePermisosAccionista=false;

	public Boolean getIsTienePermisosAccionista() {
		return isTienePermisosAccionista;
	}

	public void setIsTienePermisosAccionista(Boolean isTienePermisosAccionista) {
		this.isTienePermisosAccionista= isTienePermisosAccionista;
	}


	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoTipoIdentificacion;
	public Boolean isPermisoNuevoTipoIdentificacion;
	public Boolean isPermisoActualizarTipoIdentificacion;
	public Boolean isPermisoActualizarOriginalTipoIdentificacion;
	public Boolean isPermisoEliminarTipoIdentificacion;
	public Boolean isPermisoGuardarCambiosTipoIdentificacion;
	public Boolean isPermisoConsultaTipoIdentificacion;
	public Boolean isPermisoBusquedaTipoIdentificacion;
	public Boolean isPermisoReporteTipoIdentificacion;
	public Boolean isPermisoPaginacionMedioTipoIdentificacion;
	public Boolean isPermisoPaginacionAltoTipoIdentificacion;
	public Boolean isPermisoPaginacionTodoTipoIdentificacion;
	public Boolean isPermisoCopiarTipoIdentificacion;
	public Boolean isPermisoVerFormTipoIdentificacion;
	public Boolean isPermisoDuplicarTipoIdentificacion;
	public Boolean isPermisoOrdenTipoIdentificacion;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public TipoIdentificacionParameterReturnGeneral tipoidentificacionReturnGeneral;
	public TipoIdentificacionParameterReturnGeneral tipoidentificacionParameterGeneral;
	
	

	public ConyugeLogic conyugeLogic=null;

	public ConyugeLogic getConyugeLogic() {
		return conyugeLogic;
	}

	public void setConyugeLogic(ConyugeLogic conyugeLogic) {
		this.conyugeLogic = conyugeLogic;
	}


	public CobradorLogic cobradorLogic=null;

	public CobradorLogic getCobradorLogic() {
		return cobradorLogic;
	}

	public void setCobradorLogic(CobradorLogic cobradorLogic) {
		this.cobradorLogic = cobradorLogic;
	}


	public RepresentanteLegalLogic representantelegalLogic=null;

	public RepresentanteLegalLogic getRepresentanteLegalLogic() {
		return representantelegalLogic;
	}

	public void setRepresentanteLegalLogic(RepresentanteLegalLogic representantelegalLogic) {
		this.representantelegalLogic = representantelegalLogic;
	}


	public SubClienteLogic subclienteLogic=null;

	public SubClienteLogic getSubClienteLogic() {
		return subclienteLogic;
	}

	public void setSubClienteLogic(SubClienteLogic subclienteLogic) {
		this.subclienteLogic = subclienteLogic;
	}


	public AccionistaLogic accionistaLogic=null;

	public AccionistaLogic getAccionistaLogic() {
		return accionistaLogic;
	}

	public void setAccionistaLogic(AccionistaLogic accionistaLogic) {
		this.accionistaLogic = accionistaLogic;
	}


	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoIdentificacion=false;
	public Boolean esParaAccionDesdeFormularioTipoIdentificacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoIdentificacionSessionBeanAdditional tipoidentificacionSessionBeanAdditional=null;
	
	public TipoIdentificacionSessionBeanAdditional getTipoIdentificacionSessionBeanAdditional() {
		return this.tipoidentificacionSessionBeanAdditional;
	}
	
	public void setTipoIdentificacionSessionBeanAdditional(TipoIdentificacionSessionBeanAdditional tipoidentificacionSessionBeanAdditional) {
		try {
			this.tipoidentificacionSessionBeanAdditional=tipoidentificacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoIdentificacionBeanSwingJInternalFrameAdditional tipoidentificacionBeanSwingJInternalFrameAdditional=null;
	//public class TipoIdentificacionBeanSwingJInternalFrame
	
	public TipoIdentificacionBeanSwingJInternalFrameAdditional getTipoIdentificacionBeanSwingJInternalFrameAdditional() {
		return this.tipoidentificacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoIdentificacionBeanSwingJInternalFrameAdditional(TipoIdentificacionBeanSwingJInternalFrameAdditional tipoidentificacionBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoidentificacionBeanSwingJInternalFrameAdditional=tipoidentificacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoIdentificacionLogic tipoidentificacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoIdentificacion tipoidentificacionBean;
	public TipoIdentificacionConstantesFunciones tipoidentificacionConstantesFunciones;
	//public TipoIdentificacionParameterReturnGeneral tipoidentificacionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoIdentificacion> tipoidentificacions;	
	//public List<TipoIdentificacion> tipoidentificacionsEliminados;
	//public List<TipoIdentificacion> tipoidentificacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoIdentificacion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoIdentificacion=true;
	public Boolean isVisibilidadCeldaCopiarTipoIdentificacion=true;
	public Boolean isVisibilidadCeldaVerFormTipoIdentificacion=true;
	public Boolean isVisibilidadCeldaOrdenTipoIdentificacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
	public Boolean isVisibilidadCeldaModificarTipoIdentificacion=false;
	public Boolean isVisibilidadCeldaActualizarTipoIdentificacion=false;
	public Boolean isVisibilidadCeldaEliminarTipoIdentificacion=false;
	public Boolean isVisibilidadCeldaCancelarTipoIdentificacion=false;
	public Boolean isVisibilidadCeldaGuardarTipoIdentificacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;	
	
	
	
	public Long getiIdNuevoTipoIdentificacion() {
		return this.iIdNuevoTipoIdentificacion;
	}

	public void setiIdNuevoTipoIdentificacion(Long iIdNuevoTipoIdentificacion) {
		this.iIdNuevoTipoIdentificacion = iIdNuevoTipoIdentificacion;
	}
	
	public Long getidTipoIdentificacionActual() {
		return this.idTipoIdentificacionActual;
	}

	public void setidTipoIdentificacionActual(Long idTipoIdentificacionActual) {
		this.idTipoIdentificacionActual = idTipoIdentificacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoIdentificacion gettipoidentificacion() {
		return this.tipoidentificacion;
	}

	public void settipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}
	
	public TipoIdentificacion gettipoidentificacionAux() {
		return this.tipoidentificacionAux;
	}

	public void settipoidentificacionAux(TipoIdentificacion tipoidentificacionAux) {
		this.tipoidentificacionAux = tipoidentificacionAux;
	}				
	
	public TipoIdentificacion gettipoidentificacionAnterior() {
		return this.tipoidentificacionAnterior;
	}

	public void settipoidentificacionAnterior(TipoIdentificacion tipoidentificacionAnterior) {
		this.tipoidentificacionAnterior = tipoidentificacionAnterior;
	}	
	
	public TipoIdentificacion gettipoidentificacionTotales() {
		return this.tipoidentificacionTotales;
	}

	public void settipoidentificacionTotales(TipoIdentificacion tipoidentificacionTotales) {
		this.tipoidentificacionTotales = tipoidentificacionTotales;
	}	
	
	public TipoIdentificacion gettipoidentificacionBean() {
		return this.tipoidentificacionBean;
	}

	public void settipoidentificacionBean(TipoIdentificacion tipoidentificacionBean) {
		this.tipoidentificacionBean = tipoidentificacionBean;
	}	
	
	public TipoIdentificacionParameterReturnGeneral gettipoidentificacionReturnGeneral() {
		return this.tipoidentificacionReturnGeneral;
	}

	public void settipoidentificacionReturnGeneral(TipoIdentificacionParameterReturnGeneral tipoidentificacionReturnGeneral) {
		this.tipoidentificacionReturnGeneral = tipoidentificacionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoIdentificacionLogic getTipoIdentificacionLogic()	{		
		return tipoidentificacionLogic;
	}

	public void setTipoIdentificacionLogic(TipoIdentificacionLogic tipoidentificacionLogic) {
		this.tipoidentificacionLogic = tipoidentificacionLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoTipoIdentificacion() {
		return isEsNuevoTipoIdentificacion;
	}

	public void setIsEsNuevoTipoIdentificacion(Boolean isEsNuevoTipoIdentificacion) {
		this.isEsNuevoTipoIdentificacion = isEsNuevoTipoIdentificacion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoIdentificacion() {
		return esParaAccionDesdeFormularioTipoIdentificacion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoIdentificacion(Boolean esParaAccionDesdeFormularioTipoIdentificacion) {
		this.esParaAccionDesdeFormularioTipoIdentificacion = esParaAccionDesdeFormularioTipoIdentificacion;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoIdentificacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoIdentificacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoIdentificacion(this.tipoidentificacionLogic.getTipoIdentificacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoIdentificacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoIdentificacion(this.tipoidentificacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoidentificacionLogic.setTipoIdentificacions(this.tipoidentificacions);
			tipoidentificacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public TipoIdentificacionParameterReturnGeneral getTipoIdentificacionParameterGeneral() {
		return this.tipoidentificacionParameterGeneral;
	}
	
	public void setTipoIdentificacionParameterGeneral(TipoIdentificacionParameterReturnGeneral tipoidentificacionParameterGeneral) {
		this.tipoidentificacionParameterGeneral = tipoidentificacionParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoTipoIdentificacion() {
		return isPermisoTodoTipoIdentificacion;
	}

	public void setIsPermisoTodoTipoIdentificacion(Boolean isPermisoTodoTipoIdentificacion) {
		this.isPermisoTodoTipoIdentificacion = isPermisoTodoTipoIdentificacion;
	}

	public Boolean getIsPermisoNuevoTipoIdentificacion() {
		return isPermisoNuevoTipoIdentificacion;
	}

	public void setIsPermisoNuevoTipoIdentificacion(Boolean isPermisoNuevoTipoIdentificacion) {
		this.isPermisoNuevoTipoIdentificacion = isPermisoNuevoTipoIdentificacion;
	}

	public Boolean getIsPermisoActualizarTipoIdentificacion() {
		return isPermisoActualizarTipoIdentificacion;
	}

	public void setIsPermisoActualizarTipoIdentificacion(Boolean isPermisoActualizarTipoIdentificacion) {
		this.isPermisoActualizarTipoIdentificacion = isPermisoActualizarTipoIdentificacion;
	}

	public Boolean getIsPermisoEliminarTipoIdentificacion() {
		return isPermisoEliminarTipoIdentificacion;
	}

	public void setIsPermisoEliminarTipoIdentificacion(Boolean isPermisoEliminarTipoIdentificacion) {
		this.isPermisoEliminarTipoIdentificacion = isPermisoEliminarTipoIdentificacion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoIdentificacion() {
		return isPermisoGuardarCambiosTipoIdentificacion;
	}

	public void setIsPermisoGuardarCambiosTipoIdentificacion(Boolean isPermisoGuardarCambiosTipoIdentificacion) {
		this.isPermisoGuardarCambiosTipoIdentificacion = isPermisoGuardarCambiosTipoIdentificacion;
	}
	
	public Boolean getIsPermisoConsultaTipoIdentificacion() {
		return isPermisoConsultaTipoIdentificacion;
	}

	public void setIsPermisoConsultaTipoIdentificacion(Boolean isPermisoConsultaTipoIdentificacion) {
		this.isPermisoConsultaTipoIdentificacion = isPermisoConsultaTipoIdentificacion;
	}

	public Boolean getIsPermisoBusquedaTipoIdentificacion() {
		return isPermisoBusquedaTipoIdentificacion;
	}

	public void setIsPermisoBusquedaTipoIdentificacion(Boolean isPermisoBusquedaTipoIdentificacion) {
		this.isPermisoBusquedaTipoIdentificacion = isPermisoBusquedaTipoIdentificacion;
	}

	public Boolean getIsPermisoReporteTipoIdentificacion() {
		return isPermisoReporteTipoIdentificacion;
	}

	public void setIsPermisoReporteTipoIdentificacion(Boolean isPermisoReporteTipoIdentificacion) {
		this.isPermisoReporteTipoIdentificacion = isPermisoReporteTipoIdentificacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoIdentificacion() {
		return isPermisoPaginacionMedioTipoIdentificacion;
	}

	public void setIsPermisoPaginacionMedioTipoIdentificacion(Boolean isPermisoPaginacionMedioTipoIdentificacion) {
		this.isPermisoPaginacionMedioTipoIdentificacion = isPermisoPaginacionMedioTipoIdentificacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoIdentificacion() {
		return isPermisoPaginacionTodoTipoIdentificacion;
	}

	public void setIsPermisoPaginacionTodoTipoIdentificacion(Boolean isPermisoPaginacionTodoTipoIdentificacion) {
		this.isPermisoPaginacionTodoTipoIdentificacion = isPermisoPaginacionTodoTipoIdentificacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoIdentificacion() {
		return isPermisoPaginacionAltoTipoIdentificacion;
	}

	public void setIsPermisoPaginacionAltoTipoIdentificacion(Boolean isPermisoPaginacionAltoTipoIdentificacion) {
		this.isPermisoPaginacionAltoTipoIdentificacion = isPermisoPaginacionAltoTipoIdentificacion;
	}
	
	public Boolean getIsPermisoCopiarTipoIdentificacion() {
		return isPermisoCopiarTipoIdentificacion;
	}

	public void setIsPermisoCopiarTipoIdentificacion(Boolean isPermisoCopiarTipoIdentificacion) {
		this.isPermisoCopiarTipoIdentificacion = isPermisoCopiarTipoIdentificacion;
	}
	
	public Boolean getIsPermisoVerFormTipoIdentificacion() {
		return isPermisoVerFormTipoIdentificacion;
	}

	public void setIsPermisoVerFormTipoIdentificacion(Boolean isPermisoVerFormTipoIdentificacion) {
		this.isPermisoVerFormTipoIdentificacion = isPermisoVerFormTipoIdentificacion;
	}
	
	public Boolean getIsPermisoDuplicarTipoIdentificacion() {
		return isPermisoDuplicarTipoIdentificacion;
	}

	public void setIsPermisoDuplicarTipoIdentificacion(Boolean isPermisoDuplicarTipoIdentificacion) {
		this.isPermisoDuplicarTipoIdentificacion = isPermisoDuplicarTipoIdentificacion;
	}
	
	public Boolean getIsPermisoOrdenTipoIdentificacion() {
		return isPermisoOrdenTipoIdentificacion;
	}

	public void setIsPermisoOrdenTipoIdentificacion(Boolean isPermisoOrdenTipoIdentificacion) {
		this.isPermisoOrdenTipoIdentificacion = isPermisoOrdenTipoIdentificacion;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoTipoIdentificacion() {
		return isVisibilidadCeldaNuevoTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaNuevoTipoIdentificacion(Boolean isVisibilidadCeldaNuevoTipoIdentificacion) {
		this.isVisibilidadCeldaNuevoTipoIdentificacion = isVisibilidadCeldaNuevoTipoIdentificacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoIdentificacion() {
		return isVisibilidadCeldaDuplicarTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoIdentificacion(Boolean isVisibilidadCeldaDuplicarTipoIdentificacion) {
		this.isVisibilidadCeldaDuplicarTipoIdentificacion = isVisibilidadCeldaDuplicarTipoIdentificacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoIdentificacion() {
		return isVisibilidadCeldaCopiarTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaCopiarTipoIdentificacion(Boolean isVisibilidadCeldaCopiarTipoIdentificacion) {
		this.isVisibilidadCeldaCopiarTipoIdentificacion = isVisibilidadCeldaCopiarTipoIdentificacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoIdentificacion() {
		return isVisibilidadCeldaVerFormTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaVerFormTipoIdentificacion(Boolean isVisibilidadCeldaVerFormTipoIdentificacion) {
		this.isVisibilidadCeldaVerFormTipoIdentificacion = isVisibilidadCeldaVerFormTipoIdentificacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoIdentificacion() {
		return isVisibilidadCeldaOrdenTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaOrdenTipoIdentificacion(Boolean isVisibilidadCeldaOrdenTipoIdentificacion) {
		this.isVisibilidadCeldaOrdenTipoIdentificacion = isVisibilidadCeldaOrdenTipoIdentificacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoIdentificacion() {
		return isVisibilidadCeldaNuevoRelacionesTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoIdentificacion(Boolean isVisibilidadCeldaNuevoRelacionesTipoIdentificacion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion = isVisibilidadCeldaNuevoRelacionesTipoIdentificacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoIdentificacion() {
		return isVisibilidadCeldaModificarTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaModificarTipoIdentificacion(Boolean isVisibilidadCeldaModificarTipoIdentificacion) {
		this.isVisibilidadCeldaModificarTipoIdentificacion = isVisibilidadCeldaModificarTipoIdentificacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoIdentificacion() {
		return isVisibilidadCeldaActualizarTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaActualizarTipoIdentificacion(Boolean isVisibilidadCeldaActualizarTipoIdentificacion) {
		this.isVisibilidadCeldaActualizarTipoIdentificacion = isVisibilidadCeldaActualizarTipoIdentificacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoIdentificacion() {
		return isVisibilidadCeldaEliminarTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaEliminarTipoIdentificacion(Boolean isVisibilidadCeldaEliminarTipoIdentificacion) {
		this.isVisibilidadCeldaEliminarTipoIdentificacion = isVisibilidadCeldaEliminarTipoIdentificacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoIdentificacion() {
		return isVisibilidadCeldaCancelarTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaCancelarTipoIdentificacion(Boolean isVisibilidadCeldaCancelarTipoIdentificacion) {
		this.isVisibilidadCeldaCancelarTipoIdentificacion = isVisibilidadCeldaCancelarTipoIdentificacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoIdentificacion() {
		return isVisibilidadCeldaGuardarTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaGuardarTipoIdentificacion(Boolean isVisibilidadCeldaGuardarTipoIdentificacion) {
		this.isVisibilidadCeldaGuardarTipoIdentificacion = isVisibilidadCeldaGuardarTipoIdentificacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoIdentificacion() {
		return isVisibilidadCeldaGuardarCambiosTipoIdentificacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoIdentificacion(Boolean isVisibilidadCeldaGuardarCambiosTipoIdentificacion) {
		this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion = isVisibilidadCeldaGuardarCambiosTipoIdentificacion;
	}
		
	public TipoIdentificacionSessionBean gettipoidentificacionSessionBean() {
		return this.tipoidentificacionSessionBean;
	}
	
	public void settipoidentificacionSessionBean(TipoIdentificacionSessionBean tipoidentificacionSessionBean) {
		this.tipoidentificacionSessionBean=tipoidentificacionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(TipoIdentificacion tipoidentificacion)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(TipoIdentificacion tipoidentificacion,TipoIdentificacion tipoidentificacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoIdentificacion(tipoidentificacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoidentificacionAux.setId(tipoidentificacion.getId());
		tipoidentificacionAux.setVersionRow(tipoidentificacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoIdentificacion();
		
			int intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoidentificacionValidator.getInvalidValues(this.tipoidentificacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoidentificacionLogic.setDatosCliente(datosCliente);
			tipoidentificacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoidentificacionAux=new  TipoIdentificacion();
				
				tipoidentificacionAux.setIsNew(true);
				tipoidentificacionAux.setIsChanged(true);
				
				tipoidentificacionAux.setTipoIdentificacionOriginal(this.tipoidentificacion);
				
				tipoidentificacionAux.setId(this.tipoidentificacion.getId());	
				tipoidentificacionAux.setVersionRow(this.tipoidentificacion.getVersionRow());	
				tipoidentificacionAux.setcodigo(this.tipoidentificacion.getcodigo());	
				tipoidentificacionAux.setnombre(this.tipoidentificacion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoidentificacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoidentificacionAux,tipoidentificacionLogic.getTipoIdentificacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoidentificacionAux,tipoidentificacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoidentificacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoidentificacionLogic.saveTipoIdentificacions();//WithConnection
						//tipoidentificacionLogic.getSetVersionRowTipoIdentificacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoidentificacion,tipoidentificacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyuges.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradors.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegals.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistas.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoidentificacionLogic.saveTipoIdentificacionRelaciones(tipoidentificacionAux,this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges(),this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors(),this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals(),this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas(),this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tipoidentificacionLogic.getSetVersionRowTipoIdentificacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoidentificacion,tipoidentificacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.setConyuges(new ArrayList<Conyuge>());
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.setCobradors(new ArrayList<Cobrador>());
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(new ArrayList<Accionista>());
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyuges= new ArrayList<Conyuge>();
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradors= new ArrayList<Cobrador>();
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegals= new ArrayList<RepresentanteLegal>();
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistas= new ArrayList<Accionista>();
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setConyuges(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setCobradors(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setRepresentanteLegals(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setSubClientes(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setAccionistas(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setClientes(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoidentificacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoidentificacionAux,tipoidentificacionLogic.getTipoIdentificacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoidentificacionAux,tipoidentificacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoidentificacion,tipoidentificacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoidentificacionAux=new  TipoIdentificacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoidentificacionSessionBean.getEsGuardarRelacionado() && this.tipoidentificacion.getId()>=0)) {
						
					tipoidentificacionAux.setIsNew(false);
				}
				
				tipoidentificacionAux.setIsDeleted(false);
			
				tipoidentificacionAux.setId(this.tipoidentificacion.getId());	
				tipoidentificacionAux.setVersionRow(this.tipoidentificacion.getVersionRow());	
				tipoidentificacionAux.setcodigo(this.tipoidentificacion.getcodigo());	
				tipoidentificacionAux.setnombre(this.tipoidentificacion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoidentificacionAux,tipoidentificacionLogic.getTipoIdentificacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoidentificacionAux,tipoidentificacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoidentificacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoidentificacionLogic.saveTipoIdentificacions();//WithConnection
						//tipoidentificacionLogic.getSetVersionRowTipoIdentificacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoidentificacion,tipoidentificacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyuges.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradors.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegals.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistas.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoidentificacionLogic.saveTipoIdentificacionRelaciones(tipoidentificacionAux,this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges(),this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors(),this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals(),this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas(),this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tipoidentificacionLogic.getSetVersionRowTipoIdentificacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoidentificacion,tipoidentificacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.setConyuges(new ArrayList<Conyuge>());
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.setCobradors(new ArrayList<Cobrador>());
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(new ArrayList<Accionista>());
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyuges= new ArrayList<Conyuge>();
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradors= new ArrayList<Cobrador>();
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegals= new ArrayList<RepresentanteLegal>();
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistas= new ArrayList<Accionista>();
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setConyuges(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setCobradors(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setRepresentanteLegals(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setSubClientes(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setAccionistas(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setClientes(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoidentificacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoidentificacionAux,tipoidentificacionLogic.getTipoIdentificacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoidentificacionAux,tipoidentificacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoidentificacion,tipoidentificacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoidentificacionAux=new  TipoIdentificacion();
				
				tipoidentificacionAux.setIsNew(false);
				tipoidentificacionAux.setIsChanged(false);
				
				tipoidentificacionAux.setIsDeleted(true);
				
				tipoidentificacionAux.setId(this.tipoidentificacion.getId());	
				tipoidentificacionAux.setVersionRow(this.tipoidentificacion.getVersionRow());	
				tipoidentificacionAux.setcodigo(this.tipoidentificacion.getcodigo());	
				tipoidentificacionAux.setnombre(this.tipoidentificacion.getnombre());	
				
				if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoidentificacionAux.getId()>=0) {	
						this.tipoidentificacionsEliminados.add(tipoidentificacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoidentificacionAux,tipoidentificacionLogic.getTipoIdentificacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoidentificacionAux,tipoidentificacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoidentificacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoidentificacionLogic.saveTipoIdentificacions();//WithConnection
						//tipoidentificacionLogic.getSetVersionRowTipoIdentificacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyuges.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradors.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegals.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalsEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistas.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoidentificacionLogic.saveTipoIdentificacionRelaciones(tipoidentificacionAux,this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges(),this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors(),this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals(),this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas(),this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tipoidentificacionLogic.getSetVersionRowTipoIdentificacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.setConyuges(new ArrayList<Conyuge>());
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.setCobradors(new ArrayList<Cobrador>());
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.setRepresentanteLegals(new ArrayList<RepresentanteLegal>());
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(new ArrayList<Accionista>());
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyuges= new ArrayList<Conyuge>();
							this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradors= new ArrayList<Cobrador>();
							this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegals= new ArrayList<RepresentanteLegal>();
							this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistas= new ArrayList<Accionista>();
							this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setConyuges(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setCobradors(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setRepresentanteLegals(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setSubClientes(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setAccionistas(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setClientes(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoidentificacionAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoidentificacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoidentificacionAux,tipoidentificacionLogic.getTipoIdentificacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoidentificacionAux,tipoidentificacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getTipoIdentificacions().addAll(this.tipoidentificacionsEliminados);
					
					tipoidentificacionLogic.saveTipoIdentificacions();//WithConnection
					//tipoidentificacionLogic.getSetVersionRowTipoIdentificacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoidentificacionsEliminados= new ArrayList<TipoIdentificacion>();		
			}
			
			if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Identificacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoidentificacion=tipoidentificacionAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessTipoIdentificacion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoIdentificacion tipoidentificacionLocal) throws Exception {
		
		if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoidentificacionLocal.setConyuges(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges());
				tipoidentificacionLocal.setCobradors(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors());
				tipoidentificacionLocal.setRepresentanteLegals(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals());
				tipoidentificacionLocal.setSubClientes(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
				tipoidentificacionLocal.setAccionistas(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());
				tipoidentificacionLocal.setClientes(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				tipoidentificacionLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
			
			} else {
			
				tipoidentificacionLocal.setConyuges(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyuges);
				tipoidentificacionLocal.setCobradors(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradors);
				tipoidentificacionLocal.setRepresentanteLegals(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegals);
				tipoidentificacionLocal.setSubClientes(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclientes);
				tipoidentificacionLocal.setAccionistas(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistas);
				tipoidentificacionLocal.setClientes(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clientes);
				tipoidentificacionLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoIdentificacion tipoidentificacionLocal) throws Exception {	
		if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoIdentificacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoidentificacionValidator.getInvalidValues(this.tipoidentificacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoIdentificacion tipoidentificacion,List<TipoIdentificacion> tipoidentificacions) throws Exception {
		try	{		
			TipoIdentificacionConstantesFunciones.actualizarLista(tipoidentificacion,tipoidentificacions,this.tipoidentificacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoIdentificacion tipoidentificacion,List<TipoIdentificacion> tipoidentificacions) throws Exception {
		try	{			
			TipoIdentificacionConstantesFunciones.actualizarSelectedLista(tipoidentificacion,tipoidentificacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoIdentificacion> tipoidentificacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoidentificacionsLocal=this.tipoidentificacionLogic.getTipoIdentificacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoidentificacionsLocal=this.tipoidentificacions;
			}
			//ARCHITECTURE
		
			for(TipoIdentificacion tipoidentificacionLocal:tipoidentificacionsLocal) {
				if(this.permiteMantenimiento(tipoidentificacionLocal) && tipoidentificacionLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+TipoIdentificacionConstantesFunciones.getTipoIdentificacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoIdentificacionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIdentificacion.jLabelcodigoTipoIdentificacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoIdentificacionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIdentificacion.jLabelnombreTipoIdentificacion,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIdentificacion.jLabelcodigoTipoIdentificacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIdentificacion.jLabelnombreTipoIdentificacion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Conyuge")) {
			if(this.tipoidentificacion==null) {
				this.tipoidentificacion= new TipoIdentificacion();
			}

			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIdentificacion
				this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);

				this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.getconyuge().setTipoIdentificacion(this.tipoidentificacion);
			}

			return;
		}
		 else  if(sTipo.equals("Cobrador")) {
			if(this.tipoidentificacion==null) {
				this.tipoidentificacion= new TipoIdentificacion();
			}

			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIdentificacion
				this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);

				this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.getcobrador().setTipoIdentificacion(this.tipoidentificacion);
			}

			return;
		}
		 else  if(sTipo.equals("RepresentanteLegal")) {
			if(this.tipoidentificacion==null) {
				this.tipoidentificacion= new TipoIdentificacion();
			}

			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIdentificacion
				this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);

				this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.getrepresentantelegal().setTipoIdentificacion(this.tipoidentificacion);
			}

			return;
		}
		 else  if(sTipo.equals("SubCliente")) {
			if(this.tipoidentificacion==null) {
				this.tipoidentificacion= new TipoIdentificacion();
			}

			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIdentificacion
				this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);

				this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.getsubcliente().setTipoIdentificacion(this.tipoidentificacion);
			}

			return;
		}
		 else  if(sTipo.equals("Accionista")) {
			if(this.tipoidentificacion==null) {
				this.tipoidentificacion= new TipoIdentificacion();
			}

			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIdentificacion
				this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);

				this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.getaccionista().setTipoIdentificacion(this.tipoidentificacion);
			}

			return;
		}
		 else  if(sTipo.equals("Cliente")) {
			if(this.tipoidentificacion==null) {
				this.tipoidentificacion= new TipoIdentificacion();
			}

			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIdentificacion
				this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);

				this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.getcliente().setTipoIdentificacion(this.tipoidentificacion);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.tipoidentificacion==null) {
				this.tipoidentificacion= new TipoIdentificacion();
			}

			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIdentificacion
				this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);

				this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setTipoIdentificacion(this.tipoidentificacion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoIdentificacion--;	
		
		
		this.tipoidentificacionAux=new TipoIdentificacion();
		
		this.tipoidentificacionAux.setId(this.iIdNuevoTipoIdentificacion);
		this.tipoidentificacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoidentificacionLogic.getTipoIdentificacions().add(this.tipoidentificacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoidentificacions.add(this.tipoidentificacionAux);
		}
		//ARCHITECTURE
		
		this.tipoidentificacion=this.tipoidentificacionAux;
		
		if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoIdentificacion(this.tipoidentificacion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIdentificacion(this.tipoidentificacion);
		}
				
		//this.setDefaultControlesTipoIdentificacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoIdentificacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoIdentificacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIdentificacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIdentificacion(this.tipoidentificacionBean,this.tipoidentificacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoIdentificacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
			classes=TipoIdentificacionConstantesFunciones.getClassesRelationshipsOfTipoIdentificacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoidentificacionReturnGeneral=tipoidentificacionLogic.procesarEventosTipoIdentificacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoidentificacionLogic.getTipoIdentificacions(),this.tipoidentificacion,this.tipoidentificacionParameterGeneral,this.isEsNuevoTipoIdentificacion,classes);//this.tipoidentificacionLogic.getTipoIdentificacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoIdentificacion(this.tipoidentificacionReturnGeneral,this.tipoidentificacionBean,false);
		
		if(this.tipoidentificacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIdentificacion(this.tipoidentificacionReturnGeneral.getTipoIdentificacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoIdentificacion(this.tipoidentificacionReturnGeneral.getTipoIdentificacion());
		}
		
		if(this.tipoidentificacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoIdentificacion(this.tipoidentificacionReturnGeneral.getTipoIdentificacion(),classes);//this.tipoidentificacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoIdentificacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoIdentificacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.RecargarFormTipoIdentificacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoIdentificacion(false);
						
			if(tipoidentificacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeSessionBean.getEsGuardarRelacionado() && ConyugeJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConyugeActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorSessionBean.getEsGuardarRelacionado() && CobradorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCobradorActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.getEsGuardarRelacionado() && RepresentanteLegalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRepresentanteLegalActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaSessionBean.getEsGuardarRelacionado() && AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAccionistaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIdentificacion();
			}
			
			this.actualizarVisualTableDatosTipoIdentificacion();
			
			this.jTableDatosTipoIdentificacion.setRowSelectionInterval(this.getIndiceNuevoTipoIdentificacion(), this.getIndiceNuevoTipoIdentificacion());
			
			this.seleccionarFilaTablaTipoIdentificacionActual();
						
			this.actualizarEstadoCeldasBotonesTipoIdentificacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoIdentificacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldcodigoTipoIdentificacion.setEnabled(isHabilitar && this.tipoidentificacionConstantesFunciones.activarcodigoTipoIdentificacion);
		this.jInternalFrameDetalleFormTipoIdentificacion.jTextAreanombreTipoIdentificacion.setEnabled(isHabilitar && this.tipoidentificacionConstantesFunciones.activarnombreTipoIdentificacion);	
		
	};
	
	public void setDefaultControlesTipoIdentificacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoIdentificacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoidentificacionSessionBean.setConGuardarRelaciones(true);			
			this.tipoidentificacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoidentificacionSessionBean.setConGuardarRelaciones(false);			
			this.tipoidentificacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoIdentificacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
				if(tipoidentificacionAux.getId().equals(this.iIdNuevoTipoIdentificacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacions) {
				if(tipoidentificacionAux.getId().equals(this.iIdNuevoTipoIdentificacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualTipoIdentificacion(TipoIdentificacion tipoidentificacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
				if(tipoidentificacionAux.getId().equals(tipoidentificacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacions) {
				if(tipoidentificacionAux.getId().equals(tipoidentificacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalTipoIdentificacion(TipoIdentificacion tipoidentificacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
				if(tipoidentificacionAux.getTipoIdentificacionOriginal().getId().equals(tipoidentificacionOriginal.getId())) {
					existe=true;
					tipoidentificacionOriginal.setId(tipoidentificacionAux.getId());
					tipoidentificacionOriginal.setVersionRow(tipoidentificacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacions) {
				if(tipoidentificacionAux.getTipoIdentificacionOriginal().getId().equals(tipoidentificacionOriginal.getId())) {
					existe=true;
					tipoidentificacionOriginal.setId(tipoidentificacionAux.getId());
					tipoidentificacionOriginal.setVersionRow(tipoidentificacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoIdentificacion(Boolean esParaCancelar) throws Exception {
		tipoidentificacionsAux=new ArrayList<TipoIdentificacion>();
		tipoidentificacionAux=new TipoIdentificacion();
		
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
					if(tipoidentificacionAux.getId()<0) {
						tipoidentificacionsAux.add(tipoidentificacionAux);
					}		
				}
				this.iIdNuevoTipoIdentificacion=0L;
				this.tipoidentificacionLogic.getTipoIdentificacions().removeAll(tipoidentificacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacions) {
					if(tipoidentificacionAux.getId()<0) {
						tipoidentificacionsAux.add(tipoidentificacionAux);
					}		
				}
				this.iIdNuevoTipoIdentificacion=0L;
				this.tipoidentificacions.removeAll(tipoidentificacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoIdentificacion 
					&& this.tipoidentificacionLogic.getTipoIdentificacions().size()>0
					) {
					tipoidentificacionAux=this.tipoidentificacionLogic.getTipoIdentificacions().get(this.tipoidentificacionLogic.getTipoIdentificacions().size() - 1);
				
					if(tipoidentificacionAux.getId()<0) {
						this.tipoidentificacionLogic.getTipoIdentificacions().remove(tipoidentificacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoIdentificacion && this.tipoidentificacions.size()>0) {
					tipoidentificacionAux=this.tipoidentificacions.get(this.tipoidentificacions.size() - 1);
				
					if(tipoidentificacionAux.getId()<0) {
						this.tipoidentificacions.remove(tipoidentificacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoIdentificacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoidentificacion.getId()<0) {
				this.tipoidentificacionLogic.getTipoIdentificacions().remove(this.tipoidentificacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoidentificacion.getId()<0) {
				this.tipoidentificacions.remove(this.tipoidentificacion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoIdentificacion(List<TipoIdentificacion> tipoidentificacionsAux) throws Exception {
		TipoIdentificacionConstantesFunciones.setEstadosInicialesTipoIdentificacion(tipoidentificacionsAux);
	}
	
	public void setEstadosInicialesTipoIdentificacion(TipoIdentificacion tipoidentificacionAux) throws Exception {
		TipoIdentificacionConstantesFunciones.setEstadosInicialesTipoIdentificacion(tipoidentificacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoIdentificacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoIdentificacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoIdentificacionActual()) {
				if(!this.isEsNuevoTipoIdentificacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoIdentificacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoIdentificacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoIdentificacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Identificacion ?", "MANTENIMIENTO DE Tipo Identificacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoIdentificacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoIdentificacion tipoidentificacion) throws Exception {
		TipoIdentificacionConstantesFunciones.seleccionarAsignar(this.tipoidentificacion,tipoidentificacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoIdentificacion=this.isPermisoActualizarOriginalTipoIdentificacion;
			
			
			this.seleccionarAsignar(tipoidentificacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoIdentificacionConstantesFunciones.quitarEspaciosTipoIdentificacion(this.tipoidentificacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoIdentificacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoidentificacionSessionBean.setsFuncionBusquedaRapida(this.tipoidentificacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoIdentificacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoIdentificacion(esParaCancelar);				
				this.cancelarNuevoTipoIdentificacion(esParaCancelar);								
			}
			
			this.tipoidentificacion=new TipoIdentificacion();
			
			this.inicializarTipoIdentificacion();
			
			this.actualizarEstadoCeldasBotonesTipoIdentificacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoIdentificacion() throws Exception {
		try {
			TipoIdentificacionConstantesFunciones.inicializarTipoIdentificacion(this.tipoidentificacion);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoidentificacionLogic.getTipoIdentificacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoIdentificacions(String sAccionBusqueda,List<TipoIdentificacion> tipoidentificacionsParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="TipoIdentificacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoIdentificacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoIdentificacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoIdentificacion"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Tipo Identificaciones");		
		parameters.put("busquedapor", TipoIdentificacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Conyuge.class));
			classes.add(new Classe(Cobrador.class));
			classes.add(new Classe(RepresentanteLegal.class));
			classes.add(new Classe(SubCliente.class));
			classes.add(new Classe(Accionista.class));
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoIdentificacionLogic tipoidentificacionLogicAuxiliar=new TipoIdentificacionLogic();
					tipoidentificacionLogicAuxiliar.setDatosCliente(tipoidentificacionLogic.getDatosCliente());				
					tipoidentificacionLogicAuxiliar.setTipoIdentificacions(tipoidentificacionsParaReportes);
					
					tipoidentificacionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoIdentificacionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoidentificacionsParaReportes=tipoidentificacionLogicAuxiliar.getTipoIdentificacions();
					
					//tipoidentificacionLogic.getNewConnexionToDeep();
					
					//for (TipoIdentificacion tipoidentificacion:tipoidentificacionsParaReportes) {
					//	tipoidentificacionLogic.deepLoad(tipoidentificacion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoidentificacionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoidentificacionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileConyuge = AuxiliarReportes.class.getResourceAsStream("ConyugeDetalleRelacionesDesign.jasper");
			parameters.put("subreport_conyuge", reportFileConyuge);

			InputStream reportFileCobrador = AuxiliarReportes.class.getResourceAsStream("CobradorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cobrador", reportFileCobrador);

			InputStream reportFileRepresentanteLegal = AuxiliarReportes.class.getResourceAsStream("RepresentanteLegalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_representantelegal", reportFileRepresentanteLegal);

			InputStream reportFileSubCliente = AuxiliarReportes.class.getResourceAsStream("SubClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subcliente", reportFileSubCliente);

			InputStream reportFileAccionista = AuxiliarReportes.class.getResourceAsStream("AccionistaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_accionista", reportFileAccionista);

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoIdentificacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoIdentificacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoIdentificacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoIdentificacion=new JRBeanArrayDataSource(TipoIdentificacionJInternalFrame.TraerTipoIdentificacionBeans(tipoidentificacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoIdentificacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoIdentificacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoIdentificacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoIdentificacionBean.TraerTipoIdentificacionBeans(tipoidentificacionsParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteTipoIdentificacions(sAccionBusqueda,sTipoArchivoReporte,tipoidentificacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoIdentificacions(sAccionBusqueda,sTipoArchivoReporte,tipoidentificacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoIdentificacionActionPerformed(null);
					//this.generarExcelReporteTipoIdentificacions(sAccionBusqueda,sTipoArchivoReporte,tipoidentificacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoIdentificacions(sAccionBusqueda,sTipoArchivoReporte,tipoidentificacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoIdentificacions(sAccionBusqueda,sTipoArchivoReporte,tipoidentificacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoIdentificacions(sAccionBusqueda,sTipoArchivoReporte,tipoidentificacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoIdentificacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIdentificacion> tipoidentificacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoidentificacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIdentificacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIdentificacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoIdentificacion tipoidentificacion : tipoidentificacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoIdentificacionConstantesFunciones.generarExcelReporteDataTipoIdentificacion("NORMAL",row,workbook,tipoidentificacion,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoIdentificacion(String sTipo,Row row,Workbook workbook) {
		
		TipoIdentificacionConstantesFunciones.generarExcelReporteHeaderTipoIdentificacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoIdentificacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIdentificacion> tipoidentificacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoidentificacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIdentificacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoIdentificacion tipoidentificacion : tipoidentificacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoIdentificacionConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIdentificacionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIdentificacionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoidentificacion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIdentificacionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIdentificacionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoidentificacion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoIdentificacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIdentificacion> tipoidentificacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoIdentificacion> tipoidentificacionsRespaldo=null;
		
		classes=TipoIdentificacionConstantesFunciones.getClassesRelationshipsOfTipoIdentificacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoidentificacionLogic.setDatosCliente(this.datosCliente);
		this.tipoidentificacionLogic.setDatosDeep(this.datosDeep);
		this.tipoidentificacionLogic.setIsConDeep(true);
		
		tipoidentificacionsRespaldo=this.tipoidentificacionLogic.getTipoIdentificacions();
		
		this.tipoidentificacionLogic.setTipoIdentificacions(tipoidentificacionsParaReportes);	
		this.tipoidentificacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoidentificacionsParaReportes=this.tipoidentificacionLogic.getTipoIdentificacions();
		this.tipoidentificacionLogic.setTipoIdentificacions(tipoidentificacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoidentificacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIdentificacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIdentificacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoIdentificacion tipoidentificacion : tipoidentificacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoIdentificacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoIdentificacionConstantesFunciones.generarExcelReporteDataTipoIdentificacion("NORMAL",row,workbook,tipoidentificacion,cellStyleDataAux);
		
			
			


				//Conyuge
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ConyugeConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoidentificacion.getConyuges()!=null && tipoidentificacion.getConyuges().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ConyugeConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ConyugeConstantesFunciones.generarExcelReporteHeaderConyuge("RELACIONADO",row,workbook);
				}

				if(tipoidentificacion.getConyuges()!=null) {
					i2=0;
					for(Conyuge conyuge : tipoidentificacion.getConyuges()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ConyugeConstantesFunciones.generarExcelReporteDataConyuge("RELACIONADO",row,workbook,conyuge,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cobrador
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CobradorConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoidentificacion.getCobradors()!=null && tipoidentificacion.getCobradors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CobradorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CobradorConstantesFunciones.generarExcelReporteHeaderCobrador("RELACIONADO",row,workbook);
				}

				if(tipoidentificacion.getCobradors()!=null) {
					i2=0;
					for(Cobrador cobrador : tipoidentificacion.getCobradors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CobradorConstantesFunciones.generarExcelReporteDataCobrador("RELACIONADO",row,workbook,cobrador,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//RepresentanteLegal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoidentificacion.getRepresentanteLegals()!=null && tipoidentificacion.getRepresentanteLegals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RepresentanteLegalConstantesFunciones.generarExcelReporteHeaderRepresentanteLegal("RELACIONADO",row,workbook);
				}

				if(tipoidentificacion.getRepresentanteLegals()!=null) {
					i2=0;
					for(RepresentanteLegal representantelegal : tipoidentificacion.getRepresentanteLegals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RepresentanteLegalConstantesFunciones.generarExcelReporteDataRepresentanteLegal("RELACIONADO",row,workbook,representantelegal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SubCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoidentificacion.getSubClientes()!=null && tipoidentificacion.getSubClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubClienteConstantesFunciones.generarExcelReporteHeaderSubCliente("RELACIONADO",row,workbook);
				}

				if(tipoidentificacion.getSubClientes()!=null) {
					i2=0;
					for(SubCliente subcliente : tipoidentificacion.getSubClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SubClienteConstantesFunciones.generarExcelReporteDataSubCliente("RELACIONADO",row,workbook,subcliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Accionista
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AccionistaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoidentificacion.getAccionistas()!=null && tipoidentificacion.getAccionistas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AccionistaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AccionistaConstantesFunciones.generarExcelReporteHeaderAccionista("RELACIONADO",row,workbook);
				}

				if(tipoidentificacion.getAccionistas()!=null) {
					i2=0;
					for(Accionista accionista : tipoidentificacion.getAccionistas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AccionistaConstantesFunciones.generarExcelReporteDataAccionista("RELACIONADO",row,workbook,accionista,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoidentificacion.getClientes()!=null && tipoidentificacion.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(tipoidentificacion.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : tipoidentificacion.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoidentificacion.getParametroCarteraDefectos()!=null && tipoidentificacion.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(tipoidentificacion.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : tipoidentificacion.getParametroCarteraDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCarteraDefectoConstantesFunciones.generarExcelReporteDataParametroCarteraDefecto("RELACIONADO",row,workbook,parametrocarteradefecto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoIdentificacionConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoIdentificacion() throws Exception {		
		this.startProcessTipoIdentificacion(true);
	}
	
	public void startProcessTipoIdentificacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoIdentificacion, this.jScrollPanelDatosTipoIdentificacion,this.jPanelPaginacionTipoIdentificacion, this.jScrollPanelDatosEdicionTipoIdentificacion, this.jPanelAccionesTipoIdentificacion,this.jPanelAccionesFormularioTipoIdentificacion,this.jmenuBarTipoIdentificacion,this.jmenuBarDetalleTipoIdentificacion,this.jTtoolBarTipoIdentificacion,this.jTtoolBarDetalleTipoIdentificacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIdentificacion=null; 
		
		final JPanel jPanelParametrosReportesTipoIdentificacion=this.jPanelParametrosReportesTipoIdentificacion;
		//final JScrollPane jScrollPanelDatosTipoIdentificacion=this.jScrollPanelDatosTipoIdentificacion;
		final JTable jTableDatosTipoIdentificacion=this.jTableDatosTipoIdentificacion;		
		final JPanel jPanelPaginacionTipoIdentificacion=this.jPanelPaginacionTipoIdentificacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoIdentificacion=this.jScrollPanelDatosEdicionTipoIdentificacion;
		final JPanel jPanelAccionesTipoIdentificacion=this.jPanelAccionesTipoIdentificacion;
		
		JPanel jPanelCamposAuxiliarTipoIdentificacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoIdentificacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			jPanelCamposAuxiliarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jPanelCamposTipoIdentificacion;
			jPanelAccionesFormularioAuxiliarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jPanelAccionesFormularioTipoIdentificacion;
		}
		
		final JPanel jPanelCamposTipoIdentificacion=jPanelCamposAuxiliarTipoIdentificacion;
		final JPanel jPanelAccionesFormularioTipoIdentificacion=jPanelAccionesFormularioAuxiliarTipoIdentificacion;
		
		
		final JMenuBar jmenuBarTipoIdentificacion=this.jmenuBarTipoIdentificacion;
		final JToolBar jTtoolBarTipoIdentificacion=this.jTtoolBarTipoIdentificacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoIdentificacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIdentificacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			jmenuBarDetalleAuxiliarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jmenuBarDetalleTipoIdentificacion;
			jTtoolBarDetalleAuxiliarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jTtoolBarDetalleTipoIdentificacion;
		}
		
		final JMenuBar jmenuBarDetalleTipoIdentificacion=jmenuBarDetalleAuxiliarTipoIdentificacion;
		final JToolBar jTtoolBarDetalleTipoIdentificacion=jTtoolBarDetalleAuxiliarTipoIdentificacion;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIdentificacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIdentificacion;
			processRunnable.jTableDatos=jTableDatosTipoIdentificacion;
			processRunnable.jPanelCampos=jPanelCamposTipoIdentificacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIdentificacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIdentificacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIdentificacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIdentificacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIdentificacion;
			processRunnable.jTtoolBar=jTtoolBarTipoIdentificacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIdentificacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoIdentificacion ,jPanelParametrosReportesTipoIdentificacion,jTableDatosTipoIdentificacion, /*jScrollPanelDatosTipoIdentificacion,*/jPanelCamposTipoIdentificacion,jPanelPaginacionTipoIdentificacion, /*jScrollPanelDatosEdicionTipoIdentificacion,*/ jPanelAccionesTipoIdentificacion,jPanelAccionesFormularioTipoIdentificacion,jmenuBarTipoIdentificacion,jmenuBarDetalleTipoIdentificacion,jTtoolBarTipoIdentificacion,jTtoolBarDetalleTipoIdentificacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoIdentificacion, jScrollPanelDatosTipoIdentificacion,jPanelPaginacionTipoIdentificacion, jScrollPanelDatosEdicionTipoIdentificacion, jPanelAccionesTipoIdentificacion,jPanelAccionesFormularioTipoIdentificacion,jmenuBarTipoIdentificacion,jmenuBarDetalleTipoIdentificacion,jTtoolBarTipoIdentificacion,jTtoolBarDetalleTipoIdentificacion);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessTipoIdentificacion() {// throws Exception 
		this.finishProcessTipoIdentificacion(true);
	}
	
	public void finishProcessTipoIdentificacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoIdentificacion, this.jScrollPanelDatosTipoIdentificacion,this.jPanelPaginacionTipoIdentificacion, this.jScrollPanelDatosEdicionTipoIdentificacion, this.jPanelAccionesTipoIdentificacion,this.jPanelAccionesFormularioTipoIdentificacion,this.jmenuBarTipoIdentificacion,this.jmenuBarDetalleTipoIdentificacion,this.jTtoolBarTipoIdentificacion,this.jTtoolBarDetalleTipoIdentificacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIdentificacion=null; 
		
		final JPanel jPanelParametrosReportesTipoIdentificacion=this.jPanelParametrosReportesTipoIdentificacion;
		//final JScrollPane jScrollPanelDatosTipoIdentificacion=this.jScrollPanelDatosTipoIdentificacion;
		final JTable jTableDatosTipoIdentificacion=this.jTableDatosTipoIdentificacion;		
		final JPanel jPanelPaginacionTipoIdentificacion=this.jPanelPaginacionTipoIdentificacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoIdentificacion=this.jScrollPanelDatosEdicionTipoIdentificacion;
		final JPanel jPanelAccionesTipoIdentificacion=this.jPanelAccionesTipoIdentificacion;
		
		JPanel jPanelCamposAuxiliarTipoIdentificacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoIdentificacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			jPanelCamposAuxiliarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jPanelCamposTipoIdentificacion;
			jPanelAccionesFormularioAuxiliarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jPanelAccionesFormularioTipoIdentificacion;
		}
		
		final JPanel jPanelCamposTipoIdentificacion=jPanelCamposAuxiliarTipoIdentificacion;
		final JPanel jPanelAccionesFormularioTipoIdentificacion=jPanelAccionesFormularioAuxiliarTipoIdentificacion;
		
		
		final JMenuBar jmenuBarTipoIdentificacion=this.jmenuBarTipoIdentificacion;		
		final JToolBar jTtoolBarTipoIdentificacion=this.jTtoolBarTipoIdentificacion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoIdentificacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIdentificacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			jmenuBarDetalleAuxiliarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jmenuBarDetalleTipoIdentificacion;
			jTtoolBarDetalleAuxiliarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jTtoolBarDetalleTipoIdentificacion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoIdentificacion=jmenuBarDetalleAuxiliarTipoIdentificacion;
		final JToolBar jTtoolBarDetalleTipoIdentificacion=jTtoolBarDetalleAuxiliarTipoIdentificacion;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIdentificacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIdentificacion;
			processRunnable.jTableDatos=jTableDatosTipoIdentificacion;
			processRunnable.jPanelCampos=jPanelCamposTipoIdentificacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIdentificacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIdentificacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIdentificacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIdentificacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIdentificacion;
			processRunnable.jTtoolBar=jTtoolBarTipoIdentificacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIdentificacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoIdentificacion ,jPanelParametrosReportesTipoIdentificacion, jTableDatosTipoIdentificacion,/*jScrollPanelDatosTipoIdentificacion,*/jPanelCamposTipoIdentificacion,jPanelPaginacionTipoIdentificacion, /*jScrollPanelDatosEdicionTipoIdentificacion,*/ jPanelAccionesTipoIdentificacion,jPanelAccionesFormularioTipoIdentificacion,jmenuBarTipoIdentificacion,jmenuBarDetalleTipoIdentificacion,jTtoolBarTipoIdentificacion,jTtoolBarDetalleTipoIdentificacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoIdentificacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoIdentificacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoIdentificacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoIdentificacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoIdentificacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoIdentificacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoIdentificacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoIdentificacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoIdentificacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoidentificacionConstantesFunciones.getsFinalQueryTipoIdentificacion();
		String  finalQueryPaginacionTodos=this.tipoidentificacionConstantesFunciones.getsFinalQueryTipoIdentificacion();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesNoTipoIdentificacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoidentificacionsEliminados= new ArrayList<TipoIdentificacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoIdentificacion();
		
				///*TipoIdentificacionSessionBean*/this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			
			if(this.tipoidentificacionSessionBean==null) {
				this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=TipoIdentificacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoIdentificacionConstantesFunciones.getClassesForeignKeysOfTipoIdentificacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoidentificacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoidentificacionsAux= new ArrayList<TipoIdentificacion>();
			
				
			tipoidentificacionLogic.setDatosCliente(this.datosCliente);
			tipoidentificacionLogic.setDatosDeep(this.datosDeep);
			tipoidentificacionLogic.setIsConDeep(true);
			
			
			tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoidentificacionLogic.getTodosTipoIdentificacions(finalQueryGlobal,pagination);
					
					//tipoidentificacionLogic.getTodosTipoIdentificacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoidentificacionLogic.getTipoIdentificacions()==null|| tipoidentificacionLogic.getTipoIdentificacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoidentificacionsAux= new ArrayList<TipoIdentificacion>();
							tipoidentificacionsAux.addAll(tipoidentificacionLogic.getTipoIdentificacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoidentificacionsAux= new ArrayList<TipoIdentificacion>();
							tipoidentificacionsAux.addAll(tipoidentificacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoidentificacionLogic.getTodosTipoIdentificacions(finalQueryGlobal+"",this.pagination);												
							
							//tipoidentificacionLogic.getTodosTipoIdentificacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoIdentificacions("Todos",tipoidentificacionLogic.getTipoIdentificacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoidentificacionLogic.setTipoIdentificacions(new ArrayList<TipoIdentificacion>());					
							tipoidentificacionLogic.getTipoIdentificacions().addAll(tipoidentificacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoidentificacions=new ArrayList<TipoIdentificacion>();
							tipoidentificacions.addAll(tipoidentificacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoIdentificacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoIdentificacion=this.idActual;
				
				} else if(this.idTipoIdentificacionActual!=null && this.idTipoIdentificacionActual!=0L) {
					idTipoIdentificacion=idTipoIdentificacionActual;
				}
				
					
				this.sDetalleReporte=TipoIdentificacionConstantesFunciones.getDetalleIndicePorId(idTipoIdentificacion);
				
				this.tipoidentificacions=new ArrayList<TipoIdentificacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoidentificacionLogic.getEntity(idTipoIdentificacion);
					
					//tipoidentificacionLogic.getEntityWithConnection(idTipoIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.setTipoIdentificacions(new ArrayList<TipoIdentificacion>());
					tipoidentificacionLogic.getTipoIdentificacions().add(tipoidentificacionLogic.getTipoIdentificacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoidentificacions=new ArrayList<TipoIdentificacion>();
					this.tipoidentificacions.add(tipoidentificacion);
				}
				
				if(tipoidentificacionLogic.getTipoIdentificacion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoIdentificacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoIdentificacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoidentificacionLogic.getTipoIdentificacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoidentificacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoidentificacionLogic.getTipoIdentificacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoidentificacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoIdentificacion tipoidentificacion) {
		Boolean permite=true;
		
		if(this.tipoidentificacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoIdentificacionConstantesFunciones.getOrderByListaTipoIdentificacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoIdentificacionConstantesFunciones.getOrderByListaTipoIdentificacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIdentificacion tipoidentificacion:tipoidentificacionLogic.getTipoIdentificacions()) {
				if(tipoidentificacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoidentificacionTotales=tipoidentificacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIdentificacion tipoidentificacion:this.tipoidentificacions) {
				if(tipoidentificacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoidentificacionTotales=tipoidentificacion;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.tipoidentificacionAux=new TipoIdentificacion();
			this.tipoidentificacionAux.setsType(Constantes2.S_TOTALES);
			this.tipoidentificacionAux.setIsNew(false);
			this.tipoidentificacionAux.setIsChanged(false);
			this.tipoidentificacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoIdentificacionConstantesFunciones.TotalizarValoresFilaTipoIdentificacion(this.tipoidentificacionLogic.getTipoIdentificacions(),this.tipoidentificacionAux);
				
				this.tipoidentificacionLogic.getTipoIdentificacions().add(this.tipoidentificacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoIdentificacionConstantesFunciones.TotalizarValoresFilaTipoIdentificacion(this.tipoidentificacions,this.tipoidentificacionAux);
				
				this.tipoidentificacions.add(this.tipoidentificacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoidentificacionTotales=new TipoIdentificacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoidentificacionLogic.getTipoIdentificacions().remove(tipoidentificacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoidentificacions.remove(tipoidentificacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoidentificacionTotales=new TipoIdentificacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIdentificacion tipoidentificacion:tipoidentificacionLogic.getTipoIdentificacions()) {
				if(tipoidentificacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoidentificacionTotales=tipoidentificacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIdentificacionConstantesFunciones.TotalizarValoresFilaTipoIdentificacion(this.tipoidentificacionLogic.getTipoIdentificacions(),tipoidentificacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIdentificacion tipoidentificacion:this.tipoidentificacions) {
				if(tipoidentificacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoidentificacionTotales=tipoidentificacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIdentificacionConstantesFunciones.TotalizarValoresFilaTipoIdentificacion(this.tipoidentificacions,tipoidentificacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	
	
	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTipoIdentificacion() {
		this.isPermisoTodoTipoIdentificacion=false;
		this.isPermisoNuevoTipoIdentificacion=false;
		this.isPermisoActualizarTipoIdentificacion=false;
		this.isPermisoActualizarOriginalTipoIdentificacion=false;
		this.isPermisoEliminarTipoIdentificacion=false;
		this.isPermisoGuardarCambiosTipoIdentificacion=false;
		this.isPermisoConsultaTipoIdentificacion=false;
		this.isPermisoBusquedaTipoIdentificacion=false;
		this.isPermisoReporteTipoIdentificacion=false;		
		this.isPermisoOrdenTipoIdentificacion=false;		
		this.isPermisoPaginacionMedioTipoIdentificacion=false;		
		this.isPermisoPaginacionAltoTipoIdentificacion=false;
		this.isPermisoPaginacionTodoTipoIdentificacion=false;
		this.isPermisoCopiarTipoIdentificacion=false;		
		this.isPermisoVerFormTipoIdentificacion=false;		
		this.isPermisoDuplicarTipoIdentificacion=false;		
		this.isPermisoOrdenTipoIdentificacion=false;		
	}
	
	public void setPermisosUsuarioTipoIdentificacion(Boolean isPermiso) {
		this.isPermisoTodoTipoIdentificacion=isPermiso;
		this.isPermisoNuevoTipoIdentificacion=isPermiso;
		this.isPermisoActualizarTipoIdentificacion=isPermiso;
		this.isPermisoActualizarOriginalTipoIdentificacion=isPermiso;
		this.isPermisoEliminarTipoIdentificacion=isPermiso;
		this.isPermisoGuardarCambiosTipoIdentificacion=isPermiso;
		this.isPermisoConsultaTipoIdentificacion=isPermiso;
		this.isPermisoBusquedaTipoIdentificacion=isPermiso;
		this.isPermisoReporteTipoIdentificacion=isPermiso;
		this.isPermisoOrdenTipoIdentificacion=isPermiso;		
		this.isPermisoPaginacionMedioTipoIdentificacion=isPermiso;		
		this.isPermisoPaginacionAltoTipoIdentificacion=isPermiso;		
		this.isPermisoPaginacionTodoTipoIdentificacion=isPermiso;		
		this.isPermisoCopiarTipoIdentificacion=isPermiso;		
		this.isPermisoVerFormTipoIdentificacion=isPermiso;		
		this.isPermisoDuplicarTipoIdentificacion=isPermiso;
		this.isPermisoOrdenTipoIdentificacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoIdentificacion(Boolean isPermiso) {
		//this.isPermisoTodoTipoIdentificacion=isPermiso;
		this.isPermisoNuevoTipoIdentificacion=isPermiso;
		this.isPermisoActualizarTipoIdentificacion=isPermiso;
		this.isPermisoActualizarOriginalTipoIdentificacion=isPermiso;
		this.isPermisoEliminarTipoIdentificacion=isPermiso;
		this.isPermisoGuardarCambiosTipoIdentificacion=isPermiso;
		//this.isPermisoConsultaTipoIdentificacion=isPermiso;
		//this.isPermisoBusquedaTipoIdentificacion=isPermiso;
		//this.isPermisoReporteTipoIdentificacion=isPermiso;
		//this.isPermisoOrdenTipoIdentificacion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoIdentificacion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoIdentificacion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoIdentificacion=isPermiso;		
		//this.isPermisoCopiarTipoIdentificacion=isPermiso;		
		//this.isPermisoDuplicarTipoIdentificacion=isPermiso;
		//this.isPermisoOrdenTipoIdentificacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoIdentificacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ConyugeConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CobradorConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(RepresentanteLegalConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(AccionistaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoIdentificacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosConyuge=false;
		this.isTienePermisosConyuge=this.verificarGetPermisosUsuarioOpcionTipoIdentificacionClaseRelacionada(this.opcionsRelacionadas,ConyugeConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCobrador=false;
		this.isTienePermisosCobrador=this.verificarGetPermisosUsuarioOpcionTipoIdentificacionClaseRelacionada(this.opcionsRelacionadas,CobradorConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosRepresentanteLegal=false;
		this.isTienePermisosRepresentanteLegal=this.verificarGetPermisosUsuarioOpcionTipoIdentificacionClaseRelacionada(this.opcionsRelacionadas,RepresentanteLegalConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSubCliente=false;
		this.isTienePermisosSubCliente=this.verificarGetPermisosUsuarioOpcionTipoIdentificacionClaseRelacionada(this.opcionsRelacionadas,SubClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosAccionista=false;
		this.isTienePermisosAccionista=this.verificarGetPermisosUsuarioOpcionTipoIdentificacionClaseRelacionada(this.opcionsRelacionadas,AccionistaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionTipoIdentificacionClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionTipoIdentificacionClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoIdentificacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoIdentificacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosConyuge=conPermiso;
		this.isTienePermisosCobrador=conPermiso;
		this.isTienePermisosRepresentanteLegal=conPermiso;
		this.isTienePermisosSubCliente=conPermiso;
		this.isTienePermisosAccionista=conPermiso;
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoIdentificacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoIdentificacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoIdentificacionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosConyuge && this.jInternalFrameDetalleFormTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.remove(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCobrador && this.jInternalFrameDetalleFormTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.remove(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosRepresentanteLegal && this.jInternalFrameDetalleFormTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.remove(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSubCliente && this.jInternalFrameDetalleFormTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.remove(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosAccionista && this.jInternalFrameDetalleFormTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.remove(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.remove(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.remove(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoIdentificacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoIdentificacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoIdentificacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoIdentificacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoIdentificacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoIdentificacion=this.isPermisoActualizarTipoIdentificacion;
			this.isPermisoEliminarTipoIdentificacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoIdentificacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoIdentificacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoIdentificacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoIdentificacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoIdentificacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIdentificacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoIdentificacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoIdentificacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoIdentificacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoIdentificacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoIdentificacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoIdentificacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIdentificacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoIdentificacion.setToolTipText(this.jTableDatosTipoIdentificacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoIdentificacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoIdentificacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoIdentificacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(TipoIdentificacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioTipoIdentificacion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosConyuge && this.tipoidentificacionConstantesFunciones.mostrarConyugeTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Conyuge");
			reporte.setsDescripcion("Conyuge");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCobrador && this.tipoidentificacionConstantesFunciones.mostrarCobradorTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cobrador");
			reporte.setsDescripcion("Cobrador");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosRepresentanteLegal && this.tipoidentificacionConstantesFunciones.mostrarRepresentanteLegalTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Representante Legal");
			reporte.setsDescripcion("Representante Legal");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubCliente && this.tipoidentificacionConstantesFunciones.mostrarSubClienteTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sub Cliente");
			reporte.setsDescripcion("Sub Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosAccionista && this.tipoidentificacionConstantesFunciones.mostrarAccionistaTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Accionista");
			reporte.setsDescripcion("Accionista");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCliente && this.tipoidentificacionConstantesFunciones.mostrarClienteTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.tipoidentificacionConstantesFunciones.mostrarParametroCarteraDefectoTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoIdentificacionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoIdentificacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoIdentificacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoIdentificacionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoIdentificacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoIdentificacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoIdentificacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoIdentificacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoIdentificacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIdentificacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoIdentificacion(TipoIdentificacion tipoidentificacion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoIdentificacion(TipoIdentificacion tipoidentificacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoIdentificacion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIdentificacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoIdentificacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoIdentificacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoIdentificacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoIdentificacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoIdentificacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoIdentificacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoIdentificacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoIdentificacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoIdentificacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean(); 
		this.tipoidentificacionConstantesFunciones=new TipoIdentificacionConstantesFunciones(); 
		this.tipoidentificacionBean=new TipoIdentificacion();//(this.tipoidentificacionConstantesFunciones); 		
		this.tipoidentificacionReturnGeneral=new TipoIdentificacionParameterReturnGeneral(); 
		
		this.tipoidentificacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoidentificacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoIdentificacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoIdentificacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoIdentificacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoIdentificacion(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.tipoidentificacionConstantesFunciones=new TipoIdentificacionConstantesFunciones(); 
			this.tipoidentificacionBean=new TipoIdentificacion();//this.tipoidentificacionConstantesFunciones); 			
			this.tipoidentificacionReturnGeneral=new TipoIdentificacionParameterReturnGeneral(); 
		
			TipoIdentificacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Identificacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoidentificacion=new TipoIdentificacion();
			this.tipoidentificacions = new ArrayList<TipoIdentificacion>();
			this.tipoidentificacionsAux = new ArrayList<TipoIdentificacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic=new TipoIdentificacionLogic();
				this.tipoidentificacionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoidentificacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoidentificacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoIdentificacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIdentificacion);	
					}
					
					if(this.jInternalFrameImportacionTipoIdentificacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIdentificacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoIdentificacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoIdentificacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIdentificacion);
				this.jInternalFrameDetalleFormTipoIdentificacion.setVisible(false);
				this.jInternalFrameDetalleFormTipoIdentificacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIdentificacion);
					this.jInternalFrameReporteDinamicoTipoIdentificacion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoIdentificacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoIdentificacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoIdentificacion);
					this.jInternalFrameImportacionTipoIdentificacion.setVisible(false);
					this.jInternalFrameImportacionTipoIdentificacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoIdentificacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoIdentificacion);
					this.jInternalFrameOrderByTipoIdentificacion.setVisible(false);
					this.jInternalFrameOrderByTipoIdentificacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoIdentificacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoIdentificacionConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.tipoidentificacionReturnGeneral=new TipoIdentificacionParameterReturnGeneral();
			
			this.tipoidentificacionParameterGeneral=new TipoIdentificacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoidentificacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(TipoIdentificacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ConyugeConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CobradorConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(RepresentanteLegalConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(AccionistaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIdentificacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoidentificacionSessionBean.getEsGuardarRelacionado(),this.tipoidentificacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIdentificacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoidentificacionSessionBean.getEsGuardarRelacionado(),this.tipoidentificacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoTipoIdentificacion=false;
			this.isVisibilidadCeldaDuplicarTipoIdentificacion=true;
			this.isVisibilidadCeldaCopiarTipoIdentificacion=true;
			this.isVisibilidadCeldaVerFormTipoIdentificacion=true;
			this.isVisibilidadCeldaOrdenTipoIdentificacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
			this.isVisibilidadCeldaModificarTipoIdentificacion=false;
			this.isVisibilidadCeldaActualizarTipoIdentificacion=false;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=false;
			this.isVisibilidadCeldaCancelarTipoIdentificacion=false;
			this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoIdentificacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoIdentificacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoIdentificacion(false);
			
			this.setPermisosUsuarioTipoIdentificacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoidentificacionSessionBean.getEsGuardarRelacionado() && this.tipoidentificacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoIdentificacionClasesRelacionadas();
			}
			
			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoIdentificacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoIdentificacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoIdentificacion();
			}
			
			if(!this.isPermisoBusquedaTipoIdentificacion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoIdentificacion,this.isPermisoPaginacionMedioTipoIdentificacion,this.isPermisoPaginacionTodoTipoIdentificacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoIdentificacionConstantesFunciones.getTiposSeleccionarTipoIdentificacion());
				
				this.tiposColumnasSelect=TipoIdentificacionConstantesFunciones.getTiposSeleccionarTipoIdentificacion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoIdentificacion();				
				//this.tiposRelacionesSelect=TipoIdentificacionConstantesFunciones.getTiposRelacionesTipoIdentificacion(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoIdentificacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoIdentificacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoIdentificacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIdentificacion() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.conyugeLogic=new ConyugeLogic();
			this.cobradorLogic=new CobradorLogic();
			this.representantelegalLogic=new RepresentanteLegalLogic();
			this.subclienteLogic=new SubClienteLogic();
			this.accionistaLogic=new AccionistaLogic();
			this.clienteLogic=new ClienteLogic();
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoidentificacionImplementable= (TipoIdentificacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIdentificacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoidentificacionImplementableHome= (TipoIdentificacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIdentificacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoidentificacions= new ArrayList<TipoIdentificacion>();
			this.tipoidentificacionsEliminados= new ArrayList<TipoIdentificacion>();
						
			this.isEsNuevoTipoIdentificacion=false;
			this.esParaAccionDesdeFormularioTipoIdentificacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoIdentificacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoIdentificacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoIdentificacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoIdentificacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoIdentificacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoIdentificacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoIdentificacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoIdentificacion();
			}
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoIdentificacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoIdentificacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoIdentificacion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ConyugeConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ConyugeConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CobradorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CobradorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(AccionistaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AccionistaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoIdentificacion")) {
				iIndex=this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();	
				
				

				if(sTitle.equals("Accionistas")) {
					if(!AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIdentificacion();

						this.cargarParteTabPanelRelacionadaAccionista(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIdentificacion();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Cobradores")) {
					if(!CobradorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIdentificacion();

						this.cargarParteTabPanelRelacionadaCobrador(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Conyuges")) {
					if(!ConyugeJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIdentificacion();

						this.cargarParteTabPanelRelacionadaConyuge(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIdentificacion();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Representante Legales")) {
					if(!RepresentanteLegalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIdentificacion();

						this.cargarParteTabPanelRelacionadaRepresentanteLegal(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Clientes")) {
					if(!SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIdentificacion();

						this.cargarParteTabPanelRelacionadaSubCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoIdentificacion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAccionista(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIdentificacion.cargarSessionConBeanSwingJInternalFrameAccionista(false,true,iIndex);
		this.jButtonAccionistaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAccionista();

		//this.jTabbedPaneRelacionesTipoIdentificacion.updateUI();
		//this.jTabbedPaneRelacionesTipoIdentificacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIdentificacion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIdentificacion.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesTipoIdentificacion.updateUI();
		//this.jTabbedPaneRelacionesTipoIdentificacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIdentificacion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCobrador(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIdentificacion.cargarSessionConBeanSwingJInternalFrameCobrador(false,true,iIndex);
		this.jButtonCobradorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCobrador();

		//this.jTabbedPaneRelacionesTipoIdentificacion.updateUI();
		//this.jTabbedPaneRelacionesTipoIdentificacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIdentificacion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaConyuge(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIdentificacion.cargarSessionConBeanSwingJInternalFrameConyuge(false,true,iIndex);
		this.jButtonConyugeActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaConyuge();

		//this.jTabbedPaneRelacionesTipoIdentificacion.updateUI();
		//this.jTabbedPaneRelacionesTipoIdentificacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIdentificacion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIdentificacion.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesTipoIdentificacion.updateUI();
		//this.jTabbedPaneRelacionesTipoIdentificacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIdentificacion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaRepresentanteLegal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIdentificacion.cargarSessionConBeanSwingJInternalFrameRepresentanteLegal(false,true,iIndex);
		this.jButtonRepresentanteLegalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRepresentanteLegal();

		//this.jTabbedPaneRelacionesTipoIdentificacion.updateUI();
		//this.jTabbedPaneRelacionesTipoIdentificacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIdentificacion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIdentificacion.cargarSessionConBeanSwingJInternalFrameSubCliente(false,true,iIndex);
		this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubCliente();

		//this.jTabbedPaneRelacionesTipoIdentificacion.updateUI();
		//this.jTabbedPaneRelacionesTipoIdentificacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIdentificacion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Conyuge")) {
				int row=this.jTableDatosTipoIdentificacion.getSelectedRow();
				jButtonConyugeActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cobrador")) {
				int row=this.jTableDatosTipoIdentificacion.getSelectedRow();
				jButtonCobradorActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("RepresentanteLegal")) {
				int row=this.jTableDatosTipoIdentificacion.getSelectedRow();
				jButtonRepresentanteLegalActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubCliente")) {
				int row=this.jTableDatosTipoIdentificacion.getSelectedRow();
				jButtonSubClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Accionista")) {
				int row=this.jTableDatosTipoIdentificacion.getSelectedRow();
				jButtonAccionistaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosTipoIdentificacion.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosTipoIdentificacion.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Conyuge")) {

					if(this.isTienePermisosConyuge && this.tipoidentificacionConstantesFunciones.mostrarConyugeTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Conyuges"+"("+ConyugeConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Conyuges");

						if(tipoidentificacionConstantesFunciones.resaltarConyugeTipoIdentificacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoidentificacionConstantesFunciones.resaltarConyugeTipoIdentificacion);
						}

						jmenuItem.setEnabled(this.tipoidentificacionConstantesFunciones.activarConyugeTipoIdentificacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Conyuge"));

						

						this.jInternalFrameDetalleFormTipoIdentificacion.jmenuDetalleTipoIdentificacion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cobrador")) {

					if(this.isTienePermisosCobrador && this.tipoidentificacionConstantesFunciones.mostrarCobradorTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cobradores"+"("+CobradorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cobradores");

						if(tipoidentificacionConstantesFunciones.resaltarCobradorTipoIdentificacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoidentificacionConstantesFunciones.resaltarCobradorTipoIdentificacion);
						}

						jmenuItem.setEnabled(this.tipoidentificacionConstantesFunciones.activarCobradorTipoIdentificacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cobrador"));

						

						this.jInternalFrameDetalleFormTipoIdentificacion.jmenuDetalleTipoIdentificacion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Representante Legal")) {

					if(this.isTienePermisosRepresentanteLegal && this.tipoidentificacionConstantesFunciones.mostrarRepresentanteLegalTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Representante Legales"+"("+RepresentanteLegalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Representante Legales");

						if(tipoidentificacionConstantesFunciones.resaltarRepresentanteLegalTipoIdentificacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoidentificacionConstantesFunciones.resaltarRepresentanteLegalTipoIdentificacion);
						}

						jmenuItem.setEnabled(this.tipoidentificacionConstantesFunciones.activarRepresentanteLegalTipoIdentificacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RepresentanteLegal"));

						

						this.jInternalFrameDetalleFormTipoIdentificacion.jmenuDetalleTipoIdentificacion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sub Cliente")) {

					if(this.isTienePermisosSubCliente && this.tipoidentificacionConstantesFunciones.mostrarSubClienteTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sub Clientes"+"("+SubClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sub Clientes");

						if(tipoidentificacionConstantesFunciones.resaltarSubClienteTipoIdentificacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoidentificacionConstantesFunciones.resaltarSubClienteTipoIdentificacion);
						}

						jmenuItem.setEnabled(this.tipoidentificacionConstantesFunciones.activarSubClienteTipoIdentificacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubCliente"));

						

						this.jInternalFrameDetalleFormTipoIdentificacion.jmenuDetalleTipoIdentificacion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Accionista")) {

					if(this.isTienePermisosAccionista && this.tipoidentificacionConstantesFunciones.mostrarAccionistaTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Accionistas"+"("+AccionistaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Accionistas");

						if(tipoidentificacionConstantesFunciones.resaltarAccionistaTipoIdentificacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoidentificacionConstantesFunciones.resaltarAccionistaTipoIdentificacion);
						}

						jmenuItem.setEnabled(this.tipoidentificacionConstantesFunciones.activarAccionistaTipoIdentificacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Accionista"));

						

						this.jInternalFrameDetalleFormTipoIdentificacion.jmenuDetalleTipoIdentificacion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.tipoidentificacionConstantesFunciones.mostrarClienteTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(tipoidentificacionConstantesFunciones.resaltarClienteTipoIdentificacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoidentificacionConstantesFunciones.resaltarClienteTipoIdentificacion);
						}

						jmenuItem.setEnabled(this.tipoidentificacionConstantesFunciones.activarClienteTipoIdentificacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormTipoIdentificacion.jmenuDetalleTipoIdentificacion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.tipoidentificacionConstantesFunciones.mostrarParametroCarteraDefectoTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(tipoidentificacionConstantesFunciones.resaltarParametroCarteraDefectoTipoIdentificacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoidentificacionConstantesFunciones.resaltarParametroCarteraDefectoTipoIdentificacion);
						}

						jmenuItem.setEnabled(this.tipoidentificacionConstantesFunciones.activarParametroCarteraDefectoTipoIdentificacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormTipoIdentificacion.jmenuDetalleTipoIdentificacion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoIdentificacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoIdentificacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoIdentificacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoIdentificacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoIdentificacion();
		
		this.cargarCombosFrameForeignKeyTipoIdentificacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoIdentificacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoIdentificacion();
		}
	}
	
	
	
	public void jButtonNuevoTipoIdentificacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			
			if(jTableDatosTipoIdentificacion.getRowCount()>=1) {
				jTableDatosTipoIdentificacion.removeRowSelectionInterval(0, jTableDatosTipoIdentificacion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoIdentificacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoIdentificacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoIdentificacion(true);			
			//this.tipoidentificacion=new TipoIdentificacion();
			//this.tipoidentificacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIdentificacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIdentificacion() ;
			
			if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIdentificacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoidentificacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);				
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoIdentificacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoIdentificacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoIdentificacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoIdentificacion.getSelectedRows().length;			
			}
			
			tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoIdentificacion--;			
				//TipoIdentificacion tipoidentificacionAux= new TipoIdentificacion();			
				//tipoidentificacionAux.setId(this.iIdNuevoTipoIdentificacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoIdentificacion tipoidentificacionOrigen=new TipoIdentificacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoIdentificacion tipoidentificacionOrigen : tipoidentificacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoidentificacionOrigen =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoidentificacionOrigen =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoIdentificacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoidentificacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoIdentificacion(tipoidentificacionOrigen,this.tipoidentificacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoidentificacionLogic.getTipoIdentificacions().add(this.tipoidentificacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoidentificacions.add(this.tipoidentificacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoIdentificacion(false);
				
				this.jTableDatosTipoIdentificacion.setRowSelectionInterval(this.getIndiceNuevoTipoIdentificacion(), this.getIndiceNuevoTipoIdentificacion());
				
				int iLastRow =  this.jTableDatosTipoIdentificacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIdentificacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIdentificacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIdentificacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();									
		
			TipoIdentificacion tipoidentificacionOrigen=new TipoIdentificacion();
			TipoIdentificacion tipoidentificacionDestino=new TipoIdentificacion();
				
			tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoIdentificacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoidentificacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoIdentificacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoidentificacionOrigen =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoidentificacionOrigen =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoidentificacionDestino =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoidentificacionDestino =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoidentificacionOrigen =tipoidentificacionsSeleccionados.get(0);
				tipoidentificacionDestino =tipoidentificacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoIdentificacion(tipoidentificacionOrigen,tipoidentificacionDestino,true,false);
				
				tipoidentificacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoidentificacionDestino,tipoidentificacionLogic.getTipoIdentificacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoidentificacionDestino,tipoidentificacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoIdentificacion(false);
				
				//this.jTableDatosTipoIdentificacion.setRowSelectionInterval(this.getIndiceNuevoTipoIdentificacion(), this.getIndiceNuevoTipoIdentificacion());
				
				int iLastRow =  this.jTableDatosTipoIdentificacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIdentificacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIdentificacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIdentificacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoIdentificacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoIdentificacion.isVisible();
			
			
			this.jPanelParametrosReportesTipoIdentificacion.setVisible(!isVisible);
			this.jPanelPaginacionTipoIdentificacion.setVisible(!isVisible);
			this.jPanelAccionesTipoIdentificacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoIdentificacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoIdentificacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoIdentificacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoIdentificacion();
			
			this.abrirFrameOrderByTipoIdentificacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoIdentificacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoIdentificacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIdentificacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoIdentificacion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoIdentificacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoIdentificacion.setSize(this.jInternalFrameDetalleFormTipoIdentificacion.iWidthFormulario,this.jInternalFrameDetalleFormTipoIdentificacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoIdentificacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoIdentificacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoIdentificacion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoIdentificacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),TipoIdentificacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),TipoIdentificacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),TipoIdentificacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAccionista();
					}

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(CobradorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCobrador();
					}

					if(ConyugeJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaConyuge();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}

					if(RepresentanteLegalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRepresentanteLegal();
					}

					if(SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoIdentificacion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoIdentificacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoIdentificacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoIdentificacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoIdentificacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIdentificacion,false,this);
				} else {
					this.jInternalFrameOrderByTipoIdentificacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIdentificacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoIdentificacion);
				this.jInternalFrameOrderByTipoIdentificacion.setVisible(false);
				this.jInternalFrameOrderByTipoIdentificacion.setSelected(false);
				
				this.jInternalFrameOrderByTipoIdentificacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIdentificacion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoIdentificacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoIdentificacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoIdentificacion==null) {
				
				this.jInternalFrameImportacionTipoIdentificacion=new ImportacionJInternalFrame(TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIdentificacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoIdentificacion);
				this.jInternalFrameImportacionTipoIdentificacion.setVisible(false);
				this.jInternalFrameImportacionTipoIdentificacion.setSelected(false);


				this.jInternalFrameImportacionTipoIdentificacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIdentificacion"));
				this.jInternalFrameImportacionTipoIdentificacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIdentificacion"));
				this.jInternalFrameImportacionTipoIdentificacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIdentificacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoIdentificacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoIdentificacion==null) {
				this.jInternalFrameReporteDinamicoTipoIdentificacion=new ReporteDinamicoJInternalFrame(TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIdentificacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIdentificacion);
				this.jInternalFrameReporteDinamicoTipoIdentificacion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoIdentificacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoIdentificacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIdentificacion"));
				this.jInternalFrameReporteDinamicoTipoIdentificacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIdentificacion"));
				this.jInternalFrameReporteDinamicoTipoIdentificacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIdentificacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIdentificacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAccionista() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCobrador() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.jScrollPanelDatosCobrador.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.jScrollPanelDatosCobrador.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.jScrollPanelDatosCobrador.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.jScrollPanelDatosCobrador.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaConyuge() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.jScrollPanelDatosConyuge.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.jScrollPanelDatosConyuge.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.jScrollPanelDatosConyuge.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.jScrollPanelDatosConyuge.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaRepresentanteLegal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.jScrollPanelDatosRepresentanteLegal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.jScrollPanelDatosRepresentanteLegal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.jScrollPanelDatosRepresentanteLegal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.jScrollPanelDatosRepresentanteLegal.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIdentificacion.jContentPaneDetalleTipoIdentificacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoIdentificacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIdentificacion);
			
	       	this.jInternalFrameDetalleFormTipoIdentificacion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoIdentificacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoIdentificacion.dispose();
			//this.jInternalFrameDetalleFormTipoIdentificacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoIdentificacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoIdentificacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoIdentificacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoIdentificacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoIdentificacion.setVisible(true);
	        this.jInternalFrameImportacionTipoIdentificacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoIdentificacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoIdentificacion.setVisible(true);
	        this.jInternalFrameOrderByTipoIdentificacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoIdentificacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoIdentificacion.setVisible(false);
	        this.jInternalFrameOrderByTipoIdentificacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoIdentificacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoIdentificacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoIdentificacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoIdentificacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoIdentificacion.setVisible(false);
	        this.jInternalFrameImportacionTipoIdentificacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoIdentificacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoIdentificacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoIdentificacion(true);
			//this.isEsNuevoTipoIdentificacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoIdentificacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIdentificacion(false) ;
			
			if(tipoidentificacionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeSessionBean.getEsGuardarRelacionado() && ConyugeJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConyugeActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorSessionBean.getEsGuardarRelacionado() && CobradorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCobradorActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.getEsGuardarRelacionado() && RepresentanteLegalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRepresentanteLegalActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaSessionBean.getEsGuardarRelacionado() && AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAccionistaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIdentificacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIdentificacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoIdentificacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoIdentificacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoIdentificacion(true);
			//this.isEsNuevoTipoIdentificacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoidentificacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoIdentificacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoIdentificacion(false) ;
			
			if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIdentificacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIdentificacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoIdentificacion(false);
			
			//if(!this.isEsNuevoTipoIdentificacion) {								
				int intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
				
			}
			
			if(this.permiteMantenimiento(this.tipoidentificacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoIdentificacion=true;
					this.inicializarActualizarBindingTablaTipoIdentificacion(false);
					this.isEsNuevoTipoIdentificacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoIdentificacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoIdentificacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIdentificacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIdentificacion(false);
				
				this.habilitarDeshabilitarControlesTipoIdentificacion(false);
			
												
				
				if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoIdentificacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoIdentificacionActionPerformed(evt,tipoidentificacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoIdentificacion(this.tipoidentificacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoIdentificacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoidentificacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoidentificacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				this.tipoidentificacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				this.tipoidentificacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoidentificacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoIdentificacionModel) this.jTableDatosTipoIdentificacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoIdentificacion=true;
				this.inicializarActualizarBindingTablaTipoIdentificacion(false);
				this.isEsNuevoTipoIdentificacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIdentificacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIdentificacion(false);
				
				this.habilitarDeshabilitarControlesTipoIdentificacion(false);
				
				
				
				if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoIdentificacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoIdentificacion.getRowCount()>=1) {
				jTableDatosTipoIdentificacion.removeRowSelectionInterval(0, jTableDatosTipoIdentificacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoIdentificacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoIdentificacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIdentificacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIdentificacion(false) ;
			
			this.isEsNuevoTipoIdentificacion=false;
			
			if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoIdentificacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoIdentificacion(false);
				
				//SI ES MANUAL
				if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoIdentificacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoIdentificacion--;			
			//TipoIdentificacion tipoidentificacionAux= new TipoIdentificacion();			
			//tipoidentificacionAux.setId(this.iIdNuevoTipoIdentificacion);
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoIdentificacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
			
			this.tipoidentificacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoidentificacionLogic.getTipoIdentificacions().add(this.tipoidentificacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoidentificacions.add(this.tipoidentificacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoIdentificacion(false);
			
			this.jTableDatosTipoIdentificacion.setRowSelectionInterval(this.getIndiceNuevoTipoIdentificacion(), this.getIndiceNuevoTipoIdentificacion());
			
			int iLastRow =  this.jTableDatosTipoIdentificacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoIdentificacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoIdentificacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoIdentificacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoIdentificacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIdentificacion(false);
			
			//SI ES MANUAL
			if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIdentificacion();
			}
			
			//this.abrirFrameTreeTipoIdentificacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo IdentificacionES ?", "MANTENIMIENTO DE Tipo Identificacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoIdentificacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoIdentificacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoidentificacionReturnGeneral=tipoidentificacionLogic.procesarImportacionTipoIdentificacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoidentificacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoIdentificacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoIdentificacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoIdentificacion.setFileImportacion(this.jInternalFrameImportacionTipoIdentificacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoIdentificacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoIdentificacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoIdentificacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoIdentificacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		

		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoIdentificacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoIdentificacionBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteTipoIdentificacions("Todos",tipoidentificacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIdentificacionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoIdentificacionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoTipoIdentificacion.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoIdentificacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoIdentificacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoIdentificacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoIdentificacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIdentificacionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoIdentificacionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoidentificacion";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("TipoIdentificacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoIdentificacionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIdentificacionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoIdentificacion tipoidentificacion:tipoidentificacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoidentificacion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoIdentificacionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIdentificacionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoIdentificacion tipoidentificacion:tipoidentificacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoidentificacion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelTipoIdentificacion(row);				
			//	iRow++;
			//}				
			
			//for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoIdentificacion(tipoidentificacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIdentificacion(false);
			
			//SI ES MANUAL
			if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIdentificacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIdentificacion(false);
			
			//SI ES MANUAL
			if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIdentificacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoIdentificacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIdentificacion(false);
			
			//SI ES MANUAL
			if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIdentificacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoidentificacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoIdentificacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoIdentificacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoIdentificacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoIdentificacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoIdentificacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoIdentificacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoIdentificacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoIdentificacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoIdentificacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoIdentificacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoIdentificacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoIdentificacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoIdentificacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoIdentificacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIdentificacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoIdentificacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoIdentificacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoIdentificacion();
		
		this.inicializarActualizarBindingBotonesManualTipoIdentificacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIdentificacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIdentificacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIdentificacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIdentificacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoIdentificacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoIdentificacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoIdentificacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoIdentificacion.jCheckBoxPostAccionNuevoTipoIdentificacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoIdentificacion.jCheckBoxPostAccionSinCerrarTipoIdentificacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoIdentificacion.jCheckBoxPostAccionSinMensajeTipoIdentificacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoIdentificacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoIdentificacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoIdentificacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.jCheckBoxPostAccionNuevoTipoIdentificacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoIdentificacion.jCheckBoxPostAccionSinCerrarTipoIdentificacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoIdentificacion.jCheckBoxPostAccionSinMensajeTipoIdentificacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoIdentificacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoIdentificacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoIdentificacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoIdentificacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoIdentificacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoIdentificacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoIdentificacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoIdentificacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoIdentificacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoIdentificacion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIdentificacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoIdentificacion() throws Exception {
		try	{
			if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIdentificacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIdentificacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIdentificacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoIdentificacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoIdentificacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoIdentificacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoIdentificacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoIdentificacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoIdentificacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoIdentificacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoIdentificacion.addItem(reporte);
			}
			
			
			if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoIdentificacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoIdentificacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoIdentificacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoIdentificacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoIdentificacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoIdentificacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoIdentificacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoIdentificacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoIdentificacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIdentificacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIdentificacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
				this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
				this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIdentificacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIdentificacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoIdentificacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoIdentificacion(Boolean esInicializar) throws Exception {				
		if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIdentificacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoIdentificacion() throws Exception {
		this.inicializarActualizarBindingTablaTipoIdentificacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoIdentificacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoIdentificacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoIdentificacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoIdentificacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIdentificacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoIdentificacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoIdentificacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoIdentificacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoidentificacionLogic.getTipoIdentificacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoidentificacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoIdentificacion.setModel(new TipoIdentificacionModel(this.tipoidentificacionLogic.getTipoIdentificacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoIdentificacion.setModel(new TipoIdentificacionModel(this.tipoidentificacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoIdentificacion!=null && this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoIdentificacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoIdentificacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIdentificacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoIdentificacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO,tipoidentificacionConstantesFunciones.resaltarSeleccionarTipoIdentificacion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO,tipoidentificacionConstantesFunciones.resaltarSeleccionarTipoIdentificacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoIdentificacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIdentificacion,TipoIdentificacionConstantesFunciones.LABEL_ID));

		if(this.tipoidentificacionConstantesFunciones.mostraridTipoIdentificacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIdentificacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoidentificacionConstantesFunciones.resaltaridTipoIdentificacion,this.tipoidentificacionConstantesFunciones.activaridTipoIdentificacion,this,true,"idTipoIdentificacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoidentificacionConstantesFunciones.resaltaridTipoIdentificacion,this.tipoidentificacionConstantesFunciones.activaridTipoIdentificacion,this,true,"idTipoIdentificacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIdentificacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIdentificacion,TipoIdentificacionConstantesFunciones.LABEL_CODIGO));

		if(this.tipoidentificacionConstantesFunciones.mostrarcodigoTipoIdentificacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIdentificacionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoidentificacionConstantesFunciones.resaltarcodigoTipoIdentificacion,this.tipoidentificacionConstantesFunciones.activarcodigoTipoIdentificacion,this,true,"codigoTipoIdentificacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoidentificacionConstantesFunciones.resaltarcodigoTipoIdentificacion,this.tipoidentificacionConstantesFunciones.activarcodigoTipoIdentificacion,this,true,"codigoTipoIdentificacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoIdentificacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIdentificacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIdentificacion,TipoIdentificacionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoidentificacionConstantesFunciones.mostrarnombreTipoIdentificacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIdentificacionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoidentificacionConstantesFunciones.resaltarnombreTipoIdentificacion,this.tipoidentificacionConstantesFunciones.activarnombreTipoIdentificacion,this,true,"nombreTipoIdentificacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoidentificacionConstantesFunciones.resaltarnombreTipoIdentificacion,this.tipoidentificacionConstantesFunciones.activarnombreTipoIdentificacion,this,true,"nombreTipoIdentificacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoIdentificacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosConyuge && this.tipoidentificacionConstantesFunciones.mostrarConyugeTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Conyuges");
				tableColumn.setHeaderValue("Conyuges");
				tableColumn.setCellRenderer(new ConyugeTableCell(tipoidentificacionConstantesFunciones.resaltarConyugeTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarConyugeTipoIdentificacion));
				tableColumn.setCellEditor(new ConyugeTableCell(tipoidentificacionConstantesFunciones.resaltarConyugeTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarConyugeTipoIdentificacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			}

			if(this.isTienePermisosCobrador && this.tipoidentificacionConstantesFunciones.mostrarCobradorTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cobradores");
				tableColumn.setHeaderValue("Cobradores");
				tableColumn.setCellRenderer(new CobradorTableCell(tipoidentificacionConstantesFunciones.resaltarCobradorTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarCobradorTipoIdentificacion));
				tableColumn.setCellEditor(new CobradorTableCell(tipoidentificacionConstantesFunciones.resaltarCobradorTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarCobradorTipoIdentificacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			}

			if(this.isTienePermisosRepresentanteLegal && this.tipoidentificacionConstantesFunciones.mostrarRepresentanteLegalTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Representante Legales");
				tableColumn.setHeaderValue("Representante Legales");
				tableColumn.setCellRenderer(new RepresentanteLegalTableCell(tipoidentificacionConstantesFunciones.resaltarRepresentanteLegalTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarRepresentanteLegalTipoIdentificacion));
				tableColumn.setCellEditor(new RepresentanteLegalTableCell(tipoidentificacionConstantesFunciones.resaltarRepresentanteLegalTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarRepresentanteLegalTipoIdentificacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubCliente && this.tipoidentificacionConstantesFunciones.mostrarSubClienteTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sub Clientes");
				tableColumn.setHeaderValue("Sub Clientes");
				tableColumn.setCellRenderer(new SubClienteTableCell(tipoidentificacionConstantesFunciones.resaltarSubClienteTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarSubClienteTipoIdentificacion));
				tableColumn.setCellEditor(new SubClienteTableCell(tipoidentificacionConstantesFunciones.resaltarSubClienteTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarSubClienteTipoIdentificacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			}

			if(this.isTienePermisosAccionista && this.tipoidentificacionConstantesFunciones.mostrarAccionistaTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Accionistas");
				tableColumn.setHeaderValue("Accionistas");
				tableColumn.setCellRenderer(new AccionistaTableCell(tipoidentificacionConstantesFunciones.resaltarAccionistaTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarAccionistaTipoIdentificacion));
				tableColumn.setCellEditor(new AccionistaTableCell(tipoidentificacionConstantesFunciones.resaltarAccionistaTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarAccionistaTipoIdentificacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			}

			if(this.isTienePermisosCliente && this.tipoidentificacionConstantesFunciones.mostrarClienteTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(tipoidentificacionConstantesFunciones.resaltarClienteTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarClienteTipoIdentificacion));
				tableColumn.setCellEditor(new ClienteTableCell(tipoidentificacionConstantesFunciones.resaltarClienteTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarClienteTipoIdentificacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.tipoidentificacionConstantesFunciones.mostrarParametroCarteraDefectoTipoIdentificacion && !TipoIdentificacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(tipoidentificacionConstantesFunciones.resaltarParametroCarteraDefectoTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarParametroCarteraDefectoTipoIdentificacion));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(tipoidentificacionConstantesFunciones.resaltarParametroCarteraDefectoTipoIdentificacion,this,this.tipoidentificacionConstantesFunciones.activarParametroCarteraDefectoTipoIdentificacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoidentificacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoidentificacionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoidentificacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoidentificacionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIdentificacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoidentificacionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoidentificacionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosTipoIdentificacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoIdentificacion.moveColumn(this.jTableDatosTipoIdentificacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoIdentificacion.moveColumn(this.jTableDatosTipoIdentificacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoIdentificacion.moveColumn(this.jTableDatosTipoIdentificacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoIdentificacion.moveColumn(this.jTableDatosTipoIdentificacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoIdentificacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoIdentificacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoIdentificacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoIdentificacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoIdentificacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoIdentificacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoIdentificacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoIdentificacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=tipoidentificacionLogic.getTipoIdentificacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoidentificacions.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosTipoIdentificacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoIdentificacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoIdentificacion();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoTipoIdentificacion=false;
					
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
				if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoIdentificacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIdentificacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIdentificacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoidentificacion.getsType().equals("DUPLICADO")
				   || this.tipoidentificacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoIdentificacion=true;
				
				} else {
					this.isEsNuevoTipoIdentificacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoidentificacion.getId()>=0 && !this.tipoidentificacion.getIsNew()) {						
						this.isEsNuevoTipoIdentificacion=false;
						
					} else {
						this.isEsNuevoTipoIdentificacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoIdentificacion(esRelaciones);						
				
				this.seleccionarTipoIdentificacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoidentificacion.getId()<0) {
					this.isEsNuevoTipoIdentificacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoIdentificacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoIdentificacion(evt,rowIndex);
				}	
				
				if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoIdentificacion: " + this.dDif); 
					}
				}								
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoIdentificacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoidentificacion)) {
					if(this.tipoidentificacion.getId()>0) {
						this.tipoidentificacion.setIsDeleted(true);
						
						this.tipoidentificacionsEliminados.add(this.tipoidentificacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoidentificacionLogic.getTipoIdentificacions().remove(this.tipoidentificacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoidentificacions.remove(this.tipoidentificacion);				
					}
					
					
					((TipoIdentificacionModel) this.jTableDatosTipoIdentificacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIdentificacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoIdentificacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoIdentificacion) {
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIdentificacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIdentificacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoIdentificacion(this.tipoidentificacion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoIdentificacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoIdentificacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIdentificacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIdentificacion(TipoIdentificacion tipoidentificacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoIdentificacion(tipoidentificacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIdentificacion(TipoIdentificacion tipoidentificacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoIdentificacion(tipoidentificacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoIdentificacion(tipoidentificacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoIdentificacion(tipoidentificacion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoIdentificacion(TipoIdentificacion tipoidentificacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.setText(tipoidentificacion.getId().toString());
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldcodigoTipoIdentificacion.setText(tipoidentificacion.getcodigo());
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextAreanombreTipoIdentificacion.setText(tipoidentificacion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoIdentificacion tipoidentificacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoidentificacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoIdentificacion tipoidentificacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoidentificacionLocal=this.tipoidentificacion;
			} else {
				tipoidentificacionLocal=this.tipoidentificacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoidentificacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoIdentificacion(tipoidentificacionLocal,true);
					
					if(tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoidentificacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoidentificacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoIdentificacion(TipoIdentificacion tipoidentificacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIdentificacion(tipoidentificacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(tipoidentificacion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIdentificacion(TipoIdentificacion tipoidentificacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIdentificacion(tipoidentificacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIdentificacion(TipoIdentificacion tipoidentificacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.getText()==null || this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.getText()=="" || this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.setText("0");
			}

			if(conColumnasBase) {tipoidentificacion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIdentificacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIdentificacion.jLabelIdTipoIdentificacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoidentificacion.setcodigo(this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldcodigoTipoIdentificacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIdentificacionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIdentificacion.jLabelcodigoTipoIdentificacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoidentificacion.setnombre(this.jInternalFrameDetalleFormTipoIdentificacion.jTextAreanombreTipoIdentificacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIdentificacionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIdentificacion.jLabelnombreTipoIdentificacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIdentificacion(TipoIdentificacion tipoidentificacionBean,TipoIdentificacion tipoidentificacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoIdentificacion(TipoIdentificacion tipoidentificacionOrigen,TipoIdentificacion tipoidentificacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoidentificacionOrigen.getId()!=null && !tipoidentificacionOrigen.getId().equals(0L))) {tipoidentificacion.setId(tipoidentificacionOrigen.getId());}}
			if(conDefault || (!conDefault && tipoidentificacionOrigen.getcodigo()!=null && !tipoidentificacionOrigen.getcodigo().equals(""))) {tipoidentificacion.setcodigo(tipoidentificacionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoidentificacionOrigen.getnombre()!=null && !tipoidentificacionOrigen.getnombre().equals(""))) {tipoidentificacion.setnombre(tipoidentificacionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIdentificacion(TipoIdentificacion tipoidentificacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.setText(tipoidentificacion.getId().toString());
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldcodigoTipoIdentificacion.setText(tipoidentificacion.getcodigo());
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextAreanombreTipoIdentificacion.setText(tipoidentificacion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIdentificacion(TipoIdentificacionBean tipoidentificacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.setText(tipoidentificacionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldcodigoTipoIdentificacion.setText(tipoidentificacionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoIdentificacion.jTextAreanombreTipoIdentificacion.setText(tipoidentificacionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoIdentificacion(TipoIdentificacionParameterReturnGeneral tipoidentificacionReturnGeneral,TipoIdentificacionBean tipoidentificacionBean,Boolean conDefault) throws Exception { 
		try {
			TipoIdentificacion tipoidentificacionLocal=new TipoIdentificacion();
			
			tipoidentificacionLocal=tipoidentificacionReturnGeneral.getTipoIdentificacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoidentificacionLocal.getId()!=null && !tipoidentificacionLocal.getId().equals(0L))) {tipoidentificacionBean.setId(tipoidentificacionLocal.getId());}}
			if(conDefault || (!conDefault && tipoidentificacionLocal.getcodigo()!=null && !tipoidentificacionLocal.getcodigo().equals(""))) {tipoidentificacionBean.setcodigo(tipoidentificacionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoidentificacionLocal.getnombre()!=null && !tipoidentificacionLocal.getnombre().equals(""))) {tipoidentificacionBean.setnombre(tipoidentificacionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoIdentificacionGenerico(Long idTipoIdentificacionSeleccionado,JComboBox jComboBoxTipoIdentificacion,List<TipoIdentificacion> tipoidentificacionsLocal)throws Exception {
		try {
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsLocal) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			jComboBoxTipoIdentificacion.setSelectedItem(tipoidentificacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoIdentificacionGenerico(JComboBox jComboBoxTipoIdentificacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxTipoIdentificacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIdentificacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoIdentificacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIdentificacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIdentificacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoIdentificacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIdentificacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoIdentificacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoIdentificacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoIdentificacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("Conyuge")) {
			jButtonConyugeActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cobrador")) {
			jButtonCobradorActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("RepresentanteLegal")) {
			jButtonRepresentanteLegalActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SubCliente")) {
			jButtonSubClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Accionista")) {
			jButtonAccionistaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoidentificacion=(TipoIdentificacion) tipoidentificacionLogic.getTipoIdentificacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoidentificacion =(TipoIdentificacion) tipoidentificacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoIdentificacion tipoidentificacionRow=new TipoIdentificacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoidentificacionRow=(TipoIdentificacion) tipoidentificacionLogic.getTipoIdentificacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoidentificacionRow=(TipoIdentificacion) tipoidentificacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonConyugeActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIdentificacion tipoidentificacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIdentificacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoidentificacion!=null) {
						this.tipoidentificacion = tipoidentificacion;
					} else {
						this.tipoidentificacion = new TipoIdentificacion();
					}
				}

				if(this.isTienePermisosConyuge && this.permiteMantenimiento(this.tipoidentificacion)) {
					ConyugeBeanSwingJInternalFrame conyugeBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFramePopup=new ConyugeBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						conyugeBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFramePopup;
					} else {
						conyugeBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame;
					}

					List<TipoIdentificacion> tipoidentificacions=new ArrayList<TipoIdentificacion>();
					tipoidentificacions.add(this.tipoidentificacion);
					if(!esRelacionado) {
						//conyugeBeanSwingJInternalFrame.conyugeSessionBean.setConGuardarRelaciones(false);
						//conyugeBeanSwingJInternalFrame.conyugeSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					conyugeBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIdentificacion.cargarConyugeBeanSwingJInternalFrame(tipoidentificacions,this.tipoidentificacion,conyugeBeanSwingJInternalFrame,/*conInicializar,*/conyugeBeanSwingJInternalFrame.conyugeSessionBean.getConGuardarRelaciones(),conyugeBeanSwingJInternalFrame.conyugeSessionBean.getEsGuardarRelacionado());
					conyugeBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						conyugeBeanSwingJInternalFrame.actualizarEstadoPanelsConyuge("no_relacionado");

						conyugeBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ConyugeConstantesFunciones.ITAMANIOFILATABLA + (ConyugeConstantesFunciones.ITAMANIOFILATABLA/2));

						conyugeBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIdentificacion=(TitledBorder)this.jScrollPanelDatosTipoIdentificacion.getBorder();
						TitledBorder titledBorderConyuge=(TitledBorder)conyugeBeanSwingJInternalFrame.jScrollPanelDatosConyuge.getBorder();

						titledBorderConyuge.setTitle(titledBorderTipoIdentificacion.getTitle() + " -> Conyuge");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,conyugeBeanSwingJInternalFrame);
						}

						conyugeBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(conyugeBeanSwingJInternalFrame);

						conyugeBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Conyuge",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCobradorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIdentificacion tipoidentificacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIdentificacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoidentificacion!=null) {
						this.tipoidentificacion = tipoidentificacion;
					} else {
						this.tipoidentificacion = new TipoIdentificacion();
					}
				}

				if(this.isTienePermisosCobrador && this.permiteMantenimiento(this.tipoidentificacion)) {
					CobradorBeanSwingJInternalFrame cobradorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFramePopup=new CobradorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cobradorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFramePopup;
					} else {
						cobradorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame;
					}

					List<TipoIdentificacion> tipoidentificacions=new ArrayList<TipoIdentificacion>();
					tipoidentificacions.add(this.tipoidentificacion);
					if(!esRelacionado) {
						//cobradorBeanSwingJInternalFrame.cobradorSessionBean.setConGuardarRelaciones(false);
						//cobradorBeanSwingJInternalFrame.cobradorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cobradorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIdentificacion.cargarCobradorBeanSwingJInternalFrame(tipoidentificacions,this.tipoidentificacion,cobradorBeanSwingJInternalFrame,/*conInicializar,*/cobradorBeanSwingJInternalFrame.cobradorSessionBean.getConGuardarRelaciones(),cobradorBeanSwingJInternalFrame.cobradorSessionBean.getEsGuardarRelacionado());
					cobradorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cobradorBeanSwingJInternalFrame.actualizarEstadoPanelsCobrador("no_relacionado");

						cobradorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CobradorConstantesFunciones.ITAMANIOFILATABLA + (CobradorConstantesFunciones.ITAMANIOFILATABLA/2));

						cobradorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIdentificacion=(TitledBorder)this.jScrollPanelDatosTipoIdentificacion.getBorder();
						TitledBorder titledBorderCobrador=(TitledBorder)cobradorBeanSwingJInternalFrame.jScrollPanelDatosCobrador.getBorder();

						titledBorderCobrador.setTitle(titledBorderTipoIdentificacion.getTitle() + " -> Cobrador");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cobradorBeanSwingJInternalFrame);
						}

						cobradorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cobradorBeanSwingJInternalFrame);

						cobradorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cobrador",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonRepresentanteLegalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIdentificacion tipoidentificacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIdentificacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoidentificacion!=null) {
						this.tipoidentificacion = tipoidentificacion;
					} else {
						this.tipoidentificacion = new TipoIdentificacion();
					}
				}

				if(this.isTienePermisosRepresentanteLegal && this.permiteMantenimiento(this.tipoidentificacion)) {
					RepresentanteLegalBeanSwingJInternalFrame representantelegalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFramePopup=new RepresentanteLegalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						representantelegalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFramePopup;
					} else {
						representantelegalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame;
					}

					List<TipoIdentificacion> tipoidentificacions=new ArrayList<TipoIdentificacion>();
					tipoidentificacions.add(this.tipoidentificacion);
					if(!esRelacionado) {
						//representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.setConGuardarRelaciones(false);
						//representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					representantelegalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIdentificacion.cargarRepresentanteLegalBeanSwingJInternalFrame(tipoidentificacions,this.tipoidentificacion,representantelegalBeanSwingJInternalFrame,/*conInicializar,*/representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.getConGuardarRelaciones(),representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.getEsGuardarRelacionado());
					representantelegalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						representantelegalBeanSwingJInternalFrame.actualizarEstadoPanelsRepresentanteLegal("no_relacionado");

						representantelegalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RepresentanteLegalConstantesFunciones.ITAMANIOFILATABLA + (RepresentanteLegalConstantesFunciones.ITAMANIOFILATABLA/2));

						representantelegalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIdentificacion=(TitledBorder)this.jScrollPanelDatosTipoIdentificacion.getBorder();
						TitledBorder titledBorderRepresentanteLegal=(TitledBorder)representantelegalBeanSwingJInternalFrame.jScrollPanelDatosRepresentanteLegal.getBorder();

						titledBorderRepresentanteLegal.setTitle(titledBorderTipoIdentificacion.getTitle() + " -> Representante Legal");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,representantelegalBeanSwingJInternalFrame);
						}

						representantelegalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(representantelegalBeanSwingJInternalFrame);

						representantelegalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Representante Legal",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSubClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIdentificacion tipoidentificacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIdentificacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoidentificacion!=null) {
						this.tipoidentificacion = tipoidentificacion;
					} else {
						this.tipoidentificacion = new TipoIdentificacion();
					}
				}

				if(this.isTienePermisosSubCliente && this.permiteMantenimiento(this.tipoidentificacion)) {
					SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFramePopup;
					} else {
						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame;
					}

					List<TipoIdentificacion> tipoidentificacions=new ArrayList<TipoIdentificacion>();
					tipoidentificacions.add(this.tipoidentificacion);
					if(!esRelacionado) {
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setConGuardarRelaciones(false);
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIdentificacion.cargarSubClienteBeanSwingJInternalFrame(tipoidentificacions,this.tipoidentificacion,subclienteBeanSwingJInternalFrame,/*conInicializar,*/subclienteBeanSwingJInternalFrame.subclienteSessionBean.getConGuardarRelaciones(),subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado());
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");

						subclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubClienteConstantesFunciones.ITAMANIOFILATABLA + (SubClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						subclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIdentificacion=(TitledBorder)this.jScrollPanelDatosTipoIdentificacion.getBorder();
						TitledBorder titledBorderSubCliente=(TitledBorder)subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getBorder();

						titledBorderSubCliente.setTitle(titledBorderTipoIdentificacion.getTitle() + " -> Sub Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subclienteBeanSwingJInternalFrame);
						}

						subclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subclienteBeanSwingJInternalFrame);

						subclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonAccionistaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIdentificacion tipoidentificacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIdentificacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoidentificacion!=null) {
						this.tipoidentificacion = tipoidentificacion;
					} else {
						this.tipoidentificacion = new TipoIdentificacion();
					}
				}

				if(this.isTienePermisosAccionista && this.permiteMantenimiento(this.tipoidentificacion)) {
					AccionistaBeanSwingJInternalFrame accionistaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFramePopup=new AccionistaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						accionistaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFramePopup;
					} else {
						accionistaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame;
					}

					List<TipoIdentificacion> tipoidentificacions=new ArrayList<TipoIdentificacion>();
					tipoidentificacions.add(this.tipoidentificacion);
					if(!esRelacionado) {
						//accionistaBeanSwingJInternalFrame.accionistaSessionBean.setConGuardarRelaciones(false);
						//accionistaBeanSwingJInternalFrame.accionistaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					accionistaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIdentificacion.cargarAccionistaBeanSwingJInternalFrame(tipoidentificacions,this.tipoidentificacion,accionistaBeanSwingJInternalFrame,/*conInicializar,*/accionistaBeanSwingJInternalFrame.accionistaSessionBean.getConGuardarRelaciones(),accionistaBeanSwingJInternalFrame.accionistaSessionBean.getEsGuardarRelacionado());
					accionistaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						accionistaBeanSwingJInternalFrame.actualizarEstadoPanelsAccionista("no_relacionado");

						accionistaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AccionistaConstantesFunciones.ITAMANIOFILATABLA + (AccionistaConstantesFunciones.ITAMANIOFILATABLA/2));

						accionistaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIdentificacion=(TitledBorder)this.jScrollPanelDatosTipoIdentificacion.getBorder();
						TitledBorder titledBorderAccionista=(TitledBorder)accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.getBorder();

						titledBorderAccionista.setTitle(titledBorderTipoIdentificacion.getTitle() + " -> Accionista");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,accionistaBeanSwingJInternalFrame);
						}

						accionistaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(accionistaBeanSwingJInternalFrame);

						accionistaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Accionista",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIdentificacion tipoidentificacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIdentificacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoidentificacion!=null) {
						this.tipoidentificacion = tipoidentificacion;
					} else {
						this.tipoidentificacion = new TipoIdentificacion();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.tipoidentificacion)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame;
					}

					List<TipoIdentificacion> tipoidentificacions=new ArrayList<TipoIdentificacion>();
					tipoidentificacions.add(this.tipoidentificacion);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIdentificacion.cargarClienteBeanSwingJInternalFrame(tipoidentificacions,this.tipoidentificacion,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIdentificacion=(TitledBorder)this.jScrollPanelDatosTipoIdentificacion.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderTipoIdentificacion.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIdentificacion tipoidentificacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIdentificacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoidentificacion = (TipoIdentificacion)this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoidentificacion!=null) {
						this.tipoidentificacion = tipoidentificacion;
					} else {
						this.tipoidentificacion = new TipoIdentificacion();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.tipoidentificacion)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<TipoIdentificacion> tipoidentificacions=new ArrayList<TipoIdentificacion>();
					tipoidentificacions.add(this.tipoidentificacion);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIdentificacion.cargarParametroCarteraDefectoBeanSwingJInternalFrame(tipoidentificacions,this.tipoidentificacion,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIdentificacion=(TitledBorder)this.jScrollPanelDatosTipoIdentificacion.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderTipoIdentificacion.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoIdentificacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion));			
			this.jButtonDuplicarTipoIdentificacion.setVisible((this.isVisibilidadCeldaDuplicarTipoIdentificacion && this.isPermisoDuplicarTipoIdentificacion));			
			this.jButtonCopiarTipoIdentificacion.setVisible((this.isVisibilidadCeldaCopiarTipoIdentificacion && this.isPermisoCopiarTipoIdentificacion));
			this.jButtonVerFormTipoIdentificacion.setVisible((this.isVisibilidadCeldaVerFormTipoIdentificacion && this.isPermisoVerFormTipoIdentificacion));
			
			this.jButtonAbrirOrderByTipoIdentificacion.setVisible((this.isVisibilidadCeldaOrdenTipoIdentificacion && this.isPermisoOrdenTipoIdentificacion));			
			
			this.jButtonNuevoRelacionesTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion));			
			this.jButtonNuevoGuardarCambiosTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarTipoIdentificacion.setVisible((this.isVisibilidadCeldaModificarTipoIdentificacion && this.isPermisoActualizarTipoIdentificacion));	
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarTipoIdentificacion.setVisible((this.isVisibilidadCeldaActualizarTipoIdentificacion && this.isPermisoActualizarTipoIdentificacion));	
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarTipoIdentificacion.setVisible((this.isVisibilidadCeldaEliminarTipoIdentificacion && this.isPermisoEliminarTipoIdentificacion));
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarTipoIdentificacion.setVisible(this.isVisibilidadCeldaCancelarTipoIdentificacion);							
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosTipoIdentificacion.setVisible((this.isVisibilidadCeldaGuardarTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoIdentificacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion));						
			this.jButtonDuplicarToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaDuplicarTipoIdentificacion && this.isPermisoDuplicarTipoIdentificacion));						
			this.jButtonCopiarToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaCopiarTipoIdentificacion && this.isPermisoCopiarTipoIdentificacion));			
			this.jButtonVerFormToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaVerFormTipoIdentificacion && this.isPermisoVerFormTipoIdentificacion));			
			this.jButtonAbrirOrderByToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaOrdenTipoIdentificacion && this.isPermisoOrdenTipoIdentificacion));
			this.jButtonNuevoRelacionesToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));			
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaModificarTipoIdentificacion && this.isPermisoActualizarTipoIdentificacion));	
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaActualizarTipoIdentificacion  && this.isPermisoActualizarTipoIdentificacion));	
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaEliminarTipoIdentificacion && this.isPermisoEliminarTipoIdentificacion));
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarToolBarTipoIdentificacion.setVisible(this.isVisibilidadCeldaCancelarTipoIdentificacion);				
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaGuardarTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoIdentificacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion));			
			this.jMenuItemDuplicarTipoIdentificacion.setVisible((this.isVisibilidadCeldaDuplicarTipoIdentificacion && this.isPermisoDuplicarTipoIdentificacion));			
			this.jMenuItemCopiarTipoIdentificacion.setVisible((this.isVisibilidadCeldaCopiarTipoIdentificacion && this.isPermisoCopiarTipoIdentificacion));			
			this.jMenuItemVerFormTipoIdentificacion.setVisible((this.isVisibilidadCeldaVerFormTipoIdentificacion && this.isPermisoVerFormTipoIdentificacion));			
			this.jMenuItemAbrirOrderByTipoIdentificacion.setVisible((this.isVisibilidadCeldaOrdenTipoIdentificacion && this.isPermisoOrdenTipoIdentificacion));			
			//this.jMenuItemMostrarOcultarTipoIdentificacion.setVisible((this.isVisibilidadCeldaOrdenTipoIdentificacion && this.isPermisoOrdenTipoIdentificacion));
			this.jMenuItemDetalleAbrirOrderByTipoIdentificacion.setVisible((this.isVisibilidadCeldaOrdenTipoIdentificacion && this.isPermisoOrdenTipoIdentificacion));			
			//this.jMenuItemDetalleMostrarOcultarTipoIdentificacion.setVisible((this.isVisibilidadCeldaOrdenTipoIdentificacion && this.isPermisoOrdenTipoIdentificacion));			
			this.jMenuItemNuevoRelacionesTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion));			
			this.jMenuItemNuevoGuardarCambiosTipoIdentificacion.setVisible((this.isVisibilidadCeldaNuevoTipoIdentificacion && this.isPermisoNuevoTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));									
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemModificarTipoIdentificacion.setVisible((this.isVisibilidadCeldaModificarTipoIdentificacion && this.isPermisoActualizarTipoIdentificacion));	
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemActualizarTipoIdentificacion.setVisible((this.isVisibilidadCeldaActualizarTipoIdentificacion && this.isPermisoActualizarTipoIdentificacion));	
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemEliminarTipoIdentificacion.setVisible((this.isVisibilidadCeldaEliminarTipoIdentificacion && this.isPermisoEliminarTipoIdentificacion));
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemCancelarTipoIdentificacion.setVisible(this.isVisibilidadCeldaCancelarTipoIdentificacion);				
			}
			
			this.jMenuItemGuardarCambiosTipoIdentificacion.setVisible((this.isVisibilidadCeldaGuardarTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));						
			this.jMenuItemGuardarCambiosTablaTipoIdentificacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoIdentificacion=this.jButtonNuevoTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoIdentificacion=this.jButtonDuplicarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaCopiarTipoIdentificacion=this.jButtonCopiarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaVerFormTipoIdentificacion=this.jButtonVerFormTipoIdentificacion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoIdentificacion=this.jButtonAbrirOrderByTipoIdentificacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=this.jButtonNuevoRelacionesTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaModificarTipoIdentificacion=this.jButtonModificarTipoIdentificacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			this.isVisibilidadCeldaActualizarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaGuardarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosTipoIdentificacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=this.jButtonGuardarCambiosTablaTipoIdentificacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoIdentificacion=this.jButtonNuevoToolBarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=this.jButtonNuevoRelacionesToolBarTipoIdentificacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			this.isVisibilidadCeldaModificarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarToolBarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarToolBarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarToolBarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarToolBarTipoIdentificacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIdentificacion=this.jButtonGuardarCambiosToolBarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=this.jButtonGuardarCambiosTablaToolBarTipoIdentificacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoIdentificacion=this.jMenuItemNuevoTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=this.jMenuItemNuevoRelacionesTipoIdentificacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			this.isVisibilidadCeldaModificarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemModificarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemActualizarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemEliminarTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoIdentificacion=this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemCancelarTipoIdentificacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIdentificacion=this.jMenuItemGuardarCambiosTipoIdentificacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=this.jMenuItemGuardarCambiosTablaTipoIdentificacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoIdentificacion(Boolean esInicializar) {
		if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIdentificacion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoIdentificacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoIdentificacion() {
		this.jButtonNuevoTipoIdentificacion.setVisible(this.isPermisoNuevoTipoIdentificacion);			
		this.jButtonDuplicarTipoIdentificacion.setVisible(this.isPermisoDuplicarTipoIdentificacion);			
		this.jButtonCopiarTipoIdentificacion.setVisible(this.isPermisoCopiarTipoIdentificacion);			
		this.jButtonVerFormTipoIdentificacion.setVisible(this.isPermisoVerFormTipoIdentificacion);			
		
		this.jButtonAbrirOrderByTipoIdentificacion.setVisible(this.isPermisoOrdenTipoIdentificacion);					
		
		this.jButtonNuevoRelacionesTipoIdentificacion.setVisible(this.isPermisoNuevoTipoIdentificacion);			
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarTipoIdentificacion.setVisible(this.isPermisoActualizarTipoIdentificacion);	
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarTipoIdentificacion.setVisible(this.isPermisoActualizarTipoIdentificacion);	
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarTipoIdentificacion.setVisible(this.isPermisoEliminarTipoIdentificacion);
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarTipoIdentificacion.setVisible(this.isVisibilidadCeldaCancelarTipoIdentificacion);						
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosTipoIdentificacion.setVisible(this.isPermisoGuardarCambiosTipoIdentificacion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoIdentificacion.setVisible(this.isPermisoActualizarTipoIdentificacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIdentificacion() {
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarTipoIdentificacion.setVisible(this.isPermisoActualizarTipoIdentificacion);	
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarTipoIdentificacion.setVisible(this.isPermisoActualizarTipoIdentificacion);	
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarTipoIdentificacion.setVisible(this.isPermisoEliminarTipoIdentificacion);
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarTipoIdentificacion.setVisible(this.isVisibilidadCeldaCancelarTipoIdentificacion);							
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosTipoIdentificacion.setVisible((this.isVisibilidadCeldaGuardarTipoIdentificacion && this.isPermisoGuardarCambiosTipoIdentificacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoIdentificacion() {
		if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoIdentificacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoIdentificacion() {
	}
	
	public void jTableDatosTipoIdentificacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoIdentificacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoIdentificacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.gettipoidentificacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoidentificacion==null) {
						this.tipoidentificacion = new TipoIdentificacion();
					}

					this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
				}

				if(this.tipoidentificacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoidentificacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIdentificacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoIdentificacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.gettipoidentificacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoidentificacion==null) {
						this.tipoidentificacion = new TipoIdentificacion();
					}

					this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
				}

				if(this.tipoidentificacion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoidentificacion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIdentificacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoIdentificacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.gettipoidentificacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoidentificacion==null) {
						this.tipoidentificacion = new TipoIdentificacion();
					}

					this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);
				}

				if(this.tipoidentificacion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoidentificacion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIdentificacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoIdentificacion() {
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
			this.jInternalFrameDetalleFormTipoIdentificacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoIdentificacion.dispose();
			this.jInternalFrameDetalleFormTipoIdentificacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
			this.jInternalFrameReporteDinamicoTipoIdentificacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoIdentificacion.dispose();
			this.jInternalFrameReporteDinamicoTipoIdentificacion=null;
		}
		
		if(this.jInternalFrameImportacionTipoIdentificacion!=null) {
			this.jInternalFrameImportacionTipoIdentificacion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoIdentificacion.dispose();
			this.jInternalFrameImportacionTipoIdentificacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoIdentificacion();
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoIdentificacion")) {
				jButtonNuevoTipoIdentificacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoIdentificacion")) {
				jButtonDuplicarTipoIdentificacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoIdentificacion")) {
				jButtonCopiarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoIdentificacion")) {
				jButtonVerFormTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoIdentificacion")) {
				jButtonNuevoTipoIdentificacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoIdentificacion")) {
				jButtonDuplicarTipoIdentificacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoIdentificacion")) {
				jButtonNuevoTipoIdentificacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoIdentificacion")) {
				jButtonDuplicarTipoIdentificacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoIdentificacion")) {
				jButtonNuevoTipoIdentificacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoIdentificacion")) {
				jButtonNuevoTipoIdentificacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoIdentificacion")) {
				jButtonNuevoTipoIdentificacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoIdentificacion")) {
				jButtonModificarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoIdentificacion")) {
				jButtonModificarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoIdentificacion")) {
				jButtonModificarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoIdentificacion")) {
				jButtonActualizarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoIdentificacion")) {
				jButtonActualizarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoIdentificacion")) {
				jButtonActualizarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoIdentificacion")) {
				jButtonEliminarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoIdentificacion")) {
				jButtonEliminarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoIdentificacion")) {
				jButtonEliminarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoIdentificacion")) {
				jButtonCancelarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoIdentificacion")) {
				jButtonCancelarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoIdentificacion")) {
				jButtonCancelarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoIdentificacion")) {
				jButtonCerrarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoIdentificacion")) {
				jButtonCerrarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoIdentificacion")) {
				jButtonCerrarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoIdentificacion")) {
				jButtonMostrarOcultarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoIdentificacion")) {
				jButtonCancelarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoIdentificacion")) {
				jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoIdentificacion")) {
				jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoIdentificacion")) {
				jButtonCopiarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoIdentificacion")) {
				jButtonVerFormTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoIdentificacion")) {
				jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoIdentificacion")) {
				jButtonCopiarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoIdentificacion")) {
				jButtonVerFormTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoIdentificacion")) {
				jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoIdentificacion")) {
				jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoIdentificacion")) {
				jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoIdentificacion")) {
				jButtonRecargarInformacionTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoIdentificacion")) {
				jButtonRecargarInformacionTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoIdentificacion")) {
				jButtonRecargarInformacionTipoIdentificacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoIdentificacion")) {
				jButtonAnterioresTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoIdentificacion")) {
				jButtonAnterioresTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoIdentificacion")) {
				jButtonAnterioresTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoIdentificacion")) {
				jButtonSiguientesTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoIdentificacion")) {
				jButtonSiguientesTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoIdentificacion")) {
				jButtonSiguientesTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoIdentificacion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoIdentificacion")) {
				jButtonAbrirOrderByTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoIdentificacion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoIdentificacion")) {
				jButtonMostrarOcultarTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIdentificacion")) {
				jButtonNuevoGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoIdentificacion")) {
				jButtonNuevoGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoIdentificacion")) {
				jButtonNuevoGuardarCambiosTipoIdentificacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoIdentificacion")) {
				jButtonCerrarReporteDinamicoTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoIdentificacion")) {
				jButtonGenerarReporteDinamicoTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoIdentificacion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoIdentificacion")) {
				jButtonCerrarImportacionTipoIdentificacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoIdentificacion")) {
				
				jButtonGenerarImportacionTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoIdentificacion")) {
				
				jButtonAbrirImportacionTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoIdentificacion")) {
				jComboBoxTiposAccionesTipoIdentificacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoIdentificacion")) {
				jComboBoxTiposRelacionesTipoIdentificacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoIdentificacion")) {
				jComboBoxTiposAccionesTipoIdentificacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoIdentificacion")) {
				
				jComboBoxTiposSeleccionarTipoIdentificacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoIdentificacion")) {
				jTextFieldValorCampoGeneralTipoIdentificacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoIdentificacion")) {
				jButtonAbrirOrderByTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoIdentificacion")) {
				jButtonAbrirOrderByTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoIdentificacion")) {
				jButtonCerrarOrderByTipoIdentificacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIdentificacionBusqueda")) {
				this.jButtonidTipoIdentificacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoIdentificacionBusqueda")) {
				this.jButtoncodigoTipoIdentificacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIdentificacionBusqueda")) {
				this.jButtonnombreTipoIdentificacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoIdentificacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIdentificacionActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				


				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoIdentificacion tipoidentificacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoidentificacionLocal=this.tipoidentificacion;
			} else {
				tipoidentificacionLocal=this.tipoidentificacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
							
				
				


				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIdentificacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIdentificacionActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
								
						
				


				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
								
				
				


				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIdentificacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIdentificacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIdentificacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
							
				
				


				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIdentificacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIdentificacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
								
				
				


				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIdentificacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIdentificacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIdentificacionActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoIdentificacion")) {
					jCheckBoxSeleccionarTodosTipoIdentificacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoIdentificacion")) {
					jCheckBoxSeleccionadosTipoIdentificacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoIdentificacion")) {
					
				}
				
				


				
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
												
				
				


				
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIdentificacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIdentificacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIdentificacionActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoidentificacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoidentificacion);
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIdentificacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIdentificacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIdentificacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoidentificacionAnterior =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoIdentificacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoIdentificacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoIdentificacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoidentificacion =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoidentificacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoIdentificacion")) {
				
				}
				
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoIdentificacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoIdentificacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoIdentificacion")) {
			
			}
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoIdentificacion();
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoIdentificacion")) {
				jButtonNuevoTipoIdentificacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoIdentificacion")) {
				jButtonDuplicarTipoIdentificacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoIdentificacion")) {
				jButtonCopiarTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoIdentificacion")) {
				jButtonVerFormTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoIdentificacion")) {
				jButtonNuevoTipoIdentificacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoIdentificacion")) {
				jButtonModificarTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoIdentificacion")) {
				jButtonActualizarTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoIdentificacion")) {
				jButtonEliminarTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoIdentificacion")) {
				jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoIdentificacion")) {
				jButtonCancelarTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoIdentificacion")) {
				jButtonCerrarTipoIdentificacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoIdentificacion")) {
				jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIdentificacion")) {
				jButtonNuevoGuardarCambiosTipoIdentificacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoIdentificacion")) {
				jButtonAbrirOrderByTipoIdentificacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoIdentificacion")) {
				jButtonRecargarInformacionTipoIdentificacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoIdentificacion")) {
				jButtonAnterioresTipoIdentificacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoIdentificacion")) {
				jButtonSiguientesTipoIdentificacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIdentificacionBusqueda")) {
				this.jButtonidTipoIdentificacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoIdentificacionBusqueda")) {
				this.jButtoncodigoTipoIdentificacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIdentificacionBusqueda")) {
				this.jButtonnombreTipoIdentificacionBusquedaActionPerformed(evt);
			}
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoIdentificacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoIdentificacion")) {
				closingInternalFrameTipoIdentificacion();
				
			} else if(sTipo.equals("jButtonCancelarTipoIdentificacion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoIdentificacion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoIdentificacionBeanSwingJInternalFrame jInternalFrameParent=(TipoIdentificacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIdentificacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoIdentificacionActionPerformed(null);
			}
			
			TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoidentificacion,new Object(),this.tipoidentificacionParameterGeneral,this.tipoidentificacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoIdentificacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoIdentificacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoIdentificacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoidentificacion)) {
			if(!esControlTabla) {
				if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);			
				}
				
				if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoIdentificacion(this.tipoidentificacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoidentificacionReturnGeneral=tipoidentificacionLogic.procesarEventosTipoIdentificacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoidentificacionLogic.getTipoIdentificacions(),this.tipoidentificacion,this.tipoidentificacionParameterGeneral,this.isEsNuevoTipoIdentificacion,classes);//this.tipoidentificacionLogic.getTipoIdentificacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoIdentificacion(this.tipoidentificacionReturnGeneral,this.tipoidentificacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoIdentificacion(classes,this.tipoidentificacionReturnGeneral,this.tipoidentificacionBean,false);
					}
						
					if(this.tipoidentificacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoIdentificacion(this.tipoidentificacionReturnGeneral.getTipoIdentificacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoIdentificacion(this.tipoidentificacionReturnGeneral.getTipoIdentificacion());	
					}
						
					if(this.tipoidentificacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoIdentificacion(this.tipoidentificacionReturnGeneral.getTipoIdentificacion(),classes);//this.tipoidentificacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoIdentificacion(this.tipoidentificacion,classes);//this.tipoidentificacionBean);									
				}
			
				if(TipoIdentificacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoIdentificacion(this.tipoidentificacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIdentificacion(this.tipoidentificacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoidentificacionAnterior!=null) {
						this.tipoidentificacion=this.tipoidentificacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoidentificacionReturnGeneral=tipoidentificacionLogic.procesarEventosTipoIdentificacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoidentificacionLogic.getTipoIdentificacions(),this.tipoidentificacion,this.tipoidentificacionParameterGeneral,this.isEsNuevoTipoIdentificacion,classes);//this.tipoidentificacionLogic.getTipoIdentificacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoidentificacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoidentificacionReturnGeneral.getTipoIdentificacion(),tipoidentificacionLogic.getTipoIdentificacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoidentificacionReturnGeneral.getTipoIdentificacion(),this.tipoidentificacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoIdentificacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoIdentificacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoIdentificacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoIdentificacion() throws Exception {
		
		TipoIdentificacionModel tipoidentificacionModel=(TipoIdentificacionModel)this.jTableDatosTipoIdentificacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoidentificacionModel.tipoidentificacions=this.tipoidentificacionLogic.getTipoIdentificacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoidentificacionModel.tipoidentificacions=this.tipoidentificacions;
		}
		
		
		((TipoIdentificacionModel) this.jTableDatosTipoIdentificacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoIdentificacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoidentificacionAnterior(),this.tipoidentificacionLogic.getTipoIdentificacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoidentificacionAnterior(),this.tipoidentificacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoIdentificacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoIdentificacion(TipoIdentificacion tipoidentificacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Conyuge.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.setConyuges(tipoidentificacion.getConyuges());
					this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.inicializarActualizarBindingTablaConyuge(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cobrador.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.setCobradors(tipoidentificacion.getCobradors());
					this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.inicializarActualizarBindingTablaCobrador(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RepresentanteLegal.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.setRepresentanteLegals(tipoidentificacion.getRepresentanteLegals());
					this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.inicializarActualizarBindingTablaRepresentanteLegal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(tipoidentificacion.getSubClientes());
					this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accionista.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(tipoidentificacion.getAccionistas());
					this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccionista(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipoidentificacion.getClientes());
					this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(tipoidentificacion.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoidentificacion,new Object(),generalEntityParameterGeneral,this.tipoidentificacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoIdentificacionConstantesFunciones.getClassesRelationshipsOfTipoIdentificacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoIdentificacionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoIdentificacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoIdentificacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoIdentificacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoidentificacion,new Object(),generalEntityParameterGeneral,this.tipoidentificacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoIdentificacion(TipoIdentificacionBean tipoidentificacionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Conyuge.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.setConyuges(tipoidentificacion.getConyuges());
					this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.inicializarActualizarBindingTablaConyuge(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cobrador.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.setCobradors(tipoidentificacion.getCobradors());
					this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.inicializarActualizarBindingTablaCobrador(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RepresentanteLegal.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.setRepresentanteLegals(tipoidentificacion.getRepresentanteLegals());
					this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.inicializarActualizarBindingTablaRepresentanteLegal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(tipoidentificacion.getSubClientes());
					this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accionista.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(tipoidentificacion.getAccionistas());
					this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccionista(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipoidentificacion.getClientes());
					this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(tipoidentificacion.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoIdentificacion(ArrayList<Classe> classes,TipoIdentificacionReturnGeneral tipoidentificacionReturnGeneral,TipoIdentificacionBean tipoidentificacionBean,Boolean conDefault) throws Exception {
		
			this.tipoidentificacionBean.setConyuges(tipoidentificacionReturnGeneral.getTipoIdentificacion().getConyuges());
			this.tipoidentificacionBean.setCobradors(tipoidentificacionReturnGeneral.getTipoIdentificacion().getCobradors());
			this.tipoidentificacionBean.setRepresentanteLegals(tipoidentificacionReturnGeneral.getTipoIdentificacion().getRepresentanteLegals());
			this.tipoidentificacionBean.setSubClientes(tipoidentificacionReturnGeneral.getTipoIdentificacion().getSubClientes());
			this.tipoidentificacionBean.setAccionistas(tipoidentificacionReturnGeneral.getTipoIdentificacion().getAccionistas());
			this.tipoidentificacionBean.setClientes(tipoidentificacionReturnGeneral.getTipoIdentificacion().getClientes());
			this.tipoidentificacionBean.setParametroCarteraDefectos(tipoidentificacionReturnGeneral.getTipoIdentificacion().getParametroCarteraDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoIdentificacion(TipoIdentificacion tipoidentificacion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Conyuge.class)) {
					tipoidentificacion.setConyuges(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeBeanSwingJInternalFrame.conyugeLogic.getConyuges());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cobrador.class)) {
					tipoidentificacion.setCobradors(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorBeanSwingJInternalFrame.cobradorLogic.getCobradors());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RepresentanteLegal.class)) {
					tipoidentificacion.setRepresentanteLegals(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalBeanSwingJInternalFrame.representantelegalLogic.getRepresentanteLegals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					tipoidentificacion.setSubClientes(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accionista.class)) {
					tipoidentificacion.setAccionistas(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					tipoidentificacion.setClientes(this.jInternalFrameDetalleFormTipoIdentificacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					tipoidentificacion.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoidentificacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoIdentificacion = new TipoIdentificacionDetalleFormJInternalFrame(jDesktopPane,this.tipoidentificacionSessionBean.getConGuardarRelaciones(),this.tipoidentificacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIdentificacion);
		this.jInternalFrameDetalleFormTipoIdentificacion.setVisible(false);
		this.jInternalFrameDetalleFormTipoIdentificacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoIdentificacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoIdentificacion.tipoidentificacionLogic=this.tipoidentificacionLogic;
		
		this.cargarCombosFrameForeignKeyTipoIdentificacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIdentificacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIdentificacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoIdentificacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoIdentificacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoIdentificacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIdentificacion"));
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"ModificarTipoIdentificacion"));

		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarToolBarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIdentificacion"));
					
		this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemModificarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIdentificacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoIdentificacion"));
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarToolBarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIdentificacion"));
						
		this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemActualizarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIdentificacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"EliminarTipoIdentificacion"));
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIdentificacion"));
								
		this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemEliminarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIdentificacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"CancelarTipoIdentificacion"));
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIdentificacion"));
					
		this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemCancelarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIdentificacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemDetalleCerrarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIdentificacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIdentificacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIdentificacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIdentificacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonidTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIdentificacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtoncodigoTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIdentificacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonnombreTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIdentificacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIdentificacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoIdentificacion"));
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIdentificacion"));
		}
		
		this.jTableDatosTipoIdentificacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoIdentificacion"));
		
		this.jTableDatosTipoIdentificacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoIdentificacion"));
		
		this.jButtonNuevoTipoIdentificacion.addActionListener(new ButtonActionListener(this,"NuevoTipoIdentificacion"));
		
		this.jButtonDuplicarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"DuplicarTipoIdentificacion"));
		
		this.jButtonCopiarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"CopiarTipoIdentificacion"));
		
		this.jButtonVerFormTipoIdentificacion.addActionListener(new ButtonActionListener(this,"VerFormTipoIdentificacion"));
		
		
		this.jButtonNuevoToolBarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoIdentificacion"));
			
		this.jButtonDuplicarToolBarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoIdentificacion"));
			
		this.jMenuItemNuevoTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoIdentificacion"));
			
		this.jMenuItemDuplicarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoIdentificacion"));		
		
		
		this.jButtonNuevoRelacionesTipoIdentificacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoIdentificacion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoIdentificacion"));
			
		this.jMenuItemNuevoRelacionesTipoIdentificacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoIdentificacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"ModificarTipoIdentificacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonModificarToolBarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIdentificacion"));
			
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemModificarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIdentificacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoIdentificacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonActualizarToolBarTipoIdentificacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIdentificacion"));
				
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemActualizarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIdentificacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"EliminarTipoIdentificacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonEliminarToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIdentificacion"));
						
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemEliminarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIdentificacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"CancelarTipoIdentificacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonCancelarToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIdentificacion"));
			
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemCancelarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIdentificacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoIdentificacion"));		
		
		
		this.jButtonCerrarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"CerrarTipoIdentificacion"));
		
		
		this.jButtonCerrarToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoIdentificacion"));
			
		this.jMenuItemCerrarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoIdentificacion"));
			
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jMenuItemDetalleCerrarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIdentificacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoIdentificacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIdentificacion"));
		}
		
		this.jButtonCopiarToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoIdentificacion"));
			
		this.jButtonVerFormToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoIdentificacion"));
		
		this.jMenuItemGuardarCambiosTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoIdentificacion"));
			
		this.jMenuItemCopiarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoIdentificacion"));		
		
		this.jMenuItemVerFormTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoIdentificacion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIdentificacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoIdentificacion"));
			
		this.jMenuItemGuardarCambiosTablaTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIdentificacion"));		
		
		
		
		this.jButtonRecargarInformacionTipoIdentificacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoIdentificacion"));
					
		this.jButtonRecargarInformacionToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoIdentificacion"));
		
		this.jMenuItemRecargarInformacionTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoIdentificacion"));		
		
		
		
		this.jButtonAnterioresTipoIdentificacion.addActionListener (new ButtonActionListener(this,"AnterioresTipoIdentificacion"));
		
		
		this.jButtonAnterioresToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoIdentificacion"));
		
		this.jMenuItemAnterioresTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoIdentificacion"));		
		
		
		this.jButtonSiguientesTipoIdentificacion.addActionListener (new ButtonActionListener(this,"SiguientesTipoIdentificacion"));
		
		
		this.jButtonSiguientesToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoIdentificacion"));
			
		this.jMenuItemSiguientesTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoIdentificacion"));
			
		this.jMenuItemAbrirOrderByTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoIdentificacion"));
			
		this.jMenuItemMostrarOcultarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoIdentificacion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoIdentificacion"));
			
		this.jMenuItemDetalleMostarOcultarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoIdentificacion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoIdentificacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoIdentificacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoIdentificacion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoIdentificacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoIdentificacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoIdentificacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoIdentificacion"));

		this.jCheckBoxSeleccionadosTipoIdentificacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoIdentificacion"));
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIdentificacion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoIdentificacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoIdentificacion"));
			
		this.jComboBoxTiposAccionesTipoIdentificacion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoIdentificacion"));
					
		this.jComboBoxTiposSeleccionarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoIdentificacion"));
			
		this.jTextFieldValorCampoGeneralTipoIdentificacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoIdentificacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonidTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIdentificacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtoncodigoTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIdentificacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonnombreTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIdentificacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoIdentificacion!=null) {
				this.jInternalFrameReporteDinamicoTipoIdentificacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIdentificacion"));
				this.jInternalFrameReporteDinamicoTipoIdentificacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIdentificacion"));
				this.jInternalFrameReporteDinamicoTipoIdentificacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIdentificacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoIdentificacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIdentificacion"));				
			//this.jButtonGenerarReporteDinamicoTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIdentificacion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoIdentificacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIdentificacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoIdentificacion!=null) {
				this.jInternalFrameImportacionTipoIdentificacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIdentificacion"));
				this.jInternalFrameImportacionTipoIdentificacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIdentificacion"));
				this.jInternalFrameImportacionTipoIdentificacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIdentificacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoIdentificacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoIdentificacion"));
			
			this.jButtonAbrirOrderByToolBarTipoIdentificacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoIdentificacion"));			
			
			if(this.jInternalFrameOrderByTipoIdentificacion!=null) {
				this.jInternalFrameOrderByTipoIdentificacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIdentificacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIdentificacion.jTabbedPaneRelacionesTipoIdentificacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIdentificacion"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameTipoIdentificacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoIdentificacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoIdentificacion = (JInternalFrameBase)event.getSource();
	            	
	            TipoIdentificacionBeanSwingJInternalFrame jInternalFrameParent=(TipoIdentificacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIdentificacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoIdentificacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoIdentificacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoIdentificacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoIdentificacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoIdentificacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIdentificacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIdentificacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIdentificacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoIdentificacion";
		inputMap = this.jButtonNuevoTipoIdentificacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoIdentificacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIdentificacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIdentificacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIdentificacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIdentificacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoIdentificacion";
		inputMap = this.jButtonNuevoRelacionesTipoIdentificacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoIdentificacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIdentificacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoIdentificacion";
		inputMap = this.jButtonModificarTipoIdentificacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoIdentificacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoIdentificacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoIdentificacion";
		inputMap = this.jButtonActualizarTipoIdentificacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoIdentificacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoIdentificacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoIdentificacion";
		inputMap = this.jButtonEliminarTipoIdentificacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoIdentificacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoIdentificacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoIdentificacion";
		inputMap = this.jButtonCancelarTipoIdentificacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoIdentificacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoIdentificacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoIdentificacion";
		inputMap = this.jButtonCerrarTipoIdentificacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoIdentificacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoIdentificacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoIdentificacion";
		inputMap = this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosTipoIdentificacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonGuardarCambiosTipoIdentificacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoIdentificacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoIdentificacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoIdentificacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoIdentificacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoIdentificacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoIdentificacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoIdentificacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoIdentificacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoIdentificacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonidTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIdentificacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtoncodigoTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIdentificacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIdentificacion.jButtonnombreTipoIdentificacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIdentificacionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoIdentificacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoIdentificacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoIdentificacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoIdentificacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoIdentificacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
					tipoidentificacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIdentificacion tipoidentificacionAux:tipoidentificacions) {
					tipoidentificacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoIdentificacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIdentificacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
						tipoidentificacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIdentificacion tipoidentificacionAux:tipoidentificacions) {
						tipoidentificacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIdentificacion tipoidentificacionAux:tipoidentificacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIdentificacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIdentificacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIdentificacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIdentificacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoIdentificacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIdentificacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoIdentificacion.getSelectedRows();
			
			TipoIdentificacion tipoidentificacionLocal=new TipoIdentificacion();
			
			//this.seleccionarTodosTipoIdentificacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLocal =(TipoIdentificacion) this.tipoidentificacionLogic.getTipoIdentificacions().toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoidentificacionLocal =(TipoIdentificacion) this.tipoidentificacions.toArray()[this.jTableDatosTipoIdentificacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoidentificacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
						tipoidentificacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIdentificacion tipoidentificacionAux:tipoidentificacions) {
						tipoidentificacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoIdentificacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIdentificacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIdentificacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIdentificacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoIdentificacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoIdentificacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoIdentificacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoIdentificacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoIdentificacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacionLogic.getTipoIdentificacions()) {
				
						if(sTipoSeleccionar.equals(TipoIdentificacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoidentificacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoIdentificacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoidentificacionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIdentificacion tipoidentificacionAux:tipoidentificacions) {
					
						if(sTipoSeleccionar.equals(TipoIdentificacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoidentificacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoIdentificacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoidentificacionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIdentificacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoIdentificacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoIdentificacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoIdentificacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoIdentificacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoIdentificacion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoIdentificacion(conSplash);
				
					this.generarReporteTipoIdentificacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoIdentificacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIdentificacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIdentificacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIdentificacion();
				
				this.exportarTipoIdentificacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoIdentificacions();
				//this.importarTipoIdentificacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIdentificacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoIdentificacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Identificacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoIdentificacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoIdentificacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoIdentificacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoIdentificacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoIdentificacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoIdentificacion(conSplash);
					
						//this.actualizarParametrosGeneralTipoIdentificacion();
						
						this.generarReporteProcesoAccionTipoIdentificacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoIdentificacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo IdentificacionES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Identificacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoIdentificacion();
				
						this.actualizarParametrosGeneralTipoIdentificacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoidentificacionReturnGeneral=tipoidentificacionLogic.procesarAccionTipoIdentificacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoidentificacionLogic.getTipoIdentificacions(),this.tipoidentificacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoIdentificacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoIdentificacion();
					
					TipoIdentificacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoIdentificacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoIdentificacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoIdentificacion.jComboBoxTiposAccionesFormularioTipoIdentificacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoIdentificacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoIdentificacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoIdentificacion();
			
			if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		
			TipoIdentificacion tipoidentificacion=new TipoIdentificacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoIdentificacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoIdentificacion.getSelectedItem();
			
			
			
			
			tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoidentificacionsSeleccionados.size()==1) {
				for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsSeleccionados) {
					tipoidentificacion=tipoidentificacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Conyuge")) {
					jButtonConyugeActionPerformed(null,rowIndex,true,false,tipoidentificacion);
				}
				else if(this.sTipoRelacion.equals("Cobrador")) {
					jButtonCobradorActionPerformed(null,rowIndex,true,false,tipoidentificacion);
				}
				else if(this.sTipoRelacion.equals("Representante Legal")) {
					jButtonRepresentanteLegalActionPerformed(null,rowIndex,true,false,tipoidentificacion);
				}
				else if(this.sTipoRelacion.equals("Sub Cliente")) {
					jButtonSubClienteActionPerformed(null,rowIndex,true,false,tipoidentificacion);
				}
				else if(this.sTipoRelacion.equals("Accionista")) {
					jButtonAccionistaActionPerformed(null,rowIndex,true,false,tipoidentificacion);
				}
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,tipoidentificacion);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,tipoidentificacion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoIdentificacion();
			
      		//this.finishProcessTipoIdentificacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoIdentificacionReturnGeneral() throws Exception {
		if(this.tipoidentificacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoidentificacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoidentificacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoidentificacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoidentificacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoidentificacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoIdentificacion(false);
		}
		
		if(this.tipoidentificacionReturnGeneral.getConRetornoLista() || this.tipoidentificacionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoidentificacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoidentificacionLogic.setTipoIdentificacions(this.tipoidentificacionReturnGeneral.getTipoIdentificacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoidentificacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoidentificacionLogic.setTipoIdentificacion(this.tipoidentificacionReturnGeneral.getTipoIdentificacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoIdentificacion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoIdentificacion() throws Exception {
		
		
	}
	
	public ArrayList<TipoIdentificacion> getTipoIdentificacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoIdentificacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionLogic.getTipoIdentificacions()) {
					if(tipoidentificacionAux.getIsSelected()) {
						tipoidentificacionsSeleccionados.add(tipoidentificacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIdentificacion tipoidentificacionAux:this.tipoidentificacions) {
					if(tipoidentificacionAux.getIsSelected()) {
						tipoidentificacionsSeleccionados.add(tipoidentificacionAux);				
					}
				}
			}
			
			if(tipoidentificacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoidentificacionsSeleccionados.addAll(this.tipoidentificacionLogic.getTipoIdentificacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoidentificacionsSeleccionados.addAll(this.tipoidentificacions);				
					}
				}
			}
		} else {
			tipoidentificacionsSeleccionados.add(this.tipoidentificacion);
		}
		
		return tipoidentificacionsSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteTipoIdentificacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoIdentificacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoIdentificacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIdentificacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIdentificacionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoIdentificacionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Identificacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoIdentificacionsSeleccionados() throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoIdentificacions("Todos",tipoidentificacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoIdentificacionsSeleccionados() throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoIdentificacions("Todos",tipoidentificacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoIdentificacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoIdentificacions("Todos",tipoidentificacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoIdentificacionsSeleccionados() throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoIdentificacion();
		
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoIdentificacion();
		
		
		//this.generarReporteTipoIdentificacions("Todos",tipoidentificacionsSeleccionados ,tipoidentificacionImplementable,tipoidentificacionImplementableHome);
	}
	
	public void mostrarImportacionTipoIdentificacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoIdentificacion();
		
		this.abrirFrameImportacionTipoIdentificacion();		
		
			
		//this.generarReporteTipoIdentificacions("Todos",tipoidentificacionsSeleccionados ,tipoidentificacionImplementable,tipoidentificacionImplementableHome);
	}
	
	public void importarTipoIdentificacions() throws Exception {		
	
	}
	
	public void exportarTipoIdentificacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoIdentificacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoIdentificacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoIdentificacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Identificacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoIdentificacionsSeleccionados() throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoidentificacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoIdentificacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoIdentificacion(tipoidentificacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoidentificacionAux.setsDetalleGeneralEntityReporte(tipoidentificacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoIdentificacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoIdentificacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIdentificacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIdentificacionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIdentificacionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoIdentificacion(TipoIdentificacion tipoidentificacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoidentificacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoidentificacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoidentificacion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoidentificacion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoIdentificacionsSeleccionados() throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoidentificacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoIdentificacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoIdentificacion(row);				
				iRow++;
			}				
			
			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoIdentificacion(tipoidentificacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoIdentificacionsSeleccionados() throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();		
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoidentificacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoidentificacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoidentificacion");
			//elementRoot.appendChild(element);
		
			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsSeleccionados) {
				element = document.createElement("tipoidentificacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoIdentificacion(tipoidentificacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Identificacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoIdentificacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIdentificacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIdentificacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoIdentificacionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIdentificacionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoIdentificacion(TipoIdentificacion tipoidentificacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoidentificacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoidentificacion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoidentificacion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoIdentificacion(TipoIdentificacion tipoidentificacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoIdentificacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoidentificacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoIdentificacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoidentificacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoIdentificacionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoidentificacion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoIdentificacionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoidentificacion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoIdentificacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados=new ArrayList<TipoIdentificacion>();
		
		tipoidentificacionsSeleccionados=this.getTipoIdentificacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoTipoIdentificacion(tipoidentificacionsSeleccionados);
		
		this.generarReporteTipoIdentificacions("Todos",tipoidentificacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoIdentificacion(ArrayList<TipoIdentificacion> tipoidentificacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsSeleccionados) {
				tipoidentificacionAux.setsDetalleGeneralEntityReporte(tipoidentificacionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoIdentificacionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoidentificacionAux.setsDescripcionGeneralEntityReporte1(tipoidentificacionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoIdentificacionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoidentificacionAux.setsDescripcionGeneralEntityReporte1(tipoidentificacionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIdentificacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoIdentificacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoIdentificacion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoIdentificacion=false;
			this.isVisibilidadCeldaActualizarTipoIdentificacion=false;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=false;
			this.isVisibilidadCeldaCancelarTipoIdentificacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoIdentificacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;
			this.isVisibilidadCeldaModificarTipoIdentificacion=false;
			this.isVisibilidadCeldaActualizarTipoIdentificacion=true;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=false;
			this.isVisibilidadCeldaCancelarTipoIdentificacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoIdentificacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;
			this.isVisibilidadCeldaModificarTipoIdentificacion=false;
			this.isVisibilidadCeldaActualizarTipoIdentificacion=true;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=true;
			this.isVisibilidadCeldaCancelarTipoIdentificacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoIdentificacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;
			this.isVisibilidadCeldaModificarTipoIdentificacion=false;
			this.isVisibilidadCeldaActualizarTipoIdentificacion=true;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=false;
			this.isVisibilidadCeldaCancelarTipoIdentificacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoIdentificacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=true;
			this.isVisibilidadCeldaModificarTipoIdentificacion=false;
			this.isVisibilidadCeldaActualizarTipoIdentificacion=false;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=false;
			this.isVisibilidadCeldaCancelarTipoIdentificacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoIdentificacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;
			this.isVisibilidadCeldaActualizarTipoIdentificacion=false;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=false;
			this.isVisibilidadCeldaCancelarTipoIdentificacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoIdentificacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;
			this.isVisibilidadCeldaModificarTipoIdentificacion=true;
			this.isVisibilidadCeldaActualizarTipoIdentificacion=false;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=false;
			this.isVisibilidadCeldaCancelarTipoIdentificacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIdentificacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoIdentificacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=true;
		} else {
			this.actualizarEstadoPanelsTipoIdentificacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoIdentificacion=false;
			//this.isVisibilidadCeldaVerFormTipoIdentificacion=false;
			this.isVisibilidadCeldaDuplicarTipoIdentificacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoidentificacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoIdentificacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			if(!tipoidentificacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;												
			}
			
			this.jButtonCerrarTipoIdentificacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIdentificacion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoidentificacion)) {
			this.isVisibilidadCeldaActualizarTipoIdentificacion=false;
			this.isVisibilidadCeldaEliminarTipoIdentificacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIdentificacion() {
		this.isVisibilidadCeldaNuevoTipoIdentificacion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoIdentificacion=false;
	}
	
	public void actualizarEstadoPanelsTipoIdentificacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoIdentificacion!=null) {
				this.jScrollPanelDatosEdicionTipoIdentificacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIdentificacion!=null) {
				this.jScrollPanelDatosTipoIdentificacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIdentificacion!=null) {
				this.jPanelPaginacionTipoIdentificacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIdentificacion!=null) {
				this.jPanelParametrosReportesTipoIdentificacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoIdentificacion!=null) {
				this.jScrollPanelDatosEdicionTipoIdentificacion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoIdentificacion!=null) {
				this.jScrollPanelDatosTipoIdentificacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIdentificacion!=null) {
				this.jPanelPaginacionTipoIdentificacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIdentificacion!=null) {
				this.jPanelParametrosReportesTipoIdentificacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoIdentificacion!=null) {
				this.jScrollPanelDatosEdicionTipoIdentificacion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoIdentificacion!=null) {
				this.jScrollPanelDatosTipoIdentificacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIdentificacion!=null) {
				this.jPanelPaginacionTipoIdentificacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIdentificacion!=null) {
				this.jPanelParametrosReportesTipoIdentificacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoIdentificacion!=null) {
				this.jScrollPanelDatosEdicionTipoIdentificacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoIdentificacion!=null) {
				this.jScrollPanelDatosTipoIdentificacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIdentificacion!=null) {
				this.jPanelPaginacionTipoIdentificacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIdentificacion!=null) {
				this.jPanelParametrosReportesTipoIdentificacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoIdentificacion!=null) {
				this.jScrollPanelDatosEdicionTipoIdentificacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIdentificacion!=null) {
				this.jScrollPanelDatosTipoIdentificacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIdentificacion!=null) {
				this.jPanelPaginacionTipoIdentificacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIdentificacion!=null) {
				this.jPanelParametrosReportesTipoIdentificacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoIdentificacion!=null) {
				this.jScrollPanelDatosEdicionTipoIdentificacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoIdentificacion!=null) {
				this.jScrollPanelDatosTipoIdentificacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIdentificacion!=null) {
				this.jPanelPaginacionTipoIdentificacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIdentificacion!=null) {
				this.jPanelParametrosReportesTipoIdentificacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoIdentificacion!=null) {
				this.jScrollPanelDatosEdicionTipoIdentificacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoIdentificacion!=null) {
				this.jScrollPanelDatosTipoIdentificacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIdentificacion!=null) {
				this.jPanelPaginacionTipoIdentificacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIdentificacion!=null) {
				this.jPanelParametrosReportesTipoIdentificacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoIdentificacionParaConyuges() throws Exception {
		Boolean isPaginaPopupConyuge=false;

		try {

			if(this.tipoidentificacionSessionBean==null) {
				this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean=new ConyugeSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean.setsPathNavegacionActual(tipoidentificacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ConyugeConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupConyuge=this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeConyuge(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeConyuge(TipoIdentificacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.conyugeSessionBean.setlidTipoIdentificacionActual(this.idTipoIdentificacionActual);

			tipoidentificacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion(true);
			tipoidentificacionSessionBean.setlIdTipoIdentificacionActualForeignKey(this.idTipoIdentificacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoIdentificacionParaCobradores() throws Exception {
		Boolean isPaginaPopupCobrador=false;

		try {

			if(this.tipoidentificacionSessionBean==null) {
				this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean=new CobradorSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean.setsPathNavegacionActual(tipoidentificacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CobradorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCobrador=this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCobrador(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrador(TipoIdentificacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.cobradorSessionBean.setlidTipoIdentificacionActual(this.idTipoIdentificacionActual);

			tipoidentificacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion(true);
			tipoidentificacionSessionBean.setlIdTipoIdentificacionActualForeignKey(this.idTipoIdentificacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoIdentificacionParaRepresentanteLegales() throws Exception {
		Boolean isPaginaPopupRepresentanteLegal=false;

		try {

			if(this.tipoidentificacionSessionBean==null) {
				this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean=new RepresentanteLegalSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean.setsPathNavegacionActual(tipoidentificacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RepresentanteLegalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRepresentanteLegal=this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRepresentanteLegal(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRepresentanteLegal(TipoIdentificacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.representantelegalSessionBean.setlidTipoIdentificacionActual(this.idTipoIdentificacionActual);

			tipoidentificacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion(true);
			tipoidentificacionSessionBean.setlIdTipoIdentificacionActualForeignKey(this.idTipoIdentificacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoIdentificacionParaSubClientes() throws Exception {
		Boolean isPaginaPopupSubCliente=false;

		try {

			if(this.tipoidentificacionSessionBean==null) {
				this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean=new SubClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean.setsPathNavegacionActual(tipoidentificacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubCliente=this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubCliente(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente(TipoIdentificacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.subclienteSessionBean.setlidTipoIdentificacionActual(this.idTipoIdentificacionActual);

			tipoidentificacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion(true);
			tipoidentificacionSessionBean.setlIdTipoIdentificacionActualForeignKey(this.idTipoIdentificacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoIdentificacionParaAccionistas() throws Exception {
		Boolean isPaginaPopupAccionista=false;

		try {

			if(this.tipoidentificacionSessionBean==null) {
				this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean=new AccionistaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean.setsPathNavegacionActual(tipoidentificacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AccionistaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAccionista=this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAccionista(false);
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista(TipoIdentificacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.accionistaSessionBean.setlidTipoIdentificacionActual(this.idTipoIdentificacionActual);

			tipoidentificacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion(true);
			tipoidentificacionSessionBean.setlIdTipoIdentificacionActualForeignKey(this.idTipoIdentificacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoIdentificacionParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.tipoidentificacionSessionBean==null) {
				this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean.setsPathNavegacionActual(tipoidentificacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TipoIdentificacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.clienteSessionBean.setlidTipoIdentificacionActual(this.idTipoIdentificacionActual);

			tipoidentificacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion(true);
			tipoidentificacionSessionBean.setlIdTipoIdentificacionActualForeignKey(this.idTipoIdentificacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoIdentificacionParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.tipoidentificacionSessionBean==null) {
				this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean.setsPathNavegacionActual(tipoidentificacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(TipoIdentificacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
			this.jInternalFrameDetalleFormTipoIdentificacion.parametrocarteradefectoSessionBean.setlidTipoIdentificacionActual(this.idTipoIdentificacionActual);

			tipoidentificacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion(true);
			tipoidentificacionSessionBean.setlIdTipoIdentificacionActualForeignKey(this.idTipoIdentificacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoIdentificacionSessionBean tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
		
		if(this.tipoidentificacionSessionBean==null) {
			this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
		}
		
		this.tipoidentificacionSessionBean.setsUltimaBusquedaTipoIdentificacion(this.getsAccionBusqueda());
		this.tipoidentificacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoidentificacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoIdentificacionSessionBean tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
		
		if(this.tipoidentificacionSessionBean==null) {
			this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
		}
		
		if(this.tipoidentificacionSessionBean.getsUltimaBusquedaTipoIdentificacion()!=null&&!this.tipoidentificacionSessionBean.getsUltimaBusquedaTipoIdentificacion().equals("")) {
			this.setsAccionBusqueda(tipoidentificacionSessionBean.getsUltimaBusquedaTipoIdentificacion());
			this.setiNumeroPaginacion(tipoidentificacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoidentificacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoidentificacionSessionBean.setsUltimaBusquedaTipoIdentificacion("");
		this.tipoidentificacionSessionBean.setiNumeroPaginacion(TipoIdentificacionConstantesFunciones.INUMEROPAGINACION);
		this.tipoidentificacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoIdentificacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoIdentificacion() {
		this.updateBorderResaltarBusquedasFormularioTipoIdentificacion();
		this.updateVisibilidadBusquedasFormularioTipoIdentificacion();
		this.updateHabilitarBusquedasFormularioTipoIdentificacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoIdentificacion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoIdentificacion() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoIdentificacion() {
	}
	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioTipoIdentificacion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoIdentificacion();
		this.updateVisibilidadResaltarControlesFormularioTipoIdentificacion();
		this.updateHabilitarResaltarControlesFormularioTipoIdentificacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoIdentificacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoidentificacionConstantesFunciones.resaltaridTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion!=null) {this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.setBorder(this.tipoidentificacionConstantesFunciones.resaltaridTipoIdentificacion);}
		if(this.tipoidentificacionConstantesFunciones.resaltarcodigoTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion!=null) {this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldcodigoTipoIdentificacion.setBorder(this.tipoidentificacionConstantesFunciones.resaltarcodigoTipoIdentificacion);}
		if(this.tipoidentificacionConstantesFunciones.resaltarnombreTipoIdentificacion!=null && this.jInternalFrameDetalleFormTipoIdentificacion!=null) {this.jInternalFrameDetalleFormTipoIdentificacion.jTextAreanombreTipoIdentificacion.setBorder(this.tipoidentificacionConstantesFunciones.resaltarnombreTipoIdentificacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoIdentificacion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
	
		//this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.setVisible(this.tipoidentificacionConstantesFunciones.mostraridTipoIdentificacion);
		this.jInternalFrameDetalleFormTipoIdentificacion.jPanelidTipoIdentificacion.setVisible(this.tipoidentificacionConstantesFunciones.mostraridTipoIdentificacion);
		//this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldcodigoTipoIdentificacion.setVisible(this.tipoidentificacionConstantesFunciones.mostrarcodigoTipoIdentificacion);
		this.jInternalFrameDetalleFormTipoIdentificacion.jPanelcodigoTipoIdentificacion.setVisible(this.tipoidentificacionConstantesFunciones.mostrarcodigoTipoIdentificacion);
		//this.jInternalFrameDetalleFormTipoIdentificacion.jTextAreanombreTipoIdentificacion.setVisible(this.tipoidentificacionConstantesFunciones.mostrarnombreTipoIdentificacion);
		this.jInternalFrameDetalleFormTipoIdentificacion.jPanelnombreTipoIdentificacion.setVisible(this.tipoidentificacionConstantesFunciones.mostrarnombreTipoIdentificacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoIdentificacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIdentificacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIdentificacion!=null) {
	
		this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldidTipoIdentificacion.setEnabled(this.tipoidentificacionConstantesFunciones.activaridTipoIdentificacion);
		this.jInternalFrameDetalleFormTipoIdentificacion.jTextFieldcodigoTipoIdentificacion.setEnabled(this.tipoidentificacionConstantesFunciones.activarcodigoTipoIdentificacion);
		this.jInternalFrameDetalleFormTipoIdentificacion.jTextAreanombreTipoIdentificacion.setEnabled(this.tipoidentificacionConstantesFunciones.activarnombreTipoIdentificacion);
		}
	}
	
		
}