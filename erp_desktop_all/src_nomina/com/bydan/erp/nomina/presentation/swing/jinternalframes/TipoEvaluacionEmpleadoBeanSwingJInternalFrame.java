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

import com.bydan.erp.nomina.util.TipoEvaluacionEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoEvaluacionEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoEvaluacionEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoEvaluacionEmpleadoBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoEvaluacionEmpleadoBeanSwingJInternalFrame extends TipoEvaluacionEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoEvaluacionEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoEvaluacionEmpleado> tipoevaluacionempleadoValidator = new ClassValidator<TipoEvaluacionEmpleado>(TipoEvaluacionEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoEvaluacionEmpleado tipoevaluacionempleado;	
	public TipoEvaluacionEmpleado tipoevaluacionempleadoAux;
	public TipoEvaluacionEmpleado tipoevaluacionempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoEvaluacionEmpleado tipoevaluacionempleadoTotales;
	public Long idTipoEvaluacionEmpleadoActual;
	public Long iIdNuevoTipoEvaluacionEmpleado=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosEvaluacionEmpleado=false;

	public Boolean getIsTienePermisosEvaluacionEmpleado() {
		return isTienePermisosEvaluacionEmpleado;
	}

	public void setIsTienePermisosEvaluacionEmpleado(Boolean isTienePermisosEvaluacionEmpleado) {
		this.isTienePermisosEvaluacionEmpleado= isTienePermisosEvaluacionEmpleado;
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
	
	public Boolean isPermisoTodoTipoEvaluacionEmpleado;
	public Boolean isPermisoNuevoTipoEvaluacionEmpleado;
	public Boolean isPermisoActualizarTipoEvaluacionEmpleado;
	public Boolean isPermisoActualizarOriginalTipoEvaluacionEmpleado;
	public Boolean isPermisoEliminarTipoEvaluacionEmpleado;
	public Boolean isPermisoGuardarCambiosTipoEvaluacionEmpleado;
	public Boolean isPermisoConsultaTipoEvaluacionEmpleado;
	public Boolean isPermisoBusquedaTipoEvaluacionEmpleado;
	public Boolean isPermisoReporteTipoEvaluacionEmpleado;
	public Boolean isPermisoPaginacionMedioTipoEvaluacionEmpleado;
	public Boolean isPermisoPaginacionAltoTipoEvaluacionEmpleado;
	public Boolean isPermisoPaginacionTodoTipoEvaluacionEmpleado;
	public Boolean isPermisoCopiarTipoEvaluacionEmpleado;
	public Boolean isPermisoVerFormTipoEvaluacionEmpleado;
	public Boolean isPermisoDuplicarTipoEvaluacionEmpleado;
	public Boolean isPermisoOrdenTipoEvaluacionEmpleado;
	
	
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
	
	public TipoEvaluacionEmpleadoParameterReturnGeneral tipoevaluacionempleadoReturnGeneral;
	public TipoEvaluacionEmpleadoParameterReturnGeneral tipoevaluacionempleadoParameterGeneral;
	
	

	public EvaluacionEmpleadoLogic evaluacionempleadoLogic=null;

	public EvaluacionEmpleadoLogic getEvaluacionEmpleadoLogic() {
		return evaluacionempleadoLogic;
	}

	public void setEvaluacionEmpleadoLogic(EvaluacionEmpleadoLogic evaluacionempleadoLogic) {
		this.evaluacionempleadoLogic = evaluacionempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoEvaluacionEmpleado=false;
	public Boolean esParaAccionDesdeFormularioTipoEvaluacionEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoEvaluacionEmpleadoSessionBeanAdditional tipoevaluacionempleadoSessionBeanAdditional=null;
	
	public TipoEvaluacionEmpleadoSessionBeanAdditional getTipoEvaluacionEmpleadoSessionBeanAdditional() {
		return this.tipoevaluacionempleadoSessionBeanAdditional;
	}
	
	public void setTipoEvaluacionEmpleadoSessionBeanAdditional(TipoEvaluacionEmpleadoSessionBeanAdditional tipoevaluacionempleadoSessionBeanAdditional) {
		try {
			this.tipoevaluacionempleadoSessionBeanAdditional=tipoevaluacionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional tipoevaluacionempleadoBeanSwingJInternalFrameAdditional=null;
	//public class TipoEvaluacionEmpleadoBeanSwingJInternalFrame
	
	public TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional getTipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.tipoevaluacionempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional(TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional tipoevaluacionempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoevaluacionempleadoBeanSwingJInternalFrameAdditional=tipoevaluacionempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoEvaluacionEmpleadoLogic tipoevaluacionempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoEvaluacionEmpleado tipoevaluacionempleadoBean;
	public TipoEvaluacionEmpleadoConstantesFunciones tipoevaluacionempleadoConstantesFunciones;
	//public TipoEvaluacionEmpleadoParameterReturnGeneral tipoevaluacionempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoEvaluacionEmpleado> tipoevaluacionempleados;	
	//public List<TipoEvaluacionEmpleado> tipoevaluacionempleadosEliminados;
	//public List<TipoEvaluacionEmpleado> tipoevaluacionempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarTipoEvaluacionEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormTipoEvaluacionEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenTipoEvaluacionEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
	public Boolean isVisibilidadCeldaModificarTipoEvaluacionEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoEvaluacionEmpleado() {
		return this.iIdNuevoTipoEvaluacionEmpleado;
	}

	public void setiIdNuevoTipoEvaluacionEmpleado(Long iIdNuevoTipoEvaluacionEmpleado) {
		this.iIdNuevoTipoEvaluacionEmpleado = iIdNuevoTipoEvaluacionEmpleado;
	}
	
	public Long getidTipoEvaluacionEmpleadoActual() {
		return this.idTipoEvaluacionEmpleadoActual;
	}

	public void setidTipoEvaluacionEmpleadoActual(Long idTipoEvaluacionEmpleadoActual) {
		this.idTipoEvaluacionEmpleadoActual = idTipoEvaluacionEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoEvaluacionEmpleado gettipoevaluacionempleado() {
		return this.tipoevaluacionempleado;
	}

	public void settipoevaluacionempleado(TipoEvaluacionEmpleado tipoevaluacionempleado) {
		this.tipoevaluacionempleado = tipoevaluacionempleado;
	}
	
	public TipoEvaluacionEmpleado gettipoevaluacionempleadoAux() {
		return this.tipoevaluacionempleadoAux;
	}

	public void settipoevaluacionempleadoAux(TipoEvaluacionEmpleado tipoevaluacionempleadoAux) {
		this.tipoevaluacionempleadoAux = tipoevaluacionempleadoAux;
	}				
	
	public TipoEvaluacionEmpleado gettipoevaluacionempleadoAnterior() {
		return this.tipoevaluacionempleadoAnterior;
	}

	public void settipoevaluacionempleadoAnterior(TipoEvaluacionEmpleado tipoevaluacionempleadoAnterior) {
		this.tipoevaluacionempleadoAnterior = tipoevaluacionempleadoAnterior;
	}	
	
	public TipoEvaluacionEmpleado gettipoevaluacionempleadoTotales() {
		return this.tipoevaluacionempleadoTotales;
	}

	public void settipoevaluacionempleadoTotales(TipoEvaluacionEmpleado tipoevaluacionempleadoTotales) {
		this.tipoevaluacionempleadoTotales = tipoevaluacionempleadoTotales;
	}	
	
	public TipoEvaluacionEmpleado gettipoevaluacionempleadoBean() {
		return this.tipoevaluacionempleadoBean;
	}

	public void settipoevaluacionempleadoBean(TipoEvaluacionEmpleado tipoevaluacionempleadoBean) {
		this.tipoevaluacionempleadoBean = tipoevaluacionempleadoBean;
	}	
	
	public TipoEvaluacionEmpleadoParameterReturnGeneral gettipoevaluacionempleadoReturnGeneral() {
		return this.tipoevaluacionempleadoReturnGeneral;
	}

	public void settipoevaluacionempleadoReturnGeneral(TipoEvaluacionEmpleadoParameterReturnGeneral tipoevaluacionempleadoReturnGeneral) {
		this.tipoevaluacionempleadoReturnGeneral = tipoevaluacionempleadoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoEvaluacionEmpleadoLogic getTipoEvaluacionEmpleadoLogic()	{		
		return tipoevaluacionempleadoLogic;
	}

	public void setTipoEvaluacionEmpleadoLogic(TipoEvaluacionEmpleadoLogic tipoevaluacionempleadoLogic) {
		this.tipoevaluacionempleadoLogic = tipoevaluacionempleadoLogic;
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
	
	public Boolean getIsEsNuevoTipoEvaluacionEmpleado() {
		return isEsNuevoTipoEvaluacionEmpleado;
	}

	public void setIsEsNuevoTipoEvaluacionEmpleado(Boolean isEsNuevoTipoEvaluacionEmpleado) {
		this.isEsNuevoTipoEvaluacionEmpleado = isEsNuevoTipoEvaluacionEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoEvaluacionEmpleado() {
		return esParaAccionDesdeFormularioTipoEvaluacionEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioTipoEvaluacionEmpleado(Boolean esParaAccionDesdeFormularioTipoEvaluacionEmpleado) {
		this.esParaAccionDesdeFormularioTipoEvaluacionEmpleado = esParaAccionDesdeFormularioTipoEvaluacionEmpleado;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.tipoevaluacionempleadoSessionBean==null) {
				this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
			}

			if(!this.tipoevaluacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(tipoevaluacionempleadoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.tipoevaluacionempleado!=null) {
						this.tipoevaluacionempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
						this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoEvaluacionEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoEvaluacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaTipoEvaluacionEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoEvaluacionEmpleadoGenerico!=null && jComboBoxid_empresaTipoEvaluacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoEvaluacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoEvaluacionEmpleado tipoevaluacionempleado,JComboBox jComboBoxid_empresaTipoEvaluacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoEvaluacionEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoEvaluacionEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoevaluacionempleado.setid_empresa(empresaAux.getId());
				tipoevaluacionempleado.setempresa_descripcion(TipoEvaluacionEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoevaluacionempleado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { 
					}

					if(!TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoEvaluacionEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoEvaluacionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesTipoEvaluacionEmpleado(this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoEvaluacionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesTipoEvaluacionEmpleado(this.tipoevaluacionempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoevaluacionempleadoLogic.setTipoEvaluacionEmpleados(this.tipoevaluacionempleados);
			tipoevaluacionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoEvaluacionEmpleadoParameterReturnGeneral getTipoEvaluacionEmpleadoParameterGeneral() {
		return this.tipoevaluacionempleadoParameterGeneral;
	}
	
	public void setTipoEvaluacionEmpleadoParameterGeneral(TipoEvaluacionEmpleadoParameterReturnGeneral tipoevaluacionempleadoParameterGeneral) {
		this.tipoevaluacionempleadoParameterGeneral = tipoevaluacionempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoEvaluacionEmpleado() {
		return isPermisoTodoTipoEvaluacionEmpleado;
	}

	public void setIsPermisoTodoTipoEvaluacionEmpleado(Boolean isPermisoTodoTipoEvaluacionEmpleado) {
		this.isPermisoTodoTipoEvaluacionEmpleado = isPermisoTodoTipoEvaluacionEmpleado;
	}

	public Boolean getIsPermisoNuevoTipoEvaluacionEmpleado() {
		return isPermisoNuevoTipoEvaluacionEmpleado;
	}

	public void setIsPermisoNuevoTipoEvaluacionEmpleado(Boolean isPermisoNuevoTipoEvaluacionEmpleado) {
		this.isPermisoNuevoTipoEvaluacionEmpleado = isPermisoNuevoTipoEvaluacionEmpleado;
	}

	public Boolean getIsPermisoActualizarTipoEvaluacionEmpleado() {
		return isPermisoActualizarTipoEvaluacionEmpleado;
	}

	public void setIsPermisoActualizarTipoEvaluacionEmpleado(Boolean isPermisoActualizarTipoEvaluacionEmpleado) {
		this.isPermisoActualizarTipoEvaluacionEmpleado = isPermisoActualizarTipoEvaluacionEmpleado;
	}

	public Boolean getIsPermisoEliminarTipoEvaluacionEmpleado() {
		return isPermisoEliminarTipoEvaluacionEmpleado;
	}

	public void setIsPermisoEliminarTipoEvaluacionEmpleado(Boolean isPermisoEliminarTipoEvaluacionEmpleado) {
		this.isPermisoEliminarTipoEvaluacionEmpleado = isPermisoEliminarTipoEvaluacionEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosTipoEvaluacionEmpleado() {
		return isPermisoGuardarCambiosTipoEvaluacionEmpleado;
	}

	public void setIsPermisoGuardarCambiosTipoEvaluacionEmpleado(Boolean isPermisoGuardarCambiosTipoEvaluacionEmpleado) {
		this.isPermisoGuardarCambiosTipoEvaluacionEmpleado = isPermisoGuardarCambiosTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsPermisoConsultaTipoEvaluacionEmpleado() {
		return isPermisoConsultaTipoEvaluacionEmpleado;
	}

	public void setIsPermisoConsultaTipoEvaluacionEmpleado(Boolean isPermisoConsultaTipoEvaluacionEmpleado) {
		this.isPermisoConsultaTipoEvaluacionEmpleado = isPermisoConsultaTipoEvaluacionEmpleado;
	}

	public Boolean getIsPermisoBusquedaTipoEvaluacionEmpleado() {
		return isPermisoBusquedaTipoEvaluacionEmpleado;
	}

	public void setIsPermisoBusquedaTipoEvaluacionEmpleado(Boolean isPermisoBusquedaTipoEvaluacionEmpleado) {
		this.isPermisoBusquedaTipoEvaluacionEmpleado = isPermisoBusquedaTipoEvaluacionEmpleado;
	}

	public Boolean getIsPermisoReporteTipoEvaluacionEmpleado() {
		return isPermisoReporteTipoEvaluacionEmpleado;
	}

	public void setIsPermisoReporteTipoEvaluacionEmpleado(Boolean isPermisoReporteTipoEvaluacionEmpleado) {
		this.isPermisoReporteTipoEvaluacionEmpleado = isPermisoReporteTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoEvaluacionEmpleado() {
		return isPermisoPaginacionMedioTipoEvaluacionEmpleado;
	}

	public void setIsPermisoPaginacionMedioTipoEvaluacionEmpleado(Boolean isPermisoPaginacionMedioTipoEvaluacionEmpleado) {
		this.isPermisoPaginacionMedioTipoEvaluacionEmpleado = isPermisoPaginacionMedioTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoEvaluacionEmpleado() {
		return isPermisoPaginacionTodoTipoEvaluacionEmpleado;
	}

	public void setIsPermisoPaginacionTodoTipoEvaluacionEmpleado(Boolean isPermisoPaginacionTodoTipoEvaluacionEmpleado) {
		this.isPermisoPaginacionTodoTipoEvaluacionEmpleado = isPermisoPaginacionTodoTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoEvaluacionEmpleado() {
		return isPermisoPaginacionAltoTipoEvaluacionEmpleado;
	}

	public void setIsPermisoPaginacionAltoTipoEvaluacionEmpleado(Boolean isPermisoPaginacionAltoTipoEvaluacionEmpleado) {
		this.isPermisoPaginacionAltoTipoEvaluacionEmpleado = isPermisoPaginacionAltoTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsPermisoCopiarTipoEvaluacionEmpleado() {
		return isPermisoCopiarTipoEvaluacionEmpleado;
	}

	public void setIsPermisoCopiarTipoEvaluacionEmpleado(Boolean isPermisoCopiarTipoEvaluacionEmpleado) {
		this.isPermisoCopiarTipoEvaluacionEmpleado = isPermisoCopiarTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsPermisoVerFormTipoEvaluacionEmpleado() {
		return isPermisoVerFormTipoEvaluacionEmpleado;
	}

	public void setIsPermisoVerFormTipoEvaluacionEmpleado(Boolean isPermisoVerFormTipoEvaluacionEmpleado) {
		this.isPermisoVerFormTipoEvaluacionEmpleado = isPermisoVerFormTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarTipoEvaluacionEmpleado() {
		return isPermisoDuplicarTipoEvaluacionEmpleado;
	}

	public void setIsPermisoDuplicarTipoEvaluacionEmpleado(Boolean isPermisoDuplicarTipoEvaluacionEmpleado) {
		this.isPermisoDuplicarTipoEvaluacionEmpleado = isPermisoDuplicarTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsPermisoOrdenTipoEvaluacionEmpleado() {
		return isPermisoOrdenTipoEvaluacionEmpleado;
	}

	public void setIsPermisoOrdenTipoEvaluacionEmpleado(Boolean isPermisoOrdenTipoEvaluacionEmpleado) {
		this.isPermisoOrdenTipoEvaluacionEmpleado = isPermisoOrdenTipoEvaluacionEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaNuevoTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaNuevoTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado = isVisibilidadCeldaNuevoTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado = isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaCopiarTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaCopiarTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaCopiarTipoEvaluacionEmpleado = isVisibilidadCeldaCopiarTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaVerFormTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaVerFormTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaVerFormTipoEvaluacionEmpleado = isVisibilidadCeldaVerFormTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaOrdenTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaOrdenTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado = isVisibilidadCeldaOrdenTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado = isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaModificarTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaModificarTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaModificarTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado = isVisibilidadCeldaModificarTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaActualizarTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaActualizarTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado = isVisibilidadCeldaActualizarTipoEvaluacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaEliminarTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaEliminarTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado = isVisibilidadCeldaEliminarTipoEvaluacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaCancelarTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaCancelarTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado = isVisibilidadCeldaCancelarTipoEvaluacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaGuardarTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaGuardarTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado = isVisibilidadCeldaGuardarTipoEvaluacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado() {
		return isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado(Boolean isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado = isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado;
	}
		
	public TipoEvaluacionEmpleadoSessionBean gettipoevaluacionempleadoSessionBean() {
		return this.tipoevaluacionempleadoSessionBean;
	}
	
	public void settipoevaluacionempleadoSessionBean(TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean) {
		this.tipoevaluacionempleadoSessionBean=tipoevaluacionempleadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoevaluacionempleado,null);
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
	
	public void bugActualizarReferenciaActual(TipoEvaluacionEmpleado tipoevaluacionempleado,TipoEvaluacionEmpleado tipoevaluacionempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoEvaluacionEmpleado(tipoevaluacionempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoevaluacionempleadoAux.setId(tipoevaluacionempleado.getId());
		tipoevaluacionempleadoAux.setVersionRow(tipoevaluacionempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoEvaluacionEmpleado();
		
			int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoevaluacionempleadoValidator.getInvalidValues(this.tipoevaluacionempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoevaluacionempleadoLogic.setDatosCliente(datosCliente);
			tipoevaluacionempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoevaluacionempleadoAux=new  TipoEvaluacionEmpleado();
				
				tipoevaluacionempleadoAux.setIsNew(true);
				tipoevaluacionempleadoAux.setIsChanged(true);
				
				tipoevaluacionempleadoAux.setTipoEvaluacionEmpleadoOriginal(this.tipoevaluacionempleado);
				
				tipoevaluacionempleadoAux.setId(this.tipoevaluacionempleado.getId());	
				tipoevaluacionempleadoAux.setVersionRow(this.tipoevaluacionempleado.getVersionRow());	
				tipoevaluacionempleadoAux.setid_empresa(this.tipoevaluacionempleado.getid_empresa());	
				tipoevaluacionempleadoAux.setcodigo(this.tipoevaluacionempleado.getcodigo());	
				tipoevaluacionempleadoAux.setnombre(this.tipoevaluacionempleado.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoevaluacionempleadoLogic.saveTipoEvaluacionEmpleados();//WithConnection
						//tipoevaluacionempleadoLogic.getSetVersionRowTipoEvaluacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoevaluacionempleado,tipoevaluacionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesTipoEvaluacionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados().addAll(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleados.addAll(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoevaluacionempleadoLogic.saveTipoEvaluacionEmpleadoRelaciones(tipoevaluacionempleadoAux,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados());//WithConnection
								//tipoevaluacionempleadoLogic.getSetVersionRowTipoEvaluacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoevaluacionempleado,tipoevaluacionempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.setEvaluacionEmpleados(new ArrayList<EvaluacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleados= new ArrayList<EvaluacionEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoevaluacionempleadoAux.setEvaluacionEmpleados(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoevaluacionempleado,tipoevaluacionempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoevaluacionempleadoAux=new  TipoEvaluacionEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado() && this.tipoevaluacionempleado.getId()>=0)) {
						
					tipoevaluacionempleadoAux.setIsNew(false);
				}
				
				tipoevaluacionempleadoAux.setIsDeleted(false);
			
				tipoevaluacionempleadoAux.setId(this.tipoevaluacionempleado.getId());	
				tipoevaluacionempleadoAux.setVersionRow(this.tipoevaluacionempleado.getVersionRow());	
				tipoevaluacionempleadoAux.setid_empresa(this.tipoevaluacionempleado.getid_empresa());	
				tipoevaluacionempleadoAux.setcodigo(this.tipoevaluacionempleado.getcodigo());	
				tipoevaluacionempleadoAux.setnombre(this.tipoevaluacionempleado.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoevaluacionempleadoLogic.saveTipoEvaluacionEmpleados();//WithConnection
						//tipoevaluacionempleadoLogic.getSetVersionRowTipoEvaluacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoevaluacionempleado,tipoevaluacionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesTipoEvaluacionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados().addAll(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleados.addAll(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoevaluacionempleadoLogic.saveTipoEvaluacionEmpleadoRelaciones(tipoevaluacionempleadoAux,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados());//WithConnection
								//tipoevaluacionempleadoLogic.getSetVersionRowTipoEvaluacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoevaluacionempleado,tipoevaluacionempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.setEvaluacionEmpleados(new ArrayList<EvaluacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleados= new ArrayList<EvaluacionEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoevaluacionempleadoAux.setEvaluacionEmpleados(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoevaluacionempleado,tipoevaluacionempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoevaluacionempleadoAux=new  TipoEvaluacionEmpleado();
				
				tipoevaluacionempleadoAux.setIsNew(false);
				tipoevaluacionempleadoAux.setIsChanged(false);
				
				tipoevaluacionempleadoAux.setIsDeleted(true);
				
				tipoevaluacionempleadoAux.setId(this.tipoevaluacionempleado.getId());	
				tipoevaluacionempleadoAux.setVersionRow(this.tipoevaluacionempleado.getVersionRow());	
				tipoevaluacionempleadoAux.setid_empresa(this.tipoevaluacionempleado.getid_empresa());	
				tipoevaluacionempleadoAux.setcodigo(this.tipoevaluacionempleado.getcodigo());	
				tipoevaluacionempleadoAux.setnombre(this.tipoevaluacionempleado.getnombre());	
				
				if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoevaluacionempleadoAux.getId()>=0) {	
						this.tipoevaluacionempleadosEliminados.add(tipoevaluacionempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoevaluacionempleadoLogic.saveTipoEvaluacionEmpleados();//WithConnection
						//tipoevaluacionempleadoLogic.getSetVersionRowTipoEvaluacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados().addAll(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleados.addAll(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoevaluacionempleadoLogic.saveTipoEvaluacionEmpleadoRelaciones(tipoevaluacionempleadoAux,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados());//WithConnection
								//tipoevaluacionempleadoLogic.getSetVersionRowTipoEvaluacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.setEvaluacionEmpleados(new ArrayList<EvaluacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleados= new ArrayList<EvaluacionEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoevaluacionempleadoAux.setEvaluacionEmpleados(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoevaluacionempleadoAux,tipoevaluacionempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().addAll(this.tipoevaluacionempleadosEliminados);
					
					tipoevaluacionempleadoLogic.saveTipoEvaluacionEmpleados();//WithConnection
					//tipoevaluacionempleadoLogic.getSetVersionRowTipoEvaluacionEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoEvaluacionEmpleado();
				
				this.tipoevaluacionempleadosEliminados= new ArrayList<TipoEvaluacionEmpleado>();		
			}
			
			if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Evaluacion Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoevaluacionempleado=tipoevaluacionempleadoAux;
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
      		//this.finishProcessTipoEvaluacionEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoEvaluacionEmpleado tipoevaluacionempleadoLocal) throws Exception {
		
		if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoevaluacionempleadoLocal.setEvaluacionEmpleados(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados());
			
			} else {
			
				tipoevaluacionempleadoLocal.setEvaluacionEmpleados(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoEvaluacionEmpleado tipoevaluacionempleadoLocal) throws Exception {	
		if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoevaluacionempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoEvaluacionEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoevaluacionempleadoValidator.getInvalidValues(this.tipoevaluacionempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoEvaluacionEmpleado tipoevaluacionempleado,List<TipoEvaluacionEmpleado> tipoevaluacionempleados) throws Exception {
		try	{		
			TipoEvaluacionEmpleadoConstantesFunciones.actualizarLista(tipoevaluacionempleado,tipoevaluacionempleados,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoEvaluacionEmpleado tipoevaluacionempleado,List<TipoEvaluacionEmpleado> tipoevaluacionempleados) throws Exception {
		try	{			
			TipoEvaluacionEmpleadoConstantesFunciones.actualizarSelectedLista(tipoevaluacionempleado,tipoevaluacionempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoEvaluacionEmpleado> tipoevaluacionempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoevaluacionempleadosLocal=this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoevaluacionempleadosLocal=this.tipoevaluacionempleados;
			}
			//ARCHITECTURE
		
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoLocal:tipoevaluacionempleadosLocal) {
				if(this.permiteMantenimiento(tipoevaluacionempleadoLocal) && tipoevaluacionempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoEvaluacionEmpleadoConstantesFunciones.getTipoEvaluacionEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoEvaluacionEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelid_empresaTipoEvaluacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEvaluacionEmpleadoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelcodigoTipoEvaluacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEvaluacionEmpleadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelnombreTipoEvaluacionEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelid_empresaTipoEvaluacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelcodigoTipoEvaluacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelnombreTipoEvaluacionEmpleado,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("EvaluacionEmpleado")) {
			if(this.tipoevaluacionempleado==null) {
				this.tipoevaluacionempleado= new TipoEvaluacionEmpleado();
			}

			if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoEvaluacionEmpleado
				this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);

				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.getevaluacionempleado().setTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoEvaluacionEmpleado--;	
		
		
		this.tipoevaluacionempleadoAux=new TipoEvaluacionEmpleado();
		
		this.tipoevaluacionempleadoAux.setId(this.iIdNuevoTipoEvaluacionEmpleado);
		this.tipoevaluacionempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().add(this.tipoevaluacionempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoevaluacionempleados.add(this.tipoevaluacionempleadoAux);
		}
		//ARCHITECTURE
		
		this.tipoevaluacionempleado=this.tipoevaluacionempleadoAux;
		
		if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
		}
				
		//this.setDefaultControlesTipoEvaluacionEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoEvaluacionEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoEvaluacionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEvaluacionEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleadoBean,this.tipoevaluacionempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
			classes=TipoEvaluacionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoEvaluacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoevaluacionempleadoReturnGeneral=tipoevaluacionempleadoLogic.procesarEventosTipoEvaluacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados(),this.tipoevaluacionempleado,this.tipoevaluacionempleadoParameterGeneral,this.isEsNuevoTipoEvaluacionEmpleado,classes);//this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral,this.tipoevaluacionempleadoBean,false);
		
		if(this.tipoevaluacionempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado());
		}
		
		if(this.tipoevaluacionempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado(),classes);//this.tipoevaluacionempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoEvaluacionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoEvaluacionEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormTipoEvaluacionEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
						
			if(tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.getEsGuardarRelacionado() && EvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEvaluacionEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEvaluacionEmpleado();
			}
			
			this.actualizarVisualTableDatosTipoEvaluacionEmpleado();
			
			this.jTableDatosTipoEvaluacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoEvaluacionEmpleado(), this.getIndiceNuevoTipoEvaluacionEmpleado());
			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoEvaluacionEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextFieldcodigoTipoEvaluacionEmpleado.setEnabled(isHabilitar && this.tipoevaluacionempleadoConstantesFunciones.activarcodigoTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextAreanombreTipoEvaluacionEmpleado.setEnabled(isHabilitar && this.tipoevaluacionempleadoConstantesFunciones.activarnombreTipoEvaluacionEmpleado);	
		//
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setEnabled(isHabilitar && this.tipoevaluacionempleadoConstantesFunciones.activarid_empresaTipoEvaluacionEmpleado);
	};
	
	public void setDefaultControlesTipoEvaluacionEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoEvaluacionEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoevaluacionempleadoSessionBean.setConGuardarRelaciones(true);			
			this.tipoevaluacionempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoevaluacionempleadoSessionBean.setConGuardarRelaciones(false);			
			this.tipoevaluacionempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoEvaluacionEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
				if(tipoevaluacionempleadoAux.getId().equals(this.iIdNuevoTipoEvaluacionEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleados) {
				if(tipoevaluacionempleadoAux.getId().equals(this.iIdNuevoTipoEvaluacionEmpleado)) {
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
	
	public int getIndiceActualTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
				if(tipoevaluacionempleadoAux.getId().equals(tipoevaluacionempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleados) {
				if(tipoevaluacionempleadoAux.getId().equals(tipoevaluacionempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
				if(tipoevaluacionempleadoAux.getTipoEvaluacionEmpleadoOriginal().getId().equals(tipoevaluacionempleadoOriginal.getId())) {
					existe=true;
					tipoevaluacionempleadoOriginal.setId(tipoevaluacionempleadoAux.getId());
					tipoevaluacionempleadoOriginal.setVersionRow(tipoevaluacionempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleados) {
				if(tipoevaluacionempleadoAux.getTipoEvaluacionEmpleadoOriginal().getId().equals(tipoevaluacionempleadoOriginal.getId())) {
					existe=true;
					tipoevaluacionempleadoOriginal.setId(tipoevaluacionempleadoAux.getId());
					tipoevaluacionempleadoOriginal.setVersionRow(tipoevaluacionempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoEvaluacionEmpleado(Boolean esParaCancelar) throws Exception {
		tipoevaluacionempleadosAux=new ArrayList<TipoEvaluacionEmpleado>();
		tipoevaluacionempleadoAux=new TipoEvaluacionEmpleado();
		
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
					if(tipoevaluacionempleadoAux.getId()<0) {
						tipoevaluacionempleadosAux.add(tipoevaluacionempleadoAux);
					}		
				}
				this.iIdNuevoTipoEvaluacionEmpleado=0L;
				this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().removeAll(tipoevaluacionempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleados) {
					if(tipoevaluacionempleadoAux.getId()<0) {
						tipoevaluacionempleadosAux.add(tipoevaluacionempleadoAux);
					}		
				}
				this.iIdNuevoTipoEvaluacionEmpleado=0L;
				this.tipoevaluacionempleados.removeAll(tipoevaluacionempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoEvaluacionEmpleado 
					&& this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size()>0
					) {
					tipoevaluacionempleadoAux=this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().get(this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size() - 1);
				
					if(tipoevaluacionempleadoAux.getId()<0) {
						this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().remove(tipoevaluacionempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoEvaluacionEmpleado && this.tipoevaluacionempleados.size()>0) {
					tipoevaluacionempleadoAux=this.tipoevaluacionempleados.get(this.tipoevaluacionempleados.size() - 1);
				
					if(tipoevaluacionempleadoAux.getId()<0) {
						this.tipoevaluacionempleados.remove(tipoevaluacionempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoEvaluacionEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoevaluacionempleado.getId()<0) {
				this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().remove(this.tipoevaluacionempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoevaluacionempleado.getId()<0) {
				this.tipoevaluacionempleados.remove(this.tipoevaluacionempleado);
			}
		}			
	}
	
	public void setEstadosInicialesTipoEvaluacionEmpleado(List<TipoEvaluacionEmpleado> tipoevaluacionempleadosAux) throws Exception {
		TipoEvaluacionEmpleadoConstantesFunciones.setEstadosInicialesTipoEvaluacionEmpleado(tipoevaluacionempleadosAux);
	}
	
	public void setEstadosInicialesTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleadoAux) throws Exception {
		TipoEvaluacionEmpleadoConstantesFunciones.setEstadosInicialesTipoEvaluacionEmpleado(tipoevaluacionempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoEvaluacionEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoEvaluacionEmpleadoActual()) {
				if(!this.isEsNuevoTipoEvaluacionEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoEvaluacionEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoEvaluacionEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Evaluacion Empleado ?", "MANTENIMIENTO DE Tipo Evaluacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoEvaluacionEmpleado tipoevaluacionempleado) throws Exception {
		TipoEvaluacionEmpleadoConstantesFunciones.seleccionarAsignar(this.tipoevaluacionempleado,tipoevaluacionempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoEvaluacionEmpleado=this.isPermisoActualizarOriginalTipoEvaluacionEmpleado;
			
			
			this.seleccionarAsignar(tipoevaluacionempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEvaluacionEmpleadoConstantesFunciones.quitarEspaciosTipoEvaluacionEmpleado(this.tipoevaluacionempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoevaluacionempleadoSessionBean.setsFuncionBusquedaRapida(this.tipoevaluacionempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoEvaluacionEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoEvaluacionEmpleado(esParaCancelar);				
				this.cancelarNuevoTipoEvaluacionEmpleado(esParaCancelar);								
			}
			
			this.tipoevaluacionempleado=new TipoEvaluacionEmpleado();
			
			this.inicializarTipoEvaluacionEmpleado();
			
			this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoEvaluacionEmpleado() throws Exception {
		try {
			TipoEvaluacionEmpleadoConstantesFunciones.inicializarTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoEvaluacionEmpleados(String sAccionBusqueda,List<TipoEvaluacionEmpleado> tipoevaluacionempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoEvaluacionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoEvaluacionEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoEvaluacionEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoEvaluacionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Evaluacion Empleados");		
		parameters.put("busquedapor", TipoEvaluacionEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(EvaluacionEmpleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoEvaluacionEmpleadoLogic tipoevaluacionempleadoLogicAuxiliar=new TipoEvaluacionEmpleadoLogic();
					tipoevaluacionempleadoLogicAuxiliar.setDatosCliente(tipoevaluacionempleadoLogic.getDatosCliente());				
					tipoevaluacionempleadoLogicAuxiliar.setTipoEvaluacionEmpleados(tipoevaluacionempleadosParaReportes);
					
					tipoevaluacionempleadoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoEvaluacionEmpleadoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoevaluacionempleadosParaReportes=tipoevaluacionempleadoLogicAuxiliar.getTipoEvaluacionEmpleados();
					
					//tipoevaluacionempleadoLogic.getNewConnexionToDeep();
					
					//for (TipoEvaluacionEmpleado tipoevaluacionempleado:tipoevaluacionempleadosParaReportes) {
					//	tipoevaluacionempleadoLogic.deepLoad(tipoevaluacionempleado, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEvaluacionEmpleado = AuxiliarReportes.class.getResourceAsStream("EvaluacionEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_evaluacionempleado", reportFileEvaluacionEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoEvaluacionEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoEvaluacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoEvaluacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoEvaluacionEmpleado=new JRBeanArrayDataSource(TipoEvaluacionEmpleadoJInternalFrame.TraerTipoEvaluacionEmpleadoBeans(tipoevaluacionempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoEvaluacionEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoEvaluacionEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoEvaluacionEmpleadoBean.TraerTipoEvaluacionEmpleadoBeans(tipoevaluacionempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoEvaluacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoevaluacionempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoEvaluacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoevaluacionempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(null);
					//this.generarExcelReporteTipoEvaluacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoevaluacionempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoEvaluacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoevaluacionempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoEvaluacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoevaluacionempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoEvaluacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoevaluacionempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoEvaluacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEvaluacionEmpleado> tipoevaluacionempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoevaluacionempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEvaluacionEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEvaluacionEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoEvaluacionEmpleado tipoevaluacionempleado : tipoevaluacionempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoEvaluacionEmpleadoConstantesFunciones.generarExcelReporteDataTipoEvaluacionEmpleado("NORMAL",row,workbook,tipoevaluacionempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoEvaluacionEmpleado(String sTipo,Row row,Workbook workbook) {
		
		TipoEvaluacionEmpleadoConstantesFunciones.generarExcelReporteHeaderTipoEvaluacionEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoEvaluacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEvaluacionEmpleado> tipoevaluacionempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoevaluacionempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEvaluacionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoEvaluacionEmpleado tipoevaluacionempleado : tipoevaluacionempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.getTipoEvaluacionEmpleadoDescripcion(tipoevaluacionempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoevaluacionempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoevaluacionempleado.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoevaluacionempleado.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoEvaluacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEvaluacionEmpleado> tipoevaluacionempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoEvaluacionEmpleado> tipoevaluacionempleadosRespaldo=null;
		
		classes=TipoEvaluacionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoEvaluacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoevaluacionempleadoLogic.setDatosCliente(this.datosCliente);
		this.tipoevaluacionempleadoLogic.setDatosDeep(this.datosDeep);
		this.tipoevaluacionempleadoLogic.setIsConDeep(true);
		
		tipoevaluacionempleadosRespaldo=this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados();
		
		this.tipoevaluacionempleadoLogic.setTipoEvaluacionEmpleados(tipoevaluacionempleadosParaReportes);	
		this.tipoevaluacionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoevaluacionempleadosParaReportes=this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados();
		this.tipoevaluacionempleadoLogic.setTipoEvaluacionEmpleados(tipoevaluacionempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoevaluacionempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEvaluacionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEvaluacionEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoEvaluacionEmpleado tipoevaluacionempleado : tipoevaluacionempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoEvaluacionEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoEvaluacionEmpleadoConstantesFunciones.generarExcelReporteDataTipoEvaluacionEmpleado("NORMAL",row,workbook,tipoevaluacionempleado,cellStyleDataAux);
		
			
			


				//EvaluacionEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoevaluacionempleado.getEvaluacionEmpleados()!=null && tipoevaluacionempleado.getEvaluacionEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EvaluacionEmpleadoConstantesFunciones.generarExcelReporteHeaderEvaluacionEmpleado("RELACIONADO",row,workbook);
				}

				if(tipoevaluacionempleado.getEvaluacionEmpleados()!=null) {
					i2=0;
					for(EvaluacionEmpleado evaluacionempleado : tipoevaluacionempleado.getEvaluacionEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EvaluacionEmpleadoConstantesFunciones.generarExcelReporteDataEvaluacionEmpleado("RELACIONADO",row,workbook,evaluacionempleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.getTipoEvaluacionEmpleadoDescripcion(tipoevaluacionempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoEvaluacionEmpleado() throws Exception {		
		this.startProcessTipoEvaluacionEmpleado(true);
	}
	
	public void startProcessTipoEvaluacionEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoEvaluacionEmpleado ,this.jPanelParametrosReportesTipoEvaluacionEmpleado, this.jScrollPanelDatosTipoEvaluacionEmpleado,this.jPanelPaginacionTipoEvaluacionEmpleado, this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado, this.jPanelAccionesTipoEvaluacionEmpleado,this.jPanelAccionesFormularioTipoEvaluacionEmpleado,this.jmenuBarTipoEvaluacionEmpleado,this.jmenuBarDetalleTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,this.jTtoolBarDetalleTipoEvaluacionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEvaluacionEmpleado=this.jTabbedPaneBusquedasTipoEvaluacionEmpleado; 
		
		final JPanel jPanelParametrosReportesTipoEvaluacionEmpleado=this.jPanelParametrosReportesTipoEvaluacionEmpleado;
		//final JScrollPane jScrollPanelDatosTipoEvaluacionEmpleado=this.jScrollPanelDatosTipoEvaluacionEmpleado;
		final JTable jTableDatosTipoEvaluacionEmpleado=this.jTableDatosTipoEvaluacionEmpleado;		
		final JPanel jPanelPaginacionTipoEvaluacionEmpleado=this.jPanelPaginacionTipoEvaluacionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionTipoEvaluacionEmpleado=this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado;
		final JPanel jPanelAccionesTipoEvaluacionEmpleado=this.jPanelAccionesTipoEvaluacionEmpleado;
		
		JPanel jPanelCamposAuxiliarTipoEvaluacionEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoEvaluacionEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			jPanelCamposAuxiliarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jPanelCamposTipoEvaluacionEmpleado;
			jPanelAccionesFormularioAuxiliarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jPanelAccionesFormularioTipoEvaluacionEmpleado;
		}
		
		final JPanel jPanelCamposTipoEvaluacionEmpleado=jPanelCamposAuxiliarTipoEvaluacionEmpleado;
		final JPanel jPanelAccionesFormularioTipoEvaluacionEmpleado=jPanelAccionesFormularioAuxiliarTipoEvaluacionEmpleado;
		
		
		final JMenuBar jmenuBarTipoEvaluacionEmpleado=this.jmenuBarTipoEvaluacionEmpleado;
		final JToolBar jTtoolBarTipoEvaluacionEmpleado=this.jTtoolBarTipoEvaluacionEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoEvaluacionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEvaluacionEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			jmenuBarDetalleAuxiliarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jmenuBarDetalleTipoEvaluacionEmpleado;
			jTtoolBarDetalleAuxiliarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTtoolBarDetalleTipoEvaluacionEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleTipoEvaluacionEmpleado=jmenuBarDetalleAuxiliarTipoEvaluacionEmpleado;
		final JToolBar jTtoolBarDetalleTipoEvaluacionEmpleado=jTtoolBarDetalleAuxiliarTipoEvaluacionEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEvaluacionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEvaluacionEmpleado;
			processRunnable.jTableDatos=jTableDatosTipoEvaluacionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposTipoEvaluacionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEvaluacionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEvaluacionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEvaluacionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEvaluacionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEvaluacionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarTipoEvaluacionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEvaluacionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEvaluacionEmpleado ,jPanelParametrosReportesTipoEvaluacionEmpleado,jTableDatosTipoEvaluacionEmpleado, /*jScrollPanelDatosTipoEvaluacionEmpleado,*/jPanelCamposTipoEvaluacionEmpleado,jPanelPaginacionTipoEvaluacionEmpleado, /*jScrollPanelDatosEdicionTipoEvaluacionEmpleado,*/ jPanelAccionesTipoEvaluacionEmpleado,jPanelAccionesFormularioTipoEvaluacionEmpleado,jmenuBarTipoEvaluacionEmpleado,jmenuBarDetalleTipoEvaluacionEmpleado,jTtoolBarTipoEvaluacionEmpleado,jTtoolBarDetalleTipoEvaluacionEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEvaluacionEmpleado ,jPanelParametrosReportesTipoEvaluacionEmpleado, jScrollPanelDatosTipoEvaluacionEmpleado,jPanelPaginacionTipoEvaluacionEmpleado, jScrollPanelDatosEdicionTipoEvaluacionEmpleado, jPanelAccionesTipoEvaluacionEmpleado,jPanelAccionesFormularioTipoEvaluacionEmpleado,jmenuBarTipoEvaluacionEmpleado,jmenuBarDetalleTipoEvaluacionEmpleado,jTtoolBarTipoEvaluacionEmpleado,jTtoolBarDetalleTipoEvaluacionEmpleado);
						
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
	
	public void finishProcessTipoEvaluacionEmpleado() {// throws Exception 
		this.finishProcessTipoEvaluacionEmpleado(true);
	}
	
	public void finishProcessTipoEvaluacionEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoEvaluacionEmpleado ,this.jPanelParametrosReportesTipoEvaluacionEmpleado, this.jScrollPanelDatosTipoEvaluacionEmpleado,this.jPanelPaginacionTipoEvaluacionEmpleado, this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado, this.jPanelAccionesTipoEvaluacionEmpleado,this.jPanelAccionesFormularioTipoEvaluacionEmpleado,this.jmenuBarTipoEvaluacionEmpleado,this.jmenuBarDetalleTipoEvaluacionEmpleado,this.jTtoolBarTipoEvaluacionEmpleado,this.jTtoolBarDetalleTipoEvaluacionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEvaluacionEmpleado=this.jTabbedPaneBusquedasTipoEvaluacionEmpleado; 
		
		final JPanel jPanelParametrosReportesTipoEvaluacionEmpleado=this.jPanelParametrosReportesTipoEvaluacionEmpleado;
		//final JScrollPane jScrollPanelDatosTipoEvaluacionEmpleado=this.jScrollPanelDatosTipoEvaluacionEmpleado;
		final JTable jTableDatosTipoEvaluacionEmpleado=this.jTableDatosTipoEvaluacionEmpleado;		
		final JPanel jPanelPaginacionTipoEvaluacionEmpleado=this.jPanelPaginacionTipoEvaluacionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionTipoEvaluacionEmpleado=this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado;
		final JPanel jPanelAccionesTipoEvaluacionEmpleado=this.jPanelAccionesTipoEvaluacionEmpleado;
		
		JPanel jPanelCamposAuxiliarTipoEvaluacionEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoEvaluacionEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			jPanelCamposAuxiliarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jPanelCamposTipoEvaluacionEmpleado;
			jPanelAccionesFormularioAuxiliarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jPanelAccionesFormularioTipoEvaluacionEmpleado;
		}
		
		final JPanel jPanelCamposTipoEvaluacionEmpleado=jPanelCamposAuxiliarTipoEvaluacionEmpleado;
		final JPanel jPanelAccionesFormularioTipoEvaluacionEmpleado=jPanelAccionesFormularioAuxiliarTipoEvaluacionEmpleado;
		
		
		final JMenuBar jmenuBarTipoEvaluacionEmpleado=this.jmenuBarTipoEvaluacionEmpleado;		
		final JToolBar jTtoolBarTipoEvaluacionEmpleado=this.jTtoolBarTipoEvaluacionEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoEvaluacionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEvaluacionEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			jmenuBarDetalleAuxiliarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jmenuBarDetalleTipoEvaluacionEmpleado;
			jTtoolBarDetalleAuxiliarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTtoolBarDetalleTipoEvaluacionEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleTipoEvaluacionEmpleado=jmenuBarDetalleAuxiliarTipoEvaluacionEmpleado;
		final JToolBar jTtoolBarDetalleTipoEvaluacionEmpleado=jTtoolBarDetalleAuxiliarTipoEvaluacionEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEvaluacionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEvaluacionEmpleado;
			processRunnable.jTableDatos=jTableDatosTipoEvaluacionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposTipoEvaluacionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEvaluacionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEvaluacionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEvaluacionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEvaluacionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEvaluacionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarTipoEvaluacionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEvaluacionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoEvaluacionEmpleado ,jPanelParametrosReportesTipoEvaluacionEmpleado, jTableDatosTipoEvaluacionEmpleado,/*jScrollPanelDatosTipoEvaluacionEmpleado,*/jPanelCamposTipoEvaluacionEmpleado,jPanelPaginacionTipoEvaluacionEmpleado, /*jScrollPanelDatosEdicionTipoEvaluacionEmpleado,*/ jPanelAccionesTipoEvaluacionEmpleado,jPanelAccionesFormularioTipoEvaluacionEmpleado,jmenuBarTipoEvaluacionEmpleado,jmenuBarDetalleTipoEvaluacionEmpleado,jTtoolBarTipoEvaluacionEmpleado,jTtoolBarDetalleTipoEvaluacionEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoEvaluacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoEvaluacionEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoEvaluacionEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoEvaluacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoEvaluacionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoEvaluacionEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoEvaluacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoEvaluacionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoEvaluacionEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoevaluacionempleadoConstantesFunciones.getsFinalQueryTipoEvaluacionEmpleado();
		String  finalQueryPaginacionTodos=this.tipoevaluacionempleadoConstantesFunciones.getsFinalQueryTipoEvaluacionEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoEvaluacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoTipoEvaluacionEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoEvaluacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoEvaluacionEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoEvaluacionEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoevaluacionempleadosEliminados= new ArrayList<TipoEvaluacionEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoEvaluacionEmpleado();
		
				///*TipoEvaluacionEmpleadoSessionBean*/this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
			
			if(this.tipoevaluacionempleadoSessionBean==null) {
				this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
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
					this.iNumeroPaginacion=TipoEvaluacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoEvaluacionEmpleadoConstantesFunciones.getClassesForeignKeysOfTipoEvaluacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoevaluacionempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoevaluacionempleadosAux= new ArrayList<TipoEvaluacionEmpleado>();
			
				
			tipoevaluacionempleadoLogic.setDatosCliente(this.datosCliente);
			tipoevaluacionempleadoLogic.setDatosDeep(this.datosDeep);
			tipoevaluacionempleadoLogic.setIsConDeep(true);
			
			
			tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoevaluacionempleadoLogic.getTodosTipoEvaluacionEmpleados(finalQueryGlobal,pagination);
					
					//tipoevaluacionempleadoLogic.getTodosTipoEvaluacionEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()==null|| tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoevaluacionempleadosAux= new ArrayList<TipoEvaluacionEmpleado>();
							tipoevaluacionempleadosAux.addAll(tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoevaluacionempleadosAux= new ArrayList<TipoEvaluacionEmpleado>();
							tipoevaluacionempleadosAux.addAll(tipoevaluacionempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoevaluacionempleadoLogic.getTodosTipoEvaluacionEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//tipoevaluacionempleadoLogic.getTodosTipoEvaluacionEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoEvaluacionEmpleados("Todos",tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoevaluacionempleadoLogic.setTipoEvaluacionEmpleados(new ArrayList<TipoEvaluacionEmpleado>());					
							tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().addAll(tipoevaluacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoevaluacionempleados=new ArrayList<TipoEvaluacionEmpleado>();
							tipoevaluacionempleados.addAll(tipoevaluacionempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoEvaluacionEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoEvaluacionEmpleado=this.idActual;
				
				} else if(this.idTipoEvaluacionEmpleadoActual!=null && this.idTipoEvaluacionEmpleadoActual!=0L) {
					idTipoEvaluacionEmpleado=idTipoEvaluacionEmpleadoActual;
				}
				
					
				this.sDetalleReporte=TipoEvaluacionEmpleadoConstantesFunciones.getDetalleIndicePorId(idTipoEvaluacionEmpleado);
				
				this.tipoevaluacionempleados=new ArrayList<TipoEvaluacionEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoevaluacionempleadoLogic.getEntity(idTipoEvaluacionEmpleado);
					
					//tipoevaluacionempleadoLogic.getEntityWithConnection(idTipoEvaluacionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoevaluacionempleadoLogic.setTipoEvaluacionEmpleados(new ArrayList<TipoEvaluacionEmpleado>());
					tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().add(tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoevaluacionempleados=new ArrayList<TipoEvaluacionEmpleado>();
					this.tipoevaluacionempleados.add(tipoevaluacionempleado);
				}
				
				if(tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoEvaluacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEvaluacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEvaluacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()==null||tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoevaluacionempleados==null|| tipoevaluacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoevaluacionempleadosAux=new ArrayList<TipoEvaluacionEmpleado>();
						tipoevaluacionempleadosAux.addAll(tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoevaluacionempleadosAux=new ArrayList<TipoEvaluacionEmpleado>();
							tipoevaluacionempleadosAux.addAll(tipoevaluacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEvaluacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEvaluacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoEvaluacionEmpleados("FK_IdEmpresa",tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoEvaluacionEmpleados("FK_IdEmpresa",tipoevaluacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoevaluacionempleadoLogic.setTipoEvaluacionEmpleados(new ArrayList<TipoEvaluacionEmpleado>());
						tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().addAll(tipoevaluacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoevaluacionempleados=new ArrayList<TipoEvaluacionEmpleado>();
							tipoevaluacionempleados.addAll(tipoevaluacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoEvaluacionEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoEvaluacionEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoevaluacionempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoevaluacionempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoEvaluacionEmpleado tipoevaluacionempleado) {
		Boolean permite=true;
		
		if(this.tipoevaluacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoEvaluacionEmpleadoConstantesFunciones.getOrderByListaTipoEvaluacionEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoEvaluacionEmpleadoConstantesFunciones.getOrderByListaTipoEvaluacionEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleado:tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
				if(tipoevaluacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoevaluacionempleadoTotales=tipoevaluacionempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleado:this.tipoevaluacionempleados) {
				if(tipoevaluacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoevaluacionempleadoTotales=tipoevaluacionempleado;
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
			this.tipoevaluacionempleadoAux=new TipoEvaluacionEmpleado();
			this.tipoevaluacionempleadoAux.setsType(Constantes2.S_TOTALES);
			this.tipoevaluacionempleadoAux.setIsNew(false);
			this.tipoevaluacionempleadoAux.setIsChanged(false);
			this.tipoevaluacionempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoEvaluacionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoEvaluacionEmpleado(this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados(),this.tipoevaluacionempleadoAux);
				
				this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().add(this.tipoevaluacionempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoEvaluacionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoEvaluacionEmpleado(this.tipoevaluacionempleados,this.tipoevaluacionempleadoAux);
				
				this.tipoevaluacionempleados.add(this.tipoevaluacionempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoevaluacionempleadoTotales=new TipoEvaluacionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().remove(tipoevaluacionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoevaluacionempleados.remove(tipoevaluacionempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoevaluacionempleadoTotales=new TipoEvaluacionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleado:tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
				if(tipoevaluacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoevaluacionempleadoTotales=tipoevaluacionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEvaluacionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoEvaluacionEmpleado(this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados(),tipoevaluacionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEvaluacionEmpleado tipoevaluacionempleado:this.tipoevaluacionempleados) {
				if(tipoevaluacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoevaluacionempleadoTotales=tipoevaluacionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEvaluacionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoEvaluacionEmpleado(this.tipoevaluacionempleados,tipoevaluacionempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoEvaluacionEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoEvaluacionEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoEvaluacionEmpleado() {
		this.isPermisoTodoTipoEvaluacionEmpleado=false;
		this.isPermisoNuevoTipoEvaluacionEmpleado=false;
		this.isPermisoActualizarTipoEvaluacionEmpleado=false;
		this.isPermisoActualizarOriginalTipoEvaluacionEmpleado=false;
		this.isPermisoEliminarTipoEvaluacionEmpleado=false;
		this.isPermisoGuardarCambiosTipoEvaluacionEmpleado=false;
		this.isPermisoConsultaTipoEvaluacionEmpleado=false;
		this.isPermisoBusquedaTipoEvaluacionEmpleado=false;
		this.isPermisoReporteTipoEvaluacionEmpleado=false;		
		this.isPermisoOrdenTipoEvaluacionEmpleado=false;		
		this.isPermisoPaginacionMedioTipoEvaluacionEmpleado=false;		
		this.isPermisoPaginacionAltoTipoEvaluacionEmpleado=false;
		this.isPermisoPaginacionTodoTipoEvaluacionEmpleado=false;
		this.isPermisoCopiarTipoEvaluacionEmpleado=false;		
		this.isPermisoVerFormTipoEvaluacionEmpleado=false;		
		this.isPermisoDuplicarTipoEvaluacionEmpleado=false;		
		this.isPermisoOrdenTipoEvaluacionEmpleado=false;		
	}
	
	public void setPermisosUsuarioTipoEvaluacionEmpleado(Boolean isPermiso) {
		this.isPermisoTodoTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoNuevoTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoActualizarTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoEliminarTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoConsultaTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoBusquedaTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoReporteTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoOrdenTipoEvaluacionEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioTipoEvaluacionEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoTipoEvaluacionEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoTipoEvaluacionEmpleado=isPermiso;		
		this.isPermisoCopiarTipoEvaluacionEmpleado=isPermiso;		
		this.isPermisoVerFormTipoEvaluacionEmpleado=isPermiso;		
		this.isPermisoDuplicarTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoOrdenTipoEvaluacionEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoEvaluacionEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoNuevoTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoActualizarTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoEliminarTipoEvaluacionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosTipoEvaluacionEmpleado=isPermiso;
		//this.isPermisoConsultaTipoEvaluacionEmpleado=isPermiso;
		//this.isPermisoBusquedaTipoEvaluacionEmpleado=isPermiso;
		//this.isPermisoReporteTipoEvaluacionEmpleado=isPermiso;
		//this.isPermisoOrdenTipoEvaluacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioTipoEvaluacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoTipoEvaluacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoTipoEvaluacionEmpleado=isPermiso;		
		//this.isPermisoCopiarTipoEvaluacionEmpleado=isPermiso;		
		//this.isPermisoDuplicarTipoEvaluacionEmpleado=isPermiso;
		//this.isPermisoOrdenTipoEvaluacionEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoEvaluacionEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EvaluacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoEvaluacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEvaluacionEmpleado=false;
		this.isTienePermisosEvaluacionEmpleado=this.verificarGetPermisosUsuarioOpcionTipoEvaluacionEmpleadoClaseRelacionada(this.opcionsRelacionadas,EvaluacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoEvaluacionEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoEvaluacionEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEvaluacionEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoEvaluacionEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoEvaluacionEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoEvaluacionEmpleadoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEvaluacionEmpleado && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.remove(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoEvaluacionEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoEvaluacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoEvaluacionEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoEvaluacionEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoEvaluacionEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoEvaluacionEmpleado=this.isPermisoActualizarTipoEvaluacionEmpleado;
			this.isPermisoEliminarTipoEvaluacionEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoEvaluacionEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoEvaluacionEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoEvaluacionEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoEvaluacionEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoEvaluacionEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEvaluacionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoEvaluacionEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoEvaluacionEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoEvaluacionEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoEvaluacionEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoEvaluacionEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoEvaluacionEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEvaluacionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoEvaluacionEmpleado.setToolTipText(this.jTableDatosTipoEvaluacionEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoEvaluacionEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoEvaluacionEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoEvaluacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoEvaluacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoEvaluacionEmpleado() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEvaluacionEmpleado && this.tipoevaluacionempleadoConstantesFunciones.mostrarEvaluacionEmpleadoTipoEvaluacionEmpleado && !TipoEvaluacionEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Evaluacion Empleado");
			reporte.setsDescripcion("Evaluacion Empleado");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoEvaluacionEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoEvaluacionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoEvaluacionEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoEvaluacionEmpleadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoEvaluacionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoEvaluacionEmpleadoParameterReturnGeneral tipoevaluacionempleadoReturnGeneral=new TipoEvaluacionEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoevaluacionempleadoConstantesFunciones.cargarid_empresaTipoEvaluacionEmpleado)
					 || (this.esRecargarFks && this.tipoevaluacionempleadoConstantesFunciones.cargarid_empresaTipoEvaluacionEmpleado)) {

					if(!this.tipoevaluacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoevaluacionempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoevaluacionempleadoReturnGeneral=tipoevaluacionempleadoLogic.cargarCombosLoteForeignKeyTipoEvaluacionEmpleado(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoevaluacionempleadoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoEvaluacionEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoevaluacionempleadoSessionBean==null) {
				this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
			}

			if(!this.tipoevaluacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoEvaluacionEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoEvaluacionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoEvaluacionEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEvaluacionEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoEvaluacionEmpleado()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEvaluacionEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoEvaluacionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoEvaluacionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoEvaluacionEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoEvaluacionEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoEvaluacionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoEvaluacionEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoEvaluacionEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoEvaluacionEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoEvaluacionEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean(); 
		this.tipoevaluacionempleadoConstantesFunciones=new TipoEvaluacionEmpleadoConstantesFunciones(); 
		this.tipoevaluacionempleadoBean=new TipoEvaluacionEmpleado();//(this.tipoevaluacionempleadoConstantesFunciones); 		
		this.tipoevaluacionempleadoReturnGeneral=new TipoEvaluacionEmpleadoParameterReturnGeneral(); 
		
		this.tipoevaluacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoevaluacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoEvaluacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoEvaluacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoEvaluacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoEvaluacionEmpleado(true);
			
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
			
			this.tipoevaluacionempleadoConstantesFunciones=new TipoEvaluacionEmpleadoConstantesFunciones(); 
			this.tipoevaluacionempleadoBean=new TipoEvaluacionEmpleado();//this.tipoevaluacionempleadoConstantesFunciones); 			
			this.tipoevaluacionempleadoReturnGeneral=new TipoEvaluacionEmpleadoParameterReturnGeneral(); 
		
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Evaluacion Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoevaluacionempleado=new TipoEvaluacionEmpleado();
			this.tipoevaluacionempleados = new ArrayList<TipoEvaluacionEmpleado>();
			this.tipoevaluacionempleadosAux = new ArrayList<TipoEvaluacionEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic=new TipoEvaluacionEmpleadoLogic();
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoevaluacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoevaluacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado);	
					}
					
					if(this.jInternalFrameImportacionTipoEvaluacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEvaluacionEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoEvaluacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoEvaluacionEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado);
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado);
					this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoEvaluacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoEvaluacionEmpleado);
					this.jInternalFrameImportacionTipoEvaluacionEmpleado.setVisible(false);
					this.jInternalFrameImportacionTipoEvaluacionEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoEvaluacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoEvaluacionEmpleado);
					this.jInternalFrameOrderByTipoEvaluacionEmpleado.setVisible(false);
					this.jInternalFrameOrderByTipoEvaluacionEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoEvaluacionEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoEvaluacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoevaluacionempleadoReturnGeneral=new TipoEvaluacionEmpleadoParameterReturnGeneral();
			
			this.tipoevaluacionempleadoParameterGeneral=new TipoEvaluacionEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoevaluacionempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoEvaluacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EvaluacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEvaluacionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado(),this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEvaluacionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado(),this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaCopiarTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaVerFormTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoEvaluacionEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoEvaluacionEmpleado(false);
			
			this.setPermisosUsuarioTipoEvaluacionEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado() && this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoEvaluacionEmpleadoClasesRelacionadas();
			}
			
			if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoEvaluacionEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoEvaluacionEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoEvaluacionEmpleado();
			}
			
			if(!this.isPermisoBusquedaTipoEvaluacionEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoEvaluacionEmpleado,this.isPermisoPaginacionMedioTipoEvaluacionEmpleado,this.isPermisoPaginacionTodoTipoEvaluacionEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoEvaluacionEmpleadoConstantesFunciones.getTiposSeleccionarTipoEvaluacionEmpleado());
				
				this.tiposColumnasSelect=TipoEvaluacionEmpleadoConstantesFunciones.getTiposSeleccionarTipoEvaluacionEmpleado(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoEvaluacionEmpleado();				
				//this.tiposRelacionesSelect=TipoEvaluacionEmpleadoConstantesFunciones.getTiposRelacionesTipoEvaluacionEmpleado(true);
				
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
			//if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoEvaluacionEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoEvaluacionEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoEvaluacionEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEvaluacionEmpleado() ;
			
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
			
			
			this.evaluacionempleadoLogic=new EvaluacionEmpleadoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoevaluacionempleadoImplementable= (TipoEvaluacionEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEvaluacionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoevaluacionempleadoImplementableHome= (TipoEvaluacionEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEvaluacionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoevaluacionempleados= new ArrayList<TipoEvaluacionEmpleado>();
			this.tipoevaluacionempleadosEliminados= new ArrayList<TipoEvaluacionEmpleado>();
						
			this.isEsNuevoTipoEvaluacionEmpleado=false;
			this.esParaAccionDesdeFormularioTipoEvaluacionEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoEvaluacionEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoEvaluacionEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoEvaluacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoEvaluacionEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoEvaluacionEmpleado();
			}
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoEvaluacionEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoEvaluacionEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoEvaluacionEmpleado() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoEvaluacionEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();	
				
				

				if(sTitle.equals("Evaluacion Empleados")) {
					if(!EvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoEvaluacionEmpleado();

						this.cargarParteTabPanelRelacionadaEvaluacionEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoEvaluacionEmpleado();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEvaluacionEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.cargarSessionConBeanSwingJInternalFrameEvaluacionEmpleado(false,true,iIndex);
		this.jButtonEvaluacionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEvaluacionEmpleado();

		//this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.updateUI();
		//this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("EvaluacionEmpleado")) {
				int row=this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
				jButtonEvaluacionEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Evaluacion Empleado")) {

					if(this.isTienePermisosEvaluacionEmpleado && this.tipoevaluacionempleadoConstantesFunciones.mostrarEvaluacionEmpleadoTipoEvaluacionEmpleado && !TipoEvaluacionEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Evaluacion Empleados"+"("+EvaluacionEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Evaluacion Empleados");

						if(tipoevaluacionempleadoConstantesFunciones.resaltarEvaluacionEmpleadoTipoEvaluacionEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoevaluacionempleadoConstantesFunciones.resaltarEvaluacionEmpleadoTipoEvaluacionEmpleado);
						}

						jmenuItem.setEnabled(this.tipoevaluacionempleadoConstantesFunciones.activarEvaluacionEmpleadoTipoEvaluacionEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EvaluacionEmpleado"));

						

						this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jmenuDetalleTipoEvaluacionEmpleado.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoEvaluacionEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoEvaluacionEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoEvaluacionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoEvaluacionEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoEvaluacionEmpleado();
		
		this.cargarCombosFrameForeignKeyTipoEvaluacionEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoEvaluacionEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoEvaluacionEmpleado();
		}
	}
	
	
	
	public void jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
			
			if(jTableDatosTipoEvaluacionEmpleado.getRowCount()>=1) {
				jTableDatosTipoEvaluacionEmpleado.removeRowSelectionInterval(0, jTableDatosTipoEvaluacionEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoEvaluacionEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoEvaluacionEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoEvaluacionEmpleado(true);			
			//this.tipoevaluacionempleado=new TipoEvaluacionEmpleado();
			//this.tipoevaluacionempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado() ;
			
			if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEvaluacionEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoevaluacionempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);				
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
			if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoEvaluacionEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoEvaluacionEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoEvaluacionEmpleado.getSelectedRows().length;			
			}
			
			tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoEvaluacionEmpleado--;			
				//TipoEvaluacionEmpleado tipoevaluacionempleadoAux= new TipoEvaluacionEmpleado();			
				//tipoevaluacionempleadoAux.setId(this.iIdNuevoTipoEvaluacionEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoEvaluacionEmpleado tipoevaluacionempleadoOrigen=new TipoEvaluacionEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoOrigen : tipoevaluacionempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoevaluacionempleadoOrigen =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoevaluacionempleadoOrigen =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoEvaluacionEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoevaluacionempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoEvaluacionEmpleado(tipoevaluacionempleadoOrigen,this.tipoevaluacionempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().add(this.tipoevaluacionempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoevaluacionempleados.add(this.tipoevaluacionempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
				
				this.jTableDatosTipoEvaluacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoEvaluacionEmpleado(), this.getIndiceNuevoTipoEvaluacionEmpleado());
				
				int iLastRow =  this.jTableDatosTipoEvaluacionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEvaluacionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEvaluacionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();									
		
			TipoEvaluacionEmpleado tipoevaluacionempleadoOrigen=new TipoEvaluacionEmpleado();
			TipoEvaluacionEmpleado tipoevaluacionempleadoDestino=new TipoEvaluacionEmpleado();
				
			tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoEvaluacionEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoevaluacionempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoEvaluacionEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoevaluacionempleadoOrigen =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoevaluacionempleadoOrigen =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoevaluacionempleadoDestino =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoevaluacionempleadoDestino =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoevaluacionempleadoOrigen =tipoevaluacionempleadosSeleccionados.get(0);
				tipoevaluacionempleadoDestino =tipoevaluacionempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoEvaluacionEmpleado(tipoevaluacionempleadoOrigen,tipoevaluacionempleadoDestino,true,false);
				
				tipoevaluacionempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoevaluacionempleadoDestino,tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoevaluacionempleadoDestino,tipoevaluacionempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
				
				//this.jTableDatosTipoEvaluacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoEvaluacionEmpleado(), this.getIndiceNuevoTipoEvaluacionEmpleado());
				
				int iLastRow =  this.jTableDatosTipoEvaluacionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEvaluacionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEvaluacionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoEvaluacionEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionTipoEvaluacionEmpleado.setVisible(!isVisible);
			this.jPanelAccionesTipoEvaluacionEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoEvaluacionEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoEvaluacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoEvaluacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoEvaluacionEmpleado();
			
			this.abrirFrameOrderByTipoEvaluacionEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoEvaluacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoEvaluacionEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEvaluacionEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setSize(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jContentPaneDetalleTipoEvaluacionEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jContentPaneDetalleTipoEvaluacionEmpleado.getWidth(),TipoEvaluacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jContentPaneDetalleTipoEvaluacionEmpleado.getWidth(),TipoEvaluacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jContentPaneDetalleTipoEvaluacionEmpleado.getWidth(),TipoEvaluacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEvaluacionEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoEvaluacionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoEvaluacionEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoEvaluacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEvaluacionEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByTipoEvaluacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEvaluacionEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoEvaluacionEmpleado);
				this.jInternalFrameOrderByTipoEvaluacionEmpleado.setVisible(false);
				this.jInternalFrameOrderByTipoEvaluacionEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEvaluacionEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByTipoEvaluacionEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoEvaluacionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoEvaluacionEmpleado==null) {
				
				this.jInternalFrameImportacionTipoEvaluacionEmpleado=new ImportacionJInternalFrame(TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEvaluacionEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoEvaluacionEmpleado);
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.setVisible(false);
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.setSelected(false);


				this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEvaluacionEmpleado"));
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEvaluacionEmpleado"));
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEvaluacionEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoEvaluacionEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado==null) {
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado=new ReporteDinamicoJInternalFrame(TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado);
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEvaluacionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEvaluacionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEvaluacionEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEvaluacionEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEvaluacionEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jContentPaneDetalleTipoEvaluacionEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoEvaluacionEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEvaluacionEmpleado);
			
	       	this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.dispose();
			//this.jInternalFrameDetalleFormTipoEvaluacionEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoEvaluacionEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoEvaluacionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoEvaluacionEmpleado.setVisible(true);
	        this.jInternalFrameImportacionTipoEvaluacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoEvaluacionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setVisible(true);
	        this.jInternalFrameOrderByTipoEvaluacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoEvaluacionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoEvaluacionEmpleado.setVisible(false);
	        this.jInternalFrameOrderByTipoEvaluacionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoEvaluacionEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoEvaluacionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoEvaluacionEmpleado.setVisible(false);
	        this.jInternalFrameImportacionTipoEvaluacionEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoEvaluacionEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoEvaluacionEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoEvaluacionEmpleado(true);
			//this.isEsNuevoTipoEvaluacionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(false) ;
			
			if(tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.getEsGuardarRelacionado() && EvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEvaluacionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEvaluacionEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoEvaluacionEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoEvaluacionEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoEvaluacionEmpleado(true);
			//this.isEsNuevoTipoEvaluacionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoevaluacionempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(false) ;
			
			if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEvaluacionEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoEvaluacionEmpleado(false);
			
			//if(!this.isEsNuevoTipoEvaluacionEmpleado) {								
				int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
				
			}
			
			if(this.permiteMantenimiento(this.tipoevaluacionempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoEvaluacionEmpleado=true;
					this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
					this.isEsNuevoTipoEvaluacionEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoEvaluacionEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoEvaluacionEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado(false);
				
				this.habilitarDeshabilitarControlesTipoEvaluacionEmpleado(false);
			
												
				
				if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoEvaluacionEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,tipoevaluacionempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoEvaluacionEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoevaluacionempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoevaluacionempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.tipoevaluacionempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.tipoevaluacionempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoevaluacionempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoEvaluacionEmpleadoModel) this.jTableDatosTipoEvaluacionEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoEvaluacionEmpleado=true;
				this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
				this.isEsNuevoTipoEvaluacionEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado(false);
				
				this.habilitarDeshabilitarControlesTipoEvaluacionEmpleado(false);
				
				
				
				if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoEvaluacionEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoEvaluacionEmpleado.getRowCount()>=1) {
				jTableDatosTipoEvaluacionEmpleado.removeRowSelectionInterval(0, jTableDatosTipoEvaluacionEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoEvaluacionEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado(false) ;
			
			this.isEsNuevoTipoEvaluacionEmpleado=false;
			
			if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoEvaluacionEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
				
				//SI ES MANUAL
				if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoEvaluacionEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoEvaluacionEmpleado--;			
			//TipoEvaluacionEmpleado tipoevaluacionempleadoAux= new TipoEvaluacionEmpleado();			
			//tipoevaluacionempleadoAux.setId(this.iIdNuevoTipoEvaluacionEmpleado);
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoEvaluacionEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
			
			this.tipoevaluacionempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().add(this.tipoevaluacionempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoevaluacionempleados.add(this.tipoevaluacionempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
			
			this.jTableDatosTipoEvaluacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoEvaluacionEmpleado(), this.getIndiceNuevoTipoEvaluacionEmpleado());
			
			int iLastRow =  this.jTableDatosTipoEvaluacionEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoEvaluacionEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoEvaluacionEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEvaluacionEmpleado();
			}
			
			//this.abrirFrameTreeTipoEvaluacionEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Evaluacion EmpleadoS ?", "MANTENIMIENTO DE Tipo Evaluacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoEvaluacionEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoEvaluacionEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoevaluacionempleadoReturnGeneral=tipoevaluacionempleadoLogic.procesarImportacionTipoEvaluacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoevaluacionempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoEvaluacionEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoEvaluacionEmpleado.setFileImportacion(this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoEvaluacionEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoEvaluacionEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		

		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoEvaluacionEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoEvaluacionEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoEvaluacionEmpleados("Todos",tipoevaluacionempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoevaluacionempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoEvaluacionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoEvaluacionEmpleado tipoevaluacionempleado:tipoevaluacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoevaluacionempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoEvaluacionEmpleado tipoevaluacionempleado:tipoevaluacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoevaluacionempleado.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoEvaluacionEmpleado tipoevaluacionempleado:tipoevaluacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoevaluacionempleado.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoEvaluacionEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoEvaluacionEmpleado(tipoevaluacionempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEvaluacionEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEvaluacionEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEvaluacionEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoEvaluacionEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoEvaluacionEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoEvaluacionEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoEvaluacionEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoEvaluacionEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoEvaluacionEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoEvaluacionEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoEvaluacionEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoEvaluacionEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoEvaluacionEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoEvaluacionEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoEvaluacionEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEvaluacionEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoEvaluacionEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoEvaluacionEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado();
		
		this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEvaluacionEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEvaluacionEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEvaluacionEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEvaluacionEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jCheckBoxPostAccionNuevoTipoEvaluacionEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jCheckBoxPostAccionSinCerrarTipoEvaluacionEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jCheckBoxPostAccionSinMensajeTipoEvaluacionEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoEvaluacionEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jCheckBoxPostAccionNuevoTipoEvaluacionEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jCheckBoxPostAccionSinCerrarTipoEvaluacionEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jCheckBoxPostAccionSinMensajeTipoEvaluacionEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoEvaluacionEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoEvaluacionEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEvaluacionEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoEvaluacionEmpleado() throws Exception {
		try	{
			if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEvaluacionEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEvaluacionEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEvaluacionEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoEvaluacionEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoEvaluacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoEvaluacionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoEvaluacionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.addItem(reporte);
			}
			
			
			if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoEvaluacionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEvaluacionEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEvaluacionEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoEvaluacionEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoEvaluacionEmpleado(Boolean esInicializar) throws Exception {				
		if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEvaluacionEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoEvaluacionEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoEvaluacionEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoEvaluacionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoEvaluacionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoEvaluacionEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEvaluacionEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoEvaluacionEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoEvaluacionEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoEvaluacionEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoevaluacionempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoEvaluacionEmpleado.setModel(new TipoEvaluacionEmpleadoModel(this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoEvaluacionEmpleado.setModel(new TipoEvaluacionEmpleadoModel(this.tipoevaluacionempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoEvaluacionEmpleado!=null && this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoEvaluacionEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEvaluacionEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoEvaluacionEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,tipoevaluacionempleadoConstantesFunciones.resaltarSeleccionarTipoEvaluacionEmpleado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoEvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,tipoevaluacionempleadoConstantesFunciones.resaltarSeleccionarTipoEvaluacionEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEvaluacionEmpleado,TipoEvaluacionEmpleadoConstantesFunciones.LABEL_ID));

		if(this.tipoevaluacionempleadoConstantesFunciones.mostraridTipoEvaluacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEvaluacionEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoevaluacionempleadoConstantesFunciones.resaltaridTipoEvaluacionEmpleado,this.tipoevaluacionempleadoConstantesFunciones.activaridTipoEvaluacionEmpleado,this,true,"idTipoEvaluacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoevaluacionempleadoConstantesFunciones.resaltaridTipoEvaluacionEmpleado,this.tipoevaluacionempleadoConstantesFunciones.activaridTipoEvaluacionEmpleado,this,true,"idTipoEvaluacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEvaluacionEmpleado,TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoevaluacionempleadoConstantesFunciones.mostrarid_empresaTipoEvaluacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoevaluacionempleadoConstantesFunciones.resaltarid_empresaTipoEvaluacionEmpleado,this,this.tipoevaluacionempleadoConstantesFunciones.activarid_empresaTipoEvaluacionEmpleado));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoevaluacionempleadoConstantesFunciones.resaltarid_empresaTipoEvaluacionEmpleado,this,this.tipoevaluacionempleadoConstantesFunciones.activarid_empresaTipoEvaluacionEmpleado,false,"id_empresaTipoEvaluacionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEvaluacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEvaluacionEmpleado,TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoevaluacionempleadoConstantesFunciones.mostrarcodigoTipoEvaluacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoevaluacionempleadoConstantesFunciones.resaltarcodigoTipoEvaluacionEmpleado,this.tipoevaluacionempleadoConstantesFunciones.activarcodigoTipoEvaluacionEmpleado,this,true,"codigoTipoEvaluacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoevaluacionempleadoConstantesFunciones.resaltarcodigoTipoEvaluacionEmpleado,this.tipoevaluacionempleadoConstantesFunciones.activarcodigoTipoEvaluacionEmpleado,this,true,"codigoTipoEvaluacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEvaluacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEvaluacionEmpleado,TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoevaluacionempleadoConstantesFunciones.mostrarnombreTipoEvaluacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoevaluacionempleadoConstantesFunciones.resaltarnombreTipoEvaluacionEmpleado,this.tipoevaluacionempleadoConstantesFunciones.activarnombreTipoEvaluacionEmpleado,this,true,"nombreTipoEvaluacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoevaluacionempleadoConstantesFunciones.resaltarnombreTipoEvaluacionEmpleado,this.tipoevaluacionempleadoConstantesFunciones.activarnombreTipoEvaluacionEmpleado,this,true,"nombreTipoEvaluacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEvaluacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEvaluacionEmpleado && this.tipoevaluacionempleadoConstantesFunciones.mostrarEvaluacionEmpleadoTipoEvaluacionEmpleado && !TipoEvaluacionEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Evaluacion Empleados");
				tableColumn.setHeaderValue("Evaluacion Empleados");
				tableColumn.setCellRenderer(new EvaluacionEmpleadoTableCell(tipoevaluacionempleadoConstantesFunciones.resaltarEvaluacionEmpleadoTipoEvaluacionEmpleado,this,this.tipoevaluacionempleadoConstantesFunciones.activarEvaluacionEmpleadoTipoEvaluacionEmpleado));
				tableColumn.setCellEditor(new EvaluacionEmpleadoTableCell(tipoevaluacionempleadoConstantesFunciones.resaltarEvaluacionEmpleadoTipoEvaluacionEmpleado,this,this.tipoevaluacionempleadoConstantesFunciones.activarEvaluacionEmpleadoTipoEvaluacionEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoEvaluacionEmpleado.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEvaluacionEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEvaluacionEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoEvaluacionEmpleado.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoEvaluacionEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosTipoEvaluacionEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoEvaluacionEmpleado.moveColumn(this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoEvaluacionEmpleado.moveColumn(this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoEvaluacionEmpleado.moveColumn(this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoEvaluacionEmpleado.moveColumn(this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoEvaluacionEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoEvaluacionEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoEvaluacionEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoEvaluacionEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoEvaluacionEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoEvaluacionEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoevaluacionempleados.size()-1;
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
		//this.jTableDatosTipoEvaluacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoEvaluacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoEvaluacionEmpleado();
			
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
				
				//this.isEsNuevoTipoEvaluacionEmpleado=false;
					
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
				if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEvaluacionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoevaluacionempleado.getsType().equals("DUPLICADO")
				   || this.tipoevaluacionempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoEvaluacionEmpleado=true;
				
				} else {
					this.isEsNuevoTipoEvaluacionEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoevaluacionempleado.getId()>=0 && !this.tipoevaluacionempleado.getIsNew()) {						
						this.isEsNuevoTipoEvaluacionEmpleado=false;
						
					} else {
						this.isEsNuevoTipoEvaluacionEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoEvaluacionEmpleado(esRelaciones);						
				
				this.seleccionarTipoEvaluacionEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoevaluacionempleado.getId()<0) {
					this.isEsNuevoTipoEvaluacionEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoEvaluacionEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoEvaluacionEmpleado(evt,rowIndex);
				}	
				
				if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoEvaluacionEmpleado: " + this.dDif); 
					}
				}								
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoEvaluacionEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoevaluacionempleado)) {
					if(this.tipoevaluacionempleado.getId()>0) {
						this.tipoevaluacionempleado.setIsDeleted(true);
						
						this.tipoevaluacionempleadosEliminados.add(this.tipoevaluacionempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().remove(this.tipoevaluacionempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoevaluacionempleados.remove(this.tipoevaluacionempleado);				
					}
					
					
					((TipoEvaluacionEmpleadoModel) this.jTableDatosTipoEvaluacionEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoEvaluacionEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoEvaluacionEmpleado) {
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEvaluacionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoevaluacionempleadoConstantesFunciones.cargarid_empresaTipoEvaluacionEmpleado || this.tipoevaluacionempleadoConstantesFunciones.event_dependid_empresaTipoEvaluacionEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoevaluacionempleado.getid_empresa());
									//this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoevaluacionempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoevaluacionempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoevaluacionempleado.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoEvaluacionEmpleado(tipoevaluacionempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoEvaluacionEmpleado(tipoevaluacionempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoEvaluacionEmpleado(tipoevaluacionempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoEvaluacionEmpleado(tipoevaluacionempleado);
	}
	
	public void setVariablesObjetoActualToFormularioTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.setText(tipoevaluacionempleado.getId().toString());
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextFieldcodigoTipoEvaluacionEmpleado.setText(tipoevaluacionempleado.getcodigo());
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextAreanombreTipoEvaluacionEmpleado.setText(tipoevaluacionempleado.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoEvaluacionEmpleado tipoevaluacionempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoevaluacionempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoEvaluacionEmpleado tipoevaluacionempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoevaluacionempleadoLocal=this.tipoevaluacionempleado;
			} else {
				tipoevaluacionempleadoLocal=this.tipoevaluacionempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoevaluacionempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoEvaluacionEmpleado(tipoevaluacionempleadoLocal,true);
					
					if(tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoevaluacionempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoevaluacionempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(tipoevaluacionempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(tipoevaluacionempleado);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(tipoevaluacionempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.getText()==null || this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.getText()=="" || this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.setText("0");
			}

			if(conColumnasBase) {tipoevaluacionempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEvaluacionEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelIdTipoEvaluacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoevaluacionempleado.setcodigo(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextFieldcodigoTipoEvaluacionEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelcodigoTipoEvaluacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoevaluacionempleado.setnombre(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextAreanombreTipoEvaluacionEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelnombreTipoEvaluacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleadoBean,TipoEvaluacionEmpleado tipoevaluacionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleadoOrigen,TipoEvaluacionEmpleado tipoevaluacionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoevaluacionempleadoOrigen.getId()!=null && !tipoevaluacionempleadoOrigen.getId().equals(0L))) {tipoevaluacionempleado.setId(tipoevaluacionempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoevaluacionempleadoOrigen.getcodigo()!=null && !tipoevaluacionempleadoOrigen.getcodigo().equals(""))) {tipoevaluacionempleado.setcodigo(tipoevaluacionempleadoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoevaluacionempleadoOrigen.getnombre()!=null && !tipoevaluacionempleadoOrigen.getnombre().equals(""))) {tipoevaluacionempleado.setnombre(tipoevaluacionempleadoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.setText(tipoevaluacionempleado.getId().toString());
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextFieldcodigoTipoEvaluacionEmpleado.setText(tipoevaluacionempleado.getcodigo());
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextAreanombreTipoEvaluacionEmpleado.setText(tipoevaluacionempleado.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEvaluacionEmpleado(TipoEvaluacionEmpleadoBean tipoevaluacionempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.setText(tipoevaluacionempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextFieldcodigoTipoEvaluacionEmpleado.setText(tipoevaluacionempleadoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextAreanombreTipoEvaluacionEmpleado.setText(tipoevaluacionempleadoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoEvaluacionEmpleado(TipoEvaluacionEmpleadoParameterReturnGeneral tipoevaluacionempleadoReturnGeneral,TipoEvaluacionEmpleadoBean tipoevaluacionempleadoBean,Boolean conDefault) throws Exception { 
		try {
			TipoEvaluacionEmpleado tipoevaluacionempleadoLocal=new TipoEvaluacionEmpleado();
			
			tipoevaluacionempleadoLocal=tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoevaluacionempleadoLocal.getId()!=null && !tipoevaluacionempleadoLocal.getId().equals(0L))) {tipoevaluacionempleadoBean.setId(tipoevaluacionempleadoLocal.getId());}}
			if(conDefault || (!conDefault && tipoevaluacionempleadoLocal.getcodigo()!=null && !tipoevaluacionempleadoLocal.getcodigo().equals(""))) {tipoevaluacionempleadoBean.setcodigo(tipoevaluacionempleadoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoevaluacionempleadoLocal.getnombre()!=null && !tipoevaluacionempleadoLocal.getnombre().equals(""))) {tipoevaluacionempleadoBean.setnombre(tipoevaluacionempleadoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoEvaluacionEmpleadoGenerico(Long idTipoEvaluacionEmpleadoSeleccionado,JComboBox jComboBoxTipoEvaluacionEmpleado,List<TipoEvaluacionEmpleado> tipoevaluacionempleadosLocal)throws Exception {
		try {
			TipoEvaluacionEmpleado  tipoevaluacionempleadoTemp=null;

			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosLocal) {
				if(tipoevaluacionempleadoAux.getId()!=null && tipoevaluacionempleadoAux.getId().equals(idTipoEvaluacionEmpleadoSeleccionado)) {
					tipoevaluacionempleadoTemp=tipoevaluacionempleadoAux;
					break;
				}
			}

			jComboBoxTipoEvaluacionEmpleado.setSelectedItem(tipoevaluacionempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoEvaluacionEmpleadoGenerico(JComboBox jComboBoxTipoEvaluacionEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEvaluacionEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoEvaluacionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEvaluacionEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoEvaluacionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("EvaluacionEmpleado")) {
			jButtonEvaluacionEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoevaluacionempleado=(TipoEvaluacionEmpleado) tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoevaluacionempleado =(TipoEvaluacionEmpleado) tipoevaluacionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoevaluacionempleado.getIsNew() && !tipoevaluacionempleado.getIsChanged() && !tipoevaluacionempleado.getIsDeleted()) {
				sDescripcion=tipoevaluacionempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoevaluacionempleado.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoEvaluacionEmpleado tipoevaluacionempleadoRow=new TipoEvaluacionEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoevaluacionempleadoRow=(TipoEvaluacionEmpleado) tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoevaluacionempleadoRow=(TipoEvaluacionEmpleado) tipoevaluacionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEvaluacionEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoEvaluacionEmpleado tipoevaluacionempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoevaluacionempleado = (TipoEvaluacionEmpleado)this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoevaluacionempleado = (TipoEvaluacionEmpleado)this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoevaluacionempleado!=null) {
						this.tipoevaluacionempleado = tipoevaluacionempleado;
					} else {
						this.tipoevaluacionempleado = new TipoEvaluacionEmpleado();
					}
				}

				if(this.isTienePermisosEvaluacionEmpleado && this.permiteMantenimiento(this.tipoevaluacionempleado)) {
					EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFramePopup=new EvaluacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						evaluacionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFramePopup;
					} else {
						evaluacionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame;
					}

					List<TipoEvaluacionEmpleado> tipoevaluacionempleados=new ArrayList<TipoEvaluacionEmpleado>();
					tipoevaluacionempleados.add(this.tipoevaluacionempleado);
					if(!esRelacionado) {
						//evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.setConGuardarRelaciones(false);
						//evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					evaluacionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.cargarEvaluacionEmpleadoBeanSwingJInternalFrame(tipoevaluacionempleados,this.tipoevaluacionempleado,evaluacionempleadoBeanSwingJInternalFrame,/*conInicializar,*/evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.getConGuardarRelaciones(),evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
					evaluacionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						evaluacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionEmpleado("no_relacionado");

						evaluacionempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EvaluacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EvaluacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						evaluacionempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoEvaluacionEmpleado=(TitledBorder)this.jScrollPanelDatosTipoEvaluacionEmpleado.getBorder();
						TitledBorder titledBorderEvaluacionEmpleado=(TitledBorder)evaluacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionEmpleado.getBorder();

						titledBorderEvaluacionEmpleado.setTitle(titledBorderTipoEvaluacionEmpleado.getTitle() + " -> Evaluacion Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,evaluacionempleadoBeanSwingJInternalFrame);
						}

						evaluacionempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(evaluacionempleadoBeanSwingJInternalFrame);

						evaluacionempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Evaluacion Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado));			
			this.jButtonDuplicarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado && this.isPermisoDuplicarTipoEvaluacionEmpleado));			
			this.jButtonCopiarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoEvaluacionEmpleado && this.isPermisoCopiarTipoEvaluacionEmpleado));
			this.jButtonVerFormTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoEvaluacionEmpleado && this.isPermisoVerFormTipoEvaluacionEmpleado));
			
			this.jButtonAbrirOrderByTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado && this.isPermisoOrdenTipoEvaluacionEmpleado));			
			
			this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado));			
			this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado && this.isPermisoActualizarTipoEvaluacionEmpleado));	
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado && this.isPermisoActualizarTipoEvaluacionEmpleado));	
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado && this.isPermisoEliminarTipoEvaluacionEmpleado));
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarTipoEvaluacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado);							
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado));						
			this.jButtonDuplicarToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado && this.isPermisoDuplicarTipoEvaluacionEmpleado));						
			this.jButtonCopiarToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoEvaluacionEmpleado && this.isPermisoCopiarTipoEvaluacionEmpleado));			
			this.jButtonVerFormToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoEvaluacionEmpleado && this.isPermisoVerFormTipoEvaluacionEmpleado));			
			this.jButtonAbrirOrderByToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado && this.isPermisoOrdenTipoEvaluacionEmpleado));
			this.jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));			
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado && this.isPermisoActualizarTipoEvaluacionEmpleado));	
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado  && this.isPermisoActualizarTipoEvaluacionEmpleado));	
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado && this.isPermisoEliminarTipoEvaluacionEmpleado));
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarToolBarTipoEvaluacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado);				
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado));			
			this.jMenuItemDuplicarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado && this.isPermisoDuplicarTipoEvaluacionEmpleado));			
			this.jMenuItemCopiarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoEvaluacionEmpleado && this.isPermisoCopiarTipoEvaluacionEmpleado));			
			this.jMenuItemVerFormTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoEvaluacionEmpleado && this.isPermisoVerFormTipoEvaluacionEmpleado));			
			this.jMenuItemAbrirOrderByTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado && this.isPermisoOrdenTipoEvaluacionEmpleado));			
			//this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado && this.isPermisoOrdenTipoEvaluacionEmpleado));
			this.jMenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado && this.isPermisoOrdenTipoEvaluacionEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado && this.isPermisoOrdenTipoEvaluacionEmpleado));			
			this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado));			
			this.jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado && this.isPermisoNuevoTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));									
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemModificarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado && this.isPermisoActualizarTipoEvaluacionEmpleado));	
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemActualizarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado && this.isPermisoActualizarTipoEvaluacionEmpleado));	
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemEliminarTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado && this.isPermisoEliminarTipoEvaluacionEmpleado));
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemCancelarTipoEvaluacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));						
			this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=this.jButtonNuevoTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado=this.jButtonDuplicarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarTipoEvaluacionEmpleado=this.jButtonCopiarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormTipoEvaluacionEmpleado=this.jButtonVerFormTipoEvaluacionEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoEvaluacionEmpleado=this.jButtonAbrirOrderByTipoEvaluacionEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=this.jButtonModificarTipoEvaluacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosTipoEvaluacionEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=this.jButtonNuevoToolBarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=this.jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarToolBarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarToolBarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarToolBarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarToolBarTipoEvaluacionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=this.jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=this.jButtonGuardarCambiosTablaToolBarTipoEvaluacionEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=this.jMenuItemNuevoTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemModificarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemActualizarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemEliminarTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemCancelarTipoEvaluacionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoEvaluacionEmpleado(Boolean esInicializar) {
		if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEvaluacionEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoEvaluacionEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoEvaluacionEmpleado() {
		this.jButtonNuevoTipoEvaluacionEmpleado.setVisible(this.isPermisoNuevoTipoEvaluacionEmpleado);			
		this.jButtonDuplicarTipoEvaluacionEmpleado.setVisible(this.isPermisoDuplicarTipoEvaluacionEmpleado);			
		this.jButtonCopiarTipoEvaluacionEmpleado.setVisible(this.isPermisoCopiarTipoEvaluacionEmpleado);			
		this.jButtonVerFormTipoEvaluacionEmpleado.setVisible(this.isPermisoVerFormTipoEvaluacionEmpleado);			
		
		this.jButtonAbrirOrderByTipoEvaluacionEmpleado.setVisible(this.isPermisoOrdenTipoEvaluacionEmpleado);					
		
		this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.setVisible(this.isPermisoNuevoTipoEvaluacionEmpleado);			
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarTipoEvaluacionEmpleado.setVisible(this.isPermisoActualizarTipoEvaluacionEmpleado);	
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarTipoEvaluacionEmpleado.setVisible(this.isPermisoActualizarTipoEvaluacionEmpleado);	
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarTipoEvaluacionEmpleado.setVisible(this.isPermisoEliminarTipoEvaluacionEmpleado);
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarTipoEvaluacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado);						
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosTipoEvaluacionEmpleado.setVisible(this.isPermisoGuardarCambiosTipoEvaluacionEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.setVisible(this.isPermisoActualizarTipoEvaluacionEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEvaluacionEmpleado() {
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarTipoEvaluacionEmpleado.setVisible(this.isPermisoActualizarTipoEvaluacionEmpleado);	
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarTipoEvaluacionEmpleado.setVisible(this.isPermisoActualizarTipoEvaluacionEmpleado);	
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarTipoEvaluacionEmpleado.setVisible(this.isPermisoEliminarTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarTipoEvaluacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado);							
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosTipoEvaluacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado && this.isPermisoGuardarCambiosTipoEvaluacionEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoEvaluacionEmpleado() {
		if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoEvaluacionEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoEvaluacionEmpleado() {
	}
	
	public void jTableDatosTipoEvaluacionEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoEvaluacionEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoEvaluacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.gettipoevaluacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoevaluacionempleado==null) {
						this.tipoevaluacionempleado = new TipoEvaluacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
				}

				if(this.tipoevaluacionempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoevaluacionempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoEvaluacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoEvaluacionEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoEvaluacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoEvaluacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.gettipoevaluacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoevaluacionempleadoLogic.getConnexion());

				if(this.tipoevaluacionempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoevaluacionempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoEvaluacionEmpleado=(TitledBorder)this.jScrollPanelDatosTipoEvaluacionEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoEvaluacionEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoEvaluacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.gettipoevaluacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoevaluacionempleado==null) {
						this.tipoevaluacionempleado = new TipoEvaluacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
				}

				if(this.tipoevaluacionempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoevaluacionempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoEvaluacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.gettipoevaluacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoevaluacionempleado==null) {
						this.tipoevaluacionempleado = new TipoEvaluacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
				}

				if(this.tipoevaluacionempleado.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoevaluacionempleado.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoEvaluacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.gettipoevaluacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoevaluacionempleado==null) {
						this.tipoevaluacionempleado = new TipoEvaluacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);
				}

				if(this.tipoevaluacionempleado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoevaluacionempleado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoEvaluacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);

			this.getTipoEvaluacionEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);

			//if(TipoEvaluacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoevaluacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoEvaluacionEmpleado() {
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
		

		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.dispose();
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
			this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.dispose();
			this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionTipoEvaluacionEmpleado!=null) {
			this.jInternalFrameImportacionTipoEvaluacionEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionTipoEvaluacionEmpleado.dispose();
			this.jInternalFrameImportacionTipoEvaluacionEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoEvaluacionEmpleado();
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoEvaluacionEmpleado")) {
				jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoEvaluacionEmpleado")) {
				jButtonDuplicarTipoEvaluacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoEvaluacionEmpleado")) {
				jButtonCopiarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoEvaluacionEmpleado")) {
				jButtonVerFormTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoEvaluacionEmpleado")) {
				jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoEvaluacionEmpleado")) {
				jButtonDuplicarTipoEvaluacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoEvaluacionEmpleado")) {
				jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoEvaluacionEmpleado")) {
				jButtonDuplicarTipoEvaluacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoEvaluacionEmpleado")) {
				jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoEvaluacionEmpleado")) {
				jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoEvaluacionEmpleado")) {
				jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoEvaluacionEmpleado")) {
				jButtonModificarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoEvaluacionEmpleado")) {
				jButtonModificarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoEvaluacionEmpleado")) {
				jButtonModificarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoEvaluacionEmpleado")) {
				jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoEvaluacionEmpleado")) {
				jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoEvaluacionEmpleado")) {
				jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoEvaluacionEmpleado")) {
				jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoEvaluacionEmpleado")) {
				jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoEvaluacionEmpleado")) {
				jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoEvaluacionEmpleado")) {
				jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoEvaluacionEmpleado")) {
				jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoEvaluacionEmpleado")) {
				jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoEvaluacionEmpleado")) {
				jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoEvaluacionEmpleado")) {
				jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoEvaluacionEmpleado")) {
				jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoEvaluacionEmpleado")) {
				jButtonMostrarOcultarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoEvaluacionEmpleado")) {
				jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoEvaluacionEmpleado")) {
				jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoEvaluacionEmpleado")) {
				jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoEvaluacionEmpleado")) {
				jButtonCopiarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoEvaluacionEmpleado")) {
				jButtonVerFormTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoEvaluacionEmpleado")) {
				jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoEvaluacionEmpleado")) {
				jButtonCopiarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoEvaluacionEmpleado")) {
				jButtonVerFormTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoEvaluacionEmpleado")) {
				jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoEvaluacionEmpleado")) {
				jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoEvaluacionEmpleado")) {
				jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoEvaluacionEmpleado")) {
				jButtonRecargarInformacionTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoEvaluacionEmpleado")) {
				jButtonRecargarInformacionTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoEvaluacionEmpleado")) {
				jButtonRecargarInformacionTipoEvaluacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoEvaluacionEmpleado")) {
				jButtonAnterioresTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoEvaluacionEmpleado")) {
				jButtonAnterioresTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoEvaluacionEmpleado")) {
				jButtonAnterioresTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoEvaluacionEmpleado")) {
				jButtonSiguientesTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoEvaluacionEmpleado")) {
				jButtonSiguientesTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoEvaluacionEmpleado")) {
				jButtonSiguientesTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoEvaluacionEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado")) {
				jButtonAbrirOrderByTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoEvaluacionEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoEvaluacionEmpleado")) {
				jButtonMostrarOcultarTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEvaluacionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoEvaluacionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoEvaluacionEmpleado")) {
				jButtonCerrarReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoEvaluacionEmpleado")) {
				jButtonGenerarReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoEvaluacionEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoEvaluacionEmpleado")) {
				jButtonCerrarImportacionTipoEvaluacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoEvaluacionEmpleado")) {
				
				jButtonGenerarImportacionTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoEvaluacionEmpleado")) {
				
				jButtonAbrirImportacionTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoEvaluacionEmpleado")) {
				jComboBoxTiposAccionesTipoEvaluacionEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoEvaluacionEmpleado")) {
				jComboBoxTiposRelacionesTipoEvaluacionEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoEvaluacionEmpleado")) {
				jComboBoxTiposAccionesTipoEvaluacionEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoEvaluacionEmpleado")) {
				
				jComboBoxTiposSeleccionarTipoEvaluacionEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoEvaluacionEmpleado")) {
				jTextFieldValorCampoGeneralTipoEvaluacionEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoEvaluacionEmpleado")) {
				jButtonAbrirOrderByTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoEvaluacionEmpleado")) {
				jButtonAbrirOrderByTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoEvaluacionEmpleado")) {
				jButtonCerrarOrderByTipoEvaluacionEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEvaluacionEmpleadoBusqueda")) {
				this.jButtonidTipoEvaluacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoEvaluacionEmpleadoUpdate")) {
				this.jButtonid_empresaTipoEvaluacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoEvaluacionEmpleadoBusqueda")) {
				this.jButtonid_empresaTipoEvaluacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEvaluacionEmpleadoBusqueda")) {
				this.jButtoncodigoTipoEvaluacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEvaluacionEmpleadoBusqueda")) {
				this.jButtonnombreTipoEvaluacionEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoEvaluacionEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				


				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoEvaluacionEmpleado tipoevaluacionempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoevaluacionempleadoLocal=this.tipoevaluacionempleado;
			} else {
				tipoevaluacionempleadoLocal=this.tipoevaluacionempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
							
				
				


				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
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
			
			


			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
								
						
				


				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
								
				
				


				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
							
				
				


				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
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
			
			


			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
								
				
				


				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoEvaluacionEmpleado")) {
					jCheckBoxSeleccionarTodosTipoEvaluacionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoEvaluacionEmpleado")) {
					jCheckBoxSeleccionadosTipoEvaluacionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoEvaluacionEmpleado")) {
					
				}
				
				


				
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
												
				
				


				
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
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
			
			


			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoevaluacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoevaluacionempleado);
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
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
				
				


				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEvaluacionEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEvaluacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEvaluacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoevaluacionempleadoAnterior =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoEvaluacionEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoEvaluacionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoEvaluacionEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoevaluacionempleado =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoevaluacionempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoEvaluacionEmpleado")) {
				
				}
				
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoEvaluacionEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoEvaluacionEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoEvaluacionEmpleado")) {
			
			}
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoEvaluacionEmpleado();
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoEvaluacionEmpleado")) {
				jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoEvaluacionEmpleado")) {
				jButtonDuplicarTipoEvaluacionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoEvaluacionEmpleado")) {
				jButtonCopiarTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoEvaluacionEmpleado")) {
				jButtonVerFormTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoEvaluacionEmpleado")) {
				jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoEvaluacionEmpleado")) {
				jButtonModificarTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoEvaluacionEmpleado")) {
				jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoEvaluacionEmpleado")) {
				jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoEvaluacionEmpleado")) {
				jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoEvaluacionEmpleado")) {
				jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoEvaluacionEmpleado")) {
				jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoEvaluacionEmpleado")) {
				jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEvaluacionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoEvaluacionEmpleado")) {
				jButtonAbrirOrderByTipoEvaluacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoEvaluacionEmpleado")) {
				jButtonRecargarInformacionTipoEvaluacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoEvaluacionEmpleado")) {
				jButtonAnterioresTipoEvaluacionEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoEvaluacionEmpleado")) {
				jButtonSiguientesTipoEvaluacionEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEvaluacionEmpleadoBusqueda")) {
				this.jButtonidTipoEvaluacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoEvaluacionEmpleadoUpdate")) {
				this.jButtonid_empresaTipoEvaluacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoEvaluacionEmpleadoBusqueda")) {
				this.jButtonid_empresaTipoEvaluacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoEvaluacionEmpleadoBusqueda")) {
				this.jButtoncodigoTipoEvaluacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEvaluacionEmpleadoBusqueda")) {
				this.jButtonnombreTipoEvaluacionEmpleadoBusquedaActionPerformed(evt);
			}
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoEvaluacionEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoEvaluacionEmpleado")) {
				closingInternalFrameTipoEvaluacionEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarTipoEvaluacionEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoEvaluacionEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            TipoEvaluacionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(TipoEvaluacionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEvaluacionEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(null);
			}
			
			TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoevaluacionempleado,new Object(),this.tipoevaluacionempleadoParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoEvaluacionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoEvaluacionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoEvaluacionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoevaluacionempleado)) {
			if(!esControlTabla) {
				if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);			
				}
				
				if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoevaluacionempleadoReturnGeneral=tipoevaluacionempleadoLogic.procesarEventosTipoEvaluacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados(),this.tipoevaluacionempleado,this.tipoevaluacionempleadoParameterGeneral,this.isEsNuevoTipoEvaluacionEmpleado,classes);//this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral,this.tipoevaluacionempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoEvaluacionEmpleado(classes,this.tipoevaluacionempleadoReturnGeneral,this.tipoevaluacionempleadoBean,false);
					}
						
					if(this.tipoevaluacionempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado());	
					}
						
					if(this.tipoevaluacionempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado(),classes);//this.tipoevaluacionempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoEvaluacionEmpleado(this.tipoevaluacionempleado,classes);//this.tipoevaluacionempleadoBean);									
				}
			
				if(TipoEvaluacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoEvaluacionEmpleado(this.tipoevaluacionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEvaluacionEmpleado(this.tipoevaluacionempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoevaluacionempleadoAnterior!=null) {
						this.tipoevaluacionempleado=this.tipoevaluacionempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoevaluacionempleadoReturnGeneral=tipoevaluacionempleadoLogic.procesarEventosTipoEvaluacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados(),this.tipoevaluacionempleado,this.tipoevaluacionempleadoParameterGeneral,this.isEsNuevoTipoEvaluacionEmpleado,classes);//this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoevaluacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado(),tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado(),this.tipoevaluacionempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoEvaluacionEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoEvaluacionEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoEvaluacionEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoEvaluacionEmpleado() throws Exception {
		
		TipoEvaluacionEmpleadoModel tipoevaluacionempleadoModel=(TipoEvaluacionEmpleadoModel)this.jTableDatosTipoEvaluacionEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoevaluacionempleadoModel.tipoevaluacionempleados=this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoevaluacionempleadoModel.tipoevaluacionempleados=this.tipoevaluacionempleados;
		}
		
		
		((TipoEvaluacionEmpleadoModel) this.jTableDatosTipoEvaluacionEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoEvaluacionEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoevaluacionempleadoAnterior(),this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoevaluacionempleadoAnterior(),this.tipoevaluacionempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoEvaluacionEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EvaluacionEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.setEvaluacionEmpleados(tipoevaluacionempleado.getEvaluacionEmpleados());
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
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
										
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoevaluacionempleado,new Object(),generalEntityParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoEvaluacionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoEvaluacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoEvaluacionEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoEvaluacionEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoEvaluacionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoevaluacionempleado,new Object(),generalEntityParameterGeneral,this.tipoevaluacionempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoEvaluacionEmpleado(TipoEvaluacionEmpleadoBean tipoevaluacionempleadoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EvaluacionEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.setEvaluacionEmpleados(tipoevaluacionempleado.getEvaluacionEmpleados());
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoEvaluacionEmpleado(ArrayList<Classe> classes,TipoEvaluacionEmpleadoReturnGeneral tipoevaluacionempleadoReturnGeneral,TipoEvaluacionEmpleadoBean tipoevaluacionempleadoBean,Boolean conDefault) throws Exception {
		
			this.tipoevaluacionempleadoBean.setEvaluacionEmpleados(tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado().getEvaluacionEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(EvaluacionEmpleado.class)) {
					tipoevaluacionempleado.setEvaluacionEmpleados(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoLogic.getEvaluacionEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoevaluacionempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado = new TipoEvaluacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.tipoevaluacionempleadoSessionBean.getConGuardarRelaciones(),this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.tipoevaluacionempleadoLogic=this.tipoevaluacionempleadoLogic;
		
		this.cargarCombosFrameForeignKeyTipoEvaluacionEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEvaluacionEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEvaluacionEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoEvaluacionEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoEvaluacionEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEvaluacionEmpleado"));
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarTipoEvaluacionEmpleado"));

		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarToolBarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEvaluacionEmpleado"));
					
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemModificarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEvaluacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarTipoEvaluacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarToolBarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEvaluacionEmpleado"));
						
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemActualizarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEvaluacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarTipoEvaluacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEvaluacionEmpleado"));
								
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemEliminarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEvaluacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarTipoEvaluacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEvaluacionEmpleado"));
					
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemCancelarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEvaluacionEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemDetalleCerrarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEvaluacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEvaluacionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEvaluacionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEvaluacionEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonidTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEvaluacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEvaluacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEvaluacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEvaluacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonnombreTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEvaluacionEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEvaluacionEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoEvaluacionEmpleado"));
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEvaluacionEmpleado"));
		}
		
		this.jTableDatosTipoEvaluacionEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoEvaluacionEmpleado"));
		
		this.jTableDatosTipoEvaluacionEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoEvaluacionEmpleado"));
		
		this.jButtonNuevoTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoTipoEvaluacionEmpleado"));
		
		this.jButtonDuplicarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarTipoEvaluacionEmpleado"));
		
		this.jButtonCopiarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"CopiarTipoEvaluacionEmpleado"));
		
		this.jButtonVerFormTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"VerFormTipoEvaluacionEmpleado"));
		
		
		this.jButtonNuevoToolBarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoEvaluacionEmpleado"));
			
		this.jButtonDuplicarToolBarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoEvaluacionEmpleado"));
			
		this.jMenuItemNuevoTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoEvaluacionEmpleado"));
			
		this.jMenuItemDuplicarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoEvaluacionEmpleado"));		
		
		
		this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoEvaluacionEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoEvaluacionEmpleado"));
			
		this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoEvaluacionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarTipoEvaluacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonModificarToolBarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEvaluacionEmpleado"));
			
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemModificarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEvaluacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarTipoEvaluacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonActualizarToolBarTipoEvaluacionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEvaluacionEmpleado"));
				
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemActualizarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEvaluacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarTipoEvaluacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonEliminarToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEvaluacionEmpleado"));
						
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemEliminarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEvaluacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarTipoEvaluacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonCancelarToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEvaluacionEmpleado"));
			
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemCancelarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEvaluacionEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoEvaluacionEmpleado"));		
		
		
		this.jButtonCerrarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarTipoEvaluacionEmpleado"));
		
		
		this.jButtonCerrarToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoEvaluacionEmpleado"));
			
		this.jMenuItemCerrarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoEvaluacionEmpleado"));
			
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jMenuItemDetalleCerrarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEvaluacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoEvaluacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEvaluacionEmpleado"));
		}
		
		this.jButtonCopiarToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoEvaluacionEmpleado"));
			
		this.jButtonVerFormToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoEvaluacionEmpleado"));
		
		this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoEvaluacionEmpleado"));
			
		this.jMenuItemCopiarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoEvaluacionEmpleado"));		
		
		this.jMenuItemVerFormTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoEvaluacionEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEvaluacionEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoEvaluacionEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEvaluacionEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoEvaluacionEmpleado"));
					
		this.jButtonRecargarInformacionToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoEvaluacionEmpleado"));
		
		this.jMenuItemRecargarInformacionTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoEvaluacionEmpleado"));		
		
		
		
		this.jButtonAnterioresTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresTipoEvaluacionEmpleado"));
		
		
		this.jButtonAnterioresToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoEvaluacionEmpleado"));
		
		this.jMenuItemAnterioresTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoEvaluacionEmpleado"));		
		
		
		this.jButtonSiguientesTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesTipoEvaluacionEmpleado"));
		
		
		this.jButtonSiguientesToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoEvaluacionEmpleado"));
			
		this.jMenuItemSiguientesTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoEvaluacionEmpleado"));
			
		this.jMenuItemAbrirOrderByTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoEvaluacionEmpleado"));
			
		this.jMenuItemMostrarOcultarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoEvaluacionEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoEvaluacionEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoEvaluacionEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoEvaluacionEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoEvaluacionEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoEvaluacionEmpleado"));

		this.jCheckBoxSeleccionadosTipoEvaluacionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoEvaluacionEmpleado"));
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEvaluacionEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoEvaluacionEmpleado"));
			
		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoEvaluacionEmpleado"));
					
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoEvaluacionEmpleado"));
			
		this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoEvaluacionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonidTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEvaluacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEvaluacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEvaluacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEvaluacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonnombreTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEvaluacionEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEvaluacionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEvaluacionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoEvaluacionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEvaluacionEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEvaluacionEmpleado"));				
			//this.jButtonGenerarReporteDinamicoTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEvaluacionEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEvaluacionEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoEvaluacionEmpleado!=null) {
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEvaluacionEmpleado"));
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEvaluacionEmpleado"));
				this.jInternalFrameImportacionTipoEvaluacionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEvaluacionEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoEvaluacionEmpleado"));
			
			this.jButtonAbrirOrderByToolBarTipoEvaluacionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoEvaluacionEmpleado"));			
			
			if(this.jInternalFrameOrderByTipoEvaluacionEmpleado!=null) {
				this.jInternalFrameOrderByTipoEvaluacionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEvaluacionEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTabbedPaneRelacionesTipoEvaluacionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEvaluacionEmpleado"));
		
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
            		closingInternalFrameTipoEvaluacionEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoEvaluacionEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            TipoEvaluacionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(TipoEvaluacionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEvaluacionEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoEvaluacionEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoEvaluacionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoEvaluacionEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoEvaluacionEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoEvaluacionEmpleado";
		inputMap = this.jButtonNuevoTipoEvaluacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoEvaluacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEvaluacionEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoEvaluacionEmpleado";
		inputMap = this.jButtonModificarTipoEvaluacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoEvaluacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoEvaluacionEmpleado";
		inputMap = this.jButtonActualizarTipoEvaluacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoEvaluacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoEvaluacionEmpleado";
		inputMap = this.jButtonEliminarTipoEvaluacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoEvaluacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoEvaluacionEmpleado";
		inputMap = this.jButtonCancelarTipoEvaluacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoEvaluacionEmpleado";
		inputMap = this.jButtonCerrarTipoEvaluacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoEvaluacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoEvaluacionEmpleado";
		inputMap = this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosTipoEvaluacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonGuardarCambiosTipoEvaluacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoEvaluacionEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoEvaluacionEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoEvaluacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoEvaluacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoEvaluacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonidTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEvaluacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonid_empresaTipoEvaluacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoEvaluacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonid_empresaTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoEvaluacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtoncodigoTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoEvaluacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jButtonnombreTipoEvaluacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEvaluacionEmpleadoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoEvaluacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoEvaluacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoEvaluacionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoEvaluacionEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoEvaluacionEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
					tipoevaluacionempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleados) {
					tipoevaluacionempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoEvaluacionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
						tipoevaluacionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleados) {
						tipoevaluacionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEvaluacionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEvaluacionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEvaluacionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoEvaluacionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoEvaluacionEmpleado.getSelectedRows();
			
			TipoEvaluacionEmpleado tipoevaluacionempleadoLocal=new TipoEvaluacionEmpleado();
			
			//this.seleccionarTodosTipoEvaluacionEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoevaluacionempleadoLocal =(TipoEvaluacionEmpleado) this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados().toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoevaluacionempleadoLocal =(TipoEvaluacionEmpleado) this.tipoevaluacionempleados.toArray()[this.jTableDatosTipoEvaluacionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoevaluacionempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
						tipoevaluacionempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleados) {
						tipoevaluacionempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEvaluacionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEvaluacionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEvaluacionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoEvaluacionEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoEvaluacionEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoEvaluacionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoEvaluacionEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
				
						if(sTipoSeleccionar.equals(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoevaluacionempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoevaluacionempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleados) {
					
						if(sTipoSeleccionar.equals(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoevaluacionempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoevaluacionempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoEvaluacionEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoEvaluacionEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoEvaluacionEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoEvaluacionEmpleado(conSplash);
				
					this.generarReporteTipoEvaluacionEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoEvaluacionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEvaluacionEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEvaluacionEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEvaluacionEmpleado();
				
				this.exportarTipoEvaluacionEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoEvaluacionEmpleados();
				//this.importarTipoEvaluacionEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEvaluacionEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoEvaluacionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Evaluacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoEvaluacionEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoEvaluacionEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoEvaluacionEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoEvaluacionEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoEvaluacionEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoEvaluacionEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralTipoEvaluacionEmpleado();
						
						this.generarReporteProcesoAccionTipoEvaluacionEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Evaluacion EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Evaluacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoEvaluacionEmpleado();
				
						this.actualizarParametrosGeneralTipoEvaluacionEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoevaluacionempleadoReturnGeneral=tipoevaluacionempleadoLogic.procesarAccionTipoEvaluacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados(),this.tipoevaluacionempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoEvaluacionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoEvaluacionEmpleado();
					
					TipoEvaluacionEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoEvaluacionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoEvaluacionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxTiposAccionesFormularioTipoEvaluacionEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoEvaluacionEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoEvaluacionEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoEvaluacionEmpleado();
			
			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		
			TipoEvaluacionEmpleado tipoevaluacionempleado=new TipoEvaluacionEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoEvaluacionEmpleado.getSelectedItem();
			
			
			
			
			tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoevaluacionempleadosSeleccionados.size()==1) {
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosSeleccionados) {
					tipoevaluacionempleado=tipoevaluacionempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Evaluacion Empleado")) {
					jButtonEvaluacionEmpleadoActionPerformed(null,rowIndex,true,false,tipoevaluacionempleado);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoEvaluacionEmpleado();
			
      		//this.finishProcessTipoEvaluacionEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoEvaluacionEmpleadoReturnGeneral() throws Exception {
		if(this.tipoevaluacionempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoevaluacionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoevaluacionempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoevaluacionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoevaluacionempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoevaluacionempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
		}
		
		if(this.tipoevaluacionempleadoReturnGeneral.getConRetornoLista() || this.tipoevaluacionempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoevaluacionempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoevaluacionempleadoLogic.setTipoEvaluacionEmpleados(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoevaluacionempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoevaluacionempleadoLogic.setTipoEvaluacionEmpleado(this.tipoevaluacionempleadoReturnGeneral.getTipoEvaluacionEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoEvaluacionEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoEvaluacionEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<TipoEvaluacionEmpleado> getTipoEvaluacionEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoEvaluacionEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados()) {
					if(tipoevaluacionempleadoAux.getIsSelected()) {
						tipoevaluacionempleadosSeleccionados.add(tipoevaluacionempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:this.tipoevaluacionempleados) {
					if(tipoevaluacionempleadoAux.getIsSelected()) {
						tipoevaluacionempleadosSeleccionados.add(tipoevaluacionempleadoAux);				
					}
				}
			}
			
			if(tipoevaluacionempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoevaluacionempleadosSeleccionados.addAll(this.tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoevaluacionempleadosSeleccionados.addAll(this.tipoevaluacionempleados);				
					}
				}
			}
		} else {
			tipoevaluacionempleadosSeleccionados.add(this.tipoevaluacionempleado);
		}
		
		return tipoevaluacionempleadosSeleccionados;
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
	
	public void generarReporteTipoEvaluacionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoEvaluacionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoEvaluacionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEvaluacionEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEvaluacionEmpleadosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoEvaluacionEmpleadosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Evaluacion Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoEvaluacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoEvaluacionEmpleados("Todos",tipoevaluacionempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoEvaluacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoEvaluacionEmpleados("Todos",tipoevaluacionempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoEvaluacionEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoEvaluacionEmpleados("Todos",tipoevaluacionempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoEvaluacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoEvaluacionEmpleado();
		
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoEvaluacionEmpleado();
		
		
		//this.generarReporteTipoEvaluacionEmpleados("Todos",tipoevaluacionempleadosSeleccionados ,tipoevaluacionempleadoImplementable,tipoevaluacionempleadoImplementableHome);
	}
	
	public void mostrarImportacionTipoEvaluacionEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoEvaluacionEmpleado();
		
		this.abrirFrameImportacionTipoEvaluacionEmpleado();		
		
			
		//this.generarReporteTipoEvaluacionEmpleados("Todos",tipoevaluacionempleadosSeleccionados ,tipoevaluacionempleadoImplementable,tipoevaluacionempleadoImplementableHome);
	}
	
	public void importarTipoEvaluacionEmpleados() throws Exception {		
	
	}
	
	public void exportarTipoEvaluacionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoEvaluacionEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoEvaluacionEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoEvaluacionEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Evaluacion Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoEvaluacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoevaluacionempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoEvaluacionEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoEvaluacionEmpleado(tipoevaluacionempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoevaluacionempleadoAux.setsDetalleGeneralEntityReporte(tipoevaluacionempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoEvaluacionEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoEvaluacionEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEvaluacionEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoevaluacionempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoevaluacionempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoevaluacionempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoevaluacionempleado.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoevaluacionempleado.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoEvaluacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoevaluacionempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoEvaluacionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoEvaluacionEmpleado(row);				
				iRow++;
			}				
			
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoEvaluacionEmpleado(tipoevaluacionempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoEvaluacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();		
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoevaluacionempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoevaluacionempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoevaluacionempleado");
			//elementRoot.appendChild(element);
		
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosSeleccionados) {
				element = document.createElement("tipoevaluacionempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoEvaluacionEmpleado(tipoevaluacionempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Evaluacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoEvaluacionEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoevaluacionempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoevaluacionempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoevaluacionempleado.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoevaluacionempleado.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoEvaluacionEmpleado(TipoEvaluacionEmpleado tipoevaluacionempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoEvaluacionEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoevaluacionempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoEvaluacionEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoevaluacionempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoEvaluacionEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoevaluacionempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoEvaluacionEmpleadoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoevaluacionempleado.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoEvaluacionEmpleadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoevaluacionempleado.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoEvaluacionEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados=new ArrayList<TipoEvaluacionEmpleado>();
		
		tipoevaluacionempleadosSeleccionados=this.getTipoEvaluacionEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoEvaluacionEmpleado(tipoevaluacionempleadosSeleccionados);
		
		this.generarReporteTipoEvaluacionEmpleados("Todos",tipoevaluacionempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoEvaluacionEmpleado(ArrayList<TipoEvaluacionEmpleado> tipoevaluacionempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosSeleccionados) {
				tipoevaluacionempleadoAux.setsDetalleGeneralEntityReporte(tipoevaluacionempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoevaluacionempleadoAux.setsDescripcionGeneralEntityReporte1(tipoevaluacionempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoevaluacionempleadoAux.setsDescripcionGeneralEntityReporte1(tipoevaluacionempleadoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoEvaluacionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoevaluacionempleadoAux.setsDescripcionGeneralEntityReporte1(tipoevaluacionempleadoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoEvaluacionEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoEvaluacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEvaluacionEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoEvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=true;
		} else {
			this.actualizarEstadoPanelsTipoEvaluacionEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoEvaluacionEmpleado=false;
			//this.isVisibilidadCeldaVerFormTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaDuplicarTipoEvaluacionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoevaluacionempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;												
			}
			
			this.jButtonCerrarTipoEvaluacionEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEvaluacionEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoevaluacionempleado)) {
			this.isVisibilidadCeldaActualizarTipoEvaluacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoEvaluacionEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEvaluacionEmpleado() {
		this.isVisibilidadCeldaNuevoTipoEvaluacionEmpleado=false;
		this.isVisibilidadCeldaGuardarCambiosTipoEvaluacionEmpleado=false;
	}
	
	public void actualizarEstadoPanelsTipoEvaluacionEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosTipoEvaluacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEvaluacionEmpleado!=null) {
				this.jPanelPaginacionTipoEvaluacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosTipoEvaluacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEvaluacionEmpleado!=null) {
				this.jPanelPaginacionTipoEvaluacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosTipoEvaluacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEvaluacionEmpleado!=null) {
				this.jPanelPaginacionTipoEvaluacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosTipoEvaluacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEvaluacionEmpleado!=null) {
				this.jPanelPaginacionTipoEvaluacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosTipoEvaluacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEvaluacionEmpleado!=null) {
				this.jPanelPaginacionTipoEvaluacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosTipoEvaluacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEvaluacionEmpleado!=null) {
				this.jPanelPaginacionTipoEvaluacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoEvaluacionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEvaluacionEmpleado!=null) {
				this.jScrollPanelDatosTipoEvaluacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEvaluacionEmpleado!=null) {
				this.jPanelPaginacionTipoEvaluacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
					this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoevaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoEvaluacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoEvaluacionEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoEvaluacionEmpleadoParaEvaluacionEmpleados() throws Exception {
		Boolean isPaginaPopupEvaluacionEmpleado=false;

		try {

			if(this.tipoevaluacionempleadoSessionBean==null) {
				this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean=new EvaluacionEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean.setsPathNavegacionActual(tipoevaluacionempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEvaluacionEmpleado=this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado(true);
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionEmpleado(TipoEvaluacionEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado(true);
			this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.evaluacionempleadoSessionBean.setlidTipoEvaluacionEmpleadoActual(this.idTipoEvaluacionEmpleadoActual);

			tipoevaluacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoEvaluacionEmpleado(true);
			tipoevaluacionempleadoSessionBean.setlIdTipoEvaluacionEmpleadoActualForeignKey(this.idTipoEvaluacionEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
		
		if(this.tipoevaluacionempleadoSessionBean==null) {
			this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
		}
		
		this.tipoevaluacionempleadoSessionBean.setsUltimaBusquedaTipoEvaluacionEmpleado(this.getsAccionBusqueda());
		this.tipoevaluacionempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoevaluacionempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoevaluacionempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
		
		if(this.tipoevaluacionempleadoSessionBean==null) {
			this.tipoevaluacionempleadoSessionBean=new TipoEvaluacionEmpleadoSessionBean();
		}
		
		if(this.tipoevaluacionempleadoSessionBean.getsUltimaBusquedaTipoEvaluacionEmpleado()!=null&&!this.tipoevaluacionempleadoSessionBean.getsUltimaBusquedaTipoEvaluacionEmpleado().equals("")) {
			this.setsAccionBusqueda(tipoevaluacionempleadoSessionBean.getsUltimaBusquedaTipoEvaluacionEmpleado());
			this.setiNumeroPaginacion(tipoevaluacionempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoevaluacionempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoevaluacionempleadoSessionBean.getid_empresa());
				tipoevaluacionempleadoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoevaluacionempleadoSessionBean.setsUltimaBusquedaTipoEvaluacionEmpleado("");
		this.tipoevaluacionempleadoSessionBean.setiNumeroPaginacion(TipoEvaluacionEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.tipoevaluacionempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoEvaluacionEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoEvaluacionEmpleado() {
		this.updateBorderResaltarBusquedasFormularioTipoEvaluacionEmpleado();
		this.updateVisibilidadBusquedasFormularioTipoEvaluacionEmpleado();
		this.updateHabilitarBusquedasFormularioTipoEvaluacionEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoEvaluacionEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoEvaluacionEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoEvaluacionEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoEvaluacionEmpleado.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoEvaluacionEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoEvaluacionEmpleado.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioTipoEvaluacionEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoEvaluacionEmpleado();
		this.updateVisibilidadResaltarControlesFormularioTipoEvaluacionEmpleado();
		this.updateHabilitarResaltarControlesFormularioTipoEvaluacionEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoEvaluacionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoevaluacionempleadoConstantesFunciones.resaltaridTipoEvaluacionEmpleado!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.setBorder(this.tipoevaluacionempleadoConstantesFunciones.resaltaridTipoEvaluacionEmpleado);}
		if(this.tipoevaluacionempleadoConstantesFunciones.resaltarid_empresaTipoEvaluacionEmpleado!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setBorder(this.tipoevaluacionempleadoConstantesFunciones.resaltarid_empresaTipoEvaluacionEmpleado);}
		if(this.tipoevaluacionempleadoConstantesFunciones.resaltarcodigoTipoEvaluacionEmpleado!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextFieldcodigoTipoEvaluacionEmpleado.setBorder(this.tipoevaluacionempleadoConstantesFunciones.resaltarcodigoTipoEvaluacionEmpleado);}
		if(this.tipoevaluacionempleadoConstantesFunciones.resaltarnombreTipoEvaluacionEmpleado!=null && this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextAreanombreTipoEvaluacionEmpleado.setBorder(this.tipoevaluacionempleadoConstantesFunciones.resaltarnombreTipoEvaluacionEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoEvaluacionEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.setVisible(this.tipoevaluacionempleadoConstantesFunciones.mostraridTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jPanelidTipoEvaluacionEmpleado.setVisible(this.tipoevaluacionempleadoConstantesFunciones.mostraridTipoEvaluacionEmpleado);
		//this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setVisible(this.tipoevaluacionempleadoConstantesFunciones.mostrarid_empresaTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jPanelid_empresaTipoEvaluacionEmpleado.setVisible(this.tipoevaluacionempleadoConstantesFunciones.mostrarid_empresaTipoEvaluacionEmpleado);
		//this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextFieldcodigoTipoEvaluacionEmpleado.setVisible(this.tipoevaluacionempleadoConstantesFunciones.mostrarcodigoTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jPanelcodigoTipoEvaluacionEmpleado.setVisible(this.tipoevaluacionempleadoConstantesFunciones.mostrarcodigoTipoEvaluacionEmpleado);
		//this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextAreanombreTipoEvaluacionEmpleado.setVisible(this.tipoevaluacionempleadoConstantesFunciones.mostrarnombreTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jPanelnombreTipoEvaluacionEmpleado.setVisible(this.tipoevaluacionempleadoConstantesFunciones.mostrarnombreTipoEvaluacionEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoEvaluacionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEvaluacionEmpleado!=null) {
	
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jLabelidTipoEvaluacionEmpleado.setEnabled(this.tipoevaluacionempleadoConstantesFunciones.activaridTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jComboBoxid_empresaTipoEvaluacionEmpleado.setEnabled(this.tipoevaluacionempleadoConstantesFunciones.activarid_empresaTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextFieldcodigoTipoEvaluacionEmpleado.setEnabled(this.tipoevaluacionempleadoConstantesFunciones.activarcodigoTipoEvaluacionEmpleado);
		this.jInternalFrameDetalleFormTipoEvaluacionEmpleado.jTextAreanombreTipoEvaluacionEmpleado.setEnabled(this.tipoevaluacionempleadoConstantesFunciones.activarnombreTipoEvaluacionEmpleado);
		}
	}
	
		
}