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

import com.bydan.erp.nomina.util.TipoCalificacionEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoCalificacionEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoCalificacionEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoCalificacionEmpleadoBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoCalificacionEmpleadoBeanSwingJInternalFrame extends TipoCalificacionEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCalificacionEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCalificacionEmpleado> tipocalificacionempleadoValidator = new ClassValidator<TipoCalificacionEmpleado>(TipoCalificacionEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCalificacionEmpleado tipocalificacionempleado;	
	public TipoCalificacionEmpleado tipocalificacionempleadoAux;
	public TipoCalificacionEmpleado tipocalificacionempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCalificacionEmpleado tipocalificacionempleadoTotales;
	public Long idTipoCalificacionEmpleadoActual;
	public Long iIdNuevoTipoCalificacionEmpleado=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCalificacionEmpleado=false;

	public Boolean getIsTienePermisosCalificacionEmpleado() {
		return isTienePermisosCalificacionEmpleado;
	}

	public void setIsTienePermisosCalificacionEmpleado(Boolean isTienePermisosCalificacionEmpleado) {
		this.isTienePermisosCalificacionEmpleado= isTienePermisosCalificacionEmpleado;
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
	
	public Boolean isPermisoTodoTipoCalificacionEmpleado;
	public Boolean isPermisoNuevoTipoCalificacionEmpleado;
	public Boolean isPermisoActualizarTipoCalificacionEmpleado;
	public Boolean isPermisoActualizarOriginalTipoCalificacionEmpleado;
	public Boolean isPermisoEliminarTipoCalificacionEmpleado;
	public Boolean isPermisoGuardarCambiosTipoCalificacionEmpleado;
	public Boolean isPermisoConsultaTipoCalificacionEmpleado;
	public Boolean isPermisoBusquedaTipoCalificacionEmpleado;
	public Boolean isPermisoReporteTipoCalificacionEmpleado;
	public Boolean isPermisoPaginacionMedioTipoCalificacionEmpleado;
	public Boolean isPermisoPaginacionAltoTipoCalificacionEmpleado;
	public Boolean isPermisoPaginacionTodoTipoCalificacionEmpleado;
	public Boolean isPermisoCopiarTipoCalificacionEmpleado;
	public Boolean isPermisoVerFormTipoCalificacionEmpleado;
	public Boolean isPermisoDuplicarTipoCalificacionEmpleado;
	public Boolean isPermisoOrdenTipoCalificacionEmpleado;
	
	
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
	
	public TipoCalificacionEmpleadoParameterReturnGeneral tipocalificacionempleadoReturnGeneral;
	public TipoCalificacionEmpleadoParameterReturnGeneral tipocalificacionempleadoParameterGeneral;
	
	

	public CalificacionEmpleadoLogic calificacionempleadoLogic=null;

	public CalificacionEmpleadoLogic getCalificacionEmpleadoLogic() {
		return calificacionempleadoLogic;
	}

	public void setCalificacionEmpleadoLogic(CalificacionEmpleadoLogic calificacionempleadoLogic) {
		this.calificacionempleadoLogic = calificacionempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCalificacionEmpleado=false;
	public Boolean esParaAccionDesdeFormularioTipoCalificacionEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCalificacionEmpleadoSessionBeanAdditional tipocalificacionempleadoSessionBeanAdditional=null;
	
	public TipoCalificacionEmpleadoSessionBeanAdditional getTipoCalificacionEmpleadoSessionBeanAdditional() {
		return this.tipocalificacionempleadoSessionBeanAdditional;
	}
	
	public void setTipoCalificacionEmpleadoSessionBeanAdditional(TipoCalificacionEmpleadoSessionBeanAdditional tipocalificacionempleadoSessionBeanAdditional) {
		try {
			this.tipocalificacionempleadoSessionBeanAdditional=tipocalificacionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional tipocalificacionempleadoBeanSwingJInternalFrameAdditional=null;
	//public class TipoCalificacionEmpleadoBeanSwingJInternalFrame
	
	public TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional getTipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.tipocalificacionempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional(TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional tipocalificacionempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocalificacionempleadoBeanSwingJInternalFrameAdditional=tipocalificacionempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCalificacionEmpleado tipocalificacionempleadoBean;
	public TipoCalificacionEmpleadoConstantesFunciones tipocalificacionempleadoConstantesFunciones;
	//public TipoCalificacionEmpleadoParameterReturnGeneral tipocalificacionempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCalificacionEmpleado> tipocalificacionempleados;	
	//public List<TipoCalificacionEmpleado> tipocalificacionempleadosEliminados;
	//public List<TipoCalificacionEmpleado> tipocalificacionempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCalificacionEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarTipoCalificacionEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormTipoCalificacionEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenTipoCalificacionEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaModificarTipoCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarTipoCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarTipoCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoCalificacionEmpleado() {
		return this.iIdNuevoTipoCalificacionEmpleado;
	}

	public void setiIdNuevoTipoCalificacionEmpleado(Long iIdNuevoTipoCalificacionEmpleado) {
		this.iIdNuevoTipoCalificacionEmpleado = iIdNuevoTipoCalificacionEmpleado;
	}
	
	public Long getidTipoCalificacionEmpleadoActual() {
		return this.idTipoCalificacionEmpleadoActual;
	}

	public void setidTipoCalificacionEmpleadoActual(Long idTipoCalificacionEmpleadoActual) {
		this.idTipoCalificacionEmpleadoActual = idTipoCalificacionEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCalificacionEmpleado gettipocalificacionempleado() {
		return this.tipocalificacionempleado;
	}

	public void settipocalificacionempleado(TipoCalificacionEmpleado tipocalificacionempleado) {
		this.tipocalificacionempleado = tipocalificacionempleado;
	}
	
	public TipoCalificacionEmpleado gettipocalificacionempleadoAux() {
		return this.tipocalificacionempleadoAux;
	}

	public void settipocalificacionempleadoAux(TipoCalificacionEmpleado tipocalificacionempleadoAux) {
		this.tipocalificacionempleadoAux = tipocalificacionempleadoAux;
	}				
	
	public TipoCalificacionEmpleado gettipocalificacionempleadoAnterior() {
		return this.tipocalificacionempleadoAnterior;
	}

	public void settipocalificacionempleadoAnterior(TipoCalificacionEmpleado tipocalificacionempleadoAnterior) {
		this.tipocalificacionempleadoAnterior = tipocalificacionempleadoAnterior;
	}	
	
	public TipoCalificacionEmpleado gettipocalificacionempleadoTotales() {
		return this.tipocalificacionempleadoTotales;
	}

	public void settipocalificacionempleadoTotales(TipoCalificacionEmpleado tipocalificacionempleadoTotales) {
		this.tipocalificacionempleadoTotales = tipocalificacionempleadoTotales;
	}	
	
	public TipoCalificacionEmpleado gettipocalificacionempleadoBean() {
		return this.tipocalificacionempleadoBean;
	}

	public void settipocalificacionempleadoBean(TipoCalificacionEmpleado tipocalificacionempleadoBean) {
		this.tipocalificacionempleadoBean = tipocalificacionempleadoBean;
	}	
	
	public TipoCalificacionEmpleadoParameterReturnGeneral gettipocalificacionempleadoReturnGeneral() {
		return this.tipocalificacionempleadoReturnGeneral;
	}

	public void settipocalificacionempleadoReturnGeneral(TipoCalificacionEmpleadoParameterReturnGeneral tipocalificacionempleadoReturnGeneral) {
		this.tipocalificacionempleadoReturnGeneral = tipocalificacionempleadoReturnGeneral;
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
	
	
	public TipoCalificacionEmpleadoLogic getTipoCalificacionEmpleadoLogic()	{		
		return tipocalificacionempleadoLogic;
	}

	public void setTipoCalificacionEmpleadoLogic(TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic) {
		this.tipocalificacionempleadoLogic = tipocalificacionempleadoLogic;
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
	
	public Boolean getIsEsNuevoTipoCalificacionEmpleado() {
		return isEsNuevoTipoCalificacionEmpleado;
	}

	public void setIsEsNuevoTipoCalificacionEmpleado(Boolean isEsNuevoTipoCalificacionEmpleado) {
		this.isEsNuevoTipoCalificacionEmpleado = isEsNuevoTipoCalificacionEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCalificacionEmpleado() {
		return esParaAccionDesdeFormularioTipoCalificacionEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCalificacionEmpleado(Boolean esParaAccionDesdeFormularioTipoCalificacionEmpleado) {
		this.esParaAccionDesdeFormularioTipoCalificacionEmpleado = esParaAccionDesdeFormularioTipoCalificacionEmpleado;
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

			if(this.tipocalificacionempleadoSessionBean==null) {
				this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
			}

			if(!this.tipocalificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocalificacionempleadoSessionBean.getlidEmpresaActual());
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

					if(this.tipocalificacionempleado!=null) {
						this.tipocalificacionempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCalificacionEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoCalificacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_empresaTipoCalificacionEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoCalificacionEmpleadoGenerico!=null && jComboBoxid_empresaTipoCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoCalificacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCalificacionEmpleado tipocalificacionempleado,JComboBox jComboBoxid_empresaTipoCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoCalificacionEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocalificacionempleado.setid_empresa(empresaAux.getId());
				tipocalificacionempleado.setempresa_descripcion(TipoCalificacionEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocalificacionempleado.setEmpresa(empresaAux);			}
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

					if(!TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { 
					}

					if(!TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoCalificacionEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCalificacionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCalificacionEmpleado(this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCalificacionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCalificacionEmpleado(this.tipocalificacionempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocalificacionempleadoLogic.setTipoCalificacionEmpleados(this.tipocalificacionempleados);
			tipocalificacionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCalificacionEmpleadoParameterReturnGeneral getTipoCalificacionEmpleadoParameterGeneral() {
		return this.tipocalificacionempleadoParameterGeneral;
	}
	
	public void setTipoCalificacionEmpleadoParameterGeneral(TipoCalificacionEmpleadoParameterReturnGeneral tipocalificacionempleadoParameterGeneral) {
		this.tipocalificacionempleadoParameterGeneral = tipocalificacionempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCalificacionEmpleado() {
		return isPermisoTodoTipoCalificacionEmpleado;
	}

	public void setIsPermisoTodoTipoCalificacionEmpleado(Boolean isPermisoTodoTipoCalificacionEmpleado) {
		this.isPermisoTodoTipoCalificacionEmpleado = isPermisoTodoTipoCalificacionEmpleado;
	}

	public Boolean getIsPermisoNuevoTipoCalificacionEmpleado() {
		return isPermisoNuevoTipoCalificacionEmpleado;
	}

	public void setIsPermisoNuevoTipoCalificacionEmpleado(Boolean isPermisoNuevoTipoCalificacionEmpleado) {
		this.isPermisoNuevoTipoCalificacionEmpleado = isPermisoNuevoTipoCalificacionEmpleado;
	}

	public Boolean getIsPermisoActualizarTipoCalificacionEmpleado() {
		return isPermisoActualizarTipoCalificacionEmpleado;
	}

	public void setIsPermisoActualizarTipoCalificacionEmpleado(Boolean isPermisoActualizarTipoCalificacionEmpleado) {
		this.isPermisoActualizarTipoCalificacionEmpleado = isPermisoActualizarTipoCalificacionEmpleado;
	}

	public Boolean getIsPermisoEliminarTipoCalificacionEmpleado() {
		return isPermisoEliminarTipoCalificacionEmpleado;
	}

	public void setIsPermisoEliminarTipoCalificacionEmpleado(Boolean isPermisoEliminarTipoCalificacionEmpleado) {
		this.isPermisoEliminarTipoCalificacionEmpleado = isPermisoEliminarTipoCalificacionEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCalificacionEmpleado() {
		return isPermisoGuardarCambiosTipoCalificacionEmpleado;
	}

	public void setIsPermisoGuardarCambiosTipoCalificacionEmpleado(Boolean isPermisoGuardarCambiosTipoCalificacionEmpleado) {
		this.isPermisoGuardarCambiosTipoCalificacionEmpleado = isPermisoGuardarCambiosTipoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoConsultaTipoCalificacionEmpleado() {
		return isPermisoConsultaTipoCalificacionEmpleado;
	}

	public void setIsPermisoConsultaTipoCalificacionEmpleado(Boolean isPermisoConsultaTipoCalificacionEmpleado) {
		this.isPermisoConsultaTipoCalificacionEmpleado = isPermisoConsultaTipoCalificacionEmpleado;
	}

	public Boolean getIsPermisoBusquedaTipoCalificacionEmpleado() {
		return isPermisoBusquedaTipoCalificacionEmpleado;
	}

	public void setIsPermisoBusquedaTipoCalificacionEmpleado(Boolean isPermisoBusquedaTipoCalificacionEmpleado) {
		this.isPermisoBusquedaTipoCalificacionEmpleado = isPermisoBusquedaTipoCalificacionEmpleado;
	}

	public Boolean getIsPermisoReporteTipoCalificacionEmpleado() {
		return isPermisoReporteTipoCalificacionEmpleado;
	}

	public void setIsPermisoReporteTipoCalificacionEmpleado(Boolean isPermisoReporteTipoCalificacionEmpleado) {
		this.isPermisoReporteTipoCalificacionEmpleado = isPermisoReporteTipoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCalificacionEmpleado() {
		return isPermisoPaginacionMedioTipoCalificacionEmpleado;
	}

	public void setIsPermisoPaginacionMedioTipoCalificacionEmpleado(Boolean isPermisoPaginacionMedioTipoCalificacionEmpleado) {
		this.isPermisoPaginacionMedioTipoCalificacionEmpleado = isPermisoPaginacionMedioTipoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCalificacionEmpleado() {
		return isPermisoPaginacionTodoTipoCalificacionEmpleado;
	}

	public void setIsPermisoPaginacionTodoTipoCalificacionEmpleado(Boolean isPermisoPaginacionTodoTipoCalificacionEmpleado) {
		this.isPermisoPaginacionTodoTipoCalificacionEmpleado = isPermisoPaginacionTodoTipoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCalificacionEmpleado() {
		return isPermisoPaginacionAltoTipoCalificacionEmpleado;
	}

	public void setIsPermisoPaginacionAltoTipoCalificacionEmpleado(Boolean isPermisoPaginacionAltoTipoCalificacionEmpleado) {
		this.isPermisoPaginacionAltoTipoCalificacionEmpleado = isPermisoPaginacionAltoTipoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoCopiarTipoCalificacionEmpleado() {
		return isPermisoCopiarTipoCalificacionEmpleado;
	}

	public void setIsPermisoCopiarTipoCalificacionEmpleado(Boolean isPermisoCopiarTipoCalificacionEmpleado) {
		this.isPermisoCopiarTipoCalificacionEmpleado = isPermisoCopiarTipoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoVerFormTipoCalificacionEmpleado() {
		return isPermisoVerFormTipoCalificacionEmpleado;
	}

	public void setIsPermisoVerFormTipoCalificacionEmpleado(Boolean isPermisoVerFormTipoCalificacionEmpleado) {
		this.isPermisoVerFormTipoCalificacionEmpleado = isPermisoVerFormTipoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarTipoCalificacionEmpleado() {
		return isPermisoDuplicarTipoCalificacionEmpleado;
	}

	public void setIsPermisoDuplicarTipoCalificacionEmpleado(Boolean isPermisoDuplicarTipoCalificacionEmpleado) {
		this.isPermisoDuplicarTipoCalificacionEmpleado = isPermisoDuplicarTipoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoOrdenTipoCalificacionEmpleado() {
		return isPermisoOrdenTipoCalificacionEmpleado;
	}

	public void setIsPermisoOrdenTipoCalificacionEmpleado(Boolean isPermisoOrdenTipoCalificacionEmpleado) {
		this.isPermisoOrdenTipoCalificacionEmpleado = isPermisoOrdenTipoCalificacionEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCalificacionEmpleado() {
		return isVisibilidadCeldaNuevoTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoTipoCalificacionEmpleado(Boolean isVisibilidadCeldaNuevoTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado = isVisibilidadCeldaNuevoTipoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCalificacionEmpleado() {
		return isVisibilidadCeldaDuplicarTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCalificacionEmpleado(Boolean isVisibilidadCeldaDuplicarTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaDuplicarTipoCalificacionEmpleado = isVisibilidadCeldaDuplicarTipoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCalificacionEmpleado() {
		return isVisibilidadCeldaCopiarTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarTipoCalificacionEmpleado(Boolean isVisibilidadCeldaCopiarTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaCopiarTipoCalificacionEmpleado = isVisibilidadCeldaCopiarTipoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCalificacionEmpleado() {
		return isVisibilidadCeldaVerFormTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormTipoCalificacionEmpleado(Boolean isVisibilidadCeldaVerFormTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaVerFormTipoCalificacionEmpleado = isVisibilidadCeldaVerFormTipoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCalificacionEmpleado() {
		return isVisibilidadCeldaOrdenTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenTipoCalificacionEmpleado(Boolean isVisibilidadCeldaOrdenTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado = isVisibilidadCeldaOrdenTipoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado = isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCalificacionEmpleado() {
		return isVisibilidadCeldaModificarTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaModificarTipoCalificacionEmpleado(Boolean isVisibilidadCeldaModificarTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaModificarTipoCalificacionEmpleado = isVisibilidadCeldaModificarTipoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCalificacionEmpleado() {
		return isVisibilidadCeldaActualizarTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarTipoCalificacionEmpleado(Boolean isVisibilidadCeldaActualizarTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado = isVisibilidadCeldaActualizarTipoCalificacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCalificacionEmpleado() {
		return isVisibilidadCeldaEliminarTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarTipoCalificacionEmpleado(Boolean isVisibilidadCeldaEliminarTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado = isVisibilidadCeldaEliminarTipoCalificacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCalificacionEmpleado() {
		return isVisibilidadCeldaCancelarTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarTipoCalificacionEmpleado(Boolean isVisibilidadCeldaCancelarTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado = isVisibilidadCeldaCancelarTipoCalificacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCalificacionEmpleado() {
		return isVisibilidadCeldaGuardarTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarTipoCalificacionEmpleado(Boolean isVisibilidadCeldaGuardarTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado = isVisibilidadCeldaGuardarTipoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado() {
		return isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado(Boolean isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado = isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado;
	}
		
	public TipoCalificacionEmpleadoSessionBean gettipocalificacionempleadoSessionBean() {
		return this.tipocalificacionempleadoSessionBean;
	}
	
	public void settipocalificacionempleadoSessionBean(TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean) {
		this.tipocalificacionempleadoSessionBean=tipocalificacionempleadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocalificacionempleado,null);
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
	
	public void bugActualizarReferenciaActual(TipoCalificacionEmpleado tipocalificacionempleado,TipoCalificacionEmpleado tipocalificacionempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCalificacionEmpleado(tipocalificacionempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocalificacionempleadoAux.setId(tipocalificacionempleado.getId());
		tipocalificacionempleadoAux.setVersionRow(tipocalificacionempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCalificacionEmpleado();
		
			int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocalificacionempleadoValidator.getInvalidValues(this.tipocalificacionempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocalificacionempleadoLogic.setDatosCliente(datosCliente);
			tipocalificacionempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocalificacionempleadoAux=new  TipoCalificacionEmpleado();
				
				tipocalificacionempleadoAux.setIsNew(true);
				tipocalificacionempleadoAux.setIsChanged(true);
				
				tipocalificacionempleadoAux.setTipoCalificacionEmpleadoOriginal(this.tipocalificacionempleado);
				
				tipocalificacionempleadoAux.setId(this.tipocalificacionempleado.getId());	
				tipocalificacionempleadoAux.setVersionRow(this.tipocalificacionempleado.getVersionRow());	
				tipocalificacionempleadoAux.setid_empresa(this.tipocalificacionempleado.getid_empresa());	
				tipocalificacionempleadoAux.setcodigo(this.tipocalificacionempleado.getcodigo());	
				tipocalificacionempleadoAux.setnombre(this.tipocalificacionempleado.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalificacionempleadoLogic.saveTipoCalificacionEmpleados();//WithConnection
						//tipocalificacionempleadoLogic.getSetVersionRowTipoCalificacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocalificacionempleado,tipocalificacionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesTipoCalificacionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocalificacionempleadoLogic.saveTipoCalificacionEmpleadoRelaciones(tipocalificacionempleadoAux,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//tipocalificacionempleadoLogic.getSetVersionRowTipoCalificacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocalificacionempleado,tipocalificacionempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocalificacionempleadoAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocalificacionempleado,tipocalificacionempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocalificacionempleadoAux=new  TipoCalificacionEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado() && this.tipocalificacionempleado.getId()>=0)) {
						
					tipocalificacionempleadoAux.setIsNew(false);
				}
				
				tipocalificacionempleadoAux.setIsDeleted(false);
			
				tipocalificacionempleadoAux.setId(this.tipocalificacionempleado.getId());	
				tipocalificacionempleadoAux.setVersionRow(this.tipocalificacionempleado.getVersionRow());	
				tipocalificacionempleadoAux.setid_empresa(this.tipocalificacionempleado.getid_empresa());	
				tipocalificacionempleadoAux.setcodigo(this.tipocalificacionempleado.getcodigo());	
				tipocalificacionempleadoAux.setnombre(this.tipocalificacionempleado.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalificacionempleadoLogic.saveTipoCalificacionEmpleados();//WithConnection
						//tipocalificacionempleadoLogic.getSetVersionRowTipoCalificacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocalificacionempleado,tipocalificacionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesTipoCalificacionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocalificacionempleadoLogic.saveTipoCalificacionEmpleadoRelaciones(tipocalificacionempleadoAux,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//tipocalificacionempleadoLogic.getSetVersionRowTipoCalificacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocalificacionempleado,tipocalificacionempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocalificacionempleadoAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocalificacionempleado,tipocalificacionempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocalificacionempleadoAux=new  TipoCalificacionEmpleado();
				
				tipocalificacionempleadoAux.setIsNew(false);
				tipocalificacionempleadoAux.setIsChanged(false);
				
				tipocalificacionempleadoAux.setIsDeleted(true);
				
				tipocalificacionempleadoAux.setId(this.tipocalificacionempleado.getId());	
				tipocalificacionempleadoAux.setVersionRow(this.tipocalificacionempleado.getVersionRow());	
				tipocalificacionempleadoAux.setid_empresa(this.tipocalificacionempleado.getid_empresa());	
				tipocalificacionempleadoAux.setcodigo(this.tipocalificacionempleado.getcodigo());	
				tipocalificacionempleadoAux.setnombre(this.tipocalificacionempleado.getnombre());	
				
				if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocalificacionempleadoAux.getId()>=0) {	
						this.tipocalificacionempleadosEliminados.add(tipocalificacionempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalificacionempleadoLogic.saveTipoCalificacionEmpleados();//WithConnection
						//tipocalificacionempleadoLogic.getSetVersionRowTipoCalificacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocalificacionempleadoLogic.saveTipoCalificacionEmpleadoRelaciones(tipocalificacionempleadoAux,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//tipocalificacionempleadoLogic.getSetVersionRowTipoCalificacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocalificacionempleadoAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocalificacionempleadoAux,tipocalificacionempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().addAll(this.tipocalificacionempleadosEliminados);
					
					tipocalificacionempleadoLogic.saveTipoCalificacionEmpleados();//WithConnection
					//tipocalificacionempleadoLogic.getSetVersionRowTipoCalificacionEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCalificacionEmpleado();
				
				this.tipocalificacionempleadosEliminados= new ArrayList<TipoCalificacionEmpleado>();		
			}
			
			if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Calificacion Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocalificacionempleado=tipocalificacionempleadoAux;
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
      		//this.finishProcessTipoCalificacionEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCalificacionEmpleado tipocalificacionempleadoLocal) throws Exception {
		
		if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocalificacionempleadoLocal.setCalificacionEmpleados(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
			
			} else {
			
				tipocalificacionempleadoLocal.setCalificacionEmpleados(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCalificacionEmpleado tipocalificacionempleadoLocal) throws Exception {	
		if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocalificacionempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCalificacionEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocalificacionempleadoValidator.getInvalidValues(this.tipocalificacionempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCalificacionEmpleado tipocalificacionempleado,List<TipoCalificacionEmpleado> tipocalificacionempleados) throws Exception {
		try	{		
			TipoCalificacionEmpleadoConstantesFunciones.actualizarLista(tipocalificacionempleado,tipocalificacionempleados,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCalificacionEmpleado tipocalificacionempleado,List<TipoCalificacionEmpleado> tipocalificacionempleados) throws Exception {
		try	{			
			TipoCalificacionEmpleadoConstantesFunciones.actualizarSelectedLista(tipocalificacionempleado,tipocalificacionempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCalificacionEmpleado> tipocalificacionempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocalificacionempleadosLocal=this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocalificacionempleadosLocal=this.tipocalificacionempleados;
			}
			//ARCHITECTURE
		
			for(TipoCalificacionEmpleado tipocalificacionempleadoLocal:tipocalificacionempleadosLocal) {
				if(this.permiteMantenimiento(tipocalificacionempleadoLocal) && tipocalificacionempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCalificacionEmpleadoConstantesFunciones.getTipoCalificacionEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCalificacionEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelid_empresaTipoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCalificacionEmpleadoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelcodigoTipoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCalificacionEmpleadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelnombreTipoCalificacionEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelid_empresaTipoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelcodigoTipoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelnombreTipoCalificacionEmpleado,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CalificacionEmpleado")) {
			if(this.tipocalificacionempleado==null) {
				this.tipocalificacionempleado= new TipoCalificacionEmpleado();
			}

			if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCalificacionEmpleado
				this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);

				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.getcalificacionempleado().setTipoCalificacionEmpleado(this.tipocalificacionempleado);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCalificacionEmpleado--;	
		
		
		this.tipocalificacionempleadoAux=new TipoCalificacionEmpleado();
		
		this.tipocalificacionempleadoAux.setId(this.iIdNuevoTipoCalificacionEmpleado);
		this.tipocalificacionempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().add(this.tipocalificacionempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocalificacionempleados.add(this.tipocalificacionempleadoAux);
		}
		//ARCHITECTURE
		
		this.tipocalificacionempleado=this.tipocalificacionempleadoAux;
		
		if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCalificacionEmpleado(this.tipocalificacionempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCalificacionEmpleado(this.tipocalificacionempleado);
		}
				
		//this.setDefaultControlesTipoCalificacionEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCalificacionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalificacionEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleadoBean,this.tipocalificacionempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
			classes=TipoCalificacionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoCalificacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocalificacionempleadoReturnGeneral=tipocalificacionempleadoLogic.procesarEventosTipoCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados(),this.tipocalificacionempleado,this.tipocalificacionempleadoParameterGeneral,this.isEsNuevoTipoCalificacionEmpleado,classes);//this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral,this.tipocalificacionempleadoBean,false);
		
		if(this.tipocalificacionempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado());
		}
		
		if(this.tipocalificacionempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado(),classes);//this.tipocalificacionempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCalificacionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCalificacionEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormTipoCalificacionEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
						
			if(tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado() && CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCalificacionEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalificacionEmpleado();
			}
			
			this.actualizarVisualTableDatosTipoCalificacionEmpleado();
			
			this.jTableDatosTipoCalificacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoCalificacionEmpleado(), this.getIndiceNuevoTipoCalificacionEmpleado());
			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCalificacionEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextFieldcodigoTipoCalificacionEmpleado.setEnabled(isHabilitar && this.tipocalificacionempleadoConstantesFunciones.activarcodigoTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextAreanombreTipoCalificacionEmpleado.setEnabled(isHabilitar && this.tipocalificacionempleadoConstantesFunciones.activarnombreTipoCalificacionEmpleado);	
		//
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setEnabled(isHabilitar && this.tipocalificacionempleadoConstantesFunciones.activarid_empresaTipoCalificacionEmpleado);
	};
	
	public void setDefaultControlesTipoCalificacionEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCalificacionEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocalificacionempleadoSessionBean.setConGuardarRelaciones(true);			
			this.tipocalificacionempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocalificacionempleadoSessionBean.setConGuardarRelaciones(false);			
			this.tipocalificacionempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCalificacionEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
				if(tipocalificacionempleadoAux.getId().equals(this.iIdNuevoTipoCalificacionEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleados) {
				if(tipocalificacionempleadoAux.getId().equals(this.iIdNuevoTipoCalificacionEmpleado)) {
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
	
	public int getIndiceActualTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
				if(tipocalificacionempleadoAux.getId().equals(tipocalificacionempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleados) {
				if(tipocalificacionempleadoAux.getId().equals(tipocalificacionempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
				if(tipocalificacionempleadoAux.getTipoCalificacionEmpleadoOriginal().getId().equals(tipocalificacionempleadoOriginal.getId())) {
					existe=true;
					tipocalificacionempleadoOriginal.setId(tipocalificacionempleadoAux.getId());
					tipocalificacionempleadoOriginal.setVersionRow(tipocalificacionempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleados) {
				if(tipocalificacionempleadoAux.getTipoCalificacionEmpleadoOriginal().getId().equals(tipocalificacionempleadoOriginal.getId())) {
					existe=true;
					tipocalificacionempleadoOriginal.setId(tipocalificacionempleadoAux.getId());
					tipocalificacionempleadoOriginal.setVersionRow(tipocalificacionempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCalificacionEmpleado(Boolean esParaCancelar) throws Exception {
		tipocalificacionempleadosAux=new ArrayList<TipoCalificacionEmpleado>();
		tipocalificacionempleadoAux=new TipoCalificacionEmpleado();
		
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
					if(tipocalificacionempleadoAux.getId()<0) {
						tipocalificacionempleadosAux.add(tipocalificacionempleadoAux);
					}		
				}
				this.iIdNuevoTipoCalificacionEmpleado=0L;
				this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().removeAll(tipocalificacionempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleados) {
					if(tipocalificacionempleadoAux.getId()<0) {
						tipocalificacionempleadosAux.add(tipocalificacionempleadoAux);
					}		
				}
				this.iIdNuevoTipoCalificacionEmpleado=0L;
				this.tipocalificacionempleados.removeAll(tipocalificacionempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCalificacionEmpleado 
					&& this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size()>0
					) {
					tipocalificacionempleadoAux=this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().get(this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size() - 1);
				
					if(tipocalificacionempleadoAux.getId()<0) {
						this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().remove(tipocalificacionempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCalificacionEmpleado && this.tipocalificacionempleados.size()>0) {
					tipocalificacionempleadoAux=this.tipocalificacionempleados.get(this.tipocalificacionempleados.size() - 1);
				
					if(tipocalificacionempleadoAux.getId()<0) {
						this.tipocalificacionempleados.remove(tipocalificacionempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCalificacionEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocalificacionempleado.getId()<0) {
				this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().remove(this.tipocalificacionempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocalificacionempleado.getId()<0) {
				this.tipocalificacionempleados.remove(this.tipocalificacionempleado);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCalificacionEmpleado(List<TipoCalificacionEmpleado> tipocalificacionempleadosAux) throws Exception {
		TipoCalificacionEmpleadoConstantesFunciones.setEstadosInicialesTipoCalificacionEmpleado(tipocalificacionempleadosAux);
	}
	
	public void setEstadosInicialesTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleadoAux) throws Exception {
		TipoCalificacionEmpleadoConstantesFunciones.setEstadosInicialesTipoCalificacionEmpleado(tipocalificacionempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCalificacionEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCalificacionEmpleadoActual()) {
				if(!this.isEsNuevoTipoCalificacionEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCalificacionEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCalificacionEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Calificacion Empleado ?", "MANTENIMIENTO DE Tipo Calificacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCalificacionEmpleado tipocalificacionempleado) throws Exception {
		TipoCalificacionEmpleadoConstantesFunciones.seleccionarAsignar(this.tipocalificacionempleado,tipocalificacionempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCalificacionEmpleado=this.isPermisoActualizarOriginalTipoCalificacionEmpleado;
			
			
			this.seleccionarAsignar(tipocalificacionempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCalificacionEmpleadoConstantesFunciones.quitarEspaciosTipoCalificacionEmpleado(this.tipocalificacionempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocalificacionempleadoSessionBean.setsFuncionBusquedaRapida(this.tipocalificacionempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCalificacionEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCalificacionEmpleado(esParaCancelar);				
				this.cancelarNuevoTipoCalificacionEmpleado(esParaCancelar);								
			}
			
			this.tipocalificacionempleado=new TipoCalificacionEmpleado();
			
			this.inicializarTipoCalificacionEmpleado();
			
			this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCalificacionEmpleado() throws Exception {
		try {
			TipoCalificacionEmpleadoConstantesFunciones.inicializarTipoCalificacionEmpleado(this.tipocalificacionempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCalificacionEmpleados(String sAccionBusqueda,List<TipoCalificacionEmpleado> tipocalificacionempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCalificacionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCalificacionEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCalificacionEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCalificacionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Calificacion Empleados");		
		parameters.put("busquedapor", TipoCalificacionEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CalificacionEmpleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogicAuxiliar=new TipoCalificacionEmpleadoLogic();
					tipocalificacionempleadoLogicAuxiliar.setDatosCliente(tipocalificacionempleadoLogic.getDatosCliente());				
					tipocalificacionempleadoLogicAuxiliar.setTipoCalificacionEmpleados(tipocalificacionempleadosParaReportes);
					
					tipocalificacionempleadoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCalificacionEmpleadoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocalificacionempleadosParaReportes=tipocalificacionempleadoLogicAuxiliar.getTipoCalificacionEmpleados();
					
					//tipocalificacionempleadoLogic.getNewConnexionToDeep();
					
					//for (TipoCalificacionEmpleado tipocalificacionempleado:tipocalificacionempleadosParaReportes) {
					//	tipocalificacionempleadoLogic.deepLoad(tipocalificacionempleado, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocalificacionempleadoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocalificacionempleadoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCalificacionEmpleado = AuxiliarReportes.class.getResourceAsStream("CalificacionEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_calificacionempleado", reportFileCalificacionEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCalificacionEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCalificacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCalificacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCalificacionEmpleado=new JRBeanArrayDataSource(TipoCalificacionEmpleadoJInternalFrame.TraerTipoCalificacionEmpleadoBeans(tipocalificacionempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCalificacionEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCalificacionEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCalificacionEmpleadoBean.TraerTipoCalificacionEmpleadoBeans(tipocalificacionempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipocalificacionempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipocalificacionempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleadoActionPerformed(null);
					//this.generarExcelReporteTipoCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipocalificacionempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipocalificacionempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipocalificacionempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipocalificacionempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCalificacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalificacionEmpleado> tipocalificacionempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalificacionempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalificacionEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCalificacionEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCalificacionEmpleado tipocalificacionempleado : tipocalificacionempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCalificacionEmpleadoConstantesFunciones.generarExcelReporteDataTipoCalificacionEmpleado("NORMAL",row,workbook,tipocalificacionempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCalificacionEmpleado(String sTipo,Row row,Workbook workbook) {
		
		TipoCalificacionEmpleadoConstantesFunciones.generarExcelReporteHeaderTipoCalificacionEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCalificacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalificacionEmpleado> tipocalificacionempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalificacionempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalificacionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCalificacionEmpleado tipocalificacionempleado : tipocalificacionempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.getTipoCalificacionEmpleadoDescripcion(tipocalificacionempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocalificacionempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocalificacionempleado.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocalificacionempleado.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCalificacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalificacionEmpleado> tipocalificacionempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCalificacionEmpleado> tipocalificacionempleadosRespaldo=null;
		
		classes=TipoCalificacionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoCalificacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocalificacionempleadoLogic.setDatosCliente(this.datosCliente);
		this.tipocalificacionempleadoLogic.setDatosDeep(this.datosDeep);
		this.tipocalificacionempleadoLogic.setIsConDeep(true);
		
		tipocalificacionempleadosRespaldo=this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados();
		
		this.tipocalificacionempleadoLogic.setTipoCalificacionEmpleados(tipocalificacionempleadosParaReportes);	
		this.tipocalificacionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocalificacionempleadosParaReportes=this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados();
		this.tipocalificacionempleadoLogic.setTipoCalificacionEmpleados(tipocalificacionempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalificacionempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalificacionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCalificacionEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCalificacionEmpleado tipocalificacionempleado : tipocalificacionempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCalificacionEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCalificacionEmpleadoConstantesFunciones.generarExcelReporteDataTipoCalificacionEmpleado("NORMAL",row,workbook,tipocalificacionempleado,cellStyleDataAux);
		
			
			


				//CalificacionEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocalificacionempleado.getCalificacionEmpleados()!=null && tipocalificacionempleado.getCalificacionEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CalificacionEmpleadoConstantesFunciones.generarExcelReporteHeaderCalificacionEmpleado("RELACIONADO",row,workbook);
				}

				if(tipocalificacionempleado.getCalificacionEmpleados()!=null) {
					i2=0;
					for(CalificacionEmpleado calificacionempleado : tipocalificacionempleado.getCalificacionEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CalificacionEmpleadoConstantesFunciones.generarExcelReporteDataCalificacionEmpleado("RELACIONADO",row,workbook,calificacionempleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.getTipoCalificacionEmpleadoDescripcion(tipocalificacionempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCalificacionEmpleado() throws Exception {		
		this.startProcessTipoCalificacionEmpleado(true);
	}
	
	public void startProcessTipoCalificacionEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCalificacionEmpleado ,this.jPanelParametrosReportesTipoCalificacionEmpleado, this.jScrollPanelDatosTipoCalificacionEmpleado,this.jPanelPaginacionTipoCalificacionEmpleado, this.jScrollPanelDatosEdicionTipoCalificacionEmpleado, this.jPanelAccionesTipoCalificacionEmpleado,this.jPanelAccionesFormularioTipoCalificacionEmpleado,this.jmenuBarTipoCalificacionEmpleado,this.jmenuBarDetalleTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,this.jTtoolBarDetalleTipoCalificacionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCalificacionEmpleado=this.jTabbedPaneBusquedasTipoCalificacionEmpleado; 
		
		final JPanel jPanelParametrosReportesTipoCalificacionEmpleado=this.jPanelParametrosReportesTipoCalificacionEmpleado;
		//final JScrollPane jScrollPanelDatosTipoCalificacionEmpleado=this.jScrollPanelDatosTipoCalificacionEmpleado;
		final JTable jTableDatosTipoCalificacionEmpleado=this.jTableDatosTipoCalificacionEmpleado;		
		final JPanel jPanelPaginacionTipoCalificacionEmpleado=this.jPanelPaginacionTipoCalificacionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionTipoCalificacionEmpleado=this.jScrollPanelDatosEdicionTipoCalificacionEmpleado;
		final JPanel jPanelAccionesTipoCalificacionEmpleado=this.jPanelAccionesTipoCalificacionEmpleado;
		
		JPanel jPanelCamposAuxiliarTipoCalificacionEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCalificacionEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			jPanelCamposAuxiliarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jPanelCamposTipoCalificacionEmpleado;
			jPanelAccionesFormularioAuxiliarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jPanelAccionesFormularioTipoCalificacionEmpleado;
		}
		
		final JPanel jPanelCamposTipoCalificacionEmpleado=jPanelCamposAuxiliarTipoCalificacionEmpleado;
		final JPanel jPanelAccionesFormularioTipoCalificacionEmpleado=jPanelAccionesFormularioAuxiliarTipoCalificacionEmpleado;
		
		
		final JMenuBar jmenuBarTipoCalificacionEmpleado=this.jmenuBarTipoCalificacionEmpleado;
		final JToolBar jTtoolBarTipoCalificacionEmpleado=this.jTtoolBarTipoCalificacionEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCalificacionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCalificacionEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			jmenuBarDetalleAuxiliarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jmenuBarDetalleTipoCalificacionEmpleado;
			jTtoolBarDetalleAuxiliarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTtoolBarDetalleTipoCalificacionEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleTipoCalificacionEmpleado=jmenuBarDetalleAuxiliarTipoCalificacionEmpleado;
		final JToolBar jTtoolBarDetalleTipoCalificacionEmpleado=jTtoolBarDetalleAuxiliarTipoCalificacionEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCalificacionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCalificacionEmpleado;
			processRunnable.jTableDatos=jTableDatosTipoCalificacionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposTipoCalificacionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCalificacionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCalificacionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCalificacionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCalificacionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCalificacionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarTipoCalificacionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCalificacionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCalificacionEmpleado ,jPanelParametrosReportesTipoCalificacionEmpleado,jTableDatosTipoCalificacionEmpleado, /*jScrollPanelDatosTipoCalificacionEmpleado,*/jPanelCamposTipoCalificacionEmpleado,jPanelPaginacionTipoCalificacionEmpleado, /*jScrollPanelDatosEdicionTipoCalificacionEmpleado,*/ jPanelAccionesTipoCalificacionEmpleado,jPanelAccionesFormularioTipoCalificacionEmpleado,jmenuBarTipoCalificacionEmpleado,jmenuBarDetalleTipoCalificacionEmpleado,jTtoolBarTipoCalificacionEmpleado,jTtoolBarDetalleTipoCalificacionEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCalificacionEmpleado ,jPanelParametrosReportesTipoCalificacionEmpleado, jScrollPanelDatosTipoCalificacionEmpleado,jPanelPaginacionTipoCalificacionEmpleado, jScrollPanelDatosEdicionTipoCalificacionEmpleado, jPanelAccionesTipoCalificacionEmpleado,jPanelAccionesFormularioTipoCalificacionEmpleado,jmenuBarTipoCalificacionEmpleado,jmenuBarDetalleTipoCalificacionEmpleado,jTtoolBarTipoCalificacionEmpleado,jTtoolBarDetalleTipoCalificacionEmpleado);
						
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
	
	public void finishProcessTipoCalificacionEmpleado() {// throws Exception 
		this.finishProcessTipoCalificacionEmpleado(true);
	}
	
	public void finishProcessTipoCalificacionEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCalificacionEmpleado ,this.jPanelParametrosReportesTipoCalificacionEmpleado, this.jScrollPanelDatosTipoCalificacionEmpleado,this.jPanelPaginacionTipoCalificacionEmpleado, this.jScrollPanelDatosEdicionTipoCalificacionEmpleado, this.jPanelAccionesTipoCalificacionEmpleado,this.jPanelAccionesFormularioTipoCalificacionEmpleado,this.jmenuBarTipoCalificacionEmpleado,this.jmenuBarDetalleTipoCalificacionEmpleado,this.jTtoolBarTipoCalificacionEmpleado,this.jTtoolBarDetalleTipoCalificacionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCalificacionEmpleado=this.jTabbedPaneBusquedasTipoCalificacionEmpleado; 
		
		final JPanel jPanelParametrosReportesTipoCalificacionEmpleado=this.jPanelParametrosReportesTipoCalificacionEmpleado;
		//final JScrollPane jScrollPanelDatosTipoCalificacionEmpleado=this.jScrollPanelDatosTipoCalificacionEmpleado;
		final JTable jTableDatosTipoCalificacionEmpleado=this.jTableDatosTipoCalificacionEmpleado;		
		final JPanel jPanelPaginacionTipoCalificacionEmpleado=this.jPanelPaginacionTipoCalificacionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionTipoCalificacionEmpleado=this.jScrollPanelDatosEdicionTipoCalificacionEmpleado;
		final JPanel jPanelAccionesTipoCalificacionEmpleado=this.jPanelAccionesTipoCalificacionEmpleado;
		
		JPanel jPanelCamposAuxiliarTipoCalificacionEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCalificacionEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			jPanelCamposAuxiliarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jPanelCamposTipoCalificacionEmpleado;
			jPanelAccionesFormularioAuxiliarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jPanelAccionesFormularioTipoCalificacionEmpleado;
		}
		
		final JPanel jPanelCamposTipoCalificacionEmpleado=jPanelCamposAuxiliarTipoCalificacionEmpleado;
		final JPanel jPanelAccionesFormularioTipoCalificacionEmpleado=jPanelAccionesFormularioAuxiliarTipoCalificacionEmpleado;
		
		
		final JMenuBar jmenuBarTipoCalificacionEmpleado=this.jmenuBarTipoCalificacionEmpleado;		
		final JToolBar jTtoolBarTipoCalificacionEmpleado=this.jTtoolBarTipoCalificacionEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCalificacionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCalificacionEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			jmenuBarDetalleAuxiliarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jmenuBarDetalleTipoCalificacionEmpleado;
			jTtoolBarDetalleAuxiliarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTtoolBarDetalleTipoCalificacionEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCalificacionEmpleado=jmenuBarDetalleAuxiliarTipoCalificacionEmpleado;
		final JToolBar jTtoolBarDetalleTipoCalificacionEmpleado=jTtoolBarDetalleAuxiliarTipoCalificacionEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCalificacionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCalificacionEmpleado;
			processRunnable.jTableDatos=jTableDatosTipoCalificacionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposTipoCalificacionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCalificacionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCalificacionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCalificacionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCalificacionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCalificacionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarTipoCalificacionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCalificacionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCalificacionEmpleado ,jPanelParametrosReportesTipoCalificacionEmpleado, jTableDatosTipoCalificacionEmpleado,/*jScrollPanelDatosTipoCalificacionEmpleado,*/jPanelCamposTipoCalificacionEmpleado,jPanelPaginacionTipoCalificacionEmpleado, /*jScrollPanelDatosEdicionTipoCalificacionEmpleado,*/ jPanelAccionesTipoCalificacionEmpleado,jPanelAccionesFormularioTipoCalificacionEmpleado,jmenuBarTipoCalificacionEmpleado,jmenuBarDetalleTipoCalificacionEmpleado,jTtoolBarTipoCalificacionEmpleado,jTtoolBarDetalleTipoCalificacionEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCalificacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCalificacionEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCalificacionEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCalificacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCalificacionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCalificacionEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCalificacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCalificacionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCalificacionEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocalificacionempleadoConstantesFunciones.getsFinalQueryTipoCalificacionEmpleado();
		String  finalQueryPaginacionTodos=this.tipocalificacionempleadoConstantesFunciones.getsFinalQueryTipoCalificacionEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCalificacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoTipoCalificacionEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCalificacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoCalificacionEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCalificacionEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocalificacionempleadosEliminados= new ArrayList<TipoCalificacionEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCalificacionEmpleado();
		
				///*TipoCalificacionEmpleadoSessionBean*/this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
			
			if(this.tipocalificacionempleadoSessionBean==null) {
				this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
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
					this.iNumeroPaginacion=TipoCalificacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCalificacionEmpleadoConstantesFunciones.getClassesForeignKeysOfTipoCalificacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocalificacionempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocalificacionempleadosAux= new ArrayList<TipoCalificacionEmpleado>();
			
				
			tipocalificacionempleadoLogic.setDatosCliente(this.datosCliente);
			tipocalificacionempleadoLogic.setDatosDeep(this.datosDeep);
			tipocalificacionempleadoLogic.setIsConDeep(true);
			
			
			tipocalificacionempleadoLogic.getTipoCalificacionEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocalificacionempleadoLogic.getTodosTipoCalificacionEmpleados(finalQueryGlobal,pagination);
					
					//tipocalificacionempleadoLogic.getTodosTipoCalificacionEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()==null|| tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalificacionempleadosAux= new ArrayList<TipoCalificacionEmpleado>();
							tipocalificacionempleadosAux.addAll(tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalificacionempleadosAux= new ArrayList<TipoCalificacionEmpleado>();
							tipocalificacionempleadosAux.addAll(tipocalificacionempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalificacionempleadoLogic.getTodosTipoCalificacionEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//tipocalificacionempleadoLogic.getTodosTipoCalificacionEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCalificacionEmpleados("Todos",tipocalificacionempleadoLogic.getTipoCalificacionEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalificacionempleadoLogic.setTipoCalificacionEmpleados(new ArrayList<TipoCalificacionEmpleado>());					
							tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().addAll(tipocalificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalificacionempleados=new ArrayList<TipoCalificacionEmpleado>();
							tipocalificacionempleados.addAll(tipocalificacionempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCalificacionEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCalificacionEmpleado=this.idActual;
				
				} else if(this.idTipoCalificacionEmpleadoActual!=null && this.idTipoCalificacionEmpleadoActual!=0L) {
					idTipoCalificacionEmpleado=idTipoCalificacionEmpleadoActual;
				}
				
					
				this.sDetalleReporte=TipoCalificacionEmpleadoConstantesFunciones.getDetalleIndicePorId(idTipoCalificacionEmpleado);
				
				this.tipocalificacionempleados=new ArrayList<TipoCalificacionEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocalificacionempleadoLogic.getEntity(idTipoCalificacionEmpleado);
					
					//tipocalificacionempleadoLogic.getEntityWithConnection(idTipoCalificacionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalificacionempleadoLogic.setTipoCalificacionEmpleados(new ArrayList<TipoCalificacionEmpleado>());
					tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().add(tipocalificacionempleadoLogic.getTipoCalificacionEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocalificacionempleados=new ArrayList<TipoCalificacionEmpleado>();
					this.tipocalificacionempleados.add(tipocalificacionempleado);
				}
				
				if(tipocalificacionempleadoLogic.getTipoCalificacionEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoCalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocalificacionempleadoLogic.getTipoCalificacionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()==null||tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocalificacionempleados==null|| tipocalificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalificacionempleadosAux=new ArrayList<TipoCalificacionEmpleado>();
						tipocalificacionempleadosAux.addAll(tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalificacionempleadosAux=new ArrayList<TipoCalificacionEmpleado>();
							tipocalificacionempleadosAux.addAll(tipocalificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocalificacionempleadoLogic.getTipoCalificacionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCalificacionEmpleados("FK_IdEmpresa",tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCalificacionEmpleados("FK_IdEmpresa",tipocalificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalificacionempleadoLogic.setTipoCalificacionEmpleados(new ArrayList<TipoCalificacionEmpleado>());
						tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().addAll(tipocalificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalificacionempleados=new ArrayList<TipoCalificacionEmpleado>();
							tipocalificacionempleados.addAll(tipocalificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCalificacionEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCalificacionEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalificacionempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalificacionempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCalificacionEmpleado tipocalificacionempleado) {
		Boolean permite=true;
		
		if(this.tipocalificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCalificacionEmpleadoConstantesFunciones.getOrderByListaTipoCalificacionEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCalificacionEmpleadoConstantesFunciones.getOrderByListaTipoCalificacionEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalificacionEmpleado tipocalificacionempleado:tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
				if(tipocalificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalificacionempleadoTotales=tipocalificacionempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleados) {
				if(tipocalificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalificacionempleadoTotales=tipocalificacionempleado;
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
			this.tipocalificacionempleadoAux=new TipoCalificacionEmpleado();
			this.tipocalificacionempleadoAux.setsType(Constantes2.S_TOTALES);
			this.tipocalificacionempleadoAux.setIsNew(false);
			this.tipocalificacionempleadoAux.setIsChanged(false);
			this.tipocalificacionempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCalificacionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoCalificacionEmpleado(this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados(),this.tipocalificacionempleadoAux);
				
				this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().add(this.tipocalificacionempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCalificacionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoCalificacionEmpleado(this.tipocalificacionempleados,this.tipocalificacionempleadoAux);
				
				this.tipocalificacionempleados.add(this.tipocalificacionempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocalificacionempleadoTotales=new TipoCalificacionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().remove(tipocalificacionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocalificacionempleados.remove(tipocalificacionempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocalificacionempleadoTotales=new TipoCalificacionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalificacionEmpleado tipocalificacionempleado:tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
				if(tipocalificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalificacionempleadoTotales=tipocalificacionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCalificacionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoCalificacionEmpleado(this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados(),tipocalificacionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleados) {
				if(tipocalificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalificacionempleadoTotales=tipocalificacionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCalificacionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoCalificacionEmpleado(this.tipocalificacionempleados,tipocalificacionempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCalificacionEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCalificacionEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalificacionempleadoLogic.getTipoCalificacionEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoCalificacionEmpleado() {
		this.isPermisoTodoTipoCalificacionEmpleado=false;
		this.isPermisoNuevoTipoCalificacionEmpleado=false;
		this.isPermisoActualizarTipoCalificacionEmpleado=false;
		this.isPermisoActualizarOriginalTipoCalificacionEmpleado=false;
		this.isPermisoEliminarTipoCalificacionEmpleado=false;
		this.isPermisoGuardarCambiosTipoCalificacionEmpleado=false;
		this.isPermisoConsultaTipoCalificacionEmpleado=false;
		this.isPermisoBusquedaTipoCalificacionEmpleado=false;
		this.isPermisoReporteTipoCalificacionEmpleado=false;		
		this.isPermisoOrdenTipoCalificacionEmpleado=false;		
		this.isPermisoPaginacionMedioTipoCalificacionEmpleado=false;		
		this.isPermisoPaginacionAltoTipoCalificacionEmpleado=false;
		this.isPermisoPaginacionTodoTipoCalificacionEmpleado=false;
		this.isPermisoCopiarTipoCalificacionEmpleado=false;		
		this.isPermisoVerFormTipoCalificacionEmpleado=false;		
		this.isPermisoDuplicarTipoCalificacionEmpleado=false;		
		this.isPermisoOrdenTipoCalificacionEmpleado=false;		
	}
	
	public void setPermisosUsuarioTipoCalificacionEmpleado(Boolean isPermiso) {
		this.isPermisoTodoTipoCalificacionEmpleado=isPermiso;
		this.isPermisoNuevoTipoCalificacionEmpleado=isPermiso;
		this.isPermisoActualizarTipoCalificacionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalTipoCalificacionEmpleado=isPermiso;
		this.isPermisoEliminarTipoCalificacionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosTipoCalificacionEmpleado=isPermiso;
		this.isPermisoConsultaTipoCalificacionEmpleado=isPermiso;
		this.isPermisoBusquedaTipoCalificacionEmpleado=isPermiso;
		this.isPermisoReporteTipoCalificacionEmpleado=isPermiso;
		this.isPermisoOrdenTipoCalificacionEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioTipoCalificacionEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoTipoCalificacionEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoTipoCalificacionEmpleado=isPermiso;		
		this.isPermisoCopiarTipoCalificacionEmpleado=isPermiso;		
		this.isPermisoVerFormTipoCalificacionEmpleado=isPermiso;		
		this.isPermisoDuplicarTipoCalificacionEmpleado=isPermiso;
		this.isPermisoOrdenTipoCalificacionEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCalificacionEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoTipoCalificacionEmpleado=isPermiso;
		this.isPermisoNuevoTipoCalificacionEmpleado=isPermiso;
		this.isPermisoActualizarTipoCalificacionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalTipoCalificacionEmpleado=isPermiso;
		this.isPermisoEliminarTipoCalificacionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosTipoCalificacionEmpleado=isPermiso;
		//this.isPermisoConsultaTipoCalificacionEmpleado=isPermiso;
		//this.isPermisoBusquedaTipoCalificacionEmpleado=isPermiso;
		//this.isPermisoReporteTipoCalificacionEmpleado=isPermiso;
		//this.isPermisoOrdenTipoCalificacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCalificacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCalificacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCalificacionEmpleado=isPermiso;		
		//this.isPermisoCopiarTipoCalificacionEmpleado=isPermiso;		
		//this.isPermisoDuplicarTipoCalificacionEmpleado=isPermiso;
		//this.isPermisoOrdenTipoCalificacionEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCalificacionEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCalificacionEmpleado=false;
		this.isTienePermisosCalificacionEmpleado=this.verificarGetPermisosUsuarioOpcionTipoCalificacionEmpleadoClaseRelacionada(this.opcionsRelacionadas,CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCalificacionEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCalificacionEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCalificacionEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCalificacionEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCalificacionEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCalificacionEmpleadoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCalificacionEmpleado && this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.remove(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCalificacionEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCalificacionEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCalificacionEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCalificacionEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCalificacionEmpleado=this.isPermisoActualizarTipoCalificacionEmpleado;
			this.isPermisoEliminarTipoCalificacionEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCalificacionEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCalificacionEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCalificacionEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCalificacionEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCalificacionEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCalificacionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCalificacionEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCalificacionEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCalificacionEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCalificacionEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCalificacionEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCalificacionEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCalificacionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCalificacionEmpleado.setToolTipText(this.jTableDatosTipoCalificacionEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCalificacionEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCalificacionEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCalificacionEmpleado() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCalificacionEmpleado && this.tipocalificacionempleadoConstantesFunciones.mostrarCalificacionEmpleadoTipoCalificacionEmpleado && !TipoCalificacionEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Calificacion Empleado");
			reporte.setsDescripcion("Calificacion Empleado");
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
	public void inicializarCombosForeignKeyTipoCalificacionEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCalificacionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCalificacionEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCalificacionEmpleadoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoCalificacionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCalificacionEmpleadoParameterReturnGeneral tipocalificacionempleadoReturnGeneral=new TipoCalificacionEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocalificacionempleadoConstantesFunciones.cargarid_empresaTipoCalificacionEmpleado)
					 || (this.esRecargarFks && this.tipocalificacionempleadoConstantesFunciones.cargarid_empresaTipoCalificacionEmpleado)) {

					if(!this.tipocalificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocalificacionempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocalificacionempleadoReturnGeneral=tipocalificacionempleadoLogic.cargarCombosLoteForeignKeyTipoCalificacionEmpleado(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocalificacionempleadoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCalificacionEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocalificacionempleadoSessionBean==null) {
				this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
			}

			if(!this.tipocalificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoCalificacionEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCalificacionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCalificacionEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalificacionEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCalificacionEmpleado()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalificacionEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCalificacionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCalificacionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCalificacionEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCalificacionEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCalificacionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCalificacionEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoCalificacionEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCalificacionEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCalificacionEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean(); 
		this.tipocalificacionempleadoConstantesFunciones=new TipoCalificacionEmpleadoConstantesFunciones(); 
		this.tipocalificacionempleadoBean=new TipoCalificacionEmpleado();//(this.tipocalificacionempleadoConstantesFunciones); 		
		this.tipocalificacionempleadoReturnGeneral=new TipoCalificacionEmpleadoParameterReturnGeneral(); 
		
		this.tipocalificacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalificacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCalificacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCalificacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCalificacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCalificacionEmpleado(true);
			
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
			
			this.tipocalificacionempleadoConstantesFunciones=new TipoCalificacionEmpleadoConstantesFunciones(); 
			this.tipocalificacionempleadoBean=new TipoCalificacionEmpleado();//this.tipocalificacionempleadoConstantesFunciones); 			
			this.tipocalificacionempleadoReturnGeneral=new TipoCalificacionEmpleadoParameterReturnGeneral(); 
		
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Calificacion Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocalificacionempleado=new TipoCalificacionEmpleado();
			this.tipocalificacionempleados = new ArrayList<TipoCalificacionEmpleado>();
			this.tipocalificacionempleadosAux = new ArrayList<TipoCalificacionEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic=new TipoCalificacionEmpleadoLogic();
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocalificacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocalificacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCalificacionEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado);	
					}
					
					if(this.jInternalFrameImportacionTipoCalificacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCalificacionEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCalificacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCalificacionEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCalificacionEmpleado);
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado);
					this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCalificacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCalificacionEmpleado);
					this.jInternalFrameImportacionTipoCalificacionEmpleado.setVisible(false);
					this.jInternalFrameImportacionTipoCalificacionEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCalificacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCalificacionEmpleado);
					this.jInternalFrameOrderByTipoCalificacionEmpleado.setVisible(false);
					this.jInternalFrameOrderByTipoCalificacionEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCalificacionEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCalificacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocalificacionempleadoReturnGeneral=new TipoCalificacionEmpleadoParameterReturnGeneral();
			
			this.tipocalificacionempleadoParameterGeneral=new TipoCalificacionEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocalificacionempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCalificacionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado(),this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCalificacionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado(),this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaDuplicarTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaCopiarTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaVerFormTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCalificacionEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCalificacionEmpleado(false);
			
			this.setPermisosUsuarioTipoCalificacionEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado() && this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCalificacionEmpleadoClasesRelacionadas();
			}
			
			if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCalificacionEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCalificacionEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCalificacionEmpleado();
			}
			
			if(!this.isPermisoBusquedaTipoCalificacionEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCalificacionEmpleado,this.isPermisoPaginacionMedioTipoCalificacionEmpleado,this.isPermisoPaginacionTodoTipoCalificacionEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCalificacionEmpleadoConstantesFunciones.getTiposSeleccionarTipoCalificacionEmpleado());
				
				this.tiposColumnasSelect=TipoCalificacionEmpleadoConstantesFunciones.getTiposSeleccionarTipoCalificacionEmpleado(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCalificacionEmpleado();				
				//this.tiposRelacionesSelect=TipoCalificacionEmpleadoConstantesFunciones.getTiposRelacionesTipoCalificacionEmpleado(true);
				
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
			//if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCalificacionEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCalificacionEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCalificacionEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalificacionEmpleado() ;
			
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
			
			
			this.calificacionempleadoLogic=new CalificacionEmpleadoLogic(); 
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
				tipocalificacionempleadoImplementable= (TipoCalificacionEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCalificacionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocalificacionempleadoImplementableHome= (TipoCalificacionEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCalificacionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocalificacionempleados= new ArrayList<TipoCalificacionEmpleado>();
			this.tipocalificacionempleadosEliminados= new ArrayList<TipoCalificacionEmpleado>();
						
			this.isEsNuevoTipoCalificacionEmpleado=false;
			this.esParaAccionDesdeFormularioTipoCalificacionEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCalificacionEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCalificacionEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCalificacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCalificacionEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCalificacionEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCalificacionEmpleado();
			}
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCalificacionEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCalificacionEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCalificacionEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCalificacionEmpleado() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCalificacionEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();	
				
				

				if(sTitle.equals("Calificacion Empleados")) {
					if(!CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCalificacionEmpleado();

						this.cargarParteTabPanelRelacionadaCalificacionEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCalificacionEmpleado();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCalificacionEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(false,true,iIndex);
		this.jButtonCalificacionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCalificacionEmpleado();

		//this.jTabbedPaneRelacionesTipoCalificacionEmpleado.updateUI();
		//this.jTabbedPaneRelacionesTipoCalificacionEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCalificacionEmpleado.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CalificacionEmpleado")) {
				int row=this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
				jButtonCalificacionEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Calificacion Empleado")) {

					if(this.isTienePermisosCalificacionEmpleado && this.tipocalificacionempleadoConstantesFunciones.mostrarCalificacionEmpleadoTipoCalificacionEmpleado && !TipoCalificacionEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Calificacion Empleados"+"("+CalificacionEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Calificacion Empleados");

						if(tipocalificacionempleadoConstantesFunciones.resaltarCalificacionEmpleadoTipoCalificacionEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocalificacionempleadoConstantesFunciones.resaltarCalificacionEmpleadoTipoCalificacionEmpleado);
						}

						jmenuItem.setEnabled(this.tipocalificacionempleadoConstantesFunciones.activarCalificacionEmpleadoTipoCalificacionEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CalificacionEmpleado"));

						

						this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jmenuDetalleTipoCalificacionEmpleado.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCalificacionEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCalificacionEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCalificacionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCalificacionEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCalificacionEmpleado();
		
		this.cargarCombosFrameForeignKeyTipoCalificacionEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCalificacionEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCalificacionEmpleado();
		}
	}
	
	
	
	public void jButtonNuevoTipoCalificacionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
			
			if(jTableDatosTipoCalificacionEmpleado.getRowCount()>=1) {
				jTableDatosTipoCalificacionEmpleado.removeRowSelectionInterval(0, jTableDatosTipoCalificacionEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCalificacionEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCalificacionEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCalificacionEmpleado(true);			
			//this.tipocalificacionempleado=new TipoCalificacionEmpleado();
			//this.tipocalificacionempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalificacionEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado() ;
			
			if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalificacionEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocalificacionempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);				
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
			if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCalificacionEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCalificacionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCalificacionEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCalificacionEmpleado.getSelectedRows().length;			
			}
			
			tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCalificacionEmpleado--;			
				//TipoCalificacionEmpleado tipocalificacionempleadoAux= new TipoCalificacionEmpleado();			
				//tipocalificacionempleadoAux.setId(this.iIdNuevoTipoCalificacionEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCalificacionEmpleado tipocalificacionempleadoOrigen=new TipoCalificacionEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCalificacionEmpleado tipocalificacionempleadoOrigen : tipocalificacionempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocalificacionempleadoOrigen =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalificacionempleadoOrigen =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCalificacionEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocalificacionempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCalificacionEmpleado(tipocalificacionempleadoOrigen,this.tipocalificacionempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().add(this.tipocalificacionempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocalificacionempleados.add(this.tipocalificacionempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
				
				this.jTableDatosTipoCalificacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoCalificacionEmpleado(), this.getIndiceNuevoTipoCalificacionEmpleado());
				
				int iLastRow =  this.jTableDatosTipoCalificacionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCalificacionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCalificacionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();									
		
			TipoCalificacionEmpleado tipocalificacionempleadoOrigen=new TipoCalificacionEmpleado();
			TipoCalificacionEmpleado tipocalificacionempleadoDestino=new TipoCalificacionEmpleado();
				
			tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCalificacionEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocalificacionempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCalificacionEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalificacionempleadoOrigen =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocalificacionempleadoOrigen =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalificacionempleadoDestino =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocalificacionempleadoDestino =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocalificacionempleadoOrigen =tipocalificacionempleadosSeleccionados.get(0);
				tipocalificacionempleadoDestino =tipocalificacionempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCalificacionEmpleado(tipocalificacionempleadoOrigen,tipocalificacionempleadoDestino,true,false);
				
				tipocalificacionempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocalificacionempleadoDestino,tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalificacionempleadoDestino,tipocalificacionempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
				
				//this.jTableDatosTipoCalificacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoCalificacionEmpleado(), this.getIndiceNuevoTipoCalificacionEmpleado());
				
				int iLastRow =  this.jTableDatosTipoCalificacionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCalificacionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCalificacionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCalificacionEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionTipoCalificacionEmpleado.setVisible(!isVisible);
			this.jPanelAccionesTipoCalificacionEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCalificacionEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCalificacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCalificacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCalificacionEmpleado();
			
			this.abrirFrameOrderByTipoCalificacionEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCalificacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCalificacionEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCalificacionEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setSize(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCalificacionEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCalificacionEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jContentPaneDetalleTipoCalificacionEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jContentPaneDetalleTipoCalificacionEmpleado.getWidth(),TipoCalificacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jContentPaneDetalleTipoCalificacionEmpleado.getWidth(),TipoCalificacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jContentPaneDetalleTipoCalificacionEmpleado.getWidth(),TipoCalificacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCalificacionEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCalificacionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCalificacionEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCalificacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalificacionEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByTipoCalificacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalificacionEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCalificacionEmpleado);
				this.jInternalFrameOrderByTipoCalificacionEmpleado.setVisible(false);
				this.jInternalFrameOrderByTipoCalificacionEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByTipoCalificacionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCalificacionEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCalificacionEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCalificacionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCalificacionEmpleado==null) {
				
				this.jInternalFrameImportacionTipoCalificacionEmpleado=new ImportacionJInternalFrame(TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCalificacionEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCalificacionEmpleado);
				this.jInternalFrameImportacionTipoCalificacionEmpleado.setVisible(false);
				this.jInternalFrameImportacionTipoCalificacionEmpleado.setSelected(false);


				this.jInternalFrameImportacionTipoCalificacionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCalificacionEmpleado"));
				this.jInternalFrameImportacionTipoCalificacionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCalificacionEmpleado"));
				this.jInternalFrameImportacionTipoCalificacionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCalificacionEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCalificacionEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado==null) {
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado=new ReporteDinamicoJInternalFrame(TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado);
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalificacionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalificacionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalificacionEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalificacionEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCalificacionEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jContentPaneDetalleTipoCalificacionEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCalificacionEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCalificacionEmpleado);
			
	       	this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCalificacionEmpleado.dispose();
			//this.jInternalFrameDetalleFormTipoCalificacionEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCalificacionEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCalificacionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCalificacionEmpleado.setVisible(true);
	        this.jInternalFrameImportacionTipoCalificacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCalificacionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setVisible(true);
	        this.jInternalFrameOrderByTipoCalificacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCalificacionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCalificacionEmpleado.setVisible(false);
	        this.jInternalFrameOrderByTipoCalificacionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCalificacionEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCalificacionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCalificacionEmpleado.setVisible(false);
	        this.jInternalFrameImportacionTipoCalificacionEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCalificacionEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCalificacionEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCalificacionEmpleado(true);
			//this.isEsNuevoTipoCalificacionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalificacionEmpleado(false) ;
			
			if(tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado() && CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCalificacionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalificacionEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCalificacionEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCalificacionEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCalificacionEmpleado(true);
			//this.isEsNuevoTipoCalificacionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocalificacionempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCalificacionEmpleado(false) ;
			
			if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalificacionEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCalificacionEmpleado(false);
			
			//if(!this.isEsNuevoTipoCalificacionEmpleado) {								
				int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
				
			}
			
			if(this.permiteMantenimiento(this.tipocalificacionempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCalificacionEmpleado=true;
					this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
					this.isEsNuevoTipoCalificacionEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCalificacionEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCalificacionEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCalificacionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado(false);
				
				this.habilitarDeshabilitarControlesTipoCalificacionEmpleado(false);
			
												
				
				if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCalificacionEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,tipocalificacionempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCalificacionEmpleado(this.tipocalificacionempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCalificacionEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocalificacionempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocalificacionempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.tipocalificacionempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.tipocalificacionempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocalificacionempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCalificacionEmpleadoModel) this.jTableDatosTipoCalificacionEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCalificacionEmpleado=true;
				this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
				this.isEsNuevoTipoCalificacionEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCalificacionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado(false);
				
				this.habilitarDeshabilitarControlesTipoCalificacionEmpleado(false);
				
				
				
				if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCalificacionEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCalificacionEmpleado.getRowCount()>=1) {
				jTableDatosTipoCalificacionEmpleado.removeRowSelectionInterval(0, jTableDatosTipoCalificacionEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCalificacionEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalificacionEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado(false) ;
			
			this.isEsNuevoTipoCalificacionEmpleado=false;
			
			if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCalificacionEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
				
				//SI ES MANUAL
				if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCalificacionEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCalificacionEmpleado--;			
			//TipoCalificacionEmpleado tipocalificacionempleadoAux= new TipoCalificacionEmpleado();			
			//tipocalificacionempleadoAux.setId(this.iIdNuevoTipoCalificacionEmpleado);
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCalificacionEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
			
			this.tipocalificacionempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().add(this.tipocalificacionempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocalificacionempleados.add(this.tipocalificacionempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
			
			this.jTableDatosTipoCalificacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoCalificacionEmpleado(), this.getIndiceNuevoTipoCalificacionEmpleado());
			
			int iLastRow =  this.jTableDatosTipoCalificacionEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCalificacionEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCalificacionEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalificacionEmpleado();
			}
			
			//this.abrirFrameTreeTipoCalificacionEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Calificacion EmpleadoS ?", "MANTENIMIENTO DE Tipo Calificacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCalificacionEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCalificacionEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocalificacionempleadoReturnGeneral=tipocalificacionempleadoLogic.procesarImportacionTipoCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocalificacionempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCalificacionEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCalificacionEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCalificacionEmpleado.setFileImportacion(this.jInternalFrameImportacionTipoCalificacionEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCalificacionEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCalificacionEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCalificacionEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCalificacionEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		

		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCalificacionEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCalificacionEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCalificacionEmpleados("Todos",tipocalificacionempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalificacionempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCalificacionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCalificacionEmpleado tipocalificacionempleado:tipocalificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocalificacionempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCalificacionEmpleado tipocalificacionempleado:tipocalificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocalificacionempleado.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCalificacionEmpleado tipocalificacionempleado:tipocalificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocalificacionempleado.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCalificacionEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCalificacionEmpleado(tipocalificacionempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalificacionEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCalificacionEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCalificacionEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCalificacionEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCalificacionEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCalificacionEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCalificacionEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCalificacionEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCalificacionEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCalificacionEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCalificacionEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCalificacionEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCalificacionEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCalificacionEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCalificacionEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCalificacionEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalificacionEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCalificacionEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCalificacionEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCalificacionEmpleado();
		
		this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCalificacionEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalificacionEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalificacionEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalificacionEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCalificacionEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jCheckBoxPostAccionNuevoTipoCalificacionEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jCheckBoxPostAccionSinCerrarTipoCalificacionEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jCheckBoxPostAccionSinMensajeTipoCalificacionEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCalificacionEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCalificacionEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jCheckBoxPostAccionNuevoTipoCalificacionEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jCheckBoxPostAccionSinCerrarTipoCalificacionEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jCheckBoxPostAccionSinMensajeTipoCalificacionEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCalificacionEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCalificacionEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCalificacionEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalificacionEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalificacionEmpleado() throws Exception {
		try	{
			if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCalificacionEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCalificacionEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCalificacionEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCalificacionEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCalificacionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCalificacionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.addItem(reporte);
			}
			
			
			if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCalificacionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCalificacionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalificacionEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalificacionEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCalificacionEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCalificacionEmpleado(Boolean esInicializar) throws Exception {				
		if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCalificacionEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCalificacionEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCalificacionEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCalificacionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCalificacionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCalificacionEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalificacionEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCalificacionEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCalificacionEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCalificacionEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocalificacionempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCalificacionEmpleado.setModel(new TipoCalificacionEmpleadoModel(this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCalificacionEmpleado.setModel(new TipoCalificacionEmpleadoModel(this.tipocalificacionempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCalificacionEmpleado!=null && this.jInternalFrameOrderByTipoCalificacionEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCalificacionEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalificacionEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCalificacionEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,tipocalificacionempleadoConstantesFunciones.resaltarSeleccionarTipoCalificacionEmpleado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,tipocalificacionempleadoConstantesFunciones.resaltarSeleccionarTipoCalificacionEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalificacionEmpleado,TipoCalificacionEmpleadoConstantesFunciones.LABEL_ID));

		if(this.tipocalificacionempleadoConstantesFunciones.mostraridTipoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalificacionEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocalificacionempleadoConstantesFunciones.resaltaridTipoCalificacionEmpleado,this.tipocalificacionempleadoConstantesFunciones.activaridTipoCalificacionEmpleado,this,true,"idTipoCalificacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocalificacionempleadoConstantesFunciones.resaltaridTipoCalificacionEmpleado,this.tipocalificacionempleadoConstantesFunciones.activaridTipoCalificacionEmpleado,this,true,"idTipoCalificacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalificacionEmpleado,TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocalificacionempleadoConstantesFunciones.mostrarid_empresaTipoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocalificacionempleadoConstantesFunciones.resaltarid_empresaTipoCalificacionEmpleado,this,this.tipocalificacionempleadoConstantesFunciones.activarid_empresaTipoCalificacionEmpleado));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocalificacionempleadoConstantesFunciones.resaltarid_empresaTipoCalificacionEmpleado,this,this.tipocalificacionempleadoConstantesFunciones.activarid_empresaTipoCalificacionEmpleado,false,"id_empresaTipoCalificacionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalificacionEmpleado,TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO));

		if(this.tipocalificacionempleadoConstantesFunciones.mostrarcodigoTipoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocalificacionempleadoConstantesFunciones.resaltarcodigoTipoCalificacionEmpleado,this.tipocalificacionempleadoConstantesFunciones.activarcodigoTipoCalificacionEmpleado,this,true,"codigoTipoCalificacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocalificacionempleadoConstantesFunciones.resaltarcodigoTipoCalificacionEmpleado,this.tipocalificacionempleadoConstantesFunciones.activarcodigoTipoCalificacionEmpleado,this,true,"codigoTipoCalificacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalificacionEmpleado,TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocalificacionempleadoConstantesFunciones.mostrarnombreTipoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocalificacionempleadoConstantesFunciones.resaltarnombreTipoCalificacionEmpleado,this.tipocalificacionempleadoConstantesFunciones.activarnombreTipoCalificacionEmpleado,this,true,"nombreTipoCalificacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocalificacionempleadoConstantesFunciones.resaltarnombreTipoCalificacionEmpleado,this.tipocalificacionempleadoConstantesFunciones.activarnombreTipoCalificacionEmpleado,this,true,"nombreTipoCalificacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCalificacionEmpleado && this.tipocalificacionempleadoConstantesFunciones.mostrarCalificacionEmpleadoTipoCalificacionEmpleado && !TipoCalificacionEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Calificacion Empleados");
				tableColumn.setHeaderValue("Calificacion Empleados");
				tableColumn.setCellRenderer(new CalificacionEmpleadoTableCell(tipocalificacionempleadoConstantesFunciones.resaltarCalificacionEmpleadoTipoCalificacionEmpleado,this,this.tipocalificacionempleadoConstantesFunciones.activarCalificacionEmpleadoTipoCalificacionEmpleado));
				tableColumn.setCellEditor(new CalificacionEmpleadoTableCell(tipocalificacionempleadoConstantesFunciones.resaltarCalificacionEmpleadoTipoCalificacionEmpleado,this,this.tipocalificacionempleadoConstantesFunciones.activarCalificacionEmpleadoTipoCalificacionEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCalificacionEmpleado.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCalificacionEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCalificacionEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCalificacionEmpleado.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCalificacionEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCalificacionEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCalificacionEmpleado.moveColumn(this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCalificacionEmpleado.moveColumn(this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCalificacionEmpleado.moveColumn(this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCalificacionEmpleado.moveColumn(this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCalificacionEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCalificacionEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCalificacionEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCalificacionEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCalificacionEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCalificacionEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocalificacionempleados.size()-1;
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
		//this.jTableDatosTipoCalificacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCalificacionEmpleado();
			
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
				
				//this.isEsNuevoTipoCalificacionEmpleado=false;
					
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
				if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCalificacionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocalificacionempleado.getsType().equals("DUPLICADO")
				   || this.tipocalificacionempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCalificacionEmpleado=true;
				
				} else {
					this.isEsNuevoTipoCalificacionEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocalificacionempleado.getId()>=0 && !this.tipocalificacionempleado.getIsNew()) {						
						this.isEsNuevoTipoCalificacionEmpleado=false;
						
					} else {
						this.isEsNuevoTipoCalificacionEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCalificacionEmpleado(esRelaciones);						
				
				this.seleccionarTipoCalificacionEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocalificacionempleado.getId()<0) {
					this.isEsNuevoTipoCalificacionEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCalificacionEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCalificacionEmpleado(evt,rowIndex);
				}	
				
				if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCalificacionEmpleado: " + this.dDif); 
					}
				}								
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCalificacionEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocalificacionempleado)) {
					if(this.tipocalificacionempleado.getId()>0) {
						this.tipocalificacionempleado.setIsDeleted(true);
						
						this.tipocalificacionempleadosEliminados.add(this.tipocalificacionempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().remove(this.tipocalificacionempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocalificacionempleados.remove(this.tipocalificacionempleado);				
					}
					
					
					((TipoCalificacionEmpleadoModel) this.jTableDatosTipoCalificacionEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCalificacionEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCalificacionEmpleado) {
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCalificacionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCalificacionEmpleado(this.tipocalificacionempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocalificacionempleadoConstantesFunciones.cargarid_empresaTipoCalificacionEmpleado || this.tipocalificacionempleadoConstantesFunciones.event_dependid_empresaTipoCalificacionEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocalificacionempleado.getid_empresa());
									//this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocalificacionempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocalificacionempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocalificacionempleado.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCalificacionEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCalificacionEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCalificacionEmpleado(tipocalificacionempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCalificacionEmpleado(tipocalificacionempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCalificacionEmpleado(tipocalificacionempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCalificacionEmpleado(tipocalificacionempleado);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.setText(tipocalificacionempleado.getId().toString());
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextFieldcodigoTipoCalificacionEmpleado.setText(tipocalificacionempleado.getcodigo());
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextAreanombreTipoCalificacionEmpleado.setText(tipocalificacionempleado.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCalificacionEmpleado tipocalificacionempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocalificacionempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCalificacionEmpleado tipocalificacionempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocalificacionempleadoLocal=this.tipocalificacionempleado;
			} else {
				tipocalificacionempleadoLocal=this.tipocalificacionempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocalificacionempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCalificacionEmpleado(tipocalificacionempleadoLocal,true);
					
					if(tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocalificacionempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocalificacionempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(tipocalificacionempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(tipocalificacionempleado);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(tipocalificacionempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.getText()==null || this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.getText()=="" || this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.setText("0");
			}

			if(conColumnasBase) {tipocalificacionempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCalificacionEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelIdTipoCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocalificacionempleado.setcodigo(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextFieldcodigoTipoCalificacionEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelcodigoTipoCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocalificacionempleado.setnombre(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextAreanombreTipoCalificacionEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelnombreTipoCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleadoBean,TipoCalificacionEmpleado tipocalificacionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleadoOrigen,TipoCalificacionEmpleado tipocalificacionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocalificacionempleadoOrigen.getId()!=null && !tipocalificacionempleadoOrigen.getId().equals(0L))) {tipocalificacionempleado.setId(tipocalificacionempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocalificacionempleadoOrigen.getcodigo()!=null && !tipocalificacionempleadoOrigen.getcodigo().equals(""))) {tipocalificacionempleado.setcodigo(tipocalificacionempleadoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocalificacionempleadoOrigen.getnombre()!=null && !tipocalificacionempleadoOrigen.getnombre().equals(""))) {tipocalificacionempleado.setnombre(tipocalificacionempleadoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.setText(tipocalificacionempleado.getId().toString());
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextFieldcodigoTipoCalificacionEmpleado.setText(tipocalificacionempleado.getcodigo());
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextAreanombreTipoCalificacionEmpleado.setText(tipocalificacionempleado.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCalificacionEmpleado(TipoCalificacionEmpleadoBean tipocalificacionempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.setText(tipocalificacionempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextFieldcodigoTipoCalificacionEmpleado.setText(tipocalificacionempleadoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextAreanombreTipoCalificacionEmpleado.setText(tipocalificacionempleadoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCalificacionEmpleado(TipoCalificacionEmpleadoParameterReturnGeneral tipocalificacionempleadoReturnGeneral,TipoCalificacionEmpleadoBean tipocalificacionempleadoBean,Boolean conDefault) throws Exception { 
		try {
			TipoCalificacionEmpleado tipocalificacionempleadoLocal=new TipoCalificacionEmpleado();
			
			tipocalificacionempleadoLocal=tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocalificacionempleadoLocal.getId()!=null && !tipocalificacionempleadoLocal.getId().equals(0L))) {tipocalificacionempleadoBean.setId(tipocalificacionempleadoLocal.getId());}}
			if(conDefault || (!conDefault && tipocalificacionempleadoLocal.getcodigo()!=null && !tipocalificacionempleadoLocal.getcodigo().equals(""))) {tipocalificacionempleadoBean.setcodigo(tipocalificacionempleadoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocalificacionempleadoLocal.getnombre()!=null && !tipocalificacionempleadoLocal.getnombre().equals(""))) {tipocalificacionempleadoBean.setnombre(tipocalificacionempleadoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCalificacionEmpleadoGenerico(Long idTipoCalificacionEmpleadoSeleccionado,JComboBox jComboBoxTipoCalificacionEmpleado,List<TipoCalificacionEmpleado> tipocalificacionempleadosLocal)throws Exception {
		try {
			TipoCalificacionEmpleado  tipocalificacionempleadoTemp=null;

			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosLocal) {
				if(tipocalificacionempleadoAux.getId()!=null && tipocalificacionempleadoAux.getId().equals(idTipoCalificacionEmpleadoSeleccionado)) {
					tipocalificacionempleadoTemp=tipocalificacionempleadoAux;
					break;
				}
			}

			jComboBoxTipoCalificacionEmpleado.setSelectedItem(tipocalificacionempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCalificacionEmpleadoGenerico(JComboBox jComboBoxTipoCalificacionEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCalificacionEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCalificacionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCalificacionEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCalificacionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CalificacionEmpleado")) {
			jButtonCalificacionEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalificacionempleado=(TipoCalificacionEmpleado) tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocalificacionempleado =(TipoCalificacionEmpleado) tipocalificacionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocalificacionempleado.getIsNew() && !tipocalificacionempleado.getIsChanged() && !tipocalificacionempleado.getIsDeleted()) {
				sDescripcion=tipocalificacionempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocalificacionempleado.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCalificacionEmpleado tipocalificacionempleadoRow=new TipoCalificacionEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalificacionempleadoRow=(TipoCalificacionEmpleado) tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocalificacionempleadoRow=(TipoCalificacionEmpleado) tipocalificacionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCalificacionEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCalificacionEmpleado tipocalificacionempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalificacionempleado = (TipoCalificacionEmpleado)this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocalificacionempleado = (TipoCalificacionEmpleado)this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocalificacionempleado!=null) {
						this.tipocalificacionempleado = tipocalificacionempleado;
					} else {
						this.tipocalificacionempleado = new TipoCalificacionEmpleado();
					}
				}

				if(this.isTienePermisosCalificacionEmpleado && this.permiteMantenimiento(this.tipocalificacionempleado)) {
					CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFramePopup=new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						calificacionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFramePopup;
					} else {
						calificacionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame;
					}

					List<TipoCalificacionEmpleado> tipocalificacionempleados=new ArrayList<TipoCalificacionEmpleado>();
					tipocalificacionempleados.add(this.tipocalificacionempleado);
					if(!esRelacionado) {
						//calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setConGuardarRelaciones(false);
						//calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					calificacionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.cargarCalificacionEmpleadoBeanSwingJInternalFrame(tipocalificacionempleados,this.tipocalificacionempleado,calificacionempleadoBeanSwingJInternalFrame,/*conInicializar,*/calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getConGuardarRelaciones(),calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado());
					calificacionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("no_relacionado");

						calificacionempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CalificacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (CalificacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						calificacionempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosTipoCalificacionEmpleado.getBorder();
						TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.getBorder();

						titledBorderCalificacionEmpleado.setTitle(titledBorderTipoCalificacionEmpleado.getTitle() + " -> Calificacion Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,calificacionempleadoBeanSwingJInternalFrame);
						}

						calificacionempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(calificacionempleadoBeanSwingJInternalFrame);

						calificacionempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Calificacion Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado));			
			this.jButtonDuplicarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoCalificacionEmpleado && this.isPermisoDuplicarTipoCalificacionEmpleado));			
			this.jButtonCopiarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoCalificacionEmpleado && this.isPermisoCopiarTipoCalificacionEmpleado));
			this.jButtonVerFormTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoCalificacionEmpleado && this.isPermisoVerFormTipoCalificacionEmpleado));
			
			this.jButtonAbrirOrderByTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado && this.isPermisoOrdenTipoCalificacionEmpleado));			
			
			this.jButtonNuevoRelacionesTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado));			
			this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoCalificacionEmpleado && this.isPermisoActualizarTipoCalificacionEmpleado));	
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado && this.isPermisoActualizarTipoCalificacionEmpleado));	
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado && this.isPermisoEliminarTipoCalificacionEmpleado));
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarTipoCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado);							
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado));						
			this.jButtonDuplicarToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoCalificacionEmpleado && this.isPermisoDuplicarTipoCalificacionEmpleado));						
			this.jButtonCopiarToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoCalificacionEmpleado && this.isPermisoCopiarTipoCalificacionEmpleado));			
			this.jButtonVerFormToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoCalificacionEmpleado && this.isPermisoVerFormTipoCalificacionEmpleado));			
			this.jButtonAbrirOrderByToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado && this.isPermisoOrdenTipoCalificacionEmpleado));
			this.jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));			
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoCalificacionEmpleado && this.isPermisoActualizarTipoCalificacionEmpleado));	
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado  && this.isPermisoActualizarTipoCalificacionEmpleado));	
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado && this.isPermisoEliminarTipoCalificacionEmpleado));
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarToolBarTipoCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado);				
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado));			
			this.jMenuItemDuplicarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoCalificacionEmpleado && this.isPermisoDuplicarTipoCalificacionEmpleado));			
			this.jMenuItemCopiarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoCalificacionEmpleado && this.isPermisoCopiarTipoCalificacionEmpleado));			
			this.jMenuItemVerFormTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoCalificacionEmpleado && this.isPermisoVerFormTipoCalificacionEmpleado));			
			this.jMenuItemAbrirOrderByTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado && this.isPermisoOrdenTipoCalificacionEmpleado));			
			//this.jMenuItemMostrarOcultarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado && this.isPermisoOrdenTipoCalificacionEmpleado));
			this.jMenuItemDetalleAbrirOrderByTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado && this.isPermisoOrdenTipoCalificacionEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado && this.isPermisoOrdenTipoCalificacionEmpleado));			
			this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado));			
			this.jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado && this.isPermisoNuevoTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));									
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemModificarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoCalificacionEmpleado && this.isPermisoActualizarTipoCalificacionEmpleado));	
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemActualizarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado && this.isPermisoActualizarTipoCalificacionEmpleado));	
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemEliminarTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado && this.isPermisoEliminarTipoCalificacionEmpleado));
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemCancelarTipoCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));						
			this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=this.jButtonNuevoTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCalificacionEmpleado=this.jButtonDuplicarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarTipoCalificacionEmpleado=this.jButtonCopiarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormTipoCalificacionEmpleado=this.jButtonVerFormTipoCalificacionEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCalificacionEmpleado=this.jButtonAbrirOrderByTipoCalificacionEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=this.jButtonNuevoRelacionesTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=this.jButtonModificarTipoCalificacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosTipoCalificacionEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=this.jButtonNuevoToolBarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=this.jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarToolBarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarToolBarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarToolBarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarToolBarTipoCalificacionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=this.jButtonGuardarCambiosToolBarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=this.jButtonGuardarCambiosTablaToolBarTipoCalificacionEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=this.jMenuItemNuevoTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemModificarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemActualizarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemEliminarTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemCancelarTipoCalificacionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=this.jMenuItemGuardarCambiosTipoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCalificacionEmpleado(Boolean esInicializar) {
		if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCalificacionEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCalificacionEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCalificacionEmpleado() {
		this.jButtonNuevoTipoCalificacionEmpleado.setVisible(this.isPermisoNuevoTipoCalificacionEmpleado);			
		this.jButtonDuplicarTipoCalificacionEmpleado.setVisible(this.isPermisoDuplicarTipoCalificacionEmpleado);			
		this.jButtonCopiarTipoCalificacionEmpleado.setVisible(this.isPermisoCopiarTipoCalificacionEmpleado);			
		this.jButtonVerFormTipoCalificacionEmpleado.setVisible(this.isPermisoVerFormTipoCalificacionEmpleado);			
		
		this.jButtonAbrirOrderByTipoCalificacionEmpleado.setVisible(this.isPermisoOrdenTipoCalificacionEmpleado);					
		
		this.jButtonNuevoRelacionesTipoCalificacionEmpleado.setVisible(this.isPermisoNuevoTipoCalificacionEmpleado);			
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarTipoCalificacionEmpleado.setVisible(this.isPermisoActualizarTipoCalificacionEmpleado);	
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarTipoCalificacionEmpleado.setVisible(this.isPermisoActualizarTipoCalificacionEmpleado);	
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarTipoCalificacionEmpleado.setVisible(this.isPermisoEliminarTipoCalificacionEmpleado);
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarTipoCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado);						
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosTipoCalificacionEmpleado.setVisible(this.isPermisoGuardarCambiosTipoCalificacionEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.setVisible(this.isPermisoActualizarTipoCalificacionEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCalificacionEmpleado() {
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarTipoCalificacionEmpleado.setVisible(this.isPermisoActualizarTipoCalificacionEmpleado);	
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarTipoCalificacionEmpleado.setVisible(this.isPermisoActualizarTipoCalificacionEmpleado);	
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarTipoCalificacionEmpleado.setVisible(this.isPermisoEliminarTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarTipoCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado);							
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosTipoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado && this.isPermisoGuardarCambiosTipoCalificacionEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCalificacionEmpleado() {
		if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCalificacionEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCalificacionEmpleado() {
	}
	
	public void jTableDatosTipoCalificacionEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCalificacionEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.gettipocalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalificacionempleado==null) {
						this.tipocalificacionempleado = new TipoCalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
				}

				if(this.tipocalificacionempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocalificacionempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCalificacionEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.gettipocalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocalificacionempleadoLogic.getConnexion());

				if(this.tipocalificacionempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocalificacionempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosTipoCalificacionEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCalificacionEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.gettipocalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalificacionempleado==null) {
						this.tipocalificacionempleado = new TipoCalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
				}

				if(this.tipocalificacionempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocalificacionempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.gettipocalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalificacionempleado==null) {
						this.tipocalificacionempleado = new TipoCalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
				}

				if(this.tipocalificacionempleado.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocalificacionempleado.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.gettipocalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalificacionempleado==null) {
						this.tipocalificacionempleado = new TipoCalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);
				}

				if(this.tipocalificacionempleado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocalificacionempleado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);

			this.getTipoCalificacionEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCalificacionEmpleado(false);

			//if(TipoCalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCalificacionEmpleado() {
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.dispose();
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
			this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.dispose();
			this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionTipoCalificacionEmpleado!=null) {
			this.jInternalFrameImportacionTipoCalificacionEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCalificacionEmpleado.dispose();
			this.jInternalFrameImportacionTipoCalificacionEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCalificacionEmpleado();
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCalificacionEmpleado")) {
				jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCalificacionEmpleado")) {
				jButtonDuplicarTipoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCalificacionEmpleado")) {
				jButtonCopiarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCalificacionEmpleado")) {
				jButtonVerFormTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCalificacionEmpleado")) {
				jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCalificacionEmpleado")) {
				jButtonDuplicarTipoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCalificacionEmpleado")) {
				jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCalificacionEmpleado")) {
				jButtonDuplicarTipoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCalificacionEmpleado")) {
				jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCalificacionEmpleado")) {
				jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCalificacionEmpleado")) {
				jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCalificacionEmpleado")) {
				jButtonModificarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCalificacionEmpleado")) {
				jButtonModificarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCalificacionEmpleado")) {
				jButtonModificarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCalificacionEmpleado")) {
				jButtonActualizarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCalificacionEmpleado")) {
				jButtonActualizarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCalificacionEmpleado")) {
				jButtonActualizarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCalificacionEmpleado")) {
				jButtonEliminarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCalificacionEmpleado")) {
				jButtonEliminarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCalificacionEmpleado")) {
				jButtonEliminarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCalificacionEmpleado")) {
				jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCalificacionEmpleado")) {
				jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCalificacionEmpleado")) {
				jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCalificacionEmpleado")) {
				jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCalificacionEmpleado")) {
				jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCalificacionEmpleado")) {
				jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCalificacionEmpleado")) {
				jButtonMostrarOcultarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCalificacionEmpleado")) {
				jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCalificacionEmpleado")) {
				jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCalificacionEmpleado")) {
				jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCalificacionEmpleado")) {
				jButtonCopiarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCalificacionEmpleado")) {
				jButtonVerFormTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCalificacionEmpleado")) {
				jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCalificacionEmpleado")) {
				jButtonCopiarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCalificacionEmpleado")) {
				jButtonVerFormTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCalificacionEmpleado")) {
				jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCalificacionEmpleado")) {
				jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCalificacionEmpleado")) {
				jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCalificacionEmpleado")) {
				jButtonRecargarInformacionTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCalificacionEmpleado")) {
				jButtonRecargarInformacionTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCalificacionEmpleado")) {
				jButtonRecargarInformacionTipoCalificacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCalificacionEmpleado")) {
				jButtonAnterioresTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCalificacionEmpleado")) {
				jButtonAnterioresTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCalificacionEmpleado")) {
				jButtonAnterioresTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCalificacionEmpleado")) {
				jButtonSiguientesTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCalificacionEmpleado")) {
				jButtonSiguientesTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCalificacionEmpleado")) {
				jButtonSiguientesTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCalificacionEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCalificacionEmpleado")) {
				jButtonAbrirOrderByTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCalificacionEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCalificacionEmpleado")) {
				jButtonMostrarOcultarTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCalificacionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCalificacionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCalificacionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCalificacionEmpleado")) {
				jButtonCerrarReporteDinamicoTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCalificacionEmpleado")) {
				jButtonGenerarReporteDinamicoTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCalificacionEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCalificacionEmpleado")) {
				jButtonCerrarImportacionTipoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCalificacionEmpleado")) {
				
				jButtonGenerarImportacionTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCalificacionEmpleado")) {
				
				jButtonAbrirImportacionTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCalificacionEmpleado")) {
				jComboBoxTiposAccionesTipoCalificacionEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCalificacionEmpleado")) {
				jComboBoxTiposRelacionesTipoCalificacionEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCalificacionEmpleado")) {
				jComboBoxTiposAccionesTipoCalificacionEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCalificacionEmpleado")) {
				
				jComboBoxTiposSeleccionarTipoCalificacionEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCalificacionEmpleado")) {
				jTextFieldValorCampoGeneralTipoCalificacionEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCalificacionEmpleado")) {
				jButtonAbrirOrderByTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCalificacionEmpleado")) {
				jButtonAbrirOrderByTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCalificacionEmpleado")) {
				jButtonCerrarOrderByTipoCalificacionEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCalificacionEmpleadoBusqueda")) {
				this.jButtonidTipoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCalificacionEmpleadoUpdate")) {
				this.jButtonid_empresaTipoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_empresaTipoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCalificacionEmpleadoBusqueda")) {
				this.jButtoncodigoTipoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCalificacionEmpleadoBusqueda")) {
				this.jButtonnombreTipoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCalificacionEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				


				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCalificacionEmpleado tipocalificacionempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocalificacionempleadoLocal=this.tipocalificacionempleado;
			} else {
				tipocalificacionempleadoLocal=this.tipocalificacionempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
							
				
				


				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
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
			
			


			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
								
						
				


				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
								
				
				


				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
							
				
				


				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
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
			
			


			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
								
				
				


				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCalificacionEmpleado")) {
					jCheckBoxSeleccionarTodosTipoCalificacionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCalificacionEmpleado")) {
					jCheckBoxSeleccionadosTipoCalificacionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCalificacionEmpleado")) {
					
				}
				
				


				
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
												
				
				


				
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
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
			
			


			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalificacionempleado);
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
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
				
				


				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalificacionEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalificacionempleadoAnterior =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCalificacionEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCalificacionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCalificacionEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocalificacionempleado =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocalificacionempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCalificacionEmpleado")) {
				
				}
				
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCalificacionEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCalificacionEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCalificacionEmpleado")) {
			
			}
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCalificacionEmpleado();
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCalificacionEmpleado")) {
				jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCalificacionEmpleado")) {
				jButtonDuplicarTipoCalificacionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCalificacionEmpleado")) {
				jButtonCopiarTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCalificacionEmpleado")) {
				jButtonVerFormTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCalificacionEmpleado")) {
				jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCalificacionEmpleado")) {
				jButtonModificarTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCalificacionEmpleado")) {
				jButtonActualizarTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCalificacionEmpleado")) {
				jButtonEliminarTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCalificacionEmpleado")) {
				jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCalificacionEmpleado")) {
				jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCalificacionEmpleado")) {
				jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCalificacionEmpleado")) {
				jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCalificacionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCalificacionEmpleado")) {
				jButtonAbrirOrderByTipoCalificacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCalificacionEmpleado")) {
				jButtonRecargarInformacionTipoCalificacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCalificacionEmpleado")) {
				jButtonAnterioresTipoCalificacionEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCalificacionEmpleado")) {
				jButtonSiguientesTipoCalificacionEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCalificacionEmpleadoBusqueda")) {
				this.jButtonidTipoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCalificacionEmpleadoUpdate")) {
				this.jButtonid_empresaTipoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_empresaTipoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCalificacionEmpleadoBusqueda")) {
				this.jButtoncodigoTipoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCalificacionEmpleadoBusqueda")) {
				this.jButtonnombreTipoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCalificacionEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCalificacionEmpleado")) {
				closingInternalFrameTipoCalificacionEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarTipoCalificacionEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCalificacionEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCalificacionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(TipoCalificacionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCalificacionEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCalificacionEmpleadoActionPerformed(null);
			}
			
			TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocalificacionempleado,new Object(),this.tipocalificacionempleadoParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCalificacionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCalificacionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCalificacionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocalificacionempleado)) {
			if(!esControlTabla) {
				if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);			
				}
				
				if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocalificacionempleadoReturnGeneral=tipocalificacionempleadoLogic.procesarEventosTipoCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados(),this.tipocalificacionempleado,this.tipocalificacionempleadoParameterGeneral,this.isEsNuevoTipoCalificacionEmpleado,classes);//this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral,this.tipocalificacionempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCalificacionEmpleado(classes,this.tipocalificacionempleadoReturnGeneral,this.tipocalificacionempleadoBean,false);
					}
						
					if(this.tipocalificacionempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado());	
					}
						
					if(this.tipocalificacionempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado(),classes);//this.tipocalificacionempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCalificacionEmpleado(this.tipocalificacionempleado,classes);//this.tipocalificacionempleadoBean);									
				}
			
				if(TipoCalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCalificacionEmpleado(this.tipocalificacionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalificacionEmpleado(this.tipocalificacionempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocalificacionempleadoAnterior!=null) {
						this.tipocalificacionempleado=this.tipocalificacionempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocalificacionempleadoReturnGeneral=tipocalificacionempleadoLogic.procesarEventosTipoCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados(),this.tipocalificacionempleado,this.tipocalificacionempleadoParameterGeneral,this.isEsNuevoTipoCalificacionEmpleado,classes);//this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocalificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado(),tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado(),this.tipocalificacionempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCalificacionEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCalificacionEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCalificacionEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCalificacionEmpleado() throws Exception {
		
		TipoCalificacionEmpleadoModel tipocalificacionempleadoModel=(TipoCalificacionEmpleadoModel)this.jTableDatosTipoCalificacionEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalificacionempleadoModel.tipocalificacionempleados=this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocalificacionempleadoModel.tipocalificacionempleados=this.tipocalificacionempleados;
		}
		
		
		((TipoCalificacionEmpleadoModel) this.jTableDatosTipoCalificacionEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCalificacionEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocalificacionempleadoAnterior(),this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocalificacionempleadoAnterior(),this.tipocalificacionempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCalificacionEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(tipocalificacionempleado.getCalificacionEmpleados());
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
										
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalificacionempleado,new Object(),generalEntityParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCalificacionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoCalificacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCalificacionEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCalificacionEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCalificacionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalificacionempleado,new Object(),generalEntityParameterGeneral,this.tipocalificacionempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCalificacionEmpleado(TipoCalificacionEmpleadoBean tipocalificacionempleadoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(tipocalificacionempleado.getCalificacionEmpleados());
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCalificacionEmpleado(ArrayList<Classe> classes,TipoCalificacionEmpleadoReturnGeneral tipocalificacionempleadoReturnGeneral,TipoCalificacionEmpleadoBean tipocalificacionempleadoBean,Boolean conDefault) throws Exception {
		
			this.tipocalificacionempleadoBean.setCalificacionEmpleados(tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado().getCalificacionEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					tipocalificacionempleado.setCalificacionEmpleados(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocalificacionempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado = new TipoCalificacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.tipocalificacionempleadoSessionBean.getConGuardarRelaciones(),this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.tipocalificacionempleadoLogic=this.tipocalificacionempleadoLogic;
		
		this.cargarCombosFrameForeignKeyTipoCalificacionEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCalificacionEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCalificacionEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCalificacionEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCalificacionEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCalificacionEmpleado"));
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarTipoCalificacionEmpleado"));

		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarToolBarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCalificacionEmpleado"));
					
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemModificarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCalificacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarTipoCalificacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarToolBarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCalificacionEmpleado"));
						
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemActualizarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCalificacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarTipoCalificacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCalificacionEmpleado"));
								
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemEliminarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCalificacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarTipoCalificacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCalificacionEmpleado"));
					
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemCancelarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCalificacionEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemDetalleCerrarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCalificacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalificacionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalificacionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCalificacionEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonidTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonid_empresaTipoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtoncodigoTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonnombreTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalificacionEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCalificacionEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCalificacionEmpleado"));
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCalificacionEmpleado"));
		}
		
		this.jTableDatosTipoCalificacionEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCalificacionEmpleado"));
		
		this.jTableDatosTipoCalificacionEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCalificacionEmpleado"));
		
		this.jButtonNuevoTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoTipoCalificacionEmpleado"));
		
		this.jButtonDuplicarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarTipoCalificacionEmpleado"));
		
		this.jButtonCopiarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"CopiarTipoCalificacionEmpleado"));
		
		this.jButtonVerFormTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"VerFormTipoCalificacionEmpleado"));
		
		
		this.jButtonNuevoToolBarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCalificacionEmpleado"));
			
		this.jButtonDuplicarToolBarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCalificacionEmpleado"));
			
		this.jMenuItemNuevoTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCalificacionEmpleado"));
			
		this.jMenuItemDuplicarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCalificacionEmpleado"));		
		
		
		this.jButtonNuevoRelacionesTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCalificacionEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCalificacionEmpleado"));
			
		this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCalificacionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarTipoCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonModificarToolBarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCalificacionEmpleado"));
			
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemModificarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCalificacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarTipoCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonActualizarToolBarTipoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCalificacionEmpleado"));
				
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemActualizarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCalificacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarTipoCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonEliminarToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCalificacionEmpleado"));
						
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemEliminarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCalificacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarTipoCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonCancelarToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCalificacionEmpleado"));
			
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemCancelarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCalificacionEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCalificacionEmpleado"));		
		
		
		this.jButtonCerrarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarTipoCalificacionEmpleado"));
		
		
		this.jButtonCerrarToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCalificacionEmpleado"));
			
		this.jMenuItemCerrarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCalificacionEmpleado"));
			
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jMenuItemDetalleCerrarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCalificacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalificacionEmpleado"));
		}
		
		this.jButtonCopiarToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCalificacionEmpleado"));
			
		this.jButtonVerFormToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCalificacionEmpleado"));
		
		this.jMenuItemGuardarCambiosTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCalificacionEmpleado"));
			
		this.jMenuItemCopiarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCalificacionEmpleado"));		
		
		this.jMenuItemVerFormTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCalificacionEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCalificacionEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCalificacionEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCalificacionEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCalificacionEmpleado"));
					
		this.jButtonRecargarInformacionToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCalificacionEmpleado"));
		
		this.jMenuItemRecargarInformacionTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCalificacionEmpleado"));		
		
		
		
		this.jButtonAnterioresTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresTipoCalificacionEmpleado"));
		
		
		this.jButtonAnterioresToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCalificacionEmpleado"));
		
		this.jMenuItemAnterioresTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCalificacionEmpleado"));		
		
		
		this.jButtonSiguientesTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesTipoCalificacionEmpleado"));
		
		
		this.jButtonSiguientesToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCalificacionEmpleado"));
			
		this.jMenuItemSiguientesTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCalificacionEmpleado"));
			
		this.jMenuItemAbrirOrderByTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCalificacionEmpleado"));
			
		this.jMenuItemMostrarOcultarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCalificacionEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCalificacionEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCalificacionEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCalificacionEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCalificacionEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCalificacionEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCalificacionEmpleado"));

		this.jCheckBoxSeleccionadosTipoCalificacionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCalificacionEmpleado"));
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCalificacionEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCalificacionEmpleado"));
			
		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCalificacionEmpleado"));
					
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCalificacionEmpleado"));
			
		this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCalificacionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonidTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonid_empresaTipoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtoncodigoTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonnombreTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalificacionEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalificacionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalificacionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoCalificacionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalificacionEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalificacionEmpleado"));				
			//this.jButtonGenerarReporteDinamicoTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalificacionEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalificacionEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCalificacionEmpleado!=null) {
				this.jInternalFrameImportacionTipoCalificacionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCalificacionEmpleado"));
				this.jInternalFrameImportacionTipoCalificacionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCalificacionEmpleado"));
				this.jInternalFrameImportacionTipoCalificacionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCalificacionEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCalificacionEmpleado"));
			
			this.jButtonAbrirOrderByToolBarTipoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCalificacionEmpleado"));			
			
			if(this.jInternalFrameOrderByTipoCalificacionEmpleado!=null) {
				this.jInternalFrameOrderByTipoCalificacionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCalificacionEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTabbedPaneRelacionesTipoCalificacionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCalificacionEmpleado"));
		
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
            		closingInternalFrameTipoCalificacionEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCalificacionEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            TipoCalificacionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(TipoCalificacionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCalificacionEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCalificacionEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCalificacionEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCalificacionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCalificacionEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCalificacionEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCalificacionEmpleado";
		inputMap = this.jButtonNuevoTipoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCalificacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesTipoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCalificacionEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCalificacionEmpleado";
		inputMap = this.jButtonModificarTipoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCalificacionEmpleado";
		inputMap = this.jButtonActualizarTipoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCalificacionEmpleado";
		inputMap = this.jButtonEliminarTipoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCalificacionEmpleado";
		inputMap = this.jButtonCancelarTipoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCalificacionEmpleado";
		inputMap = this.jButtonCerrarTipoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCalificacionEmpleado";
		inputMap = this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosTipoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonGuardarCambiosTipoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCalificacionEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCalificacionEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCalificacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCalificacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCalificacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCalificacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonidTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonid_empresaTipoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonid_empresaTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtoncodigoTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jButtonnombreTipoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalificacionEmpleadoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCalificacionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCalificacionEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCalificacionEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
					tipocalificacionempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleados) {
					tipocalificacionempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCalificacionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
						tipocalificacionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleados) {
						tipocalificacionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCalificacionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCalificacionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCalificacionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCalificacionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCalificacionEmpleado.getSelectedRows();
			
			TipoCalificacionEmpleado tipocalificacionempleadoLocal=new TipoCalificacionEmpleado();
			
			//this.seleccionarTodosTipoCalificacionEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalificacionempleadoLocal =(TipoCalificacionEmpleado) this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados().toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocalificacionempleadoLocal =(TipoCalificacionEmpleado) this.tipocalificacionempleados.toArray()[this.jTableDatosTipoCalificacionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocalificacionempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
						tipocalificacionempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleados) {
						tipocalificacionempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCalificacionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCalificacionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCalificacionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCalificacionEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCalificacionEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCalificacionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCalificacionEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
				
						if(sTipoSeleccionar.equals(TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocalificacionempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocalificacionempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleados) {
					
						if(sTipoSeleccionar.equals(TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocalificacionempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocalificacionempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCalificacionEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCalificacionEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCalificacionEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCalificacionEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCalificacionEmpleado(conSplash);
				
					this.generarReporteTipoCalificacionEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCalificacionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCalificacionEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCalificacionEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCalificacionEmpleado();
				
				this.exportarTipoCalificacionEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCalificacionEmpleados();
				//this.importarTipoCalificacionEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCalificacionEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCalificacionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Calificacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCalificacionEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCalificacionEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCalificacionEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCalificacionEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCalificacionEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCalificacionEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralTipoCalificacionEmpleado();
						
						this.generarReporteProcesoAccionTipoCalificacionEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Calificacion EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Calificacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCalificacionEmpleado();
				
						this.actualizarParametrosGeneralTipoCalificacionEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocalificacionempleadoReturnGeneral=tipocalificacionempleadoLogic.procesarAccionTipoCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados(),this.tipocalificacionempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCalificacionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCalificacionEmpleado();
					
					TipoCalificacionEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCalificacionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCalificacionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxTiposAccionesFormularioTipoCalificacionEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCalificacionEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCalificacionEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCalificacionEmpleado();
			
			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		
			TipoCalificacionEmpleado tipocalificacionempleado=new TipoCalificacionEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCalificacionEmpleado.getSelectedItem();
			
			
			
			
			tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocalificacionempleadosSeleccionados.size()==1) {
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosSeleccionados) {
					tipocalificacionempleado=tipocalificacionempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Calificacion Empleado")) {
					jButtonCalificacionEmpleadoActionPerformed(null,rowIndex,true,false,tipocalificacionempleado);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCalificacionEmpleado();
			
      		//this.finishProcessTipoCalificacionEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCalificacionEmpleadoReturnGeneral() throws Exception {
		if(this.tipocalificacionempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocalificacionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocalificacionempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocalificacionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocalificacionempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocalificacionempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
		}
		
		if(this.tipocalificacionempleadoReturnGeneral.getConRetornoLista() || this.tipocalificacionempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocalificacionempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocalificacionempleadoLogic.setTipoCalificacionEmpleados(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocalificacionempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocalificacionempleadoLogic.setTipoCalificacionEmpleado(this.tipocalificacionempleadoReturnGeneral.getTipoCalificacionEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCalificacionEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCalificacionEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<TipoCalificacionEmpleado> getTipoCalificacionEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCalificacionEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadoLogic.getTipoCalificacionEmpleados()) {
					if(tipocalificacionempleadoAux.getIsSelected()) {
						tipocalificacionempleadosSeleccionados.add(tipocalificacionempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalificacionEmpleado tipocalificacionempleadoAux:this.tipocalificacionempleados) {
					if(tipocalificacionempleadoAux.getIsSelected()) {
						tipocalificacionempleadosSeleccionados.add(tipocalificacionempleadoAux);				
					}
				}
			}
			
			if(tipocalificacionempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocalificacionempleadosSeleccionados.addAll(this.tipocalificacionempleadoLogic.getTipoCalificacionEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocalificacionempleadosSeleccionados.addAll(this.tipocalificacionempleados);				
					}
				}
			}
		} else {
			tipocalificacionempleadosSeleccionados.add(this.tipocalificacionempleado);
		}
		
		return tipocalificacionempleadosSeleccionados;
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
	
	public void generarReporteTipoCalificacionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCalificacionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCalificacionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCalificacionEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCalificacionEmpleadosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCalificacionEmpleadosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Calificacion Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCalificacionEmpleados("Todos",tipocalificacionempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCalificacionEmpleados("Todos",tipocalificacionempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCalificacionEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCalificacionEmpleados("Todos",tipocalificacionempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCalificacionEmpleado();
		
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCalificacionEmpleado();
		
		
		//this.generarReporteTipoCalificacionEmpleados("Todos",tipocalificacionempleadosSeleccionados ,tipocalificacionempleadoImplementable,tipocalificacionempleadoImplementableHome);
	}
	
	public void mostrarImportacionTipoCalificacionEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCalificacionEmpleado();
		
		this.abrirFrameImportacionTipoCalificacionEmpleado();		
		
			
		//this.generarReporteTipoCalificacionEmpleados("Todos",tipocalificacionempleadosSeleccionados ,tipocalificacionempleadoImplementable,tipocalificacionempleadoImplementableHome);
	}
	
	public void importarTipoCalificacionEmpleados() throws Exception {		
	
	}
	
	public void exportarTipoCalificacionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCalificacionEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCalificacionEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCalificacionEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Calificacion Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalificacionempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCalificacionEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCalificacionEmpleado(tipocalificacionempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocalificacionempleadoAux.setsDetalleGeneralEntityReporte(tipocalificacionempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCalificacionEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCalificacionEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalificacionEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocalificacionempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalificacionempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalificacionempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalificacionempleado.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalificacionempleado.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalificacionempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCalificacionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCalificacionEmpleado(row);				
				iRow++;
			}				
			
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCalificacionEmpleado(tipocalificacionempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();		
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalificacionempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocalificacionempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocalificacionempleado");
			//elementRoot.appendChild(element);
		
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosSeleccionados) {
				element = document.createElement("tipocalificacionempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCalificacionEmpleado(tipocalificacionempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCalificacionEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalificacionempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalificacionempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalificacionempleado.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalificacionempleado.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCalificacionEmpleado(TipoCalificacionEmpleado tipocalificacionempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCalificacionEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocalificacionempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCalificacionEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocalificacionempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoCalificacionEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocalificacionempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoCalificacionEmpleadoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocalificacionempleado.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCalificacionEmpleadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocalificacionempleado.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCalificacionEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados=new ArrayList<TipoCalificacionEmpleado>();
		
		tipocalificacionempleadosSeleccionados=this.getTipoCalificacionEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCalificacionEmpleado(tipocalificacionempleadosSeleccionados);
		
		this.generarReporteTipoCalificacionEmpleados("Todos",tipocalificacionempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCalificacionEmpleado(ArrayList<TipoCalificacionEmpleado> tipocalificacionempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosSeleccionados) {
				tipocalificacionempleadoAux.setsDetalleGeneralEntityReporte(tipocalificacionempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocalificacionempleadoAux.setsDescripcionGeneralEntityReporte1(tipocalificacionempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCalificacionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocalificacionempleadoAux.setsDescripcionGeneralEntityReporte1(tipocalificacionempleadoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCalificacionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocalificacionempleadoAux.setsDescripcionGeneralEntityReporte1(tipocalificacionempleadoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCalificacionEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoCalificacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalificacionEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=true;
		} else {
			this.actualizarEstadoPanelsTipoCalificacionEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCalificacionEmpleado=false;
			//this.isVisibilidadCeldaVerFormTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaDuplicarTipoCalificacionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocalificacionempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;												
			}
			
			this.jButtonCerrarTipoCalificacionEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCalificacionEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocalificacionempleado)) {
			this.isVisibilidadCeldaActualizarTipoCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoCalificacionEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCalificacionEmpleado() {
		this.isVisibilidadCeldaNuevoTipoCalificacionEmpleado=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCalificacionEmpleado=false;
	}
	
	public void actualizarEstadoPanelsTipoCalificacionEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosTipoCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalificacionEmpleado!=null) {
				this.jPanelPaginacionTipoCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosTipoCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalificacionEmpleado!=null) {
				this.jPanelPaginacionTipoCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosTipoCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalificacionEmpleado!=null) {
				this.jPanelPaginacionTipoCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosTipoCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalificacionEmpleado!=null) {
				this.jPanelPaginacionTipoCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosTipoCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalificacionEmpleado!=null) {
				this.jPanelPaginacionTipoCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosTipoCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalificacionEmpleado!=null) {
				this.jPanelPaginacionTipoCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoCalificacionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalificacionEmpleado!=null) {
				this.jScrollPanelDatosTipoCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalificacionEmpleado!=null) {
				this.jPanelPaginacionTipoCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
					this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocalificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasTipoCalificacionEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesTipoCalificacionEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoCalificacionEmpleadoParaCalificacionEmpleados() throws Exception {
		Boolean isPaginaPopupCalificacionEmpleado=false;

		try {

			if(this.tipocalificacionempleadoSessionBean==null) {
				this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean.setsPathNavegacionActual(tipocalificacionempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCalificacionEmpleado=this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado(true);
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado(TipoCalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado(true);
			this.jInternalFrameDetalleFormTipoCalificacionEmpleado.calificacionempleadoSessionBean.setlidTipoCalificacionEmpleadoActual(this.idTipoCalificacionEmpleadoActual);

			tipocalificacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCalificacionEmpleado(true);
			tipocalificacionempleadoSessionBean.setlIdTipoCalificacionEmpleadoActualForeignKey(this.idTipoCalificacionEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
		
		if(this.tipocalificacionempleadoSessionBean==null) {
			this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
		}
		
		this.tipocalificacionempleadoSessionBean.setsUltimaBusquedaTipoCalificacionEmpleado(this.getsAccionBusqueda());
		this.tipocalificacionempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocalificacionempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocalificacionempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
		
		if(this.tipocalificacionempleadoSessionBean==null) {
			this.tipocalificacionempleadoSessionBean=new TipoCalificacionEmpleadoSessionBean();
		}
		
		if(this.tipocalificacionempleadoSessionBean.getsUltimaBusquedaTipoCalificacionEmpleado()!=null&&!this.tipocalificacionempleadoSessionBean.getsUltimaBusquedaTipoCalificacionEmpleado().equals("")) {
			this.setsAccionBusqueda(tipocalificacionempleadoSessionBean.getsUltimaBusquedaTipoCalificacionEmpleado());
			this.setiNumeroPaginacion(tipocalificacionempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocalificacionempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocalificacionempleadoSessionBean.getid_empresa());
				tipocalificacionempleadoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocalificacionempleadoSessionBean.setsUltimaBusquedaTipoCalificacionEmpleado("");
		this.tipocalificacionempleadoSessionBean.setiNumeroPaginacion(TipoCalificacionEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.tipocalificacionempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCalificacionEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCalificacionEmpleado() {
		this.updateBorderResaltarBusquedasFormularioTipoCalificacionEmpleado();
		this.updateVisibilidadBusquedasFormularioTipoCalificacionEmpleado();
		this.updateHabilitarBusquedasFormularioTipoCalificacionEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCalificacionEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCalificacionEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCalificacionEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCalificacionEmpleado.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCalificacionEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoCalificacionEmpleado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCalificacionEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCalificacionEmpleado();
		this.updateVisibilidadResaltarControlesFormularioTipoCalificacionEmpleado();
		this.updateHabilitarResaltarControlesFormularioTipoCalificacionEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCalificacionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocalificacionempleadoConstantesFunciones.resaltaridTipoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.setBorder(this.tipocalificacionempleadoConstantesFunciones.resaltaridTipoCalificacionEmpleado);}
		if(this.tipocalificacionempleadoConstantesFunciones.resaltarid_empresaTipoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setBorder(this.tipocalificacionempleadoConstantesFunciones.resaltarid_empresaTipoCalificacionEmpleado);}
		if(this.tipocalificacionempleadoConstantesFunciones.resaltarcodigoTipoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextFieldcodigoTipoCalificacionEmpleado.setBorder(this.tipocalificacionempleadoConstantesFunciones.resaltarcodigoTipoCalificacionEmpleado);}
		if(this.tipocalificacionempleadoConstantesFunciones.resaltarnombreTipoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextAreanombreTipoCalificacionEmpleado.setBorder(this.tipocalificacionempleadoConstantesFunciones.resaltarnombreTipoCalificacionEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCalificacionEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.setVisible(this.tipocalificacionempleadoConstantesFunciones.mostraridTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jPanelidTipoCalificacionEmpleado.setVisible(this.tipocalificacionempleadoConstantesFunciones.mostraridTipoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setVisible(this.tipocalificacionempleadoConstantesFunciones.mostrarid_empresaTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jPanelid_empresaTipoCalificacionEmpleado.setVisible(this.tipocalificacionempleadoConstantesFunciones.mostrarid_empresaTipoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextFieldcodigoTipoCalificacionEmpleado.setVisible(this.tipocalificacionempleadoConstantesFunciones.mostrarcodigoTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jPanelcodigoTipoCalificacionEmpleado.setVisible(this.tipocalificacionempleadoConstantesFunciones.mostrarcodigoTipoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextAreanombreTipoCalificacionEmpleado.setVisible(this.tipocalificacionempleadoConstantesFunciones.mostrarnombreTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jPanelnombreTipoCalificacionEmpleado.setVisible(this.tipocalificacionempleadoConstantesFunciones.mostrarnombreTipoCalificacionEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCalificacionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCalificacionEmpleado!=null) {
	
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jLabelidTipoCalificacionEmpleado.setEnabled(this.tipocalificacionempleadoConstantesFunciones.activaridTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jComboBoxid_empresaTipoCalificacionEmpleado.setEnabled(this.tipocalificacionempleadoConstantesFunciones.activarid_empresaTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextFieldcodigoTipoCalificacionEmpleado.setEnabled(this.tipocalificacionempleadoConstantesFunciones.activarcodigoTipoCalificacionEmpleado);
		this.jInternalFrameDetalleFormTipoCalificacionEmpleado.jTextAreanombreTipoCalificacionEmpleado.setEnabled(this.tipocalificacionempleadoConstantesFunciones.activarnombreTipoCalificacionEmpleado);
		}
	}
	
		
}