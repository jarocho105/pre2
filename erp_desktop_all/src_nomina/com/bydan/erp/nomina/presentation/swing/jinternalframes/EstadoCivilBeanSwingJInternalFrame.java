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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.EstadoCivilConstantesFunciones;
import com.bydan.erp.nomina.util.EstadoCivilParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EstadoCivilParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EstadoCivilBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoCivilBeanSwingJInternalFrame extends EstadoCivilJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoCivilBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoCivil> estadocivilValidator = new ClassValidator<EstadoCivil>(EstadoCivil.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoCivil estadocivil;	
	public EstadoCivil estadocivilAux;
	public EstadoCivil estadocivilAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoCivil estadocivilTotales;
	public Long idEstadoCivilActual;
	public Long iIdNuevoEstadoCivil=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosCargaFamiliar_NM=false;

	public Boolean getIsTienePermisosCargaFamiliar_NM() {
		return isTienePermisosCargaFamiliar_NM;
	}

	public void setIsTienePermisosCargaFamiliar_NM(Boolean isTienePermisosCargaFamiliar_NM) {
		this.isTienePermisosCargaFamiliar_NM= isTienePermisosCargaFamiliar_NM;
	}


	public Boolean isTienePermisosSubCliente=false;

	public Boolean getIsTienePermisosSubCliente() {
		return isTienePermisosSubCliente;
	}

	public void setIsTienePermisosSubCliente(Boolean isTienePermisosSubCliente) {
		this.isTienePermisosSubCliente= isTienePermisosSubCliente;
	}


	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
	}


	public Boolean isTienePermisosCargaFamiliar=false;

	public Boolean getIsTienePermisosCargaFamiliar() {
		return isTienePermisosCargaFamiliar;
	}

	public void setIsTienePermisosCargaFamiliar(Boolean isTienePermisosCargaFamiliar) {
		this.isTienePermisosCargaFamiliar= isTienePermisosCargaFamiliar;
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
	
	public Boolean isPermisoTodoEstadoCivil;
	public Boolean isPermisoNuevoEstadoCivil;
	public Boolean isPermisoActualizarEstadoCivil;
	public Boolean isPermisoActualizarOriginalEstadoCivil;
	public Boolean isPermisoEliminarEstadoCivil;
	public Boolean isPermisoGuardarCambiosEstadoCivil;
	public Boolean isPermisoConsultaEstadoCivil;
	public Boolean isPermisoBusquedaEstadoCivil;
	public Boolean isPermisoReporteEstadoCivil;
	public Boolean isPermisoPaginacionMedioEstadoCivil;
	public Boolean isPermisoPaginacionAltoEstadoCivil;
	public Boolean isPermisoPaginacionTodoEstadoCivil;
	public Boolean isPermisoCopiarEstadoCivil;
	public Boolean isPermisoVerFormEstadoCivil;
	public Boolean isPermisoDuplicarEstadoCivil;
	public Boolean isPermisoOrdenEstadoCivil;
	
	
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
	
	public EstadoCivilParameterReturnGeneral estadocivilReturnGeneral;
	public EstadoCivilParameterReturnGeneral estadocivilParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public CargaFamiliar_NMLogic cargafamiliar_nmLogic=null;

	public CargaFamiliar_NMLogic getCargaFamiliar_NMLogic() {
		return cargafamiliar_nmLogic;
	}

	public void setCargaFamiliar_NMLogic(CargaFamiliar_NMLogic cargafamiliar_nmLogic) {
		this.cargafamiliar_nmLogic = cargafamiliar_nmLogic;
	}


	public SubClienteLogic subclienteLogic=null;

	public SubClienteLogic getSubClienteLogic() {
		return subclienteLogic;
	}

	public void setSubClienteLogic(SubClienteLogic subclienteLogic) {
		this.subclienteLogic = subclienteLogic;
	}


	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}


	public CargaFamiliarLogic cargafamiliarLogic=null;

	public CargaFamiliarLogic getCargaFamiliarLogic() {
		return cargafamiliarLogic;
	}

	public void setCargaFamiliarLogic(CargaFamiliarLogic cargafamiliarLogic) {
		this.cargafamiliarLogic = cargafamiliarLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoCivil=false;
	public Boolean esParaAccionDesdeFormularioEstadoCivil=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoCivilSessionBeanAdditional estadocivilSessionBeanAdditional=null;
	
	public EstadoCivilSessionBeanAdditional getEstadoCivilSessionBeanAdditional() {
		return this.estadocivilSessionBeanAdditional;
	}
	
	public void setEstadoCivilSessionBeanAdditional(EstadoCivilSessionBeanAdditional estadocivilSessionBeanAdditional) {
		try {
			this.estadocivilSessionBeanAdditional=estadocivilSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoCivilBeanSwingJInternalFrameAdditional estadocivilBeanSwingJInternalFrameAdditional=null;
	//public class EstadoCivilBeanSwingJInternalFrame
	
	public EstadoCivilBeanSwingJInternalFrameAdditional getEstadoCivilBeanSwingJInternalFrameAdditional() {
		return this.estadocivilBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoCivilBeanSwingJInternalFrameAdditional(EstadoCivilBeanSwingJInternalFrameAdditional estadocivilBeanSwingJInternalFrameAdditional) {
		try {
			this.estadocivilBeanSwingJInternalFrameAdditional=estadocivilBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoCivilLogic estadocivilLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoCivil estadocivilBean;
	public EstadoCivilConstantesFunciones estadocivilConstantesFunciones;
	//public EstadoCivilParameterReturnGeneral estadocivilReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoCivil> estadocivils;	
	//public List<EstadoCivil> estadocivilsEliminados;
	//public List<EstadoCivil> estadocivilsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoCivil=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoCivil=true;
	public Boolean isVisibilidadCeldaCopiarEstadoCivil=true;
	public Boolean isVisibilidadCeldaVerFormEstadoCivil=true;
	public Boolean isVisibilidadCeldaOrdenEstadoCivil=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
	public Boolean isVisibilidadCeldaModificarEstadoCivil=false;
	public Boolean isVisibilidadCeldaActualizarEstadoCivil=false;
	public Boolean isVisibilidadCeldaEliminarEstadoCivil=false;
	public Boolean isVisibilidadCeldaCancelarEstadoCivil=false;
	public Boolean isVisibilidadCeldaGuardarEstadoCivil=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoCivil=false;	
	
	
	
	public Long getiIdNuevoEstadoCivil() {
		return this.iIdNuevoEstadoCivil;
	}

	public void setiIdNuevoEstadoCivil(Long iIdNuevoEstadoCivil) {
		this.iIdNuevoEstadoCivil = iIdNuevoEstadoCivil;
	}
	
	public Long getidEstadoCivilActual() {
		return this.idEstadoCivilActual;
	}

	public void setidEstadoCivilActual(Long idEstadoCivilActual) {
		this.idEstadoCivilActual = idEstadoCivilActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoCivil getestadocivil() {
		return this.estadocivil;
	}

	public void setestadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}
	
	public EstadoCivil getestadocivilAux() {
		return this.estadocivilAux;
	}

	public void setestadocivilAux(EstadoCivil estadocivilAux) {
		this.estadocivilAux = estadocivilAux;
	}				
	
	public EstadoCivil getestadocivilAnterior() {
		return this.estadocivilAnterior;
	}

	public void setestadocivilAnterior(EstadoCivil estadocivilAnterior) {
		this.estadocivilAnterior = estadocivilAnterior;
	}	
	
	public EstadoCivil getestadocivilTotales() {
		return this.estadocivilTotales;
	}

	public void setestadocivilTotales(EstadoCivil estadocivilTotales) {
		this.estadocivilTotales = estadocivilTotales;
	}	
	
	public EstadoCivil getestadocivilBean() {
		return this.estadocivilBean;
	}

	public void setestadocivilBean(EstadoCivil estadocivilBean) {
		this.estadocivilBean = estadocivilBean;
	}	
	
	public EstadoCivilParameterReturnGeneral getestadocivilReturnGeneral() {
		return this.estadocivilReturnGeneral;
	}

	public void setestadocivilReturnGeneral(EstadoCivilParameterReturnGeneral estadocivilReturnGeneral) {
		this.estadocivilReturnGeneral = estadocivilReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoCivilLogic getEstadoCivilLogic()	{		
		return estadocivilLogic;
	}

	public void setEstadoCivilLogic(EstadoCivilLogic estadocivilLogic) {
		this.estadocivilLogic = estadocivilLogic;
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
	
	public Boolean getIsEsNuevoEstadoCivil() {
		return isEsNuevoEstadoCivil;
	}

	public void setIsEsNuevoEstadoCivil(Boolean isEsNuevoEstadoCivil) {
		this.isEsNuevoEstadoCivil = isEsNuevoEstadoCivil;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoCivil() {
		return esParaAccionDesdeFormularioEstadoCivil;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoCivil(Boolean esParaAccionDesdeFormularioEstadoCivil) {
		this.esParaAccionDesdeFormularioEstadoCivil = esParaAccionDesdeFormularioEstadoCivil;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoCivil() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoCivilConstantesFunciones.refrescarForeignKeysDescripcionesEstadoCivil(this.estadocivilLogic.getEstadoCivils());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoCivilConstantesFunciones.refrescarForeignKeysDescripcionesEstadoCivil(this.estadocivils);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadocivilLogic.setEstadoCivils(this.estadocivils);
			estadocivilLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoCivilParameterReturnGeneral getEstadoCivilParameterGeneral() {
		return this.estadocivilParameterGeneral;
	}
	
	public void setEstadoCivilParameterGeneral(EstadoCivilParameterReturnGeneral estadocivilParameterGeneral) {
		this.estadocivilParameterGeneral = estadocivilParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoCivil() {
		return isPermisoTodoEstadoCivil;
	}

	public void setIsPermisoTodoEstadoCivil(Boolean isPermisoTodoEstadoCivil) {
		this.isPermisoTodoEstadoCivil = isPermisoTodoEstadoCivil;
	}

	public Boolean getIsPermisoNuevoEstadoCivil() {
		return isPermisoNuevoEstadoCivil;
	}

	public void setIsPermisoNuevoEstadoCivil(Boolean isPermisoNuevoEstadoCivil) {
		this.isPermisoNuevoEstadoCivil = isPermisoNuevoEstadoCivil;
	}

	public Boolean getIsPermisoActualizarEstadoCivil() {
		return isPermisoActualizarEstadoCivil;
	}

	public void setIsPermisoActualizarEstadoCivil(Boolean isPermisoActualizarEstadoCivil) {
		this.isPermisoActualizarEstadoCivil = isPermisoActualizarEstadoCivil;
	}

	public Boolean getIsPermisoEliminarEstadoCivil() {
		return isPermisoEliminarEstadoCivil;
	}

	public void setIsPermisoEliminarEstadoCivil(Boolean isPermisoEliminarEstadoCivil) {
		this.isPermisoEliminarEstadoCivil = isPermisoEliminarEstadoCivil;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoCivil() {
		return isPermisoGuardarCambiosEstadoCivil;
	}

	public void setIsPermisoGuardarCambiosEstadoCivil(Boolean isPermisoGuardarCambiosEstadoCivil) {
		this.isPermisoGuardarCambiosEstadoCivil = isPermisoGuardarCambiosEstadoCivil;
	}
	
	public Boolean getIsPermisoConsultaEstadoCivil() {
		return isPermisoConsultaEstadoCivil;
	}

	public void setIsPermisoConsultaEstadoCivil(Boolean isPermisoConsultaEstadoCivil) {
		this.isPermisoConsultaEstadoCivil = isPermisoConsultaEstadoCivil;
	}

	public Boolean getIsPermisoBusquedaEstadoCivil() {
		return isPermisoBusquedaEstadoCivil;
	}

	public void setIsPermisoBusquedaEstadoCivil(Boolean isPermisoBusquedaEstadoCivil) {
		this.isPermisoBusquedaEstadoCivil = isPermisoBusquedaEstadoCivil;
	}

	public Boolean getIsPermisoReporteEstadoCivil() {
		return isPermisoReporteEstadoCivil;
	}

	public void setIsPermisoReporteEstadoCivil(Boolean isPermisoReporteEstadoCivil) {
		this.isPermisoReporteEstadoCivil = isPermisoReporteEstadoCivil;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoCivil() {
		return isPermisoPaginacionMedioEstadoCivil;
	}

	public void setIsPermisoPaginacionMedioEstadoCivil(Boolean isPermisoPaginacionMedioEstadoCivil) {
		this.isPermisoPaginacionMedioEstadoCivil = isPermisoPaginacionMedioEstadoCivil;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoCivil() {
		return isPermisoPaginacionTodoEstadoCivil;
	}

	public void setIsPermisoPaginacionTodoEstadoCivil(Boolean isPermisoPaginacionTodoEstadoCivil) {
		this.isPermisoPaginacionTodoEstadoCivil = isPermisoPaginacionTodoEstadoCivil;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoCivil() {
		return isPermisoPaginacionAltoEstadoCivil;
	}

	public void setIsPermisoPaginacionAltoEstadoCivil(Boolean isPermisoPaginacionAltoEstadoCivil) {
		this.isPermisoPaginacionAltoEstadoCivil = isPermisoPaginacionAltoEstadoCivil;
	}
	
	public Boolean getIsPermisoCopiarEstadoCivil() {
		return isPermisoCopiarEstadoCivil;
	}

	public void setIsPermisoCopiarEstadoCivil(Boolean isPermisoCopiarEstadoCivil) {
		this.isPermisoCopiarEstadoCivil = isPermisoCopiarEstadoCivil;
	}
	
	public Boolean getIsPermisoVerFormEstadoCivil() {
		return isPermisoVerFormEstadoCivil;
	}

	public void setIsPermisoVerFormEstadoCivil(Boolean isPermisoVerFormEstadoCivil) {
		this.isPermisoVerFormEstadoCivil = isPermisoVerFormEstadoCivil;
	}
	
	public Boolean getIsPermisoDuplicarEstadoCivil() {
		return isPermisoDuplicarEstadoCivil;
	}

	public void setIsPermisoDuplicarEstadoCivil(Boolean isPermisoDuplicarEstadoCivil) {
		this.isPermisoDuplicarEstadoCivil = isPermisoDuplicarEstadoCivil;
	}
	
	public Boolean getIsPermisoOrdenEstadoCivil() {
		return isPermisoOrdenEstadoCivil;
	}

	public void setIsPermisoOrdenEstadoCivil(Boolean isPermisoOrdenEstadoCivil) {
		this.isPermisoOrdenEstadoCivil = isPermisoOrdenEstadoCivil;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoCivil() {
		return isVisibilidadCeldaNuevoEstadoCivil;
	}

	public void setIsVisibilidadCeldaNuevoEstadoCivil(Boolean isVisibilidadCeldaNuevoEstadoCivil) {
		this.isVisibilidadCeldaNuevoEstadoCivil = isVisibilidadCeldaNuevoEstadoCivil;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoCivil() {
		return isVisibilidadCeldaDuplicarEstadoCivil;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoCivil(Boolean isVisibilidadCeldaDuplicarEstadoCivil) {
		this.isVisibilidadCeldaDuplicarEstadoCivil = isVisibilidadCeldaDuplicarEstadoCivil;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoCivil() {
		return isVisibilidadCeldaCopiarEstadoCivil;
	}

	public void setIsVisibilidadCeldaCopiarEstadoCivil(Boolean isVisibilidadCeldaCopiarEstadoCivil) {
		this.isVisibilidadCeldaCopiarEstadoCivil = isVisibilidadCeldaCopiarEstadoCivil;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoCivil() {
		return isVisibilidadCeldaVerFormEstadoCivil;
	}

	public void setIsVisibilidadCeldaVerFormEstadoCivil(Boolean isVisibilidadCeldaVerFormEstadoCivil) {
		this.isVisibilidadCeldaVerFormEstadoCivil = isVisibilidadCeldaVerFormEstadoCivil;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoCivil() {
		return isVisibilidadCeldaOrdenEstadoCivil;
	}

	public void setIsVisibilidadCeldaOrdenEstadoCivil(Boolean isVisibilidadCeldaOrdenEstadoCivil) {
		this.isVisibilidadCeldaOrdenEstadoCivil = isVisibilidadCeldaOrdenEstadoCivil;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoCivil() {
		return isVisibilidadCeldaNuevoRelacionesEstadoCivil;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoCivil(Boolean isVisibilidadCeldaNuevoRelacionesEstadoCivil) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoCivil = isVisibilidadCeldaNuevoRelacionesEstadoCivil;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoCivil() {
		return isVisibilidadCeldaModificarEstadoCivil;
	}

	public void setIsVisibilidadCeldaModificarEstadoCivil(Boolean isVisibilidadCeldaModificarEstadoCivil) {
		this.isVisibilidadCeldaModificarEstadoCivil = isVisibilidadCeldaModificarEstadoCivil;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoCivil() {
		return isVisibilidadCeldaActualizarEstadoCivil;
	}

	public void setIsVisibilidadCeldaActualizarEstadoCivil(Boolean isVisibilidadCeldaActualizarEstadoCivil) {
		this.isVisibilidadCeldaActualizarEstadoCivil = isVisibilidadCeldaActualizarEstadoCivil;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoCivil() {
		return isVisibilidadCeldaEliminarEstadoCivil;
	}

	public void setIsVisibilidadCeldaEliminarEstadoCivil(Boolean isVisibilidadCeldaEliminarEstadoCivil) {
		this.isVisibilidadCeldaEliminarEstadoCivil = isVisibilidadCeldaEliminarEstadoCivil;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoCivil() {
		return isVisibilidadCeldaCancelarEstadoCivil;
	}

	public void setIsVisibilidadCeldaCancelarEstadoCivil(Boolean isVisibilidadCeldaCancelarEstadoCivil) {
		this.isVisibilidadCeldaCancelarEstadoCivil = isVisibilidadCeldaCancelarEstadoCivil;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoCivil() {
		return isVisibilidadCeldaGuardarEstadoCivil;
	}

	public void setIsVisibilidadCeldaGuardarEstadoCivil(Boolean isVisibilidadCeldaGuardarEstadoCivil) {
		this.isVisibilidadCeldaGuardarEstadoCivil = isVisibilidadCeldaGuardarEstadoCivil;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoCivil() {
		return isVisibilidadCeldaGuardarCambiosEstadoCivil;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoCivil(Boolean isVisibilidadCeldaGuardarCambiosEstadoCivil) {
		this.isVisibilidadCeldaGuardarCambiosEstadoCivil = isVisibilidadCeldaGuardarCambiosEstadoCivil;
	}
		
	public EstadoCivilSessionBean getestadocivilSessionBean() {
		return this.estadocivilSessionBean;
	}
	
	public void setestadocivilSessionBean(EstadoCivilSessionBean estadocivilSessionBean) {
		this.estadocivilSessionBean=estadocivilSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(EstadoCivil estadocivil)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoCivil estadocivil,EstadoCivil estadocivilAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoCivil(estadocivil);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadocivilAux.setId(estadocivil.getId());
		estadocivilAux.setVersionRow(estadocivil.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoCivil();
		
			int intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadocivilValidator.getInvalidValues(this.estadocivil);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadocivilLogic.setDatosCliente(datosCliente);
			estadocivilLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadocivilAux=new  EstadoCivil();
				
				estadocivilAux.setIsNew(true);
				estadocivilAux.setIsChanged(true);
				
				estadocivilAux.setEstadoCivilOriginal(this.estadocivil);
				
				estadocivilAux.setId(this.estadocivil.getId());	
				estadocivilAux.setVersionRow(this.estadocivil.getVersionRow());	
				estadocivilAux.setcodigo(this.estadocivil.getcodigo());	
				estadocivilAux.setnombre(this.estadocivil.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadocivilSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadocivilAux,estadocivilLogic.getEstadoCivils());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocivilAux,estadocivils);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadocivilSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocivilSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocivilLogic.saveEstadoCivils();//WithConnection
						//estadocivilLogic.getSetVersionRowEstadoCivils();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocivil,estadocivilAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars().addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms.addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliars.addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocivilLogic.saveEstadoCivilRelaciones(estadocivilAux,this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos(),this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());//WithConnection
								//estadocivilLogic.getSetVersionRowEstadoCivils();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadocivil,estadocivilAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms= new ArrayList<CargaFamiliar_NM>();
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliars= new ArrayList<CargaFamiliar>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setClientes(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());

							if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setSubClientes(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setEmpleados(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());

							if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setCargaFamiliars(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadocivilSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadocivilAux,estadocivilLogic.getEstadoCivils());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadocivilAux,estadocivils);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadocivil,estadocivilAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadocivilAux=new  EstadoCivil();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadocivilSessionBean.getEsGuardarRelacionado() 
					|| (this.estadocivilSessionBean.getEsGuardarRelacionado() && this.estadocivil.getId()>=0)) {
						
					estadocivilAux.setIsNew(false);
				}
				
				estadocivilAux.setIsDeleted(false);
			
				estadocivilAux.setId(this.estadocivil.getId());	
				estadocivilAux.setVersionRow(this.estadocivil.getVersionRow());	
				estadocivilAux.setcodigo(this.estadocivil.getcodigo());	
				estadocivilAux.setnombre(this.estadocivil.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadocivilAux,estadocivilLogic.getEstadoCivils());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocivilAux,estadocivils);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadocivilSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocivilSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocivilLogic.saveEstadoCivils();//WithConnection
						//estadocivilLogic.getSetVersionRowEstadoCivils();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocivil,estadocivilAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars().addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms.addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliars.addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocivilLogic.saveEstadoCivilRelaciones(estadocivilAux,this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos(),this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());//WithConnection
								//estadocivilLogic.getSetVersionRowEstadoCivils();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadocivil,estadocivilAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms= new ArrayList<CargaFamiliar_NM>();
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliars= new ArrayList<CargaFamiliar>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setClientes(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());

							if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setSubClientes(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setEmpleados(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());

							if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setCargaFamiliars(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadocivilSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadocivilAux,estadocivilLogic.getEstadoCivils());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadocivilAux,estadocivils);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadocivil,estadocivilAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadocivilAux=new  EstadoCivil();
				
				estadocivilAux.setIsNew(false);
				estadocivilAux.setIsChanged(false);
				
				estadocivilAux.setIsDeleted(true);
				
				estadocivilAux.setId(this.estadocivil.getId());	
				estadocivilAux.setVersionRow(this.estadocivil.getVersionRow());	
				estadocivilAux.setcodigo(this.estadocivil.getcodigo());	
				estadocivilAux.setnombre(this.estadocivil.getnombre());	
				
				if(this.estadocivilSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadocivilAux.getId()>=0) {	
						this.estadocivilsEliminados.add(estadocivilAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadocivilAux,estadocivilLogic.getEstadoCivils());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocivilAux,estadocivils);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadocivilSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocivilSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocivilLogic.saveEstadoCivils();//WithConnection
						//estadocivilLogic.getSetVersionRowEstadoCivils();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes().addAll(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars().addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms.addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientes.addAll(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientesEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliars.addAll(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocivilLogic.saveEstadoCivilRelaciones(estadocivilAux,this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes(),this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos(),this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());//WithConnection
								//estadocivilLogic.getSetVersionRowEstadoCivils();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(new ArrayList<SubCliente>());
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms= new ArrayList<CargaFamiliar_NM>();
							this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientes= new ArrayList<SubCliente>();
							this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliars= new ArrayList<CargaFamiliar>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setClientes(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());

							if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setSubClientes(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setEmpleados(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());

							if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();}
							estadocivilAux.setCargaFamiliars(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadocivilSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadocivilAux,estadocivilLogic.getEstadoCivils());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadocivilAux,estadocivils);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getEstadoCivils().addAll(this.estadocivilsEliminados);
					
					estadocivilLogic.saveEstadoCivils();//WithConnection
					//estadocivilLogic.getSetVersionRowEstadoCivils();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadocivilsEliminados= new ArrayList<EstadoCivil>();		
			}
			
			if(this.estadocivilSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Civil GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadocivil=estadocivilAux;
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
      		//this.finishProcessEstadoCivil();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoCivil estadocivilLocal) throws Exception {
		
		if(this.estadocivilSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadocivilLocal.setClientes(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				estadocivilLocal.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				estadocivilLocal.setSubClientes(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
				estadocivilLocal.setEmpleados(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
				estadocivilLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
				estadocivilLocal.setCargaFamiliars(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
			
			} else {
			
				estadocivilLocal.setClientes(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clientes);
				estadocivilLocal.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms);
				estadocivilLocal.setSubClientes(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclientes);
				estadocivilLocal.setEmpleados(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleados);
				estadocivilLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);
				estadocivilLocal.setCargaFamiliars(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliars);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoCivil estadocivilLocal) throws Exception {	
		if(this.estadocivilSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoCivilActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadocivilValidator.getInvalidValues(this.estadocivil);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoCivil estadocivil,List<EstadoCivil> estadocivils) throws Exception {
		try	{		
			EstadoCivilConstantesFunciones.actualizarLista(estadocivil,estadocivils,this.estadocivilSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoCivil estadocivil,List<EstadoCivil> estadocivils) throws Exception {
		try	{			
			EstadoCivilConstantesFunciones.actualizarSelectedLista(estadocivil,estadocivils);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoCivil> estadocivilsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadocivilsLocal=this.estadocivilLogic.getEstadoCivils();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadocivilsLocal=this.estadocivils;
			}
			//ARCHITECTURE
		
			for(EstadoCivil estadocivilLocal:estadocivilsLocal) {
				if(this.permiteMantenimiento(estadocivilLocal) && estadocivilLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoCivilConstantesFunciones.getEstadoCivilLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoCivilConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCivil.jLabelcodigoEstadoCivil,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoCivilConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCivil.jLabelnombreEstadoCivil,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCivil.jLabelcodigoEstadoCivil,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoCivil.jLabelnombreEstadoCivil,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.estadocivil==null) {
				this.estadocivil= new EstadoCivil();
			}

			if(this.estadocivilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoCivil
				this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);

				this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.getcliente().setEstadoCivil(this.estadocivil);
			}

			return;
		}
		 else  if(sTipo.equals("CargaFamiliar_NM")) {
			if(this.estadocivil==null) {
				this.estadocivil= new EstadoCivil();
			}

			if(this.estadocivilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoCivil
				this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);

				this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.getcargafamiliar_nm().setEstadoCivil(this.estadocivil);
			}

			return;
		}
		 else  if(sTipo.equals("SubCliente")) {
			if(this.estadocivil==null) {
				this.estadocivil= new EstadoCivil();
			}

			if(this.estadocivilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoCivil
				this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);

				this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.getsubcliente().setEstadoCivil(this.estadocivil);
			}

			return;
		}
		 else  if(sTipo.equals("Empleado")) {
			if(this.estadocivil==null) {
				this.estadocivil= new EstadoCivil();
			}

			if(this.estadocivilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoCivil
				this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);

				this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.getempleado().setEstadoCivil(this.estadocivil);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.estadocivil==null) {
				this.estadocivil= new EstadoCivil();
			}

			if(this.estadocivilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoCivil
				this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);

				this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setEstadoCivil(this.estadocivil);
			}

			return;
		}
		 else  if(sTipo.equals("CargaFamiliar")) {
			if(this.estadocivil==null) {
				this.estadocivil= new EstadoCivil();
			}

			if(this.estadocivilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoCivil
				this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);

				this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.getcargafamiliar().setEstadoCivil(this.estadocivil);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoCivil--;	
		
		
		this.estadocivilAux=new EstadoCivil();
		
		this.estadocivilAux.setId(this.iIdNuevoEstadoCivil);
		this.estadocivilAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocivilLogic.getEstadoCivils().add(this.estadocivilAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadocivils.add(this.estadocivilAux);
		}
		//ARCHITECTURE
		
		this.estadocivil=this.estadocivilAux;
		
		if(EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoCivil(this.estadocivil);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoCivil(this.estadocivil);
		}
				
		//this.setDefaultControlesEstadoCivil();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoCivil();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoCivil();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCivil();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoCivil(this.estadocivilBean,this.estadocivil,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoCivilConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
			classes=EstadoCivilConstantesFunciones.getClassesRelationshipsOfEstadoCivil(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadocivilReturnGeneral=estadocivilLogic.procesarEventosEstadoCivilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocivilLogic.getEstadoCivils(),this.estadocivil,this.estadocivilParameterGeneral,this.isEsNuevoEstadoCivil,classes);//this.estadocivilLogic.getEstadoCivil()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoCivil(this.estadocivilReturnGeneral,this.estadocivilBean,false);
		
		if(this.estadocivilReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoCivil(this.estadocivilReturnGeneral.getEstadoCivil());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoCivil(this.estadocivilReturnGeneral.getEstadoCivil());
		}
		
		if(this.estadocivilReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoCivil(this.estadocivilReturnGeneral.getEstadoCivil(),classes);//this.estadocivilBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoCivil();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoCivil();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoCivilBeanSwingJInternalFrameAdditional.RecargarFormEstadoCivil(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoCivil(false);
						
			if(estadocivilSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() && CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliar_NMActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado() && CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliarActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCivil();
			}
			
			this.actualizarVisualTableDatosEstadoCivil();
			
			this.jTableDatosEstadoCivil.setRowSelectionInterval(this.getIndiceNuevoEstadoCivil(), this.getIndiceNuevoEstadoCivil());
			
			this.seleccionarFilaTablaEstadoCivilActual();
						
			this.actualizarEstadoCeldasBotonesEstadoCivil("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoCivil(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoCivil.jTextFieldcodigoEstadoCivil.setEnabled(isHabilitar && this.estadocivilConstantesFunciones.activarcodigoEstadoCivil);
		this.jInternalFrameDetalleFormEstadoCivil.jTextAreanombreEstadoCivil.setEnabled(isHabilitar && this.estadocivilConstantesFunciones.activarnombreEstadoCivil);	
		
	};
	
	public void setDefaultControlesEstadoCivil() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoCivil(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadocivilSessionBean.setConGuardarRelaciones(true);			
			this.estadocivilSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadocivilSessionBean.setConGuardarRelaciones(false);			
			this.estadocivilSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoCivil() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
				if(estadocivilAux.getId().equals(this.iIdNuevoEstadoCivil)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCivil estadocivilAux:this.estadocivils) {
				if(estadocivilAux.getId().equals(this.iIdNuevoEstadoCivil)) {
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
	
	public int getIndiceActualEstadoCivil(EstadoCivil estadocivil,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
				if(estadocivilAux.getId().equals(estadocivil.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCivil estadocivilAux:this.estadocivils) {
				if(estadocivilAux.getId().equals(estadocivil.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoCivil(EstadoCivil estadocivilOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
				if(estadocivilAux.getEstadoCivilOriginal().getId().equals(estadocivilOriginal.getId())) {
					existe=true;
					estadocivilOriginal.setId(estadocivilAux.getId());
					estadocivilOriginal.setVersionRow(estadocivilAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCivil estadocivilAux:this.estadocivils) {
				if(estadocivilAux.getEstadoCivilOriginal().getId().equals(estadocivilOriginal.getId())) {
					existe=true;
					estadocivilOriginal.setId(estadocivilAux.getId());
					estadocivilOriginal.setVersionRow(estadocivilAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoCivil(Boolean esParaCancelar) throws Exception {
		estadocivilsAux=new ArrayList<EstadoCivil>();
		estadocivilAux=new EstadoCivil();
		
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
					if(estadocivilAux.getId()<0) {
						estadocivilsAux.add(estadocivilAux);
					}		
				}
				this.iIdNuevoEstadoCivil=0L;
				this.estadocivilLogic.getEstadoCivils().removeAll(estadocivilsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCivil estadocivilAux:this.estadocivils) {
					if(estadocivilAux.getId()<0) {
						estadocivilsAux.add(estadocivilAux);
					}		
				}
				this.iIdNuevoEstadoCivil=0L;
				this.estadocivils.removeAll(estadocivilsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoCivil 
					&& this.estadocivilLogic.getEstadoCivils().size()>0
					) {
					estadocivilAux=this.estadocivilLogic.getEstadoCivils().get(this.estadocivilLogic.getEstadoCivils().size() - 1);
				
					if(estadocivilAux.getId()<0) {
						this.estadocivilLogic.getEstadoCivils().remove(estadocivilAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoCivil && this.estadocivils.size()>0) {
					estadocivilAux=this.estadocivils.get(this.estadocivils.size() - 1);
				
					if(estadocivilAux.getId()<0) {
						this.estadocivils.remove(estadocivilAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoCivil(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadocivil.getId()<0) {
				this.estadocivilLogic.getEstadoCivils().remove(this.estadocivil);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadocivil.getId()<0) {
				this.estadocivils.remove(this.estadocivil);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoCivil(List<EstadoCivil> estadocivilsAux) throws Exception {
		EstadoCivilConstantesFunciones.setEstadosInicialesEstadoCivil(estadocivilsAux);
	}
	
	public void setEstadosInicialesEstadoCivil(EstadoCivil estadocivilAux) throws Exception {
		EstadoCivilConstantesFunciones.setEstadosInicialesEstadoCivil(estadocivilAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoCivilActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoCivil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoCivilActual()) {
				if(!this.isEsNuevoEstadoCivil) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoCivil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoCivil=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoCivilActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Civil ?", "MANTENIMIENTO DE Estado Civil", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoCivil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoCivil estadocivil) throws Exception {
		EstadoCivilConstantesFunciones.seleccionarAsignar(this.estadocivil,estadocivil);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoCivil=this.isPermisoActualizarOriginalEstadoCivil;
			
			
			this.seleccionarAsignar(estadocivil);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoCivilConstantesFunciones.quitarEspaciosEstadoCivil(this.estadocivil,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoCivil("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadocivilSessionBean.setsFuncionBusquedaRapida(this.estadocivilSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoCivil) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoCivil(esParaCancelar);				
				this.cancelarNuevoEstadoCivil(esParaCancelar);								
			}
			
			this.estadocivil=new EstadoCivil();
			
			this.inicializarEstadoCivil();
			
			this.actualizarEstadoCeldasBotonesEstadoCivil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoCivil() throws Exception {
		try {
			EstadoCivilConstantesFunciones.inicializarEstadoCivil(this.estadocivil);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadocivilLogic.getEstadoCivils().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoCivils(String sAccionBusqueda,List<EstadoCivil> estadocivilsParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoCivil"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoCivilMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoCivilMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoCivil"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Civiles");		
		parameters.put("busquedapor", EstadoCivilConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(CargaFamiliar_NM.class));
			classes.add(new Classe(SubCliente.class));
			classes.add(new Classe(Empleado.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			classes.add(new Classe(CargaFamiliar.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoCivilLogic estadocivilLogicAuxiliar=new EstadoCivilLogic();
					estadocivilLogicAuxiliar.setDatosCliente(estadocivilLogic.getDatosCliente());				
					estadocivilLogicAuxiliar.setEstadoCivils(estadocivilsParaReportes);
					
					estadocivilLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoCivilWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadocivilsParaReportes=estadocivilLogicAuxiliar.getEstadoCivils();
					
					//estadocivilLogic.getNewConnexionToDeep();
					
					//for (EstadoCivil estadocivil:estadocivilsParaReportes) {
					//	estadocivilLogic.deepLoad(estadocivil, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadocivilLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadocivilLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileCargaFamiliar_NM = AuxiliarReportes.class.getResourceAsStream("CargaFamiliar_NMDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargafamiliar_nm", reportFileCargaFamiliar_NM);

			InputStream reportFileSubCliente = AuxiliarReportes.class.getResourceAsStream("SubClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subcliente", reportFileSubCliente);

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);

			InputStream reportFileCargaFamiliar = AuxiliarReportes.class.getResourceAsStream("CargaFamiliarDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargafamiliar", reportFileCargaFamiliar);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoCivil=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoCivilConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoCivilConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoCivil=new JRBeanArrayDataSource(EstadoCivilJInternalFrame.TraerEstadoCivilBeans(estadocivilsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoCivil);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoCivilConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoCivilConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoCivilBean.TraerEstadoCivilBeans(estadocivilsParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoCivils(sAccionBusqueda,sTipoArchivoReporte,estadocivilsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoCivils(sAccionBusqueda,sTipoArchivoReporte,estadocivilsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoCivilActionPerformed(null);
					//this.generarExcelReporteEstadoCivils(sAccionBusqueda,sTipoArchivoReporte,estadocivilsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoCivils(sAccionBusqueda,sTipoArchivoReporte,estadocivilsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoCivils(sAccionBusqueda,sTipoArchivoReporte,estadocivilsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoCivils(sAccionBusqueda,sTipoArchivoReporte,estadocivilsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoCivils(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCivil> estadocivilsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocivil";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCivils");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoCivil("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoCivil estadocivil : estadocivilsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoCivilConstantesFunciones.generarExcelReporteDataEstadoCivil("NORMAL",row,workbook,estadocivil,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoCivil(String sTipo,Row row,Workbook workbook) {
		
		EstadoCivilConstantesFunciones.generarExcelReporteHeaderEstadoCivil(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoCivils(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCivil> estadocivilsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocivil_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCivils");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoCivil estadocivil : estadocivilsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoCivilConstantesFunciones.getEstadoCivilDescripcion(estadocivil));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoCivilConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoCivilConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocivil.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoCivilConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoCivilConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocivil.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoCivils(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoCivil> estadocivilsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoCivil> estadocivilsRespaldo=null;
		
		classes=EstadoCivilConstantesFunciones.getClassesRelationshipsOfEstadoCivil(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadocivilLogic.setDatosCliente(this.datosCliente);
		this.estadocivilLogic.setDatosDeep(this.datosDeep);
		this.estadocivilLogic.setIsConDeep(true);
		
		estadocivilsRespaldo=this.estadocivilLogic.getEstadoCivils();
		
		this.estadocivilLogic.setEstadoCivils(estadocivilsParaReportes);	
		this.estadocivilLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadocivilsParaReportes=this.estadocivilLogic.getEstadoCivils();
		this.estadocivilLogic.setEstadoCivils(estadocivilsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocivil_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoCivils");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoCivil("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoCivil estadocivil : estadocivilsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoCivil("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoCivilConstantesFunciones.generarExcelReporteDataEstadoCivil("NORMAL",row,workbook,estadocivil,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadocivil.getClientes()!=null && estadocivil.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(estadocivil.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : estadocivil.getClientes()) {
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


				//CargaFamiliar_NM
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadocivil.getCargaFamiliar_NMs()!=null && estadocivil.getCargaFamiliar_NMs().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargaFamiliar_NMConstantesFunciones.generarExcelReporteHeaderCargaFamiliar_NM("RELACIONADO",row,workbook);
				}

				if(estadocivil.getCargaFamiliar_NMs()!=null) {
					i2=0;
					for(CargaFamiliar_NM cargafamiliar_nm : estadocivil.getCargaFamiliar_NMs()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargaFamiliar_NMConstantesFunciones.generarExcelReporteDataCargaFamiliar_NM("RELACIONADO",row,workbook,cargafamiliar_nm,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SubCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadocivil.getSubClientes()!=null && estadocivil.getSubClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubClienteConstantesFunciones.generarExcelReporteHeaderSubCliente("RELACIONADO",row,workbook);
				}

				if(estadocivil.getSubClientes()!=null) {
					i2=0;
					for(SubCliente subcliente : estadocivil.getSubClientes()) {
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


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadocivil.getEmpleados()!=null && estadocivil.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(estadocivil.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : estadocivil.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadocivil.getParametroCarteraDefectos()!=null && estadocivil.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(estadocivil.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : estadocivil.getParametroCarteraDefectos()) {
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


				//CargaFamiliar
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadocivil.getCargaFamiliars()!=null && estadocivil.getCargaFamiliars().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargaFamiliarConstantesFunciones.generarExcelReporteHeaderCargaFamiliar("RELACIONADO",row,workbook);
				}

				if(estadocivil.getCargaFamiliars()!=null) {
					i2=0;
					for(CargaFamiliar cargafamiliar : estadocivil.getCargaFamiliars()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargaFamiliarConstantesFunciones.generarExcelReporteDataCargaFamiliar("RELACIONADO",row,workbook,cargafamiliar,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoCivilConstantesFunciones.getEstadoCivilDescripcion(estadocivil));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCivil.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoCivil() throws Exception {		
		this.startProcessEstadoCivil(true);
	}
	
	public void startProcessEstadoCivil(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoCivil, this.jScrollPanelDatosEstadoCivil,this.jPanelPaginacionEstadoCivil, this.jScrollPanelDatosEdicionEstadoCivil, this.jPanelAccionesEstadoCivil,this.jPanelAccionesFormularioEstadoCivil,this.jmenuBarEstadoCivil,this.jmenuBarDetalleEstadoCivil,this.jTtoolBarEstadoCivil,this.jTtoolBarDetalleEstadoCivil);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoCivil=null; 
		
		final JPanel jPanelParametrosReportesEstadoCivil=this.jPanelParametrosReportesEstadoCivil;
		//final JScrollPane jScrollPanelDatosEstadoCivil=this.jScrollPanelDatosEstadoCivil;
		final JTable jTableDatosEstadoCivil=this.jTableDatosEstadoCivil;		
		final JPanel jPanelPaginacionEstadoCivil=this.jPanelPaginacionEstadoCivil;
		//final JScrollPane jScrollPanelDatosEdicionEstadoCivil=this.jScrollPanelDatosEdicionEstadoCivil;
		final JPanel jPanelAccionesEstadoCivil=this.jPanelAccionesEstadoCivil;
		
		JPanel jPanelCamposAuxiliarEstadoCivil=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoCivil=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			jPanelCamposAuxiliarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jPanelCamposEstadoCivil;
			jPanelAccionesFormularioAuxiliarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jPanelAccionesFormularioEstadoCivil;
		}
		
		final JPanel jPanelCamposEstadoCivil=jPanelCamposAuxiliarEstadoCivil;
		final JPanel jPanelAccionesFormularioEstadoCivil=jPanelAccionesFormularioAuxiliarEstadoCivil;
		
		
		final JMenuBar jmenuBarEstadoCivil=this.jmenuBarEstadoCivil;
		final JToolBar jTtoolBarEstadoCivil=this.jTtoolBarEstadoCivil;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoCivil=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoCivil=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			jmenuBarDetalleAuxiliarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jmenuBarDetalleEstadoCivil;
			jTtoolBarDetalleAuxiliarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jTtoolBarDetalleEstadoCivil;
		}
		
		final JMenuBar jmenuBarDetalleEstadoCivil=jmenuBarDetalleAuxiliarEstadoCivil;
		final JToolBar jTtoolBarDetalleEstadoCivil=jTtoolBarDetalleAuxiliarEstadoCivil;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoCivil;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoCivil;
			processRunnable.jTableDatos=jTableDatosEstadoCivil;
			processRunnable.jPanelCampos=jPanelCamposEstadoCivil;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoCivil;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoCivil;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoCivil;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoCivil;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoCivil;
			processRunnable.jTtoolBar=jTtoolBarEstadoCivil;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoCivil;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoCivil ,jPanelParametrosReportesEstadoCivil,jTableDatosEstadoCivil, /*jScrollPanelDatosEstadoCivil,*/jPanelCamposEstadoCivil,jPanelPaginacionEstadoCivil, /*jScrollPanelDatosEdicionEstadoCivil,*/ jPanelAccionesEstadoCivil,jPanelAccionesFormularioEstadoCivil,jmenuBarEstadoCivil,jmenuBarDetalleEstadoCivil,jTtoolBarEstadoCivil,jTtoolBarDetalleEstadoCivil);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoCivil, jScrollPanelDatosEstadoCivil,jPanelPaginacionEstadoCivil, jScrollPanelDatosEdicionEstadoCivil, jPanelAccionesEstadoCivil,jPanelAccionesFormularioEstadoCivil,jmenuBarEstadoCivil,jmenuBarDetalleEstadoCivil,jTtoolBarEstadoCivil,jTtoolBarDetalleEstadoCivil);
						
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
	
	public void finishProcessEstadoCivil() {// throws Exception 
		this.finishProcessEstadoCivil(true);
	}
	
	public void finishProcessEstadoCivil(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoCivil, this.jScrollPanelDatosEstadoCivil,this.jPanelPaginacionEstadoCivil, this.jScrollPanelDatosEdicionEstadoCivil, this.jPanelAccionesEstadoCivil,this.jPanelAccionesFormularioEstadoCivil,this.jmenuBarEstadoCivil,this.jmenuBarDetalleEstadoCivil,this.jTtoolBarEstadoCivil,this.jTtoolBarDetalleEstadoCivil);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoCivil=null; 
		
		final JPanel jPanelParametrosReportesEstadoCivil=this.jPanelParametrosReportesEstadoCivil;
		//final JScrollPane jScrollPanelDatosEstadoCivil=this.jScrollPanelDatosEstadoCivil;
		final JTable jTableDatosEstadoCivil=this.jTableDatosEstadoCivil;		
		final JPanel jPanelPaginacionEstadoCivil=this.jPanelPaginacionEstadoCivil;
		//final JScrollPane jScrollPanelDatosEdicionEstadoCivil=this.jScrollPanelDatosEdicionEstadoCivil;
		final JPanel jPanelAccionesEstadoCivil=this.jPanelAccionesEstadoCivil;
		
		JPanel jPanelCamposAuxiliarEstadoCivil=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoCivil=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			jPanelCamposAuxiliarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jPanelCamposEstadoCivil;
			jPanelAccionesFormularioAuxiliarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jPanelAccionesFormularioEstadoCivil;
		}
		
		final JPanel jPanelCamposEstadoCivil=jPanelCamposAuxiliarEstadoCivil;
		final JPanel jPanelAccionesFormularioEstadoCivil=jPanelAccionesFormularioAuxiliarEstadoCivil;
		
		
		final JMenuBar jmenuBarEstadoCivil=this.jmenuBarEstadoCivil;		
		final JToolBar jTtoolBarEstadoCivil=this.jTtoolBarEstadoCivil;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoCivil=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoCivil=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			jmenuBarDetalleAuxiliarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jmenuBarDetalleEstadoCivil;
			jTtoolBarDetalleAuxiliarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jTtoolBarDetalleEstadoCivil;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoCivil=jmenuBarDetalleAuxiliarEstadoCivil;
		final JToolBar jTtoolBarDetalleEstadoCivil=jTtoolBarDetalleAuxiliarEstadoCivil;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoCivil;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoCivil;
			processRunnable.jTableDatos=jTableDatosEstadoCivil;
			processRunnable.jPanelCampos=jPanelCamposEstadoCivil;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoCivil;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoCivil;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoCivil;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoCivil;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoCivil;
			processRunnable.jTtoolBar=jTtoolBarEstadoCivil;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoCivil;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoCivil ,jPanelParametrosReportesEstadoCivil, jTableDatosEstadoCivil,/*jScrollPanelDatosEstadoCivil,*/jPanelCamposEstadoCivil,jPanelPaginacionEstadoCivil, /*jScrollPanelDatosEdicionEstadoCivil,*/ jPanelAccionesEstadoCivil,jPanelAccionesFormularioEstadoCivil,jmenuBarEstadoCivil,jmenuBarDetalleEstadoCivil,jTtoolBarEstadoCivil,jTtoolBarDetalleEstadoCivil));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoCivil(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoCivil(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoCivil(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoCivil(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoCivil,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoCivil,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoCivil(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoCivil,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoCivil,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadocivilConstantesFunciones.getsFinalQueryEstadoCivil();
		String  finalQueryPaginacionTodos=this.estadocivilConstantesFunciones.getsFinalQueryEstadoCivil();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoCivilConstantesFunciones.getArrayColumnasGlobalesNoEstadoCivil(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoCivilConstantesFunciones.getArrayColumnasGlobalesEstadoCivil(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoCivilConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadocivilsEliminados= new ArrayList<EstadoCivil>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoCivil();
		
				///*EstadoCivilSessionBean*/this.estadocivilSessionBean=new EstadoCivilSessionBean();
			
			if(this.estadocivilSessionBean==null) {
				this.estadocivilSessionBean=new EstadoCivilSessionBean();
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
					this.iNumeroPaginacion=EstadoCivilConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoCivilConstantesFunciones.getClassesForeignKeysOfEstadoCivil(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadocivil."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadocivilsAux= new ArrayList<EstadoCivil>();
			
				
			estadocivilLogic.setDatosCliente(this.datosCliente);
			estadocivilLogic.setDatosDeep(this.datosDeep);
			estadocivilLogic.setIsConDeep(true);
			
			
			estadocivilLogic.getEstadoCivilDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadocivilLogic.getTodosEstadoCivils(finalQueryGlobal,pagination);
					
					//estadocivilLogic.getTodosEstadoCivilsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadocivilLogic.getEstadoCivils()==null|| estadocivilLogic.getEstadoCivils().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocivilsAux= new ArrayList<EstadoCivil>();
							estadocivilsAux.addAll(estadocivilLogic.getEstadoCivils());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocivilsAux= new ArrayList<EstadoCivil>();
							estadocivilsAux.addAll(estadocivils);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocivilLogic.getTodosEstadoCivils(finalQueryGlobal+"",this.pagination);												
							
							//estadocivilLogic.getTodosEstadoCivilsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoCivils("Todos",estadocivilLogic.getEstadoCivils() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocivilLogic.setEstadoCivils(new ArrayList<EstadoCivil>());					
							estadocivilLogic.getEstadoCivils().addAll(estadocivilsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocivils=new ArrayList<EstadoCivil>();
							estadocivils.addAll(estadocivilsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoCivil=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoCivil=this.idActual;
				
				} else if(this.idEstadoCivilActual!=null && this.idEstadoCivilActual!=0L) {
					idEstadoCivil=idEstadoCivilActual;
				}
				
					
				this.sDetalleReporte=EstadoCivilConstantesFunciones.getDetalleIndicePorId(idEstadoCivil);
				
				this.estadocivils=new ArrayList<EstadoCivil>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadocivilLogic.getEntity(idEstadoCivil);
					
					//estadocivilLogic.getEntityWithConnection(idEstadoCivil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocivilLogic.setEstadoCivils(new ArrayList<EstadoCivil>());
					estadocivilLogic.getEstadoCivils().add(estadocivilLogic.getEstadoCivil());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocivils=new ArrayList<EstadoCivil>();
					this.estadocivils.add(estadocivil);
				}
				
				if(estadocivilLogic.getEstadoCivil()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoCivil();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoCivil();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadocivilLogic.getEstadoCivils().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocivils.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadocivilLogic.getEstadoCivils().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocivils.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoCivil estadocivil) {
		Boolean permite=true;
		
		if(this.estadocivil.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoCivilConstantesFunciones.getOrderByListaEstadoCivil();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoCivilConstantesFunciones.getOrderByListaEstadoCivil();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCivil estadocivil:estadocivilLogic.getEstadoCivils()) {
				if(estadocivil.getsType().equals(Constantes2.S_TOTALES)) {
					estadocivilTotales=estadocivil;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCivil estadocivil:this.estadocivils) {
				if(estadocivil.getsType().equals(Constantes2.S_TOTALES)) {
					estadocivilTotales=estadocivil;
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
			this.estadocivilAux=new EstadoCivil();
			this.estadocivilAux.setsType(Constantes2.S_TOTALES);
			this.estadocivilAux.setIsNew(false);
			this.estadocivilAux.setIsChanged(false);
			this.estadocivilAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoCivilConstantesFunciones.TotalizarValoresFilaEstadoCivil(this.estadocivilLogic.getEstadoCivils(),this.estadocivilAux);
				
				this.estadocivilLogic.getEstadoCivils().add(this.estadocivilAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoCivilConstantesFunciones.TotalizarValoresFilaEstadoCivil(this.estadocivils,this.estadocivilAux);
				
				this.estadocivils.add(this.estadocivilAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadocivilTotales=new EstadoCivil();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadocivilLogic.getEstadoCivils().remove(estadocivilTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadocivils.remove(estadocivilTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadocivilTotales=new EstadoCivil();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoCivil estadocivil:estadocivilLogic.getEstadoCivils()) {
				if(estadocivil.getsType().equals(Constantes2.S_TOTALES)) {
					estadocivilTotales=estadocivil;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoCivilConstantesFunciones.TotalizarValoresFilaEstadoCivil(this.estadocivilLogic.getEstadoCivils(),estadocivilTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoCivil estadocivil:this.estadocivils) {
				if(estadocivil.getsType().equals(Constantes2.S_TOTALES)) {
					estadocivilTotales=estadocivil;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoCivilConstantesFunciones.TotalizarValoresFilaEstadoCivil(this.estadocivils,estadocivilTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoCivilPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoCivilPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocivilLogic.getEstadoCivilPorCodigo(codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
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
	
	public void inicializarPermisosEstadoCivil() {
		this.isPermisoTodoEstadoCivil=false;
		this.isPermisoNuevoEstadoCivil=false;
		this.isPermisoActualizarEstadoCivil=false;
		this.isPermisoActualizarOriginalEstadoCivil=false;
		this.isPermisoEliminarEstadoCivil=false;
		this.isPermisoGuardarCambiosEstadoCivil=false;
		this.isPermisoConsultaEstadoCivil=false;
		this.isPermisoBusquedaEstadoCivil=false;
		this.isPermisoReporteEstadoCivil=false;		
		this.isPermisoOrdenEstadoCivil=false;		
		this.isPermisoPaginacionMedioEstadoCivil=false;		
		this.isPermisoPaginacionAltoEstadoCivil=false;
		this.isPermisoPaginacionTodoEstadoCivil=false;
		this.isPermisoCopiarEstadoCivil=false;		
		this.isPermisoVerFormEstadoCivil=false;		
		this.isPermisoDuplicarEstadoCivil=false;		
		this.isPermisoOrdenEstadoCivil=false;		
	}
	
	public void setPermisosUsuarioEstadoCivil(Boolean isPermiso) {
		this.isPermisoTodoEstadoCivil=isPermiso;
		this.isPermisoNuevoEstadoCivil=isPermiso;
		this.isPermisoActualizarEstadoCivil=isPermiso;
		this.isPermisoActualizarOriginalEstadoCivil=isPermiso;
		this.isPermisoEliminarEstadoCivil=isPermiso;
		this.isPermisoGuardarCambiosEstadoCivil=isPermiso;
		this.isPermisoConsultaEstadoCivil=isPermiso;
		this.isPermisoBusquedaEstadoCivil=isPermiso;
		this.isPermisoReporteEstadoCivil=isPermiso;
		this.isPermisoOrdenEstadoCivil=isPermiso;		
		this.isPermisoPaginacionMedioEstadoCivil=isPermiso;		
		this.isPermisoPaginacionAltoEstadoCivil=isPermiso;		
		this.isPermisoPaginacionTodoEstadoCivil=isPermiso;		
		this.isPermisoCopiarEstadoCivil=isPermiso;		
		this.isPermisoVerFormEstadoCivil=isPermiso;		
		this.isPermisoDuplicarEstadoCivil=isPermiso;
		this.isPermisoOrdenEstadoCivil=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoCivil(Boolean isPermiso) {
		//this.isPermisoTodoEstadoCivil=isPermiso;
		this.isPermisoNuevoEstadoCivil=isPermiso;
		this.isPermisoActualizarEstadoCivil=isPermiso;
		this.isPermisoActualizarOriginalEstadoCivil=isPermiso;
		this.isPermisoEliminarEstadoCivil=isPermiso;
		this.isPermisoGuardarCambiosEstadoCivil=isPermiso;
		//this.isPermisoConsultaEstadoCivil=isPermiso;
		//this.isPermisoBusquedaEstadoCivil=isPermiso;
		//this.isPermisoReporteEstadoCivil=isPermiso;
		//this.isPermisoOrdenEstadoCivil=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoCivil=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoCivil=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoCivil=isPermiso;		
		//this.isPermisoCopiarEstadoCivil=isPermiso;		
		//this.isPermisoDuplicarEstadoCivil=isPermiso;
		//this.isPermisoOrdenEstadoCivil=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoCivilClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoCivilJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionEstadoCivilClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCargaFamiliar_NM=false;
		this.isTienePermisosCargaFamiliar_NM=this.verificarGetPermisosUsuarioOpcionEstadoCivilClaseRelacionada(this.opcionsRelacionadas,CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSubCliente=false;
		this.isTienePermisosSubCliente=this.verificarGetPermisosUsuarioOpcionEstadoCivilClaseRelacionada(this.opcionsRelacionadas,SubClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionEstadoCivilClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionEstadoCivilClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCargaFamiliar=false;
		this.isTienePermisosCargaFamiliar=this.verificarGetPermisosUsuarioOpcionEstadoCivilClaseRelacionada(this.opcionsRelacionadas,CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoCivil(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoCivilClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosCargaFamiliar_NM=conPermiso;
		this.isTienePermisosSubCliente=conPermiso;
		this.isTienePermisosEmpleado=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
		this.isTienePermisosCargaFamiliar=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoCivilClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoCivilClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoCivilClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.remove(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCargaFamiliar_NM && this.jInternalFrameDetalleFormEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.remove(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSubCliente && this.jInternalFrameDetalleFormEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.remove(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.remove(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.remove(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCargaFamiliar && this.jInternalFrameDetalleFormEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.remove(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoCivil() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoCivilJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadocivilSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoCivilConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoCivil=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoCivil=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoCivil=this.isPermisoActualizarEstadoCivil;
			this.isPermisoEliminarEstadoCivil=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoCivil=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoCivil=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoCivil=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoCivil=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoCivil=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoCivil=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoCivil=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoCivil=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoCivil=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoCivil=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoCivil=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoCivil=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoCivil=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadocivilSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoCivil.setToolTipText(this.jTableDatosEstadoCivil.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoCivil(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoCivil(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoCivilJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoCivilJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoCivil() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.estadocivilConstantesFunciones.mostrarClienteEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCargaFamiliar_NM && this.estadocivilConstantesFunciones.mostrarCargaFamiliar_NMEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Carga Familiar_ N M");
			reporte.setsDescripcion("Carga Familiar_ N M");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubCliente && this.estadocivilConstantesFunciones.mostrarSubClienteEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sub Cliente");
			reporte.setsDescripcion("Sub Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEmpleado && this.estadocivilConstantesFunciones.mostrarEmpleadoEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.estadocivilConstantesFunciones.mostrarParametroCarteraDefectoEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCargaFamiliar && this.estadocivilConstantesFunciones.mostrarCargaFamiliarEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Carga Familiar");
			reporte.setsDescripcion("Carga Familiar");
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
	
		
	public void inicializarCombosForeignKeyEstadoCivilListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoCivilListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoCivilJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoCivilListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoCivilListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoCivil()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoCivil()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoCivil(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoCivil()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCivil();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoCivil(EstadoCivil estadocivil)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoCivil(EstadoCivil estadocivil,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoCivil()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoCivil()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoCivil()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoCivil()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoCivil()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoCivil()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoCivil(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoCivil()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoCivilBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoCivilBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoCivilBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadocivilSessionBean=new EstadoCivilSessionBean(); 
		this.estadocivilConstantesFunciones=new EstadoCivilConstantesFunciones(); 
		this.estadocivilBean=new EstadoCivil();//(this.estadocivilConstantesFunciones); 		
		this.estadocivilReturnGeneral=new EstadoCivilParameterReturnGeneral(); 
		
		this.estadocivilSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocivilSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoCivilBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoCivilBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoCivilBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoCivil(true);
			
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
			
			this.estadocivilConstantesFunciones=new EstadoCivilConstantesFunciones(); 
			this.estadocivilBean=new EstadoCivil();//this.estadocivilConstantesFunciones); 			
			this.estadocivilReturnGeneral=new EstadoCivilParameterReturnGeneral(); 
		
			EstadoCivilBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Civil Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadocivil=new EstadoCivil();
			this.estadocivils = new ArrayList<EstadoCivil>();
			this.estadocivilsAux = new ArrayList<EstadoCivil>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic=new EstadoCivilLogic();
				this.estadocivilLogic.getNewConnexionToDeep("");
			}
			
			//this.estadocivilSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadocivilSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoCivil);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoCivil);	
					}
					
					if(this.jInternalFrameImportacionEstadoCivil!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoCivil);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoCivil!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoCivil);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoCivil);
				this.jInternalFrameDetalleFormEstadoCivil.setVisible(false);
				this.jInternalFrameDetalleFormEstadoCivil.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoCivil);
					this.jInternalFrameReporteDinamicoEstadoCivil.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoCivil.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoCivil!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoCivil);
					this.jInternalFrameImportacionEstadoCivil.setVisible(false);
					this.jInternalFrameImportacionEstadoCivil.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoCivil!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoCivil);
					this.jInternalFrameOrderByEstadoCivil.setVisible(false);
					this.jInternalFrameOrderByEstadoCivil.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoCivilActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoCivilConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadocivilReturnGeneral=new EstadoCivilParameterReturnGeneral();
			
			this.estadocivilParameterGeneral=new EstadoCivilParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadocivilLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoCivilJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadocivilSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoCivilConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadocivilSessionBean.getEsGuardarRelacionado(),this.estadocivilSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoCivilConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadocivilSessionBean.getEsGuardarRelacionado(),this.estadocivilSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoCivil=false;
			this.isVisibilidadCeldaDuplicarEstadoCivil=true;
			this.isVisibilidadCeldaCopiarEstadoCivil=true;
			this.isVisibilidadCeldaVerFormEstadoCivil=true;
			this.isVisibilidadCeldaOrdenEstadoCivil=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
			this.isVisibilidadCeldaModificarEstadoCivil=false;
			this.isVisibilidadCeldaActualizarEstadoCivil=false;
			this.isVisibilidadCeldaEliminarEstadoCivil=false;
			this.isVisibilidadCeldaCancelarEstadoCivil=false;
			this.isVisibilidadCeldaGuardarEstadoCivil=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoCivil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoCivil();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoCivil(false);
			
			this.setPermisosUsuarioEstadoCivil();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocivilSessionBean.getEsGuardarRelacionado() 
				|| (this.estadocivilSessionBean.getEsGuardarRelacionado() && this.estadocivilSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoCivilClasesRelacionadas();
			}
			
			if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoCivilClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoCivil();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoCivil();
			}
			
			if(!this.isPermisoBusquedaEstadoCivil) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoCivil,this.isPermisoPaginacionMedioEstadoCivil,this.isPermisoPaginacionTodoEstadoCivil);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoCivilConstantesFunciones.getTiposSeleccionarEstadoCivil());
				
				this.tiposColumnasSelect=EstadoCivilConstantesFunciones.getTiposSeleccionarEstadoCivil(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoCivil();				
				//this.tiposRelacionesSelect=EstadoCivilConstantesFunciones.getTiposRelacionesEstadoCivil(true);
				
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
			//if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoCivil();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoCivil(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoCivil(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCivil() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic();
			this.cargafamiliar_nmLogic=new CargaFamiliar_NMLogic();
			this.subclienteLogic=new SubClienteLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic();
			this.cargafamiliarLogic=new CargaFamiliarLogic(); 
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
				estadocivilImplementable= (EstadoCivilImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoCivilConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadocivilImplementableHome= (EstadoCivilImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoCivilConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadocivils= new ArrayList<EstadoCivil>();
			this.estadocivilsEliminados= new ArrayList<EstadoCivil>();
						
			this.isEsNuevoEstadoCivil=false;
			this.esParaAccionDesdeFormularioEstadoCivil=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoCivil(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoCivil();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoCivilBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoCivilConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoCivil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoCivil(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoCivil();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoCivil();
			}
			
			EstadoCivilBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoCivil(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoCivil: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoCivil() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoCivil")) {
				iIndex=this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();	
				
				

				if(sTitle.equals("Carga Familiares")) {
					if(!CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoCivil();

						this.cargarParteTabPanelRelacionadaCargaFamiliar(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Carga Familiar_ N Mes")) {
					if(!CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoCivil();

						this.cargarParteTabPanelRelacionadaCargaFamiliar_NM(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoCivil();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoCivil();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoCivil();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Clientes")) {
					if(!SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoCivil();

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
				this.finishProcessEstadoCivil();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCargaFamiliar(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoCivil.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(false,true,iIndex);
		this.jButtonCargaFamiliarActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargaFamiliar();

		//this.jTabbedPaneRelacionesEstadoCivil.updateUI();
		//this.jTabbedPaneRelacionesEstadoCivil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoCivil.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCargaFamiliar_NM(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoCivil.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(false,true,iIndex);
		this.jButtonCargaFamiliar_NMActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargaFamiliar_NM();

		//this.jTabbedPaneRelacionesEstadoCivil.updateUI();
		//this.jTabbedPaneRelacionesEstadoCivil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoCivil.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoCivil.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesEstadoCivil.updateUI();
		//this.jTabbedPaneRelacionesEstadoCivil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoCivil.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoCivil.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesEstadoCivil.updateUI();
		//this.jTabbedPaneRelacionesEstadoCivil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoCivil.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoCivil.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesEstadoCivil.updateUI();
		//this.jTabbedPaneRelacionesEstadoCivil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoCivil.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoCivil.cargarSessionConBeanSwingJInternalFrameSubCliente(false,true,iIndex);
		this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubCliente();

		//this.jTabbedPaneRelacionesEstadoCivil.updateUI();
		//this.jTabbedPaneRelacionesEstadoCivil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoCivil.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosEstadoCivil.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CargaFamiliar_NM")) {
				int row=this.jTableDatosEstadoCivil.getSelectedRow();
				jButtonCargaFamiliar_NMActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubCliente")) {
				int row=this.jTableDatosEstadoCivil.getSelectedRow();
				jButtonSubClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosEstadoCivil.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosEstadoCivil.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CargaFamiliar")) {
				int row=this.jTableDatosEstadoCivil.getSelectedRow();
				jButtonCargaFamiliarActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.estadocivilConstantesFunciones.mostrarClienteEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(estadocivilConstantesFunciones.resaltarClienteEstadoCivil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadocivilConstantesFunciones.resaltarClienteEstadoCivil);
						}

						jmenuItem.setEnabled(this.estadocivilConstantesFunciones.activarClienteEstadoCivil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormEstadoCivil.jmenuDetalleEstadoCivil.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Carga Familiar_ N M")) {

					if(this.isTienePermisosCargaFamiliar_NM && this.estadocivilConstantesFunciones.mostrarCargaFamiliar_NMEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Carga Familiar_ N Mes"+"("+CargaFamiliar_NMConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Carga Familiar_ N Mes");

						if(estadocivilConstantesFunciones.resaltarCargaFamiliar_NMEstadoCivil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadocivilConstantesFunciones.resaltarCargaFamiliar_NMEstadoCivil);
						}

						jmenuItem.setEnabled(this.estadocivilConstantesFunciones.activarCargaFamiliar_NMEstadoCivil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CargaFamiliar_NM"));

						

						this.jInternalFrameDetalleFormEstadoCivil.jmenuDetalleEstadoCivil.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sub Cliente")) {

					if(this.isTienePermisosSubCliente && this.estadocivilConstantesFunciones.mostrarSubClienteEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sub Clientes"+"("+SubClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sub Clientes");

						if(estadocivilConstantesFunciones.resaltarSubClienteEstadoCivil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadocivilConstantesFunciones.resaltarSubClienteEstadoCivil);
						}

						jmenuItem.setEnabled(this.estadocivilConstantesFunciones.activarSubClienteEstadoCivil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubCliente"));

						

						this.jInternalFrameDetalleFormEstadoCivil.jmenuDetalleEstadoCivil.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.estadocivilConstantesFunciones.mostrarEmpleadoEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(estadocivilConstantesFunciones.resaltarEmpleadoEstadoCivil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadocivilConstantesFunciones.resaltarEmpleadoEstadoCivil);
						}

						jmenuItem.setEnabled(this.estadocivilConstantesFunciones.activarEmpleadoEstadoCivil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormEstadoCivil.jmenuDetalleEstadoCivil.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.estadocivilConstantesFunciones.mostrarParametroCarteraDefectoEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(estadocivilConstantesFunciones.resaltarParametroCarteraDefectoEstadoCivil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadocivilConstantesFunciones.resaltarParametroCarteraDefectoEstadoCivil);
						}

						jmenuItem.setEnabled(this.estadocivilConstantesFunciones.activarParametroCarteraDefectoEstadoCivil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormEstadoCivil.jmenuDetalleEstadoCivil.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Carga Familiar")) {

					if(this.isTienePermisosCargaFamiliar && this.estadocivilConstantesFunciones.mostrarCargaFamiliarEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Carga Familiares"+"("+CargaFamiliarConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Carga Familiares");

						if(estadocivilConstantesFunciones.resaltarCargaFamiliarEstadoCivil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadocivilConstantesFunciones.resaltarCargaFamiliarEstadoCivil);
						}

						jmenuItem.setEnabled(this.estadocivilConstantesFunciones.activarCargaFamiliarEstadoCivil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CargaFamiliar"));

						

						this.jInternalFrameDetalleFormEstadoCivil.jmenuDetalleEstadoCivil.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoCivil(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoCivil(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoCivil(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoCivilListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoCivil();
		
		this.cargarCombosFrameForeignKeyEstadoCivil();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoCivil();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoCivil();
		}
	}
	
	
	
	public void jButtonNuevoEstadoCivilActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
			
			if(jTableDatosEstadoCivil.getRowCount()>=1) {
				jTableDatosEstadoCivil.removeRowSelectionInterval(0, jTableDatosEstadoCivil.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoCivil=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoCivil(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoCivil(true);			
			//this.estadocivil=new EstadoCivil();
			//this.estadocivil.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCivil(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCivil() ;
			
			if(EstadoCivilJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCivil(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadocivil);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);				
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
			if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoCivil: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoCivilActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoCivil.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoCivil.getSelectedRows().length;			
			}
			
			estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoCivil--;			
				//EstadoCivil estadocivilAux= new EstadoCivil();			
				//estadocivilAux.setId(this.iIdNuevoEstadoCivil);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoCivil estadocivilOrigen=new EstadoCivil();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoCivil estadocivilOrigen : estadocivilsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadocivilOrigen =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocivilOrigen =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoCivil();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadocivil.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoCivil(estadocivilOrigen,this.estadocivil,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadocivilLogic.getEstadoCivils().add(this.estadocivilAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadocivils.add(this.estadocivilAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoCivil(false);
				
				this.jTableDatosEstadoCivil.setRowSelectionInterval(this.getIndiceNuevoEstadoCivil(), this.getIndiceNuevoEstadoCivil());
				
				int iLastRow =  this.jTableDatosEstadoCivil.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoCivil.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoCivil.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCivil(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();									
		
			EstadoCivil estadocivilOrigen=new EstadoCivil();
			EstadoCivil estadocivilDestino=new EstadoCivil();
				
			estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoCivil.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadocivilsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoCivil.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocivilOrigen =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadocivilOrigen =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocivilDestino =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadocivilDestino =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadocivilOrigen =estadocivilsSeleccionados.get(0);
				estadocivilDestino =estadocivilsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoCivil(estadocivilOrigen,estadocivilDestino,true,false);
				
				estadocivilDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadocivilDestino,estadocivilLogic.getEstadoCivils());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocivilDestino,estadocivils);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoCivil(false);
				
				//this.jTableDatosEstadoCivil.setRowSelectionInterval(this.getIndiceNuevoEstadoCivil(), this.getIndiceNuevoEstadoCivil());
				
				int iLastRow =  this.jTableDatosEstadoCivil.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoCivil.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoCivil.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCivil(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoCivil.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoCivil.isVisible();
			
			
			this.jPanelParametrosReportesEstadoCivil.setVisible(!isVisible);
			this.jPanelPaginacionEstadoCivil.setVisible(!isVisible);
			this.jPanelAccionesEstadoCivil.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoCivil();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoCivil();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoCivil();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoCivil();
			
			this.abrirFrameOrderByEstadoCivil();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoCivil();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoCivil(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoCivil);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoCivil.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoCivil.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoCivil.setSize(this.jInternalFrameDetalleFormEstadoCivil.iWidthFormulario,this.jInternalFrameDetalleFormEstadoCivil.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoCivil.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoCivil.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoCivil.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoCivil.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),EstadoCivilConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),EstadoCivilConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),EstadoCivilConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargaFamiliar();
					}

					if(CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargaFamiliar_NM();
					}

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}

					if(SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoCivil.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoCivil.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoCivil() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoCivil==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoCivil=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCivil,false,this);
				} else {
					this.jInternalFrameOrderByEstadoCivil=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCivil,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoCivil);
				this.jInternalFrameOrderByEstadoCivil.setVisible(false);
				this.jInternalFrameOrderByEstadoCivil.setSelected(false);
				
				this.jInternalFrameOrderByEstadoCivil.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoCivil"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoCivil();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoCivil() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoCivil==null) {
				
				this.jInternalFrameImportacionEstadoCivil=new ImportacionJInternalFrame(EstadoCivilConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoCivil);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoCivil);
				this.jInternalFrameImportacionEstadoCivil.setVisible(false);
				this.jInternalFrameImportacionEstadoCivil.setSelected(false);


				this.jInternalFrameImportacionEstadoCivil.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoCivil"));
				this.jInternalFrameImportacionEstadoCivil.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoCivil"));
				this.jInternalFrameImportacionEstadoCivil.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoCivil"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoCivil() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoCivil==null) {
				this.jInternalFrameReporteDinamicoEstadoCivil=new ReporteDinamicoJInternalFrame(EstadoCivilConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoCivil);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoCivil);
				this.jInternalFrameReporteDinamicoEstadoCivil.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoCivil.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoCivil.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCivil"));
				this.jInternalFrameReporteDinamicoEstadoCivil.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCivil"));
				this.jInternalFrameReporteDinamicoEstadoCivil.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCivil"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCivil();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCargaFamiliar() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCargaFamiliar_NM() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoCivil.jContentPaneDetalleEstadoCivil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoCivil() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoCivil);
			
	       	this.jInternalFrameDetalleFormEstadoCivil.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoCivil.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoCivil.dispose();
			//this.jInternalFrameDetalleFormEstadoCivil=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoCivil() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoCivil.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoCivil.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoCivil() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoCivil.setVisible(true);
	        this.jInternalFrameImportacionEstadoCivil.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoCivil() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoCivil.setVisible(true);
	        this.jInternalFrameOrderByEstadoCivil.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoCivil() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoCivil.setVisible(false);
	        this.jInternalFrameOrderByEstadoCivil.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoCivil() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoCivil.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoCivil.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoCivil() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoCivil.setVisible(false);
	        this.jInternalFrameImportacionEstadoCivil.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoCivil(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoCivil(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoCivil(true);
			//this.isEsNuevoEstadoCivil=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoCivil("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCivil(false) ;
			
			if(estadocivilSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() && CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliar_NMActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado() && CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliarActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoCivilJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCivil(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCivil(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoCivilActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoCivil(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoCivil(true);
			//this.isEsNuevoEstadoCivil=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadocivil.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoCivil("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoCivil(false) ;
			
			if(EstadoCivilJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoCivil(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCivil(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoCivil(false);
			
			//if(!this.isEsNuevoEstadoCivil) {								
				int intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
				
			}
			
			if(this.permiteMantenimiento(this.estadocivil)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoCivil=true;
					this.inicializarActualizarBindingTablaEstadoCivil(false);
					this.isEsNuevoEstadoCivil=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoCivil=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoCivil=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoCivil(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCivil(false);
				
				this.habilitarDeshabilitarControlesEstadoCivil(false);
			
												
				
				if(EstadoCivilJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoCivil();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoCivilActionPerformed(evt,estadocivilSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoCivil(this.estadocivil,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoCivil.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadocivilSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadocivil.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoCivilActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				this.estadocivil.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				this.estadocivil.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadocivil)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoCivilModel) this.jTableDatosEstadoCivil.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoCivil=true;
				this.inicializarActualizarBindingTablaEstadoCivil(false);
				this.isEsNuevoEstadoCivil=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoCivil(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCivil(false);
				
				this.habilitarDeshabilitarControlesEstadoCivil(false);
				
				
				
				if(EstadoCivilJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoCivil();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoCivilActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoCivil.getRowCount()>=1) {
				jTableDatosEstadoCivil.removeRowSelectionInterval(0, jTableDatosEstadoCivil.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoCivil(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoCivil(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoCivil(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoCivil(false) ;
			
			this.isEsNuevoEstadoCivil=false;
			
			if(EstadoCivilJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoCivil();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoCivilActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoCivil(false);
				
				//SI ES MANUAL
				if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoCivil();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoCivilActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoCivil--;			
			//EstadoCivil estadocivilAux= new EstadoCivil();			
			//estadocivilAux.setId(this.iIdNuevoEstadoCivil);
			
			if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoCivil();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
			
			this.estadocivil.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadocivilLogic.getEstadoCivils().add(this.estadocivilAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadocivils.add(this.estadocivilAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoCivil(false);
			
			this.jTableDatosEstadoCivil.setRowSelectionInterval(this.getIndiceNuevoEstadoCivil(), this.getIndiceNuevoEstadoCivil());
			
			int iLastRow =  this.jTableDatosEstadoCivil.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoCivil.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoCivil.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoCivil(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoCivilActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoCivil(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCivil(false);
			
			//SI ES MANUAL
			if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCivil();
			}
			
			//this.abrirFrameTreeEstadoCivil();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoCivilActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado CivilES ?", "MANTENIMIENTO DE Estado Civil", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoCivil.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoCivil();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadocivilReturnGeneral=estadocivilLogic.procesarImportacionEstadoCivilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadocivilParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoCivilReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoCivilActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoCivil.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoCivil.setFileImportacion(this.jInternalFrameImportacionEstadoCivil.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoCivil.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoCivil.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoCivil.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoCivil.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoCivilActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		

		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoCivilBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoCivilBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoCivils("Todos",estadocivilsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoCivilConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoCivilConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoCivil.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoCivilConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoCivilConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoCivilConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoCivilConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoCivilConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoCivilConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoCivilActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocivil";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoCivils");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoCivilConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoCivilConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoCivil estadocivil:estadocivilsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocivil.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoCivilConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoCivilConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoCivil estadocivil:estadocivilsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocivil.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoCivil(row);				
			//	iRow++;
			//}				
			
			//for(EstadoCivil estadocivilAux:estadocivilsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoCivil(estadocivilAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadocivilLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCivil(false);
			
			//SI ES MANUAL
			if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoCivil();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoCivilActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCivil(false);
			
			//SI ES MANUAL
			if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoCivil();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoCivilActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoCivil(false);
			
			//SI ES MANUAL
			if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoCivil();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocivilLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoCivil() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoCivil.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoCivil.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoCivil.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoCivil.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoCivil.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoCivil.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoCivil.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoCivil(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoCivil(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoCivil(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoCivil(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoCivil(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoCivil(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCivil(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoCivil(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoCivil() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoCivil();
		
		this.inicializarActualizarBindingBotonesManualEstadoCivil(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoCivil();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCivil() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCivil(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCivil(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoCivil.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoCivil.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoCivil.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoCivil.jCheckBoxPostAccionNuevoEstadoCivil.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoCivil.jCheckBoxPostAccionSinCerrarEstadoCivil.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoCivil.jCheckBoxPostAccionSinMensajeEstadoCivil.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoCivil.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoCivil.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoCivil.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
				this.jInternalFrameDetalleFormEstadoCivil.jCheckBoxPostAccionNuevoEstadoCivil.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoCivil.jCheckBoxPostAccionSinCerrarEstadoCivil.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoCivil.jCheckBoxPostAccionSinMensajeEstadoCivil.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoCivil.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoCivil.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoCivil.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoCivil.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoCivil.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoCivil.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoCivil.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoCivil.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoCivil.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoCivil(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoCivil(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoCivil() throws Exception {
		try	{
			if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoCivil();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoCivil() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoCivil() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoCivil.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoCivil.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoCivil.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoCivil.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoCivil.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoCivil.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoCivil.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoCivil.addItem(reporte);
			}
			
			
			if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoCivil.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoCivil.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoCivil.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoCivil.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoCivil.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoCivil.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoCivil.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoCivil.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoCivil.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCivil();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoCivil() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
				this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
				this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoCivil.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoCivil.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoCivil.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoCivil.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoCivil.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoCivil()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoCivil(Boolean esInicializar) throws Exception {				
		if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoCivil();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoCivil() throws Exception {
		this.inicializarActualizarBindingTablaEstadoCivil(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoCivil() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoCivilPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoCivilPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoCivilOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCivilOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoCivilPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoCivilPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoCivil(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadocivilLogic.getEstadoCivils().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadocivils.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoCivil.setModel(new EstadoCivilModel(this.estadocivilLogic.getEstadoCivils(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoCivil.setModel(new EstadoCivilModel(this.estadocivils,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoCivil!=null && this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoCivil();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoCivil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCivil,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoCivilPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO,estadocivilConstantesFunciones.resaltarSeleccionarEstadoCivil,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO,estadocivilConstantesFunciones.resaltarSeleccionarEstadoCivil,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoCivil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCivil,EstadoCivilConstantesFunciones.LABEL_ID));

		if(this.estadocivilConstantesFunciones.mostraridEstadoCivil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCivilConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadocivilConstantesFunciones.resaltaridEstadoCivil,this.estadocivilConstantesFunciones.activaridEstadoCivil,this,true,"idEstadoCivil","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocivilConstantesFunciones.resaltaridEstadoCivil,this.estadocivilConstantesFunciones.activaridEstadoCivil,this,true,"idEstadoCivil","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCivil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCivil,EstadoCivilConstantesFunciones.LABEL_CODIGO));

		if(this.estadocivilConstantesFunciones.mostrarcodigoEstadoCivil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCivilConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadocivilConstantesFunciones.resaltarcodigoEstadoCivil,this.estadocivilConstantesFunciones.activarcodigoEstadoCivil,this,true,"codigoEstadoCivil","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocivilConstantesFunciones.resaltarcodigoEstadoCivil,this.estadocivilConstantesFunciones.activarcodigoEstadoCivil,this,true,"codigoEstadoCivil","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoCivilPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoCivil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoCivil,EstadoCivilConstantesFunciones.LABEL_NOMBRE));

		if(this.estadocivilConstantesFunciones.mostrarnombreEstadoCivil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoCivilConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadocivilConstantesFunciones.resaltarnombreEstadoCivil,this.estadocivilConstantesFunciones.activarnombreEstadoCivil,this,true,"nombreEstadoCivil","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocivilConstantesFunciones.resaltarnombreEstadoCivil,this.estadocivilConstantesFunciones.activarnombreEstadoCivil,this,true,"nombreEstadoCivil","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoCivilPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.estadocivilConstantesFunciones.mostrarClienteEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(estadocivilConstantesFunciones.resaltarClienteEstadoCivil,this,this.estadocivilConstantesFunciones.activarClienteEstadoCivil));
				tableColumn.setCellEditor(new ClienteTableCell(estadocivilConstantesFunciones.resaltarClienteEstadoCivil,this,this.estadocivilConstantesFunciones.activarClienteEstadoCivil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoCivil.addColumn(tableColumn);
			}

			if(this.isTienePermisosCargaFamiliar_NM && this.estadocivilConstantesFunciones.mostrarCargaFamiliar_NMEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Carga Familiar_ N Mes");
				tableColumn.setHeaderValue("Carga Familiar_ N Mes");
				tableColumn.setCellRenderer(new CargaFamiliar_NMTableCell(estadocivilConstantesFunciones.resaltarCargaFamiliar_NMEstadoCivil,this,this.estadocivilConstantesFunciones.activarCargaFamiliar_NMEstadoCivil));
				tableColumn.setCellEditor(new CargaFamiliar_NMTableCell(estadocivilConstantesFunciones.resaltarCargaFamiliar_NMEstadoCivil,this,this.estadocivilConstantesFunciones.activarCargaFamiliar_NMEstadoCivil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoCivil.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubCliente && this.estadocivilConstantesFunciones.mostrarSubClienteEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sub Clientes");
				tableColumn.setHeaderValue("Sub Clientes");
				tableColumn.setCellRenderer(new SubClienteTableCell(estadocivilConstantesFunciones.resaltarSubClienteEstadoCivil,this,this.estadocivilConstantesFunciones.activarSubClienteEstadoCivil));
				tableColumn.setCellEditor(new SubClienteTableCell(estadocivilConstantesFunciones.resaltarSubClienteEstadoCivil,this,this.estadocivilConstantesFunciones.activarSubClienteEstadoCivil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoCivil.addColumn(tableColumn);
			}

			if(this.isTienePermisosEmpleado && this.estadocivilConstantesFunciones.mostrarEmpleadoEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(estadocivilConstantesFunciones.resaltarEmpleadoEstadoCivil,this,this.estadocivilConstantesFunciones.activarEmpleadoEstadoCivil));
				tableColumn.setCellEditor(new EmpleadoTableCell(estadocivilConstantesFunciones.resaltarEmpleadoEstadoCivil,this,this.estadocivilConstantesFunciones.activarEmpleadoEstadoCivil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoCivil.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.estadocivilConstantesFunciones.mostrarParametroCarteraDefectoEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(estadocivilConstantesFunciones.resaltarParametroCarteraDefectoEstadoCivil,this,this.estadocivilConstantesFunciones.activarParametroCarteraDefectoEstadoCivil));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(estadocivilConstantesFunciones.resaltarParametroCarteraDefectoEstadoCivil,this,this.estadocivilConstantesFunciones.activarParametroCarteraDefectoEstadoCivil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoCivil.addColumn(tableColumn);
			}

			if(this.isTienePermisosCargaFamiliar && this.estadocivilConstantesFunciones.mostrarCargaFamiliarEstadoCivil && !EstadoCivilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Carga Familiares");
				tableColumn.setHeaderValue("Carga Familiares");
				tableColumn.setCellRenderer(new CargaFamiliarTableCell(estadocivilConstantesFunciones.resaltarCargaFamiliarEstadoCivil,this,this.estadocivilConstantesFunciones.activarCargaFamiliarEstadoCivil));
				tableColumn.setCellEditor(new CargaFamiliarTableCell(estadocivilConstantesFunciones.resaltarCargaFamiliarEstadoCivil,this,this.estadocivilConstantesFunciones.activarCargaFamiliarEstadoCivil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoCivil.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadocivilSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadocivilSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoCivil.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadocivilSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadocivilSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoCivil.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadocivilSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadocivilSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoCivil.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadocivilSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoCivil.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoCivil.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadocivilSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoCivil.moveColumn(this.jTableDatosEstadoCivil.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoCivil.moveColumn(this.jTableDatosEstadoCivil.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadocivilSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoCivil.moveColumn(this.jTableDatosEstadoCivil.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoCivil.moveColumn(this.jTableDatosEstadoCivil.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoCivil.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoCivil.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoCivil,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoCivil.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoCivil.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoCivil.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoCivil.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoCivil.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadocivilLogic.getEstadoCivils().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadocivils.size()-1;
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
		//this.jTableDatosEstadoCivil.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoCivil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoCivil();
			
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
				
				//this.isEsNuevoEstadoCivil=false;
					
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
				if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoCivil==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoCivil.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoCivil.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadocivil.getsType().equals("DUPLICADO")
				   || this.estadocivil.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoCivil=true;
				
				} else {
					this.isEsNuevoEstadoCivil=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
					if(this.estadocivil.getId()>=0 && !this.estadocivil.getIsNew()) {						
						this.isEsNuevoEstadoCivil=false;
						
					} else {
						this.isEsNuevoEstadoCivil=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoCivil(esRelaciones);						
				
				this.seleccionarEstadoCivil(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadocivil.getId()<0) {
					this.isEsNuevoEstadoCivil=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoCivil(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoCivil(evt,rowIndex);
				}	
				
				if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoCivil: " + this.dDif); 
					}
				}								
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoCivil(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadocivil)) {
					if(this.estadocivil.getId()>0) {
						this.estadocivil.setIsDeleted(true);
						
						this.estadocivilsEliminados.add(this.estadocivil);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadocivilLogic.getEstadoCivils().remove(this.estadocivil);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadocivils.remove(this.estadocivil);				
					}
					
					
					((EstadoCivilModel) this.jTableDatosEstadoCivil.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoCivil(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoCivil(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoCivil) {
			
			if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoCivil.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoCivil.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoCivil(this.estadocivil);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoCivil("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoCivil(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoCivil() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoCivil(EstadoCivil estadocivil) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoCivil(estadocivil,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoCivil(EstadoCivil estadocivil,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoCivil(estadocivil);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoCivil(estadocivil,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoCivil(estadocivil);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoCivil(EstadoCivil estadocivil) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.setText(estadocivil.getId().toString());
			this.jInternalFrameDetalleFormEstadoCivil.jTextFieldcodigoEstadoCivil.setText(estadocivil.getcodigo());
			this.jInternalFrameDetalleFormEstadoCivil.jTextAreanombreEstadoCivil.setText(estadocivil.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoCivil estadocivilLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadocivilLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoCivil estadocivilLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadocivilLocal=this.estadocivil;
			} else {
				estadocivilLocal=this.estadocivilAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadocivilLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoCivil(estadocivilLocal,true);
					
					if(estadocivilSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadocivilLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadocivilSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadocivilLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoCivil(EstadoCivil estadocivil,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoCivil(estadocivil,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(estadocivil);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoCivil(EstadoCivil estadocivil,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoCivil(estadocivil,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoCivil(EstadoCivil estadocivil,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.getText()==null || this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.getText()=="" || this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.setText("0");
			}

			if(conColumnasBase) {estadocivil.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCivilConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCivil.jLabelIdEstadoCivil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocivil.setcodigo(this.jInternalFrameDetalleFormEstadoCivil.jTextFieldcodigoEstadoCivil.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCivilConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCivil.jLabelcodigoEstadoCivil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocivil.setnombre(this.jInternalFrameDetalleFormEstadoCivil.jTextAreanombreEstadoCivil.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoCivilConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoCivil.jLabelnombreEstadoCivil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoCivil(EstadoCivil estadocivilBean,EstadoCivil estadocivil,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoCivil(EstadoCivil estadocivilOrigen,EstadoCivil estadocivil,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadocivilOrigen.getId()!=null && !estadocivilOrigen.getId().equals(0L))) {estadocivil.setId(estadocivilOrigen.getId());}}
			if(conDefault || (!conDefault && estadocivilOrigen.getcodigo()!=null && !estadocivilOrigen.getcodigo().equals(""))) {estadocivil.setcodigo(estadocivilOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadocivilOrigen.getnombre()!=null && !estadocivilOrigen.getnombre().equals(""))) {estadocivil.setnombre(estadocivilOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoCivil(EstadoCivil estadocivil) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.setText(estadocivil.getId().toString());
			this.jInternalFrameDetalleFormEstadoCivil.jTextFieldcodigoEstadoCivil.setText(estadocivil.getcodigo());
			this.jInternalFrameDetalleFormEstadoCivil.jTextAreanombreEstadoCivil.setText(estadocivil.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoCivil(EstadoCivilBean estadocivilBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.setText(estadocivilBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoCivil.jTextFieldcodigoEstadoCivil.setText(estadocivilBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoCivil.jTextAreanombreEstadoCivil.setText(estadocivilBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoCivil(EstadoCivilParameterReturnGeneral estadocivilReturnGeneral,EstadoCivilBean estadocivilBean,Boolean conDefault) throws Exception { 
		try {
			EstadoCivil estadocivilLocal=new EstadoCivil();
			
			estadocivilLocal=estadocivilReturnGeneral.getEstadoCivil();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadocivilLocal.getId()!=null && !estadocivilLocal.getId().equals(0L))) {estadocivilBean.setId(estadocivilLocal.getId());}}
			if(conDefault || (!conDefault && estadocivilLocal.getcodigo()!=null && !estadocivilLocal.getcodigo().equals(""))) {estadocivilBean.setcodigo(estadocivilLocal.getcodigo());}
			if(conDefault || (!conDefault && estadocivilLocal.getnombre()!=null && !estadocivilLocal.getnombre().equals(""))) {estadocivilBean.setnombre(estadocivilLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoCivilGenerico(Long idEstadoCivilSeleccionado,JComboBox jComboBoxEstadoCivil,List<EstadoCivil> estadocivilsLocal)throws Exception {
		try {
			EstadoCivil  estadocivilTemp=null;

			for(EstadoCivil estadocivilAux:estadocivilsLocal) {
				if(estadocivilAux.getId()!=null && estadocivilAux.getId().equals(idEstadoCivilSeleccionado)) {
					estadocivilTemp=estadocivilAux;
					break;
				}
			}

			jComboBoxEstadoCivil.setSelectedItem(estadocivilTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoCivilGenerico(JComboBox jComboBoxEstadoCivil,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoCivil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoCivil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoCivil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoCivil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoCivil.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoCivil.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoCivil.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoCivil.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoCivil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoCivil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CargaFamiliar_NM")) {
			jButtonCargaFamiliar_NMActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SubCliente")) {
			jButtonSubClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CargaFamiliar")) {
			jButtonCargaFamiliarActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocivil=(EstadoCivil) estadocivilLogic.getEstadoCivils().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocivil =(EstadoCivil) estadocivils.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoCivil estadocivilRow=new EstadoCivil();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocivilRow=(EstadoCivil) estadocivilLogic.getEstadoCivils().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocivilRow=(EstadoCivil) estadocivils.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoCivil estadocivil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoCivil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil = (EstadoCivil)this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadocivil = (EstadoCivil)this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadocivil!=null) {
						this.estadocivil = estadocivil;
					} else {
						this.estadocivil = new EstadoCivil();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.estadocivil)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame;
					}

					List<EstadoCivil> estadocivils=new ArrayList<EstadoCivil>();
					estadocivils.add(this.estadocivil);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoCivil.cargarClienteBeanSwingJInternalFrame(estadocivils,this.estadocivil,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoCivil=(TitledBorder)this.jScrollPanelDatosEstadoCivil.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderEstadoCivil.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadocivilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCargaFamiliar_NMActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoCivil estadocivil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoCivil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil = (EstadoCivil)this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadocivil = (EstadoCivil)this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadocivil!=null) {
						this.estadocivil = estadocivil;
					} else {
						this.estadocivil = new EstadoCivil();
					}
				}

				if(this.isTienePermisosCargaFamiliar_NM && this.permiteMantenimiento(this.estadocivil)) {
					CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFramePopup=new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargafamiliar_nmBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFramePopup;
					} else {
						cargafamiliar_nmBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame;
					}

					List<EstadoCivil> estadocivils=new ArrayList<EstadoCivil>();
					estadocivils.add(this.estadocivil);
					if(!esRelacionado) {
						//cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setConGuardarRelaciones(false);
						//cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargafamiliar_nmBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoCivil.cargarCargaFamiliar_NMBeanSwingJInternalFrame(estadocivils,this.estadocivil,cargafamiliar_nmBeanSwingJInternalFrame,/*conInicializar,*/cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getConGuardarRelaciones(),cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
					cargafamiliar_nmBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("no_relacionado");

						cargafamiliar_nmBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargaFamiliar_NMConstantesFunciones.ITAMANIOFILATABLA + (CargaFamiliar_NMConstantesFunciones.ITAMANIOFILATABLA/2));

						cargafamiliar_nmBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoCivil=(TitledBorder)this.jScrollPanelDatosEstadoCivil.getBorder();
						TitledBorder titledBorderCargaFamiliar_NM=(TitledBorder)cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.getBorder();

						titledBorderCargaFamiliar_NM.setTitle(titledBorderEstadoCivil.getTitle() + " -> Carga Familiar_ N M");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargafamiliar_nmBeanSwingJInternalFrame);
						}

						cargafamiliar_nmBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargafamiliar_nmBeanSwingJInternalFrame);

						cargafamiliar_nmBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadocivilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Carga Familiar_ N M",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSubClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoCivil estadocivil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoCivil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil = (EstadoCivil)this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadocivil = (EstadoCivil)this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadocivil!=null) {
						this.estadocivil = estadocivil;
					} else {
						this.estadocivil = new EstadoCivil();
					}
				}

				if(this.isTienePermisosSubCliente && this.permiteMantenimiento(this.estadocivil)) {
					SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFramePopup;
					} else {
						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame;
					}

					List<EstadoCivil> estadocivils=new ArrayList<EstadoCivil>();
					estadocivils.add(this.estadocivil);
					if(!esRelacionado) {
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setConGuardarRelaciones(false);
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoCivil.cargarSubClienteBeanSwingJInternalFrame(estadocivils,this.estadocivil,subclienteBeanSwingJInternalFrame,/*conInicializar,*/subclienteBeanSwingJInternalFrame.subclienteSessionBean.getConGuardarRelaciones(),subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado());
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");

						subclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubClienteConstantesFunciones.ITAMANIOFILATABLA + (SubClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						subclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoCivil=(TitledBorder)this.jScrollPanelDatosEstadoCivil.getBorder();
						TitledBorder titledBorderSubCliente=(TitledBorder)subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getBorder();

						titledBorderSubCliente.setTitle(titledBorderEstadoCivil.getTitle() + " -> Sub Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subclienteBeanSwingJInternalFrame);
						}

						subclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subclienteBeanSwingJInternalFrame);

						subclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadocivilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoCivil estadocivil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoCivil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil = (EstadoCivil)this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadocivil = (EstadoCivil)this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadocivil!=null) {
						this.estadocivil = estadocivil;
					} else {
						this.estadocivil = new EstadoCivil();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.estadocivil)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame;
					}

					List<EstadoCivil> estadocivils=new ArrayList<EstadoCivil>();
					estadocivils.add(this.estadocivil);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoCivil.cargarEmpleadoBeanSwingJInternalFrame(estadocivils,this.estadocivil,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoCivil=(TitledBorder)this.jScrollPanelDatosEstadoCivil.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderEstadoCivil.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadocivilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoCivil estadocivil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoCivil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil = (EstadoCivil)this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadocivil = (EstadoCivil)this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadocivil!=null) {
						this.estadocivil = estadocivil;
					} else {
						this.estadocivil = new EstadoCivil();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.estadocivil)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<EstadoCivil> estadocivils=new ArrayList<EstadoCivil>();
					estadocivils.add(this.estadocivil);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoCivil.cargarParametroCarteraDefectoBeanSwingJInternalFrame(estadocivils,this.estadocivil,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoCivil=(TitledBorder)this.jScrollPanelDatosEstadoCivil.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderEstadoCivil.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadocivilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCargaFamiliarActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoCivil estadocivil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoCivil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil = (EstadoCivil)this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadocivil = (EstadoCivil)this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadocivil!=null) {
						this.estadocivil = estadocivil;
					} else {
						this.estadocivil = new EstadoCivil();
					}
				}

				if(this.isTienePermisosCargaFamiliar && this.permiteMantenimiento(this.estadocivil)) {
					CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFramePopup=new CargaFamiliarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargafamiliarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFramePopup;
					} else {
						cargafamiliarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame;
					}

					List<EstadoCivil> estadocivils=new ArrayList<EstadoCivil>();
					estadocivils.add(this.estadocivil);
					if(!esRelacionado) {
						//cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setConGuardarRelaciones(false);
						//cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargafamiliarBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoCivil.cargarCargaFamiliarBeanSwingJInternalFrame(estadocivils,this.estadocivil,cargafamiliarBeanSwingJInternalFrame,/*conInicializar,*/cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getConGuardarRelaciones(),cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado());
					cargafamiliarBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("no_relacionado");

						cargafamiliarBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargaFamiliarConstantesFunciones.ITAMANIOFILATABLA + (CargaFamiliarConstantesFunciones.ITAMANIOFILATABLA/2));

						cargafamiliarBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoCivil=(TitledBorder)this.jScrollPanelDatosEstadoCivil.getBorder();
						TitledBorder titledBorderCargaFamiliar=(TitledBorder)cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.getBorder();

						titledBorderCargaFamiliar.setTitle(titledBorderEstadoCivil.getTitle() + " -> Carga Familiar");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargafamiliarBeanSwingJInternalFrame);
						}

						cargafamiliarBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargafamiliarBeanSwingJInternalFrame);

						cargafamiliarBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadocivilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Carga Familiar",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoCivil(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoEstadoCivil && this.isPermisoNuevoEstadoCivil));			
			this.jButtonDuplicarEstadoCivil.setVisible((this.isVisibilidadCeldaDuplicarEstadoCivil && this.isPermisoDuplicarEstadoCivil));			
			this.jButtonCopiarEstadoCivil.setVisible((this.isVisibilidadCeldaCopiarEstadoCivil && this.isPermisoCopiarEstadoCivil));
			this.jButtonVerFormEstadoCivil.setVisible((this.isVisibilidadCeldaVerFormEstadoCivil && this.isPermisoVerFormEstadoCivil));
			
			this.jButtonAbrirOrderByEstadoCivil.setVisible((this.isVisibilidadCeldaOrdenEstadoCivil && this.isPermisoOrdenEstadoCivil));			
			
			this.jButtonNuevoRelacionesEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCivil && this.isPermisoNuevoEstadoCivil));			
			this.jButtonNuevoGuardarCambiosEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoEstadoCivil && this.isPermisoNuevoEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));
			
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarEstadoCivil.setVisible((this.isVisibilidadCeldaModificarEstadoCivil && this.isPermisoActualizarEstadoCivil));	
			this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarEstadoCivil.setVisible((this.isVisibilidadCeldaActualizarEstadoCivil && this.isPermisoActualizarEstadoCivil));	
			this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarEstadoCivil.setVisible((this.isVisibilidadCeldaEliminarEstadoCivil && this.isPermisoEliminarEstadoCivil));
			this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarEstadoCivil.setVisible(this.isVisibilidadCeldaCancelarEstadoCivil);							
			this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosEstadoCivil.setVisible((this.isVisibilidadCeldaGuardarEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoCivil.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoEstadoCivil && this.isPermisoNuevoEstadoCivil));						
			this.jButtonDuplicarToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaDuplicarEstadoCivil && this.isPermisoDuplicarEstadoCivil));						
			this.jButtonCopiarToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaCopiarEstadoCivil && this.isPermisoCopiarEstadoCivil));			
			this.jButtonVerFormToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaVerFormEstadoCivil && this.isPermisoVerFormEstadoCivil));			
			this.jButtonAbrirOrderByToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaOrdenEstadoCivil && this.isPermisoOrdenEstadoCivil));
			this.jButtonNuevoRelacionesToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCivil && this.isPermisoNuevoEstadoCivil));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoEstadoCivil && this.isPermisoNuevoEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));			
			
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaModificarEstadoCivil && this.isPermisoActualizarEstadoCivil));	
			this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaActualizarEstadoCivil  && this.isPermisoActualizarEstadoCivil));	
			this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaEliminarEstadoCivil && this.isPermisoEliminarEstadoCivil));
			this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarToolBarEstadoCivil.setVisible(this.isVisibilidadCeldaCancelarEstadoCivil);				
			this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaGuardarEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoCivil.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoEstadoCivil && this.isPermisoNuevoEstadoCivil));			
			this.jMenuItemDuplicarEstadoCivil.setVisible((this.isVisibilidadCeldaDuplicarEstadoCivil && this.isPermisoDuplicarEstadoCivil));			
			this.jMenuItemCopiarEstadoCivil.setVisible((this.isVisibilidadCeldaCopiarEstadoCivil && this.isPermisoCopiarEstadoCivil));			
			this.jMenuItemVerFormEstadoCivil.setVisible((this.isVisibilidadCeldaVerFormEstadoCivil && this.isPermisoVerFormEstadoCivil));			
			this.jMenuItemAbrirOrderByEstadoCivil.setVisible((this.isVisibilidadCeldaOrdenEstadoCivil && this.isPermisoOrdenEstadoCivil));			
			//this.jMenuItemMostrarOcultarEstadoCivil.setVisible((this.isVisibilidadCeldaOrdenEstadoCivil && this.isPermisoOrdenEstadoCivil));
			this.jMenuItemDetalleAbrirOrderByEstadoCivil.setVisible((this.isVisibilidadCeldaOrdenEstadoCivil && this.isPermisoOrdenEstadoCivil));			
			//this.jMenuItemDetalleMostrarOcultarEstadoCivil.setVisible((this.isVisibilidadCeldaOrdenEstadoCivil && this.isPermisoOrdenEstadoCivil));			
			this.jMenuItemNuevoRelacionesEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoCivil && this.isPermisoNuevoEstadoCivil));			
			this.jMenuItemNuevoGuardarCambiosEstadoCivil.setVisible((this.isVisibilidadCeldaNuevoEstadoCivil && this.isPermisoNuevoEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));									
			
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemModificarEstadoCivil.setVisible((this.isVisibilidadCeldaModificarEstadoCivil && this.isPermisoActualizarEstadoCivil));	
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemActualizarEstadoCivil.setVisible((this.isVisibilidadCeldaActualizarEstadoCivil && this.isPermisoActualizarEstadoCivil));	
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemEliminarEstadoCivil.setVisible((this.isVisibilidadCeldaEliminarEstadoCivil && this.isPermisoEliminarEstadoCivil));
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemCancelarEstadoCivil.setVisible(this.isVisibilidadCeldaCancelarEstadoCivil);				
			}
			
			this.jMenuItemGuardarCambiosEstadoCivil.setVisible((this.isVisibilidadCeldaGuardarEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));						
			this.jMenuItemGuardarCambiosTablaEstadoCivil.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoCivil=this.jButtonNuevoEstadoCivil.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoCivil=this.jButtonDuplicarEstadoCivil.isVisible();
			this.isVisibilidadCeldaCopiarEstadoCivil=this.jButtonCopiarEstadoCivil.isVisible();
			this.isVisibilidadCeldaVerFormEstadoCivil=this.jButtonVerFormEstadoCivil.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoCivil=this.jButtonAbrirOrderByEstadoCivil.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=this.jButtonNuevoRelacionesEstadoCivil.isVisible();
			this.isVisibilidadCeldaModificarEstadoCivil=this.jButtonModificarEstadoCivil.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			this.isVisibilidadCeldaActualizarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarEstadoCivil.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarEstadoCivil.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarEstadoCivil.isVisible();
			this.isVisibilidadCeldaGuardarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosEstadoCivil.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=this.jButtonGuardarCambiosTablaEstadoCivil.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoCivil=this.jButtonNuevoToolBarEstadoCivil.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=this.jButtonNuevoRelacionesToolBarEstadoCivil.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			this.isVisibilidadCeldaModificarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarToolBarEstadoCivil.isVisible();
			this.isVisibilidadCeldaActualizarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarToolBarEstadoCivil.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarToolBarEstadoCivil.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarToolBarEstadoCivil.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoCivil=this.jButtonGuardarCambiosToolBarEstadoCivil.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=this.jButtonGuardarCambiosTablaToolBarEstadoCivil.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoCivil=this.jMenuItemNuevoEstadoCivil.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=this.jMenuItemNuevoRelacionesEstadoCivil.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			this.isVisibilidadCeldaModificarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jMenuItemModificarEstadoCivil.isVisible();
			this.isVisibilidadCeldaActualizarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jMenuItemActualizarEstadoCivil.isVisible();
			this.isVisibilidadCeldaEliminarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jMenuItemEliminarEstadoCivil.isVisible();
			this.isVisibilidadCeldaCancelarEstadoCivil=this.jInternalFrameDetalleFormEstadoCivil.jMenuItemCancelarEstadoCivil.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoCivil=this.jMenuItemGuardarCambiosEstadoCivil.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=this.jMenuItemGuardarCambiosTablaEstadoCivil.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoCivil(Boolean esInicializar) {
		if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
				//if(this.estadocivilSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoCivil();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoCivil(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoCivil() {
		this.jButtonNuevoEstadoCivil.setVisible(this.isPermisoNuevoEstadoCivil);			
		this.jButtonDuplicarEstadoCivil.setVisible(this.isPermisoDuplicarEstadoCivil);			
		this.jButtonCopiarEstadoCivil.setVisible(this.isPermisoCopiarEstadoCivil);			
		this.jButtonVerFormEstadoCivil.setVisible(this.isPermisoVerFormEstadoCivil);			
		
		this.jButtonAbrirOrderByEstadoCivil.setVisible(this.isPermisoOrdenEstadoCivil);					
		
		this.jButtonNuevoRelacionesEstadoCivil.setVisible(this.isPermisoNuevoEstadoCivil);			
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarEstadoCivil.setVisible(this.isPermisoActualizarEstadoCivil);	
			this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarEstadoCivil.setVisible(this.isPermisoActualizarEstadoCivil);	
			this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarEstadoCivil.setVisible(this.isPermisoEliminarEstadoCivil);
			this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarEstadoCivil.setVisible(this.isVisibilidadCeldaCancelarEstadoCivil);						
			this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosEstadoCivil.setVisible(this.isPermisoGuardarCambiosEstadoCivil);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoCivil.setVisible(this.isPermisoActualizarEstadoCivil);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoCivil() {
		this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarEstadoCivil.setVisible(this.isPermisoActualizarEstadoCivil);	
		this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarEstadoCivil.setVisible(this.isPermisoActualizarEstadoCivil);	
		this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarEstadoCivil.setVisible(this.isPermisoEliminarEstadoCivil);
		this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarEstadoCivil.setVisible(this.isVisibilidadCeldaCancelarEstadoCivil);							
		this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosEstadoCivil.setVisible((this.isVisibilidadCeldaGuardarEstadoCivil && this.isPermisoGuardarCambiosEstadoCivil));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoCivil() {
		if(EstadoCivilJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoCivil();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoCivil() {
	}
	
	public void jTableDatosEstadoCivilListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoCivil(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoCivilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCivil(this.getestadocivil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocivil==null) {
						this.estadocivil = new EstadoCivil();
					}

					this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
				}

				if(this.estadocivil.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadocivil.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCivil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoCivilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCivil(this.getestadocivil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocivil==null) {
						this.estadocivil = new EstadoCivil();
					}

					this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
				}

				if(this.estadocivil.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadocivil.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCivil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoCivilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoCivil(this.getestadocivil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocivil==null) {
						this.estadocivil = new EstadoCivil();
					}

					this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);
				}

				if(this.estadocivil.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadocivil.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoCivil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoCivil() {
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
			this.jInternalFrameDetalleFormEstadoCivil.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoCivil.dispose();
			this.jInternalFrameDetalleFormEstadoCivil=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
			this.jInternalFrameReporteDinamicoEstadoCivil.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoCivil.dispose();
			this.jInternalFrameReporteDinamicoEstadoCivil=null;
		}
		
		if(this.jInternalFrameImportacionEstadoCivil!=null) {
			this.jInternalFrameImportacionEstadoCivil.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoCivil.dispose();
			this.jInternalFrameImportacionEstadoCivil=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoCivil();
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoCivil")) {
				jButtonNuevoEstadoCivilActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoCivil")) {
				jButtonDuplicarEstadoCivilActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoCivil")) {
				jButtonCopiarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoCivil")) {
				jButtonVerFormEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoCivil")) {
				jButtonNuevoEstadoCivilActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoCivil")) {
				jButtonDuplicarEstadoCivilActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoCivil")) {
				jButtonNuevoEstadoCivilActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoCivil")) {
				jButtonDuplicarEstadoCivilActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoCivil")) {
				jButtonNuevoEstadoCivilActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoCivil")) {
				jButtonNuevoEstadoCivilActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoCivil")) {
				jButtonNuevoEstadoCivilActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoCivil")) {
				jButtonModificarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoCivil")) {
				jButtonModificarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoCivil")) {
				jButtonModificarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoCivil")) {
				jButtonActualizarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoCivil")) {
				jButtonActualizarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoCivil")) {
				jButtonActualizarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoCivil")) {
				jButtonEliminarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoCivil")) {
				jButtonEliminarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoCivil")) {
				jButtonEliminarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoCivil")) {
				jButtonCancelarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoCivil")) {
				jButtonCancelarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoCivil")) {
				jButtonCancelarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoCivil")) {
				jButtonCerrarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoCivil")) {
				jButtonCerrarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoCivil")) {
				jButtonCerrarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoCivil")) {
				jButtonMostrarOcultarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoCivil")) {
				jButtonCancelarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoCivil")) {
				jButtonGuardarCambiosEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoCivil")) {
				jButtonGuardarCambiosEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoCivil")) {
				jButtonCopiarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoCivil")) {
				jButtonVerFormEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoCivil")) {
				jButtonGuardarCambiosEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoCivil")) {
				jButtonCopiarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoCivil")) {
				jButtonVerFormEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoCivil")) {
				jButtonGuardarCambiosEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoCivil")) {
				jButtonGuardarCambiosEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoCivil")) {
				jButtonGuardarCambiosEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoCivil")) {
				jButtonRecargarInformacionEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoCivil")) {
				jButtonRecargarInformacionEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoCivil")) {
				jButtonRecargarInformacionEstadoCivilActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoCivil")) {
				jButtonAnterioresEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoCivil")) {
				jButtonAnterioresEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoCivil")) {
				jButtonAnterioresEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoCivil")) {
				jButtonSiguientesEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoCivil")) {
				jButtonSiguientesEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoCivil")) {
				jButtonSiguientesEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoCivil") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoCivil")) {
				jButtonAbrirOrderByEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoCivil") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoCivil")) {
				jButtonMostrarOcultarEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoCivil")) {
				jButtonNuevoGuardarCambiosEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoCivil")) {
				jButtonNuevoGuardarCambiosEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoCivil")) {
				jButtonNuevoGuardarCambiosEstadoCivilActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoCivil")) {
				jButtonCerrarReporteDinamicoEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoCivil")) {
				jButtonGenerarReporteDinamicoEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoCivil")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoCivil")) {
				jButtonCerrarImportacionEstadoCivilActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoCivil")) {
				
				jButtonGenerarImportacionEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoCivil")) {
				
				jButtonAbrirImportacionEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoCivil")) {
				jComboBoxTiposAccionesEstadoCivilActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoCivil")) {
				jComboBoxTiposRelacionesEstadoCivilActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoCivil")) {
				jComboBoxTiposAccionesEstadoCivilActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoCivil")) {
				
				jComboBoxTiposSeleccionarEstadoCivilActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoCivil")) {
				jTextFieldValorCampoGeneralEstadoCivilActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoCivil")) {
				jButtonAbrirOrderByEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoCivil")) {
				jButtonAbrirOrderByEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoCivil")) {
				jButtonCerrarOrderByEstadoCivilActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoCivilBusqueda")) {
				this.jButtonidEstadoCivilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoCivilBusqueda")) {
				this.jButtoncodigoEstadoCivilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoCivilBusqueda")) {
				this.jButtonnombreEstadoCivilBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoCivil();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCivilActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				


				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoCivil estadocivilLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadocivilLocal=this.estadocivil;
			} else {
				estadocivilLocal=this.estadocivilAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
							
				
				


				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCivilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
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
			
			


			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCivilActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
								
						
				


				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
								
				
				


				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCivilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCivilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCivilActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
							
				
				


				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCivilActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivilAnterior =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadocivilAnterior =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
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
			
			


			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCivilActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
								
				
				


				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCivilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCivilActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCivilActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoCivil")) {
					jCheckBoxSeleccionarTodosEstadoCivilItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoCivil")) {
					jCheckBoxSeleccionadosEstadoCivilItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoCivil")) {
					
				}
				
				


				
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
												
				
				


				
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCivilActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocivilAnterior =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadocivilAnterior =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCivilActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
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
			
			


			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoCivilActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocivil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocivil);
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
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
				
				


				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoCivil.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoCivil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoCivilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocivilAnterior =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoCivil")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoCivilListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoCivil.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadocivil =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadocivil =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadocivil);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoCivil")) {
				
				}
				
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoCivil")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoCivil.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoCivil")) {
			
			}
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoCivil();
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoCivil")) {
				jButtonNuevoEstadoCivilActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoCivil")) {
				jButtonDuplicarEstadoCivilActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoCivil")) {
				jButtonCopiarEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoCivil")) {
				jButtonVerFormEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoCivil")) {
				jButtonNuevoEstadoCivilActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoCivil")) {
				jButtonModificarEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoCivil")) {
				jButtonActualizarEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoCivil")) {
				jButtonEliminarEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoCivil")) {
				jButtonGuardarCambiosEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoCivil")) {
				jButtonCancelarEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoCivil")) {
				jButtonCerrarEstadoCivilActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoCivil")) {
				jButtonGuardarCambiosEstadoCivilActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoCivil")) {
				jButtonNuevoGuardarCambiosEstadoCivilActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoCivil")) {
				jButtonAbrirOrderByEstadoCivilActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoCivil")) {
				jButtonRecargarInformacionEstadoCivilActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoCivil")) {
				jButtonAnterioresEstadoCivilActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoCivil")) {
				jButtonSiguientesEstadoCivilActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoCivilBusqueda")) {
				this.jButtonidEstadoCivilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoCivilBusqueda")) {
				this.jButtoncodigoEstadoCivilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoCivilBusqueda")) {
				this.jButtonnombreEstadoCivilBusquedaActionPerformed(evt);
			}
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoCivil();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoCivil")) {
				closingInternalFrameEstadoCivil();
				
			} else if(sTipo.equals("jButtonCancelarEstadoCivil")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoCivil = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoCivilBeanSwingJInternalFrame jInternalFrameParent=(EstadoCivilBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoCivil.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoCivilActionPerformed(null);
			}
			
			EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocivil,new Object(),this.estadocivilParameterGeneral,this.estadocivilReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoCivil(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoCivil(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoCivil(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadocivil)) {
			if(!esControlTabla) {
				if(EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);			
				}
				
				if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoCivil(this.estadocivil,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadocivilReturnGeneral=estadocivilLogic.procesarEventosEstadoCivilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocivilLogic.getEstadoCivils(),this.estadocivil,this.estadocivilParameterGeneral,this.isEsNuevoEstadoCivil,classes);//this.estadocivilLogic.getEstadoCivil()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoCivil(this.estadocivilReturnGeneral,this.estadocivilBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoCivil(classes,this.estadocivilReturnGeneral,this.estadocivilBean,false);
					}
						
					if(this.estadocivilReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoCivil(this.estadocivilReturnGeneral.getEstadoCivil());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoCivil(this.estadocivilReturnGeneral.getEstadoCivil());	
					}
						
					if(this.estadocivilReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoCivil(this.estadocivilReturnGeneral.getEstadoCivil(),classes);//this.estadocivilBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoCivil(this.estadocivil,classes);//this.estadocivilBean);									
				}
			
				if(EstadoCivilJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoCivil(this.estadocivil,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoCivil(this.estadocivil);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadocivilAnterior!=null) {
						this.estadocivil=this.estadocivilAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadocivilReturnGeneral=estadocivilLogic.procesarEventosEstadoCivilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocivilLogic.getEstadoCivils(),this.estadocivil,this.estadocivilParameterGeneral,this.isEsNuevoEstadoCivil,classes);//this.estadocivilLogic.getEstadoCivil()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadocivilSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadocivilSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadocivilReturnGeneral.getEstadoCivil(),estadocivilLogic.getEstadoCivils());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadocivilReturnGeneral.getEstadoCivil(),this.estadocivils);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoCivil.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoCivil.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoCivil();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoCivil() throws Exception {
		
		EstadoCivilModel estadocivilModel=(EstadoCivilModel)this.jTableDatosEstadoCivil.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocivilModel.estadocivils=this.estadocivilLogic.getEstadoCivils();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadocivilModel.estadocivils=this.estadocivils;
		}
		
		
		((EstadoCivilModel) this.jTableDatosEstadoCivil.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoCivil() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadocivilAnterior(),this.estadocivilLogic.getEstadoCivils());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadocivilAnterior(),this.estadocivils);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoCivil();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoCivil(EstadoCivil estadocivil,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(estadocivil.getClientes());
					this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(estadocivil.getCargaFamiliar_NMs());
					this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(estadocivil.getSubClientes());
					this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(estadocivil.getEmpleados());
					this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(estadocivil.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(estadocivil.getCargaFamiliars());
					this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
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
										
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocivil,new Object(),generalEntityParameterGeneral,this.estadocivilReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadocivilSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoCivilConstantesFunciones.getClassesRelationshipsOfEstadoCivil(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoCivilConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoCivil(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoCivil(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoCivilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocivil,new Object(),generalEntityParameterGeneral,this.estadocivilReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoCivil(EstadoCivilBean estadocivilBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(estadocivil.getClientes());
					this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(estadocivil.getCargaFamiliar_NMs());
					this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(estadocivil.getSubClientes());
					this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(estadocivil.getEmpleados());
					this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(estadocivil.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(estadocivil.getCargaFamiliars());
					this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoCivil(ArrayList<Classe> classes,EstadoCivilReturnGeneral estadocivilReturnGeneral,EstadoCivilBean estadocivilBean,Boolean conDefault) throws Exception {
		
			this.estadocivilBean.setClientes(estadocivilReturnGeneral.getEstadoCivil().getClientes());
			this.estadocivilBean.setCargaFamiliar_NMs(estadocivilReturnGeneral.getEstadoCivil().getCargaFamiliar_NMs());
			this.estadocivilBean.setSubClientes(estadocivilReturnGeneral.getEstadoCivil().getSubClientes());
			this.estadocivilBean.setEmpleados(estadocivilReturnGeneral.getEstadoCivil().getEmpleados());
			this.estadocivilBean.setParametroCarteraDefectos(estadocivilReturnGeneral.getEstadoCivil().getParametroCarteraDefectos());
			this.estadocivilBean.setCargaFamiliars(estadocivilReturnGeneral.getEstadoCivil().getCargaFamiliars());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoCivil(EstadoCivil estadocivil,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					estadocivil.setClientes(this.jInternalFrameDetalleFormEstadoCivil.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					estadocivil.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					estadocivil.setSubClientes(this.jInternalFrameDetalleFormEstadoCivil.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					estadocivil.setEmpleados(this.jInternalFrameDetalleFormEstadoCivil.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					estadocivil.setParametroCarteraDefectos(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					estadocivil.setCargaFamiliars(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadocivil)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoCivil = new EstadoCivilDetalleFormJInternalFrame(jDesktopPane,this.estadocivilSessionBean.getConGuardarRelaciones(),this.estadocivilSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoCivil);
		this.jInternalFrameDetalleFormEstadoCivil.setVisible(false);
		this.jInternalFrameDetalleFormEstadoCivil.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoCivil.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoCivil.estadocivilLogic=this.estadocivilLogic;
		
		this.cargarCombosFrameForeignKeyEstadoCivil("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoCivil();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoCivil();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoCivil("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoCivil();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoCivil.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoCivil"));
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarEstadoCivil.addActionListener(new ButtonActionListener(this,"ModificarEstadoCivil"));

		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarToolBarEstadoCivil.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoCivil"));
					
		this.jInternalFrameDetalleFormEstadoCivil.jMenuItemModificarEstadoCivil.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoCivil"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarEstadoCivil.addActionListener (new ButtonActionListener(this,"ActualizarEstadoCivil"));
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarToolBarEstadoCivil.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoCivil"));
						
		this.jInternalFrameDetalleFormEstadoCivil.jMenuItemActualizarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoCivil"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarEstadoCivil.addActionListener (new ButtonActionListener(this,"EliminarEstadoCivil"));
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoCivil"));
								
		this.jInternalFrameDetalleFormEstadoCivil.jMenuItemEliminarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoCivil"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarEstadoCivil.addActionListener (new ButtonActionListener(this,"CancelarEstadoCivil"));
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoCivil"));
					
		this.jInternalFrameDetalleFormEstadoCivil.jMenuItemCancelarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoCivil"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jMenuItemDetalleCerrarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoCivil"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCivil"));
		
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCivil"));
		
		
		
		this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoCivil"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtonidEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCivilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtoncodigoEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCivilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtonnombreEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCivilBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoCivil"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoCivil"));
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoCivil"));
		}
		
		this.jTableDatosEstadoCivil.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoCivil"));
		
		this.jTableDatosEstadoCivil.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoCivil"));
		
		this.jButtonNuevoEstadoCivil.addActionListener(new ButtonActionListener(this,"NuevoEstadoCivil"));
		
		this.jButtonDuplicarEstadoCivil.addActionListener(new ButtonActionListener(this,"DuplicarEstadoCivil"));
		
		this.jButtonCopiarEstadoCivil.addActionListener(new ButtonActionListener(this,"CopiarEstadoCivil"));
		
		this.jButtonVerFormEstadoCivil.addActionListener(new ButtonActionListener(this,"VerFormEstadoCivil"));
		
		
		this.jButtonNuevoToolBarEstadoCivil.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoCivil"));
			
		this.jButtonDuplicarToolBarEstadoCivil.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoCivil"));
			
		this.jMenuItemNuevoEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoCivil"));
			
		this.jMenuItemDuplicarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoCivil"));		
		
		
		this.jButtonNuevoRelacionesEstadoCivil.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoCivil"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoCivil.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoCivil"));
			
		this.jMenuItemNuevoRelacionesEstadoCivil.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoCivil"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarEstadoCivil.addActionListener(new ButtonActionListener(this,"ModificarEstadoCivil"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonModificarToolBarEstadoCivil.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoCivil"));
			
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemModificarEstadoCivil.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoCivil"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarEstadoCivil.addActionListener (new ButtonActionListener(this,"ActualizarEstadoCivil"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonActualizarToolBarEstadoCivil.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoCivil"));
				
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemActualizarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoCivil"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarEstadoCivil.addActionListener (new ButtonActionListener(this,"EliminarEstadoCivil"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonEliminarToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoCivil"));
						
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemEliminarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoCivil"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarEstadoCivil.addActionListener (new ButtonActionListener(this,"CancelarEstadoCivil"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonCancelarToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoCivil"));
			
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemCancelarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoCivil"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoCivil"));		
		
		
		this.jButtonCerrarEstadoCivil.addActionListener (new ButtonActionListener(this,"CerrarEstadoCivil"));
		
		
		this.jButtonCerrarToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoCivil"));
			
		this.jMenuItemCerrarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoCivil"));
			
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jMenuItemDetalleCerrarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoCivil"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosEstadoCivil.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoCivil"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoCivil"));
		}
		
		this.jButtonCopiarToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoCivil"));
			
		this.jButtonVerFormToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoCivil"));
		
		this.jMenuItemGuardarCambiosEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoCivil"));
			
		this.jMenuItemCopiarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoCivil"));		
		
		this.jMenuItemVerFormEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoCivil"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoCivil.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoCivil"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoCivil"));
			
		this.jMenuItemGuardarCambiosTablaEstadoCivil.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoCivil"));		
		
		
		
		this.jButtonRecargarInformacionEstadoCivil.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoCivil"));
					
		this.jButtonRecargarInformacionToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoCivil"));
		
		this.jMenuItemRecargarInformacionEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoCivil"));		
		
		
		
		this.jButtonAnterioresEstadoCivil.addActionListener (new ButtonActionListener(this,"AnterioresEstadoCivil"));
		
		
		this.jButtonAnterioresToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoCivil"));
		
		this.jMenuItemAnterioresEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoCivil"));		
		
		
		this.jButtonSiguientesEstadoCivil.addActionListener (new ButtonActionListener(this,"SiguientesEstadoCivil"));
		
		
		this.jButtonSiguientesToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoCivil"));
			
		this.jMenuItemSiguientesEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoCivil"));
			
		this.jMenuItemAbrirOrderByEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoCivil"));
			
		this.jMenuItemMostrarOcultarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoCivil"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoCivil"));
			
		this.jMenuItemDetalleMostarOcultarEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoCivil"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoCivil.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoCivil"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoCivil"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoCivil.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoCivil"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoCivil.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoCivil"));

		this.jCheckBoxSeleccionadosEstadoCivil.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoCivil"));
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoCivil"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoCivil.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoCivil"));
			
		this.jComboBoxTiposAccionesEstadoCivil.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoCivil"));
					
		this.jComboBoxTiposSeleccionarEstadoCivil.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoCivil"));
			
		this.jTextFieldValorCampoGeneralEstadoCivil.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoCivil"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtonidEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCivilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtoncodigoEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCivilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtonnombreEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCivilBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoCivil!=null) {
				this.jInternalFrameReporteDinamicoEstadoCivil.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCivil"));
				this.jInternalFrameReporteDinamicoEstadoCivil.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCivil"));
				this.jInternalFrameReporteDinamicoEstadoCivil.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCivil"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoCivil.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoCivil"));				
			//this.jButtonGenerarReporteDinamicoEstadoCivil.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoCivil"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoCivil.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoCivil"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoCivil!=null) {
				this.jInternalFrameImportacionEstadoCivil.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoCivil"));
				this.jInternalFrameImportacionEstadoCivil.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoCivil"));
				this.jInternalFrameImportacionEstadoCivil.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoCivil"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoCivil.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoCivil"));
			
			this.jButtonAbrirOrderByToolBarEstadoCivil.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoCivil"));			
			
			if(this.jInternalFrameOrderByEstadoCivil!=null) {
				this.jInternalFrameOrderByEstadoCivil.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoCivil"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoCivil.jTabbedPaneRelacionesEstadoCivil.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoCivil"));
		
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
            		closingInternalFrameEstadoCivil();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoCivil.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoCivil = (JInternalFrameBase)event.getSource();
	            	
	            EstadoCivilBeanSwingJInternalFrame jInternalFrameParent=(EstadoCivilBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoCivil.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoCivilActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoCivil.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoCivilListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoCivil.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoCivil.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCivilActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCivilActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCivilActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoCivil";
		inputMap = this.jButtonNuevoEstadoCivil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoCivil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoCivilActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCivilActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCivilActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoCivilActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoCivil";
		inputMap = this.jButtonNuevoRelacionesEstadoCivil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoCivil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoCivilActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoCivil";
		inputMap = this.jButtonModificarEstadoCivil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoCivil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoCivilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoCivil";
		inputMap = this.jButtonActualizarEstadoCivil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoCivil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoCivilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoCivil";
		inputMap = this.jButtonEliminarEstadoCivil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoCivil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoCivilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoCivil";
		inputMap = this.jButtonCancelarEstadoCivil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoCivil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoCivilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoCivil";
		inputMap = this.jButtonCerrarEstadoCivil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoCivil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoCivilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoCivil";
		inputMap = this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosEstadoCivil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoCivil.jButtonGuardarCambiosEstadoCivil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoCivilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoCivil.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoCivilItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoCivil.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoCivilActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoCivil.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoCivilActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoCivil.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoCivilActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtonidEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoCivilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtoncodigoEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoCivilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoCivil.jButtonnombreEstadoCivilBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoCivilBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoCivil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoCivilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoCivilActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoCivil.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoCivil(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
					estadocivilAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCivil estadocivilAux:estadocivils) {
					estadocivilAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoCivilItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoCivil(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
						estadocivilAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCivil estadocivilAux:estadocivils) {
						estadocivilAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCivil estadocivilAux:estadocivils) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoCivil(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoCivil.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoCivil.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoCivil,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoCivilItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoCivil(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoCivil.getSelectedRows();
			
			EstadoCivil estadocivilLocal=new EstadoCivil();
			
			//this.seleccionarTodosEstadoCivil(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocivilLocal =(EstadoCivil) this.estadocivilLogic.getEstadoCivils().toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadocivilLocal =(EstadoCivil) this.estadocivils.toArray()[this.jTableDatosEstadoCivil.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadocivilLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
						estadocivilAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoCivil estadocivilAux:estadocivils) {
						estadocivilAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoCivil(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoCivil.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoCivil.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoCivil,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoCivilItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoCivilParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoCivilActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoCivil(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoCivil.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoCivil estadocivilAux:this.estadocivilLogic.getEstadoCivils()) {
				
						if(sTipoSeleccionar.equals(EstadoCivilConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadocivilAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoCivilConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadocivilAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCivil estadocivilAux:estadocivils) {
					
						if(sTipoSeleccionar.equals(EstadoCivilConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadocivilAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoCivilConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadocivilAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoCivil(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoCivilActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoCivil(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoCivil=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoCivil.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoCivil) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoCivil(conSplash);
				
					this.generarReporteEstadoCivilsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoCivilsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoCivilsSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoCivilsSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoCivil();
				
				this.exportarEstadoCivilsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoCivils();
				//this.importarEstadoCivils();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoCivil();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoCivilsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Civil", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoCivil();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoCivil)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoCivil(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoCivilBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoCivil) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoCivil(conSplash);
					
						//this.actualizarParametrosGeneralEstadoCivil();
						
						this.generarReporteProcesoAccionEstadoCivilsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoCivilBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado CivilES SELECCIONADOS?", "MANTENIMIENTO DE Estado Civil", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoCivil();
				
						this.actualizarParametrosGeneralEstadoCivil();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadocivilReturnGeneral=estadocivilLogic.procesarAccionEstadoCivilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadocivilLogic.getEstadoCivils(),this.estadocivilParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoCivilReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoCivil();
					
					EstadoCivilBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoCivilReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoCivil.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoCivil.jComboBoxTiposAccionesFormularioEstadoCivil.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoCivil(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoCivilActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoCivil();
			
			if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		
			EstadoCivil estadocivil=new EstadoCivil();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoCivil(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoCivil.getSelectedItem();
			
			
			
			
			estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadocivilsSeleccionados.size()==1) {
				for(EstadoCivil estadocivilAux:estadocivilsSeleccionados) {
					estadocivil=estadocivilAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,estadocivil);
				}
				else if(this.sTipoRelacion.equals("Carga Familiar_ N M")) {
					jButtonCargaFamiliar_NMActionPerformed(null,rowIndex,true,false,estadocivil);
				}
				else if(this.sTipoRelacion.equals("Sub Cliente")) {
					jButtonSubClienteActionPerformed(null,rowIndex,true,false,estadocivil);
				}
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,estadocivil);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,estadocivil);
				}
				else if(this.sTipoRelacion.equals("Carga Familiar")) {
					jButtonCargaFamiliarActionPerformed(null,rowIndex,true,false,estadocivil);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoCivil();
			
      		//this.finishProcessEstadoCivil(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoCivilReturnGeneral() throws Exception {
		if(this.estadocivilReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadocivilReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadocivilReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadocivilReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadocivilReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadocivilReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoCivil(false);
		}
		
		if(this.estadocivilReturnGeneral.getConRetornoLista() || this.estadocivilReturnGeneral.getConRetornoObjeto()) {
			if(this.estadocivilReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadocivilLogic.setEstadoCivils(this.estadocivilReturnGeneral.getEstadoCivils());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadocivilReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadocivilLogic.setEstadoCivil(this.estadocivilReturnGeneral.getEstadoCivil());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoCivil(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoCivil() throws Exception {
		
		
	}
	
	public ArrayList<EstadoCivil> getEstadoCivilsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoCivil) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoCivil estadocivilAux:estadocivilLogic.getEstadoCivils()) {
					if(estadocivilAux.getIsSelected()) {
						estadocivilsSeleccionados.add(estadocivilAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoCivil estadocivilAux:this.estadocivils) {
					if(estadocivilAux.getIsSelected()) {
						estadocivilsSeleccionados.add(estadocivilAux);				
					}
				}
			}
			
			if(estadocivilsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadocivilsSeleccionados.addAll(this.estadocivilLogic.getEstadoCivils());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadocivilsSeleccionados.addAll(this.estadocivils);				
					}
				}
			}
		} else {
			estadocivilsSeleccionados.add(this.estadocivil);
		}
		
		return estadocivilsSeleccionados;
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
	
	public void generarReporteEstadoCivilsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoCivilsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoCivilsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoCivilsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoCivilsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoCivilsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Civil",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoCivilsSeleccionados() throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoCivils("Todos",estadocivilsSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoCivilsSeleccionados() throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoCivils("Todos",estadocivilsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoCivilsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoCivils("Todos",estadocivilsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoCivilsSeleccionados() throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoCivil();
		
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoCivil();
		
		
		//this.generarReporteEstadoCivils("Todos",estadocivilsSeleccionados ,estadocivilImplementable,estadocivilImplementableHome);
	}
	
	public void mostrarImportacionEstadoCivils() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoCivil();
		
		this.abrirFrameImportacionEstadoCivil();		
		
			
		//this.generarReporteEstadoCivils("Todos",estadocivilsSeleccionados ,estadocivilImplementable,estadocivilImplementableHome);
	}
	
	public void importarEstadoCivils() throws Exception {		
	
	}
	
	public void exportarEstadoCivilsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoCivilsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoCivilsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoCivilsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Civil",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoCivilsSeleccionados() throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocivil."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoCivil(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoCivil estadocivilAux:estadocivilsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoCivil(estadocivilAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadocivilAux.setsDetalleGeneralEntityReporte(estadocivilAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoCivil(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoCivilConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCivilConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCivilConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoCivilConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoCivil(EstadoCivil estadocivil,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadocivil.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocivil.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocivil.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocivil.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoCivilsSeleccionados() throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocivil.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoCivils");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoCivil(row);				
				iRow++;
			}				
			
			for(EstadoCivil estadocivilAux:estadocivilsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoCivil(estadocivilAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoCivilsSeleccionados() throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();		
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocivil.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadocivils");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadocivil");
			//elementRoot.appendChild(element);
		
			for(EstadoCivil estadocivilAux:estadocivilsSeleccionados) {
				element = document.createElement("estadocivil");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoCivil(estadocivilAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Civil",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoCivil(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCivilConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCivilConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCivilConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoCivilConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoCivil(EstadoCivil estadocivil,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadocivil.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocivil.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocivil.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoCivil(EstadoCivil estadocivil,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoCivilConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadocivil.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoCivilConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadocivil.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoCivilConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadocivil.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoCivilConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadocivil.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoCivilsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoCivil> estadocivilsSeleccionados=new ArrayList<EstadoCivil>();
		
		estadocivilsSeleccionados=this.getEstadoCivilsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoCivil(estadocivilsSeleccionados);
		
		this.generarReporteEstadoCivils("Todos",estadocivilsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoCivil(ArrayList<EstadoCivil> estadocivilsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoCivil estadocivilAux:estadocivilsSeleccionados) {
				estadocivilAux.setsDetalleGeneralEntityReporte(estadocivilAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoCivilConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadocivilAux.setsDescripcionGeneralEntityReporte1(estadocivilAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoCivilConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadocivilAux.setsDescripcionGeneralEntityReporte1(estadocivilAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoCivilConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoCivil(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoCivil=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoCivil=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoCivil=false;
			this.isVisibilidadCeldaActualizarEstadoCivil=false;
			this.isVisibilidadCeldaEliminarEstadoCivil=false;
			this.isVisibilidadCeldaCancelarEstadoCivil=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCivil=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoCivil=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=false;
			this.isVisibilidadCeldaModificarEstadoCivil=false;
			this.isVisibilidadCeldaActualizarEstadoCivil=true;
			this.isVisibilidadCeldaEliminarEstadoCivil=false;
			this.isVisibilidadCeldaCancelarEstadoCivil=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCivil=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoCivil=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=false;
			this.isVisibilidadCeldaModificarEstadoCivil=false;
			this.isVisibilidadCeldaActualizarEstadoCivil=true;
			this.isVisibilidadCeldaEliminarEstadoCivil=true;
			this.isVisibilidadCeldaCancelarEstadoCivil=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCivil=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoCivil=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=false;
			this.isVisibilidadCeldaModificarEstadoCivil=false;
			this.isVisibilidadCeldaActualizarEstadoCivil=true;
			this.isVisibilidadCeldaEliminarEstadoCivil=false;
			this.isVisibilidadCeldaCancelarEstadoCivil=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoCivil=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=true;
			this.isVisibilidadCeldaModificarEstadoCivil=false;
			this.isVisibilidadCeldaActualizarEstadoCivil=false;
			this.isVisibilidadCeldaEliminarEstadoCivil=false;
			this.isVisibilidadCeldaCancelarEstadoCivil=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCivil=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoCivil=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=false;
			this.isVisibilidadCeldaActualizarEstadoCivil=false;
			this.isVisibilidadCeldaEliminarEstadoCivil=false;
			this.isVisibilidadCeldaCancelarEstadoCivil=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoCivil=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=false;
			this.isVisibilidadCeldaModificarEstadoCivil=true;
			this.isVisibilidadCeldaActualizarEstadoCivil=false;
			this.isVisibilidadCeldaEliminarEstadoCivil=false;
			this.isVisibilidadCeldaCancelarEstadoCivil=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoCivil=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoCivilJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoCivil=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=true;
		} else {
			this.actualizarEstadoPanelsEstadoCivil(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoCivil=false;
			//this.isVisibilidadCeldaVerFormEstadoCivil=false;
			this.isVisibilidadCeldaDuplicarEstadoCivil=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadocivilSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoCivil=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoCivil=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadocivilSessionBean.getEsGuardarRelacionado()) {
			if(!estadocivilSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;												
			}
			
			this.jButtonCerrarEstadoCivil.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoCivil=false;
		}
		
		if(!this.permiteMantenimiento(this.estadocivil)) {
			this.isVisibilidadCeldaActualizarEstadoCivil=false;
			this.isVisibilidadCeldaEliminarEstadoCivil=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoCivil() {
		this.isVisibilidadCeldaNuevoEstadoCivil=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoCivil=false;
	}
	
	public void actualizarEstadoPanelsEstadoCivil(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoCivil!=null) {
				this.jScrollPanelDatosEdicionEstadoCivil.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCivil!=null) {
				this.jScrollPanelDatosEstadoCivil.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCivil!=null) {
				this.jPanelPaginacionEstadoCivil.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCivil!=null) {
				this.jPanelParametrosReportesEstadoCivil.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoCivil!=null) {
				this.jScrollPanelDatosEdicionEstadoCivil.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoCivil!=null) {
				this.jScrollPanelDatosEstadoCivil.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCivil!=null) {
				this.jPanelPaginacionEstadoCivil.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCivil!=null) {
				this.jPanelParametrosReportesEstadoCivil.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoCivil!=null) {
				this.jScrollPanelDatosEdicionEstadoCivil.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoCivil!=null) {
				this.jScrollPanelDatosEstadoCivil.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCivil!=null) {
				this.jPanelPaginacionEstadoCivil.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCivil!=null) {
				this.jPanelParametrosReportesEstadoCivil.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoCivil!=null) {
				this.jScrollPanelDatosEdicionEstadoCivil.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCivil!=null) {
				this.jScrollPanelDatosEstadoCivil.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoCivil!=null) {
				this.jPanelPaginacionEstadoCivil.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoCivil!=null) {
				this.jPanelParametrosReportesEstadoCivil.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoCivil!=null) {
				this.jScrollPanelDatosEdicionEstadoCivil.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoCivil!=null) {
				this.jScrollPanelDatosEstadoCivil.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCivil!=null) {
				this.jPanelPaginacionEstadoCivil.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCivil!=null) {
				this.jPanelParametrosReportesEstadoCivil.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoCivil!=null) {
				this.jScrollPanelDatosEdicionEstadoCivil.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoCivil!=null) {
				this.jScrollPanelDatosEstadoCivil.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCivil!=null) {
				this.jPanelPaginacionEstadoCivil.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCivil!=null) {
				this.jPanelParametrosReportesEstadoCivil.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoCivil!=null) {
				this.jScrollPanelDatosEdicionEstadoCivil.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoCivil!=null) {
				this.jScrollPanelDatosEstadoCivil.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoCivil!=null) {
				this.jPanelPaginacionEstadoCivil.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoCivil!=null) {
				this.jPanelParametrosReportesEstadoCivil.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadocivilSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoCivilParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.estadocivilSessionBean==null) {
				this.estadocivilSessionBean=new EstadoCivilSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean.setsPathNavegacionActual(estadocivilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(EstadoCivilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
			this.jInternalFrameDetalleFormEstadoCivil.clienteSessionBean.setlidEstadoCivilActual(this.idEstadoCivilActual);

			estadocivilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCivil(true);
			estadocivilSessionBean.setlIdEstadoCivilActualForeignKey(this.idEstadoCivilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoCivilParaCargaFamiliar_NMes() throws Exception {
		Boolean isPaginaPopupCargaFamiliar_NM=false;

		try {

			if(this.estadocivilSessionBean==null) {
				this.estadocivilSessionBean=new EstadoCivilSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean.setsPathNavegacionActual(estadocivilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargaFamiliar_NM=this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM(true);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM(EstadoCivilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliar_nmSessionBean.setlidEstadoCivilActual(this.idEstadoCivilActual);

			estadocivilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCivil(true);
			estadocivilSessionBean.setlIdEstadoCivilActualForeignKey(this.idEstadoCivilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoCivilParaSubClientes() throws Exception {
		Boolean isPaginaPopupSubCliente=false;

		try {

			if(this.estadocivilSessionBean==null) {
				this.estadocivilSessionBean=new EstadoCivilSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean=new SubClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean.setsPathNavegacionActual(estadocivilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubCliente=this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubCliente(true);
			this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente(EstadoCivilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
			this.jInternalFrameDetalleFormEstadoCivil.subclienteSessionBean.setlidEstadoCivilActual(this.idEstadoCivilActual);

			estadocivilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCivil(true);
			estadocivilSessionBean.setlIdEstadoCivilActualForeignKey(this.idEstadoCivilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoCivilParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.estadocivilSessionBean==null) {
				this.estadocivilSessionBean=new EstadoCivilSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean.setsPathNavegacionActual(estadocivilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EstadoCivilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
			this.jInternalFrameDetalleFormEstadoCivil.empleadoSessionBean.setlidEstadoCivilActual(this.idEstadoCivilActual);

			estadocivilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCivil(true);
			estadocivilSessionBean.setlIdEstadoCivilActualForeignKey(this.idEstadoCivilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoCivilParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.estadocivilSessionBean==null) {
				this.estadocivilSessionBean=new EstadoCivilSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean.setsPathNavegacionActual(estadocivilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(EstadoCivilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
			this.jInternalFrameDetalleFormEstadoCivil.parametrocarteradefectoSessionBean.setlidEstadoCivilActual(this.idEstadoCivilActual);

			estadocivilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCivil(true);
			estadocivilSessionBean.setlIdEstadoCivilActualForeignKey(this.idEstadoCivilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoCivilParaCargaFamiliares() throws Exception {
		Boolean isPaginaPopupCargaFamiliar=false;

		try {

			if(this.estadocivilSessionBean==null) {
				this.estadocivilSessionBean=new EstadoCivilSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean.setsPathNavegacionActual(estadocivilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargaFamiliar=this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar(true);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar(EstadoCivilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCivil(true);
			this.jInternalFrameDetalleFormEstadoCivil.cargafamiliarSessionBean.setlidEstadoCivilActual(this.idEstadoCivilActual);

			estadocivilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoCivil(true);
			estadocivilSessionBean.setlIdEstadoCivilActualForeignKey(this.idEstadoCivilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoCivilSessionBean estadocivilSessionBean=new EstadoCivilSessionBean();
		
		if(this.estadocivilSessionBean==null) {
			this.estadocivilSessionBean=new EstadoCivilSessionBean();
		}
		
		this.estadocivilSessionBean.setsUltimaBusquedaEstadoCivil(this.getsAccionBusqueda());
		this.estadocivilSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadocivilSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoCivilSessionBean estadocivilSessionBean=new EstadoCivilSessionBean();
		
		if(this.estadocivilSessionBean==null) {
			this.estadocivilSessionBean=new EstadoCivilSessionBean();
		}
		
		if(this.estadocivilSessionBean.getsUltimaBusquedaEstadoCivil()!=null&&!this.estadocivilSessionBean.getsUltimaBusquedaEstadoCivil().equals("")) {
			this.setsAccionBusqueda(estadocivilSessionBean.getsUltimaBusquedaEstadoCivil());
			this.setiNumeroPaginacion(estadocivilSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadocivilSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadocivilSessionBean.setsUltimaBusquedaEstadoCivil("");
		this.estadocivilSessionBean.setiNumeroPaginacion(EstadoCivilConstantesFunciones.INUMEROPAGINACION);
		this.estadocivilSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoCivil(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoCivil() {
		this.updateBorderResaltarBusquedasFormularioEstadoCivil();
		this.updateVisibilidadBusquedasFormularioEstadoCivil();
		this.updateHabilitarBusquedasFormularioEstadoCivil();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoCivil() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoCivil() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoCivil() {
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
	
	public void updateControlesFormularioEstadoCivil() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoCivil();
		this.updateVisibilidadResaltarControlesFormularioEstadoCivil();
		this.updateHabilitarResaltarControlesFormularioEstadoCivil();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoCivil() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadocivilConstantesFunciones.resaltaridEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil!=null) {this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.setBorder(this.estadocivilConstantesFunciones.resaltaridEstadoCivil);}
		if(this.estadocivilConstantesFunciones.resaltarcodigoEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil!=null) {this.jInternalFrameDetalleFormEstadoCivil.jTextFieldcodigoEstadoCivil.setBorder(this.estadocivilConstantesFunciones.resaltarcodigoEstadoCivil);}
		if(this.estadocivilConstantesFunciones.resaltarnombreEstadoCivil!=null && this.jInternalFrameDetalleFormEstadoCivil!=null) {this.jInternalFrameDetalleFormEstadoCivil.jTextAreanombreEstadoCivil.setBorder(this.estadocivilConstantesFunciones.resaltarnombreEstadoCivil);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoCivil() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
	
		//this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.setVisible(this.estadocivilConstantesFunciones.mostraridEstadoCivil);
		this.jInternalFrameDetalleFormEstadoCivil.jPanelidEstadoCivil.setVisible(this.estadocivilConstantesFunciones.mostraridEstadoCivil);
		//this.jInternalFrameDetalleFormEstadoCivil.jTextFieldcodigoEstadoCivil.setVisible(this.estadocivilConstantesFunciones.mostrarcodigoEstadoCivil);
		this.jInternalFrameDetalleFormEstadoCivil.jPanelcodigoEstadoCivil.setVisible(this.estadocivilConstantesFunciones.mostrarcodigoEstadoCivil);
		//this.jInternalFrameDetalleFormEstadoCivil.jTextAreanombreEstadoCivil.setVisible(this.estadocivilConstantesFunciones.mostrarnombreEstadoCivil);
		this.jInternalFrameDetalleFormEstadoCivil.jPanelnombreEstadoCivil.setVisible(this.estadocivilConstantesFunciones.mostrarnombreEstadoCivil);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoCivil() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoCivil==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoCivil!=null) {
	
		this.jInternalFrameDetalleFormEstadoCivil.jTextFieldidEstadoCivil.setEnabled(this.estadocivilConstantesFunciones.activaridEstadoCivil);
		this.jInternalFrameDetalleFormEstadoCivil.jTextFieldcodigoEstadoCivil.setEnabled(this.estadocivilConstantesFunciones.activarcodigoEstadoCivil);
		this.jInternalFrameDetalleFormEstadoCivil.jTextAreanombreEstadoCivil.setEnabled(this.estadocivilConstantesFunciones.activarnombreEstadoCivil);
		}
	}
	
		
}